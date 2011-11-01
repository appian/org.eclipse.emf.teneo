/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationntomPackageImpl.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.relation.relationntom.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiNR;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.MultiRN;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomFactory;
import org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationntomPackageImpl extends EPackageImpl implements RelationntomPackage {
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
	private EClass multiNNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiNREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRNEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationntomPackageImpl() {
		super(eNS_URI, RelationntomFactory.eINSTANCE);
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
	public static RelationntomPackage init() {
		if (isInited) return (RelationntomPackage)EPackage.Registry.INSTANCE.getEPackage(RelationntomPackage.eNS_URI);

		// Obtain or create and register package
		RelationntomPackageImpl theRelationntomPackage = (RelationntomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof RelationntomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new RelationntomPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRelationntomPackage.createPackageContents();

		// Initialize created meta-data
		theRelationntomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationntomPackage.freeze();

		return theRelationntomPackage;
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
	public EReference getMain_Multinr() {
		return (EReference)mainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Multirn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Multinn() {
		return (EReference)mainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiNN() {
		return multiNNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiNN_Name() {
		return (EAttribute)multiNNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiNN_Main() {
		return (EReference)multiNNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiNR() {
		return multiNREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiNR_Name() {
		return (EAttribute)multiNREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiNR_Main() {
		return (EReference)multiNREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiRN() {
		return multiRNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiRN_Name() {
		return (EAttribute)multiRNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiRN_Main() {
		return (EReference)multiRNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationntomFactory getRelationntomFactory() {
		return (RelationntomFactory)getEFactoryInstance();
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
		createEReference(mainEClass, MAIN__MULTINR);
		createEReference(mainEClass, MAIN__MULTIRN);
		createEReference(mainEClass, MAIN__MULTINN);

		multiNNEClass = createEClass(MULTI_NN);
		createEAttribute(multiNNEClass, MULTI_NN__NAME);
		createEReference(multiNNEClass, MULTI_NN__MAIN);

		multiNREClass = createEClass(MULTI_NR);
		createEAttribute(multiNREClass, MULTI_NR__NAME);
		createEReference(multiNREClass, MULTI_NR__MAIN);

		multiRNEClass = createEClass(MULTI_RN);
		createEAttribute(multiRNEClass, MULTI_RN__NAME);
		createEReference(multiRNEClass, MULTI_RN__MAIN);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMain_Name(), theXMLTypePackage.getString(), "name", "c1", 1, 1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Multinr(), this.getMultiNR(), this.getMultiNR_Main(), "multinr", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Multirn(), this.getMultiRN(), this.getMultiRN_Main(), "multirn", null, 1, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMain_Multinn(), this.getMultiNN(), this.getMultiNN_Main(), "multinn", null, 0, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiNNEClass, MultiNN.class, "MultiNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiNN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MultiNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiNN_Main(), this.getMain(), this.getMain_Multinn(), "main", null, 0, -1, MultiNN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiNREClass, MultiNR.class, "MultiNR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiNR_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MultiNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiNR_Main(), this.getMain(), this.getMain_Multinr(), "main", null, 1, -1, MultiNR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiRNEClass, MultiRN.class, "MultiRN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiRN_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MultiRN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiRN_Main(), this.getMain(), this.getMain_Multirn(), "main", null, 0, -1, MultiRN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getMain_Multinr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multinr"
		   });		
		addAnnotation
		  (getMain_Multirn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multirn"
		   });		
		addAnnotation
		  (getMain_Multinn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multinn"
		   });		
		addAnnotation
		  (multiNNEClass, 
		   source, 
		   new String[] {
			 "name", "MultiNN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiNN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getMultiNN_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });		
		addAnnotation
		  (multiNREClass, 
		   source, 
		   new String[] {
			 "name", "MultiNR",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiNR_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getMultiNR_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });		
		addAnnotation
		  (multiRNEClass, 
		   source, 
		   new String[] {
			 "name", "MultiRN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiRN_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getMultiRN_Main(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "main"
		   });
	}

} //RelationntomPackageImpl
