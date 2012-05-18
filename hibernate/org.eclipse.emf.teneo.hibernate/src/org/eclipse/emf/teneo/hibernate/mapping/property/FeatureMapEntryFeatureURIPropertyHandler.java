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
 * $Id: FeatureMapEntryFeatureURIPropertyHandler.java,v 1.8 2010/11/11 10:28:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.mapping.elist.HibernateFeatureMapEntry;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Handles the string representation of the feature of the feature map entry in
 * the database.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class FeatureMapEntryFeatureURIPropertyHandler implements Getter,
		Setter, PropertyAccessor, ExtensionPoint {
	/**
	 * Generated Version ID
	 */
	private static final long serialVersionUID = 7334975651233065801L;

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

	/**
	 * Reads the version from the versioncache
	 */
	public Object get(Object owner) throws HibernateException {
		if (!(owner instanceof HibernateFeatureMapEntry)) {
			final FeatureMap.Entry smf = (FeatureMap.Entry) owner;
			return StoreUtil.structuralFeatureToString(smf
					.getEStructuralFeature());
		}
		final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) owner;
		return fme.getFeatureURI();
	}

	/**
	 * Reads the version from the versioncache
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object owner, Map mergeMap,
			SessionImplementor session) throws HibernateException {
		return get(owner);
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

	/** Returns Integer.class */
	@SuppressWarnings("rawtypes")
	public Class getReturnType() {
		return String.class;
	}

	/** Sets the version in the internal version cache */
	public void set(Object target, Object value,
			SessionFactoryImplementor factory) throws HibernateException {
		if (!(target instanceof HibernateFeatureMapEntry)) {
			// do nothing as value has not change...
			return;
		}
		final HibernateFeatureMapEntry fme = (HibernateFeatureMapEntry) target;
		fme.setEStructuralFeature((String) value);
	}
}