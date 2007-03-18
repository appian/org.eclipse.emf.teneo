/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestinheritancePackageImpl.java,v 1.1 2007/03/18 22:28:33 mtaal Exp $
 */
package testinheritance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testinheritance.NameValuePair;
import testinheritance.SomeBaseClass;
import testinheritance.SomeOtherBaseClass;
import testinheritance.SomeResource;
import testinheritance.TestinheritanceFactory;
import testinheritance.TestinheritancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestinheritancePackageImpl extends EPackageImpl implements TestinheritancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someBaseClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someOtherBaseClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameValuePairEClass = null;

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
	 * @see testinheritance.TestinheritancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestinheritancePackageImpl() {
		super(eNS_URI, TestinheritanceFactory.eINSTANCE);
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
	public static TestinheritancePackage init() {
		if (isInited) return (TestinheritancePackage)EPackage.Registry.INSTANCE.getEPackage(TestinheritancePackage.eNS_URI);

		// Obtain or create and register package
		TestinheritancePackageImpl theTestinheritancePackage = (TestinheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TestinheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TestinheritancePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTestinheritancePackage.createPackageContents();

		// Initialize created meta-data
		theTestinheritancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestinheritancePackage.freeze();

		return theTestinheritancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeResource() {
		return someResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeBaseClass() {
		return someBaseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSomeBaseClass_AnotherProperty() {
		return (EAttribute)someBaseClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeOtherBaseClass() {
		return someOtherBaseClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSomeOtherBaseClass_Property() {
		return (EAttribute)someOtherBaseClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSomeOtherBaseClass_NameValuePairs() {
		return (EReference)someOtherBaseClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameValuePair() {
		return nameValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValuePair_Name() {
		return (EAttribute)nameValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValuePair_Value() {
		return (EAttribute)nameValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestinheritanceFactory getTestinheritanceFactory() {
		return (TestinheritanceFactory)getEFactoryInstance();
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
		someResourceEClass = createEClass(SOME_RESOURCE);

		someBaseClassEClass = createEClass(SOME_BASE_CLASS);
		createEAttribute(someBaseClassEClass, SOME_BASE_CLASS__ANOTHER_PROPERTY);

		someOtherBaseClassEClass = createEClass(SOME_OTHER_BASE_CLASS);
		createEAttribute(someOtherBaseClassEClass, SOME_OTHER_BASE_CLASS__PROPERTY);
		createEReference(someOtherBaseClassEClass, SOME_OTHER_BASE_CLASS__NAME_VALUE_PAIRS);

		nameValuePairEClass = createEClass(NAME_VALUE_PAIR);
		createEAttribute(nameValuePairEClass, NAME_VALUE_PAIR__NAME);
		createEAttribute(nameValuePairEClass, NAME_VALUE_PAIR__VALUE);
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
		someResourceEClass.getESuperTypes().add(this.getSomeBaseClass());
		someResourceEClass.getESuperTypes().add(this.getSomeOtherBaseClass());

		// Initialize classes and features; add operations and parameters
		initEClass(someResourceEClass, SomeResource.class, "SomeResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(someBaseClassEClass, SomeBaseClass.class, "SomeBaseClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSomeBaseClass_AnotherProperty(), ecorePackage.getELong(), "anotherProperty", null, 0, 1, SomeBaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(someOtherBaseClassEClass, SomeOtherBaseClass.class, "SomeOtherBaseClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSomeOtherBaseClass_Property(), ecorePackage.getEString(), "property", null, 0, 1, SomeOtherBaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSomeOtherBaseClass_NameValuePairs(), this.getNameValuePair(), null, "nameValuePairs", null, 0, -1, SomeOtherBaseClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameValuePairEClass, NameValuePair.class, "NameValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameValuePair_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, NameValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (someOtherBaseClassEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Transient"
		   });
	}

} //TestinheritancePackageImpl
