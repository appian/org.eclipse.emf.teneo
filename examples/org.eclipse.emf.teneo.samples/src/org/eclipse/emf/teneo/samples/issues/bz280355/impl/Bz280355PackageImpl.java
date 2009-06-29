/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz280355PackageImpl.java,v 1.1 2009/06/29 22:54:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz280355.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Factory;
import org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Package;
import org.eclipse.emf.teneo.samples.issues.bz280355.Leiter;
import org.eclipse.emf.teneo.samples.issues.bz280355.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz280355PackageImpl extends EPackageImpl implements Bz280355Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leiterEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz280355.Bz280355Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz280355PackageImpl() {
		super(eNS_URI, Bz280355Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz280355Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz280355Package init() {
		if (isInited) return (Bz280355Package)EPackage.Registry.INSTANCE.getEPackage(Bz280355Package.eNS_URI);

		// Obtain or create and register package
		Bz280355PackageImpl theBz280355Package = (Bz280355PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz280355PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz280355PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz280355Package.createPackageContents();

		// Initialize created meta-data
		theBz280355Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz280355Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz280355Package.eNS_URI, theBz280355Package);
		return theBz280355Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeiter() {
		return leiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeiter_Id() {
		return (EAttribute)leiterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeiter_Version() {
		return (EAttribute)leiterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeiter_Person() {
		return (EReference)leiterEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getPerson_Version() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz280355Factory getBz280355Factory() {
		return (Bz280355Factory)getEFactoryInstance();
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
		leiterEClass = createEClass(LEITER);
		createEAttribute(leiterEClass, LEITER__ID);
		createEAttribute(leiterEClass, LEITER__VERSION);
		createEReference(leiterEClass, LEITER__PERSON);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__ID);
		createEAttribute(personEClass, PERSON__VERSION);
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
		initEClass(leiterEClass, Leiter.class, "Leiter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeiter_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Leiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeiter_Version(), theXMLTypePackage.getLong(), "version", null, 1, 1, Leiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLeiter_Person(), this.getPerson(), null, "person", null, 1, 1, Leiter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Version(), theXMLTypePackage.getLong(), "version", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (leiterEClass, 
		   source, 
		   new String[] {
			 "name", "Leiter",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLeiter_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getLeiter_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (getLeiter_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "person"
		   });		
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
		  (getPerson_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
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
		  (getLeiter_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id @GeneratedValue"
		   });			
		addAnnotation
		  (getLeiter_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });					
		addAnnotation
		  (getPerson_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id @GeneratedValue"
		   });			
		addAnnotation
		  (getPerson_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });	
	}

} //Bz280355PackageImpl
