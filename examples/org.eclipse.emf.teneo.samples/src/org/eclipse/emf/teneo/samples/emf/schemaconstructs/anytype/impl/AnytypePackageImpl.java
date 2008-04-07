/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnytypePackageImpl.java,v 1.3 2008/04/07 15:14:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypeFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnytypePackageImpl extends EPackageImpl implements AnytypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testAnyEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnytypePackageImpl() {
		super(eNS_URI, AnytypeFactory.eINSTANCE);
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
	public static AnytypePackage init() {
		if (isInited) return (AnytypePackage)EPackage.Registry.INSTANCE.getEPackage(AnytypePackage.eNS_URI);

		// Obtain or create and register package
		AnytypePackageImpl theAnytypePackage = (AnytypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AnytypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AnytypePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAnytypePackage.createPackageContents();

		// Initialize created meta-data
		theAnytypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnytypePackage.freeze();

		return theAnytypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Name() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Doub() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getA_Lon() {
		return (EAttribute)aEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA_MyB() {
		return (EReference)aEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getB() {
		return bEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getB_Name() {
		return (EAttribute)bEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC() {
		return cEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestAny() {
		return testAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestAny_Name() {
		return (EAttribute)testAnyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestAny_SingleAnyType() {
		return (EReference)testAnyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestAny_MultiAnyType() {
		return (EReference)testAnyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestAny_A() {
		return (EAttribute)testAnyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestAny_MyAny() {
		return (EAttribute)testAnyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestAny_Any() {
		return (EAttribute)testAnyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypeFactory getAnytypeFactory() {
		return (AnytypeFactory)getEFactoryInstance();
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
		aEClass = createEClass(A);
		createEAttribute(aEClass, A__NAME);
		createEAttribute(aEClass, A__DOUB);
		createEAttribute(aEClass, A__LON);
		createEReference(aEClass, A__MY_B);

		bEClass = createEClass(B);
		createEAttribute(bEClass, B__NAME);

		cEClass = createEClass(C);

		testAnyEClass = createEClass(TEST_ANY);
		createEAttribute(testAnyEClass, TEST_ANY__NAME);
		createEReference(testAnyEClass, TEST_ANY__SINGLE_ANY_TYPE);
		createEReference(testAnyEClass, TEST_ANY__MULTI_ANY_TYPE);
		createEAttribute(testAnyEClass, TEST_ANY__A);
		createEAttribute(testAnyEClass, TEST_ANY__MY_ANY);
		createEAttribute(testAnyEClass, TEST_ANY__ANY);
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
		initEClass(aEClass, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getA_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Doub(), theXMLTypePackage.getDouble(), "doub", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getA_Lon(), theXMLTypePackage.getLong(), "lon", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getA_MyB(), this.getB(), null, "myB", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bEClass, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getB_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.B.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cEClass, org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.C.class, "C", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testAnyEClass, TestAny.class, "TestAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestAny_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestAny_SingleAnyType(), ecorePackage.getEObject(), null, "singleAnyType", null, 1, 1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestAny_MultiAnyType(), ecorePackage.getEObject(), null, "multiAnyType", null, 1, -1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestAny_A(), theXMLTypePackage.getString(), "a", null, 1, 1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestAny_MyAny(), ecorePackage.getEFeatureMapEntry(), "myAny", null, 1, 1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestAny_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, -1, TestAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (aEClass, 
		   source, 
		   new String[] {
			 "name", "myA",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getA_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getA_Doub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doub"
		   });		
		addAnnotation
		  (getA_Lon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lon"
		   });		
		addAnnotation
		  (getA_MyB(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myB"
		   });		
		addAnnotation
		  (bEClass, 
		   source, 
		   new String[] {
			 "name", "B",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getB_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (cEClass, 
		   source, 
		   new String[] {
			 "name", "C",
			 "kind", "empty"
		   });		
		addAnnotation
		  (testAnyEClass, 
		   source, 
		   new String[] {
			 "name", "testAny",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTestAny_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getTestAny_SingleAnyType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "singleAnyType"
		   });		
		addAnnotation
		  (getTestAny_MultiAnyType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multiAnyType"
		   });		
		addAnnotation
		  (getTestAny_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a"
		   });		
		addAnnotation
		  (getTestAny_MyAny(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":4",
			 "processing", "strict"
		   });		
		addAnnotation
		  (getTestAny_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":5",
			 "processing", "strict"
		   });
	}

} //AnytypePackageImpl
