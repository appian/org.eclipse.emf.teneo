/**
 * <copyright>
 * </copyright>
 *
 * $Id: ModelgroupPackageImpl.java,v 1.1 2010/03/25 00:29:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.OrderList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.PurchaseOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelgroupPackageImpl extends EPackageImpl implements ModelgroupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaseOrderEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.modelgroup.ModelgroupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelgroupPackageImpl() {
		super(eNS_URI, ModelgroupFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelgroupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelgroupPackage init() {
		if (isInited) return (ModelgroupPackage)EPackage.Registry.INSTANCE.getEPackage(ModelgroupPackage.eNS_URI);

		// Obtain or create and register package
		ModelgroupPackageImpl theModelgroupPackage = (ModelgroupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelgroupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelgroupPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelgroupPackage.createPackageContents();

		// Initialize created meta-data
		theModelgroupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelgroupPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelgroupPackage.eNS_URI, theModelgroupPackage);
		return theModelgroupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderList() {
		return orderListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderList_Name() {
		return (EAttribute)orderListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderList_Orders() {
		return (EAttribute)orderListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderList_PreferredOrders() {
		return (EReference)orderListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderList_StandardOrders() {
		return (EReference)orderListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderList_HardCopyOrderReference() {
		return (EAttribute)orderListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderList_HardCopyOrderNumber() {
		return (EAttribute)orderListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaseOrder() {
		return purchaseOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseOrder_Reference() {
		return (EAttribute)purchaseOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgroupFactory getModelgroupFactory() {
		return (ModelgroupFactory)getEFactoryInstance();
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
		orderListEClass = createEClass(ORDER_LIST);
		createEAttribute(orderListEClass, ORDER_LIST__NAME);
		createEAttribute(orderListEClass, ORDER_LIST__ORDERS);
		createEReference(orderListEClass, ORDER_LIST__PREFERRED_ORDERS);
		createEReference(orderListEClass, ORDER_LIST__STANDARD_ORDERS);
		createEAttribute(orderListEClass, ORDER_LIST__HARD_COPY_ORDER_REFERENCE);
		createEAttribute(orderListEClass, ORDER_LIST__HARD_COPY_ORDER_NUMBER);

		purchaseOrderEClass = createEClass(PURCHASE_ORDER);
		createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__REFERENCE);
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
		initEClass(orderListEClass, OrderList.class, "OrderList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderList_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OrderList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderList_Orders(), ecorePackage.getEFeatureMapEntry(), "orders", null, 0, -1, OrderList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderList_PreferredOrders(), this.getPurchaseOrder(), null, "preferredOrders", null, 0, -1, OrderList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderList_StandardOrders(), this.getPurchaseOrder(), null, "standardOrders", null, 0, -1, OrderList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderList_HardCopyOrderReference(), theXMLTypePackage.getString(), "hardCopyOrderReference", null, 0, -1, OrderList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderList_HardCopyOrderNumber(), theXMLTypePackage.getLong(), "hardCopyOrderNumber", null, 0, -1, OrderList.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(purchaseOrderEClass, PurchaseOrder.class, "PurchaseOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurchaseOrder_Reference(), theXMLTypePackage.getString(), "reference", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (orderListEClass, 
		   source, 
		   new String[] {
			 "name", "OrderList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrderList_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getOrderList_Orders(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "orders:1"
		   });		
		addAnnotation
		  (getOrderList_PreferredOrders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preferredOrders",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getOrderList_StandardOrders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "standardOrders",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getOrderList_HardCopyOrderReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hardCopyOrderReference",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getOrderList_HardCopyOrderNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hardCopyOrderNumber",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (purchaseOrderEClass, 
		   source, 
		   new String[] {
			 "name", "PurchaseOrder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPurchaseOrder_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference"
		   });
	}

} //ModelgroupPackageImpl
