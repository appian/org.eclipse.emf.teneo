/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExtensionPackageImpl.java,v 1.2 2007/02/05 16:13:45 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.InternationalPrice;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.UKAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.USState;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.util.ExtensionValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionPackageImpl extends EPackageImpl implements ExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass districtUKAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstAddressHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internationalPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ukAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType postcodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ukPostcodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usStateObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionPackageImpl() {
		super(eNS_URI, ExtensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionPackage init() {
		if (isInited) return (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionPackageImpl theExtensionPackage = (ExtensionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ExtensionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theExtensionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theExtensionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ExtensionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theExtensionPackage.freeze();

		return theExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Name() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Street() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressList() {
		return addressListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressList_Name() {
		return (EAttribute)addressListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressList_FirstAddress() {
		return (EReference)addressListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressList_SecondAddress() {
		return (EReference)addressListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistrictUKAddress() {
		return districtUKAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistrictUKAddress_District() {
		return (EAttribute)districtUKAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstAddressHolder() {
		return firstAddressHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFirstAddressHolder_Value() {
		return (EReference)firstAddressHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternationalPrice() {
		return internationalPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalPrice_Value() {
		return (EAttribute)internationalPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalPrice_Currency() {
		return (EAttribute)internationalPriceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUKAddress() {
		return ukAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUKAddress_Postcode() {
		return (EAttribute)ukAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUKAddress_ExportCode() {
		return (EAttribute)ukAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUSAddress() {
		return usAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSAddress_State() {
		return (EAttribute)usAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSAddress_Zip() {
		return (EAttribute)usAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUSState() {
		return usStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPostcode() {
		return postcodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUKPostcode() {
		return ukPostcodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUSStateObject() {
		return usStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFactory getExtensionFactory() {
		return (ExtensionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__NAME);
		createEAttribute(addressEClass, ADDRESS__STREET);
		createEAttribute(addressEClass, ADDRESS__CITY);

		addressListEClass = createEClass(ADDRESS_LIST);
		createEAttribute(addressListEClass, ADDRESS_LIST__NAME);
		createEReference(addressListEClass, ADDRESS_LIST__FIRST_ADDRESS);
		createEReference(addressListEClass, ADDRESS_LIST__SECOND_ADDRESS);

		districtUKAddressEClass = createEClass(DISTRICT_UK_ADDRESS);
		createEAttribute(districtUKAddressEClass, DISTRICT_UK_ADDRESS__DISTRICT);

		firstAddressHolderEClass = createEClass(FIRST_ADDRESS_HOLDER);
		createEReference(firstAddressHolderEClass, FIRST_ADDRESS_HOLDER__VALUE);

		internationalPriceEClass = createEClass(INTERNATIONAL_PRICE);
		createEAttribute(internationalPriceEClass, INTERNATIONAL_PRICE__VALUE);
		createEAttribute(internationalPriceEClass, INTERNATIONAL_PRICE__CURRENCY);

		ukAddressEClass = createEClass(UK_ADDRESS);
		createEAttribute(ukAddressEClass, UK_ADDRESS__POSTCODE);
		createEAttribute(ukAddressEClass, UK_ADDRESS__EXPORT_CODE);

		usAddressEClass = createEClass(US_ADDRESS);
		createEAttribute(usAddressEClass, US_ADDRESS__STATE);
		createEAttribute(usAddressEClass, US_ADDRESS__ZIP);

		// Create enums
		usStateEEnum = createEEnum(US_STATE);

		// Create data types
		postcodeEDataType = createEDataType(POSTCODE);
		ukPostcodeEDataType = createEDataType(UK_POSTCODE);
		usStateObjectEDataType = createEDataType(US_STATE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes
		districtUKAddressEClass.getESuperTypes().add(this.getUKAddress());
		ukAddressEClass.getESuperTypes().add(this.getAddress());
		usAddressEClass.getESuperTypes().add(this.getAddress());

		// Initialize classes and features; add operations and parameters
		initEClass(addressEClass, Address.class, "Address", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Street(), theXMLTypePackage.getString(), "street", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), theXMLTypePackage.getString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressListEClass, AddressList.class, "AddressList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressList_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AddressList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressList_FirstAddress(), this.getFirstAddressHolder(), null, "firstAddress", null, 1, 1, AddressList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressList_SecondAddress(), this.getAddress(), null, "secondAddress", null, 1, -1, AddressList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(districtUKAddressEClass, DistrictUKAddress.class, "DistrictUKAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistrictUKAddress_District(), theXMLTypePackage.getString(), "district", null, 1, 1, DistrictUKAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firstAddressHolderEClass, FirstAddressHolder.class, "FirstAddressHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFirstAddressHolder_Value(), this.getAddress(), null, "value", null, 0, -1, FirstAddressHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalPriceEClass, InternationalPrice.class, "InternationalPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalPrice_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, InternationalPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternationalPrice_Currency(), theXMLTypePackage.getString(), "currency", null, 0, 1, InternationalPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ukAddressEClass, UKAddress.class, "UKAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUKAddress_Postcode(), this.getUKPostcode(), "postcode", null, 1, 1, UKAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUKAddress_ExportCode(), theXMLTypePackage.getPositiveInteger(), "exportCode", "1", 0, 1, UKAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usAddressEClass, USAddress.class, "USAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUSAddress_State(), this.getUSState(), "state", "AK", 1, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSAddress_Zip(), theXMLTypePackage.getPositiveInteger(), "zip", null, 1, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(usStateEEnum, USState.class, "USState");
		addEEnumLiteral(usStateEEnum, USState.AK_LITERAL);
		addEEnumLiteral(usStateEEnum, USState.AL_LITERAL);
		addEEnumLiteral(usStateEEnum, USState.AR_LITERAL);

		// Initialize data types
		initEDataType(postcodeEDataType, String.class, "Postcode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ukPostcodeEDataType, String.class, "UKPostcode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(usStateObjectEDataType, USState.class, "USStateObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "name", "Address",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddress_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAddress_Street(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "street"
		   });		
		addAnnotation
		  (getAddress_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "city"
		   });		
		addAnnotation
		  (addressListEClass, 
		   source, 
		   new String[] {
			 "name", "AddressList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressList_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getAddressList_FirstAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstAddress"
		   });		
		addAnnotation
		  (getAddressList_SecondAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "secondAddress"
		   });		
		addAnnotation
		  (districtUKAddressEClass, 
		   source, 
		   new String[] {
			 "name", "DistrictUKAddress",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDistrictUKAddress_District(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "district"
		   });		
		addAnnotation
		  (firstAddressHolderEClass, 
		   source, 
		   new String[] {
			 "name", "firstAddress:holder",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFirstAddressHolder_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (internationalPriceEClass, 
		   source, 
		   new String[] {
			 "name", "internationalPrice",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInternationalPrice_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInternationalPrice_Currency(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "currency"
		   });		
		addAnnotation
		  (postcodeEDataType, 
		   source, 
		   new String[] {
			 "name", "Postcode",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "7"
		   });		
		addAnnotation
		  (ukAddressEClass, 
		   source, 
		   new String[] {
			 "name", "UKAddress",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUKAddress_Postcode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "postcode"
		   });		
		addAnnotation
		  (getUKAddress_ExportCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exportCode"
		   });		
		addAnnotation
		  (ukPostcodeEDataType, 
		   source, 
		   new String[] {
			 "name", "UKPostcode",
			 "baseType", "Postcode",
			 "pattern", "[A-Z]{2}\\d\\s\\d[A-Z]{2}"
		   });		
		addAnnotation
		  (usAddressEClass, 
		   source, 
		   new String[] {
			 "name", "USAddress",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getUSAddress_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state"
		   });		
		addAnnotation
		  (getUSAddress_Zip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "zip"
		   });		
		addAnnotation
		  (usStateEEnum, 
		   source, 
		   new String[] {
			 "name", "USState"
		   });		
		addAnnotation
		  (usStateObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "USState:Object",
			 "baseType", "USState"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";																							
		addAnnotation
		  (usAddressEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"UNITEDSTATESADDRESS\")"
		   });				
	}

} //ExtensionPackageImpl
