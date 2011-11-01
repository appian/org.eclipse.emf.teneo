/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277546PackageImpl.java,v 1.2 2009/05/23 10:49:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz277546.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz277546.AnotherVersion;
import org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Factory;
import org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package;
import org.eclipse.emf.teneo.samples.issues.bz277546.DateVersion;
import org.eclipse.emf.teneo.samples.issues.bz277546.SimpleVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz277546PackageImpl extends EPackageImpl implements Bz277546Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anotherVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType theDateEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz277546.Bz277546Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz277546PackageImpl() {
		super(eNS_URI, Bz277546Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz277546Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz277546Package init() {
		if (isInited) return (Bz277546Package)EPackage.Registry.INSTANCE.getEPackage(Bz277546Package.eNS_URI);

		// Obtain or create and register package
		Bz277546PackageImpl theBz277546Package = (Bz277546PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz277546PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz277546PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz277546Package.createPackageContents();

		// Initialize created meta-data
		theBz277546Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz277546Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz277546Package.eNS_URI, theBz277546Package);
		return theBz277546Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnotherVersion() {
		return anotherVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotherVersion_Id() {
		return (EAttribute)anotherVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnotherVersion_Version() {
		return (EAttribute)anotherVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateVersion() {
		return dateVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateVersion_Id() {
		return (EAttribute)dateVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateVersion_Version() {
		return (EAttribute)dateVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleVersion() {
		return simpleVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleVersion_Id() {
		return (EAttribute)simpleVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleVersion_Version() {
		return (EAttribute)simpleVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTheDate() {
		return theDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz277546Factory getBz277546Factory() {
		return (Bz277546Factory)getEFactoryInstance();
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
		anotherVersionEClass = createEClass(ANOTHER_VERSION);
		createEAttribute(anotherVersionEClass, ANOTHER_VERSION__ID);
		createEAttribute(anotherVersionEClass, ANOTHER_VERSION__VERSION);

		dateVersionEClass = createEClass(DATE_VERSION);
		createEAttribute(dateVersionEClass, DATE_VERSION__ID);
		createEAttribute(dateVersionEClass, DATE_VERSION__VERSION);

		simpleVersionEClass = createEClass(SIMPLE_VERSION);
		createEAttribute(simpleVersionEClass, SIMPLE_VERSION__ID);
		createEAttribute(simpleVersionEClass, SIMPLE_VERSION__VERSION);

		// Create data types
		theDateEDataType = createEDataType(THE_DATE);
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
		initEClass(anotherVersionEClass, AnotherVersion.class, "AnotherVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnotherVersion_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, AnotherVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnotherVersion_Version(), this.getTheDate(), "version", null, 1, 1, AnotherVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateVersionEClass, DateVersion.class, "DateVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateVersion_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, DateVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateVersion_Version(), this.getTheDate(), "version", null, 1, 1, DateVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleVersionEClass, SimpleVersion.class, "SimpleVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleVersion_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, SimpleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleVersion_Version(), this.getTheDate(), "version", null, 1, 1, SimpleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(theDateEDataType, Date.class, "TheDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.hibernate
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
		  (anotherVersionEClass, 
		   source, 
		   new String[] {
			 "name", "AnotherVersion",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getAnotherVersion_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getAnotherVersion_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (dateVersionEClass, 
		   source, 
		   new String[] {
			 "name", "DateVersion",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getDateVersion_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getDateVersion_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (simpleVersionEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleVersion",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSimpleVersion_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "id"
		   });			
		addAnnotation
		  (getSimpleVersion_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version"
		   });		
		addAnnotation
		  (theDateEDataType, 
		   source, 
		   new String[] {
			 "name", "theDate"
		   });
	}

	/**
	 * Initializes the annotations for <b>teneo.hibernate</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.hibernate";			
		addAnnotation
		  (getAnotherVersion_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id @GeneratedValue\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getAnotherVersion_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version @Temporal(TIMESTAMP)"
		   });				
		addAnnotation
		  (getDateVersion_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id @GeneratedValue\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getDateVersion_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });				
		addAnnotation
		  (getSimpleVersion_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id @GeneratedValue\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getSimpleVersion_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version  @Temporal(TIMESTAMP)"
		   });		
	}

} //Bz277546PackageImpl
