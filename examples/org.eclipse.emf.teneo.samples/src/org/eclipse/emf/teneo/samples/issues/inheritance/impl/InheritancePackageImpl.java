/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancePackageImpl.java,v 1.1 2006/07/11 16:57:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.inheritance.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.inheritance.Annotation;
import org.eclipse.emf.teneo.samples.issues.inheritance.InheritanceFactory;
import org.eclipse.emf.teneo.samples.issues.inheritance.InheritancePackage;
import org.eclipse.emf.teneo.samples.issues.inheritance.Interest;
import org.eclipse.emf.teneo.samples.issues.inheritance.SubOne;
import org.eclipse.emf.teneo.samples.issues.inheritance.SubThing;
import org.eclipse.emf.teneo.samples.issues.inheritance.SubTwo;
import org.eclipse.emf.teneo.samples.issues.inheritance.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritancePackageImpl extends EPackageImpl implements InheritancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subThingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTwoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.inheritance.InheritancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InheritancePackageImpl() {
		super(eNS_URI, InheritanceFactory.eINSTANCE);
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
	public static InheritancePackage init() {
		if (isInited) return (InheritancePackage)EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI);

		// Obtain or create and register package
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new InheritancePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInheritancePackage.createPackageContents();

		// Initialize created meta-data
		theInheritancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInheritancePackage.freeze();

		return theInheritancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterest() {
		return interestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubOne() {
		return subOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubThing() {
		return subThingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubThing_Name() {
		return (EAttribute)subThingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTwo() {
		return subTwoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Name() {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Things() {
		return (EReference)thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceFactory getInheritanceFactory() {
		return (InheritanceFactory)getEFactoryInstance();
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
		annotationEClass = createEClass(ANNOTATION);

		interestEClass = createEClass(INTEREST);

		subOneEClass = createEClass(SUB_ONE);

		subThingEClass = createEClass(SUB_THING);
		createEAttribute(subThingEClass, SUB_THING__NAME);

		subTwoEClass = createEClass(SUB_TWO);

		thingEClass = createEClass(THING);
		createEAttribute(thingEClass, THING__NAME);
		createEReference(thingEClass, THING__THINGS);
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

		// Add supertypes to classes
		annotationEClass.getESuperTypes().add(this.getThing());
		interestEClass.getESuperTypes().add(this.getThing());
		subOneEClass.getESuperTypes().add(this.getAnnotation());
		subOneEClass.getESuperTypes().add(this.getInterest());
		subTwoEClass.getESuperTypes().add(this.getAnnotation());
		subTwoEClass.getESuperTypes().add(this.getInterest());

		// Initialize classes and features; add operations and parameters
		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interestEClass, Interest.class, "Interest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subOneEClass, SubOne.class, "SubOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subThingEClass, SubThing.class, "SubThing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubThing_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, SubThing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subTwoEClass, SubTwo.class, "SubTwo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Things(), this.getSubThing(), null, "things", null, 1, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (annotationEClass, 
		   source, 
		   new String[] {
			 "name", "Annotation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (interestEClass, 
		   source, 
		   new String[] {
			 "name", "Interest",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (subOneEClass, 
		   source, 
		   new String[] {
			 "name", "SubOne",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (subThingEClass, 
		   source, 
		   new String[] {
			 "name", "SubThing",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubThing_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (subTwoEClass, 
		   source, 
		   new String[] {
			 "name", "SubTwo",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (thingEClass, 
		   source, 
		   new String[] {
			 "name", "Thing",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getThing_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getThing_Things(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "things"
		   });
	}

} //InheritancePackageImpl
