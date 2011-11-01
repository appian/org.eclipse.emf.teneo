/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247785SubPackageImpl.java,v 1.1 2008/09/20 21:20:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz247785.Bz247785Package;

import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubFactory;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubPackage;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat;

import org.eclipse.emf.teneo.samples.issues.bz247785.impl.Bz247785PackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz247785SubPackageImpl extends EPackageImpl implements Bz247785SubPackage {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz247785SubPackageImpl() {
		super(eNS_URI, Bz247785SubFactory.eINSTANCE);
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
	public static Bz247785SubPackage init() {
		if (isInited) return (Bz247785SubPackage)EPackage.Registry.INSTANCE.getEPackage(Bz247785SubPackage.eNS_URI);

		// Obtain or create and register package
		Bz247785SubPackageImpl theBz247785SubPackage = (Bz247785SubPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Bz247785SubPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Bz247785SubPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Bz247785PackageImpl theBz247785Package = (Bz247785PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Bz247785Package.eNS_URI) instanceof Bz247785PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Bz247785Package.eNS_URI) : Bz247785Package.eINSTANCE);

		// Create package meta-data objects
		theBz247785SubPackage.createPackageContents();
		theBz247785Package.createPackageContents();

		// Initialize created meta-data
		theBz247785SubPackage.initializePackageContents();
		theBz247785Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz247785SubPackage.freeze();

		return theBz247785SubPackage;
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
	public Bz247785SubFactory getBz247785SubFactory() {
		return (Bz247785SubFactory)getEFactoryInstance();
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

		// Obtain other dependent packages
		Bz247785Package theBz247785Package = (Bz247785Package)EPackage.Registry.INSTANCE.getEPackage(Bz247785Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catEClass.getESuperTypes().add(this.getAnimal());

		// Initialize classes and features; add operations and parameters
		initEClass(animalEClass, Animal.class, "Animal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnimal_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catEClass, Cat.class, "Cat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCat_Owner(), theBz247785Package.getOwner(), theBz247785Package.getOwner_OwnedCats(), "owner", null, 0, 1, Cat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (animalEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity\r\n@Table(name = \"ANIMAL\")\r\n@Inheritance(strategy = InheritanceType.SINGLE_TABLE)"
		   });		
		addAnnotation
		  (getAnimal_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id\r\n@Column(name = \"ANIMAL_ID\")\r\n@GeneratedValue\r\n"
		   });		
		addAnnotation
		  (catEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity"
		   });		
		addAnnotation
		  (getCat_Owner(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})\r\n@JoinColumn(table = \"CAT\", name = \"CAT_OWNER_ID\")"
		   });
	}

} //Bz247785SubPackageImpl
