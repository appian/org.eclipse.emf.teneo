/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyPackageImpl.java,v 1.2 2009/06/30 05:30:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.any.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.annotations.any.GlobalObjectType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnyPackageImpl extends EPackageImpl implements AnyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalObjectTypeEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnyPackageImpl() {
		super(eNS_URI, AnyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnyPackage init() {
		if (isInited) return (AnyPackage)EPackage.Registry.INSTANCE.getEPackage(AnyPackage.eNS_URI);

		// Obtain or create and register package
		AnyPackageImpl theAnyPackage = (AnyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnyPackage.createPackageContents();

		// Initialize created meta-data
		theAnyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnyPackage.eNS_URI, theAnyPackage);
		return theAnyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyObject() {
		return anyObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_Id() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_GlobalInt() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_GlobalString() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnyObject_AnyOne() {
		return (EReference)anyObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_Any() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_Group() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyObject_Any1() {
		return (EAttribute)anyObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GlobalInt() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GlobalObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_GlobalString() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalObjectType() {
		return globalObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalObjectType_Id() {
		return (EAttribute)globalObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalObjectType_Name() {
		return (EAttribute)globalObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyFactory getAnyFactory() {
		return (AnyFactory)getEFactoryInstance();
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
		anyObjectEClass = createEClass(ANY_OBJECT);
		createEAttribute(anyObjectEClass, ANY_OBJECT__ID);
		createEAttribute(anyObjectEClass, ANY_OBJECT__GLOBAL_INT);
		createEAttribute(anyObjectEClass, ANY_OBJECT__GLOBAL_STRING);
		createEReference(anyObjectEClass, ANY_OBJECT__ANY_ONE);
		createEAttribute(anyObjectEClass, ANY_OBJECT__ANY);
		createEAttribute(anyObjectEClass, ANY_OBJECT__GROUP);
		createEAttribute(anyObjectEClass, ANY_OBJECT__ANY1);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GLOBAL_INT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GLOBAL_OBJECT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__GLOBAL_STRING);

		globalObjectTypeEClass = createEClass(GLOBAL_OBJECT_TYPE);
		createEAttribute(globalObjectTypeEClass, GLOBAL_OBJECT_TYPE__ID);
		createEAttribute(globalObjectTypeEClass, GLOBAL_OBJECT_TYPE__NAME);
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
		initEClass(anyObjectEClass, AnyObject.class, "AnyObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyObject_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyObject_GlobalInt(), theXMLTypePackage.getInt(), "globalInt", null, 0, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyObject_GlobalString(), theXMLTypePackage.getString(), "globalString", null, 0, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnyObject_AnyOne(), ecorePackage.getEObject(), null, "anyOne", null, 1, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyObject_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyObject_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AnyObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyObject_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, AnyObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GlobalInt(), theXMLTypePackage.getInt(), "globalInt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GlobalObject(), this.getGlobalObjectType(), null, "globalObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_GlobalString(), theXMLTypePackage.getString(), "globalString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(globalObjectTypeEClass, GlobalObjectType.class, "GlobalObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalObjectType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, GlobalObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalObjectType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, GlobalObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (anyObjectEClass, 
		   source, 
		   new String[] {
			 "name", "AnyObject",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getAnyObject_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getAnyObject_GlobalInt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalInt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnyObject_GlobalString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalString",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAnyObject_AnyOne(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "anyOne"
		   });			
		addAnnotation
		  (getAnyObject_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "lax"
		   });		
		addAnnotation
		  (getAnyObject_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:5"
		   });			
		addAnnotation
		  (getAnyObject_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":6",
			 "processing", "lax",
			 "group", "#group:5"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_GlobalInt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalInt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GlobalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalObject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GlobalString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalString",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (globalObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "globalObject_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getGlobalObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getGlobalObjectType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
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
		  (getAnyObject_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });					
		addAnnotation
		  (getAnyObject_AnyOne(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t)\n\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getAnyObject_Any(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t)\n\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getAnyObject_Any1(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t\t@Any( metaColumn = @Column( name =\n\t\t\t\t\t\t\t\"any_type\" ), fetch=FetchType.EAGER\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\t@AnyMetaDef(idType =\n\t\t\t\t\t\t\t\"string\",metaType = \"string\") \n\t\t\t\t\t"
		   });											
		addAnnotation
		  (getGlobalObjectType_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
	}

} //AnyPackageImpl
