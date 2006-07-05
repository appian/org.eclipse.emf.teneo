/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: EListPropertyHandler.java,v 1.1 2006/07/05 22:29:30 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.impl.EcoreAccess;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernatePersistableEList;
import org.eclipse.emf.teneo.mapping.elist.PersistableDelegateList;
import org.eclipse.emf.teneo.mapping.elist.PersistableEList;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.FieldUtil;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Implements the accessor for EMF EList members for Hibernate. This can be an EReference or an Eattribute with
 * many=true.
 * 
 * This class implements both the getter, setter and propertyaccessor interfaces. When the getGetter and getSetter
 * methods are called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */

public class EListPropertyHandler implements Getter, Setter, PropertyAccessor {
	/** The logger */
	private static Log log = LogFactory.getLog(EListPropertyHandler.class);

	/** The EStructuralFeature of this accessor */
	protected final EStructuralFeature eFeature;

	/** Constructor */
	public EListPropertyHandler(EStructuralFeature eFeature) {
		this.eFeature = eFeature;
		log.debug("Created getter/setter for " + StoreUtil.toString(eFeature));
		AssertUtil.assertTrue("Many must be true but this isn't the case for " + StoreUtil.toString(eFeature), eFeature
				.isMany());
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
		Object obj = ((EObject) owner).eGet(eFeature);

		if (obj instanceof PersistableDelegateList) {
			return ((PersistableDelegateList) obj).getDelegate();
		} else { // else replace the elist otherwise the wrong collection descriptor is placed in the collection map
					// in hb
			final PersistableDelegateList pelist = (PersistableDelegateList) createPersistableList(
					(InternalEObject) owner, eFeature, (List) obj);
			final EObject eobj = (EObject) owner;
			if (eobj.eClass().getClassifierID() < 0 && !EcoreAccess.isStaticFeature(eFeature, (BasicEObjectImpl) eobj)) {
				log.debug("Dynamic elist, set using the esettings");
				EcoreAccess.setManyEFeatureValue(eFeature, pelist, (BasicEObjectImpl) owner);
			} else {
				// TODO: currently it is required to use the field setter instead of the eSet method
				// because EMF does not support direct setting of the elist feature.
				// UPDATE: for dynamic eclasses now elists are also supported
				// the reason that the javafield is determined here and not at construction time
				// is that the owner passed in the construction can be an interface while there
				// are multiple implementors. FieldUtil does caching of fieldnames and fields.
				final Field javaField = FieldUtil.getField(owner.getClass(), eFeature.getName());
				try {
					javaField.set(owner, pelist);
				} catch (Exception e) {
					throw new HbStoreException("The field + " + javaField.getName() + " can not be set using object "
							+ pelist.getClass().getName() + " on target " + owner.getClass().getName(), e);
				}
			}
			return pelist.getDelegate();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 *      org.hibernate.engine.SessionImplementor)
	 */
	public Object getForInsert(Object owner, Map mergeMap, SessionImplementor session) throws HibernateException {
		final Object obj = ((EObject) owner).eGet(eFeature);
		if (obj instanceof PersistableEList) {
			return ((PersistableEList) obj).getDelegate();
		}
		return obj;
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
		return EList.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 *      org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory) throws HibernateException {
		if (((EObject) target).eClass().getClassifierID() < 0
				&& !EcoreAccess.isStaticFeature(eFeature, (BasicEObjectImpl) target)) {
			log.debug("Dynamic elist, set using the esettings");
			final Object currentValue = EcoreAccess.getManyEFeatureValue(eFeature, (BasicEObjectImpl) target);

			// if currentvalue is not null then use the passed value
			if (currentValue != null && currentValue instanceof PersistableEList) {
				((PersistableEList) currentValue).replaceDelegate((List) value);
			} else {
				EcoreAccess.setManyEFeatureValue(eFeature, createPersistableList((InternalEObject) target, eFeature,
						(List) value), (BasicEObjectImpl) target);
			}
			log.debug("Set value " + value.getClass().getName() + " for target " + target.getClass().getName()
					+ " field " + eFeature.getName());

		} else {
			// the reason that the javafield is determined here and not at construction time
			// is that the owner passed in the construction can be an interface while there
			// are multiple implementors. FieldUtil does caching of fieldnames and fields.
			final Field javaField = FieldUtil.getField(target.getClass(), eFeature.getName());

			try {
				final Object currentValue = javaField.get(target);

				// if currentvalue is not null then use the passed value
				if (currentValue != null && currentValue instanceof PersistableEList) {
					((PersistableEList) currentValue).replaceDelegate((List) value);
				} else {
					javaField.set(target, createPersistableList((InternalEObject) target, eFeature, (List) value));
				}
				log.debug("Set value " + value.getClass().getName() + " for target " + target.getClass().getName()
						+ " field " + eFeature.getName());
			} catch (Exception e) {
				throw new HbStoreException("The field + " + javaField.getName() + " can not be set using object "
						+ value.getClass().getName() + " on target " + target.getClass().getName(), e);
			}
		}
	}

	/** Create method can be overridden */
	protected EList createPersistableList(InternalEObject target, EStructuralFeature estruct, List list) {
		return new HibernatePersistableEList(target, estruct, list);
	}
}