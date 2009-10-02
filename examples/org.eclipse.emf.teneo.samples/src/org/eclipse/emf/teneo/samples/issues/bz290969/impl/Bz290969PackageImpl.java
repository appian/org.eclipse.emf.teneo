/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz290969PackageImpl.java,v 1.1 2009/10/02 07:47:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz290969.Bar;
import org.eclipse.emf.teneo.samples.issues.bz290969.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Factory;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package;
import org.eclipse.emf.teneo.samples.issues.bz290969.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz290969PackageImpl extends EPackageImpl implements Bz290969Package {
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
	private EClass barKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fooEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz290969PackageImpl() {
		super(eNS_URI, Bz290969Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz290969Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz290969Package init() {
		if (isInited) return (Bz290969Package)EPackage.Registry.INSTANCE.getEPackage(Bz290969Package.eNS_URI);

		// Obtain or create and register package
		Bz290969PackageImpl theBz290969Package = (Bz290969PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz290969PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz290969PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz290969Package.createPackageContents();

		// Initialize created meta-data
		theBz290969Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz290969Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz290969Package.eNS_URI, theBz290969Package);
		return theBz290969Package;
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
	public EReference getBar_BarKeys() {
		return (EReference)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarKey() {
		return barKeyEClass;
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
	public EReference getFoo_BarKey() {
		return (EReference)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz290969Factory getBz290969Factory() {
		return (Bz290969Factory)getEFactoryInstance();
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
		createEReference(barEClass, BAR__BAR_KEYS);

		barKeyEClass = createEClass(BAR_KEY);

		fooEClass = createEClass(FOO);
		createEReference(fooEClass, FOO__BAR_KEY);
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

		// Initialize classes and features; add operations and parameters
		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_BarKeys(), this.getBarKey(), null, "barKeys", null, 1, -1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barKeyEClass, BarKey.class, "BarKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoo_BarKey(), this.getBarKey(), null, "barKey", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (barEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity(name=\"BarEntity\")"
		   });		
		addAnnotation
		  (barKeyEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity(name=\"BarKeyEntity\")"
		   });		
		addAnnotation
		  (fooEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Entity(name=\"FooEntity\")"
		   });
	}

} //Bz290969PackageImpl
