/**
 * <copyright>
 * </copyright>
 *
 * $Id: UniqueconstraintsPackageImpl.java,v 1.2.4.1 2007/02/11 20:43:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.Project;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniqueconstraintsPackageImpl extends EPackageImpl implements UniqueconstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.uniqueconstraints.UniqueconstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniqueconstraintsPackageImpl() {
		super(eNS_URI, UniqueconstraintsFactory.eINSTANCE);
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
	public static UniqueconstraintsPackage init() {
		if (isInited) return (UniqueconstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(UniqueconstraintsPackage.eNS_URI);

		// Obtain or create and register package
		UniqueconstraintsPackageImpl theUniqueconstraintsPackage = (UniqueconstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UniqueconstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UniqueconstraintsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUniqueconstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theUniqueconstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniqueconstraintsPackage.freeze();

		return theUniqueconstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Project() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Age() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueconstraintsFactory getUniqueconstraintsFactory() {
		return (UniqueconstraintsFactory)getEFactoryInstance();
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
		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);
		createEReference(itemEClass, ITEM__PROJECT);
		createEAttribute(itemEClass, ITEM__AGE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__NAME);
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
		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Project(), this.getProject(), null, "project", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Age(), theXMLTypePackage.getInt(), "age", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (itemEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t@Table(name=\"MYITEMTABLE\" uniqueConstraints={@UniqueConstraint(columnNames={\"MYSTR\",\"MYINT\",\"MYPROJECT\"})})"
		   });			
		addAnnotation
		  (getItem_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"MYSTR\")"
		   });			
		addAnnotation
		  (getItem_Project(), 
		   source, 
		   new String[] {
			 "appinfo", "@JoinColumn(name=\"MYPROJECT\")"
		   });			
		addAnnotation
		  (getItem_Age(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"MYINT\")"
		   });			
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
		  (itemEClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItem_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getItem_Project(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "project"
		   });			
		addAnnotation
		  (getItem_Age(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "age"
		   });		
		addAnnotation
		  (projectEClass, 
		   source, 
		   new String[] {
			 "name", "Project",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProject_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

} //UniqueconstraintsPackageImpl
