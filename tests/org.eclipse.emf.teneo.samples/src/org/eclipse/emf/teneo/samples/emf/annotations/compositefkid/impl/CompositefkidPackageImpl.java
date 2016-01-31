/**
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Name;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositefkidPackageImpl extends EPackageImpl implements CompositefkidPackage {
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
	private EClass nameEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompositefkidPackageImpl() {
		super(eNS_URI, CompositefkidFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompositefkidPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompositefkidPackage init() {
		if (isInited) return (CompositefkidPackage)EPackage.Registry.INSTANCE.getEPackage(CompositefkidPackage.eNS_URI);

		// Obtain or create and register package
		CompositefkidPackageImpl theCompositefkidPackage = (CompositefkidPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CompositefkidPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CompositefkidPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCompositefkidPackage.createPackageContents();

		// Initialize created meta-data
		theCompositefkidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompositefkidPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompositefkidPackage.eNS_URI, theCompositefkidPackage);
		return theCompositefkidPackage;
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
	public EReference getParent_Relations() {
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
	public EReference getPerson_LastName() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_LastName() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositefkidFactory getCompositefkidFactory() {
		return (CompositefkidFactory)getEFactoryInstance();
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
		createEReference(parentEClass, PARENT__RELATIONS);

		childEClass = createEClass(CHILD);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEReference(personEClass, PERSON__LAST_NAME);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__LAST_NAME);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParent_Relations(), this.getPerson(), null, "relations", null, 0, -1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_LastName(), this.getName_(), null, "lastName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "appinfo", "@PrimaryKeyJoinColumns({\n\t@PrimaryKeyJoinColumn(name=\"mySuperFirstName\"),\n\t@PrimaryKeyJoinColumn(name=\"mySuperLastName\")\n})"
		   });	
		addAnnotation
		  (getParent_Relations(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumns({\n\t@JoinColumn(name=\"myParentFirstName\", referencedColumnName=\"firstName\"),\n\t@JoinColumn(name=\"myParentLastName\", referencedColumnName=\"lastName\")\n})"
		   });	
		addAnnotation
		  (childEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@PrimaryKeyJoinColumns({\n\t@PrimaryKeyJoinColumn(name=\"mySuperFirstName\"),\n\t@PrimaryKeyJoinColumn(name=\"mySuperLastName\")\n})"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@IdClass(org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.PersonID)"
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
			 "appinfo", "@Id\n@JoinColumn(name=\"lastName\")"
		   });
	}

} //CompositefkidPackageImpl
