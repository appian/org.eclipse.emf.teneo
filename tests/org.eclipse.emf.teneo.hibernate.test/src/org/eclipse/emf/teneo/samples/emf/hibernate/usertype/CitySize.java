/**
 * <copyright>
 * </copyright>
 *
 * $Id: CitySize.java,v 1.1.2.1 2009/06/11 04:50:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>City Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#getCitySize()
 * @model
 * @generated
 */
public final class CitySize extends AbstractEnumerator {
	/**
	 * The '<em><b>SMALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL = 0;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM = 1;

	/**
	 * The '<em><b>LARGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LARGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LARGE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGE = 2;

	/**
	 * The '<em><b>SMALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL
	 * @generated
	 * @ordered
	 */
	public static final CitySize SMALL_LITERAL = new CitySize(SMALL, "SMALL", "SMALL");

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @generated
	 * @ordered
	 */
	public static final CitySize MEDIUM_LITERAL = new CitySize(MEDIUM, "MEDIUM", "MEDIUM");

	/**
	 * The '<em><b>LARGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE
	 * @generated
	 * @ordered
	 */
	public static final CitySize LARGE_LITERAL = new CitySize(LARGE, "LARGE", "LARGE");

	/**
	 * An array of all the '<em><b>City Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CitySize[] VALUES_ARRAY =
		new CitySize[] {
			SMALL_LITERAL,
			MEDIUM_LITERAL,
			LARGE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>City Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>City Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * Returns the '<em><b>City Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CitySize get(int value) {
		switch (value) {
			case SMALL: return SMALL_LITERAL;
			case MEDIUM: return MEDIUM_LITERAL;
			case LARGE: return LARGE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CitySize(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CitySize
