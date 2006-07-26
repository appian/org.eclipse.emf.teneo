/**
 * <copyright>
 * </copyright>
 *
 * $Id: FetchType.java,v 1.4 2006/07/26 12:43:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Fetch Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getFetchType()
 * @model
 * @generated
 */
public final class FetchType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The '<em><b>LAZY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAZY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAZY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAZY = 0;

	/**
	 * The '<em><b>EAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EAGER</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EAGER = 1;

	/**
	 * The '<em><b>LAZY</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LAZY
	 * @generated
	 * @ordered
	 */
	public static final FetchType LAZY_LITERAL = new FetchType(LAZY, "LAZY", "LAZY");

	/**
	 * The '<em><b>EAGER</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #EAGER
	 * @generated
	 * @ordered
	 */
	public static final FetchType EAGER_LITERAL = new FetchType(EAGER, "EAGER", "EAGER");

	/**
	 * An array of all the '<em><b>Fetch Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final FetchType[] VALUES_ARRAY =
		new FetchType[] {
			LAZY_LITERAL,
			EAGER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Fetch Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fetch Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static FetchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fetch Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fetch Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static FetchType get(int value) {
		switch (value) {
			case LAZY: return LAZY_LITERAL;
			case EAGER: return EAGER_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FetchType(int value, String name, String literal) {
		super(value, name, literal);
	}

} // FetchType
