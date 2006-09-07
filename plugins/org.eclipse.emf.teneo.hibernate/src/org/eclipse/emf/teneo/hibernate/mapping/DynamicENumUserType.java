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
 * $Id: DynamicENumUserType.java,v 1.1 2006/09/07 22:27:50 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;

/**
 * Implements the EMF UserType for an Enum
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $ $Date: 2006/09/07 22:27:50 $
 */

public class DynamicENumUserType implements UserType, ParameterizedType {
	/** The expected parameter name which contains the enum class name */
	public static final String EPACKAGE_PARAM = "epackage";
	public static final String ECLASSIFIER_PARAM = "eclassifier";

	/** The sql types used for enums */
	private static final int[] SQL_TYPES = new int[] { Types.VARCHAR };

	/** The enum type we are handling here */
	protected EEnum enumInstance;

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
		assert (x instanceof EEnumLiteral);
		return ((EEnumLiteral) x).getValue() == ((EEnumLiteral) y).getValue();
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

		enumValue = enumInstance.getEEnumLiteralByLiteral(name);
		localCache.put(name, enumValue);
		return enumValue;
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
			st.setString(index, ((EEnumLiteral) value).getName());
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
		return enumInstance.getClass();
	}

	/** An enum is stored in one varchar */
	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	/** Sets the enumclass */
	public void setParameterValues(Properties parameters) {
		final String epackUri = parameters.getProperty(EPACKAGE_PARAM);
		final String eclassifier = parameters.getProperty(ECLASSIFIER_PARAM);
		final EPackage epack = EPackage.Registry.INSTANCE.getEPackage(epackUri);
		enumInstance = (EEnum)epack.getEClassifier(eclassifier);
	}
}