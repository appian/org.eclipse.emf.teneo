/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablehibernatePackageImpl.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.Person;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernateFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondarytablehibernatePackageImpl extends EPackageImpl implements SecondarytablehibernatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecondarytablehibernatePackageImpl() {
		super(eNS_URI, SecondarytablehibernateFactory.eINSTANCE);
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
	public static SecondarytablehibernatePackage init() {
		if (isInited) return (SecondarytablehibernatePackage)EPackage.Registry.INSTANCE.getEPackage(SecondarytablehibernatePackage.eNS_URI);

		// Obtain or create and register package
		SecondarytablehibernatePackageImpl theSecondarytablehibernatePackage = (SecondarytablehibernatePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SecondarytablehibernatePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SecondarytablehibernatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecondarytablehibernatePackage.createPackageContents();

		// Initialize created meta-data
		theSecondarytablehibernatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecondarytablehibernatePackage.freeze();

		return theSecondarytablehibernatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Id() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Address() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Photo() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytablehibernateFactory getSecondarytablehibernateFactory() {
		return (SecondarytablehibernateFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__ID);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__ADDRESS);
		createEAttribute(personEClass, PERSON__PHOTO);
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

		// Initialize classes and features; add operations and parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Photo(), theXMLTypePackage.getBase64Binary(), "photo", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://annotation.elver.org/SecondaryTables
		createSecondaryTablesAnnotations();
		// http://annotation.elver.org/SecondaryTable/st1
		createSt1Annotations();
		// http://annotation.elver.org/SecondaryTable/st2
		createSt2Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://annotation.elver.org/Id
		createIdAnnotations();
		// http://annotation.elver.org/Lob
		createLobAnnotations();
		// http://annotation.elver.org/Column
		createColumnAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/SecondaryTables</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSecondaryTablesAnnotations() {
		String source = "http://annotation.elver.org/SecondaryTables";		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "value", "st1 st2"
		   });												
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/SecondaryTable/st1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSt1Annotations() {
		String source = "http://annotation.elver.org/SecondaryTable/st1";			
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "person_address"
		   });											
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/SecondaryTable/st2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSt2Annotations() {
		String source = "http://annotation.elver.org/SecondaryTable/st2";				
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "person_photo"
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
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "Person",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPerson_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (getPerson_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });				
		addAnnotation
		  (getPerson_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address"
		   });				
		addAnnotation
		  (getPerson_Photo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "photo"
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
		  (getPerson_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });								
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Lob</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLobAnnotations() {
		String source = "http://annotation.elver.org/Lob";									
		addAnnotation
		  (getPerson_Address(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });				
		addAnnotation
		  (getPerson_Photo(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createColumnAnnotations() {
		String source = "http://annotation.elver.org/Column";										
		addAnnotation
		  (getPerson_Address(), 
		   source, 
		   new String[] {
			 "table", "person_address"
		   });				
		addAnnotation
		  (getPerson_Photo(), 
		   source, 
		   new String[] {
			 "length", "1000000",
			 "table", "person_photo"
		   });	
	}

} //SecondarytablehibernatePackageImpl
