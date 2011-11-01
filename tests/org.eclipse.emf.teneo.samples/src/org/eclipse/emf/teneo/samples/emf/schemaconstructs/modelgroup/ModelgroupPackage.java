/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelgroupPackage.java,v 1.1 2010/03/25 00:29:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupFactory
 * @model kind="package"
 * @generated
 */
public interface ModelgroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelgroup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/modelgroup";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelgroup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelgroupPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl <em>Order List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupPackageImpl#getOrderList()
	 * @generated
	 */
	int ORDER_LIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Preferred Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__PREFERRED_ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Standard Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__STANDARD_ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Hard Copy Order Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__HARD_COPY_ORDER_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Hard Copy Order Number</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__HARD_COPY_ORDER_NUMBER = 5;

	/**
	 * The number of structural features of the '<em>Order List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.PurchaseOrderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupPackageImpl#getPurchaseOrder()
	 * @generated
	 */
	int PURCHASE_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList <em>Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList
	 * @generated
	 */
	EClass getOrderList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getName()
	 * @see #getOrderList()
	 * @generated
	 */
	EAttribute getOrderList_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getOrders()
	 * @see #getOrderList()
	 * @generated
	 */
	EAttribute getOrderList_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getPreferredOrders <em>Preferred Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getPreferredOrders()
	 * @see #getOrderList()
	 * @generated
	 */
	EReference getOrderList_PreferredOrders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getStandardOrders <em>Standard Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getStandardOrders()
	 * @see #getOrderList()
	 * @generated
	 */
	EReference getOrderList_StandardOrders();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hard Copy Order Reference</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderReference()
	 * @see #getOrderList()
	 * @generated
	 */
	EAttribute getOrderList_HardCopyOrderReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hard Copy Order Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList#getHardCopyOrderNumber()
	 * @see #getOrderList()
	 * @generated
	 */
	EAttribute getOrderList_HardCopyOrderNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder
	 * @generated
	 */
	EClass getPurchaseOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder#getReference()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelgroupFactory getModelgroupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl <em>Order List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.OrderListImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupPackageImpl#getOrderList()
		 * @generated
		 */
		EClass ORDER_LIST = eINSTANCE.getOrderList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LIST__NAME = eINSTANCE.getOrderList_Name();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LIST__ORDERS = eINSTANCE.getOrderList_Orders();

		/**
		 * The meta object literal for the '<em><b>Preferred Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_LIST__PREFERRED_ORDERS = eINSTANCE.getOrderList_PreferredOrders();

		/**
		 * The meta object literal for the '<em><b>Standard Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_LIST__STANDARD_ORDERS = eINSTANCE.getOrderList_StandardOrders();

		/**
		 * The meta object literal for the '<em><b>Hard Copy Order Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LIST__HARD_COPY_ORDER_REFERENCE = eINSTANCE.getOrderList_HardCopyOrderReference();

		/**
		 * The meta object literal for the '<em><b>Hard Copy Order Number</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LIST__HARD_COPY_ORDER_NUMBER = eINSTANCE.getOrderList_HardCopyOrderNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.PurchaseOrderImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl.ModelgroupPackageImpl#getPurchaseOrder()
		 * @generated
		 */
		EClass PURCHASE_ORDER = eINSTANCE.getPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ORDER__REFERENCE = eINSTANCE.getPurchaseOrder_Reference();

	}

} //ModelgroupPackage
