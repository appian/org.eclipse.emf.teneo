/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassPackageImpl.java,v 1.6 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.AddIDDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.TestReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappedsuperclassPackageImpl extends EPackageImpl implements MappedsuperclassPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addIDDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testReferenceEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappedsuperclassPackageImpl() {
		super(eNS_URI, MappedsuperclassFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappedsuperclassPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappedsuperclassPackage init() {
		if (isInited) return (MappedsuperclassPackage)EPackage.Registry.INSTANCE.getEPackage(MappedsuperclassPackage.eNS_URI);

		// Obtain or create and register package
		MappedsuperclassPackageImpl theMappedsuperclassPackage = (MappedsuperclassPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MappedsuperclassPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MappedsuperclassPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMappedsuperclassPackage.createPackageContents();

		// Initialize created meta-data
		theMappedsuperclassPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappedsuperclassPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappedsuperclassPackage.eNS_URI, theMappedsuperclassPackage);
		return theMappedsuperclassPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddIDDocument() {
		return addIDDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIDDocument_Name() {
		return (EAttribute)addIDDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_MyGenericInfo() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_MyTestReference() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentDocument() {
		return parentDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParentDocument_MyName() {
		return (EAttribute)parentDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDocument() {
		return specificDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificDocument_MySpecificInfo() {
		return (EAttribute)specificDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestReference() {
		return testReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestReference_Name() {
		return (EAttribute)testReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedsuperclassFactory getMappedsuperclassFactory() {
		return (MappedsuperclassFactory)getEFactoryInstance();
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
		addIDDocumentEClass = createEClass(ADD_ID_DOCUMENT);
		createEAttribute(addIDDocumentEClass, ADD_ID_DOCUMENT__NAME);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__MY_GENERIC_INFO);
		createEReference(documentEClass, DOCUMENT__MY_TEST_REFERENCE);

		parentDocumentEClass = createEClass(PARENT_DOCUMENT);
		createEAttribute(parentDocumentEClass, PARENT_DOCUMENT__MY_NAME);

		specificDocumentEClass = createEClass(SPECIFIC_DOCUMENT);
		createEAttribute(specificDocumentEClass, SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO);

		testReferenceEClass = createEClass(TEST_REFERENCE);
		createEAttribute(testReferenceEClass, TEST_REFERENCE__NAME);
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
		addIDDocumentEClass.getESuperTypes().add(this.getDocument());
		parentDocumentEClass.getESuperTypes().add(this.getDocument());
		specificDocumentEClass.getESuperTypes().add(this.getParentDocument());

		// Initialize classes and features; add operations and parameters
		initEClass(addIDDocumentEClass, AddIDDocument.class, "AddIDDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddIDDocument_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AddIDDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_MyGenericInfo(), theXMLTypePackage.getString(), "myGenericInfo", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_MyTestReference(), this.getTestReference(), null, "myTestReference", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentDocumentEClass, ParentDocument.class, "ParentDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParentDocument_MyName(), theXMLTypePackage.getString(), "myName", null, 1, 1, ParentDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificDocumentEClass, SpecificDocument.class, "SpecificDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificDocument_MySpecificInfo(), theXMLTypePackage.getString(), "mySpecificInfo", null, 1, 1, SpecificDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testReferenceEClass, TestReference.class, "TestReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestReference_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TestReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa.auditing
		createTeneo_1Annotations();
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
		  (addIDDocumentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity"
		   });				
		addAnnotation
		  (documentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@MappedSuperclass"
		   });					
		addAnnotation
		  (parentDocumentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity @MappedSuperclass"
		   });			
		addAnnotation
		  (getParentDocument_MyName(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t     @Column(name=XXX,nullable=\"false\")\n\t\t\t\t\t    "
		   });			
		addAnnotation
		  (specificDocumentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\n       @AttributeOverrides({@AttributeOverride(name=\"myName\",  \n\t\tcolumn=@Column(name=\"PARENTDOCUMENT_NAME\", length=\"50\"))})\n\t\t\t"
		   });					
		addAnnotation
		  (testReferenceEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity"
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
		  (addIDDocumentEClass, 
		   source, 
		   new String[] {
			 "name", "AddIDDocument",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddIDDocument_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (documentEClass, 
		   source, 
		   new String[] {
			 "name", "Document",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocument_MyGenericInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myGenericInfo"
		   });		
		addAnnotation
		  (getDocument_MyTestReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myTestReference"
		   });			
		addAnnotation
		  (parentDocumentEClass, 
		   source, 
		   new String[] {
			 "name", "ParentDocument",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getParentDocument_MyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myName"
		   });				
		addAnnotation
		  (specificDocumentEClass, 
		   source, 
		   new String[] {
			 "name", "SpecificDocument",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpecificDocument_MySpecificInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mySpecificInfo"
		   });			
		addAnnotation
		  (testReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "TestReference",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTestReference_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa.auditing</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_1Annotations() {
		String source = "teneo.jpa.auditing";														
		addAnnotation
		  (specificDocumentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\n       @AttributeOverrides({@AttributeOverride(name=\"myName\",  \n\t\tcolumn=@Column(name=\"PARENTDOCUMENT_NAME\", length=\"50\"))})\n\t\t\t"
		   });					
	}

} //MappedsuperclassPackageImpl
