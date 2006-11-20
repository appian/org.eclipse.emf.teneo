/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbFetchType.java,v 1.1 2006/11/20 08:18:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hb Fetch Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getHbFetchType()
 * @model
 * @generated
 */
public final class HbFetchType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The '<em><b>JOIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOIN = 0;

	/**
	 * The '<em><b>SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT = 1;

	/**
	 * The '<em><b>SUBSELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBSELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSELECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSELECT = 2;

	/**
	 * The '<em><b>JOIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @generated
	 * @ordered
	 */
	public static final HbFetchType JOIN_LITERAL = new HbFetchType(JOIN, "JOIN", "JOIN");

	/**
	 * The '<em><b>SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @generated
	 * @ordered
	 */
	public static final HbFetchType SELECT_LITERAL = new HbFetchType(SELECT, "SELECT", "SELECT");

	/**
	 * The '<em><b>SUBSELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSELECT
	 * @generated
	 * @ordered
	 */
	public static final HbFetchType SUBSELECT_LITERAL = new HbFetchType(SUBSELECT, "SUBSELECT", "SUBSELECT");

	/**
	 * An array of all the '<em><b>Hb Fetch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HbFetchType[] VALUES_ARRAY =
		new HbFetchType[] {
			JOIN_LITERAL,
			SELECT_LITERAL,
			SUBSELECT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Hb Fetch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hb Fetch Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbFetchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HbFetchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hb Fetch Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbFetchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HbFetchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hb Fetch Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbFetchType get(int value) {
		switch (value) {
			case JOIN: return JOIN_LITERAL;
			case SELECT: return SELECT_LITERAL;
			case SUBSELECT: return SUBSELECT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HbFetchType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //HbFetchType
