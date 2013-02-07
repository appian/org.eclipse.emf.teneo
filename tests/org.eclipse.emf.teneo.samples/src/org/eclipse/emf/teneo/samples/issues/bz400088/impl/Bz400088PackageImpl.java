/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Factory;
import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case1;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case2;
import org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088;
import org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz400088PackageImpl extends EPackageImpl implements Bz400088Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass case1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass case2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ref400088EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOther400088EClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz400088PackageImpl() {
		super(eNS_URI, Bz400088Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz400088Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz400088Package init() {
		if (isInited) return (Bz400088Package)EPackage.Registry.INSTANCE.getEPackage(Bz400088Package.eNS_URI);

		// Obtain or create and register package
		Bz400088PackageImpl theBz400088Package = (Bz400088PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz400088PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz400088PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBz400088Package.createPackageContents();

		// Initialize created meta-data
		theBz400088Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz400088Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz400088Package.eNS_URI, theBz400088Package);
		return theBz400088Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase1() {
		return case1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase1_Case2() {
		return (EReference)case1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase1_BdsId() {
		return (EAttribute)case1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase1_BdsVersion() {
		return (EAttribute)case1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase2() {
		return case2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase2_Case1() {
		return (EReference)case2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase2_BdsId() {
		return (EAttribute)case2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase2_BdsVersion() {
		return (EAttribute)case2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRef400088() {
		return ref400088EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRef400088_Ref() {
		return (EReference)ref400088EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefOther400088() {
		return refOther400088EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefOther400088_RefOther() {
		return (EReference)refOther400088EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz400088Factory getBz400088Factory() {
		return (Bz400088Factory)getEFactoryInstance();
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
		case1EClass = createEClass(CASE1);
		createEReference(case1EClass, CASE1__CASE2);
		createEAttribute(case1EClass, CASE1__BDS_ID);
		createEAttribute(case1EClass, CASE1__BDS_VERSION);

		case2EClass = createEClass(CASE2);
		createEReference(case2EClass, CASE2__CASE1);
		createEAttribute(case2EClass, CASE2__BDS_ID);
		createEAttribute(case2EClass, CASE2__BDS_VERSION);

		ref400088EClass = createEClass(REF400088);
		createEReference(ref400088EClass, REF400088__REF);

		refOther400088EClass = createEClass(REF_OTHER400088);
		createEReference(refOther400088EClass, REF_OTHER400088__REF_OTHER);
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
		initEClass(case1EClass, Case1.class, "Case1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase1_Case2(), this.getCase2(), this.getCase2_Case1(), "case2", null, 0, -1, Case1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase1_BdsId(), ecorePackage.getELongObject(), "bdsId", null, 0, 1, Case1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase1_BdsVersion(), ecorePackage.getELongObject(), "bdsVersion", null, 0, 1, Case1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(case2EClass, Case2.class, "Case2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase2_Case1(), this.getCase1(), this.getCase1_Case2(), "case1", null, 0, 1, Case2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase2_BdsId(), ecorePackage.getELongObject(), "bdsId", null, 0, 1, Case2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase2_BdsVersion(), ecorePackage.getELongObject(), "bdsVersion", null, 0, 1, Case2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ref400088EClass, Ref400088.class, "Ref400088", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRef400088_Ref(), this.getRefOther400088(), this.getRefOther400088_RefOther(), "ref", null, 0, -1, Ref400088.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refOther400088EClass, RefOther400088.class, "RefOther400088", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefOther400088_RefOther(), this.getRef400088(), this.getRef400088_Ref(), "refOther", null, 0, 1, RefOther400088.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
		// bds
		createBdsAnnotations();
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
		  (case1EClass, 
		   source, 
		   new String[] {
			 "name", "Case1",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCase1_Case2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "case2"
		   });						
		addAnnotation
		  (case2EClass, 
		   source, 
		   new String[] {
			 "name", "Case2",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCase2_Case1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "case1"
		   });					
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
		  (case1EClass, 
		   source, 
		   new String[] {
			 "value", "@Table(name=\"ROBTEST_CASE1\") @Entity(name=\"com.example.robtest.Case1\") @DiscriminatorValue(\"com.example.robtest.Case1\")"
		   });			
		addAnnotation
		  (getCase1_Case2(), 
		   source, 
		   new String[] {
			 "value", "@JoinTable(name=\"ROBTEST_CASE1_CASE2\") @Column(name=\"CASE2\") @ForeignKey(name=\"CASE1_CASE2\")"
		   });		
		addAnnotation
		  (getCase1_BdsId(), 
		   source, 
		   new String[] {
			 "value", "@Id @Column(name=\"BDS_ID\", nullable=\"false\")"
		   });		
		addAnnotation
		  (getCase1_BdsVersion(), 
		   source, 
		   new String[] {
			 "value", "@Column(name=\"BDS_VERSION\") @Version"
		   });				
		addAnnotation
		  (case2EClass, 
		   source, 
		   new String[] {
			 "value", "@Table(name=\"ROBTEST_CASE2\") @Entity(name=\"com.example.robtest.Case2\") @DiscriminatorValue(\"com.example.robtest.Case2\")"
		   });			
		addAnnotation
		  (getCase2_Case1(), 
		   source, 
		   new String[] {
			 "value", "@Column(name=\"CASE\") @ForeignKey(name=\"CASE2_CASE1\")"
		   });		
		addAnnotation
		  (getCase2_BdsId(), 
		   source, 
		   new String[] {
			 "value", "@Id @Column(name=\"BDS_ID\", nullable=\"false\")"
		   });		
		addAnnotation
		  (getCase2_BdsVersion(), 
		   source, 
		   new String[] {
			 "value", "@Column(name=\"BDS_VERSION\") @Version"
		   });		
		addAnnotation
		  (ref400088EClass, 
		   source, 
		   new String[] {
			 "value", "@Entity(name=\"org.eclipse.emf.teneo.samples.issues.bz4000888.Ref400088\")"
		   });		
		addAnnotation
		  (refOther400088EClass, 
		   source, 
		   new String[] {
			 "value", "@Entity(name=\"org.eclipse.emf.teneo.samples.issues.bz4000888.RefOther400088\")"
		   });
	}

	/**
	 * Initializes the annotations for <b>bds</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBdsAnnotations() {
		String source = "bds";								
		addAnnotation
		  (getCase1_BdsVersion(), 
		   source, 
		   new String[] {
			 "isVersion", "true"
		   });								
	}

} //Bz400088PackageImpl
