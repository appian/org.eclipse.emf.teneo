/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalCarSize.java,v 1.2 2008/08/11 21:54:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Car Size</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalCarSize()
 * @model extendedMetaData="name='RentalCarSize'"
 * @generated
 */
public enum RentalCarSize implements Enumerator {
	/**
	 * The '<em><b>Small</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL(0, "Small", "Small"),

	/**
	 * The '<em><b>Medium</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(1, "Medium", "Medium"),

	/**
	 * The '<em><b>Family</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #FAMILY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY(2, "Family", "Family");

	/**
	 * The '<em><b>Small</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Small</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #SMALL
	 * @model name="Small"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_VALUE = 0;

	/**
	 * The '<em><b>Medium</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MEDIUM
	 * @model name="Medium"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 1;

	/**
	 * The '<em><b>Family</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #FAMILY
	 * @model name="Family"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Car Size</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final RentalCarSize[] VALUES_ARRAY = new RentalCarSize[] { SMALL, MEDIUM, FAMILY, };

	/**
	 * A public read-only list of all the '<em><b>Car Size</b></em>' enumerators. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<RentalCarSize> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Car Size</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalCarSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RentalCarSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Car Size</b></em>' literal with the specified name. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalCarSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RentalCarSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Car Size</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalCarSize get(int value) {
		switch (value) {
		case SMALL_VALUE:
			return SMALL;
		case MEDIUM_VALUE:
			return MEDIUM;
		case FAMILY_VALUE:
			return FAMILY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private RentalCarSize(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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

} // RentalCarSize
