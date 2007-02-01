/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EReferencePropertyHandler.java,v 1.2 2007/02/01 12:34:14 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Implements the getter for an EReference field. Normally uses the eget/eset methods with bidirectional relations the
 * handling is a bit different using eInverseRemove and eInverseAdd.
 * 
 * This class implements both the getter, setter and propertyaccessor interfaces. When the getGetter and getSetter
 * methods are called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class EReferencePropertyHandler implements Getter, Setter, PropertyAccessor {

	/** The logger */
	private static Log log = LogFactory.getLog(EReferencePropertyHandler.class);

	/** The feature */
	protected final EReference eReference;

	/** Two way reference */
	protected final boolean isBidirectional;

	/** Constructor */
	public EReferencePropertyHandler(EReference eReference) {
		this.eReference = eReference;
		isBidirectional = eReference.getEOpposite() != null;
		log.debug("Created getter/setter for " + StoreUtil.toString(eReference));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getGetter(java.lang.Class, java.lang.String)
	 */
	public Getter getGetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getSetter(java.lang.Class, java.lang.String)
	 */
	public Setter getSetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {
		return ((EObject) owner).eGet(eReference);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 *      org.hibernate.engine.SessionImplementor)
	 */
	public Object getForInsert(Object owner, Map mergeMap, SessionImplementor session) throws HibernateException {
		return get(owner);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 *      org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory) throws HibernateException {
		final Object curValue = get(target);
		if (isBidirectional) {// these are handled a bit differently because the opposite should not be set, this is
								// done by hb
			if (curValue != value) { // note that == works fine if the curValue and value have been read in the same
										// pm.
				if (value == null) { // remove
					final NotificationChain nots = ((InternalEObject) target).eInverseRemove(
							(InternalEObject) curValue, eReference.getFeatureID(), eReference.getEType()
									.getInstanceClass(), null);
					if (nots != null)
						nots.dispatch();
				} else {
					final NotificationChain nots = ((InternalEObject) target).eInverseAdd((InternalEObject) value,
							eReference.getFeatureID(), eReference.getEType().getInstanceClass(), null);
					if (nots != null)
						nots.dispatch();
				}
			}
		} else {
			if (curValue == null && value == null)
				return; // do nothing in this case
			final EObject eobj = (EObject) target;
			eobj.eSet(eReference, value);
			if (!eReference.isContainment()) {
				Resource res = eobj.eResource();
				if (res != null && ((EObject) value).eResource() == null) {
					((ResourceImpl) res).attached(eobj);
				}
			}
		}
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
	public Class getReturnType() {
		return InternalEObject.class;
	}
}