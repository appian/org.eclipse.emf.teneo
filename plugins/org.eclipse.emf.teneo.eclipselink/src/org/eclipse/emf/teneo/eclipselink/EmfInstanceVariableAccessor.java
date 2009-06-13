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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.persistence.exceptions.DescriptorException;
import org.eclipse.persistence.internal.descriptors.InstanceVariableAttributeAccessor;
import org.eclipse.persistence.internal.helper.Helper;
import org.eclipse.persistence.internal.jpa.metadata.accessors.objects.MetadataMethod;
import org.eclipse.persistence.internal.security.PrivilegedAccessHelper;
import org.eclipse.persistence.internal.security.PrivilegedGetMethodReturnType;
import org.eclipse.persistence.internal.security.PrivilegedGetValueFromField;
import org.eclipse.persistence.internal.security.PrivilegedMethodInvoker;
import org.eclipse.persistence.internal.security.PrivilegedSetValueInField;
import org.eclipse.persistence.mappings.AttributeAccessor;
import org.eclipse.persistence.mappings.DatabaseMapping;

/**
 * All attribute access from EclipseLink uses the getter for the getting and direct field access for the set. This
 * allows EclipseLink to leverage the lazy initialization done for instance variables (esp. collections) and yet avoid
 * firing events when setting an instance variable during object construction. EmfInstanceVariableAccessor uses
 * delegation to mix instance variable with method access.
 * 
 * @author shsmith
 */
public class EmfInstanceVariableAccessor extends AttributeAccessor {
	/**
   * 
   */
	private static final long serialVersionUID = 1L;
	protected static Set<String> nonBeanLikeAttributes;
	protected static String[] emfAttributesNames = { "eAdapters", "eContainer", "eContainerFeatureID", "eFlags", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"eProperties" }; //$NON-NLS-1$

	static {
		nonBeanLikeAttributes = new HashSet<String>();
		Collections.addAll(nonBeanLikeAttributes, emfAttributesNames);
	}

	protected Field isSetEField;
	protected String getMethodName;
	protected transient Method getMethod;

	/*
	 * Enhance direct attribute access with support for isSetE<AttrName>. Replace accessor with
	 * EmfInstanceVariableAccessor for all mapped attributes except for EMF framework define attributes.
	 */
	public static void customize(DatabaseMapping dbMapping) {
		AttributeAccessor accessor = dbMapping.getAttributeAccessor();
		// if attribute is emf framework attribute, don't set
		// the getter method--will use direct access instead
		if (nonBeanLikeAttributes.contains(dbMapping.getAttributeName())) {
			// use direct attribute access
			InstanceVariableAttributeAccessor instanceVarAccessor = new InstanceVariableAttributeAccessor();
			instanceVarAccessor.setAttributeName(accessor.getAttributeName());
			dbMapping.setAttributeAccessor(instanceVarAccessor);
		} else {
			// use direct attribute set, method get
			EmfInstanceVariableAccessor emfAttributeAccessor = new EmfInstanceVariableAccessor(accessor);
			dbMapping.setAttributeAccessor(emfAttributeAccessor);
		}
	}

	protected EmfInstanceVariableAccessor(AttributeAccessor attributeAccessor) {
		super();
		String attrName = attributeAccessor.getAttributeName();
		setAttributeName(attrName);
	}

	private String getGetterMethodName(String attrName) {
		String getterMethodName = null;
		String getterPrefix = null;

		String leadingChar = String.valueOf(attrName.charAt(0)).toUpperCase();
		String restOfName = attrName.substring(1);
		Class<?> attributeType = getAttributeField().getType();
		if (attributeType.equals(boolean.class) || attributeType.equals(Boolean.class)) {
			getterPrefix = MetadataMethod.IS_PROPERTY_METHOD_PREFIX;
		} else {
			getterPrefix = MetadataMethod.GET_PROPERTY_METHOD_PREFIX;
		}
		getterMethodName = getterPrefix.concat(leadingChar).concat(restOfName);
		return getterMethodName;
	}

	/**
	 * Return the return type of the method accessor.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Class getAttributeClass() {
		if (getGetMethod() == null) {
			return null;
		}

		return getGetMethodReturnType();
	}

	/**
	 * Gets the value of an instance variable in the object.
	 */
	@Override
	public Object getAttributeValueFromObject(Object anObject) throws DescriptorException {
		try {
			// see initializeAttributes for comment
			if (getGetMethodName() == null) {
				return getAttributeValueFromObjectUsingDirectAccess(anObject);
			} else {
				return getAttributeValueFromObjectUsingGetter(anObject);
			}
		} catch (IllegalArgumentException exception) {
			throw DescriptorException.illegalArgumentWhileGettingValueThruMethodAccessor(getGetMethodName(), anObject
					.getClass().getName(), exception);
		} catch (IllegalAccessException exception) {
			throw DescriptorException.illegalAccessWhileGettingValueThruMethodAccessor(getGetMethodName(), anObject
					.getClass().getName(), exception);
		} catch (InvocationTargetException exception) {
			throw DescriptorException.targetInvocationWhileGettingValueThruMethodAccessor(getGetMethodName(), anObject
					.getClass().getName(), exception);
		} catch (NullPointerException exception) {
			// Some JVM's throw this exception for some very odd reason
			throw DescriptorException.nullPointerWhileGettingValueThruMethodAccessor(getGetMethodName(), anObject
					.getClass().getName(), exception);
		}
	}

