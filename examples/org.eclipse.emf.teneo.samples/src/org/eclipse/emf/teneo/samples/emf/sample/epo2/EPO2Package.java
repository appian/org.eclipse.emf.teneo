/**
 * <copyright>
 * </copyright>
 *
 * $Id: EPO2Package.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Factory
 * @model kind="package"
 * @generated
 */
public interface EPO2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "epo2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/extendedpo2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.example.epo2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EPO2Package eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.ItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRODUCT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>US Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__US_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SHIP_DATE = 5;

	/**
	 * The feature id for the '<em><b>Part Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PART_NUM = 6;

	/**
	 * The number of structural features of the the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 1;

	/**
	 * The number of structural features of the the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.USAddressImpl <em>US Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.USAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getUSAddress()
	 * @generated
	 */
	int US_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__NAME = ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__COUNTRY = ADDRESS__COUNTRY;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STREET = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__CITY = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STATE = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__ZIP = ADDRESS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>US Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.PurchaseOrderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getPurchaseOrder()
	 * @generated
	 */
	int PURCHASE_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__BILL_TO = 1;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__SHIP_TO = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__ORDER_DATE = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__TOTAL_AMOUNT = 6;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__CUSTOMER = 7;

	/**
	 * The feature id for the '<em><b>Previous Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__PREVIOUS_ORDER = 8;

	/**
	 * The number of structural features of the the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.SupplierImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CUSTOMERS = 1;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ORDERS = 2;

	/**
	 * The feature id for the '<em><b>Pending Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__PENDING_ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Shipped Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__SHIPPED_ORDERS = 4;

	/**
	 * The number of structural features of the the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.CustomerImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 5;

	/**
	 * The feature id for the '<em><b>Customer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CUSTOMER_ID = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDERS = 1;

	/**
	 * The number of structural features of the the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalAddressImpl <em>Global Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getGlobalAddress()
	 * @generated
	 */
	int GLOBAL_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ADDRESS__NAME = ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ADDRESS__COUNTRY = ADDRESS__COUNTRY;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ADDRESS__COUNTRY_CODE = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ADDRESS__LOCATION = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Global Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalLocationImpl <em>Global Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalLocationImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getGlobalLocation()
	 * @generated
	 */
	int GLOBAL_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_LOCATION__COUNTRY_CODE = 0;

	/**
	 * The number of structural features of the the '<em>Global Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_LOCATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus <em>Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 8;

	/**
	 * The meta object id for the '<em>SKU</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getSKU()
	 * @generated
	 */
	int SKU = 9;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.EPO2PackageImpl#getDate()
	 * @generated
	 */
	int DATE = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getOrder()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getProductName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getQuantity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getUSPrice <em>US Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>US Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getUSPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_USPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getComment()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getShipDate <em>Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getShipDate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ShipDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getPartNum <em>Part Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Num</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Item#getPartNum()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_PartNum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress
	 * @generated
	 */
	EClass getUSAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getStreet()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getCity()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getState()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.USAddress#getZip()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Zip();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder
	 * @generated
	 */
	EClass getPurchaseOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getItems()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_Items();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getBillTo <em>Bill To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bill To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getBillTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_BillTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getShipTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_ShipTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getComment()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getOrderDate()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_OrderDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getStatus()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getTotalAmount()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_TotalAmount();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getCustomer()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_Customer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getPreviousOrder <em>Previous Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.PurchaseOrder#getPreviousOrder()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_PreviousOrder();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getName()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getCustomers()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Orders();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getPendingOrders <em>Pending Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pending Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getPendingOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_PendingOrders();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getShippedOrders <em>Shipped Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipped Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Supplier#getShippedOrders()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_ShippedOrders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getCustomerID <em>Customer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer ID</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getCustomerID()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CustomerID();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.Customer#getOrders()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Orders();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress <em>Global Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress
	 * @generated
	 */
	EClass getGlobalAddress();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress#getLocation()
	 * @see #getGlobalAddress()
	 * @generated
	 */
	EAttribute getGlobalAddress_Location();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalLocation <em>Global Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalLocation
	 * @generated
	 */
	EClass getGlobalLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalLocation#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalLocation#getCountryCode()
	 * @see #getGlobalLocation()
	 * @generated
	 */
	EAttribute getGlobalLocation_CountryCode();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.epo2.OrderStatus
	 * @generated
	 */
	EEnum getOrderStatus();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SKU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SKU</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getSKU();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EPO2Factory getEPO2Factory();

} //EPO2Package
