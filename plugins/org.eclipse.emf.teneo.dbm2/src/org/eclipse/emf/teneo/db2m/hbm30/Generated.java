/**
 * <copyright>
 * </copyright>
 *
 * $Id: Generated.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generated</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getGenerated()
 * @model extendedMetaData="name='generated'"
 * @generated
 */
public enum Generated implements Enumerator {
	/**
	 * The '<em><b>Never</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(0, "never", "never"),

	/**
	 * The '<em><b>Insert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(1, "insert", "insert"),

	/**
	 * The '<em><b>Always</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(2, "always", "always");

	/**
	 * The '<em><b>Never</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Never</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model name="never"
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 0;

	/**
	 * The '<em><b>Insert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insert</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model name="insert"
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 1;

	/**
	 * The '<em><b>Always</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @model name="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Generated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Generated[] VALUES_ARRAY =
		new Generated[] {
			NEVER,
			INSERT,
			ALWAYS,
		};

	/**
	 * A public read-only list of all the '<em><b>Generated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Generated> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generated</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Generated get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Generated result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generated</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Generated getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Generated result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generated</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Generated get(int value) {
		switch (value) {
			case NEVER_VALUE: return NEVER;
			case INSERT_VALUE: return INSERT;
			case ALWAYS_VALUE: return ALWAYS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Generated(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Generated
