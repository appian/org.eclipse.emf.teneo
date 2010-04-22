/**
 * <copyright>
 * </copyright>
 *
 * $Id: SuppressinterfacesPackage.java,v 1.2 2010/04/22 17:57:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesFactory
 * @model kind="package"
 * @generated
 */
public class SuppressinterfacesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "suppressinterfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http:///org/eclipse/emf/teneo/eclipselink/examples/test_suppressinterfaces.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "suppressinterfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SuppressinterfacesPackage eINSTANCE = org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getIdentifiable()
	 * @generated
	 */
	public static final int IDENTIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTest()
	 * @generated
	 */
	public static final int TEST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Embedded</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST__TEST_EMBEDDED = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded <em>Test Embedded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTestEmbedded()
	 * @generated
	 */
	public static final int TEST_EMBEDDED = 1;

	/**
	 * The feature id for the '<em><b>Name Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_EMBEDDED__NAME_EMBEDDED = 0;

	/**
	 * The number of structural features of the '<em>Test Embedded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_EMBEDDED_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEmbeddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

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
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SuppressinterfacesPackage() {
		super(eNS_URI, SuppressinterfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SuppressinterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SuppressinterfacesPackage init() {
		if (isInited) return (SuppressinterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(SuppressinterfacesPackage.eNS_URI);

		// Obtain or create and register package
		SuppressinterfacesPackage theSuppressinterfacesPackage = (SuppressinterfacesPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SuppressinterfacesPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SuppressinterfacesPackage());

		isInited = true;

		// Create package meta-data objects
		theSuppressinterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theSuppressinterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSuppressinterfacesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SuppressinterfacesPackage.eNS_URI, theSuppressinterfacesPackage);
		return theSuppressinterfacesPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	public EAttribute getTest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getTestEmbedded <em>Test Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Embedded</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test#getTestEmbedded()
	 * @see #getTest()
	 * @generated
	 */
	public EReference getTest_TestEmbedded() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded <em>Test Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Embedded</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded
	 * @generated
	 */
	public EClass getTestEmbedded() {
		return testEmbeddedEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded#getNameEmbedded <em>Name Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Embedded</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded#getNameEmbedded()
	 * @see #getTestEmbedded()
	 * @generated
	 */
	public EAttribute getTestEmbedded_NameEmbedded() {
		return (EAttribute)testEmbeddedEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable#getVersion()
	 * @see #getIdentifiable()
	 * @generated
	 */
	public EAttribute getIdentifiable_Version() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SuppressinterfacesFactory getSuppressinterfacesFactory() {
		return (SuppressinterfacesFactory)getEFactoryInstance();
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
		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__NAME);
		createEReference(testEClass, TEST__TEST_EMBEDDED);

		testEmbeddedEClass = createEClass(TEST_EMBEDDED);
		createEAttribute(testEmbeddedEClass, TEST_EMBEDDED__NAME_EMBEDDED);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__VERSION);
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
		testEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_TestEmbedded(), this.getTestEmbedded(), null, "testEmbedded", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEmbeddedEClass, TestEmbedded.class, "TestEmbedded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestEmbedded_NameEmbedded(), ecorePackage.getEString(), "nameEmbedded", null, 0, 1, TestEmbedded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getELong(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Version(), ecorePackage.getELong(), "version", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getTest_TestEmbedded(), 
		   source, 
		   new String[] {
			 "value", "@Embedded"
		   });		
		addAnnotation
		  (testEmbeddedEClass, 
		   source, 
		   new String[] {
			 "value", "@Embeddable"
		   });		
		addAnnotation
		  (getIdentifiable_Id(), 
		   source, 
		   new String[] {
			 "value", "@Id\n@GeneratedValue"
		   });		
		addAnnotation
		  (getIdentifiable_Version(), 
		   source, 
		   new String[] {
			 "value", "@Version"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Test
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTest()
		 * @generated
		 */
		public static final EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Test Embedded</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TEST__TEST_EMBEDDED = eINSTANCE.getTest_TestEmbedded();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded <em>Test Embedded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.TestEmbedded
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getTestEmbedded()
		 * @generated
		 */
		public static final EClass TEST_EMBEDDED = eINSTANCE.getTestEmbedded();

		/**
		 * The meta object literal for the '<em><b>Name Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST_EMBEDDED__NAME_EMBEDDED = eINSTANCE.getTestEmbedded_NameEmbedded();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.Identifiable
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#getIdentifiable()
		 * @generated
		 */
		public static final EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute IDENTIFIABLE__VERSION = eINSTANCE.getIdentifiable_Version();

	}

} //SuppressinterfacesPackage
