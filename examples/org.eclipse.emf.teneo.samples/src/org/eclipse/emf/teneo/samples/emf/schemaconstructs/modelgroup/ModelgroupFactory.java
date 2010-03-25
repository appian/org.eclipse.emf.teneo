/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelgroupFactory.java,v 1.1 2010/03/25 00:29:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage
 * @generated
 */
public interface ModelgroupFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelgroupFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Order List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order List</em>'.
	 * @generated
	 */
	OrderList createOrderList();

	/**
	 * Returns a new object of class '<em>Purchase Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchase Order</em>'.
	 * @generated
	 */
	PurchaseOrder createPurchaseOrder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelgroupPackage getModelgroupPackage();

} //ModelgroupFactory
