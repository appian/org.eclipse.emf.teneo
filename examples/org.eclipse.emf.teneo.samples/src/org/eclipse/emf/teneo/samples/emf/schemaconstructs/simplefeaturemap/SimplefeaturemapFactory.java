/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplefeaturemapFactory.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage
 * @generated
 */
public interface SimplefeaturemapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplefeaturemapFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SimplefeaturemapFactoryImpl();

	/**
	 * Returns a new object of class '<em>Purchase Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchase Order</em>'.
	 * @generated
	 */
	PurchaseOrder createPurchaseOrder();

	/**
	 * Returns a new object of class '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier</em>'.
	 * @generated
	 */
	Supplier createSupplier();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplefeaturemapPackage getSimplefeaturemapPackage();

} //SimplefeaturemapFactory
