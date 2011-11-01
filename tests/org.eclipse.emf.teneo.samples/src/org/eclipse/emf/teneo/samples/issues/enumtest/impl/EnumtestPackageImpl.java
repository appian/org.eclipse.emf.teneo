/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumtestPackageImpl.java,v 1.2 2006/11/07 10:22:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestFactory;
import org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage;
import org.eclipse.emf.teneo.samples.issues.enumtest.Item;
import org.eclipse.emf.teneo.samples.issues.enumtest.ItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumtestPackageImpl extends EPackageImpl implements EnumtestPackage {
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
	private EEnum itemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itemTypeObjectEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumtestPackageImpl() {
		super(eNS_URI, EnumtestFactory.eINSTANCE);
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
	public static EnumtestPackage init() {
		if (isInited) return (EnumtestPackage)EPackage.Registry.INSTANCE.getEPackage(EnumtestPackage.eNS_URI);

		// Obtain or create and register package
		EnumtestPackageImpl theEnumtestPackage = (EnumtestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EnumtestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EnumtestPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEnumtestPackage.createPackageContents();

		// Initialize created meta-data
		theEnumtestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumtestPackage.freeze();

		return theEnumtestPackage;
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
	public EAttribute getItem_ItemType() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_NullableItemType() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemType() {
		return itemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getItemTypeObject() {
		return itemTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumtestFactory getEnumtestFactory() {
		return (EnumtestFactory)getEFactoryInstance();
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
		createEAttribute(itemEClass, ITEM__ITEM_TYPE);
		createEAttribute(itemEClass, ITEM__NULLABLE_ITEM_TYPE);

		// Create enums
		itemTypeEEnum = createEEnum(ITEM_TYPE);

		// Create data types
		itemTypeObjectEDataType = createEDataType(ITEM_TYPE_OBJECT);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_ItemType(), this.getItemType(), "itemType", "Product", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_NullableItemType(), this.getItemType(), "nullableItemType", "Product", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(itemTypeEEnum, ItemType.class, "ItemType");
		addEEnumLiteral(itemTypeEEnum, ItemType.PRODUCT_LITERAL);
		addEEnumLiteral(itemTypeEEnum, ItemType.PRODUCT_FAMILY_LITERAL);

		// Initialize data types
		initEDataType(itemTypeObjectEDataType, ItemType.class, "ItemTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (itemEClass, 
		   source, 
		   new String[] {
			 "name", "Item",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItem_ItemType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemType"
		   });		
		addAnnotation
		  (getItem_NullableItemType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nullableItemType"
		   });		
		addAnnotation
		  (itemTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ItemType"
		   });		
		addAnnotation
		  (itemTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ItemType:Object",
			 "baseType", "ItemType"
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
		  (getItem_ItemType(), 
		   source, 
		   new String[] {
			 "appinfo", "@Id"
		   });				
	}

} //EnumtestPackageImpl
