/**
 */
package org.eclipse.emf.teneo.samples.issues.bz398161.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Factory;
import org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefOne;
import org.eclipse.emf.teneo.samples.issues.bz398161.RefTwo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz398161PackageImpl extends EPackageImpl implements Bz398161Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTwoEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz398161.Bz398161Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz398161PackageImpl() {
		super(eNS_URI, Bz398161Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz398161Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz398161Package init() {
		if (isInited) return (Bz398161Package)EPackage.Registry.INSTANCE.getEPackage(Bz398161Package.eNS_URI);

		// Obtain or create and register package
		Bz398161PackageImpl theBz398161Package = (Bz398161PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz398161PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz398161PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz398161Package.createPackageContents();

		// Initialize created meta-data
		theBz398161Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz398161Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz398161Package.eNS_URI, theBz398161Package);
		return theBz398161Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefOne() {
		return refOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefOne_Id() {
		return (EAttribute)refOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefOne_RefTwo() {
		return (EReference)refOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefOne_StringVal() {
		return (EAttribute)refOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTwo() {
		return refTwoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefTwo_Number() {
		return (EAttribute)refTwoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz398161Factory getBz398161Factory() {
		return (Bz398161Factory)getEFactoryInstance();
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
		refOneEClass = createEClass(REF_ONE);
		createEAttribute(refOneEClass, REF_ONE__ID);
		createEReference(refOneEClass, REF_ONE__REF_TWO);
		createEAttribute(refOneEClass, REF_ONE__STRING_VAL);

		refTwoEClass = createEClass(REF_TWO);
		createEAttribute(refTwoEClass, REF_TWO__NUMBER);
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
		initEClass(refOneEClass, RefOne.class, "RefOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefOne_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, RefOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefOne_RefTwo(), this.getRefTwo(), null, "refTwo", null, 1, 1, RefOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefOne_StringVal(), theXMLTypePackage.getString(), "stringVal", null, 1, 1, RefOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTwoEClass, RefTwo.class, "RefTwo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefTwo_Number(), theXMLTypePackage.getString(), "number", null, 1, 1, RefTwo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (refOneEClass, 
		   source, 
		   new String[] {
			 "name", "RefOne",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRefOne_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getRefOne_RefTwo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refTwo"
		   });			
		addAnnotation
		  (getRefOne_StringVal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stringVal"
		   });		
		addAnnotation
		  (refTwoEClass, 
		   source, 
		   new String[] {
			 "name", "RefTwo",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRefTwo_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number"
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
		  (getRefOne_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@GeneratedValue\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getRefOne_RefTwo(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@JoinColumn(name=\"prodr_num\",columnDefinition = \"CHARACTER(6) NOT NULL\")\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getRefOne_StringVal(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Column(name=\"stringVal\",columnDefinition = \"CHARACTER(64) NOT NULL\")\n\t\t\t\t\t"
		   });				
		addAnnotation
		  (getRefTwo_Number(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@Column(name=\"prodr_num\",\n\t\t\t\t\t\tcolumnDefinition = \"CHARACTER(6)\", length=6)\n\t\t\t\t\t"
		   });	
	}

} //Bz398161PackageImpl
