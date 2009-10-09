/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz284859PackageImpl.java,v 1.1 2009/10/09 22:59:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz284859.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz284859.Bar;
import org.eclipse.emf.teneo.samples.issues.bz284859.BarDerived;
import org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Factory;
import org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Package;
import org.eclipse.emf.teneo.samples.issues.bz284859.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz284859PackageImpl extends EPackageImpl implements Bz284859Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barDerivedEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz284859.Bz284859Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz284859PackageImpl() {
		super(eNS_URI, Bz284859Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz284859Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz284859Package init() {
		if (isInited) return (Bz284859Package)EPackage.Registry.INSTANCE.getEPackage(Bz284859Package.eNS_URI);

		// Obtain or create and register package
		Bz284859PackageImpl theBz284859Package = (Bz284859PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz284859PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz284859PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz284859Package.createPackageContents();

		// Initialize created meta-data
		theBz284859Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz284859Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz284859Package.eNS_URI, theBz284859Package);
		return theBz284859Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBar_Name() {
		return (EAttribute)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFoo() {
		return fooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoo_Name() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarDerived() {
		return barDerivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz284859Factory getBz284859Factory() {
		return (Bz284859Factory)getEFactoryInstance();
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
		barEClass = createEClass(BAR);
		createEAttribute(barEClass, BAR__NAME);

		fooEClass = createEClass(FOO);
		createEAttribute(fooEClass, FOO__NAME);

		barDerivedEClass = createEClass(BAR_DERIVED);
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
		barDerivedEClass.getESuperTypes().add(this.getBar());

		// Initialize classes and features; add operations and parameters
		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFoo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barDerivedEClass, BarDerived.class, "BarDerived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getBar_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getFoo_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });
	}

} //Bz284859PackageImpl
