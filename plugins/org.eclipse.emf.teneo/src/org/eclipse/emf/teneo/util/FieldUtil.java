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
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: FieldUtil.java,v 1.9 2007/02/08 23:14:41 mtaal Exp $
 */

package org.eclipse.emf.teneo.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.eclipse.emf.teneo.StoreException;

/**
 * Contains different util methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */

public class FieldUtil {
	/** The hashtable caches clazz field name combinations */
	private static final Hashtable<String, Object> fieldMethodCache = new Hashtable<String, Object>();

	/** Sets a field and wraps the exceptions */
	public static Object callMethod(Object obj, String methodName,
			Object[] params) {
		Method method = (Method) fieldMethodCache.get(obj.getClass().getName()
				+ "." + methodName);

		try {
			if (method == null) {
				method = getMethodInternal(obj.getClass(), methodName);
			}
			if (method != null) {
				fieldMethodCache.put(obj.getClass().getName() + "."
						+ methodName, method);
			} else {
				throw new StoreException("Method does not exist "
						+ obj.getClass().getName() + " method; "
						+ method.getName());
			}

			return method.invoke(obj, params);
		} catch (Exception e) {
			throw new StoreException("Exception " + obj.getClass().getName()
					+ " method; " + method.getName(), e);
		}
	}

	/** Sets a field and wraps the exceptions */
	public static void setField(Field field, Object obj, Object value) {
		try {
			field.set(obj, value);
		} catch (IllegalAccessException e) {
			throw new StoreException("IllegalAccessException "
					+ obj.getClass().getName() + " field; " + field.getName());
		}
	}

	/**
	 * Get the value for a field, first the field is accessed directly if not
	 * found then the getter is called.
	 */
	public static Object callGetter(Object target, String fieldName) {
		try {
			// no method try a field
			final Field field = getField(target.getClass(), fieldName);
			if (field == null) {
				Method method = getMethodInternal(target.getClass(), "get"
						+ fieldName);
				if (method == null) {
					method = getMethodInternal(target.getClass(), "is"
							+ fieldName);
				}
				return callMethod(target, method.getName(), new Object[0]);
			}
			return field.get(target);
		} catch (Exception e) {
			throw new StoreException("Exception getting " + fieldName
					+ " from " + target.getClass().getName(), e);
		}
	}

	/** Set the field directly or through the set method */
	public static void callSetter(Object target, String fieldName, Object value) {
		try {
			final Field field = getField(target.getClass(), fieldName);
			if (field == null) {
				callMethod(target, "set" + fieldName, new Object[] { value });
				return;
			}
			field.set(target, value);
		} catch (Exception e) {
			throw new StoreException("Exception setting " + fieldName
					+ " from " + target.getClass().getName(), e);
		}
	}

	/**
	 * Returns a field using a certain name, walks up the class hierarchy to
	 * find the field, will make the field accessible also. Is a bit rough
	 * because it does a case insensitive search. Note if the field is not found
	 * an exception is thrown.
	 */
	public static Field getField(Class<?> clazz, String fieldName) {
		Field field = (Field) fieldMethodCache.get(clazz.getName() + "."
				+ fieldName);

		if (field != null)
			return field;

		try {
			field = getFieldInternal(clazz, fieldName);
			if (field == null) {
				field = getFieldInternal(clazz, fieldName + "_"); // the way
																	// emf
																	// escapes
																	// fields
			}
		} catch (Exception e) // todo replace with specific exception
		{
			throw new StoreException("Field " + fieldName
					+ " not accessible for class: " + clazz.getName(), e);
		}
		if (field == null) {
			throw new StoreException("Field " + fieldName
					+ " not found in class: " + clazz.getName());
		}

		fieldMethodCache.put(clazz.getName() + "." + fieldName, field);
		return field;
	}

	/** Does the actual search for the field */
	private static Field getFieldInternal(Class<?> clazz, String fieldName)
			throws Exception {
		if (clazz == null) {
			return null;
		}

		final Field[] fields = clazz.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getName().compareToIgnoreCase(fieldName) == 0) {
				fields[i].setAccessible(true);
				return fields[i];
			}
		}

		return getFieldInternal(clazz.getSuperclass(), fieldName);
	}

	/** Does the actual search for the method */
	private static Method getMethodInternal(Class<?> clazz, String methodName)
			throws Exception {
		if (clazz == null) {
			return null;
		}

		final Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().compareToIgnoreCase(methodName) == 0) {
				methods[i].setAccessible(true);
				return methods[i];
			}
		}

		return getMethodInternal(clazz.getSuperclass(), methodName);
	}
}