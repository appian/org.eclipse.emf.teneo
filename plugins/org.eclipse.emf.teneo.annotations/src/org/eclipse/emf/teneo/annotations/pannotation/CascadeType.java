/**
 * <copyright>
 * </copyright>
 *
 * $Id: CascadeType.java,v 1.5.2.1 2007/02/11 20:44:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Cascade Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getCascadeType()
 * @model
 * @generated
 */
public final class CascadeType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL = 0;

	/**
	 * The '<em><b>PERSIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PERSIST</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSIST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSIST = 1;

	/**
	 * The '<em><b>MERGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MERGE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MERGE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGE = 2;

	/**
	 * The '<em><b>REMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE = 3;

	/**
	 * The '<em><b>REFRESH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFRESH</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFRESH_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFRESH = 4;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 5;

	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #ALL
	 * @generated
	 * @ordered
	 */
	public static final CascadeType ALL_LITERAL = new CascadeType(ALL, "ALL", "ALL");

	/**
	 * The '<em><b>PERSIST</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PERSIST
	 * @generated
	 * @ordered
	 */
	public static final CascadeType PERSIST_LITERAL = new CascadeType(PERSIST, "PERSIST", "PERSIST");

	/**
	 * The '<em><b>MERGE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #MERGE
	 * @generated
	 * @ordered
	 */
	public static final CascadeType MERGE_LITERAL = new CascadeType(MERGE, "MERGE", "MERGE");

	/**
	 * The '<em><b>REMOVE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #REMOVE
	 * @generated
	 * @ordered
	 */
	public static final CascadeType REMOVE_LITERAL = new CascadeType(REMOVE, "REMOVE", "REMOVE");

	/**
	 * The '<em><b>REFRESH</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #REFRESH
	 * @generated
	 * @ordered
	 */
	public static final CascadeType REFRESH_LITERAL = new CascadeType(REFRESH, "REFRESH", "REFRESH");

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final CascadeType NONE_LITERAL = new CascadeType(NONE, "NONE", "NONE");

	/**
	 * An array of all the '<em><b>Cascade Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final CascadeType[] VALUES_ARRAY =
		new CascadeType[] {
			ALL_LITERAL,
			PERSIST_LITERAL,
			MERGE_LITERAL,
			REMOVE_LITERAL,
			REFRESH_LITERAL,
			NONE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cascade Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cascade Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static CascadeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CascadeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cascade Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CascadeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CascadeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cascade Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static CascadeType get(int value) {
		switch (value) {
			case ALL: return ALL_LITERAL;
			case PERSIST: return PERSIST_LITERAL;
			case MERGE: return MERGE_LITERAL;
			case REMOVE: return REMOVE_LITERAL;
			case REFRESH: return REFRESH_LITERAL;
			case NONE: return NONE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CascadeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} // CascadeType
