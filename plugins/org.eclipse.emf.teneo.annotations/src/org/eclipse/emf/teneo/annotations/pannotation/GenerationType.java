/**
 * <copyright>
 * </copyright>
 *
 * $Id: GenerationType.java,v 1.2 2006/07/04 21:56:28 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Generation Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getGenerationType()
 * @model
 * @generated
 */
public final class GenerationType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The '<em><b>TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE = 0;

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQUENCE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE = 1;

	/**
	 * The '<em><b>IDENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDENTITY</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY = 2;

	/**
	 * The '<em><b>AUTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO = 3;

	/**
	 * The '<em><b>TABLE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #TABLE
	 * @generated
	 * @ordered
	 */
	public static final GenerationType TABLE_LITERAL = new GenerationType(TABLE, "TABLE");

	/**
	 * The '<em><b>SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #SEQUENCE
	 * @generated
	 * @ordered
	 */
	public static final GenerationType SEQUENCE_LITERAL = new GenerationType(SEQUENCE, "SEQUENCE");

	/**
	 * The '<em><b>IDENTITY</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #IDENTITY
	 * @generated
	 * @ordered
	 */
	public static final GenerationType IDENTITY_LITERAL = new GenerationType(IDENTITY, "IDENTITY");

	/**
	 * The '<em><b>AUTO</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #AUTO
	 * @generated
	 * @ordered
	 */
	public static final GenerationType AUTO_LITERAL = new GenerationType(AUTO, "AUTO");

	/**
	 * An array of all the '<em><b>Generation Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final GenerationType[] VALUES_ARRAY =
		new GenerationType[] {
			TABLE_LITERAL,
			SEQUENCE_LITERAL,
			IDENTITY_LITERAL,
			AUTO_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Generation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static GenerationType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerationType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generation Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static GenerationType get(int value) {
		switch (value) {
			case TABLE: return TABLE_LITERAL;
			case SEQUENCE: return SEQUENCE_LITERAL;
			case IDENTITY: return IDENTITY_LITERAL;
			case AUTO: return AUTO_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private GenerationType(int value, String name) {
		super(value, name);
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> Changed to be compliant with EMF 2.1 <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private GenerationType(int value, String name, String literal) {
		super(value, name);
	}

} // GenerationType
