/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsertypePackageImpl.java,v 1.8 2007/03/04 21:18:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsertypePackageImpl extends EPackageImpl implements UsertypePackage {
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
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType phoneNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsertypePackageImpl() {
		super(eNS_URI, UsertypeFactory.eINSTANCE);
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
	public static UsertypePackage init() {
		if (isInited) return (UsertypePackage)EPackage.Registry.INSTANCE.getEPackage(UsertypePackage.eNS_URI);

		// Obtain or create and register package
		UsertypePackageImpl theUsertypePackage = (UsertypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UsertypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UsertypePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUsertypePackage.createPackageContents();

		// Initialize created meta-data
		theUsertypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsertypePackage.freeze();

		return theUsertypePackage;
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
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Numbers() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PhoneNumbers() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_EmergencyContact() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Addresses() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getAddress_AddressInfo() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Person() {
		return (EReference)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getName_() {
		return nameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhoneNumber() {
		return phoneNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsertypeFactory getUsertypeFactory() {
		return (UsertypeFactory)getEFactoryInstance();
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
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__NUMBERS);
		createEAttribute(personEClass, PERSON__PHONE_NUMBERS);
		createEAttribute(personEClass, PERSON__EMERGENCY_CONTACT);
		createEReference(personEClass, PERSON__ADDRESSES);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__ADDRESS_INFO);
		createEReference(addressEClass, ADDRESS__PERSON);

		// Create data types
		nameEDataType = createEDataType(NAME);
		phoneNumberEDataType = createEDataType(PHONE_NUMBER);
		intArrayEDataType = createEDataType(INT_ARRAY);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), this.getName_(), "name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Numbers(), this.getIntArray(), "numbers", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PhoneNumbers(), this.getPhoneNumber(), "phoneNumbers", null, 0, 100, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_EmergencyContact(), this.getPhoneNumber(), "emergencyContact", "", 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Addresses(), this.getAddress(), this.getAddress_Person(), "addresses", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_AddressInfo(), ecorePackage.getEString(), "addressInfo", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Person(), this.getPerson(), this.getPerson_Addresses(), "person", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(nameEDataType, Name.class, "Name", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(phoneNumberEDataType, UsaPhoneNumber.class, "PhoneNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intArrayEDataType, int[].class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (nameEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@TypeDef(name=\"nameType\" typeClass=\"org.eclipse.emf.teneo.samples.emf.hibernate.usertype.NameType\")\n\t\t\t\t\t\t@Columns({@Column(name=\"first_name\"), @Column(name=\"last_name\")})\n\t\t\t\t\t"
		   });						
		addAnnotation
		  (getPerson_Addresses(), 
		   source, 
		   new String[] {
			 "appinfo", "@OnDelete(action=OnDeleteAction.CASCADE)\n@OneToMany(indexed=false, unique=true)"
		   });			
		addAnnotation
		  (intArrayEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@TypeDef(name=\"intArrayType\" typeClass=\"org.eclipse.emf.teneo.hibernate.mapping.DefaultToStringUserType\", parameters={@Parameter(name=\"epackage\" value=\"http://www.elver.org/samples/emf/hibernate/usertype\"), @Parameter(name=\"edatatype\", value=\"IntArray\")})\n\t\t\t\t\t"
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
		  (nameEDataType, 
		   source, 
		   new String[] {
			 "name", "Name"
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
		  (getPerson_Numbers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "intArray"
		   });			
		addAnnotation
		  (intArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "IntArray"
		   });			
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "name", "Person",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddress_AddressInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

} //UsertypePackageImpl
