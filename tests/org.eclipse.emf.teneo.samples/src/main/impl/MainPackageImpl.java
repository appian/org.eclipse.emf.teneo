/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainPackageImpl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import main.BaseComponent;
import main.BaseGroup;
import main.BaseObject;
import main.ChildObject1;
import main.ChildObject2;
import main.ChildObject3;
import main.ChildObject4;
import main.MainFactory;
import main.MainPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MainPackageImpl extends EPackageImpl implements MainPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass childObject2EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass childObject1EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass baseGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass baseComponentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass childObject3EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass childObject4EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
	 * value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init
	 * init()}, which also performs initialization of the package, or returns the registered package,
	 * if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see main.MainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MainPackageImpl() {
		super(eNS_URI, MainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends. Simple dependencies are satisfied by calling this method on all dependent
	 * packages before doing anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not yet been registered by
	 * their URI values are first created and registered. The packages are then initialized in two
	 * steps: meta-model objects for all of the packages are created before any are initialized, since
	 * one package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already been initialized. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MainPackage init() {
		if (isInited)
			return (MainPackage) EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI);

		// Obtain or create and register package
		MainPackageImpl theMainPackage = (MainPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) : new MainPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theMainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMainPackage.freeze();

		return theMainPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChildObject2() {
		return childObject2EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChildObject2_Length() {
		return (EAttribute) childObject2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChildObject1() {
		return childObject1EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChildObject1_LinkedObject() {
		return (EReference) childObject1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBaseObject_Object1() {
		return (EReference) baseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBaseGroup() {
		return baseGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBaseGroup_Components() {
		return (EReference) baseGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBaseComponent() {
		return baseComponentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBaseComponent_Group() {
		return (EReference) baseComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBaseComponent_Name() {
		return (EAttribute) baseComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBaseComponent_Id() {
		return (EAttribute) baseComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChildObject3() {
		return childObject3EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChildObject3_Width() {
		return (EAttribute) childObject3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChildObject4() {
		return childObject4EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getChildObject4_Thickness() {
		return (EAttribute) childObject4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MainFactory getMainFactory() {
		return (MainFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		childObject2EClass = createEClass(CHILD_OBJECT2);
		createEAttribute(childObject2EClass, CHILD_OBJECT2__LENGTH);

		childObject1EClass = createEClass(CHILD_OBJECT1);
		createEReference(childObject1EClass, CHILD_OBJECT1__LINKED_OBJECT);

		baseObjectEClass = createEClass(BASE_OBJECT);
		createEReference(baseObjectEClass, BASE_OBJECT__OBJECT1);

		baseGroupEClass = createEClass(BASE_GROUP);
		createEReference(baseGroupEClass, BASE_GROUP__COMPONENTS);

		baseComponentEClass = createEClass(BASE_COMPONENT);
		createEReference(baseComponentEClass, BASE_COMPONENT__GROUP);
		createEAttribute(baseComponentEClass, BASE_COMPONENT__NAME);
		createEAttribute(baseComponentEClass, BASE_COMPONENT__ID);

		childObject3EClass = createEClass(CHILD_OBJECT3);
		createEAttribute(childObject3EClass, CHILD_OBJECT3__WIDTH);

		childObject4EClass = createEClass(CHILD_OBJECT4);
		createEAttribute(childObject4EClass, CHILD_OBJECT4__THICKNESS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have
	 * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		childObject2EClass.getESuperTypes().add(this.getBaseObject());
		childObject1EClass.getESuperTypes().add(this.getBaseObject());
		baseObjectEClass.getESuperTypes().add(this.getBaseComponent());
		baseGroupEClass.getESuperTypes().add(this.getBaseComponent());
		childObject3EClass.getESuperTypes().add(this.getBaseObject());
		childObject4EClass.getESuperTypes().add(this.getBaseObject());

		// Initialize classes and features; add operations and parameters
		initEClass(childObject2EClass, ChildObject2.class, "ChildObject2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildObject2_Length(), ecorePackage.getEIntegerObject(), "length", null, 0,
				1, ChildObject2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childObject1EClass, ChildObject1.class, "ChildObject1", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildObject1_LinkedObject(), this.getBaseObject(),
				this.getBaseObject_Object1(), "linkedObject", null, 0, 1, ChildObject1.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseObject_Object1(), this.getChildObject1(),
				this.getChildObject1_LinkedObject(), "object1", null, 0, 1, BaseObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseGroupEClass, BaseGroup.class, "BaseGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseGroup_Components(), this.getBaseComponent(),
				this.getBaseComponent_Group(), "components", null, 0, -1, BaseGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(baseComponentEClass, BaseComponent.class, "BaseComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseComponent_Group(), this.getBaseGroup(), this.getBaseGroup_Components(),
				"group", null, 0, 1, BaseComponent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				BaseComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseComponent_Id(), ecorePackage.getELongObject(), "Id", null, 0, 1,
				BaseComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childObject3EClass, ChildObject3.class, "ChildObject3", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildObject3_Width(), ecorePackage.getEIntegerObject(), "width", null, 0, 1,
				ChildObject3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childObject4EClass, ChildObject4.class, "ChildObject4", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildObject4_Thickness(), ecorePackage.getEIntegerObject(), "thickness",
				null, 0, 1, ChildObject4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // MainPackageImpl
