/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmfdbPackageImpl.java,v 1.1 2009/08/23 16:04:40 mtaal Exp $
 */
package org.eclipse.emf.test.databinding.emfdb.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.test.databinding.emfdb.EmfdbFactory;
import org.eclipse.emf.test.databinding.emfdb.EmfdbPackage;
import org.eclipse.emf.test.databinding.emfdb.Family;
import org.eclipse.emf.test.databinding.emfdb.Note;
import org.eclipse.emf.test.databinding.emfdb.Person;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmfdbPackageImpl extends EPackageImpl implements EmfdbPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass noteEClass = null;

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
	 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfdbPackageImpl() {
		super(eNS_URI, EmfdbFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link EmfdbPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain
	 * the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfdbPackage init() {
		if (isInited)
			return (EmfdbPackage) EPackage.Registry.INSTANCE.getEPackage(EmfdbPackage.eNS_URI);

		// Obtain or create and register package
		EmfdbPackageImpl theEmfdbPackage = (EmfdbPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfdbPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new EmfdbPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfdbPackage.createPackageContents();

		// Initialize created meta-data
		theEmfdbPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfdbPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfdbPackage.eNS_URI, theEmfdbPackage);
		return theEmfdbPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFamily_String() {
		return (EAttribute) familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFamily_Persons() {
		return (EReference) familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPerson_Notes() {
		return (EReference) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPerson_Parents() {
		return (EReference) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNote_Name() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EmfdbFactory getEmfdbFactory() {
		return (EmfdbFactory) getEFactoryInstance();
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
		familyEClass = createEClass(FAMILY);
		createEAttribute(familyEClass, FAMILY__STRING);
		createEReference(familyEClass, FAMILY__PERSONS);

		personEClass = createEClass(PERSON);
		createEReference(personEClass, PERSON__NOTES);
		createEReference(personEClass, PERSON__PARENTS);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NAME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamily_String(), ecorePackage.getEString(), "string", null, 0, 1,
				Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Persons(), this.getPerson(), null, "persons", null, 0, -1,
				Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerson_Notes(), this.getNote(), null, "notes", null, 0, -1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Parents(), this.getPerson(), null, "parents", null, 0, -1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Name(), ecorePackage.getEString(), "name", null, 0, 1, Note.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // EmfdbPackageImpl
