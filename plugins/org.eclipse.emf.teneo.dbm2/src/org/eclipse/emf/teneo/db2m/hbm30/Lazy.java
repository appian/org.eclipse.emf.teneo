/**
 * <copyright>
 * </copyright>
 *
 * $Id: Lazy.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lazy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getLazy()
 * @model extendedMetaData="name='lazy'"
 * @generated
 */
public enum Lazy implements Enumerator {
	/**
	 * The '<em><b>False</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	FALSE(0, "false", "false"),

	/**
	 * The '<em><b>Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	PROXY(1, "proxy", "proxy"),

	/**
	 * The '<em><b>No Proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PROXY(2, "noProxy", "no-proxy");

	/**
	 * The '<em><b>False</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>False</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FALSE
	 * @model name="false"
	 * @generated
	 * @ordered
	 */
	public static final int FALSE_VALUE = 0;

	/**
	 * The '<em><b>Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proxy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROXY
	 * @model name="proxy"
	 * @generated
	 * @ordered
	 */
	public static final int PROXY_VALUE = 1;

	/**
	 * The '<em><b>No Proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Proxy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_PROXY
	 * @model name="noProxy" literal="no-proxy"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PROXY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Lazy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Lazy[] VALUES_ARRAY =
		new Lazy[] {
			FALSE,
			PROXY,
			NO_PROXY,
		};

	/**
	 * A public read-only list of all the '<em><b>Lazy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Lazy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lazy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lazy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Lazy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lazy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lazy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Lazy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lazy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lazy get(int value) {
		switch (value) {
			case FALSE_VALUE: return FALSE;
			case PROXY_VALUE: return PROXY;
			case NO_PROXY_VALUE: return NO_PROXY;
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
	private Lazy(int value, String name, String literal) {
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
	
} //Lazy
