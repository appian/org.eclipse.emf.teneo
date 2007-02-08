/**
 * <copyright>
 * </copyright>
 *
 * $Id: NmsetPackageImpl.java,v 1.4 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.nmset.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.MyItem;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.nmset.YourItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NmsetPackageImpl extends EPackageImpl implements NmsetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yourItemEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.nmset.NmsetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NmsetPackageImpl() {
		super(eNS_URI, NmsetFactory.eINSTANCE);
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
	public static NmsetPackage init() {
		if (isInited) return (NmsetPackage)EPackage.Registry.INSTANCE.getEPackage(NmsetPackage.eNS_URI);

		// Obtain or create and register package
		NmsetPackageImpl theNmsetPackage = (NmsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof NmsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new NmsetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNmsetPackage.createPackageContents();

		// Initialize created meta-data
		theNmsetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNmsetPackage.freeze();

		return theNmsetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyItem() {
		return myItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMyItem_Name() {
		return (EAttribute)myItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMyItem_YourItem() {
		return (EReference)myItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYourItem() {
		return yourItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYourItem_Name() {
		return (EAttribute)yourItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYourItem_MyItem() {
		return (EReference)yourItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NmsetFactory getNmsetFactory() {
		return (NmsetFactory)getEFactoryInstance();
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
		myItemEClass = createEClass(MY_ITEM);
		createEAttribute(myItemEClass, MY_ITEM__NAME);
		createEReference(myItemEClass, MY_ITEM__YOUR_ITEM);

		yourItemEClass = createEClass(YOUR_ITEM);
		createEAttribute(yourItemEClass, YOUR_ITEM__NAME);
		createEReference(yourItemEClass, YOUR_ITEM__MY_ITEM);
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
		initEClass(myItemEClass, MyItem.class, "MyItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMyItem_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMyItem_YourItem(), this.getYourItem(), this.getYourItem_MyItem(), "yourItem", null, 1, -1, MyItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yourItemEClass, YourItem.class, "YourItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYourItem_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, YourItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYourItem_MyItem(), this.getMyItem(), this.getMyItem_YourItem(), "myItem", null, 1, -1, YourItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (myItemEClass, 
		   source, 
		   new String[] {
			 "name", "MyItem",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMyItem_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getMyItem_YourItem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "yourItem"
		   });		
		addAnnotation
		  (yourItemEClass, 
		   source, 
		   new String[] {
			 "name", "YourItem",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getYourItem_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getYourItem_MyItem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myItem"
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
		  (getMyItem_YourItem(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(Indexed=false)"
		   });					
		addAnnotation
		  (getYourItem_MyItem(), 
		   source, 
		   new String[] {
			 "appinfo", "@ManyToMany(Indexed=false)"
		   });	
	}

} //NmsetPackageImpl
