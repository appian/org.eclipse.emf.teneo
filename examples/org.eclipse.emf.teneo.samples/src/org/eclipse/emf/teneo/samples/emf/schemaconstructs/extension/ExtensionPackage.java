/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionPackage.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/extension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 2;

	/**
	 * The number of structural features of the the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressListImpl <em>Address List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getAddressList()
	 * @generated
	 */
	int ADDRESS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__FIRST_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Second Address</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST__SECOND_ADDRESS = 2;

	/**
	 * The number of structural features of the the '<em>Address List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_LIST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.FirstAddressHolderImpl <em>First Address Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.FirstAddressHolderImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getFirstAddressHolder()
	 * @generated
	 */
	int FIRST_ADDRESS_HOLDER = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.InternationalPriceImpl <em>International Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.InternationalPriceImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getInternationalPrice()
	 * @generated
	 */
	int INTERNATIONAL_PRICE = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.UKAddressImpl <em>UK Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.UKAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getUKAddress()
	 * @generated
	 */
	int UK_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS__NAME = ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS__STREET = ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>Postcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS__POSTCODE = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Export Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS__EXPORT_CODE = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>UK Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.DistrictUKAddressImpl <em>District UK Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.DistrictUKAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getDistrictUKAddress()
	 * @generated
	 */
	int DISTRICT_UK_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__NAME = UK_ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__STREET = UK_ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__CITY = UK_ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>Postcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__POSTCODE = UK_ADDRESS__POSTCODE;

	/**
	 * The feature id for the '<em><b>Export Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__EXPORT_CODE = UK_ADDRESS__EXPORT_CODE;

	/**
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__DISTRICT = UK_ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>District UK Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS_FEATURE_COUNT = UK_ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_ADDRESS_HOLDER__VALUE = 0;

	/**
	 * The number of structural features of the the '<em>First Address Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_ADDRESS_HOLDER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE__CURRENCY = 1;

	/**
	 * The number of structural features of the the '<em>International Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.USAddressImpl <em>US Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.USAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getUSAddress()
	 * @generated
	 */
	int US_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__NAME = ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STREET = ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STATE = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__ZIP = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>US Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState <em>US State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getUSState()
	 * @generated
	 */
	int US_STATE = 7;

	/**
	 * The meta object id for the '<em>Postcode</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getPostcode()
	 * @generated
	 */
	int POSTCODE = 8;

	/**
	 * The meta object id for the '<em>UK Postcode</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getUKPostcode()
	 * @generated
	 */
	int UK_POSTCODE = 9;

	/**
	 * The meta object id for the '<em>US State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.ExtensionPackageImpl#getUSStateObject()
	 * @generated
	 */
	int US_STATE_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList <em>Address List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList
	 * @generated
	 */
	EClass getAddressList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getName()
	 * @see #getAddressList()
	 * @generated
	 */
	EAttribute getAddressList_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getFirstAddress <em>First Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getFirstAddress()
	 * @see #getAddressList()
	 * @generated
	 */
	EReference getAddressList_FirstAddress();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getSecondAddress <em>Second Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Second Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList#getSecondAddress()
	 * @see #getAddressList()
	 * @generated
	 */
	EReference getAddressList_SecondAddress();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress <em>District UK Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>District UK Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress
	 * @generated
	 */
	EClass getDistrictUKAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress#getDistrict()
	 * @see #getDistrictUKAddress()
	 * @generated
	 */
	EAttribute getDistrictUKAddress_District();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder <em>First Address Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Address Holder</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder
	 * @generated
	 */
	EClass getFirstAddressHolder();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder#getValue()
	 * @see #getFirstAddressHolder()
	 * @generated
	 */
	EReference getFirstAddressHolder_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice <em>International Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice
	 * @generated
	 */
	EClass getInternationalPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice#getValue()
	 * @see #getInternationalPrice()
	 * @generated
	 */
	EAttribute getInternationalPrice_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice#getCurrency()
	 * @see #getInternationalPrice()
	 * @generated
	 */
	EAttribute getInternationalPrice_Currency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress <em>UK Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UK Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress
	 * @generated
	 */
	EClass getUKAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress#getPostcode <em>Postcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcode</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress#getPostcode()
	 * @see #getUKAddress()
	 * @generated
	 */
	EAttribute getUKAddress_Postcode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress#getExportCode <em>Export Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress#getExportCode()
	 * @see #getUKAddress()
	 * @generated
	 */
	EAttribute getUKAddress_ExportCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress
	 * @generated
	 */
	EClass getUSAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress#getState()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress#getZip()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Zip();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState <em>US State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>US State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState
	 * @generated
	 */
	EEnum getUSState();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Postcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Postcode</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Postcode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='7'" 
	 * @generated
	 */
	EDataType getPostcode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UK Postcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UK Postcode</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UKPostcode' baseType='Postcode' pattern='[A-Z]{2}\\d\\s\\d[A-Z]{2}'" 
	 * @generated
	 */
	EDataType getUKPostcode();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState <em>US State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>US State Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState"
	 *        extendedMetaData="name='USState:Object' baseType='USState'" 
	 * @generated
	 */
	EDataType getUSStateObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionFactory getExtensionFactory();

} //ExtensionPackage
