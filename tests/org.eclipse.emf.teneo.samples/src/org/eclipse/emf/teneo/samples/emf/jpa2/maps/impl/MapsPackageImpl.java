/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.maps.impl;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.EnumType;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.Images;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.maps.PhotoPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapsPackageImpl extends EPackageImpl implements MapsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToPartMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType myDateEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.maps.MapsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MapsPackageImpl() {
		super(eNS_URI, MapsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MapsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MapsPackage init() {
		if (isInited) return (MapsPackage)EPackage.Registry.INSTANCE.getEPackage(MapsPackage.eNS_URI);

		// Obtain or create and register package
		MapsPackageImpl theMapsPackage = (MapsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MapsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MapsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMapsPackage.createPackageContents();

		// Initialize created meta-data
		theMapsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMapsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MapsPackage.eNS_URI, theMapsPackage);
		return theMapsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateToStringMapEntry() {
		return dateToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateToStringMapEntry_Key() {
		return (EAttribute)dateToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateToStringMapEntry_Value() {
		return (EAttribute)dateToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumToStringMapEntry() {
		return enumToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumToStringMapEntry_Key() {
		return (EAttribute)enumToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumToStringMapEntry_Value() {
		return (EAttribute)enumToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImages() {
		return imagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImages_ImageFiles() {
		return (EReference)imagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImages_ImageTypeNames() {
		return (EReference)imagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImages_ImageDateDescriptions() {
		return (EReference)imagesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImages_PhotoParts() {
		return (EReference)imagesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotoPart() {
		return photoPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoPart_Name() {
		return (EAttribute)photoPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToPartMapEntry() {
		return stringToPartMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToPartMapEntry_Key() {
		return (EReference)stringToPartMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToPartMapEntry_Value() {
		return (EAttribute)stringToPartMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMapEntry() {
		return stringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMapEntry_Key() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMapEntry_Value() {
		return (EAttribute)stringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumType() {
		return enumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnumTypeObject() {
		return enumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMyDate() {
		return myDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsFactory getMapsFactory() {
		return (MapsFactory)getEFactoryInstance();
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
		dateToStringMapEntryEClass = createEClass(DATE_TO_STRING_MAP_ENTRY);
		createEAttribute(dateToStringMapEntryEClass, DATE_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(dateToStringMapEntryEClass, DATE_TO_STRING_MAP_ENTRY__VALUE);

		enumToStringMapEntryEClass = createEClass(ENUM_TO_STRING_MAP_ENTRY);
		createEAttribute(enumToStringMapEntryEClass, ENUM_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(enumToStringMapEntryEClass, ENUM_TO_STRING_MAP_ENTRY__VALUE);

		imagesEClass = createEClass(IMAGES);
		createEReference(imagesEClass, IMAGES__IMAGE_FILES);
		createEReference(imagesEClass, IMAGES__IMAGE_TYPE_NAMES);
		createEReference(imagesEClass, IMAGES__IMAGE_DATE_DESCRIPTIONS);
		createEReference(imagesEClass, IMAGES__PHOTO_PARTS);

		photoPartEClass = createEClass(PHOTO_PART);
		createEAttribute(photoPartEClass, PHOTO_PART__NAME);

		stringToPartMapEntryEClass = createEClass(STRING_TO_PART_MAP_ENTRY);
		createEReference(stringToPartMapEntryEClass, STRING_TO_PART_MAP_ENTRY__KEY);
		createEAttribute(stringToPartMapEntryEClass, STRING_TO_PART_MAP_ENTRY__VALUE);

		stringToStringMapEntryEClass = createEClass(STRING_TO_STRING_MAP_ENTRY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(stringToStringMapEntryEClass, STRING_TO_STRING_MAP_ENTRY__VALUE);

		// Create enums
		enumTypeEEnum = createEEnum(ENUM_TYPE);

		// Create data types
		enumTypeObjectEDataType = createEDataType(ENUM_TYPE_OBJECT);
		myDateEDataType = createEDataType(MY_DATE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dateToStringMapEntryEClass, Map.Entry.class, "DateToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateToStringMapEntry_Key(), this.getMyDate(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateToStringMapEntry_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumToStringMapEntryEClass, Map.Entry.class, "EnumToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumToStringMapEntry_Key(), this.getEnumType(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumToStringMapEntry_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagesEClass, Images.class, "Images", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImages_ImageFiles(), this.getStringToStringMapEntry(), null, "imageFiles", null, 0, -1, Images.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImages_ImageTypeNames(), this.getEnumToStringMapEntry(), null, "imageTypeNames", null, 0, -1, Images.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImages_ImageDateDescriptions(), this.getDateToStringMapEntry(), null, "imageDateDescriptions", null, 0, -1, Images.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImages_PhotoParts(), this.getStringToPartMapEntry(), null, "photoParts", null, 0, -1, Images.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoPartEClass, PhotoPart.class, "PhotoPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoPart_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PhotoPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToPartMapEntryEClass, Map.Entry.class, "StringToPartMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringToPartMapEntry_Key(), this.getPhotoPart(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToPartMapEntry_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEntryEClass, Map.Entry.class, "StringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMapEntry_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMapEntry_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumTypeEEnum, EnumType.class, "EnumType");
		addEEnumLiteral(enumTypeEEnum, EnumType.VAL1);
		addEEnumLiteral(enumTypeEEnum, EnumType.VAL2);

		// Initialize data types
		initEDataType(enumTypeObjectEDataType, EnumType.class, "EnumTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(myDateEDataType, Date.class, "MyDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (dateToStringMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "DateToStringMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDateToStringMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getDateToStringMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (enumToStringMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "EnumToStringMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEnumToStringMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getEnumToStringMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (enumTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "enumType"
		   });		
		addAnnotation
		  (enumTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "enumType:Object",
			 "baseType", "enumType"
		   });		
		addAnnotation
		  (imagesEClass, 
		   source, 
		   new String[] {
			 "name", "Images",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getImages_ImageFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageFiles"
		   });		
		addAnnotation
		  (getImages_ImageTypeNames(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageTypeNames"
		   });		
		addAnnotation
		  (getImages_ImageDateDescriptions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageDateDescriptions"
		   });			
		addAnnotation
		  (getImages_PhotoParts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "photoParts"
		   });		
		addAnnotation
		  (myDateEDataType, 
		   source, 
		   new String[] {
			 "name", "myDate"
		   });		
		addAnnotation
		  (photoPartEClass, 
		   source, 
		   new String[] {
			 "name", "PhotoPart",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPhotoPart_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (stringToPartMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "StringToPartMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStringToPartMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getStringToPartMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (stringToStringMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "StringToStringMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStringToStringMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getStringToStringMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
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
		  (getImages_ImageFiles(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@ElementCollection\n\t\t\t\t\t\t@MapKeyColumn(name=\"IMAGE_NAME\")\n\t\t\t\t\t\t@Column(name=\"IMAGE_FILENAME\")\n\t\t\t\t\t\t@CollectionTable(name=\"IMAGE_MAPPING\")\n\t\t\t\t\t"
		   });					
		addAnnotation
		  (getImages_PhotoParts(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@MapKeyJoinColumn(name=\"PARTS_NAME\")\n\t\t\t\t\t\t@CollectionTable(name=\"PHOTOPARTS_MAP\")\n\t\t\t\t\t"
		   });										
	}

} //MapsPackageImpl
