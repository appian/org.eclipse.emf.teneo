/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalFactory.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.rental.RentalPackage
 * @generated
 */
public interface RentalFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RentalFactory eINSTANCE = org.eclipse.emf.teneo.rental.impl.RentalFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bicycle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bicycle</em>'.
	 * @generated
	 */
	RentalBicycle createRentalBicycle();

	/**
	 * Returns a new object of class '<em>Business</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business</em>'.
	 * @generated
	 */
	RentalBusiness createRentalBusiness();

	/**
	 * Returns a new object of class '<em>Car</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Car</em>'.
	 * @generated
	 */
	RentalCar createRentalCar();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	RentalContract createRentalContract();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RentalPackage getRentalPackage();

} //RentalFactory
