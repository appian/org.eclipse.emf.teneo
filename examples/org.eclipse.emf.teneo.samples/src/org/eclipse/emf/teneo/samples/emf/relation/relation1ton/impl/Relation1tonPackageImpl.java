/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1tonPackageImpl.java,v 1.2 2006/07/22 13:01:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonFactory;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Relation1tonPackageImpl extends EPackageImpl implements Relation1tonPackage {
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
	private EClass oneCNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneNREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoCNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoCREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoNREClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Relation1tonPackageImpl() {
		super(eNS_URI, Relation1tonFactory.eINSTANCE);
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
	public static Relation1tonPackage init() {
		if (isInited) return (Relation1tonPackage)EPackage.Registry.INSTANCE.getEPackage(Relation1tonPackage.eNS_URI);

		// Obtain or create and register package
		Relation1tonPackageImpl theRelation1tonPackage = (Relation1tonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof Relation1tonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new Relation1tonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRelation1tonPackage.createPackageContents();

		// Initialize created meta-data
		theRelation1tonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelation1tonPackage.freeze();

		return theRelation1tonPackage;
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
	public EReference getMain_Onecr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Onecn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Onenr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Onenn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Twocr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Twocn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Twonr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Twonn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneCN() {
		return oneCNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneCN_Name() {
		return (EAttribute)oneCNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneCR() {
		return oneCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneCR_Name() {
		return (EAttribute)oneCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneNN() {
		return oneNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneNN_Name() {
		return (EAttribute)oneNNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneNR() {
		return oneNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneNR_Name() {
		return (EAttribute)oneNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoCN() {
		return twoCNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoCN_Name() {
		return (EAttribute)twoCNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwoCN_Main() {
		return (EReference)twoCNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoCR() {
		return twoCREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoCR_Name() {
		return (EAttribute)twoCREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwoCR_Main() {
		return (EReference)twoCREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoNN() {
		return twoNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoNN_Name() {
		return (EAttribute)twoNNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwoNN_Main() {
		return (EReference)twoNNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoNR() {
		return twoNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTwoNR_Name() {
		return (EAttribute)twoNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTwoNR_Main() {
		return (EReference)twoNREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1tonFactory getRelation1tonFactory() {
		return (Relation1tonFactory)getEFactoryInstance();
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
		mainEClass = createEClass(MAIN);
		createEAttribute(mainEClass, MAIN__NAME);
		createEReference(mainEClass, MAIN__ONECR);
		createEReference(mainEClass, MAIN__ONECN);
		createEReference(mainEClass, MAIN__ONENR);
		createEReference(mainEClass, MAIN__ONENN);
		createEReference(mainEClass, MAIN__TWOCR);
		createEReference(mainEClass, MAIN__TWOCN);
		createEReference(mainEClass, MAIN__TWONR);
		createEReference(mainEClass, MAIN__TWONN);

		oneCNEClass = createEClass(ONE_CN);
		createEAttribute(oneCNEClass, ONE_CN__NAME);

		oneCREClass = createEClass(ONE_CR);
		createEAttribute(oneCREClass, ONE_CR__NAME);

		oneNNEClass = createEClass(ONE_NN);
		createEAttribute(oneNNEClass, ONE_NN__NAME);

		oneNREClass = createEClass(ONE_NR);
		createEAttribute(oneNREClass, ONE_NR__NAME);

		twoCNEClass = createEClass(TWO_CN);
		createEAttribute(twoCNEClass, TWO_CN__NAME);
		createEReference(twoCNEClass, TWO_CN__MAIN);

		twoCREClass = createEClass(TWO_CR);
		createEAttribute(twoCREClass, TWO_CR__NAME);
		createEReference(twoCREClass, TWO_CR__MAIN);

		twoNNEClass = createEClass(TWO_NN);
		createEAttribute(twoNNEClass, TWO_NN__NAME);
		createEReference(twoNNEClass, TWO_NN__MAIN);

		twoNREClass = createEClass(TWO_NR);
		createEAttribute(twoNREClass, TWO_NR__NAME);
		createEReference(twoNREClass, TWO_NR__MAIN);
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

		// Initialize classes and features; add operations and parameters
		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_Name(), theXMLTypePackage.getString(), "name", "c1", 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Onecr(), this.getOneCR(), null, "onecr", null, 1, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Onecn(), this.getOneCN(), null, "onecn", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Onenr(), this.getOneNR(), null, "onenr", null, 1, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Onenn(), this.getOneNN(), null, "onenn", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Twocr(), this.getTwoCR(), this.getTwoCR_Main(), "twocr", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Twocn(), this.getTwoCN(), this.getTwoCN_Main(), "twocn", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Twonr(), this.getTwoNR(), this.getTwoNR_Main(), "twonr", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Twonn(), this.getTwoNN(), this.getTwoNN_Main(), "twonn", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneCNEClass, OneCN.class, "OneCN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneCN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneCN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneCREClass, OneCR.class, "OneCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneCR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneNNEClass, OneNN.class, "OneNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneNN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneNREClass, OneNR.class, "OneNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OneNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoCNEClass, TwoCN.class, "TwoCN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoCN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TwoCN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoCN_Main(), this.getMain(), this.getMain_Twocn(), "main", null, 0, 1, TwoCN.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoCREClass, TwoCR.class, "TwoCR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoCR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TwoCR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoCR_Main(), this.getMain(), this.getMain_Twocr(), "main", null, 0, 1, TwoCR.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoNNEClass, TwoNN.class, "TwoNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoNN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TwoNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoNN_Main(), this.getMain(), this.getMain_Twonn(), "main", null, 0, 1, TwoNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoNREClass, TwoNR.class, "TwoNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TwoNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoNR_Main(), this.getMain(), this.getMain_Twonr(), "main", null, 1, 1, TwoNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getMain_Onecr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onecr"
		   });		
		addAnnotation
		  (getMain_Onecn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onecn"
		   });		
		addAnnotation
		  (getMain_Onenr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onenr"
		   });		
		addAnnotation
		  (getMain_Onenn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onenn"
		   });		
		addAnnotation
		  (getMain_Twocr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "twocr"
		   });		
		addAnnotation
		  (getMain_Twocn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "twocn"
		   });		
		addAnnotation
		  (getMain_Twonr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "twonr"
		   });		
		addAnnotation
		  (getMain_Twonn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "twonn"
		   });		
		addAnnotation
		  (oneCNEClass, 
		   source, 
		   new String[] {
			 "name", "OneCN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneCN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (oneCREClass, 
		   source, 
		   new String[] {
			 "name", "OneCR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneCR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (oneNNEClass, 
		   source, 
		   new String[] {
			 "name", "OneNN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneNN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (oneNREClass, 
		   source, 
		   new String[] {
			 "name", "OneNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOneNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (twoCNEClass, 
		   source, 
		   new String[] {
			 "name", "TwoCN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTwoCN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (twoCREClass, 
		   source, 
		   new String[] {
			 "name", "TwoCR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTwoCR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (twoNNEClass, 
		   source, 
		   new String[] {
			 "name", "TwoNN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTwoNN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getTwoNN_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });		
		addAnnotation
		  (twoNREClass, 
		   source, 
		   new String[] {
			 "name", "TwoNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTwoNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getTwoNR_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });
	}

} //Relation1tonPackageImpl
