/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarPackageImpl.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.CarFactory;
import com.example.car.CarFrame;
import com.example.car.CarLink;
import com.example.car.CarPackage;
import com.example.car.CarTire;
import com.example.car.CarType;
import com.example.car.CarWheel;
import com.example.car.CarsList;
import com.example.car.DocumentRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class CarPackageImpl extends EPackageImpl implements CarPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carFrameEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carLinkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carsListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carTireEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carWheelEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
	 * value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init
	 * init()}, which also performs initialization of the package, or returns the registered package,
	 * if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.example.car.CarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CarPackageImpl() {
		super(eNS_URI, CarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends. Simple dependencies are satisfied by calling this method on all dependent
	 * packages before doing anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not yet been registered by
	 * their URI values are first created and registered. The packages are then initialized in two
	 * steps: meta-model objects for all of the packages are created before any are initialized, since
	 * one package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already been initialized. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CarPackage init() {
		if (isInited)
			return (CarPackage) EPackage.Registry.INSTANCE.getEPackage(CarPackage.eNS_URI);

		// Obtain or create and register package
		CarPackageImpl theCarPackage = (CarPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof CarPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) : new CarPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCarPackage.createPackageContents();

		// Initialize created meta-data
		theCarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCarPackage.freeze();

		return theCarPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarFrame() {
		return carFrameEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarFrame_CarWheel() {
		return (EReference) carFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarFrame_CarLinkRef() {
		return (EReference) carFrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarFrame_Name() {
		return (EAttribute) carFrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarLink() {
		return carLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarLink_CarLinkId() {
		return (EAttribute) carLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarLink_Name() {
		return (EAttribute) carLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarsList() {
		return carsListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarsList_CarType() {
		return (EReference) carsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarsList_CarLink() {
		return (EReference) carsListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarTire() {
		return carTireEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarTire_Name() {
		return (EAttribute) carTireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarType() {
		return carTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarType_CarFrame() {
		return (EReference) carTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarType_CarID() {
		return (EAttribute) carTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCarWheel() {
		return carWheelEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCarWheel_CarTire() {
		return (EReference) carWheelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCarWheel_Name() {
		return (EAttribute) carWheelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentRoot_CarsList() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarFactory getCarFactory() {
		return (CarFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		carFrameEClass = createEClass(CAR_FRAME);
		createEReference(carFrameEClass, CAR_FRAME__CAR_WHEEL);
		createEReference(carFrameEClass, CAR_FRAME__CAR_LINK_REF);
		createEAttribute(carFrameEClass, CAR_FRAME__NAME);

		carLinkEClass = createEClass(CAR_LINK);
		createEAttribute(carLinkEClass, CAR_LINK__CAR_LINK_ID);
		createEAttribute(carLinkEClass, CAR_LINK__NAME);

		carsListEClass = createEClass(CARS_LIST);
		createEReference(carsListEClass, CARS_LIST__CAR_TYPE);
		createEReference(carsListEClass, CARS_LIST__CAR_LINK);

		carTireEClass = createEClass(CAR_TIRE);
		createEAttribute(carTireEClass, CAR_TIRE__NAME);

		carTypeEClass = createEClass(CAR_TYPE);
		createEReference(carTypeEClass, CAR_TYPE__CAR_FRAME);
		createEAttribute(carTypeEClass, CAR_TYPE__CAR_ID);

		carWheelEClass = createEClass(CAR_WHEEL);
		createEReference(carWheelEClass, CAR_WHEEL__CAR_TIRE);
		createEAttribute(carWheelEClass, CAR_WHEEL__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CARS_LIST);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have
	 * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(carFrameEClass, CarFrame.class, "CarFrame", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarFrame_CarWheel(), this.getCarWheel(), null, "carWheel", null, 0, -1,
				CarFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarFrame_CarLinkRef(), this.getCarLink(), null, "carLinkRef", null, 0, 1,
				CarFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarFrame_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				CarFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carLinkEClass, CarLink.class, "CarLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarLink_CarLinkId(), theXMLTypePackage.getID(), "carLinkId", null, 1, 1,
				CarLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarLink_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				CarLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carsListEClass, CarsList.class, "CarsList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarsList_CarType(), this.getCarType(), null, "carType", null, 1, -1,
				CarsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCarsList_CarLink(), this.getCarLink(), null, "carLink", null, 0, -1,
				CarsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carTireEClass, CarTire.class, "CarTire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarTire_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, CarTire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(carTypeEClass, CarType.class, "CarType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarType_CarFrame(), this.getCarFrame(), null, "carFrame", null, 0, -1,
				CarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarType_CarID(), theXMLTypePackage.getID(), "carID", null, 1, 1,
				CarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carWheelEClass, CarWheel.class, "CarWheel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarWheel_CarTire(), this.getCarTire(), null, "carTire", null, 0, -1,
				CarWheel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarWheel_Name(), theXMLTypePackage.getString(), "name", null, 0, 1,
				CarWheel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0,
				-1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(),
				null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(),
				null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CarsList(), this.getCarsList(), null, "carsList", null, 0, -2,
				null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createNamespaceAnnotations() {
		String source = "http://www.w3.org/XML/1998/namespace";
		addAnnotation(this, source, new String[] { "lang", "en" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(carFrameEClass, source,
				new String[] { "name", "CarFrame", "kind", "elementOnly" });
		addAnnotation(getCarFrame_CarWheel(), source, new String[] { "kind", "element", "name",
				"carWheel", "namespace", "##targetNamespace" });
		addAnnotation(getCarFrame_CarLinkRef(), source, new String[] { "kind", "attribute", "name",
				"carLinkRef" });
		addAnnotation(getCarFrame_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(carLinkEClass, source, new String[] { "name", "CarLink", "kind", "empty" });
		addAnnotation(getCarLink_CarLinkId(), source, new String[] { "kind", "attribute", "name",
				"carLinkId" });
		addAnnotation(getCarLink_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(carsListEClass, source,
				new String[] { "name", "CarsList", "kind", "elementOnly" });
		addAnnotation(getCarsList_CarType(), source, new String[] { "kind", "element", "name",
				"carType", "namespace", "##targetNamespace" });
		addAnnotation(getCarsList_CarLink(), source, new String[] { "kind", "element", "name",
				"carLink", "namespace", "##targetNamespace" });
		addAnnotation(carTireEClass, source, new String[] { "name", "CarTire", "kind", "empty" });
		addAnnotation(getCarTire_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(carTypeEClass, source, new String[] { "name", "CarType", "kind", "elementOnly" });
		addAnnotation(getCarType_CarFrame(), source, new String[] { "kind", "element", "name",
				"carFrame", "namespace", "##targetNamespace" });
		addAnnotation(getCarType_CarID(), source, new String[] { "kind", "attribute", "name", "carID" });
		addAnnotation(carWheelEClass, source,
				new String[] { "name", "CarWheel", "kind", "elementOnly" });
		addAnnotation(getCarWheel_CarTire(), source, new String[] { "kind", "element", "name",
				"carTire", "namespace", "##targetNamespace" });
		addAnnotation(getCarWheel_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard",
				"name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source, new String[] { "kind", "attribute",
				"name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source, new String[] { "kind", "attribute",
				"name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_CarsList(), source, new String[] { "kind", "element", "name",
				"carsList", "namespace", "##targetNamespace" });
	}

} // CarPackageImpl
