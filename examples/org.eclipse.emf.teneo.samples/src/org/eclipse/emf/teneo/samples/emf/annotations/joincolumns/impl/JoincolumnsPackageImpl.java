/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoincolumnsPackageImpl.java,v 1.4 2007/07/17 17:37:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JoincolumnsPackageImpl extends EPackageImpl implements JoincolumnsPackage {
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
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JoincolumnsPackageImpl() {
		super(eNS_URI, JoincolumnsFactory.eINSTANCE);
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
	public static JoincolumnsPackage init() {
		if (isInited) return (JoincolumnsPackage)EPackage.Registry.INSTANCE.getEPackage(JoincolumnsPackage.eNS_URI);

		// Obtain or create and register package
		JoincolumnsPackageImpl theJoincolumnsPackage = (JoincolumnsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JoincolumnsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JoincolumnsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJoincolumnsPackage.createPackageContents();

		// Initialize created meta-data
		theJoincolumnsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJoincolumnsPackage.freeze();

		return theJoincolumnsPackage;
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
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Friends() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_OppositeFriends() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Owner() {
		return (EReference)houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Visitors() {
		return (EReference)houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoincolumnsFactory getJoincolumnsFactory() {
		return (JoincolumnsFactory)getEFactoryInstance();
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

		childEClass = createEClass(CHILD);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEReference(personEClass, PERSON__FRIENDS);
		createEReference(personEClass, PERSON__OPPOSITE_FRIENDS);

		houseEClass = createEClass(HOUSE);
		createEReference(houseEClass, HOUSE__OWNER);
		createEReference(houseEClass, HOUSE__VISITORS);
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
		parentEClass.getESuperTypes().add(this.getPerson());
		childEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes and features; add operations and parameters
		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParent_Children(), this.getChild(), null, "children", null, 0, -1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Friends(), this.getPerson(), this.getPerson_OppositeFriends(), "friends", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_OppositeFriends(), this.getPerson(), this.getPerson_Friends(), "oppositeFriends", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHouse_Owner(), this.getParent(), null, "owner", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Visitors(), this.getPerson(), null, "visitors", null, 0, -1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getParent_Children(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumns({@JoinColumn(name=\"myParentFirstName\" referencedColumnName=\"firstName\"),\n\t@JoinColumn(name=\"myParentLastName\" referencedColumnName=\"lastName\")})"
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@IdClass(org.eclipse.emf.teneo.samples.emf.annotations.compositeid.PersonID)"
		   });		
		addAnnotation
		  (getPerson_FirstName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getPerson_LastName(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });		
		addAnnotation
		  (getHouse_Visitors(), 
		   source, 
		   new String[] {
			 "value", "@JoinColumns({@JoinColumn(name=\"wrongcolumn\")})\n@JoinTable(joinColumns={@JoinColumn(name=\"rightcolumn\")})"
		   });
	}

} //JoincolumnsPackageImpl
