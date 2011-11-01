/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz329275PackageImpl.java,v 1.1 2010/11/04 05:22:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz329275.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Factory;
import org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package;
import org.eclipse.emf.teneo.samples.issues.bz329275.Item;
import org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz329275PackageImpl extends EPackageImpl implements Bz329275Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testEnumEEnum = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz329275PackageImpl() {
		super(eNS_URI, Bz329275Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz329275Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz329275Package init() {
		if (isInited) return (Bz329275Package)EPackage.Registry.INSTANCE.getEPackage(Bz329275Package.eNS_URI);

		// Obtain or create and register package
		Bz329275PackageImpl theBz329275Package = (Bz329275PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz329275PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz329275PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz329275Package.createPackageContents();

		// Initialize created meta-data
		theBz329275Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz329275Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz329275Package.eNS_URI, theBz329275Package);
		return theBz329275Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Id() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Version() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettableStringNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardStringNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettableStringWithDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardStringDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettableEnum() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardEnum() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettablePrimitiveNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardPrimitiveNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettablePrimitiveWithDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardPrimitiveWithDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettableObjectPrimitiveWithDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardObjectPrimitiveWithDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_UnSettableObjectPrimitiveNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StandardObjectPrimitiveNoDefault() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestEnum() {
		return testEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz329275Factory getBz329275Factory() {
		return (Bz329275Factory)getEFactoryInstance();
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
		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ID);
		createEAttribute(itemEClass, ITEM__VERSION);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_STRING_NO_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_STRING_NO_DEFAULT);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_STRING_WITH_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_STRING_DEFAULT);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_ENUM);
		createEAttribute(itemEClass, ITEM__STANDARD_ENUM);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_PRIMITIVE_NO_DEFAULT);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT);
		createEAttribute(itemEClass, ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT);
		createEAttribute(itemEClass, ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT);

		// Create enums
		testEnumEEnum = createEEnum(TEST_ENUM);
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
		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Version(), theXMLTypePackage.getLong(), "version", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettableStringNoDefault(), ecorePackage.getEString(), "unSettableStringNoDefault", "", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardStringNoDefault(), ecorePackage.getEString(), "standardStringNoDefault", "", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettableStringWithDefault(), ecorePackage.getEString(), "unSettableStringWithDefault", "default", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardStringDefault(), ecorePackage.getEString(), "standardStringDefault", "default", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettableEnum(), this.getTestEnum(), "unSettableEnum", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardEnum(), this.getTestEnum(), "standardEnum", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettablePrimitiveNoDefault(), ecorePackage.getELong(), "unSettablePrimitiveNoDefault", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardPrimitiveNoDefault(), ecorePackage.getELong(), "standardPrimitiveNoDefault", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettablePrimitiveWithDefault(), ecorePackage.getELong(), "unSettablePrimitiveWithDefault", "155", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardPrimitiveWithDefault(), ecorePackage.getELong(), "standardPrimitiveWithDefault", "155", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettableObjectPrimitiveWithDefault(), ecorePackage.getELongObject(), "unSettableObjectPrimitiveWithDefault", "155", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardObjectPrimitiveWithDefault(), ecorePackage.getELongObject(), "standardObjectPrimitiveWithDefault", "155", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_UnSettableObjectPrimitiveNoDefault(), ecorePackage.getELongObject(), "unSettableObjectPrimitiveNoDefault", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StandardObjectPrimitiveNoDefault(), ecorePackage.getELongObject(), "standardObjectPrimitiveNoDefault", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(testEnumEEnum, TestEnum.class, "TestEnum");
		addEEnumLiteral(testEnumEEnum, TestEnum.LITERAL1);
		addEEnumLiteral(testEnumEEnum, TestEnum.LITERAL2);

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
		  (getItem_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id\n@GeneratedValue"
		   });		
		addAnnotation
		  (getItem_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });
	}

} //Bz329275PackageImpl
