/**
 * <copyright>
 * </copyright>
 *
 * $Id: TemporalType.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Temporal Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getTemporalType()
 * @model
 * @generated
 */
public final class TemporalType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The '<em><b>DATE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 0;

	/**
	 * The '<em><b>TIME</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TIME_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 1;

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TIMESTAMP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP = 2;

	/**
	 * The '<em><b>DATE</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	public static final TemporalType DATE_LITERAL = new TemporalType(DATE, "DATE");

	/**
	 * The '<em><b>TIME</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final TemporalType TIME_LITERAL = new TemporalType(TIME, "TIME");

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TIMESTAMP
	 * @generated
	 * @ordered
	 */
	public static final TemporalType TIMESTAMP_LITERAL = new TemporalType(TIMESTAMP, "TIMESTAMP");

	/**
	 * An array of all the '<em><b>Temporal Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final TemporalType[] VALUES_ARRAY = new TemporalType[] { DATE_LITERAL, TIME_LITERAL,
			TIMESTAMP_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Temporal Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Temporal Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static TemporalType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TemporalType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Temporal Type</b></em>' literal with the specified value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static TemporalType get(int value) {
		switch (value) {
		case DATE:
			return DATE_LITERAL;
		case TIME:
			return TIME_LITERAL;
		case TIMESTAMP:
			return TIMESTAMP_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private TemporalType(int value, String name) {
		super(value, name);
	}

} // TemporalType
