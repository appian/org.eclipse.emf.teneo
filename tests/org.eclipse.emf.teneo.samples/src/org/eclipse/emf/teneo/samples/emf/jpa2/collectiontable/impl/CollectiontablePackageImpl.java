/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontableFactory;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.EmbeddedItem;
import org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.Item;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectiontablePackageImpl extends EPackageImpl implements CollectiontablePackage {
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
	private EClass embeddedItemEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.collectiontable.CollectiontablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectiontablePackageImpl() {
		super(eNS_URI, CollectiontableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CollectiontablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectiontablePackage init() {
		if (isInited) return (CollectiontablePackage)EPackage.Registry.INSTANCE.getEPackage(CollectiontablePackage.eNS_URI);

		// Obtain or create and register package
		CollectiontablePackageImpl theCollectiontablePackage = (CollectiontablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectiontablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectiontablePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCollectiontablePackage.createPackageContents();

		// Initialize created meta-data
		theCollectiontablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectiontablePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectiontablePackage.eNS_URI, theCollectiontablePackage);
		return theCollectiontablePackage;
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
	public EAttribute getItem_Names() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Items() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedItem() {
		return embeddedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedItem_Name() {
		return (EAttribute)embeddedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectiontableFactory getCollectiontableFactory() {
		return (CollectiontableFactory)getEFactoryInstance();
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
		createEAttribute(itemEClass, ITEM__NAMES);
		createEReference(itemEClass, ITEM__ITEMS);

		embeddedItemEClass = createEClass(EMBEDDED_ITEM);
		createEAttribute(embeddedItemEClass, EMBEDDED_ITEM__NAME);
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
		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Names(), theXMLTypePackage.getString(), "names", null, 1, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Items(), this.getEmbeddedItem(), null, "items", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddedItemEClass, EmbeddedItem.class, "EmbeddedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedItem_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EmbeddedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// teneo.jpa.auditing
		createTeneo_1Annotations();
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
		  (getItem_Names(), 
		   source, 
		   new String[] {
			 "value", "@CollectionTable(name=\"NamesTable\" joinColumns={@JoinColumn(name=\"joinColumn1\")})\n"
		   });			
		addAnnotation
		  (getItem_Items(), 
		   source, 
		   new String[] {
			 "value", "@Embedded\n@CollectionTable(name=\"EmbeddedItemsTable\" joinColumns={@JoinColumn(name=\"MYJC\")})\n"
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
		  (getItem_Names(), 
		   source, 
		   new String[] {
			 "value", "@CollectionTable(name=\"AuditNamesTable\" joinColumns={@JoinColumn(name=\"joinColumn1\")})\n"
		   });			
		addAnnotation
		  (getItem_Items(), 
		   source, 
		   new String[] {
			 "value", "@Embedded\n@CollectionTable(name=\"EmbItemsAuditTable\" joinColumns={@JoinColumn(name=\"MYJC\")})\n"
		   });
	}

} //CollectiontablePackageImpl
