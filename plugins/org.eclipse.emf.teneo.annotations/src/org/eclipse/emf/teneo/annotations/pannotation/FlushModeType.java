/**
 * <copyright>
 * </copyright>
 *
 * $Id: FlushModeType.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Flush Mode Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getFlushModeType()
 * @model
 * @generated
 */
public final class FlushModeType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The '<em><b>AUTO</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #AUTO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO = 0;

	/**
	 * The '<em><b>COMMIT</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMIT</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #COMMIT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMIT = 1;

	/**
	 * The '<em><b>AUTO</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #AUTO
	 * @generated
	 * @ordered
	 */
	public static final FlushModeType AUTO_LITERAL = new FlushModeType(AUTO, "AUTO");

	/**
	 * The '<em><b>COMMIT</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	private static final FlushModeType[] VALUES_ARRAY = new FlushModeType[] { AUTO_LITERAL, COMMIT_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Flush Mode Type</b></em>' enumerators. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flush Mode Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * Returns the '<em><b>Flush Mode Type</b></em>' literal with the specified value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static FlushModeType get(int value) {
		switch (value) {
		case AUTO:
			return AUTO_LITERAL;
		case COMMIT:
			return COMMIT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
