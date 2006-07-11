/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopclassesPackageImpl.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.issues.topclasses.AbstractSuper;
import org.eclipse.emf.teneo.samples.issues.topclasses.MList;
import org.eclipse.emf.teneo.samples.issues.topclasses.PList;
import org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesFactory;
import org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopclassesPackageImpl extends EPackageImpl implements TopclassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSuperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TopclassesPackageImpl() {
		super(eNS_URI, TopclassesFactory.eINSTANCE);
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
	public static TopclassesPackage init() {
		if (isInited) return (TopclassesPackage)EPackage.Registry.INSTANCE.getEPackage(TopclassesPackage.eNS_URI);

		// Obtain or create and register package
		TopclassesPackageImpl theTopclassesPackage = (TopclassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TopclassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TopclassesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theTopclassesPackage.createPackageContents();

		// Initialize created meta-data
		theTopclassesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTopclassesPackage.freeze();

		return theTopclassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSuper() {
		return abstractSuperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSuper_Name() {
		return (EAttribute)abstractSuperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getM() {
		return mEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getM_P() {
		return (EReference)mEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMList() {
		return mListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMList_M() {
		return (EReference)mListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getP() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getP_M() {
		return (EReference)pEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPList() {
		return pListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPList_P() {
		return (EReference)pListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getR() {
		return rEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getR_Plist() {
		return (EReference)rEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getR_Mlist() {
		return (EReference)rEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopclassesFactory getTopclassesFactory() {
		return (TopclassesFactory)getEFactoryInstance();
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
		abstractSuperEClass = createEClass(ABSTRACT_SUPER);
		createEAttribute(abstractSuperEClass, ABSTRACT_SUPER__NAME);

		mEClass = createEClass(M);
		createEReference(mEClass, M__P);

		mListEClass = createEClass(MLIST);
		createEReference(mListEClass, MLIST__M);

		pEClass = createEClass(P);
		createEReference(pEClass, P__M);

		pListEClass = createEClass(PLIST);
		createEReference(pListEClass, PLIST__P);

		rEClass = createEClass(R);
		createEReference(rEClass, R__PLIST);
		createEReference(rEClass, R__MLIST);
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
		mEClass.getESuperTypes().add(this.getAbstractSuper());
		mListEClass.getESuperTypes().add(this.getAbstractSuper());
		pEClass.getESuperTypes().add(this.getAbstractSuper());
		pListEClass.getESuperTypes().add(this.getAbstractSuper());
		rEClass.getESuperTypes().add(this.getAbstractSuper());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractSuperEClass, AbstractSuper.class, "AbstractSuper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSuper_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AbstractSuper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mEClass, org.eclipse.emf.teneo.samples.issues.topclasses.M.class, "M", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getM_P(), this.getP(), this.getP_M(), "p", null, 0, -1, org.eclipse.emf.teneo.samples.issues.topclasses.M.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mListEClass, MList.class, "MList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMList_M(), this.getM(), null, "m", null, 0, -1, MList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pEClass, org.eclipse.emf.teneo.samples.issues.topclasses.P.class, "P", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getP_M(), this.getM(), this.getM_P(), "m", null, 0, -1, org.eclipse.emf.teneo.samples.issues.topclasses.P.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pListEClass, PList.class, "PList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPList_P(), this.getP(), null, "p", null, 0, -1, PList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rEClass, org.eclipse.emf.teneo.samples.issues.topclasses.R.class, "R", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getR_Plist(), this.getPList(), null, "plist", null, 1, 1, org.eclipse.emf.teneo.samples.issues.topclasses.R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getR_Mlist(), this.getMList(), null, "mlist", null, 1, 1, org.eclipse.emf.teneo.samples.issues.topclasses.R.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (abstractSuperEClass, 
		   source, 
		   new String[] {
			 "name", "AbstractSuper",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractSuper_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (mEClass, 
		   source, 
		   new String[] {
			 "name", "M",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getM_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p"
		   });		
		addAnnotation
		  (mListEClass, 
		   source, 
		   new String[] {
			 "name", "MList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMList_M(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "m"
		   });		
		addAnnotation
		  (pEClass, 
		   source, 
		   new String[] {
			 "name", "P",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getP_M(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "m"
		   });		
		addAnnotation
		  (pListEClass, 
		   source, 
		   new String[] {
			 "name", "PList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPList_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p"
		   });		
		addAnnotation
		  (rEClass, 
		   source, 
		   new String[] {
			 "name", "R",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getR_Plist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plist"
		   });		
		addAnnotation
		  (getR_Mlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mlist"
		   });
	}

} //TopclassesPackageImpl
