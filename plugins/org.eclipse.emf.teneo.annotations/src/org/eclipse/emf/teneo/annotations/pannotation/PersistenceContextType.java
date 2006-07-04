/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceContextType.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Persistence Context Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPersistenceContextType()
 * @model
 * @generated
 */
public final class PersistenceContextType extends AbstractEnumerator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The '<em><b>TRANSACTION</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #TRANSACTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION = 0;

	/**
	 * The '<em><b>EXTENDED</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTENDED</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #EXTENDED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTENDED = 1;

	/**
	 * The '<em><b>TRANSACTION</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #TRANSACTION
	 * @generated
	 * @ordered
	 */
	public static final PersistenceContextType TRANSACTION_LITERAL = new PersistenceContextType(TRANSACTION,
			"TRANSACTION");

	/**
	 * The '<em><b>EXTENDED</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #EXTENDED
	 * @generated
	 * @ordered
	 */
	public static final PersistenceContextType EXTENDED_LITERAL = new PersistenceContextType(EXTENDED, "EXTENDED");

	/**
	 * An array of all the '<em><b>Persistence Context Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final PersistenceContextType[] VALUES_ARRAY = new PersistenceContextType[] { TRANSACTION_LITERAL,
			EXTENDED_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>Persistence Context Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Persistence Context Type</b></em>' literal with the specified name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PersistenceContextType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PersistenceContextType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Persistence Context Type</b></em>' literal with the specified value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static PersistenceContextType get(int value) {
		switch (value) {
		case TRANSACTION:
			return TRANSACTION_LITERAL;
		case EXTENDED:
			return EXTENDED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private PersistenceContextType(int value, String name) {
		super(value, name);
	}

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> Changed to be compliant with EMF 2.1 <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	private PersistenceContextType(int value, String name, String literal) {
		super(value, name);
	}

} // PersistenceContextType
