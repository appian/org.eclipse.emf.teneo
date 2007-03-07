/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalCar.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.RentalCar#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalCar()
 * @model extendedMetaData="name='RentalCar' kind='elementOnly'"
 * @generated
 */
public interface RentalCar extends RentalUnit {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"Small"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.rental.RentalCarSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(RentalCarSize)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getRentalCar_Size()
	 * @model default="Small" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='size'"
	 * @generated
	 */
	RentalCarSize getSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.RentalCar#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see org.eclipse.emf.teneo.rental.RentalCarSize
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(RentalCarSize value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.rental.RentalCar#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(RentalCarSize)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.rental.RentalCar#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(RentalCarSize)
	 * @generated
	 */
	boolean isSetSize();

} // RentalCar
