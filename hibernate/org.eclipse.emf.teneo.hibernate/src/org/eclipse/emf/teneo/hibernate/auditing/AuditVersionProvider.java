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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditCommitInfo;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditEntry;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;

/**
 * Main class for retrieving audit entries and revisions of specific entities.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public class AuditVersionProvider implements ExtensionPoint {

	private static final String URI_STR = "http://www.eclipse.org/teneo/auditing";

	public static int getContainingFeatureId(EObject container, EStructuralFeature eContainingFeature) {
		if (eContainingFeature instanceof EReference) {
			EReference eContainingReference = (EReference) eContainingFeature;
			EReference eOpposite = eContainingReference.getEOpposite();
			if (eOpposite != null) {
				return container.eClass().getFeatureID(eOpposite);
			}
		}
		return InternalEObject.EOPPOSITE_FEATURE_BASE
				- container.eClass().getFeatureID(eContainingFeature);
	}

	private Session session;
	private AuditResource auditResource;
	private ResourceSet resourceSet;
	private AuditDataStore dataStore;

	private Map<String, EObject> auditEntryCache = new HashMap<String, EObject>();

	public AuditVersionProvider() {
		auditResource = new AuditResource(URI.createURI(URI_STR));

		resourceSet = new ResourceSetImpl() {
			@Override
			public void eNotify(Notification notification) {
			}

			@Override
			public boolean eDeliver() {
				return false;
			}

			@Override
			public Resource getResource(URI uri, boolean loadOnDemand) {
				return auditResource;
			}

			@Override
			public EObject getEObject(URI uri, boolean loadOnDemand) {
				return auditResource.getEObject(uri.fragment());
			}

			@Override
			public Resource createResource(URI uri, String contentType) {
				return auditResource;
			}

			@Override
			public Resource createResource(URI uri) {
				return auditResource;
			}
		};

		resourceSet.getResources().add(auditResource);
	}

	protected void checkState() {
		AssertUtil.assertTrue("data store must be set", dataStore != null);
	}

	/**
	 * Creates an id string which can be used to query for {@link TeneoAuditEntry} objects. The id
	 * string can be used as a filter value for references to other objects.
	 */
	public String getIdString(EObject entity) {
		final EClass eClass = entity.eClass();
		final String entityName = ((SessionImplementor) getSession()).bestGuessEntityName(entity);
		final Serializable id = ((SessionImplementor) getSession()).getEntityPersister(entityName,
				entity).getIdentifier(entity, (SessionImplementor) getSession());
		return getIdString(eClass, id);
	}

	/**
	 * @see #getIdString(EObject)
	 */
	public String getIdString(EClass eClass, Serializable id) {
		return dataStore.getAuditHandler().idToString(eClass, id);
	}

	/**
	 * Return all audit entries ({@link TeneoAuditEntry}) for a certain version. The audit entries are
	 * ordered by increasing commit time. The latest version is the last.
	 * 
	 * The {@link TeneoAuditEntry} gives version information and times, see also the associated
	 * {@link TeneoAuditCommitInfo} object which can be reached from the {@link TeneoAuditEntry}.
	 * 
	 * From an audit entry you can iterate to the next and previous entries. See:
	 * {@link TeneoAuditEntry#getTeneo_next_entry()} and
	 * {@link TeneoAuditEntry#getTeneo_previous_entry()}.
	 */
	public List<TeneoAuditEntry> getAllAuditEntries(EObject entity) {
		final EClass eClass = entity.eClass();
		final String entityName = ((SessionImplementor) getSession()).bestGuessEntityName(entity);
		final Serializable id = ((SessionImplementor) getSession()).getEntityPersister(entityName,
				entity).getIdentifier(entity, (SessionImplementor) getSession());
		return getAllAuditEntries(eClass, id);
	}

	/**
	 * @see AuditVersionProvider#getAllVersions(EObject)
	 */
	public List<TeneoAuditEntry> getAllAuditEntries(EClass eClass, long timeStamp) {
		checkState();

		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery(
				"select e from " + entityName + " e where e.teneo_start<=:start and (e.teneo_end="
						+ AuditProcessHandler.DEFAULT_END_TIMESTAMP + " or e.teneo_end>=:end)");
		qry.setParameter("start", timeStamp);
		qry.setParameter("end", timeStamp);
		final List<TeneoAuditEntry> result = new ArrayList<TeneoAuditEntry>();
		for (Object o : qry.list()) {
			result.add((TeneoAuditEntry) o);
		}
		return result;
	}

	/**
	 * Returns all revisions with a specific commit time stamp.
	 */
	public List<TeneoAuditEntry> getSpecificAuditEntries(EClass eClass, long commitTimeStamp) {
		checkState();

		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery(
				"select e from " + entityName + " e where e.teneo_start=:start");
		qry.setParameter("start", commitTimeStamp);
		final List<TeneoAuditEntry> result = new ArrayList<TeneoAuditEntry>();
		for (Object o : qry.list()) {
			result.add((TeneoAuditEntry) o);
		}
		return result;
	}

	/**
	 * @see AuditVersionProvider#getAllVersions(EObject)
	 */
	public List<TeneoAuditEntry> getAllAuditEntries(EClass eClass, Object id) {
		checkState();

		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession()
				.createQuery(
						"select e from " + entityName
								+ " e where teneo_object_id=:objectId order by e.teneo_start");
		final String idAsString = dataStore.getAuditHandler().idToString(eClass, id);
		qry.setParameter("objectId", idAsString);
		final List<TeneoAuditEntry> result = new ArrayList<TeneoAuditEntry>();
		for (Object o : qry.list()) {
			result.add((TeneoAuditEntry) o);
		}
		return result;
	}

	/**
	 * Return the latest audit entry ({@link TeneoAuditEntry}) for a certain {@link EClass} and id.
	 * 
	 * From this latest audit entry you can navigate to the previous audit entry using
	 * {@link TeneoAuditEntry#getTeneo_previous_entry()}.
	 * 
	 * @see #getAllVersions(EObject)
	 */
	public TeneoAuditEntry getLatestAuditEntry(EClass eClass, Object id) {
		checkState();

		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery(
				"select e from " + entityName + " e where teneo_object_id=:objectId and teneo_end="
						+ AuditProcessHandler.DEFAULT_END_TIMESTAMP);
		final String idAsString = dataStore.getAuditHandler().idToString(eClass, id);
		qry.setParameter("objectId", idAsString);
		qry.setMaxResults(1);
		return (TeneoAuditEntry) qry.uniqueResult();
	}

	/**
	 * Return the audit entry ({@link TeneoAuditEntry}) for a certain {@link EClass}, id and version.
	 * 
	 * From this latest audit entry you can navigate to the previous audit entry using
	 * {@link TeneoAuditEntry#getTeneo_previous_entry()}.
	 * 
	 * @see #getAllVersions(EObject)
	 */
	public TeneoAuditEntry getAuditEntryForVersion(EClass eClass, Object id, long version) {
		checkState();

		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery(
				"select e from " + entityName
						+ " e where teneo_object_id=:objectId and teneo_object_version=:version");
		final String idAsString = dataStore.getAuditHandler().idToString(eClass, id);
		qry.setParameter("objectId", idAsString);
		qry.setParameter("version", version);
		qry.setMaxResults(1);
		return (TeneoAuditEntry) qry.uniqueResult();
	}

	/**
	 * Resolve an {@link EObject} against the internal resource used here. This method is usefull in
	 * case the EReference does not automatically resolve proxies.
	 */
	@SuppressWarnings("unchecked")
	public <T extends EObject> T resolve(T proxy) {
		return (T) EcoreUtil.resolve(proxy, auditResource);
	}

	/**
	 * Get the actual object representing a certain state defined by the auditEntry. Note that all
	 * references and values of the returned {@link EObject} represent the state at the
	 * {@link TeneoAuditEntry#getTeneo_start()}.
	 */
	public EObject getRevision(TeneoAuditEntry auditEntry) {
		final EClass eClass = dataStore.getAuditHandler().getModelElement(auditEntry.eClass());
		final long timeStamp = auditEntry.getTeneo_start();
		final AuditReference auditReference = dataStore.getAuditHandler().fromString(
				timeStamp + AuditHandler.ID_SEPARATOR + auditEntry.getTeneo_object_id());
		return getRevision(eClass, auditReference.getId(), timeStamp);
	}

	/**
	 * Returns the previous audit entry which reflects the state before the current entry.
	 * 
	 * @see AuditVersionProvider#getRevision(TeneoAuditEntry)
	 */
	public TeneoAuditEntry getPreviousEntry(TeneoAuditEntry entry) {
		// the first entry
		if (entry.getTeneo_previous_start() < 0) {
			return null;
		}
		final Query qry = getSession().createQuery(
				"select e from " + HbUtil.getEntityName(entry.eClass())
						+ " e where teneo_object_id=:objectId and teneo_start=:start");
		qry.setParameter("objectId", entry.getTeneo_object_id());
		qry.setParameter("start", entry.getTeneo_previous_start());
		qry.setMaxResults(1);
		return (TeneoAuditEntry) qry.uniqueResult();
	}

	/**
	 * Returns the previous audit entry which reflects the state before the current entry.
	 * 
	 * @see AuditVersionProvider#getRevision(TeneoAuditEntry)
	 */
	public TeneoAuditEntry getNextEntry(TeneoAuditEntry entry) {
		// the first entry
		if (entry.getTeneo_end() < 0) {
			return null;
		}
		final Query qry = getSession().createQuery(
				"select e from " + HbUtil.getEntityName(entry.eClass())
						+ " e where teneo_object_id=:objectId and teneo_previous_start=:start");
		qry.setParameter("objectId", entry.getTeneo_object_id());
		qry.setParameter("start", entry.getTeneo_start());
		qry.setMaxResults(1);
		return (TeneoAuditEntry) qry.uniqueResult();
	}

	/**
	 * Returns the {@link TeneoAuditEntry} representing the state at the specified timestamp.
	 * 
	 * If there is no revision at that timestamp then null is returned.
	 * 
	 * @see AuditVersionProvider#getRevision(TeneoAuditEntry)
	 */
	public TeneoAuditEntry getAuditEntry(EClass eClass, Object id, long timeStamp) {
		checkState();

		final String idAsString = dataStore.getAuditHandler().idToString(eClass, id);
		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA)
				.getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);

		final Query qry = getSession().createQuery(
				"select e from " + entityName
						+ " e where teneo_object_id=:objectId and teneo_start<=:start and (teneo_end="
						+ AuditProcessHandler.DEFAULT_END_TIMESTAMP + " or teneo_end>=:end)");
		qry.setParameter("objectId", idAsString);
		qry.setParameter("start", timeStamp);
		qry.setParameter("end", timeStamp);

		final TeneoAuditEntry auditEntry = (TeneoAuditEntry) qry.uniqueResult();
		return auditEntry;
	}

	/**
	 * Returns the actual object instance representing the state at the specified timestamp.
	 * 
	 * If there is no revision at that timestamp then null is returned.
	 * 
	 * @see AuditVersionProvider#getRevision(TeneoAuditEntry)
	 */
	@SuppressWarnings("unchecked")
	public EObject getRevision(EClass eClass, Object id, long timeStamp) {
		checkState();

		final String idAsString = dataStore.getAuditHandler().idToString(eClass, id);
		final String fullId = timeStamp + AuditHandler.ID_SEPARATOR + idAsString;
		if (auditResource.getEObjectFromCache(fullId) != null) {
			return auditResource.getEObjectFromCache(fullId);
		}
		final EClass auditingEClass = dataStore.getAuditHandler().getAuditingModelElement(eClass);

		final TeneoAuditEntry auditEntry = getAuditEntry(eClass, id, timeStamp);
		if (auditEntry == null) {
			return null;
		}

		EObject target = auditEntryCache.get(idAsString + "_" + auditEntry.getTeneo_audit_id());
		if (target != null) {
			return target;
		}

		target = eClass.getEPackage().getEFactoryInstance().create(eClass);
		for (EStructuralFeature targetEFeature : target.eClass().getEAllStructuralFeatures()) {
			final EStructuralFeature sourceEFeature = auditingEClass.getEStructuralFeature(targetEFeature
					.getName());
			if (sourceEFeature == null) {
				continue;
			}
			if (!sourceEFeature.isMany() && !auditEntry.eIsSet(sourceEFeature)) {
				continue;
			}

			// embedded objects are stored as references
			if (sourceEFeature instanceof EAttribute && targetEFeature instanceof EReference) {
				if (sourceEFeature.isMany()) {
					for (Object value : ((Collection<?>) auditEntry.eGet(sourceEFeature))) {
						((Collection<Object>) target.eGet(targetEFeature)).add(createProxyEObject(
								(String) value, timeStamp));
					}
				} else {
					target.eSet(targetEFeature,
							createProxyEObject((String) auditEntry.eGet(sourceEFeature), timeStamp));
				}
			} else {
				if (StoreUtil.isMap(targetEFeature)) {
					for (Object value : ((Collection<?>) auditEntry.eGet(sourceEFeature))) {
						((Collection<Object>) target.eGet(targetEFeature)).add(createEMapEntry(
								(EReference) targetEFeature, (EObject) value, timeStamp));
					}
				} else if (FeatureMapUtil.isFeatureMap(targetEFeature)) {
					for (Object value : ((Collection<?>) auditEntry.eGet(sourceEFeature))) {
						final FeatureMap.Entry sourceEntry = (FeatureMap.Entry) value;
						final EStructuralFeature targetEntryFeature = dataStore.getAuditHandler()
								.getModelElement(sourceEntry.getEStructuralFeature());
						final FeatureMap.Entry targetEntry = createFeatureMapEntry(targetEntryFeature,
								sourceEntry, timeStamp);
						((Collection<Object>) target.eGet(targetEFeature)).add(targetEntry);
					}
				} else if (targetEFeature.isMany()) {
					final Collection<?> collection = ((Collection<?>) auditEntry.eGet(sourceEFeature));
					if (collection.size() > 0) {
						for (Object value : collection) {
							((Collection<Object>) target.eGet(targetEFeature)).add(dataStore.getAuditHandler()
									.convertValue(targetEFeature, value));
						}
					}
				} else {
					target.eSet(
							targetEFeature,
							dataStore.getAuditHandler().convertValue(targetEFeature,
									auditEntry.eGet(sourceEFeature)));
				}
			}
		}

		if (auditEntry.getTeneo_container_feature_name() != null
				|| auditEntry.getTeneo_container_id() != null) {
			final InternalEObject container = (InternalEObject) createProxyEObject(
					auditEntry.getTeneo_container_id(), timeStamp);
			if (container != null) {
				if (auditEntry.getTeneo_container_feature_name() != null) {
					final EStructuralFeature eContainingFeature = container.eClass().getEStructuralFeature(
							auditEntry.getTeneo_container_feature_name());
					final int containerFeatureId = getContainingFeatureId(container, eContainingFeature);
					((InternalEObject) target).eBasicSetContainer(container, containerFeatureId, null);
				} else {
					((InternalEObject) target).eBasicSetContainer(container,
							auditEntry.getTeneo_container_feature_id(), null);
				}
			}
		}

		if (target.eResource() == null) {
			((InternalEObject) target).eSetResource(auditResource, null);
		}
		auditResource.putEObjectInCache(fullId, target);
		auditEntryCache.put(idAsString + "_" + auditEntry.getTeneo_audit_id(), target);
		return target;
	}

	private Object createEMapEntry(EReference targetEFeature, EObject sourceEntry, long timeStamp) {
		final EObject targetEntry = EcoreUtil.create(targetEFeature.getEReferenceType());
		final Object value = sourceEntry.eGet(sourceEntry.eClass().getEStructuralFeature("value"));
		final Object key = sourceEntry.eGet(sourceEntry.eClass().getEStructuralFeature("key"));
		final EStructuralFeature keyEFeature = targetEntry.eClass().getEStructuralFeature("key");
		final EStructuralFeature valueEFeature = targetEntry.eClass().getEStructuralFeature("value");

		final Object newKey;
		if (keyEFeature instanceof EAttribute) {
			newKey = dataStore.getAuditHandler().convertValue(keyEFeature, key);
		} else if (key instanceof EObject) {
			newKey = key;
		} else {
			newKey = createProxyEObject((String) key, timeStamp);
		}
		targetEntry.eSet(keyEFeature, newKey);

		final Object newValue;
		if (valueEFeature instanceof EAttribute) {
			newValue = dataStore.getAuditHandler().convertValue(valueEFeature, value);
		} else if (value instanceof EObject) {
			newValue = value;
		} else {
			newValue = createProxyEObject((String) value, timeStamp);
		}
		targetEntry.eSet(valueEFeature, newValue);

		return targetEntry;
	}

	private FeatureMap.Entry createFeatureMapEntry(EStructuralFeature eFeature,
			FeatureMap.Entry sourceEntry, long timeStamp) {
		Object value = sourceEntry.getValue();
		if (eFeature instanceof EReference) {
			value = createProxyEObject((String) value, timeStamp);
		}
		return FeatureMapUtil.createEntry(eFeature, value);
	}

	protected EObject createProxyEObject(String value, long timeStamp) {
		if (value == null) {
			return null;
		}
		final String idStr = timeStamp + AuditHandler.ID_SEPARATOR + value;
		EObject eObject = auditResource.getEObjectFromCache(idStr);
		if (eObject != null) {
			return eObject;
		}
		final AuditReference reference = dataStore.getAuditHandler().fromString(idStr);
		final EClass refEClass = dataStore.toEClass(reference.getEntityName());
		eObject = refEClass.getEPackage().getEFactoryInstance().create(refEClass);
		((InternalEObject) eObject).eSetProxyURI(URI.createURI(URI_STR + "#" + idStr));
		((InternalEObject) eObject).eSetResource(auditResource, null);
		return eObject;
	}

	protected Session getSession() {
		if (session == null) {
			session = ((SessionFactoryImplementor) dataStore.getSessionFactory()).openTemporarySession();
		}
		return session;
	}

	public AuditDataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(AuditDataStore dataStore) {
		this.dataStore = dataStore;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void close() {
		if (session != null) {
			session.close();
		}
	}

	private class AuditResource extends ResourceImpl {

		private Map<String, EObject> idToEObjectMap = new HashMap<String, EObject>();

		public AuditResource(URI uri) {
			super(uri);
		}

		public EObject getEObjectFromCache(String idStr) {
			return idToEObjectMap.get(idStr);
		}

		public void putEObjectInCache(String idStr, EObject eObject) {
			idToEObjectMap.put(idStr, eObject);
		}

		@Override
		public EObject getEObject(String uriFragment) {

			if (idToEObjectMap.containsKey(uriFragment)) {
				return idToEObjectMap.get(uriFragment);
			}

			// read the auditEntry from the session
			final AuditReference reference = dataStore.getAuditHandler().fromString(uriFragment);
			final EClass eClass = dataStore.toEClass(reference.getEntityName());
			EObject version = AuditVersionProvider.this.getRevision(eClass, reference.getId(),
					reference.getTimeStamp());
			if (version == null) {
				version = (EObject) getSession().get(reference.getEntityName(), reference.getId());
			}

			if (version.eResource() == null) {
				((InternalEObject) version).eSetResource(this, null);
			}
			if (version != null) {
				idToEObjectMap.put(uriFragment, version);
			}
			return version;
		}
	}
}