	@SuppressWarnings("unchecked")
	private Object getAttributeValueFromObjectUsingGetter(Object anObject) throws IllegalAccessException,
			InvocationTargetException {
		if (PrivilegedAccessHelper.shouldUsePrivilegedAccess()) {
			try {
				return AccessController.doPrivileged(new PrivilegedMethodInvoker(getGetMethod(), anObject,
						(Object[]) null));
			} catch (PrivilegedActionException exception) {
				Exception throwableException = exception.getException();
				if (throwableException instanceof IllegalAccessException) {
					throw DescriptorException.illegalAccessWhileGettingValueThruMethodAccessor(getGetMethodName(),
							anObject.getClass().getName(), throwableException);
				} else {
					throw DescriptorException.targetInvocationWhileGettingValueThruMethodAccessor(getGetMethodName(),
							anObject.getClass().getName(), throwableException);
				}
			}
		} else {
			return PrivilegedAccessHelper.invokeMethod(getGetMethod(), anObject, (Object[]) null);
		}
	}

	@SuppressWarnings("unchecked")
	private Object getAttributeValueFromObjectUsingDirectAccess(Object anObject) throws IllegalAccessException {
		if (PrivilegedAccessHelper.shouldUsePrivilegedAccess()) {
			try {
				return AccessController.doPrivileged(new PrivilegedGetValueFromField(attributeField, anObject));
			} catch (PrivilegedActionException exception) {
				throw DescriptorException.illegalAccesstWhileGettingValueThruInstanceVaraibleAccessor(
						getAttributeName(), anObject.getClass().getName(), exception.getException());
			}
		} else {
			return PrivilegedAccessHelper.getValueFromField(attributeField, anObject);
		}
	}

	/**
	 * Return the accessor method for the attribute accessor.
	 */
	protected Method getGetMethod() {
		return getMethod;
	}

	/**
	 * Return the name of theh accessor method for the attribute accessor.
	 */
	public String getGetMethodName() {
		return getMethodName;
	}

	@SuppressWarnings("unchecked")
	public Class<?> getGetMethodReturnType() {
		if (PrivilegedAccessHelper.shouldUsePrivilegedAccess()) {
			try {
				return (Class<?>) AccessController.doPrivileged(new PrivilegedGetMethodReturnType(getGetMethod()));
			} catch (PrivilegedActionException exception) {
				// we should not get here since this call does not throw any checked
				// exceptions
				return null;
			}
		} else {
			return PrivilegedAccessHelper.getMethodReturnType(getGetMethod());
		}
	}

	/**
	 * Set get and set method after creating these methods by using get and set method names
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void initializeAttributes(Class theJavaClass) throws DescriptorException {
		if (getAttributeName() == null) {
			throw DescriptorException.attributeNameNotSpecified();
		}
		try {
			setAttributeField(Helper.getField(theJavaClass, getAttributeName()));
			setGetMethodName(getGetterMethodName(getAttributeName()));
			setGetMethod(Helper.getDeclaredMethod(theJavaClass, getGetMethodName(), (Class[]) null));
		} catch (NoSuchFieldException exception) {
			throw DescriptorException.noSuchFieldWhileInitializingAttributesInInstanceVariableAccessor(
					getAttributeName(), theJavaClass.getName(), exception);
		} catch (NoSuchMethodException ex) {
			DescriptorException descriptorException = DescriptorException
					.noSuchMethodWhileInitializingAttributesInMethodAccessor("", getGetMethodName(), theJavaClass //$NON-NLS-1$
							.getName());
			descriptorException.setInternalException(ex);
			throw descriptorException;
		} catch (SecurityException exception) {
			DescriptorException descriptorException = DescriptorException
					.securityWhileInitializingAttributesInMethodAccessor("", getGetMethodName(), theJavaClass.getName()); //$NON-NLS-1$
			descriptorException.setInternalException(exception);
			throw descriptorException;
		}
	}

	@Override
	public boolean isMethodAttributeAccessor() {
		return false;
	}

	/**
	 * Set the accessor method for the attribute accessor.
	 */
	protected void setGetMethod(Method getMethod) {
		this.getMethod = getMethod;
	}

	/**
	 * Set the name of the accessor method for the attribute accessor.
	 */
	public void setGetMethodName(String getMethodName) {
		this.getMethodName = getMethodName;
	}

	/**
	 * The attribute name of an object is converted to Field type to access it reflectively
	 */
	protected transient Field attributeField;

	/**
	 * Returns the value of attributeField.
	 */
	protected Field getAttributeField() {
		return attributeField;
	}

	/**
	 * Returns the declared type of attributeField.
	 */
	public Class<?> getAttributeType() {
		return attributeField.getType();
	}

	/**
	 * Sets the value of the attributeField.
	 */
	protected void setAttributeField(Field field) {
		attributeField = field;
	}

	/**
	 * Sets the value of the instance variable in the object to the value.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void setAttributeValueInObject(Object anObject, Object value) throws DescriptorException {
		try {
			// PERF: Direct variable access.
			if (PrivilegedAccessHelper.shouldUsePrivilegedAccess()) {
				try {
					AccessController.doPrivileged(new PrivilegedSetValueInField(attributeField, anObject, value));
				} catch (PrivilegedActionException exception) {
					throw DescriptorException.nullPointerWhileSettingValueThruInstanceVariableAccessor(
							getAttributeName(), value, exception.getException());
				}
			} else {
				PrivilegedAccessHelper.setValueInField(attributeField, anObject, value);
			}
			if (value instanceof EObjectEList) {
				// need to also set owner "backpointer" in delegateEList
				EmfHelper.getInstance().setEObjectEListOwner((EObjectEList<?>) value, (InternalEObject) anObject);
			}
		} catch (IllegalAccessException accessException) {
			throw DescriptorException.nullPointerWhileSettingValueThruInstanceVariableAccessor(getAttributeName(),
					value, accessException);
		}
	}
}
