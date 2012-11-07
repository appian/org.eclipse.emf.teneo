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
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.teneo.PersistenceOptions;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditKind;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingFactory;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoauditingPackage;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
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

	private static ThreadLocal<String> currentUserName = new ThreadLocal<String>();

	public static void setCurrentUserName(String user) {
		currentUserName.set(user);
	}

	private static final long serialVersionUID = 1L;
	private AuditDataStore dataStore;

	private Map<Transaction, List<AuditWork>> workQueue = new ConcurrentHashMap<Transaction, List<AuditWork>>();

	private int pruneCounter = 0;
	private long pruneTime = 0;
	private long pruneInterval = 1000;
	private List<String> auditEntityNames = null;

	private boolean isAudited(Object entity) {
		if (!(entity instanceof EObject)) {
			// TODO: support featuremap entries
			return false;
		}
		if (!dataStore.isAuditing()) {
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
			if (auditWorks == null || auditWorks.isEmpty()) {
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
		if (auditWorks == null || auditWorks.isEmpty()) {
			// remove any old entries
			pruneEntries((SessionImplementor) session);
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

		// remove any old entries
		pruneEntries((SessionImplementor) session);
	}

	private void doAuditWorkInSession(Session session, List<AuditWork> auditWorks) {
		final long commitTime = System.currentTimeMillis();

		final List<EObject> toSaveEntries = new ArrayList<EObject>();

		final TeneoAuditCommitInfo commitInfo = TeneoauditingFactory.eINSTANCE
				.createTeneoAuditCommitInfo();
		if (currentUserName.get() != null) {
			commitInfo.setUser(currentUserName.get());
		}
		toSaveEntries.add(commitInfo);

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

			// note also do a query in case of ADD as an object can
			// be removed and then re-added, restore its link
			// to the history then
			// get info from the previous entry
			// Note: apparently hibernate has a query plan cache, so
			// it does not give a performance benefit to use a namedquery
			// at least not that much..
			// http://stackoverflow.com/questions/3578711/jpa-caching-queries
			final Query infoQuery = session.createQuery("select teneo_start from " + auditEntryEntityName
					+ " e where teneo_object_id=:objectId and teneo_end="
					+ AuditProcessHandler.DEFAULT_END_TIMESTAMP);
			infoQuery.setMaxResults(1);
			infoQuery.setString("objectId", auditEntry.getTeneo_object_id());

			@SuppressWarnings("unchecked")
			final List<Object> list = infoQuery.list();
			if (!list.isEmpty()) {
				final Long startTime = (Long) list.get(0);

				auditEntry.setTeneo_previous_start(startTime);

				updateEndTime(session, auditEntryEntityName, auditEntry.getTeneo_object_id(),
						commitTime - 1, false);
				updateEndTimeDerivedObjects(session, auditEntryEClass, auditEntry.getTeneo_object_id(),
						commitTime - 1);
			}
			// save later to not flush in the loop
			toSaveEntries.add(auditEntry);
			setCommitInfoInReferencedObjects(auditEntry, toSaveEntries);
		}
		// do flush here to ensure that the update is done before
		// the save, this to prevent unique constraint failures
		session.flush();

		for (EObject o : toSaveEntries) {
			session.save(HbUtil.getEntityName(o.eClass()), o);
		}
		// and flush the saved stuff
		session.flush();

		// clear the cache from these audit objects
		for (Object object : toSaveEntries) {
			session.evict(object);
		}

		// clear the work queue
		getRemoveQueue(session, false);

		pruneCounter++;
	}

	// is called/used in case of emap entries which are themselves
	// audit objects
	private void setCommitInfoInReferencedObjects(TeneoAuditEntry source, List<EObject> toSaveObjects) {
		for (EReference eReference : source.eClass().getEAllReferences()) {
			if (TeneoauditingPackage.eINSTANCE.getTeneoAuditEntry().isSuperTypeOf(
					eReference.getEReferenceType())) {
				if (eReference.isMany()) {
					int i = 0;
					for (Object value : (Collection<?>) source.eGet(eReference)) {
						final TeneoAuditEntry target = (TeneoAuditEntry) value;
						toSaveObjects.add(target);
						setAuditEntryValues(eReference.getName() + "_" + i++, source, target);
					}
				} else if (source.eIsSet(eReference) && null != source.eGet(eReference)) {
					setAuditEntryValues(eReference.getName() + "_", source,
							(TeneoAuditEntry) source.eGet(eReference));
					toSaveObjects.add((TeneoAuditEntry) source.eGet(eReference));
				}
			}
		}
	}

	private void updateEndTimeDerivedObjects(Session session, EClass sourceEClass, String objectId,
			long newEnd) {
		for (EReference eReference : sourceEClass.getEAllReferences()) {
			final EClass targetEClass = eReference.getEReferenceType();
			if (TeneoauditingPackage.eINSTANCE.getTeneoAuditEntry().isSuperTypeOf(targetEClass)) {
				updateEndTime(session, dataStore.toEntityName(targetEClass), objectId, newEnd, true);
			}
		}
	}

	private void updateEndTime(Session session, String entityName, String objectId, long newEnd,
			boolean useOwner) {
		final String qryStr = "update " + entityName + " e set e.teneo_end = :newEnd " + "where e."
				+ (useOwner ? "teneo_owner_object_id" : "teneo_object_id")
				+ " = :objectId and e.teneo_end = :oldEnd";
		final Query qry = session.createQuery(qryStr);
		qry.setParameter("newEnd", newEnd);
		qry.setParameter("objectId", objectId);
		qry.setParameter("oldEnd", AuditProcessHandler.DEFAULT_END_TIMESTAMP);
		qry.executeUpdate();
	}

	private void setAuditEntryValues(String prefix, TeneoAuditEntry source, TeneoAuditEntry target) {
		target.setTeneo_commit_info(source.getTeneo_commit_info());
		target.setTeneo_audit_kind(source.getTeneo_audit_kind());
		target.setTeneo_start(source.getTeneo_start());
		target.setTeneo_object_id(prefix + "_" + source.getTeneo_object_id());
		target.setTeneo_owner_object_id(source.getTeneo_object_id());
		target.setTeneo_previous_start(source.getTeneo_previous_start());
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

	public AuditDataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(AuditDataStore dataStore) {
		this.dataStore = dataStore;
		pruneTime = 1000 * 3600 * 24 * Long.parseLong(dataStore.getDataStoreProperties().getProperty(
				PersistenceOptions.AUDITING_PRUNE_OLD_ENTRIES_DAYS));
		pruneInterval = Long.parseLong(dataStore.getDataStoreProperties().getProperty(
				PersistenceOptions.AUDITING_PRUNE_COMMIT_INTERVAL));
	}

	private synchronized void pruneEntries(SessionImplementor session) {
		if (pruneTime == 0) {
			return;
		}
		if (pruneCounter > pruneInterval) {
			return;
		}
		pruneCounter = 0;

		if (auditEntityNames == null) {
			auditEntityNames = new ArrayList<String>();
			for (EPackage ePackage : dataStore.getEPackages()) {
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					if (eClassifier instanceof EClass && StoreUtil.isAuditEntryEClass((EClass) eClassifier)) {
						auditEntityNames.add(dataStore.toEntityName((EClass) eClassifier));
					}
				}
			}
		}

		Session tmpSession = null;
		boolean err = true;
		try {
			tmpSession = session.getFactory().openSession();
			tmpSession.beginTransaction();
			final long currentPruneTime = System.currentTimeMillis() - pruneTime;
			for (String auditEntityName : auditEntityNames) {
				final Query qry = tmpSession.createQuery("select e from " + auditEntityName
						+ " e where e.teneo_start < :pruneTime");
				qry.setParameter("pruneTime", currentPruneTime);
				ScrollableResults results = qry.scroll(ScrollMode.FORWARD_ONLY);
				while (results.next()) {
					tmpSession.delete(results.get()[0]);
				}
				results.close();
			}
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

	/**
	 * Used for testing, for setting the prune limit use the
	 * {@link PersistenceOptions#AUDITING_PRUNE_OLD_ENTRIES_DAYS} option.
	 */
	public void setPruneTime(long thePruneTime) {
		pruneTime = thePruneTime;
	}

	public long getPruneTime() {
		return pruneTime;
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