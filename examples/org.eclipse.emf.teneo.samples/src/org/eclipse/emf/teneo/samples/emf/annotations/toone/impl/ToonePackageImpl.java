/**
 * <copyright>
 * </copyright>
 *
 * $Id: ToonePackageImpl.java,v 1.4 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.toone.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.toone.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.Head;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.Person;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.TooneFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToonePackageImpl extends EPackageImpl implements ToonePackage {
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
	private EClass headEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.toone.ToonePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToonePackageImpl() {
		super(eNS_URI, TooneFactory.eINSTANCE);
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
	public static ToonePackage init() {
		if (isInited) return (ToonePackage)EPackage.Registry.INSTANCE.getEPackage(ToonePackage.eNS_URI);

		// Obtain or create and register package
		ToonePackageImpl theToonePackage = (ToonePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ToonePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ToonePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theToonePackage.createPackageContents();

		// Initialize created meta-data
		theToonePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToonePackage.freeze();

		return theToonePackage;
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
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHead() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHead_HairColor() {
		return (EAttribute)headEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHead_Person() {
		return (EReference)headEClass.getEStructuralFeatures().get(1);
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
	public EReference getPerson_Address() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Head() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooneFactory getTooneFactory() {
		return (TooneFactory)getEFactoryInstance();
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
		createEAttribute(addressEClass, ADDRESS__CITY);

		headEClass = createEClass(HEAD);
		createEAttribute(headEClass, HEAD__HAIR_COLOR);
		createEReference(headEClass, HEAD__PERSON);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__ADDRESS);
		createEReference(personEClass, PERSON__HEAD);
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
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_City(), theXMLTypePackage.getString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHead_HairColor(), theXMLTypePackage.getString(), "hairColor", null, 1, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHead_Person(), this.getPerson(), this.getPerson_Head(), "person", null, 1, 1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Address(), this.getAddress(), null, "address", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Head(), this.getHead(), this.getHead_Person(), "head", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getAddress_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "city"
		   });		
		addAnnotation
		  (headEClass, 
		   source, 
		   new String[] {
			 "name", "Head",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHead_HairColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hairColor"
		   });			
		addAnnotation
		  (getHead_Person(), 
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
		  (getPerson_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address"
		   });			
		addAnnotation
		  (getPerson_Head(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "head"
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
		  (getHead_Person(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@OneToOne(fetch=EAGER cascade={MERGE,PERSIST,REFRESH} targetEntity=\"Person\" optional=false mappedBy=\"head\")\n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getPerson_Address(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToOne(fetch=EAGER cascade={MERGE,PERSIST,REFRESH} targetEntity=\"Address\" optional=true)"
		   });			
		addAnnotation
		  (getPerson_Head(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToOne(fetch=EAGER cascade=ALL targetEntity=\"Head\" optional=true)"
		   });	
	}

} //ToonePackageImpl
