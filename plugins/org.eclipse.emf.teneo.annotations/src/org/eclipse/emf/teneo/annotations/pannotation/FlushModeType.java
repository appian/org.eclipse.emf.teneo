/**
 * <copyright>
 * </copyright>
 *
 * $Id: FlushModeType.java,v 1.2 2006/07/04 21:56:29 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Flush Mode Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getFlushModeType()
 * @model
 * @generated
 */
public final class FlushModeType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

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
	public static final int AUTO = 0;

	/**
	 * The '<em><b>COMMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMIT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMIT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMIT = 1;

	/**
	 * The '<em><b>AUTO</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #AUTO
	 * @generated
	 * @ordered
	 */
	public static final FlushModeType AUTO_LITERAL = new FlushModeType(AUTO, "AUTO");

	/**
	 * The '<em><b>COMMIT</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #COMMIT
	 * @generated
	 * @ordered
	 */
	public static final FlushModeType COMMIT_LITERAL = new FlushModeType(COMMIT, "COMMIT");

	/**
	 * An array of all the '<em><b>Flush Mode Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final FlushModeType[] VALUES_ARRAY =
		new FlushModeType[] {
			AUTO_LITERAL,
			COMMIT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Flush Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flush Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static FlushModeType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlushModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flush Mode Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static FlushModeType get(int value) {
		switch (value) {
			case AUTO: return AUTO_LITERAL;
			case COMMIT: return COMMIT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private FlushModeType(int value, String name) {
		super(value, name);
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> Changed to be compliant with EMF 2.1 <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private FlushModeType(int value, String name, String literal) {
		super(value, name);
	}

} // FlushModeType
