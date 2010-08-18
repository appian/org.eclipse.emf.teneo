/**
 * <copyright>
 * </copyright>
 *
 * $Id: FetchJoinSelect.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fetch Join Select</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getFetchJoinSelect()
 * @model extendedMetaData="name='fetch_join_select'"
 * @generated
 */
public enum FetchJoinSelect implements Enumerator {
	/**
	 * The '<em><b>Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN(0, "join", "join"),

	/**
	 * The '<em><b>Select</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT(1, "select", "select");

	/**
	 * The '<em><b>Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN
	 * @model name="join"
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_VALUE = 0;

	/**
	 * The '<em><b>Select</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Select</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @model name="select"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Fetch Join Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FetchJoinSelect[] VALUES_ARRAY =
		new FetchJoinSelect[] {
			JOIN,
			SELECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Fetch Join Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FetchJoinSelect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fetch Join Select</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetchJoinSelect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetchJoinSelect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fetch Join Select</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetchJoinSelect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FetchJoinSelect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fetch Join Select</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FetchJoinSelect get(int value) {
		switch (value) {
			case JOIN_VALUE: return JOIN;
			case SELECT_VALUE: return SELECT;
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
	private FetchJoinSelect(int value, String name, String literal) {
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
	
} //FetchJoinSelect
