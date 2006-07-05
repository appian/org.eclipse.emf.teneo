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
 * $Id: ENumUserIntegerType.java,v 1.1 2006/07/05 22:29:31 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.emf.common.util.AbstractEnumerator;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.teneo.classloader.ClassLoaderResolver;
import org.eclipse.emf.teneo.classloader.StoreClassLoadException;
import org.eclipse.emf.teneo.hibernate.HbStoreException;
import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;

/**
 * Implements the EMF UserType for an Enum
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/07/05 22:29:31 $
 */

public class ENumUserIntegerType implements UserType, ParameterizedType {
	/** The expected parameter name which contains the enum class name */
	public static final String ENUM_CLASS_PARAM = "enumClass";

	/** The sql types used for enums */
	private static final int[] SQL_TYPES = new int[] { Types.INTEGER };

	/** The enum type we are handling here */
	private Class enumType;

	/** The method which translates a string to an instance of the emf enum */
	private Method getMethod;

	/** Hashmap with string to enum mappings */
	private final HashMap localCache = new HashMap();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#assemble(java.io.Serializable, java.lang.Object)
	 */
	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		return cached;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#deepCopy(java.lang.Object)
	 */
	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#disassemble(java.lang.Object)
	 */
	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) value;
	}

	/** Compares the int values of the enumerates */
	public boolean equals(Object x, Object y) throws HibernateException {
		// todo: check compare on null values
		if (x == null && y == null)
			return true;

		if (x == null || y == null)
			return false;

		if (x.getClass() != y.getClass())
			return false;
		assert (x instanceof AbstractEnumerator);
		return ((AbstractEnumerator) x).getValue() == ((AbstractEnumerator) y).getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#hashCode(java.lang.Object)
	 */
	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	/** Not mutable */
	public boolean isMutable() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#nullSafeGet(java.sql.ResultSet, java.lang.String[], java.lang.Object)
	 */
	public Object nullSafeGet(ResultSet rs, String[] names, Object owner) throws HibernateException, SQLException {
		final int value = rs.getInt(names[0]);
		if (rs.wasNull())
			return null;

		Integer objValue = new Integer(value);
		Enumerator enumValue = (Enumerator) localCache.get(objValue);
		if (enumValue != null)
			return enumValue;

		// call the getMethod!
		try {
			// use non
			enumValue = (Enumerator) getMethod.invoke(null, new Object[] { objValue });
			localCache.put(objValue, enumValue);
			return enumValue;
		} catch (Exception e) {
			throw new HbStoreException("Exception when getting enum for class: " + enumType.getName()
					+ " using int value: " + value, e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#nullSafeSet(java.sql.PreparedStatement, java.lang.Object, int)
	 */
	public void nullSafeSet(PreparedStatement st, Object value, int index) throws HibernateException, SQLException {
		if (value == null) {
			st.setNull(index, Types.INTEGER);
		} else {
			st.setInt(index, ((AbstractEnumerator) value).getValue());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#replace(java.lang.Object, java.lang.Object, java.lang.Object)
	 */
	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	/** Returns the parameterizezd enumType */
	public Class returnedClass() {
		return enumType;
	}

	/** An enum is stored in one varchar */
	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	/** Sets the enumclass */
	public void setParameterValues(Properties parameters) {
		final String enumClassName = parameters.getProperty(ENUM_CLASS_PARAM);
		try {
			enumType = ClassLoaderResolver.classForName(enumClassName);
			getMethod = enumType.getMethod("get", new Class[] { int.class });
		} catch (StoreClassLoadException e) {
			throw new HbStoreException("Enum class " + enumClassName + " can not be found", e);
		} catch (NoSuchMethodException e) {
			throw new HbStoreException("Get method not present in enum class " + enumClassName, e);
		}
	}
}