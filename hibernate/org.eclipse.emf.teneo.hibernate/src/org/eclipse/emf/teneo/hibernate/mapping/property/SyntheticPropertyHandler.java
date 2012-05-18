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
 * $Id: SyntheticPropertyHandler.java,v 1.5 2010/11/11 10:28:19 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.property;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.teneo.type.PersistentStoreAdapter;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.HibernateException;
import org.hibernate.PropertyNotFoundException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.property.Setter;

/**
 * Is a getter and setter for EMF eattribute which uses eGet and eSet.Handles
 * many==false properties.
 * 
 * This class implements both the getter, setter and propertyaccessor
 * interfaces. When the getGetter and getSetter methods are called it returns
 * itself.
 * 
 * This accessor also handles arrays of primitive types.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class SyntheticPropertyHandler implements Getter, Setter,
		PropertyAccessor {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = 8953817672640618007L;

	// private static Log log =
	// LogFactory.getLog(SyntheticPropertyHandler.class);

	private String propertyName;

	/** Constructor */
	public SyntheticPropertyHandler(String propertyName) {
		this.propertyName = propertyName;
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
		final PersistentStoreAdapter adapter = StoreUtil
				.getPersistentStoreAdapter((EObject) owner);
		return adapter.getSyntheticProperty(propertyName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Getter#getForInsert(java.lang.Object,
	 * java.util.Map, org.hibernate.engine.SessionImplementor)
	 */
	@SuppressWarnings("rawtypes")
	public Object getForInsert(Object arg0, Map arg1, SessionImplementor arg2)
			throws HibernateException {
		return get(arg0);
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
		return Object.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object,
	 * java.lang.Object, org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value,
			SessionFactoryImplementor factory) throws HibernateException {
		final PersistentStoreAdapter adapter = StoreUtil
				.getPersistentStoreAdapter((EObject) target);
		adapter.setSyntheticProperty(propertyName, value);
	}
}