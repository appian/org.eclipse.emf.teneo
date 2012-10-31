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
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject;
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

	private static final long serialVersionUID = 1L;
	private HbDataStore dataStore;

	private Map<Transaction, List<AuditWork>> workQueue = new ConcurrentHashMap<Transaction, List<AuditWork>>();

	private boolean isAudited(Object entity) {
		if (!(entity instanceof EObject)) {
			// TODO: support featuremap entries
			return false;
		}
		final EObject eObject = (EObject) entity;
		final EClass auditEClass = AuditHandler.getInstance().getAuditingModelElement(eObject.eClass());
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
		auditWorks.remove(existingAuditWork);

		// and add the new one
		auditWorks.add(auditWork);
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
			final List<AuditWork> auditWorks = getRemoveQueue((Session) session);
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
		final List<AuditWork> auditWorks = getRemoveQueue((Session) session);
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

		final TeneoAuditCommitInfo commitInfo = TeneoauditingFactory.eINSTANCE
				.createTeneoAuditCommitInfo();
		session.flush();
		session.save(commitInfo);

		int i = 0;

		EClass lastEClass = null;
		EClass auditingEClass = null;
		String auditingEntityName = null;
		final List<TeneoAuditObject> auditObjects = new ArrayList<TeneoAuditObject>();
		for (AuditWork auditWork : auditWorks) {
			final EObject eObject = (EObject) auditWork.getEntity();
			if (lastEClass != eObject.eClass()) {
				auditingEClass = AuditHandler.getInstance().getAuditingModelElement(eObject.eClass());
				auditingEntityName = AuditHandler.getInstance().getEntityName(auditingEClass,
						dataStore.getPersistenceOptions());
				lastEClass = eObject.eClass();
			}
			// create the auditObject
			final TeneoAuditObject auditObject = (TeneoAuditObject) auditingEClass.getEPackage()
					.getEFactoryInstance().create(auditingEClass);
			auditObject.setTeneo_audit_kind(auditWork.getAuditKind());
			auditObject.setTeneo_commit_info(commitInfo);
			auditObject.setTeneo_end(-1);
			auditObject.setTeneo_start(commitTime);
			auditObject.setTeneo_object_id(AuditHandler.getInstance().idToString(session,
					auditWork.getEntity()));

			if (auditWork.getEntity() instanceof EObject
					&& null != ((EObject) auditWork.getEntity()).eContainer()) {
				auditObject.setTeneo_container_id(AuditHandler.getInstance().idToString(session,
						((EObject) auditWork.getEntity()).eContainer()));
				auditObject.setTeneo_container_feature_id(((InternalEObject) auditWork.getEntity())
						.eContainerFeatureID());
			}

			AuditHandler.getInstance().copyContent(session, (EObject) auditWork.getEntity(), auditObject,
					auditWork.getAuditKind() != TeneoAuditKind.DELETE);

			if (auditWork.getAuditKind() == TeneoAuditKind.ADD) {
				auditObject.setTeneo_previous_start(-1);
			} else {
				// get info from the previous entry
				final Query infoQuery = session.getNamedQuery(auditingEntityName + ".previousVersion");
				infoQuery.setMaxResults(1);
				infoQuery.setString("objectId", auditObject.getTeneo_object_id());

				final TeneoAuditObject previousEntry = (TeneoAuditObject) infoQuery.list().get(0);
				auditObject.setTeneo_previous_start(previousEntry.getTeneo_start());
				previousEntry.setTeneo_end(commitTime - 1);
				auditObject.setTeneo_previous_start(previousEntry.getTeneo_start());
				session.update(previousEntry);
			}
			auditObjects.add(auditObject);
			session.save(auditingEntityName, auditObject);
			i++;
			if ((i % 1000) == 0) {
				session.flush();
			}
		}
		session.flush();

		// clear the cache from these audit objects
		for (Object object : auditObjects) {
			session.evict(object);
		}
	}

	private synchronized List<AuditWork> getRemoveQueue(Session session) {
		final List<AuditWork> auditWorks = workQueue.get(session.getTransaction());
		if (auditWorks != null) {
			workQueue.remove(session.getTransaction());
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