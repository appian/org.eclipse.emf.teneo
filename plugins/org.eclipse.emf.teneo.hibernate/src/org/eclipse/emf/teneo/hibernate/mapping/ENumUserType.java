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
 * $Id: ENumUserType.java,v 1.5 2007/02/01 12:34:14 mtaal Exp $
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
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;

/**
 * Implements the EMF UserType for an Enum
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ $Date: 2007/02/01 12:34:14 $
 */

public class ENumUserType implements UserType, ParameterizedType {

	/** The sql types used for enums */
	private static final int[] SQL_TYPES = new int[] { Types.VARCHAR };

	/** The enum type we are handling here */
	protected Class enumType;

	/** The method which translates a string to an instance of the emf enum */
	protected Method getMethod;

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
		final String name = rs.getString(names[0]);
		if (rs.wasNull())
			return null;

		Enumerator enumValue = (Enumerator) localCache.get(name);
		if (enumValue != null)
			return enumValue;

		// call the getMethod!
		try {
			enumValue = (Enumerator) getMethod.invoke(null, new Object[] { name });
			localCache.put(name, enumValue);
			return enumValue;
		} catch (Exception e) {
			throw new HbMapperException("Exception when getting enum for class: " + enumType.getName()
					+ " using value: " + name, e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.usertype.UserType#nullSafeSet(java.sql.PreparedStatement, java.lang.Object, int)
	 */
	public void nullSafeSet(PreparedStatement st, Object value, int index) throws HibernateException, SQLException {
		if (value == null) {
			st.setNull(index, Types.VARCHAR);
		} else {
			st.setString(index, ((AbstractEnumerator) value).getLiteral());
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
		final String enumClassName = parameters.getProperty(HbMapperConstants.ENUM_CLASS_PARAM);
		try {
			enumType = ClassLoaderResolver.classForName(enumClassName);
			getMethod = enumType.getMethod("get", new Class[] { String.class });
		} catch (StoreClassLoadException e) {
			throw new HbMapperException("Enum class " + enumClassName + " can not be found", e);
		} catch (NoSuchMethodException e) {
			throw new HbMapperException("Get method not present in enum class " + enumClassName, e);
		}
	}
}