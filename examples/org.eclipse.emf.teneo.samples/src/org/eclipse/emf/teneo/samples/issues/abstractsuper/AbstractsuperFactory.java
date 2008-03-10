/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractsuperFactory.java,v 1.1 2008/03/10 22:19:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage
 * @generated
 */
public interface AbstractsuperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsuperFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.abstractsuper.impl.AbstractsuperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Content List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content List</em>'.
	 * @generated
	 */
	ContentList createContentList();

	/**
	 * Returns a new object of class '<em>District UK Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>District UK Address</em>'.
	 * @generated
	 */
	DistrictUKAddress createDistrictUKAddress();

	/**
	 * Returns a new object of class '<em>International Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>International Price</em>'.
	 * @generated
	 */
	InternationalPrice createInternationalPrice();

	/**
	 * Returns a new object of class '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price</em>'.
	 * @generated
	 */
	Price createPrice();

	/**
	 * Returns a new object of class '<em>UK Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UK Address</em>'.
	 * @generated
	 */
	UKAddress createUKAddress();

	/**
	 * Returns a new object of class '<em>US Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>US Address</em>'.
	 * @generated
	 */
	USAddress createUSAddress();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Specific Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Customer</em>'.
	 * @generated
	 */
	SpecificCustomer createSpecificCustomer();

	/**
	 * Returns a new object of class '<em>UK Address List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UK Address List</em>'.
	 * @generated
	 */
	UKAddressList createUKAddressList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractsuperPackage getAbstractsuperPackage();

} //AbstractsuperFactory
