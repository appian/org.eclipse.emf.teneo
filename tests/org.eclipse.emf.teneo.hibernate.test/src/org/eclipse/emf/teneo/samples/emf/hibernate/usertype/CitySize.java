/**
 * <copyright>
 * </copyright>
 *
 * $Id: CitySize.java,v 1.3 2010/02/06 20:50:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>City Size</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getCitySize()
 * @model
 * @generated
 */
public enum CitySize implements Enumerator {
	/**
	 * The '<em><b>SMALL</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL(0, "SMALL", "SMALL"),
	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(1, "MEDIUM", "MEDIUM"),
	/**
	 * The '<em><b>LARGE</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LARGE_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE(2, "LARGE", "LARGE");
	/**
	 * The '<em><b>SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALL</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_VALUE = 0;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 1;

	/**
	 * The '<em><b>LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LARGE</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>City Size</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final CitySize[] VALUES_ARRAY = new CitySize[] {
			SMALL,
			MEDIUM,
			LARGE,
		};

	/**
	 * A public read-only list of all the '<em><b>City Size</b></em>' enumerators.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public static final List<CitySize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>City Size</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CitySize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CitySize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>City Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static CitySize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CitySize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>City Size</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static CitySize get(int value) {
		switch (value) {
			case SMALL_VALUE: return SMALL;
			case MEDIUM_VALUE: return MEDIUM;
			case LARGE_VALUE: return LARGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private CitySize(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
