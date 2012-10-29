package org.eclipse.emf.teneo.hibernate.mapping.econtainer;

/**
 * <copyright>
 *
 * Copyright (c) 2009 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial api and implementation
 *   Jan Haesli - solution for equals test on feature holder
 * </copyright>
 *
 * $Id: EContainerFeatureIDUserType.java,v 1.5 2010/05/02 14:24:11 mtaal Exp $
 */

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.PackageRegistryProvider;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

/**
 * Persists an EContainerFeatureID as a varchar which contains both the EClass of the container as
 * the complete reference to the EFeature.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $ $Date: 2010/05/02 14:24:11 $
 */

public class EContainerFeatureIDUserType implements UserType {

	private static final int[] SQL_TYPES = new int[] { Types.VARCHAR };
	private static final String SEPARATOR = "_;_";

	public static String convertEContainerRelationToString(EClass eClass, EStructuralFeature eFeature) {
		StringBuilder result = new StringBuilder();
		{
			final String uri = eClass.getEPackage().getNsURI();
			final String eClassifierName = eClass.getName();
			result.append(uri + SEPARATOR + eClassifierName);
		}

		{
			final String uri = eFeature.getEContainingClass().getEPackage().getNsURI();
			final String eClassName = eFeature.getEContainingClass().getName();
			final String eFeatureName = eFeature.getName();
			result.append(SEPARATOR + uri + SEPARATOR + eClassName + SEPARATOR + eFeatureName);
		}
		return result.toString();
	}

	private EPackage.Registry registry;

	public EContainerFeatureIDUserType() {
		registry = PackageRegistryProvider.getInstance().getPackageRegistry();
	}

	public Object assemble(Serializable cached, Object owner) throws HibernateException {
		final EContainerFeatureIDHolder holder = new EContainerFeatureIDHolder();
		holder.convertFromString((String) cached, registry);
		return holder;
	}

	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	public Serializable disassemble(Object value) throws HibernateException {
		if (value == null) {
			return null;
		}
		return ((EContainerFeatureIDHolder) value).convertToString();
	}

	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == null && y == null) {
			return true;
		}

		if (x == null || y == null) {
			return false;
		}

		if (x.getClass() != y.getClass()) {
			return false;
		}
		return x.equals(y);
	}

	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	public boolean isMutable() {
		return false;
	}

	public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor sessionImplementor,
			Object owner) throws HibernateException, SQLException {
		final String value = rs.getString(names[0]);
		if (rs.wasNull()) {
			return null;
		}
		final EContainerFeatureIDHolder holder = new EContainerFeatureIDHolder();
		holder.convertFromString(value, registry);
		return holder;
	}

	public void nullSafeSet(PreparedStatement st, Object value, int index,
			SessionImplementor sessionImplementor) throws HibernateException, SQLException {
		if (value == null) {
			st.setNull(index, Types.VARCHAR);
		} else {
			st.setString(index, ((EContainerFeatureIDHolder) value).convertToString());
		}
	}

	public Object replace(Object original, Object target, Object owner) throws HibernateException {
		return original;
	}

	public Class<?> returnedClass() {
		return EStructuralFeature.class;
	}

	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	public static class EContainerFeatureIDHolder {
		private EClass eClass;
		private EStructuralFeature eFeature;

		/**
		 * @return the eFeature
		 */
		public EStructuralFeature getEFeature() {
			return eFeature;
		}

		/**
		 * @param feature
		 *          the eFeature to set
		 */
		public void setEFeature(EStructuralFeature feature) {
			eFeature = feature;
		}

		public void convertFromString(String value, EPackage.Registry theRegistry) {
			final String[] values = value.split(SEPARATOR);
			final String nsuri = values[0];
			final EPackage eContainerPackage = theRegistry.getEPackage(nsuri);
			final String eContainerEClassName = values[1];
			eClass = (EClass) eContainerPackage.getEClassifier(eContainerEClassName);

			final EPackage eFeaturePackage = theRegistry.getEPackage(values[2]);

			final String eClassifierName = values[3];
			final EClassifier eClassifier = eFeaturePackage.getEClassifier(eClassifierName);
			final EClass eClass = (EClass) eClassifier;
			final String eFeatureName = values[4];
			eFeature = eClass.getEStructuralFeature(eFeatureName);
		}

		public String convertToString() {
			return convertEContainerRelationToString(eClass, eFeature);
		}

		/**
		 * @return the eClass
		 */
		public EClass getEClass() {
			return eClass;
		}

		/**
		 * @param class1
		 *          the eClass to set
		 */
		public void setEClass(EClass class1) {
			eClass = class1;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((eClass == null) ? 0 : eClass.hashCode());
			result = prime * result + ((eFeature == null) ? 0 : eFeature.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			EContainerFeatureIDHolder other = (EContainerFeatureIDHolder) obj;
			if (eClass == null && other.eClass != null) {
				return false;
			} else if (!eClass.equals(other.eClass)) {
				return false;
			}
			if (eFeature == null && other.eFeature != null) {
				return false;
			} else if (!eFeature.equals(other.eFeature)) {
				return false;
			}
			return true;
		}
	}
}