/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz302933_2PackageImpl.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Package;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.Bz302933_1PackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.Bz302933_2Factory;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.Bz302933_2Package;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.NotTransientType;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.TransientType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz302933_2PackageImpl extends EPackageImpl implements Bz302933_2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notTransientTypeEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.Bz302933_2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz302933_2PackageImpl() {
		super(eNS_URI, Bz302933_2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz302933_2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz302933_2Package init() {
		if (isInited) return (Bz302933_2Package)EPackage.Registry.INSTANCE.getEPackage(Bz302933_2Package.eNS_URI);

		// Obtain or create and register package
		Bz302933_2PackageImpl theBz302933_2Package = (Bz302933_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz302933_2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz302933_2PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Bz302933_1PackageImpl theBz302933_1Package = (Bz302933_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Bz302933_1Package.eNS_URI) instanceof Bz302933_1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Bz302933_1Package.eNS_URI) : Bz302933_1Package.eINSTANCE);

		// Create package meta-data objects
		theBz302933_2Package.createPackageContents();
		theBz302933_1Package.createPackageContents();

		// Initialize created meta-data
		theBz302933_2Package.initializePackageContents();
		theBz302933_1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz302933_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz302933_2Package.eNS_URI, theBz302933_2Package);
		return theBz302933_2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransientType() {
		return transientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotTransientType() {
		return notTransientTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz302933_2Factory getBz302933_2Factory() {
		return (Bz302933_2Factory)getEFactoryInstance();
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
		transientTypeEClass = createEClass(TRANSIENT_TYPE);

		notTransientTypeEClass = createEClass(NOT_TRANSIENT_TYPE);
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
		initEClass(transientTypeEClass, TransientType.class, "TransientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notTransientTypeEClass, NotTransientType.class, "NotTransientType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (transientTypeEClass, 
		   source, 
		   new String[] {
			 "value", "@Transient"
		   });
	}

} //Bz302933_2PackageImpl
