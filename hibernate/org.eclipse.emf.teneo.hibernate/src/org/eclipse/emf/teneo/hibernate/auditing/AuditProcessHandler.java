/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: AnyEObjectType.java,v 1.7 2010/11/12 09:33:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.auditing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingFactory;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.action.spi.AfterTransactionCompletionProcess;
import org.hibernate.action.spi.BeforeTransactionCompletionProcess;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.event.spi.EventSource;
import org.hibernate.event.spi.PostDeleteEvent;
import org.hibernate.event.spi.PostDeleteEventListener;
import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostInsertEventListener;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PostUpdateEventListener;

/**
 * The main auditing logic used at runtime to create and persist auditing entries.
 * 
 * It listens to hibernate events and before the commit, creates audit entries to persist.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public class AuditProcessHandler implements AfterTransactionCompletionProcess,
		BeforeTransactionCompletionProcess, PostDeleteEventListener, PostInsertEventListener,
		PostUpdateEventListener, ExtensionPoint {

	public static final long DEFAULT_END_TIMESTAMP = -1;

	private static final long serialVersionUID = 1L;
	private HbDataStore dataStore;

	private Map<Transaction, List<AuditWork>> workQueue = new ConcurrentHashMap<Transaction, List<AuditWork>>();

	private boolean isAudited(Object entity) {
		if (!(entity instanceof EObject)) {
			// TODO: support featuremap entries
			return false;
		}
		final EObject eObject = (EObject) entity;
		final EClass auditEClass = dataStore.getAuditHandler()
				.getAuditingModelElement(eObject.eClass());
		return auditEClass != null;
	}

	private void addToAuditWorkQueue(EventSource session, TeneoAuditKind auditKind, Object entity) {
		if (!isAudited(entity)) {
			return;
		}

		final AuditWork auditWork = new AuditWork();
		auditWork.setAuditKind(auditKind);
		auditWork.setEntity(entity);

		final List<AuditWork> auditWorks;
		if (workQueue.containsKey(session.getTransaction())) {
			auditWorks = workQueue.get(session.getTransaction());
		} else {
			auditWorks = new ArrayList<AuditProcessHandler.AuditWork>();
			workQueue.put(session.getTransaction(), auditWorks);

			// let the handler be called at the end of the transaction
			// to do the transaction work
			session.getActionQueue().registerProcess((AfterTransactionCompletionProcess) this);
			session.getActionQueue().registerProcess((BeforeTransactionCompletionProcess) this);
		}

		// remove existing one if the same entity
		AuditWork existingAuditWork = null;
		for (AuditWork checkAuditWork : auditWorks) {
			if (checkAuditWork.getEntity() == auditWork.getEntity()) {
				existingAuditWork = checkAuditWork;
				break;
			}
		}

		// check if there is already an add
		if (existingAuditWork != null
				&& (existingAuditWork.getAuditKind() == TeneoAuditKind.ADD && auditWork.getAuditKind() == TeneoAuditKind.UPDATE)) {
			// don't add the audit work then, keep the add
		} else if (existingAuditWork != null
				&& (existingAuditWork.getAuditKind() == TeneoAuditKind.ADD && auditWork.getAuditKind() == TeneoAuditKind.DELETE)) {
			// delete with a preceding add, don't do anything, get rid of it
			auditWorks.remove(existingAuditWork);
		} else if (existingAuditWork != null
				&& (existingAuditWork.getAuditKind() == TeneoAuditKind.UPDATE && auditWork.getAuditKind() == TeneoAuditKind.ADD)) {
			// happens if the id has been set manually
			auditWorks.remove(existingAuditWork);
		} else {
			auditWorks.remove(existingAuditWork);

			// and add the new one
			auditWorks.add(auditWork);
		}
	}

	@Override
	public void onPostUpdate(PostUpdateEvent event) {
		addToAuditWorkQueue(event.getSession(), TeneoAuditKind.UPDATE, event.getEntity());
	}

	@Override
	public void onPostInsert(PostInsertEvent event) {
		addToAuditWorkQueue(event.getSession(), TeneoAuditKind.ADD, event.getEntity());
	}

	@Override
	public void onPostDelete(PostDeleteEvent event) {
		addToAuditWorkQueue(event.getSession(), TeneoAuditKind.DELETE, event.getEntity());
	}

	@Override
	public void doBeforeTransactionCompletion(SessionImplementor session) {
		// see: http://www.jboss.com/index.html?module=bb&op=viewtopic&p=4178431
		if (!FlushMode.isManualFlushMode(session.getFlushMode())) {
			session.flush();
			final List<AuditWork> auditWorks = getRemoveQueue((Session) session, false);
			if (auditWorks == null) {
				return;
			}
			doAuditWorkInSession((Session) session, auditWorks);
		}
	}

	@Override
	public void doAfterTransactionCompletion(boolean success, SessionImplementor session) {
		if (!success) {
			return;
		}
		final List<AuditWork> auditWorks = getRemoveQueue((Session) session, true);
		if (auditWorks == null) {
			return;
		}
		// see: http://www.jboss.com/index.html?module=bb&op=viewtopic&p=4178431
		Session tmpSession = null;
		boolean err = true;
		try {
			tmpSession = session.getFactory().openSession();
			tmpSession.beginTransaction();
			doAuditWorkInSession(tmpSession, auditWorks);
			tmpSession.getTransaction().commit();
			err = false;
		} finally {
			try {
				if (tmpSession != null && err) {
					tmpSession.getTransaction().rollback();
				}
			} finally {
				if (tmpSession != null) {
					tmpSession.close();
				}
			}
		}
	}

	private void doAuditWorkInSession(Session session, List<AuditWork> auditWorks) {
		final long commitTime = System.currentTimeMillis();

		final List<Object> evictObjects = new ArrayList<Object>();

		final TeneoAuditCommitInfo commitInfo = TeneoauditingFactory.eINSTANCE
				.createTeneoAuditCommitInfo();
		session.save(commitInfo);
		evictObjects.add(commitInfo);

		EClass lastEClass = null;
		EClass auditEntryEClass = null;
		for (AuditWork auditWork : auditWorks) {
			final EObject eObject = (EObject) auditWork.getEntity();
			if (lastEClass != eObject.eClass()) {
				auditEntryEClass = dataStore.getAuditHandler().getAuditingModelElement(eObject.eClass());
				lastEClass = eObject.eClass();
			}
			final String auditEntryEntityName = HbUtil.getEntityName(auditEntryEClass);

			// create the auditEntry
			final TeneoAuditEntry auditEntry = (TeneoAuditEntry) auditEntryEClass.getEPackage()
					.getEFactoryInstance().create(auditEntryEClass);
			auditEntry.setTeneo_audit_kind(auditWork.getAuditKind());
			auditEntry.setTeneo_commit_info(commitInfo);
			auditEntry.setTeneo_end(DEFAULT_END_TIMESTAMP);
			auditEntry.setTeneo_start(commitTime);
			auditEntry.setTeneo_object_id(dataStore.getAuditHandler().entityToIdString(session,
					auditWork.getEntity()));

			if (auditWork.getEntity() instanceof EObject
					&& null != ((EObject) auditWork.getEntity()).eContainer()) {
				auditEntry.setTeneo_container_id(dataStore.getAuditHandler().entityToIdString(session,
						((EObject) auditWork.getEntity()).eContainer()));
				auditEntry.setTeneo_container_feature_id(((InternalEObject) auditWork.getEntity())
						.eContainerFeatureID());
			}

			dataStore.getAuditHandler().copyContentToAuditEntry(session, (EObject) auditWork.getEntity(),
					auditEntry, auditWork.getAuditKind() != TeneoAuditKind.DELETE);

			if (auditWork.getAuditKind() != TeneoAuditKind.ADD) {
				// get info from the previous entry
				// Note: apparently hibernate has a query plan cache, so
				// it does not give a performance benefit to use a namedquery
				// at least not that much..
				// http://stackoverflow.com/questions/3578711/jpa-caching-queries
				final Query infoQuery = session.createQuery("select e from " + auditEntryEntityName
						+ " e where teneo_object_id=:objectId and teneo_end="
						+ AuditProcessHandler.DEFAULT_END_TIMESTAMP);
				infoQuery.setMaxResults(1);
				infoQuery.setString("objectId", auditEntry.getTeneo_object_id());

				@SuppressWarnings("unchecked")
				final List<Object> list = infoQuery.list();
				if (!list.isEmpty()) {
					// list can be empty this happens if the item has an id set, then hibernate fires
					// an update event and not an add event
					final TeneoAuditEntry previousEntry = (TeneoAuditEntry) list.get(0);
					previousEntry.setTeneo_end(commitTime - 1);
					evictObjects.add(previousEntry);

					auditEntry.setTeneo_previous_start(previousEntry.getTeneo_start());

					session.update(previousEntry);
				}
			}
			session.save(auditEntryEntityName, auditEntry);
			evictObjects.add(auditEntry);
		}

		session.flush();

		// clear the cache from these audit objects
		for (Object object : evictObjects) {
			session.evict(object);
		}
	}

	private synchronized List<AuditWork> getRemoveQueue(Session session, boolean remove) {
		final List<AuditWork> auditWorks = workQueue.get(session.getTransaction());
		if (auditWorks != null && remove) {
			workQueue.remove(session.getTransaction());
		} else {
			// set a new queue so that it won't be refilled during the audit process
			// any extra actions which are done during the audit process are illegal
			// (an error in hibernate dirty detection) this is for now ignored
			workQueue.put(session.getTransaction(), new ArrayList<AuditWork>());
		}
		return auditWorks;
	}

	public HbDataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(HbDataStore dataStore) {
		this.dataStore = dataStore;
	}

	private class AuditWork {
		private Object entity;
		private TeneoAuditKind auditKind;

		public Object getEntity() {
			return entity;
		}

		public void setEntity(Object entity) {
			this.entity = entity;
		}

		public TeneoAuditKind getAuditKind() {
			return auditKind;
		}

		public void setAuditKind(TeneoAuditKind auditKind) {
			this.auditKind = auditKind;
		}

	}
}