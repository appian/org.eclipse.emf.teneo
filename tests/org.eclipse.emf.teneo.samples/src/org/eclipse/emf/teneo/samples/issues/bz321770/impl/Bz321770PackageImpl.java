/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321770PackageImpl.java,v 1.1 2010/08/18 13:40:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321770.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Factory;
import org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package;
import org.eclipse.emf.teneo.samples.issues.bz321770.Child;
import org.eclipse.emf.teneo.samples.issues.bz321770.Parent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321770PackageImpl extends EPackageImpl implements Bz321770Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bz321770PackageImpl() {
		super(eNS_URI, Bz321770Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Bz321770Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bz321770Package init() {
		if (isInited) return (Bz321770Package)EPackage.Registry.INSTANCE.getEPackage(Bz321770Package.eNS_URI);

		// Obtain or create and register package
		Bz321770PackageImpl theBz321770Package = (Bz321770PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Bz321770PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Bz321770PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBz321770Package.createPackageContents();

		// Initialize created meta-data
		theBz321770Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBz321770Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bz321770Package.eNS_URI, theBz321770Package);
		return theBz321770Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChild_Id() {
		return (EAttribute)childEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChild_Name() {
		return (EAttribute)childEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParent() {
		return parentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParent_Child() {
		return (EReference)parentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321770Factory getBz321770Factory() {
		return (Bz321770Factory)getEFactoryInstance();
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
		childEClass = createEClass(CHILD);
		createEAttribute(childEClass, CHILD__ID);
		createEAttribute(childEClass, CHILD__NAME);

		parentEClass = createEClass(PARENT);
		createEReference(parentEClass, PARENT__CHILD);
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
		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChild_Id(), theXMLTypePackage.getLong(), "id", null, 1, 1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChild_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParent_Child(), this.getChild(), null, "child", null, 1, -1, Parent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (childEClass, 
		   source, 
		   new String[] {
			 "name", "Child",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getChild_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Id"
		   });		
		addAnnotation
		  (getChild_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (parentEClass, 
		   source, 
		   new String[] {
			 "name", "Parent",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getParent_Child(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Child"
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
		  (getChild_Id(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Id\n\t\t\t\t\t\t@GeneratedValue\n\t\t\t\t\t"
		   });					
		addAnnotation
		  (getParent_Child(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@OrderBy\n\t\t\t\t\t"
		   });	
	}

} //Bz321770PackageImpl
