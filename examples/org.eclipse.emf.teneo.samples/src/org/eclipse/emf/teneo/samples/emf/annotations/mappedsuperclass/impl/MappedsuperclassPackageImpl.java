/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassPackageImpl.java,v 1.2 2006/09/29 12:30:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.Document;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.ParentDocument;
import org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.SpecificDocument;

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
	public static MappedsuperclassPackage init() {
		if (isInited) return (MappedsuperclassPackage)EPackage.Registry.INSTANCE.getEPackage(MappedsuperclassPackage.eNS_URI);

		// Obtain or create and register package
		MappedsuperclassPackageImpl theMappedsuperclassPackage = (MappedsuperclassPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MappedsuperclassPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MappedsuperclassPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMappedsuperclassPackage.createPackageContents();

		// Initialize created meta-data
		theMappedsuperclassPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappedsuperclassPackage.freeze();

		return theMappedsuperclassPackage;
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
	public EAttribute getDocument_MyId() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_MyGenericInfo() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
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
		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__MY_ID);
		createEAttribute(documentEClass, DOCUMENT__MY_GENERIC_INFO);

		parentDocumentEClass = createEClass(PARENT_DOCUMENT);
		createEAttribute(parentDocumentEClass, PARENT_DOCUMENT__MY_NAME);

		specificDocumentEClass = createEClass(SPECIFIC_DOCUMENT);
		createEAttribute(specificDocumentEClass, SPECIFIC_DOCUMENT__MY_SPECIFIC_INFO);
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
		parentDocumentEClass.getESuperTypes().add(this.getDocument());
		specificDocumentEClass.getESuperTypes().add(this.getParentDocument());

		// Initialize classes and features; add operations and parameters
		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_MyId(), theXMLTypePackage.getLong(), "myId", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_MyGenericInfo(), theXMLTypePackage.getString(), "myGenericInfo", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentDocumentEClass, ParentDocument.class, "ParentDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParentDocument_MyName(), theXMLTypePackage.getString(), "myName", null, 1, 1, ParentDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificDocumentEClass, SpecificDocument.class, "SpecificDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificDocument_MySpecificInfo(), theXMLTypePackage.getString(), "mySpecificInfo", null, 1, 1, SpecificDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (documentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@MappedSuperclass"
		   });			
		addAnnotation
		  (getDocument_MyId(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });				
		addAnnotation
		  (parentDocumentEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@MappedSuperclass"
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
		  (documentEClass, 
		   source, 
		   new String[] {
			 "name", "Document",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDocument_MyId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myId"
		   });		
		addAnnotation
		  (getDocument_MyGenericInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myGenericInfo"
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
	}

} //MappedsuperclassPackageImpl
