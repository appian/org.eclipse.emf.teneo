/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElement;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemNonContainer2;
import org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraFactory;
import org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefreshextraPackageImpl extends EPackageImpl implements RefreshextraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemNonContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemNonContainer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemContainer2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemElementBidirEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefreshextraPackageImpl() {
		super(eNS_URI, RefreshextraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RefreshextraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefreshextraPackage init() {
		if (isInited) return (RefreshextraPackage)EPackage.Registry.INSTANCE.getEPackage(RefreshextraPackage.eNS_URI);

		// Obtain or create and register package
		RefreshextraPackageImpl theRefreshextraPackage = (RefreshextraPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefreshextraPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefreshextraPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRefreshextraPackage.createPackageContents();

		// Initialize created meta-data
		theRefreshextraPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefreshextraPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefreshextraPackage.eNS_URI, theRefreshextraPackage);
		return theRefreshextraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemContainer() {
		return itemContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemContainer_Name() {
		return (EAttribute)itemContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemContainer_Elements() {
		return (EReference)itemContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemElement() {
		return itemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemElement_Name() {
		return (EAttribute)itemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemNonContainer() {
		return itemNonContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemNonContainer_Name() {
		return (EAttribute)itemNonContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemNonContainer_Elements() {
		return (EReference)itemNonContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemNonContainer2() {
		return itemNonContainer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemNonContainer2_Name() {
		return (EAttribute)itemNonContainer2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemNonContainer2_Elements() {
		return (EReference)itemNonContainer2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemContainer2() {
		return itemContainer2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemContainer2_Name() {
		return (EAttribute)itemContainer2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemContainer2_Elements() {
		return (EReference)itemContainer2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemElementBidir() {
		return itemElementBidirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemElementBidir_Name() {
		return (EAttribute)itemElementBidirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemElementBidir_Item() {
		return (EReference)itemElementBidirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshextraFactory getRefreshextraFactory() {
		return (RefreshextraFactory)getEFactoryInstance();
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
		itemContainerEClass = createEClass(ITEM_CONTAINER);
		createEAttribute(itemContainerEClass, ITEM_CONTAINER__NAME);
		createEReference(itemContainerEClass, ITEM_CONTAINER__ELEMENTS);

		itemElementEClass = createEClass(ITEM_ELEMENT);
		createEAttribute(itemElementEClass, ITEM_ELEMENT__NAME);

		itemNonContainerEClass = createEClass(ITEM_NON_CONTAINER);
		createEAttribute(itemNonContainerEClass, ITEM_NON_CONTAINER__NAME);
		createEReference(itemNonContainerEClass, ITEM_NON_CONTAINER__ELEMENTS);

		itemNonContainer2EClass = createEClass(ITEM_NON_CONTAINER2);
		createEAttribute(itemNonContainer2EClass, ITEM_NON_CONTAINER2__NAME);
		createEReference(itemNonContainer2EClass, ITEM_NON_CONTAINER2__ELEMENTS);

		itemContainer2EClass = createEClass(ITEM_CONTAINER2);
		createEAttribute(itemContainer2EClass, ITEM_CONTAINER2__NAME);
		createEReference(itemContainer2EClass, ITEM_CONTAINER2__ELEMENTS);

		itemElementBidirEClass = createEClass(ITEM_ELEMENT_BIDIR);
		createEAttribute(itemElementBidirEClass, ITEM_ELEMENT_BIDIR__NAME);
		createEReference(itemElementBidirEClass, ITEM_ELEMENT_BIDIR__ITEM);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(itemContainerEClass, ItemContainer.class, "ItemContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemContainer_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemContainer_Elements(), this.getItemElement(), null, "elements", null, 1, -1, ItemContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemElementEClass, ItemElement.class, "ItemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemNonContainerEClass, ItemNonContainer.class, "ItemNonContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemNonContainer_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemNonContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemNonContainer_Elements(), this.getItemElement(), null, "elements", null, 1, -1, ItemNonContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemNonContainer2EClass, ItemNonContainer2.class, "ItemNonContainer2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemNonContainer2_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemNonContainer2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemNonContainer2_Elements(), this.getItemElement(), null, "elements", null, 1, -1, ItemNonContainer2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemContainer2EClass, ItemContainer2.class, "ItemContainer2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemContainer2_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemContainer2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemContainer2_Elements(), this.getItemElementBidir(), this.getItemElementBidir_Item(), "elements", null, 1, -1, ItemContainer2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemElementBidirEClass, ItemElementBidir.class, "ItemElementBidir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemElementBidir_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ItemElementBidir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemElementBidir_Item(), this.getItemContainer2(), this.getItemContainer2_Elements(), "item", null, 0, 1, ItemElementBidir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (itemContainerEClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemContainer_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (getItemContainer_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lineOne"
		   });	
		addAnnotation
		  (itemElementEClass, 
		   source, 
		   new String[] {
			 "name", "LineOne",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemElement_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (itemNonContainerEClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemNonContainer_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (getItemNonContainer_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lineOne"
		   });	
		addAnnotation
		  (itemNonContainer2EClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemNonContainer2_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (getItemNonContainer2_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lineOne"
		   });	
		addAnnotation
		  (itemContainer2EClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemContainer2_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });	
		addAnnotation
		  (getItemContainer2_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lineOne"
		   });	
		addAnnotation
		  (itemElementBidirEClass, 
		   source, 
		   new String[] {
			 "name", "LineOne",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getItemElementBidir_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });
	}

} //RefreshextraPackageImpl
