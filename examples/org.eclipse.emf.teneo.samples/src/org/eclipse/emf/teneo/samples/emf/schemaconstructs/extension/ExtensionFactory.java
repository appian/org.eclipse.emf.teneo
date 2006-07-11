/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionFactory.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage
 * @generated
 */
public interface ExtensionFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionFactoryImpl();

	/**
	 * Returns a new object of class '<em>Address List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address List</em>'.
	 * @generated
	 */
	AddressList createAddressList();

	/**
	 * Returns a new object of class '<em>District UK Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>District UK Address</em>'.
	 * @generated
	 */
	DistrictUKAddress createDistrictUKAddress();

	/**
	 * Returns a new object of class '<em>First Address Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>First Address Holder</em>'.
	 * @generated
	 */
	FirstAddressHolder createFirstAddressHolder();

	/**
	 * Returns a new object of class '<em>International Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>International Price</em>'.
	 * @generated
	 */
	InternationalPrice createInternationalPrice();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExtensionPackage getExtensionPackage();

} //ExtensionFactory
