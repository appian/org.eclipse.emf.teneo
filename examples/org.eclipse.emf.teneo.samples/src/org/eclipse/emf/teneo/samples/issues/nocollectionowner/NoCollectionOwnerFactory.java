/**
 * <copyright>
 * </copyright>
 *
 * $Id: NoCollectionOwnerFactory.java,v 1.1 2009/12/04 15:06:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage
 * @generated
 */
public interface NoCollectionOwnerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NoCollectionOwnerFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Product Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category</em>'.
	 * @generated
	 */
	ProductCategory createProductCategory();

	/**
	 * Returns a new object of class '<em>Price Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Category</em>'.
	 * @generated
	 */
	PriceCategory createPriceCategory();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction</em>'.
	 * @generated
	 */
	Transaction createTransaction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NoCollectionOwnerPackage getNoCollectionOwnerPackage();

} //NoCollectionOwnerFactory
