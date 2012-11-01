/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalPackageImpl.java,v 1.2 2011/02/27 20:10:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.external.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalObject;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalPackageImpl extends EPackageImpl implements ExternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalObjectEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalPackageImpl() {
		super(eNS_URI, ExternalFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalPackage init() {
		if (isInited) return (ExternalPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);

		// Obtain or create and register package
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExternalPackage.createPackageContents();

		// Initialize created meta-data
		theExternalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalPackage.eNS_URI, theExternalPackage);
		return theExternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalTest() {
		return externalTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalTest_Name() {
		return (EAttribute)externalTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTest_EObject() {
		return (EReference)externalTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTest_EObjects() {
		return (EReference)externalTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTest_EClass() {
		return (EReference)externalTestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTest_ExternalObject() {
		return (EReference)externalTestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTest_ExternalObjects() {
		return (EReference)externalTestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalObject() {
		return externalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFactory getExternalFactory() {
		return (ExternalFactory)getEFactoryInstance();
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
		externalTestEClass = createEClass(EXTERNAL_TEST);
		createEAttribute(externalTestEClass, EXTERNAL_TEST__NAME);
		createEReference(externalTestEClass, EXTERNAL_TEST__EOBJECT);
		createEReference(externalTestEClass, EXTERNAL_TEST__EOBJECTS);
		createEReference(externalTestEClass, EXTERNAL_TEST__ECLASS);
		createEReference(externalTestEClass, EXTERNAL_TEST__EXTERNAL_OBJECT);
		createEReference(externalTestEClass, EXTERNAL_TEST__EXTERNAL_OBJECTS);

		externalObjectEClass = createEClass(EXTERNAL_OBJECT);
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
		initEClass(externalTestEClass, ExternalTest.class, "ExternalTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalTest_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTest_EObject(), ecorePackage.getEObject(), null, "eObject", null, 0, 1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTest_EObjects(), ecorePackage.getEObject(), null, "eObjects", null, 0, -1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTest_EClass(), ecorePackage.getEClass(), null, "eClass", null, 0, 1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTest_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTest_ExternalObjects(), this.getExternalObject(), null, "externalObjects", null, 0, -1, ExternalTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalObjectEClass, ExternalObject.class, "ExternalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
		// teneo.jpa.auditing
		createTeneo_1Annotations();
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
		  (getExternalTest_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "city"
		   });								
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
		  (getExternalTest_EObject(), 
		   source, 
		   new String[] {
			 "value", "@External"
		   });			
		addAnnotation
		  (getExternalTest_EObjects(), 
		   source, 
		   new String[] {
			 "value", "@External"
		   });			
		addAnnotation
		  (getExternalTest_EClass(), 
		   source, 
		   new String[] {
			 "value", "@External(type=\"org.eclipse.emf.teneo.hibernate.mapping.EcoreModelElementType\")"
		   });			
		addAnnotation
		  (externalObjectEClass, 
		   source, 
		   new String[] {
			 "value", "@External"
		   });	
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa.auditing</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneo_1Annotations() {
		String source = "teneo.jpa.auditing";				
		addAnnotation
		  (getExternalTest_EObject(), 
		   source, 
		   new String[] {
			 "value", "@External"
		   });			
		addAnnotation
		  (getExternalTest_EObjects(), 
		   source, 
		   new String[] {
			 "value", "@External"
		   });			
		addAnnotation
		  (getExternalTest_EClass(), 
		   source, 
		   new String[] {
			 "value", "@External(type=\"org.eclipse.emf.teneo.hibernate.mapping.EcoreModelElementType\")"
		   });			
		addAnnotation
		  (externalObjectEClass, 
		   source, 
		   new String[] {
			 "value", "@External"
		   });
	}

} //ExternalPackageImpl
