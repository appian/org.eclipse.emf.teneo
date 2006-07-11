/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapPackageImpl.java,v 1.1 2006/07/11 16:57:09 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapFactory;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemapPackageImpl extends EPackageImpl implements FeaturemapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceByQuantityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierPriceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translatedDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType productClassificationObjectEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeaturemapPackageImpl() {
		super(eNS_URI, FeaturemapFactory.eINSTANCE);
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
	public static FeaturemapPackage init() {
		if (isInited) return (FeaturemapPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturemapPackage.eNS_URI);

		// Obtain or create and register package
		FeaturemapPackageImpl theFeaturemapPackage = (FeaturemapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FeaturemapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FeaturemapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theFeaturemapPackage.createPackageContents();

		// Initialize created meta-data
		theFeaturemapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeaturemapPackage.freeze();

		return theFeaturemapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriceByQuantityType() {
		return priceByQuantityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceByQuantityType_Price() {
		return (EAttribute)priceByQuantityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriceByQuantityType_Quantity() {
		return (EAttribute)priceByQuantityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Name() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Group() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Description() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_TranslatedDescription() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_ProductClassification() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_Group1() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_PriceByQuantity() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_PriceFromSupplier() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductType_SimplePrice() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplierPriceType() {
		return supplierPriceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierPriceType_Name() {
		return (EAttribute)supplierPriceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplierPriceType_Price() {
		return (EAttribute)supplierPriceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslatedDescriptionType() {
		return translatedDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslatedDescriptionType_Description() {
		return (EAttribute)translatedDescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslatedDescriptionType_Language() {
		return (EAttribute)translatedDescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductClassification() {
		return productClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProductClassificationObject() {
		return productClassificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemapFactory getFeaturemapFactory() {
		return (FeaturemapFactory)getEFactoryInstance();
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
		priceByQuantityTypeEClass = createEClass(PRICE_BY_QUANTITY_TYPE);
		createEAttribute(priceByQuantityTypeEClass, PRICE_BY_QUANTITY_TYPE__PRICE);
		createEAttribute(priceByQuantityTypeEClass, PRICE_BY_QUANTITY_TYPE__QUANTITY);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__NAME);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__GROUP);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__DESCRIPTION);
		createEReference(productTypeEClass, PRODUCT_TYPE__TRANSLATED_DESCRIPTION);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_CLASSIFICATION);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__GROUP1);
		createEReference(productTypeEClass, PRODUCT_TYPE__PRICE_BY_QUANTITY);
		createEReference(productTypeEClass, PRODUCT_TYPE__PRICE_FROM_SUPPLIER);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__SIMPLE_PRICE);

		supplierPriceTypeEClass = createEClass(SUPPLIER_PRICE_TYPE);
		createEAttribute(supplierPriceTypeEClass, SUPPLIER_PRICE_TYPE__NAME);
		createEAttribute(supplierPriceTypeEClass, SUPPLIER_PRICE_TYPE__PRICE);

		translatedDescriptionTypeEClass = createEClass(TRANSLATED_DESCRIPTION_TYPE);
		createEAttribute(translatedDescriptionTypeEClass, TRANSLATED_DESCRIPTION_TYPE__DESCRIPTION);
		createEAttribute(translatedDescriptionTypeEClass, TRANSLATED_DESCRIPTION_TYPE__LANGUAGE);

		// Create enums
		productClassificationEEnum = createEEnum(PRODUCT_CLASSIFICATION);

		// Create data types
		productClassificationObjectEDataType = createEDataType(PRODUCT_CLASSIFICATION_OBJECT);
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
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(priceByQuantityTypeEClass, PriceByQuantityType.class, "PriceByQuantityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriceByQuantityType_Price(), theXMLTypePackage.getDouble(), "price", null, 1, 1, PriceByQuantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriceByQuantityType_Quantity(), theXMLTypePackage.getDouble(), "quantity", null, 1, 1, PriceByQuantityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductType_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Description(), theXMLTypePackage.getString(), "description", null, 0, -1, ProductType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_TranslatedDescription(), this.getTranslatedDescriptionType(), null, "translatedDescription", null, 0, -1, ProductType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_ProductClassification(), this.getProductClassification(), "productClassification", "Normal", 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_PriceByQuantity(), this.getPriceByQuantityType(), null, "priceByQuantity", null, 0, -1, ProductType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_PriceFromSupplier(), this.getSupplierPriceType(), null, "priceFromSupplier", null, 0, -1, ProductType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_SimplePrice(), theXMLTypePackage.getDouble(), "simplePrice", null, 0, -1, ProductType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(supplierPriceTypeEClass, SupplierPriceType.class, "SupplierPriceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplierPriceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SupplierPriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierPriceType_Price(), theXMLTypePackage.getDouble(), "price", null, 1, 1, SupplierPriceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translatedDescriptionTypeEClass, TranslatedDescriptionType.class, "TranslatedDescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslatedDescriptionType_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, TranslatedDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslatedDescriptionType_Language(), theXMLTypePackage.getString(), "language", null, 1, 1, TranslatedDescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(productClassificationEEnum, ProductClassification.class, "ProductClassification");
		addEEnumLiteral(productClassificationEEnum, ProductClassification.NORMAL_LITERAL);
		addEEnumLiteral(productClassificationEEnum, ProductClassification.SPECIAL_LITERAL);

		// Initialize data types
		initEDataType(productClassificationObjectEDataType, ProductClassification.class, "ProductClassificationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (priceByQuantityTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PriceByQuantityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPriceByQuantityType_Price(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Price"
		   });		
		addAnnotation
		  (getPriceByQuantityType_Quantity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Quantity"
		   });		
		addAnnotation
		  (productClassificationEEnum, 
		   source, 
		   new String[] {
			 "name", "ProductClassification"
		   });		
		addAnnotation
		  (productClassificationObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ProductClassification:Object",
			 "baseType", "ProductClassification"
		   });		
		addAnnotation
		  (productTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProductType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProductType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getProductType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getProductType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getProductType_TranslatedDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TranslatedDescription",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getProductType_ProductClassification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProductClassification"
		   });		
		addAnnotation
		  (getProductType_Group1(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:5"
		   });		
		addAnnotation
		  (getProductType_PriceByQuantity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PriceByQuantity",
			 "group", "#group:5"
		   });		
		addAnnotation
		  (getProductType_PriceFromSupplier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PriceFromSupplier",
			 "group", "#group:5"
		   });		
		addAnnotation
		  (getProductType_SimplePrice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SimplePrice",
			 "group", "#group:5"
		   });		
		addAnnotation
		  (supplierPriceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SupplierPriceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupplierPriceType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getSupplierPriceType_Price(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Price"
		   });		
		addAnnotation
		  (translatedDescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TranslatedDescriptionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTranslatedDescriptionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description"
		   });		
		addAnnotation
		  (getTranslatedDescriptionType_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Language"
		   });
	}

} //FeaturemapPackageImpl
