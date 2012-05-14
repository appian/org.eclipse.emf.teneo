/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Address;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.HumanClone;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Name;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.PersonIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapsidPackageImpl extends EPackageImpl implements MapsidPackage {
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
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanCloneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personIdentifierEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MapsidPackageImpl() {
		super(eNS_URI, MapsidFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MapsidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MapsidPackage init() {
		if (isInited) return (MapsidPackage)EPackage.Registry.INSTANCE.getEPackage(MapsidPackage.eNS_URI);

		// Obtain or create and register package
		MapsidPackageImpl theMapsidPackage = (MapsidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MapsidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MapsidPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMapsidPackage.createPackageContents();

		// Initialize created meta-data
		theMapsidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMapsidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MapsidPackage.eNS_URI, theMapsidPackage);
		return theMapsidPackage;
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
	public EAttribute getAddress_Id() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Id() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Address() {
		return (EReference)houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHuman_Name() {
		return (EReference)humanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHuman_HumanClone() {
		return (EReference)humanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanClone() {
		return humanCloneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanClone_Name() {
		return (EReference)humanCloneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_FirstName() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_LastName() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(1);
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
	public EReference getPerson_Name() {
		return (EReference)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Identifier() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonIdentifier() {
		return personIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonIdentifier_Name() {
		return (EAttribute)personIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsidFactory getMapsidFactory() {
		return (MapsidFactory)getEFactoryInstance();
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
		createEAttribute(addressEClass, ADDRESS__ID);

		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__ID);
		createEReference(houseEClass, HOUSE__ADDRESS);

		humanEClass = createEClass(HUMAN);
		createEReference(humanEClass, HUMAN__NAME);
		createEReference(humanEClass, HUMAN__HUMAN_CLONE);

		humanCloneEClass = createEClass(HUMAN_CLONE);
		createEReference(humanCloneEClass, HUMAN_CLONE__NAME);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__FIRST_NAME);
		createEAttribute(nameEClass, NAME__LAST_NAME);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__IDENTIFIER);

		personIdentifierEClass = createEClass(PERSON_IDENTIFIER);
		createEAttribute(personIdentifierEClass, PERSON_IDENTIFIER__NAME);
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
		initEAttribute(getAddress_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Address(), this.getAddress(), null, "address", null, 1, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHuman_Name(), this.getName_(), null, "name", null, 1, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHuman_HumanClone(), this.getHumanClone(), null, "humanClone", null, 1, 1, Human.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanCloneEClass, HumanClone.class, "HumanClone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanClone_Name(), this.getName_(), null, "name", null, 1, 1, HumanClone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_FirstName(), theXMLTypePackage.getString(), "firstName", null, 1, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getName_LastName(), theXMLTypePackage.getString(), "lastName", null, 1, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Name(), this.getName_(), null, "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Identifier(), this.getPersonIdentifier(), null, "identifier", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personIdentifierEClass, PersonIdentifier.class, "PersonIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonIdentifier_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PersonIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (getAddress_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id @GeneratedValue"
		   });				
		addAnnotation
		  (getHouse_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });			
		addAnnotation
		  (getHouse_Address(), 
		   source, 
		   new String[] {
			 "appinfo", "@MapsId"
		   });				
		addAnnotation
		  (getHuman_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@EmbeddedId"
		   });			
		addAnnotation
		  (getHuman_HumanClone(), 
		   source, 
		   new String[] {
			 "appinfo", "@MapsId"
		   });				
		addAnnotation
		  (getHumanClone_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@EmbeddedId"
		   });			
		addAnnotation
		  (nameEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Embeddable"
		   });						
		addAnnotation
		  (getPerson_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@EmbeddedId"
		   });			
		addAnnotation
		  (getPerson_Identifier(), 
		   source, 
		   new String[] {
			 "appinfo", "@MapsId(\"firstName\")"
		   });				
		addAnnotation
		  (getPersonIdentifier_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
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
		  (getAddress_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });		
		addAnnotation
		  (houseEClass, 
		   source, 
		   new String[] {
			 "name", "House",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getHouse_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getHouse_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address"
		   });		
		addAnnotation
		  (humanEClass, 
		   source, 
		   new String[] {
			 "name", "Human",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getHuman_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getHuman_HumanClone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "humanClone"
		   });		
		addAnnotation
		  (humanCloneEClass, 
		   source, 
		   new String[] {
			 "name", "HumanClone",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getHumanClone_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (nameEClass, 
		   source, 
		   new String[] {
			 "name", "Name",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getName_FirstName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstName"
		   });		
		addAnnotation
		  (getName_LastName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastName"
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "Person",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPerson_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getPerson_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "identifier"
		   });		
		addAnnotation
		  (personIdentifierEClass, 
		   source, 
		   new String[] {
			 "name", "PersonIdentifier",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getPersonIdentifier_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

} //MapsidPackageImpl
