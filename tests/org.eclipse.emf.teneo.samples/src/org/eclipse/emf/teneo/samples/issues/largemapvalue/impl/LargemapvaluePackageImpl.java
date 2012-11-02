/**
 * <copyright>
 * </copyright>
 *
 * $Id: LargemapvaluePackageImpl.java,v 1.1 2008/04/11 03:21:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.largemapvalue.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvalueFactory;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage;
import org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LargemapvaluePackageImpl extends EPackageImpl implements LargemapvaluePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringMapEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LargemapvaluePackageImpl() {
		super(eNS_URI, LargemapvalueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LargemapvaluePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LargemapvaluePackage init() {
		if (isInited) return (LargemapvaluePackage)EPackage.Registry.INSTANCE.getEPackage(LargemapvaluePackage.eNS_URI);

		// Obtain or create and register package
		LargemapvaluePackageImpl theLargemapvaluePackage = (LargemapvaluePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LargemapvaluePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LargemapvaluePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLargemapvaluePackage.createPackageContents();

		// Initialize created meta-data
		theLargemapvaluePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLargemapvaluePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LargemapvaluePackage.eNS_URI, theLargemapvaluePackage);
		return theLargemapvaluePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestElement() {
		return testElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestElement_TestMap() {
		return (EReference)testElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestElement_TestProp() {
		return (EAttribute)testElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToStringMap() {
		return stringToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Key() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToStringMap_Value() {
		return (EAttribute)stringToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargemapvalueFactory getLargemapvalueFactory() {
		return (LargemapvalueFactory)getEFactoryInstance();
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
		testElementEClass = createEClass(TEST_ELEMENT);
		createEReference(testElementEClass, TEST_ELEMENT__TEST_MAP);
		createEAttribute(testElementEClass, TEST_ELEMENT__TEST_PROP);

		stringToStringMapEClass = createEClass(STRING_TO_STRING_MAP);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__KEY);
		createEAttribute(stringToStringMapEClass, STRING_TO_STRING_MAP__VALUE);
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
		initEClass(testElementEClass, TestElement.class, "TestElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestElement_TestMap(), this.getStringToStringMap(), null, "testMap", null, 0, -1, TestElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestElement_TestProp(), ecorePackage.getEString(), "testProp", null, 0, 1, TestElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringMapEClass, Map.Entry.class, "StringToStringMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// teneo.jpa.auditing
		createTeneo_1Annotations();
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
		  (getTestElement_TestProp(), 
		   source, 
		   new String[] {
			 "value", "@Lob\n@Column(length=1000000)"
		   });			
		addAnnotation
		  (getStringToStringMap_Value(), 
		   source, 
		   new String[] {
			 "value", "@Lob\n@Column(length=1000000)"
		   });	
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa.auditing</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_1Annotations() {
		String source = "teneo.jpa.auditing";			
		addAnnotation
		  (getTestElement_TestProp(), 
		   source, 
		   new String[] {
			 "value", "@Lob\n@Column(length=1000000)"
		   });			
		addAnnotation
		  (getStringToStringMap_Value(), 
		   source, 
		   new String[] {
			 "value", "@Lob\n@Column(length=1000000)"
		   });
	}

} //LargemapvaluePackageImpl
