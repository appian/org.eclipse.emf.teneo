/**
 * <copyright>
 * </copyright>
 *
 * $Id: SuppressinterfacesPackage.java,v 1.1 2010/04/22 15:33:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test <em>test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#gettest()
	 * @generated
	 */
	public static final int TEST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST__NAME = 0;

	/**
	 * The number of structural features of the '<em>test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TEST_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

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
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test <em>test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test
	 * @generated
	 */
	public EClass gettest() {
		return testEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test#getName()
	 * @see #gettest()
	 * @generated
	 */
	public EAttribute gettest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
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
		initEClass(testEClass, test.class, "test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettest_Name(), ecorePackage.getEString(), "name", null, 0, 1, test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test <em>test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.test
		 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage#gettest()
		 * @generated
		 */
		public static final EClass TEST = eINSTANCE.gettest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TEST__NAME = eINSTANCE.gettest_Name();

	}

} //SuppressinterfacesPackage
