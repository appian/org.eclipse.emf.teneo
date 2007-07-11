/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchemaprimerpoPackage.java,v 1.2 2007/07/11 14:40:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaprimerpoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "schemaprimerpo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/sample/schemaprimerpo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "schemaprimerpo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchemaprimerpoPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDER = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.ItemImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRODUCT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>US Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__US_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SHIP_DATE = 4;

	/**
	 * The feature id for the '<em><b>Part Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PART_NUM = 5;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.PurchaseOrderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getPurchaseOrder()
	 * @generated
	 */
	int PURCHASE_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__SHIP_TO = 0;

	/**
	 * The feature id for the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__BILL_TO = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__ORDER_DATE = 4;

	/**
	 * The number of structural features of the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.USAddressImpl <em>US Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.USAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getUSAddress()
	 * @generated
	 */
	int US_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STREET = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STATE = 3;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__ZIP = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__COUNTRY = 5;

	/**
	 * The number of structural features of the '<em>US Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '<em>Quantity Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getQuantityType()
	 * @generated
	 */
	int QUANTITY_TYPE = 4;

	/**
	 * The meta object id for the '<em>SKU</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getSKU()
	 * @generated
	 */
	int SKU = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getComment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.DocumentRoot#getOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Order();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getProductName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getQuantity()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getUSPrice <em>US Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>US Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getUSPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_USPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getComment()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getShipDate <em>Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getShipDate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ShipDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getPartNum <em>Part Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Num</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getPartNum()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_PartNum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder
	 * @generated
	 */
	EClass getPurchaseOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getShipTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getBillTo <em>Bill To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bill To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getBillTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_BillTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getComment()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getItems()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.PurchaseOrder#getOrderDate()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_OrderDate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress
	 * @generated
	 */
	EClass getUSAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getName()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getStreet()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getCity()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getState()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getZip()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Zip();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.USAddress#getCountry()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Country();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Quantity Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='quantity_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#positiveInteger' maxExclusive='100'"
	 * @generated
	 */
	EDataType getQuantityType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>SKU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SKU</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SKU' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\d{3}-[A-Z]{2}'"
	 * @generated
	 */
	EDataType getSKU();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchemaprimerpoFactory getSchemaprimerpoFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.DocumentRootImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COMMENT = eINSTANCE.getDocumentRoot_Comment();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORDER = eINSTANCE.getDocumentRoot_Order();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.ItemImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRODUCT_NAME = eINSTANCE.getItem_ProductName();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__QUANTITY = eINSTANCE.getItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>US Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__US_PRICE = eINSTANCE.getItem_USPrice();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COMMENT = eINSTANCE.getItem_Comment();

		/**
		 * The meta object literal for the '<em><b>Ship Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SHIP_DATE = eINSTANCE.getItem_ShipDate();

		/**
		 * The meta object literal for the '<em><b>Part Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PART_NUM = eINSTANCE.getItem_PartNum();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.PurchaseOrderImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getPurchaseOrder()
		 * @generated
		 */
		EClass PURCHASE_ORDER = eINSTANCE.getPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Ship To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE_ORDER__SHIP_TO = eINSTANCE.getPurchaseOrder_ShipTo();

		/**
		 * The meta object literal for the '<em><b>Bill To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE_ORDER__BILL_TO = eINSTANCE.getPurchaseOrder_BillTo();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ORDER__COMMENT = eINSTANCE.getPurchaseOrder_Comment();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE_ORDER__ITEMS = eINSTANCE.getPurchaseOrder_Items();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ORDER__ORDER_DATE = eINSTANCE.getPurchaseOrder_OrderDate();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.USAddressImpl <em>US Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.USAddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getUSAddress()
		 * @generated
		 */
		EClass US_ADDRESS = eINSTANCE.getUSAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__NAME = eINSTANCE.getUSAddress_Name();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__STREET = eINSTANCE.getUSAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__CITY = eINSTANCE.getUSAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__STATE = eINSTANCE.getUSAddress_State();

		/**
		 * The meta object literal for the '<em><b>Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__ZIP = eINSTANCE.getUSAddress_Zip();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__COUNTRY = eINSTANCE.getUSAddress_Country();

		/**
		 * The meta object literal for the '<em>Quantity Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getQuantityType()
		 * @generated
		 */
		EDataType QUANTITY_TYPE = eINSTANCE.getQuantityType();

		/**
		 * The meta object literal for the '<em>SKU</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.impl.SchemaprimerpoPackageImpl#getSKU()
		 * @generated
		 */
		EDataType SKU = eINSTANCE.getSKU();

	}

} //SchemaprimerpoPackage
