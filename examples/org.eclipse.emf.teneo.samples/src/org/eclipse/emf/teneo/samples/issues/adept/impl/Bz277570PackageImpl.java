/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277570PackageImpl.java,v 1.1.2.1 2009/05/23 13:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.adept.Bar;
import org.eclipse.emf.teneo.samples.issues.adept.Baz;
import org.eclipse.emf.teneo.samples.issues.adept.Biff;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Factory;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package;
import org.eclipse.emf.teneo.samples.issues.adept.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz277570PackageImpl extends EPackageImpl implements Bz277570Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bazEClass = null;

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
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biffEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz277570PackageImpl() {
		super(eNS_URI, Bz277570Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz277570Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz277570Package init() {
		if (isInited) return (Bz277570Package)EPackage.Registry.INSTANCE.getEPackage(Bz277570Package.eNS_URI);

		// Obtain or create and register package
		Bz277570PackageImpl theBz277570Package = (Bz277570PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz277570PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz277570PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz277570Package.createPackageContents();

		// Initialize created meta-data
		theBz277570Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz277570Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz277570Package.eNS_URI, theBz277570Package);
		return theBz277570Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaz() {
		return bazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaz_Name() {
		return (EAttribute)bazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaz_Id() {
		return (EAttribute)bazEClass.getEStructuralFeatures().get(1);
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
	public EReference getFoo_Bars() {
		return (EReference)fooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFoo_Biffs() {
		return (EReference)fooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFoo_Id() {
		return (EAttribute)fooEClass.getEStructuralFeatures().get(2);
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
	public EReference getBar_Baz() {
		return (EReference)barEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiff() {
		return biffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz277570Factory getBz277570Factory() {
		return (Bz277570Factory)getEFactoryInstance();
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
		bazEClass = createEClass(BAZ);
		createEAttribute(bazEClass, BAZ__NAME);
		createEAttribute(bazEClass, BAZ__ID);

		fooEClass = createEClass(FOO);
		createEReference(fooEClass, FOO__BARS);
		createEReference(fooEClass, FOO__BIFFS);
		createEAttribute(fooEClass, FOO__ID);

		barEClass = createEClass(BAR);
		createEReference(barEClass, BAR__BAZ);

		biffEClass = createEClass(BIFF);
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
		barEClass.getESuperTypes().add(this.getBaz());
		biffEClass.getESuperTypes().add(this.getBaz());

		// Initialize classes and features; add operations and parameters
		initEClass(bazEClass, Baz.class, "Baz", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaz_Name(), ecorePackage.getEString(), "name", null, 0, 1, Baz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaz_Id(), ecorePackage.getELong(), "id", null, 1, 1, Baz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFoo_Bars(), this.getBar(), null, "bars", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFoo_Biffs(), this.getBiff(), null, "biffs", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFoo_Id(), ecorePackage.getELong(), "id", null, 1, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBar_Baz(), this.getBaz(), null, "baz", null, 0, 1, Bar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biffEClass, Biff.class, "Biff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getBaz_Id(), 
		   source, 
		   new String[] {
			 "value", "@Id"
		   });		
		addAnnotation
		  (getFoo_Id(), 
		   source, 
		   new String[] {
			 "value", "@Id"
		   });
	}

} //Bz277570PackageImpl
