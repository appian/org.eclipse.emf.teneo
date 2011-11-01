/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247939PackageImpl.java,v 1.1 2008/09/20 21:20:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247939.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz247939.Animal;
import org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Factory;
import org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package;
import org.eclipse.emf.teneo.samples.issues.bz247939.Cat;
import org.eclipse.emf.teneo.samples.issues.bz247939.Owner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz247939PackageImpl extends EPackageImpl implements Bz247939Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz247939.Bz247939Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz247939PackageImpl() {
		super(eNS_URI, Bz247939Factory.eINSTANCE);
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
	public static Bz247939Package init() {
		if (isInited) return (Bz247939Package)EPackage.Registry.INSTANCE.getEPackage(Bz247939Package.eNS_URI);

		// Obtain or create and register package
		Bz247939PackageImpl theBz247939Package = (Bz247939PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Bz247939PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Bz247939PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz247939Package.createPackageContents();

		// Initialize created meta-data
		theBz247939Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz247939Package.freeze();

		return theBz247939Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimal() {
		return animalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimal_Id() {
		return (EAttribute)animalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwner() {
		return ownerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwner_Id() {
		return (EAttribute)ownerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwner_Name() {
		return (EAttribute)ownerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOwner_OwnedCats() {
		return (EReference)ownerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCat() {
		return catEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCat_Owner() {
		return (EReference)catEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz247939Factory getBz247939Factory() {
		return (Bz247939Factory)getEFactoryInstance();
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
		animalEClass = createEClass(ANIMAL);
		createEAttribute(animalEClass, ANIMAL__ID);

		ownerEClass = createEClass(OWNER);
		createEAttribute(ownerEClass, OWNER__ID);
		createEAttribute(ownerEClass, OWNER__NAME);
		createEReference(ownerEClass, OWNER__OWNED_CATS);

		catEClass = createEClass(CAT);
		createEReference(catEClass, CAT__OWNER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catEClass.getESuperTypes().add(this.getAnimal());

		// Initialize classes and features; add operations and parameters
		initEClass(animalEClass, Animal.class, "Animal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimal_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwner_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwner_Name(), ecorePackage.getEString(), "name", null, 0, 1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOwner_OwnedCats(), this.getCat(), this.getCat_Owner(), "ownedCats", null, 0, -1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catEClass, Cat.class, "Cat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCat_Owner(), this.getOwner(), this.getOwner_OwnedCats(), "owner", null, 0, 1, Cat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
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
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", ""
		   });		
		addAnnotation
		  (animalEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\r\n@Table(name = \"ANIMAL\")\r\n@Inheritance(strategy = InheritanceType.SINGLE_TABLE)\r\n@DiscriminatorValue(\"Animal\")\r\n@DiscriminatorColumn(name = \"ANIMAL_TYPE\", discriminatorType = DiscriminatorType.STRING)\r\n"
		   });		
		addAnnotation
		  (getAnimal_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id\r\n@Column(name = \"ANIMAL_ID\")\r\n@GeneratedValue\r\n"
		   });		
		addAnnotation
		  (ownerEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\r\n@Table(name = \"OWNER\")"
		   });		
		addAnnotation
		  (getOwner_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id\r\n@Column(name = \"OWNER_ID\")\r\n@GeneratedValue\r\n"
		   });		
		addAnnotation
		  (getOwner_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name = \"NAME\")"
		   });		
		addAnnotation
		  (getOwner_OwnedCats(), 
		   source, 
		   new String[] {
			 "appinfo", "@OneToMany(mappedBy = \"owner\", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.PERSIST}, indexed = false)\r\n"
		   });		
		addAnnotation
		  (catEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\r\n@SecondaryTable(name = \"CAT\", pkJoinColumns={@PrimaryKeyJoinColumn(name=\"ANIMAL_ID\")})\r\n@DiscriminatorValue(\"Cat\")"
		   });		
		addAnnotation
		  (getCat_Owner(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})\r\n@JoinColumn(table = \"CAT\", name = \"CAT_OWNER_ID\")"
		   });
	}

} //Bz247939PackageImpl
