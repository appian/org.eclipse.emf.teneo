/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancemappingPackageImpl.java,v 1.2 2006/07/22 13:01:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.ContentList;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InternationalPrice;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.Price;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritancemappingPackageImpl extends EPackageImpl implements InheritancemappingPackage {
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
	private EClass contentListEClass = null;

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
	private EClass internationalPriceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InheritancemappingPackageImpl() {
		super(eNS_URI, InheritancemappingFactory.eINSTANCE);
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
	public static InheritancemappingPackage init() {
		if (isInited) return (InheritancemappingPackage)EPackage.Registry.INSTANCE.getEPackage(InheritancemappingPackage.eNS_URI);

		// Obtain or create and register package
		InheritancemappingPackageImpl theInheritancemappingPackage = (InheritancemappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InheritancemappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InheritancemappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInheritancemappingPackage.createPackageContents();

		// Initialize created meta-data
		theInheritancemappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInheritancemappingPackage.freeze();

		return theInheritancemappingPackage;
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
	public EClass getContentList() {
		return contentListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentList_Name() {
		return (EAttribute)contentListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentList_Address() {
		return (EReference)contentListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentList_Price() {
		return (EReference)contentListEClass.getEStructuralFeatures().get(2);
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
	public EClass getInternationalPrice() {
		return internationalPriceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternationalPrice_Currency() {
		return (EAttribute)internationalPriceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrice() {
		return priceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_Name() {
		return (EAttribute)priceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrice_Value() {
		return (EAttribute)priceEClass.getEStructuralFeatures().get(1);
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
	public EDataType getUSStateObject() {
		return usStateObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancemappingFactory getInheritancemappingFactory() {
		return (InheritancemappingFactory)getEFactoryInstance();
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

		contentListEClass = createEClass(CONTENT_LIST);
		createEAttribute(contentListEClass, CONTENT_LIST__NAME);
		createEReference(contentListEClass, CONTENT_LIST__ADDRESS);
		createEReference(contentListEClass, CONTENT_LIST__PRICE);

		districtUKAddressEClass = createEClass(DISTRICT_UK_ADDRESS);
		createEAttribute(districtUKAddressEClass, DISTRICT_UK_ADDRESS__DISTRICT);

		internationalPriceEClass = createEClass(INTERNATIONAL_PRICE);
		createEAttribute(internationalPriceEClass, INTERNATIONAL_PRICE__CURRENCY);

		priceEClass = createEClass(PRICE);
		createEAttribute(priceEClass, PRICE__NAME);
		createEAttribute(priceEClass, PRICE__VALUE);

		ukAddressEClass = createEClass(UK_ADDRESS);
		createEAttribute(ukAddressEClass, UK_ADDRESS__POSTCODE);

		usAddressEClass = createEClass(US_ADDRESS);
		createEAttribute(usAddressEClass, US_ADDRESS__STATE);
		createEAttribute(usAddressEClass, US_ADDRESS__ZIP);

		// Create enums
		usStateEEnum = createEEnum(US_STATE);

		// Create data types
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
		internationalPriceEClass.getESuperTypes().add(this.getPrice());
		ukAddressEClass.getESuperTypes().add(this.getAddress());
		usAddressEClass.getESuperTypes().add(this.getAddress());

		// Initialize classes and features; add operations and parameters
		initEClass(addressEClass, Address.class, "Address", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Street(), theXMLTypePackage.getString(), "street", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), theXMLTypePackage.getString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentListEClass, ContentList.class, "ContentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentList_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ContentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentList_Address(), this.getAddress(), null, "address", null, 1, -1, ContentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentList_Price(), this.getPrice(), null, "price", null, 1, -1, ContentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(districtUKAddressEClass, DistrictUKAddress.class, "DistrictUKAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistrictUKAddress_District(), theXMLTypePackage.getString(), "district", null, 1, 1, DistrictUKAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internationalPriceEClass, InternationalPrice.class, "InternationalPrice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternationalPrice_Currency(), theXMLTypePackage.getString(), "currency", null, 1, 1, InternationalPrice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priceEClass, Price.class, "Price", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrice_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrice_Value(), theXMLTypePackage.getDecimal(), "value", null, 1, 1, Price.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ukAddressEClass, UKAddress.class, "UKAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUKAddress_Postcode(), theXMLTypePackage.getString(), "postcode", null, 1, 1, UKAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usAddressEClass, USAddress.class, "USAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUSAddress_State(), this.getUSState(), "state", "AK", 1, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSAddress_Zip(), theXMLTypePackage.getPositiveInteger(), "zip", null, 1, 1, USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(usStateEEnum, USState.class, "USState");
		addEEnumLiteral(usStateEEnum, USState.AK_LITERAL);
		addEEnumLiteral(usStateEEnum, USState.AL_LITERAL);
		addEEnumLiteral(usStateEEnum, USState.AR_LITERAL);

		// Initialize data types
		initEDataType(usStateObjectEDataType, USState.class, "USStateObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://annotation.elver.org/Inheritance
		createInheritanceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://annotation.elver.org/Id
		createIdAnnotations();
		// http://annotation.elver.org/DiscriminatorValue
		createDiscriminatorValueAnnotations();
		// http://annotation.elver.org/Table
		createTableAnnotations();
		// http://annotation.elver.org/DiscriminatorColumn
		createDiscriminatorColumnAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Inheritance</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createInheritanceAnnotations() {
		String source = "http://annotation.elver.org/Inheritance";		
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "strategy", "JOINED"
		   });																		
		addAnnotation
		  (priceEClass, 
		   source, 
		   new String[] {
			 "strategy", "SINGLE_TABLE"
		   });												
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
		  (contentListEClass, 
		   source, 
		   new String[] {
			 "name", "contentList",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getContentList_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getContentList_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address"
		   });		
		addAnnotation
		  (getContentList_Price(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "price"
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
		  (internationalPriceEClass, 
		   source, 
		   new String[] {
			 "name", "InternationalPrice",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInternationalPrice_Currency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currency"
		   });						
		addAnnotation
		  (priceEClass, 
		   source, 
		   new String[] {
			 "name", "Price",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPrice_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getPrice_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
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
	 * Initializes the annotations for <b>http://annotation.elver.org/Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdAnnotations() {
		String source = "http://annotation.elver.org/Id";				
		addAnnotation
		  (getAddress_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });						
		addAnnotation
		  (getContentList_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });																						
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/DiscriminatorValue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiscriminatorValueAnnotations() {
		String source = "http://annotation.elver.org/DiscriminatorValue";															
		addAnnotation
		  (internationalPriceEClass, 
		   source, 
		   new String[] {
			 "value", "myInternationalPrice"
		   });							
		addAnnotation
		  (priceEClass, 
		   source, 
		   new String[] {
			 "value", "myPrice"
		   });										
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Table</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTableAnnotations() {
		String source = "http://annotation.elver.org/Table";																		
		addAnnotation
		  (priceEClass, 
		   source, 
		   new String[] {
			 "name", "myprice"
		   });													
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/DiscriminatorColumn</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiscriminatorColumnAnnotations() {
		String source = "http://annotation.elver.org/DiscriminatorColumn";																				
		addAnnotation
		  (priceEClass, 
		   source, 
		   new String[] {
			 "name", "DISCRIMINATOR",
			 "discriminatorType", "STRING"
		   });											
	}

} //InheritancemappingPackageImpl
