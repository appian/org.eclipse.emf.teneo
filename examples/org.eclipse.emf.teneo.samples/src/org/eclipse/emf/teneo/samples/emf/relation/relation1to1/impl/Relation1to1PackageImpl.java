/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1to1PackageImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Factory;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Relation1to1PackageImpl extends EPackageImpl implements Relation1to1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedChildNREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containedChildREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notContainedChildNREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notContainedChildNRTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notContainedChildNRTNREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notContainedChildREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notContainedChildRTNREClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Relation1to1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Relation1to1PackageImpl() {
		super(eNS_URI, Relation1to1Factory.eINSTANCE);
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
	public static Relation1to1Package init() {
		if (isInited) return (Relation1to1Package)EPackage.Registry.INSTANCE.getEPackage(Relation1to1Package.eNS_URI);

		// Obtain or create and register package
		Relation1to1PackageImpl theRelation1to1Package = (Relation1to1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Relation1to1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Relation1to1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theRelation1to1Package.createPackageContents();

		// Initialize created meta-data
		theRelation1to1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelation1to1Package.freeze();

		return theRelation1to1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedChildNR() {
		return containedChildNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedChildNR_Name() {
		return (EAttribute)containedChildNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainedChildR() {
		return containedChildREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainedChildR_Name() {
		return (EAttribute)containedChildREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMain_Name() {
		return (EAttribute)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Containedonewayrequired() {
		return (EReference)mainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_ContainedoneWaynotrequired() {
		return (EReference)mainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Notcontainedonewayrequired() {
		return (EReference)mainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Notcontainedonewaynotrequired() {
		return (EReference)mainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Notcontainedtwowaynotrequired() {
		return (EReference)mainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Notcontainedtwowayrequirednr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Notcontainedtwowaynotrequirednr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotContainedChildNR() {
		return notContainedChildNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotContainedChildNR_Name() {
		return (EAttribute)notContainedChildNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotContainedChildNRT() {
		return notContainedChildNRTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotContainedChildNRT_Name() {
		return (EAttribute)notContainedChildNRTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotContainedChildNRT_Main() {
		return (EReference)notContainedChildNRTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotContainedChildNRTNR() {
		return notContainedChildNRTNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotContainedChildNRTNR_Name() {
		return (EAttribute)notContainedChildNRTNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotContainedChildNRTNR_Main() {
		return (EReference)notContainedChildNRTNREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotContainedChildR() {
		return notContainedChildREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotContainedChildR_Name() {
		return (EAttribute)notContainedChildREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotContainedChildRTNR() {
		return notContainedChildRTNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotContainedChildRTNR_Name() {
		return (EAttribute)notContainedChildRTNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotContainedChildRTNR_Main() {
		return (EReference)notContainedChildRTNREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1to1Factory getRelation1to1Factory() {
		return (Relation1to1Factory)getEFactoryInstance();
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
		containedChildNREClass = createEClass(CONTAINED_CHILD_NR);
		createEAttribute(containedChildNREClass, CONTAINED_CHILD_NR__NAME);

		containedChildREClass = createEClass(CONTAINED_CHILD_R);
		createEAttribute(containedChildREClass, CONTAINED_CHILD_R__NAME);

		mainEClass = createEClass(MAIN);
		createEAttribute(mainEClass, MAIN__NAME);
		createEReference(mainEClass, MAIN__CONTAINEDONEWAYREQUIRED);
		createEReference(mainEClass, MAIN__CONTAINEDONE_WAYNOTREQUIRED);
		createEReference(mainEClass, MAIN__NOTCONTAINEDONEWAYREQUIRED);
		createEReference(mainEClass, MAIN__NOTCONTAINEDONEWAYNOTREQUIRED);
		createEReference(mainEClass, MAIN__NOTCONTAINEDTWOWAYNOTREQUIRED);
		createEReference(mainEClass, MAIN__NOTCONTAINEDTWOWAYREQUIREDNR);
		createEReference(mainEClass, MAIN__NOTCONTAINEDTWOWAYNOTREQUIREDNR);

		notContainedChildNREClass = createEClass(NOT_CONTAINED_CHILD_NR);
		createEAttribute(notContainedChildNREClass, NOT_CONTAINED_CHILD_NR__NAME);

		notContainedChildNRTEClass = createEClass(NOT_CONTAINED_CHILD_NRT);
		createEAttribute(notContainedChildNRTEClass, NOT_CONTAINED_CHILD_NRT__NAME);
		createEReference(notContainedChildNRTEClass, NOT_CONTAINED_CHILD_NRT__MAIN);

		notContainedChildNRTNREClass = createEClass(NOT_CONTAINED_CHILD_NRTNR);
		createEAttribute(notContainedChildNRTNREClass, NOT_CONTAINED_CHILD_NRTNR__NAME);
		createEReference(notContainedChildNRTNREClass, NOT_CONTAINED_CHILD_NRTNR__MAIN);

		notContainedChildREClass = createEClass(NOT_CONTAINED_CHILD_R);
		createEAttribute(notContainedChildREClass, NOT_CONTAINED_CHILD_R__NAME);

		notContainedChildRTNREClass = createEClass(NOT_CONTAINED_CHILD_RTNR);
		createEAttribute(notContainedChildRTNREClass, NOT_CONTAINED_CHILD_RTNR__NAME);
		createEReference(notContainedChildRTNREClass, NOT_CONTAINED_CHILD_RTNR__MAIN);
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
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(containedChildNREClass, ContainedChildNR.class, "ContainedChildNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainedChildNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ContainedChildNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedChildREClass, ContainedChildR.class, "ContainedChildR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainedChildR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ContainedChildR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_Name(), theXMLTypePackage.getString(), "name", "c1", 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Containedonewayrequired(), this.getContainedChildR(), null, "containedonewayrequired", null, 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_ContainedoneWaynotrequired(), this.getContainedChildNR(), null, "containedoneWaynotrequired", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Notcontainedonewayrequired(), this.getNotContainedChildR(), null, "notcontainedonewayrequired", null, 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Notcontainedonewaynotrequired(), this.getNotContainedChildNR(), null, "notcontainedonewaynotrequired", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Notcontainedtwowaynotrequired(), this.getNotContainedChildNRT(), this.getNotContainedChildNRT_Main(), "notcontainedtwowaynotrequired", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Notcontainedtwowayrequirednr(), this.getNotContainedChildRTNR(), this.getNotContainedChildRTNR_Main(), "notcontainedtwowayrequirednr", null, 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Notcontainedtwowaynotrequirednr(), this.getNotContainedChildNRTNR(), this.getNotContainedChildNRTNR_Main(), "notcontainedtwowaynotrequirednr", null, 0, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notContainedChildNREClass, NotContainedChildNR.class, "NotContainedChildNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotContainedChildNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NotContainedChildNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notContainedChildNRTEClass, NotContainedChildNRT.class, "NotContainedChildNRT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotContainedChildNRT_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NotContainedChildNRT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotContainedChildNRT_Main(), this.getMain(), this.getMain_Notcontainedtwowaynotrequired(), "main", null, 1, 1, NotContainedChildNRT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notContainedChildNRTNREClass, NotContainedChildNRTNR.class, "NotContainedChildNRTNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotContainedChildNRTNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NotContainedChildNRTNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotContainedChildNRTNR_Main(), this.getMain(), this.getMain_Notcontainedtwowaynotrequirednr(), "main", null, 0, 1, NotContainedChildNRTNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notContainedChildREClass, NotContainedChildR.class, "NotContainedChildR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotContainedChildR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NotContainedChildR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notContainedChildRTNREClass, NotContainedChildRTNR.class, "NotContainedChildRTNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotContainedChildRTNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NotContainedChildRTNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotContainedChildRTNR_Main(), this.getMain(), this.getMain_Notcontainedtwowayrequirednr(), "main", null, 0, 1, NotContainedChildRTNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (containedChildNREClass, 
		   source, 
		   new String[] {
			 "name", "ContainedChildNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainedChildNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (containedChildREClass, 
		   source, 
		   new String[] {
			 "name", "ContainedChildR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getContainedChildR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (mainEClass, 
		   source, 
		   new String[] {
			 "name", "Main",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMain_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getMain_Containedonewayrequired(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containedonewayrequired"
		   });		
		addAnnotation
		  (getMain_ContainedoneWaynotrequired(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "containedoneWaynotrequired"
		   });		
		addAnnotation
		  (getMain_Notcontainedonewayrequired(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notcontainedonewayrequired"
		   });		
		addAnnotation
		  (getMain_Notcontainedonewaynotrequired(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notcontainedonewaynotrequired"
		   });		
		addAnnotation
		  (getMain_Notcontainedtwowaynotrequired(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notcontainedtwowaynotrequired"
		   });		
		addAnnotation
		  (getMain_Notcontainedtwowayrequirednr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notcontainedtwowayrequirednr"
		   });		
		addAnnotation
		  (getMain_Notcontainedtwowaynotrequirednr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notcontainedtwowaynotrequirednr"
		   });		
		addAnnotation
		  (notContainedChildNREClass, 
		   source, 
		   new String[] {
			 "name", "NotContainedChildNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotContainedChildNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (notContainedChildNRTEClass, 
		   source, 
		   new String[] {
			 "name", "NotContainedChildNRT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotContainedChildNRT_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getNotContainedChildNRT_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });		
		addAnnotation
		  (notContainedChildNRTNREClass, 
		   source, 
		   new String[] {
			 "name", "NotContainedChildNRTNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotContainedChildNRTNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getNotContainedChildNRTNR_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });		
		addAnnotation
		  (notContainedChildREClass, 
		   source, 
		   new String[] {
			 "name", "NotContainedChildR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotContainedChildR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (notContainedChildRTNREClass, 
		   source, 
		   new String[] {
			 "name", "NotContainedChildRTNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNotContainedChildRTNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getNotContainedChildRTNR_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });
	}

} //Relation1to1PackageImpl
