/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * EReferencePropertyHandler.java,v 1.4 2007/04/07 12:43:51 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.identifier.IdentifierCacheHandler;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;
import org.hibernate.proxy.HibernateProxy;

/**
 * Implements the getter for an EReference field. Normally uses the eget/eset
 * methods with bidirectional relations the handling is a bit different using
 * eInverseRemove and eInverseAdd. This class implements both the getter, setter
 * and propertyaccessor interfaces. When the getGetter and getSetter methods are
 * called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.21 $
 */
public class EReferencePropertyHandler implements Getter, Setter,
		PropertyAccessor, ExtensionPoint {

	/**
	 * Serial version id
	 */
	private static final long serialVersionUID = -3712366809398761331L;

	/** The logger */
	private static Log log = LogFactory.getLog(EReferencePropertyHandler.class);

	/** The feature */
	protected EReference eReference;

	/** Two way reference */
	protected boolean isBidirectional;

	private int featureId = -1;

	private boolean isId = false;

	public void initialize(EReference eReference) {
		this.eReference = eReference;
		final EClass eClass = eReference.getEContainingClass();
		featureId = eClass.getFeatureID(eReference);
		isBidirectional = (eReference.getEOpposite() != null && !eReference
				.getEOpposite().isTransient());
		log.debug("Created getter/setter for " + StoreUtil.toString(eReference));
	}

	public EReference getEReference() {
		return eReference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getGetter(java.lang.Class,
	 * java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	public Getter getGetter(Class theClass, String propertyName)
			throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMember()
	 */
	public Member getMember() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getSetter(java.lang.Class,
	 * java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	public Setter getSetter(Class theClass, String propertyName)
			throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {
		// see bugzilla: 283680, in case of cascading having this
		// to false ment that Hibernate encountered unresolved/empty
		// object
		Object result = ((EObject) owner).eGet(eReference, false);
		if (result instanceof HibernateProxy) {
			// in case of HibernateProxy do not force eager load by invoking
			// eGet with true parameter that will invoke eIsProxy() on the
			// hibernate proxy object
			return result;
		}
		return ((EObject) owner).eGet(eReference, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object,
	 * java.util.Map, org.hibernate.engine.SessionImplementor)
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object owner, Map mergeMap,
			SessionImplementor session) throws HibernateException {
		return get(owner);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object,
	 * java.lang.Object, org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value,
			SessionFactoryImplementor factory) throws HibernateException {
		final Object curValue = get(target);

		if (isId()) {
			IdentifierCacheHandler.getInstance().setID(target, value);
		}

		if (isBidirectional
				|| (target instanceof DynamicEObjectImpl && eReference
						.isContainment())) {
			// these are handled a bit differently because
			// the opposite should not be set, this is
			// done by hb
			if (curValue != value) { // note that == works fine if the
				// curValue and value have been read in
				// the same
				// pm.
				// Note that the eInverseRemove is called on the target itself
				// and the value is
				// passed
				// therefore the eReference featureid is passed and not the
				// opposite
				if (value == null) { // remove
					final NotificationChain nots = ((InternalEObject) target)
							.eInverseRemove((InternalEObject) curValue,
									featureId, eReference.getEType()
											.getInstanceClass(), null);
					if (nots != null) {
						nots.dispatch();
					}
				} else {
					final NotificationChain nots = ((InternalEObject) target)
							.eInverseAdd((InternalEObject) value, featureId,
									eReference.getEType().getInstanceClass(),
									null);
					if (nots != null) {
						nots.dispatch();
					}
				}
			}
		} else {
			if (curValue == value) {
				return; // do nothing in this case
			}
			final EObject eobj = (EObject) target;
			eobj.eSet(eReference, value);
		}
		final EObject eobj = (EObject) target;
		Resource res = eobj.eResource();
		if (value != null && res instanceof HibernateResource
				&& ((EObject) value).eResource() == null) {
			final boolean loading = ((HibernateResource) res).isLoading();
			try {
				((HibernateResource) res).setIsLoading(true);
				((HibernateResource) res).addToContentOrAttach(
						(InternalEObject) value, eReference);
			} finally {
				((HibernateResource) res).setIsLoading(loading);
			}
		}

		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=245634
		// container relations should be modeled explicitly in the database or
		// not at all
		// see the relevant option in PersistenceOptions.
		// if (eReference.isContainment() && target instanceof InternalEObject
		// && value instanceof InternalEObject) {
		// EContainerRepairControl.setContainer((InternalEObject) target,
		// (InternalEObject) value, eReference);
		// }
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethod()
	 */
	public Method getMethod() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getMethodName()
	 */
	public String getMethodName() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getReturnType()
	 */
	@SuppressWarnings("rawtypes")
	public Class getReturnType() {
		return InternalEObject.class;
	}

	public boolean isId() {
		return isId;
	}

	public void setId(boolean isId) {
		this.isId = isId;
	}
}