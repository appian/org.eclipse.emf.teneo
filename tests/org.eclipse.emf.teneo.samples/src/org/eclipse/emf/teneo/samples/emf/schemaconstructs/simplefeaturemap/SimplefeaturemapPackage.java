/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplefeaturemapPackage.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapFactory
 * @model kind="package"
 * @generated
 */
public interface SimplefeaturemapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplefeaturemap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/simplefeaturemap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplefeaturemap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplefeaturemapPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SimplefeaturemapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.PurchaseOrderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SimplefeaturemapPackageImpl#getPurchaseOrder()
	 * @generated
	 */
	int PURCHASE_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__NAME = 0;

	/**
	 * The number of structural features of the the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SimplefeaturemapPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Preferred Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__PREFERRED_ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Standard Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__STANDARD_ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Hard Copy Order Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__HARD_COPY_ORDER_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Hard Copy Order Number</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__HARD_COPY_ORDER_NUMBER = 5;

	/**
	 * The number of structural features of the the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder
	 * @generated
	 */
	EClass getPurchaseOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder#getName()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getName()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getPreferredOrders <em>Preferred Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getPreferredOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_PreferredOrders();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getStandardOrders <em>Standard Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Standard Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getStandardOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_StandardOrders();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hard Copy Order Reference</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderReference()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_HardCopyOrderReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hard Copy Order Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier#getHardCopyOrderNumber()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_HardCopyOrderNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplefeaturemapFactory getSimplefeaturemapFactory();

} //SimplefeaturemapPackage
