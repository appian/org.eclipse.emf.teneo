/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreattrsPackageImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Feature;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Mixed;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreattrsPackageImpl extends EPackageImpl implements EcoreattrsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameListEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreattrsPackageImpl() {
		super(eNS_URI, EcoreattrsFactory.eINSTANCE);
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
	public static EcoreattrsPackage init() {
		if (isInited) return (EcoreattrsPackage)EPackage.Registry.INSTANCE.getEPackage(EcoreattrsPackage.eNS_URI);

		// Obtain or create and register package
		EcoreattrsPackageImpl theEcoreattrsPackage = (EcoreattrsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EcoreattrsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EcoreattrsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcoreattrsPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreattrsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreattrsPackage.freeze();

		return theEcoreattrsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_NameMap() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Names() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_AMap() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Value() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMixed() {
		return mixedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixed_Mixed() {
		return (EAttribute)mixedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixed_Name() {
		return (EAttribute)mixedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMixed_Value() {
		return (EAttribute)mixedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameList() {
		return nameListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameList_FirstName() {
		return (EAttribute)nameListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameList_MiddleName() {
		return (EAttribute)nameListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameList_LastName() {
		return (EAttribute)nameListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreattrsFactory getEcoreattrsFactory() {
		return (EcoreattrsFactory)getEFactoryInstance();
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
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME_MAP);
		createEReference(elementEClass, ELEMENT__NAMES);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__AMAP);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEAttribute(featureEClass, FEATURE__VALUE);

		mixedEClass = createEClass(MIXED);
		createEAttribute(mixedEClass, MIXED__MIXED);
		createEAttribute(mixedEClass, MIXED__NAME);
		createEAttribute(mixedEClass, MIXED__VALUE);

		nameListEClass = createEClass(NAME_LIST);
		createEAttribute(nameListEClass, NAME_LIST__FIRST_NAME);
		createEAttribute(nameListEClass, NAME_LIST__MIDDLE_NAME);
		createEAttribute(nameListEClass, NAME_LIST__LAST_NAME);
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
		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_NameMap(), ecorePackage.getEFeatureMapEntry(), "nameMap", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Names(), this.getNameList(), null, "names", null, 1, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_AMap(), ecorePackage.getEFeatureMapEntry(), "aMap", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mixedEClass, Mixed.class, "Mixed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMixed_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Mixed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMixed_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Mixed.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMixed_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1, Mixed.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nameListEClass, NameList.class, "NameList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameList_FirstName(), theXMLTypePackage.getString(), "firstName", null, 1, 1, NameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameList_MiddleName(), theXMLTypePackage.getString(), "middleName", null, 1, 1, NameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameList_LastName(), theXMLTypePackage.getString(), "lastName", null, 1, 1, NameList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (elementEClass, 
		   source, 
		   new String[] {
			 "name", "element",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getElement_NameMap(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "names:group"
		   });		
		addAnnotation
		  (getElement_Names(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "names",
			 "group", "#names:group"
		   });		
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "name", "feature",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFeature_AMap(), 
		   source, 
		   new String[] {
			 "name", ":group",
			 "kind", "group"
		   });		
		addAnnotation
		  (getFeature_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "group", "#:group"
		   });		
		addAnnotation
		  (getFeature_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "group", "#:group"
		   });		
		addAnnotation
		  (mixedEClass, 
		   source, 
		   new String[] {
			 "name", "mixed",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getMixed_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getMixed_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getMixed_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (nameListEClass, 
		   source, 
		   new String[] {
			 "name", "nameList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNameList_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstName"
		   });		
		addAnnotation
		  (getNameList_MiddleName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "middleName"
		   });		
		addAnnotation
		  (getNameList_LastName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastName"
		   });
	}

} //EcoreattrsPackageImpl
