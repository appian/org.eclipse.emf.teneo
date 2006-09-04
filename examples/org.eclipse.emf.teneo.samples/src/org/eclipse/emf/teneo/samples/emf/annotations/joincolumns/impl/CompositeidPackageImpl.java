/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeidPackageImpl.java,v 1.2 2006/09/04 15:42:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.CompositeidFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.CompositeidPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeidPackageImpl extends EPackageImpl implements CompositeidPackage {
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
	 * @see org.eclipse.emf.teneo.samples.annotations.joincolumns.CompositeidPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompositeidPackageImpl() {
		super(eNS_URI, CompositeidFactory.eINSTANCE);
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
	public static CompositeidPackage init() {
		if (isInited) return (CompositeidPackage)EPackage.Registry.INSTANCE.getEPackage(CompositeidPackage.eNS_URI);

		// Obtain or create and register package
		CompositeidPackageImpl theCompositeidPackage = (CompositeidPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CompositeidPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CompositeidPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCompositeidPackage.createPackageContents();

		// Initialize created meta-data
		theCompositeidPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompositeidPackage.freeze();

		return theCompositeidPackage;
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
	public CompositeidFactory getCompositeidFactory() {
		return (CompositeidFactory)getEFactoryInstance();
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

		// Add supertypes to classes
		parentEClass.getESuperTypes().add(this.getPerson());
		childEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes and features; add operations and parameters
		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParent_Children(), this.getChild(), null, "children", null, 0, -1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://annotation.elver.org/JoinColumn/jc1
		createJc1Annotations();
		// http://annotation.elver.org/JoinColumn/jc2
		createJc2Annotations();
		// http://annotation.elver.org/OrderBy
		createOrderByAnnotations();
		// http://annotation.elver.org/IdClass
		createIdClassAnnotations();
		// http://annotation.elver.org/Id
		createIdAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/JoinColumn/jc1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJc1Annotations() {
		String source = "http://annotation.elver.org/JoinColumn";			
		addAnnotation
		  (getParent_Children(), 
		   source, 
		   new String[] {
			 "name", "myParentFirstName",
			 "referencedColumnName", "firstName"
		   });					
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/JoinColumn/jc2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJc2Annotations() {
		String source = "http://annotation.elver.org/JoinColumn";				
		addAnnotation
		  (getParent_Children(), 
		   source, 
		   new String[] {
			 "name", "myParentLastName",
			 "referencedColumnName", "lastName"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/OrderBy</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrderByAnnotations() {
		String source = "http://annotation.elver.org/OrderBy";					
		addAnnotation
		  (getParent_Children(), 
		   source, 
		   new String[] {
			 "value", "firstName"
		   });			
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/IdClass</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdClassAnnotations() {
		String source = "http://annotation.elver.org/IdClass";						
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "value", "org.eclipse.emf.teneo.samples.emf.annotations.compositeid.PersonID"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdAnnotations() {
		String source = "http://annotation.elver.org/Id";							
		addAnnotation
		  (getPerson_FirstName(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getPerson_LastName(), 
		   source, 
		   new String[] {
		   });
	}

} //CompositeidPackageImpl
