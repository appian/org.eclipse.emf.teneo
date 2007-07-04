/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetachtestPackageImpl.java,v 1.4 2007/07/04 19:45:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestFactory;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB;
import org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DetachtestPackageImpl extends EPackageImpl implements DetachtestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DetachtestPackageImpl() {
		super(eNS_URI, DetachtestFactory.eINSTANCE);
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
	public static DetachtestPackage init() {
		if (isInited) return (DetachtestPackage)EPackage.Registry.INSTANCE.getEPackage(DetachtestPackage.eNS_URI);

		// Obtain or create and register package
		DetachtestPackageImpl theDetachtestPackage = (DetachtestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DetachtestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DetachtestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDetachtestPackage.createPackageContents();

		// Initialize created meta-data
		theDetachtestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDetachtestPackage.freeze();

		return theDetachtestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestA() {
		return testAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestA_Code() {
		return (EAttribute)testAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestA_TestB() {
		return (EReference)testAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestB() {
		return testBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestB_Code() {
		return (EAttribute)testBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestC() {
		return testCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestC_Code() {
		return (EAttribute)testCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestC_MyDate() {
		return (EAttribute)testCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestC_TestB() {
		return (EReference)testCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetachtestFactory getDetachtestFactory() {
		return (DetachtestFactory)getEFactoryInstance();
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
		testAEClass = createEClass(TEST_A);
		createEAttribute(testAEClass, TEST_A__CODE);
		createEReference(testAEClass, TEST_A__TEST_B);

		testBEClass = createEClass(TEST_B);
		createEAttribute(testBEClass, TEST_B__CODE);

		testCEClass = createEClass(TEST_C);
		createEAttribute(testCEClass, TEST_C__CODE);
		createEAttribute(testCEClass, TEST_C__MY_DATE);
		createEReference(testCEClass, TEST_C__TEST_B);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(testAEClass, TestA.class, "TestA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestA_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, TestA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestA_TestB(), this.getTestB(), null, "testB", null, 1, 1, TestA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testBEClass, TestB.class, "TestB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestB_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, TestB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCEClass, TestC.class, "TestC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestC_Code(), theXMLTypePackage.getString(), "code", null, 1, 1, TestC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestC_MyDate(), theXMLTypePackage.getDate(), "myDate", null, 1, 1, TestC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestC_TestB(), this.getTestB(), null, "testB", null, 1, -1, TestC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (testAEClass, 
		   source, 
		   new String[] {
			 "name", "TestA",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTestA_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code"
		   });		
		addAnnotation
		  (getTestA_TestB(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "testB"
		   });		
		addAnnotation
		  (testBEClass, 
		   source, 
		   new String[] {
			 "name", "TestB",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTestB_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code"
		   });		
		addAnnotation
		  (testCEClass, 
		   source, 
		   new String[] {
			 "name", "TestC",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTestC_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code"
		   });		
		addAnnotation
		  (getTestC_MyDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myDate"
		   });		
		addAnnotation
		  (getTestC_TestB(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "testB"
		   });
	}

} //DetachtestPackageImpl
