/**
 * <copyright>
 * </copyright>
 *
 * $Id: GroupallPackage.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallFactory
 * @model kind="package"
 * @generated
 */
public interface GroupallPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "groupall";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/groupall";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "groupall";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GroupallPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__LONG_NAME = 2;

	/**
	 * The number of structural features of the the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl <em>Address Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getAddressGroup()
	 * @generated
	 */
	int ADDRESS_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_GROUP__GROUP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_GROUP__SHIP_TO = 1;

	/**
	 * The feature id for the '<em><b>Bill To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_GROUP__BILL_TO = 2;

	/**
	 * The feature id for the '<em><b>Simple Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_GROUP__SIMPLE_ADDRESS = 3;

	/**
	 * The number of structural features of the the '<em>Address Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_GROUP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl <em>Address List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getAddressList()
	 * @generated
	 */
	int ADDRESS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__GROUP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Addrs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__ADDRS = 1;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__SHIP_TO = 2;

	/**
	 * The feature id for the '<em><b>Bill To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__BILL_TO = 3;

	/**
	 * The number of structural features of the the '<em>Address List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Simple All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_ALL = 3;

	/**
	 * The feature id for the '<em><b>Simple All Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_ALL_MAP = 4;

	/**
	 * The number of structural features of the the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl <em>Simple All Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllMapTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getSimpleAllMapType()
	 * @generated
	 */
	int SIMPLE_ALL_MAP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>All Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_MAP_TYPE__ALL_MAP = 0;

	/**
	 * The feature id for the '<em><b>Aaa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_MAP_TYPE__AAA = 1;

	/**
	 * The feature id for the '<em><b>Bbb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_MAP_TYPE__BBB = 2;

	/**
	 * The feature id for the '<em><b>Ccc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_MAP_TYPE__CCC = 3;

	/**
	 * The number of structural features of the the '<em>Simple All Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_MAP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllTypeImpl <em>Simple All Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.SimpleAllTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.GroupallPackageImpl#getSimpleAllType()
	 * @generated
	 */
	int SIMPLE_ALL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Aaa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_TYPE__AAA = 0;

	/**
	 * The feature id for the '<em><b>Bbb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_TYPE__BBB = 1;

	/**
	 * The feature id for the '<em><b>Ccc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_TYPE__CCC = 2;

	/**
	 * The number of structural features of the the '<em>Simple All Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALL_TYPE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getGroup()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Long Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address#getLongName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_LongName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup <em>Address Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup
	 * @generated
	 */
	EClass getAddressGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getGroupName()
	 * @see #getAddressGroup()
	 * @generated
	 */
	EAttribute getAddressGroup_GroupName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ship To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getShipTo()
	 * @see #getAddressGroup()
	 * @generated
	 */
	EReference getAddressGroup_ShipTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getBillTo <em>Bill To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bill To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getBillTo()
	 * @see #getAddressGroup()
	 * @generated
	 */
	EReference getAddressGroup_BillTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getSimpleAddress <em>Simple Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup#getSimpleAddress()
	 * @see #getAddressGroup()
	 * @generated
	 */
	EAttribute getAddressGroup_SimpleAddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList <em>Address List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList
	 * @generated
	 */
	EClass getAddressList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getGroupName()
	 * @see #getAddressList()
	 * @generated
	 */
	EAttribute getAddressList_GroupName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getAddrs <em>Addrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Addrs</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getAddrs()
	 * @see #getAddressList()
	 * @generated
	 */
	EAttribute getAddressList_Addrs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ship To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getShipTo()
	 * @see #getAddressList()
	 * @generated
	 */
	EReference getAddressList_ShipTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getBillTo <em>Bill To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bill To</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList#getBillTo()
	 * @see #getAddressList()
	 * @generated
	 */
	EReference getAddressList_BillTo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getSimpleAll <em>Simple All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple All</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getSimpleAll()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getSimpleAllMap <em>Simple All Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple All Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.DocumentRoot#getSimpleAllMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleAllMap();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType <em>Simple All Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple All Map Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType
	 * @generated
	 */
	EClass getSimpleAllMapType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getAllMap <em>All Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>All Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getAllMap()
	 * @see #getSimpleAllMapType()
	 * @generated
	 */
	EAttribute getSimpleAllMapType_AllMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getAaa <em>Aaa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aaa</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getAaa()
	 * @see #getSimpleAllMapType()
	 * @generated
	 */
	EAttribute getSimpleAllMapType_Aaa();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getBbb <em>Bbb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbb</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getBbb()
	 * @see #getSimpleAllMapType()
	 * @generated
	 */
	EAttribute getSimpleAllMapType_Bbb();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getCcc <em>Ccc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccc</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllMapType#getCcc()
	 * @see #getSimpleAllMapType()
	 * @generated
	 */
	EAttribute getSimpleAllMapType_Ccc();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType <em>Simple All Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple All Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType
	 * @generated
	 */
	EClass getSimpleAllType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getAaa <em>Aaa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aaa</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getAaa()
	 * @see #getSimpleAllType()
	 * @generated
	 */
	EAttribute getSimpleAllType_Aaa();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getBbb <em>Bbb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbb</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getBbb()
	 * @see #getSimpleAllType()
	 * @generated
	 */
	EAttribute getSimpleAllType_Bbb();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getCcc <em>Ccc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccc</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.SimpleAllType#getCcc()
	 * @see #getSimpleAllType()
	 * @generated
	 */
	EAttribute getSimpleAllType_Ccc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GroupallFactory getGroupallFactory();

} //GroupallPackage
