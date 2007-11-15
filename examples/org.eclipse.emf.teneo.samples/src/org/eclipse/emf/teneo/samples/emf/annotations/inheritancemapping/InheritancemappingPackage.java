/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancemappingPackage.java,v 1.2 2007/11/15 14:48:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping;

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
 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingFactory
 * @model kind="package"
 * @generated
 */
public interface InheritancemappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inheritancemapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/annotations/inheritancemapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inheritancemapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InheritancemappingPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getAddress()
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
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.ContentListImpl <em>Content List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.ContentListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getContentList()
	 * @generated
	 */
	int CONTENT_LIST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LIST__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LIST__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Content List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_LIST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl <em>UK Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUKAddress()
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
	 * The number of structural features of the '<em>UK Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UK_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.DistrictUKAddressImpl <em>District UK Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.DistrictUKAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getDistrictUKAddress()
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
	 * The feature id for the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS__DISTRICT = UK_ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>District UK Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRICT_UK_ADDRESS_FEATURE_COUNT = UK_ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.PriceImpl <em>Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.PriceImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getPrice()
	 * @generated
	 */
	int PRICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InternationalPriceImpl <em>International Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InternationalPriceImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getInternationalPrice()
	 * @generated
	 */
	int INTERNATIONAL_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE__NAME = PRICE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE__VALUE = PRICE__VALUE;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE__CURRENCY = PRICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>International Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_PRICE_FEATURE_COUNT = PRICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.USAddressImpl <em>US Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.USAddressImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSAddress()
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
	 * The number of structural features of the '<em>US Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.CustomerImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.SpecificCustomerImpl <em>Specific Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.SpecificCustomerImpl
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getSpecificCustomer()
	 * @generated
	 */
	int SPECIFIC_CUSTOMER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CUSTOMER__NAME = CUSTOMER__NAME;

	/**
	 * The feature id for the '<em><b>Specific Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CUSTOMER__SPECIFIC_NAME = CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specific Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_CUSTOMER_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState <em>US State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSState()
	 * @generated
	 */
	int US_STATE = 9;

	/**
	 * The meta object id for the '<em>US State Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSStateObject()
	 * @generated
	 */
	int US_STATE_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList <em>Content List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList
	 * @generated
	 */
	EClass getContentList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getName()
	 * @see #getContentList()
	 * @generated
	 */
	EAttribute getContentList_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getAddress()
	 * @see #getContentList()
	 * @generated
	 */
	EReference getContentList_Address();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList#getPrice()
	 * @see #getContentList()
	 * @generated
	 */
	EReference getContentList_Price();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress <em>District UK Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>District UK Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress
	 * @generated
	 */
	EClass getDistrictUKAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress#getDistrict <em>District</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>District</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress#getDistrict()
	 * @see #getDistrictUKAddress()
	 * @generated
	 */
	EAttribute getDistrictUKAddress_District();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice <em>International Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice
	 * @generated
	 */
	EClass getInternationalPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice#getCurrency()
	 * @see #getInternationalPrice()
	 * @generated
	 */
	EAttribute getInternationalPrice_Currency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price
	 * @generated
	 */
	EClass getPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price#getName()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price#getValue()
	 * @see #getPrice()
	 * @generated
	 */
	EAttribute getPrice_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress <em>UK Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UK Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress
	 * @generated
	 */
	EClass getUKAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress#getPostcode <em>Postcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcode</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress#getPostcode()
	 * @see #getUKAddress()
	 * @generated
	 */
	EAttribute getUKAddress_Postcode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress
	 * @generated
	 */
	EClass getUSAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip <em>Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_Zip();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer <em>Specific Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer
	 * @generated
	 */
	EClass getSpecificCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer#getSpecificName <em>Specific Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer#getSpecificName()
	 * @see #getSpecificCustomer()
	 * @generated
	 */
	EAttribute getSpecificCustomer_SpecificName();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState <em>US State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>US State</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @generated
	 */
	EEnum getUSState();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState <em>US State Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>US State Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState"
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
	InheritancemappingFactory getInheritancemappingFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.AddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NAME = eINSTANCE.getAddress_Name();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.ContentListImpl <em>Content List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.ContentListImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getContentList()
		 * @generated
		 */
		EClass CONTENT_LIST = eINSTANCE.getContentList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_LIST__NAME = eINSTANCE.getContentList_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_LIST__ADDRESS = eINSTANCE.getContentList_Address();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_LIST__PRICE = eINSTANCE.getContentList_Price();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.DistrictUKAddressImpl <em>District UK Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.DistrictUKAddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getDistrictUKAddress()
		 * @generated
		 */
		EClass DISTRICT_UK_ADDRESS = eINSTANCE.getDistrictUKAddress();

		/**
		 * The meta object literal for the '<em><b>District</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTRICT_UK_ADDRESS__DISTRICT = eINSTANCE.getDistrictUKAddress_District();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InternationalPriceImpl <em>International Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InternationalPriceImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getInternationalPrice()
		 * @generated
		 */
		EClass INTERNATIONAL_PRICE = eINSTANCE.getInternationalPrice();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNATIONAL_PRICE__CURRENCY = eINSTANCE.getInternationalPrice_Currency();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.PriceImpl <em>Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.PriceImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getPrice()
		 * @generated
		 */
		EClass PRICE = eINSTANCE.getPrice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__NAME = eINSTANCE.getPrice_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE__VALUE = eINSTANCE.getPrice_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl <em>UK Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUKAddress()
		 * @generated
		 */
		EClass UK_ADDRESS = eINSTANCE.getUKAddress();

		/**
		 * The meta object literal for the '<em><b>Postcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UK_ADDRESS__POSTCODE = eINSTANCE.getUKAddress_Postcode();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.USAddressImpl <em>US Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.USAddressImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSAddress()
		 * @generated
		 */
		EClass US_ADDRESS = eINSTANCE.getUSAddress();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.CustomerImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.SpecificCustomerImpl <em>Specific Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.SpecificCustomerImpl
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getSpecificCustomer()
		 * @generated
		 */
		EClass SPECIFIC_CUSTOMER = eINSTANCE.getSpecificCustomer();

		/**
		 * The meta object literal for the '<em><b>Specific Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_CUSTOMER__SPECIFIC_NAME = eINSTANCE.getSpecificCustomer_SpecificName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState <em>US State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSState()
		 * @generated
		 */
		EEnum US_STATE = eINSTANCE.getUSState();

		/**
		 * The meta object literal for the '<em>US State Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
		 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.InheritancemappingPackageImpl#getUSStateObject()
		 * @generated
		 */
		EDataType US_STATE_OBJECT = eINSTANCE.getUSStateObject();

	}

} //InheritancemappingPackage
