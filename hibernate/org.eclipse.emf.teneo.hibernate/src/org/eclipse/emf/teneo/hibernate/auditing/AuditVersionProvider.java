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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.auditing.model.teneoauditing.TeneoAuditObject;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionFactoryImplementor;

/**
 * Main class for retrieving versions of specific entities.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 */
public class AuditVersionProvider implements ExtensionPoint {
	
	private static final String URI_STR = "http://www.eclipse.org/teneo/auditing";
	
	private Session session;
	private AuditResource auditResource;
	private ResourceSet resourceSet;
	private HbDataStore dataStore;
	
	public AuditVersionProvider () {
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
				// TODO Auto-generated method stub
				return null;
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
	
	public List<TeneoAuditObject> getAllVersions(EClass eClass, Object id) {
		checkState();
		
		final EClass auditingEClass = AuditHandler.getInstance().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA).getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery("select e from " + entityName + " e where teneo_object_id=:objectId order by e.teneo_start");
		final String idAsString = AuditHandler.getInstance().idToString(eClass, id);
		qry.setParameter("objectId", idAsString);
		final List<TeneoAuditObject> result = new ArrayList<TeneoAuditObject>();
		for (Object o : qry.list()) {
			result.add((TeneoAuditObject)o);
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public EObject getVersion(EClass eClass, Object id, long timeStamp) {
		checkState();
		
		final String idAsString = AuditHandler.getInstance().idToString(eClass, id);
		final EClass auditingEClass = AuditHandler.getInstance().getAuditingModelElement(eClass);
		final String entityName = auditingEClass.getEAnnotation(Constants.ANNOTATION_SOURCE_TENEO_JPA).getDetails().get(Constants.ANNOTATION_KEY_ENTITY_NAME);
		final Query qry = getSession().createQuery("select e from " + entityName + " e where teneo_object_id=:objectId and teneo_start<=:start and (teneo_end=-1 or teneo_end>:end)");
		qry.setParameter("objectId", idAsString);
		qry.setParameter("start", timeStamp);
		qry.setParameter("end", timeStamp);
		final TeneoAuditObject auditObject = (TeneoAuditObject)qry.uniqueResult();
		final EObject target = eClass.getEPackage().getEFactoryInstance().create(eClass);
		for (EStructuralFeature targetEFeature : target.eClass().getEAllStructuralFeatures()) {
			final EStructuralFeature sourceEFeature = auditingEClass.getEStructuralFeature(targetEFeature.getName());
			if (sourceEFeature == null) {
				continue;
			}
			if (!auditObject.eIsSet(sourceEFeature)) {
				continue;
			}
			if (targetEFeature instanceof EReference) {
				if (targetEFeature.isMany()) {
					for (Object value : ((Collection<?>)auditObject.eGet(sourceEFeature))) {
						((Collection<Object>) target.eGet(targetEFeature)).add(createProxyEObject(
								(String) value, timeStamp));
					}
				} else {
					target.eSet(targetEFeature,
							createProxyEObject((String) auditObject.eGet(sourceEFeature), timeStamp));
				}
			} else {
				if (targetEFeature.isMany()) {
					for (Object value : ((Collection<?>)auditObject.eGet(sourceEFeature))) {
						((Collection<Object>)target.eGet(targetEFeature)).add(value);
					}
				} else {
					target.eSet(targetEFeature, auditObject.eGet(sourceEFeature));
				}
			}
		}
		return target;
	}
	
	private EObject createProxyEObject(String value, long timeStamp) {
		if (value == null) {
			return null;
		}
		EObject eObject = auditResource.getEObjectFromCache(value);
		if (eObject != null) {
			return eObject;
		}
		final AuditReference reference = AuditHandler.getInstance().fromString((String)value);
		final EClass refEClass = dataStore.getEClassFromEntityName(reference.getEntityName());
		eObject = refEClass.getEPackage().getEFactoryInstance().create(refEClass);
		((InternalEObject) eObject)
.eSetProxyURI(URI.createURI(URI_STR + "#" + timeStamp
				+ AuditHandler.ID_SEPARATOR + value));
		return eObject;
	}
	
	protected Session getSession() {
		if (session == null) {
			session = ((SessionFactoryImplementor)dataStore.getSessionFactory()).openTemporarySession();			
		}
		return session;
	}

	public HbDataStore getDataStore() {
		return dataStore;
	}

	public void setDataStore(HbDataStore dataStore) {
		this.dataStore = dataStore;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	private class AuditResource extends ResourceImpl {
		
		private Map<String, EObject> idToEObjectMap = new HashMap<String, EObject>();
		
		public AuditResource(URI uri) {
			super(uri);
		}

		public EObject getEObjectFromCache(String idStr) {
			return idToEObjectMap.get(idStr);
		}
		
		@Override
		public EObject getEObject(String uriFragment) {
			
			if (idToEObjectMap.containsKey(uriFragment)) {
				return idToEObjectMap.get(uriFragment);
			}
			
			// read the auditobject from the session
			final AuditReference reference = AuditHandler.getInstance().fromString(uriFragment);
			final EClass eClass = dataStore.getEClassFromEntityName(reference.getEntityName());
			EObject version = getVersion(eClass, reference.getId(), reference.getTimeStamp());
			if (version == null) {
				version = (EObject)getSession().get(reference.getEntityName(), reference.getId());
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