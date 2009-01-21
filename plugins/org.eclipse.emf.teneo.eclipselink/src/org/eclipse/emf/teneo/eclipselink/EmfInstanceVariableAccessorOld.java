/*******************************************************************************
 * Copyright (c) 2008 Oracle and Geensys.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Oracle and Geensys - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.teneo.eclipselink;

import java.lang.reflect.Field;

import org.eclipse.persistence.exceptions.DescriptorException;
import org.eclipse.persistence.internal.descriptors.InstanceVariableAttributeAccessor;
import org.eclipse.persistence.internal.helper.Helper;

public class EmfInstanceVariableAccessorOld extends InstanceVariableAttributeAccessor {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;
	protected Field isSetEField;

	public EmfInstanceVariableAccessorOld(InstanceVariableAttributeAccessor instanceVarAccessor) {
		super();
		setAttributeName(instanceVarAccessor.getAttributeName());
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.persistence.internal.descriptors.InstanceVariableAttributeAccessor#initializeAttributes(java.lang
	 * .Class)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void initializeAttributes(Class theJavaClass) throws DescriptorException {
		super.initializeAttributes(theJavaClass);
		String isSetEFieldName = getAttributeName() + "ESet";
		try {
			isSetEField = Helper.getField(theJavaClass, isSetEFieldName);
		} catch (NoSuchFieldException e) {
			isSetEField = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.persistence.internal.descriptors.InstanceVariableAttributeAccessor#setAttributeValueInObject(java
	 * .lang.Object, java.lang.Object)
	 */
	@Override
	public void setAttributeValueInObject(Object anObject, Object value) throws DescriptorException {
		super.setAttributeValueInObject(anObject, value);
		if (isSetEField != null) {
			Utils.setAttributeValueInObject(anObject, Boolean.TRUE, isSetEField);
		}
	}
}
