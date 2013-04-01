/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariousPackageImpl.java,v 1.2 2009/03/15 15:08:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.various.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.various.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.various.ImmutableCity;
import org.eclipse.emf.teneo.samples.emf.annotations.various.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariousPackageImpl extends EPackageImpl implements VariousPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immutableCityEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VariousPackageImpl() {
		super(eNS_URI, VariousFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VariousPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VariousPackage init() {
		if (isInited) return (VariousPackage)EPackage.Registry.INSTANCE.getEPackage(VariousPackage.eNS_URI);

		// Obtain or create and register package
		VariousPackageImpl theVariousPackage = (VariousPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariousPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariousPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVariousPackage.createPackageContents();

		// Initialize created meta-data
		theVariousPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVariousPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VariousPackage.eNS_URI, theVariousPackage);
		return theVariousPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParent() {
		return parentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParent_Children() {
		return (EReference)parentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParent_TotalPeople() {
		return (EAttribute)parentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParent_Name1() {
		return (EAttribute)parentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParent_Name2() {
		return (EAttribute)parentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParent_CompleteName() {
		return (EAttribute)parentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmutableCity() {
		return immutableCityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImmutableCity_Name() {
		return (EAttribute)immutableCityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmutableCity_Parents() {
		return (EReference)immutableCityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariousFactory getVariousFactory() {
		return (VariousFactory)getEFactoryInstance();
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
		parentEClass = createEClass(PARENT);
		createEReference(parentEClass, PARENT__CHILDREN);
		createEAttribute(parentEClass, PARENT__TOTAL_PEOPLE);
		createEAttribute(parentEClass, PARENT__NAME1);
		createEAttribute(parentEClass, PARENT__NAME2);
		createEAttribute(parentEClass, PARENT__COMPLETE_NAME);

		childEClass = createEClass(CHILD);

		immutableCityEClass = createEClass(IMMUTABLE_CITY);
		createEAttribute(immutableCityEClass, IMMUTABLE_CITY__NAME);
		createEReference(immutableCityEClass, IMMUTABLE_CITY__PARENTS);
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
		childEClass.getESuperTypes().add(this.getParent());

		// Initialize classes and features; add operations and parameters
		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParent_Children(), this.getChild(), null, "children", null, 0, -1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParent_TotalPeople(), ecorePackage.getEInt(), "totalPeople", null, 0, 1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParent_Name1(), ecorePackage.getEString(), "name1", null, 0, 1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParent_Name2(), ecorePackage.getEString(), "name2", null, 0, 1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParent_CompleteName(), ecorePackage.getEString(), "completeName", null, 0, 1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(immutableCityEClass, ImmutableCity.class, "ImmutableCity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImmutableCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImmutableCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImmutableCity_Parents(), this.getParent(), null, "parents", null, 0, -1, ImmutableCity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (parentEClass, 
		   source, 
		   new String[] {
			 "value", "@ForceDiscriminator\n@BatchSize(size=9)"
		   });		
		addAnnotation
		  (getParent_Children(), 
		   source, 
		   new String[] {
			 "value", "@BatchSize(size=11)"
		   });		
		addAnnotation
		  (getParent_TotalPeople(), 
		   source, 
		   new String[] {
			 "value", "@Formula(value=\"(select count(*) from parent)\")"
		   });		
		addAnnotation
		  (getParent_CompleteName(), 
		   source, 
		   new String[] {
			 "value", "@Formula(value=\"(name1 + \' \' + name2)\")"
		   });		
		addAnnotation
		  (immutableCityEClass, 
		   source, 
		   new String[] {
			 "value", "@Immutable"
		   });		
		addAnnotation
		  (getImmutableCity_Parents(), 
		   source, 
		   new String[] {
			 "value", "@Immutable"
		   });
	}

} //VariousPackageImpl
