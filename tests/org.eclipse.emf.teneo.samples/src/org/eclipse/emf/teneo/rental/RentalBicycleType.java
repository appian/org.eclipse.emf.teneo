/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalBicycleType.java,v 1.2 2008/08/11 21:54:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Bicycle Type</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalBicycleType()
 * @model extendedMetaData="name='RentalBicycleType'"
 * @generated
 */
public enum RentalBicycleType implements Enumerator {
	/**
	 * The '<em><b>Standard</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(0, "Standard", "Standard"),

	/**
	 * The '<em><b>Mountain Bike</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #MOUNTAIN_BIKE_VALUE
	 * @generated
	 * @ordered
	 */
	MOUNTAIN_BIKE(1, "MountainBike", "MountainBike");

	/**
	 * The '<em><b>Standard</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard</b></em>' literal object isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #STANDARD
	 * @model name="Standard"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 0;

	/**
	 * The '<em><b>Mountain Bike</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mountain Bike</b></em>' literal object isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #MOUNTAIN_BIKE
	 * @model name="MountainBike"
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTAIN_BIKE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Bicycle Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private static final RentalBicycleType[] VALUES_ARRAY = new RentalBicycleType[] { STANDARD,
			MOUNTAIN_BIKE, };

	/**
	 * A public read-only list of all the '<em><b>Bicycle Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<RentalBicycleType> VALUES = Collections.unmodifiableList(Arrays
			.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bicycle Type</b></em>' literal with the specified literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalBicycleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RentalBicycleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bicycle Type</b></em>' literal with the specified name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalBicycleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RentalBicycleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bicycle Type</b></em>' literal with the specified integer value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RentalBicycleType get(int value) {
		switch (value) {
		case STANDARD_VALUE:
			return STANDARD;
		case MOUNTAIN_BIKE_VALUE:
			return MOUNTAIN_BIKE;
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
	private RentalBicycleType(int value, String name, String literal) {
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

} // RentalBicycleType
