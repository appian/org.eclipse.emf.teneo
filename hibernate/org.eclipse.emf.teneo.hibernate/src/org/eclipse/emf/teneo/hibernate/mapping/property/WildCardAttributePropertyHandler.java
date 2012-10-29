/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: WildCardAttributePropertyHandler.java,v 1.3 2010/11/11 10:28:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernateFeatureMapEntry;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Implements the getter/setter for a wild card EAttribute property. This type of property is used
 * in a feature map created for wild cards.
 * 
 * This class implements both the getter, setter and propertyaccessor interfaces. When the getGetter
 * and getSetter methods are called it returns itself.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.3 $
 */
public class WildCardAttributePropertyHandler implements Getter, Setter, PropertyAccessor,
		ExtensionPoint {

	/**
	 * Generated Version ID
	 */
	private static final long serialVersionUID = -2659637883475733107L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getGetter(java.lang.Class, java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	public Getter getGetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.PropertyAccessor#getSetter(java.lang.Class, java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	public Setter getSetter(Class theClass, String propertyName) throws PropertyNotFoundException {
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {
		final Object value;
		final EStructuralFeature eFeature;
		if (!(owner instanceof HibernateFeatureMapEntry)) {
			final FeatureMap.Entry fme = (FeatureMap.Entry) owner;
			value = fme.getValue();
			eFeature = fme.getEStructuralFeature();
		} else {
			final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) owner;
			value = fme.getValue();
			eFeature = fme.getEStructuralFeature();
		}
		// not handled by this one
		if (value instanceof EObject) {
			return null;
		}
		if (value == null) {
			return null;
		}
		final EAttribute eAttribute = (EAttribute) eFeature;
		final EDataType eDataType = eAttribute.getEAttributeType();
		final String valueString = eDataType.getEPackage().getEFactoryInstance()
				.convertToString(eDataType, value);
		return valueString;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object, java.util.Map,
	 * org.hibernate.engine.SessionImplementor)
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object owner, Map mergeMap, SessionImplementor session)
			throws HibernateException {
		final Object value = get(owner);
		return value;
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
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 * org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory)
			throws HibernateException {
		if (!(target instanceof HibernateFeatureMapEntry)) {
			// happens during initial save
			return;
		}
		final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) target;
		if (value != null && !(value instanceof EObject)) {
			// will be converted inside the HibernateFeatureMapEntry
			fme.setValue(value);
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
	@SuppressWarnings("rawtypes")
	public Class getReturnType() {
		return EObject.class;
	}
}