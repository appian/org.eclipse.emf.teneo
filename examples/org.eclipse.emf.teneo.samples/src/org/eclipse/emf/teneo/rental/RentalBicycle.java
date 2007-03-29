/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalBicycle.java,v 1.2 2007/03/29 22:13:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bicycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalBicycle#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalBicycle#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalBicycle()
 * @model extendedMetaData="name='RentalBicycle' kind='elementOnly'"
 * @generated
 */
public interface RentalBicycle extends RentalUnit {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Standard"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.rental.RentalBicycleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(RentalBicycleType)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalBicycle_Type()
	 * @model default="Standard" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	RentalBicycleType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalBicycle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.rental.RentalBicycleType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(RentalBicycleType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.rental.RentalBicycle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(RentalBicycleType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.rental.RentalBicycle#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(RentalBicycleType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' reference.
	 * @see #setManufacturer(Manufacturer)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalBicycle_Manufacturer()
	 * @model required="true"
	 * @generated
	 */
	Manufacturer getManufacturer();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalBicycle#getManufacturer <em>Manufacturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(Manufacturer value);

} // RentalBicycle
