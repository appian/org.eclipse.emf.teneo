/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz292151PackageImpl.java,v 1.1 2009/10/14 22:19:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz292151.Base;
import org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Factory;
import org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package;
import org.eclipse.emf.teneo.samples.issues.bz292151.Sub1;
import org.eclipse.emf.teneo.samples.issues.bz292151.Sub2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz292151PackageImpl extends EPackageImpl implements Bz292151Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sub1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sub2EClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz292151PackageImpl() {
		super(eNS_URI, Bz292151Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz292151Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz292151Package init() {
		if (isInited) return (Bz292151Package)EPackage.Registry.INSTANCE.getEPackage(Bz292151Package.eNS_URI);

		// Obtain or create and register package
		Bz292151PackageImpl theBz292151Package = (Bz292151PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz292151PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz292151PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz292151Package.createPackageContents();

		// Initialize created meta-data
		theBz292151Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz292151Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz292151Package.eNS_URI, theBz292151Package);
		return theBz292151Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase() {
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSub1() {
		return sub1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSub1_A1() {
		return (EAttribute)sub1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSub2() {
		return sub2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSub2_A1() {
		return (EReference)sub2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz292151Factory getBz292151Factory() {
		return (Bz292151Factory)getEFactoryInstance();
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
		baseEClass = createEClass(BASE);

		sub1EClass = createEClass(SUB1);
		createEAttribute(sub1EClass, SUB1__A1);

		sub2EClass = createEClass(SUB2);
		createEReference(sub2EClass, SUB2__A1);
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
		sub1EClass.getESuperTypes().add(this.getBase());
		sub2EClass.getESuperTypes().add(this.getBase());

		// Initialize classes and features; add operations and parameters
		initEClass(baseEClass, Base.class, "Base", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sub1EClass, Sub1.class, "Sub1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSub1_A1(), ecorePackage.getEString(), "a1", null, 0, 1, Sub1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sub2EClass, Sub2.class, "Sub2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSub2_A1(), ecorePackage.getEObject(), null, "a1", null, 0, 1, Sub2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Bz292151PackageImpl
