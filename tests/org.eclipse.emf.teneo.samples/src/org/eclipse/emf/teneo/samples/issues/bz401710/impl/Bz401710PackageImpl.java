/**
 */
package org.eclipse.emf.teneo.samples.issues.bz401710.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Factory;
import org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package;
import org.eclipse.emf.teneo.samples.issues.bz401710.IDummy;
import org.eclipse.emf.teneo.samples.issues.bz401710.IIdentifiable;
import org.eclipse.emf.teneo.samples.issues.bz401710.RealClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz401710PackageImpl extends EPackageImpl implements Bz401710Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDummyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iIdentifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realClassEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz401710.Bz401710Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz401710PackageImpl() {
		super(eNS_URI, Bz401710Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz401710Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz401710Package init() {
		if (isInited) return (Bz401710Package)EPackage.Registry.INSTANCE.getEPackage(Bz401710Package.eNS_URI);

		// Obtain or create and register package
		Bz401710PackageImpl theBz401710Package = (Bz401710PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz401710PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz401710PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz401710Package.createPackageContents();

		// Initialize created meta-data
		theBz401710Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz401710Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz401710Package.eNS_URI, theBz401710Package);
		return theBz401710Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDummy() {
		return iDummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDummy_Name() {
		return (EAttribute)iDummyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIIdentifiable() {
		return iIdentifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIIdentifiable_Id() {
		return (EAttribute)iIdentifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIIdentifiable_BdsVersion() {
		return (EAttribute)iIdentifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealClass() {
		return realClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz401710Factory getBz401710Factory() {
		return (Bz401710Factory)getEFactoryInstance();
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
		iDummyEClass = createEClass(IDUMMY);
		createEAttribute(iDummyEClass, IDUMMY__NAME);

		iIdentifiableEClass = createEClass(IIDENTIFIABLE);
		createEAttribute(iIdentifiableEClass, IIDENTIFIABLE__ID);
		createEAttribute(iIdentifiableEClass, IIDENTIFIABLE__BDS_VERSION);

		realClassEClass = createEClass(REAL_CLASS);
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
		realClassEClass.getESuperTypes().add(this.getIDummy());
		realClassEClass.getESuperTypes().add(this.getIIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(iDummyEClass, IDummy.class, "IDummy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDummy_Name(), ecorePackage.getEString(), "name", null, 0, 1, IDummy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iIdentifiableEClass, IIdentifiable.class, "IIdentifiable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, IIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIIdentifiable_BdsVersion(), ecorePackage.getELong(), "bdsVersion", null, 0, 1, IIdentifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realClassEClass, RealClass.class, "RealClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (iDummyEClass, 
		   source, 
		   new String[] {
			 "value", "@Transient"
		   });		
		addAnnotation
		  (getIIdentifiable_Id(), 
		   source, 
		   new String[] {
			 "value", "@Id @Column(name=\"BDS_ID\", nullable=\"false\")"
		   });		
		addAnnotation
		  (getIIdentifiable_BdsVersion(), 
		   source, 
		   new String[] {
			 "value", "@Column(name=\"BDS_VERSION\") @Version"
		   });
	}

} //Bz401710PackageImpl
