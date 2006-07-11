/**
 * <copyright>
 * </copyright>
 *
 * $Id: AttributeoverridesPackageImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.City;
import org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeoverridesPackageImpl extends EPackageImpl implements AttributeoverridesPackage {
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
	private EClass cityEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attributeoverrides.AttributeoverridesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AttributeoverridesPackageImpl() {
		super(eNS_URI, AttributeoverridesFactory.eINSTANCE);
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
	public static AttributeoverridesPackage init() {
		if (isInited) return (AttributeoverridesPackage)EPackage.Registry.INSTANCE.getEPackage(AttributeoverridesPackage.eNS_URI);

		// Obtain or create and register package
		AttributeoverridesPackageImpl theAttributeoverridesPackage = (AttributeoverridesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AttributeoverridesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AttributeoverridesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAttributeoverridesPackage.createPackageContents();

		// Initialize created meta-data
		theAttributeoverridesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAttributeoverridesPackage.freeze();

		return theAttributeoverridesPackage;
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
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_BornIn() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_LivesIn() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Country() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeoverridesFactory getAttributeoverridesFactory() {
		return (AttributeoverridesFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__BORN_IN);
		createEReference(personEClass, PERSON__LIVES_IN);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEAttribute(cityEClass, CITY__COUNTRY);
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

		// Initialize classes and features; add operations and parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_BornIn(), this.getCity(), null, "bornIn", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_LivesIn(), this.getCity(), null, "livesIn", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_Country(), ecorePackage.getEString(), "country", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://annotation.elver.org/Embedded
		createEmbeddedAnnotations();
		// http://annotation.elver.org/AttributeOverride
		createAttributeOverrideAnnotations();
		// http://annotation.elver.org/Column/c1
		createC1Annotations();
		// http://annotation.elver.org/AttributeOverrides
		createAttributeOverridesAnnotations();
		// http://annotation.elver.org/AttributeOverride/a1
		createA1Annotations();
		// http://annotation.elver.org/AttributeOverride/a2
		createA2Annotations();
		// http://annotation.elver.org/Column/c2
		createC2Annotations();
		// http://annotation.elver.org/Embeddable
		createEmbeddableAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Embedded</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmbeddedAnnotations() {
		String source = "http://annotation.elver.org/Embedded";			
		addAnnotation
		  (getPerson_BornIn(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
		   });						
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/AttributeOverrides</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAttributeOverridesAnnotations() {
		String source = "http://annotation.elver.org/AttributeOverrides";							
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
			 "value", "a1 a2"
		   });					
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/AttributeOverride/a1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createA1Annotations() {
		String source = "http://annotation.elver.org/AttributeOverride/a1";								
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
			 "name", "name",
			 "column", "c1"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/AttributeOverride/a2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createA2Annotations() {
		String source = "http://annotation.elver.org/AttributeOverride/a2";										
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
			 "name", "country",
			 "column", "c2"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Column/c2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createC2Annotations() {
		String source = "http://annotation.elver.org/Column/c2";											
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
			 "name", "countryColumn"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Embeddable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmbeddableAnnotations() {
		String source = "http://annotation.elver.org/Embeddable";												
		addAnnotation
		  (cityEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/AttributeOverride</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAttributeOverrideAnnotations() {
		String source = "http://annotation.elver.org/AttributeOverride";				
		addAnnotation
		  (getPerson_BornIn(), 
		   source, 
		   new String[] {
			 "name", "name",
			 "column", "c1"
		   });								
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Column/c1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createC1Annotations() {
		String source = "http://annotation.elver.org/Column/c1";					
		addAnnotation
		  (getPerson_BornIn(), 
		   source, 
		   new String[] {
			 "name", "bornNameColumn"
		   });					
		addAnnotation
		  (getPerson_LivesIn(), 
		   source, 
		   new String[] {
			 "name", "nameColumn"
		   });			
	}

} //AttributeoverridesPackageImpl
