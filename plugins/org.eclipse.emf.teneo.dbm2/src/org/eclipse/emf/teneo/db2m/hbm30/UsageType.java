/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsageType.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Usage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getUsageType()
 * @model extendedMetaData="name='usage_._type'"
 * @generated
 */
public enum UsageType implements Enumerator {
	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(0, "readOnly", "read-only"),

	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE(1, "readWrite", "read-write"),

	/**
	 * The '<em><b>Nonstrict Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSTRICT_READ_WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	NONSTRICT_READ_WRITE(2, "nonstrictReadWrite", "nonstrict-read-write"),

	/**
	 * The '<em><b>Transactional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTIONAL(3, "transactional", "transactional");

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="readOnly" literal="read-only"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @model name="readWrite" literal="read-write"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_VALUE = 1;

	/**
	 * The '<em><b>Nonstrict Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nonstrict Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONSTRICT_READ_WRITE
	 * @model name="nonstrictReadWrite" literal="nonstrict-read-write"
	 * @generated
	 * @ordered
	 */
	public static final int NONSTRICT_READ_WRITE_VALUE = 2;

	/**
	 * The '<em><b>Transactional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transactional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTIONAL
	 * @model name="transactional"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTIONAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageType[] VALUES_ARRAY =
		new UsageType[] {
			READ_ONLY,
			READ_WRITE,
			NONSTRICT_READ_WRITE,
			TRANSACTIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UsageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType get(int value) {
		switch (value) {
			case READ_ONLY_VALUE: return READ_ONLY;
			case READ_WRITE_VALUE: return READ_WRITE;
			case NONSTRICT_READ_WRITE_VALUE: return NONSTRICT_READ_WRITE;
			case TRANSACTIONAL_VALUE: return TRANSACTIONAL;
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
	private UsageType(int value, String name, String literal) {
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
	
} //UsageType
