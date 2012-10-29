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
 * $Id: EContainerPropertyHandler.java,v 1.10 2010/11/11 10:28:18 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.econtainer;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.teneo.extension.ExtensionPoint;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.util.AssertUtil;
import org.eclipse.emf.teneo.util.FieldUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.property.Getter;
import org.hibernate.property.Setter;

/**
 * Implements the accessor for eContainer member
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.10 $
 */

public class EContainerPropertyHandler implements Getter, Setter, ExtensionPoint {
	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = -414024662032391298L;

	/** The logger */
	private static Log log = LogFactory.getLog(EContainerPropertyHandler.class);

	/** The javafield of the eContainer */
	private Field ecField;

	/** Constructor */
	public void initialize(String field) {
		if (log.isDebugEnabled()) {
			log.debug("Created eContainer property handler");
		}
		ecField = FieldUtil.getField(EObjectImpl.class, "eContainer");
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
	 * @see org.hibernate.property.Getter#get(java.lang.Object)
	 */
	public Object get(Object owner) throws HibernateException {
		return ((EObject) owner).eContainer();
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
		return ((EObject) owner).eContainer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.property.Setter#set(java.lang.Object, java.lang.Object,
	 * org.hibernate.engine.SessionFactoryImplementor)
	 */
	public void set(Object target, Object value, SessionFactoryImplementor factory)
			throws HibernateException {
		if (target instanceof MinimalEObjectImpl) {
			// TODO: externalize this
			FieldUtil.callMethod(target, "eBasicSetContainer", new Object[] { value });
		} else {
			AssertUtil.assertInstanceOfNotNull(target, InternalEObject.class);
			AssertUtil.assertInstanceOf(value, EObject.class);
			try {
				ecField.set(target, value);
			} catch (Exception e) {
				throw new HbMapperException("Exception when setting econtainer for: "
						+ target.getClass().getName() + " to value: " + value, e);
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
	public Class<?> getReturnType() {
		return EObject.class;
	}
}