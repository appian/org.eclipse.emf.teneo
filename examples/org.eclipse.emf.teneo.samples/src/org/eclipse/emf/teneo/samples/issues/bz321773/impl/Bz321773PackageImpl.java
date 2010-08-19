/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321773PackageImpl.java,v 1.1 2010/08/19 08:34:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Factory;
import org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package;
import org.eclipse.emf.teneo.samples.issues.bz321773.Item1;
import org.eclipse.emf.teneo.samples.issues.bz321773.Item2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321773PackageImpl extends EPackageImpl implements Bz321773Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass item1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass item2EClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz321773.Bz321773Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz321773PackageImpl() {
		super(eNS_URI, Bz321773Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz321773Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz321773Package init() {
		if (isInited) return (Bz321773Package)EPackage.Registry.INSTANCE.getEPackage(Bz321773Package.eNS_URI);

		// Obtain or create and register package
		Bz321773PackageImpl theBz321773Package = (Bz321773PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz321773PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz321773PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz321773Package.createPackageContents();

		// Initialize created meta-data
		theBz321773Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz321773Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz321773Package.eNS_URI, theBz321773Package);
		return theBz321773Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem1() {
		return item1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem1_Id() {
		return (EAttribute)item1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem1_Data() {
		return (EAttribute)item1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem2() {
		return item2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem2_Id() {
		return (EAttribute)item2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem2_Data() {
		return (EAttribute)item2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321773Factory getBz321773Factory() {
		return (Bz321773Factory)getEFactoryInstance();
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
		item1EClass = createEClass(ITEM1);
		createEAttribute(item1EClass, ITEM1__ID);
		createEAttribute(item1EClass, ITEM1__DATA);

		item2EClass = createEClass(ITEM2);
		createEAttribute(item2EClass, ITEM2__ID);
		createEAttribute(item2EClass, ITEM2__DATA);
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
		initEClass(item1EClass, Item1.class, "Item1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem1_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Item1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem1_Data(), theXMLTypePackage.getString(), "data", null, 1, 1, Item1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(item2EClass, Item2.class, "Item2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem2_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Item2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem2_Data(), theXMLTypePackage.getString(), "data", null, 1, 1, Item2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (item1EClass, 
		   source, 
		   new String[] {
			 "name", "Item1",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItem1_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Id"
		   });		
		addAnnotation
		  (getItem1_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Data"
		   });		
		addAnnotation
		  (item2EClass, 
		   source, 
		   new String[] {
			 "name", "Item2",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItem2_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Id"
		   });		
		addAnnotation
		  (getItem2_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Data"
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
		  (getItem1_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@SequenceGenerator(name=\"seq1\", sequenceName=\"firstSeq\")\n\t\t\t\t\t\t@GeneratedValue(strategy=SEQUENCE, generator=\"seq1\")\n\t\t\t\t\t"
		   });					
		addAnnotation
		  (getItem2_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@SequenceGenerator(name=\"seq2\", sequenceName=\"secondSeq\", allocationSize=25)\n\t\t\t\t\t\t@GeneratedValue(strategy=SEQUENCE, generator=\"seq2\")\n\t\t\t\t\t\t@Id\n\t\t\t\t\t"
		   });		
	}

} //Bz321773PackageImpl
