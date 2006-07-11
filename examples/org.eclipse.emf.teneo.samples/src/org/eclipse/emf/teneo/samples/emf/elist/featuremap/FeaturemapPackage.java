/**
 * <copyright>
 * </copyright>
 *
 * $Id: FeaturemapPackage.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/elist/featuremap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featuremap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemapPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.PriceByQuantityTypeImpl <em>Price By Quantity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.PriceByQuantityTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getPriceByQuantityType()
	 * @generated
	 */
	int PRICE_BY_QUANTITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_BY_QUANTITY_TYPE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_BY_QUANTITY_TYPE__QUANTITY = 1;

	/**
	 * The number of structural features of the the '<em>Price By Quantity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_BY_QUANTITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl <em>Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Translated Description</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__TRANSLATED_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Product Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_CLASSIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__GROUP1 = 5;

	/**
	 * The feature id for the '<em><b>Price By Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRICE_BY_QUANTITY = 6;

	/**
	 * The feature id for the '<em><b>Price From Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRICE_FROM_SUPPLIER = 7;

	/**
	 * The feature id for the '<em><b>Simple Price</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__SIMPLE_PRICE = 8;

	/**
	 * The number of structural features of the the '<em>Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.SupplierPriceTypeImpl <em>Supplier Price Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.SupplierPriceTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getSupplierPriceType()
	 * @generated
	 */
	int SUPPLIER_PRICE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRICE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRICE_TYPE__PRICE = 1;

	/**
	 * The number of structural features of the the '<em>Supplier Price Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.TranslatedDescriptionTypeImpl <em>Translated Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.TranslatedDescriptionTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getTranslatedDescriptionType()
	 * @generated
	 */
	int TRANSLATED_DESCRIPTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATED_DESCRIPTION_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATED_DESCRIPTION_TYPE__LANGUAGE = 1;

	/**
	 * The number of structural features of the the '<em>Translated Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATED_DESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification <em>Product Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getProductClassification()
	 * @generated
	 */
	int PRODUCT_CLASSIFICATION = 4;

	/**
	 * The meta object id for the '<em>Product Classification Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.FeaturemapPackageImpl#getProductClassificationObject()
	 * @generated
	 */
	int PRODUCT_CLASSIFICATION_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType <em>Price By Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price By Quantity Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType
	 * @generated
	 */
	EClass getPriceByQuantityType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice()
	 * @see #getPriceByQuantityType()
	 * @generated
	 */
	EAttribute getPriceByQuantityType_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity()
	 * @see #getPriceByQuantityType()
	 * @generated
	 */
	EAttribute getPriceByQuantityType_Quantity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getName()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getDescription()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getTranslatedDescription <em>Translated Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Translated Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getTranslatedDescription()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_TranslatedDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification <em>Product Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Classification</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductClassification();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup1()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceByQuantity <em>Price By Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Price By Quantity</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceByQuantity()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_PriceByQuantity();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceFromSupplier <em>Price From Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Price From Supplier</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceFromSupplier()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_PriceFromSupplier();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getSimplePrice <em>Simple Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getSimplePrice()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_SimplePrice();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType <em>Supplier Price Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Price Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType
	 * @generated
	 */
	EClass getSupplierPriceType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getName()
	 * @see #getSupplierPriceType()
	 * @generated
	 */
	EAttribute getSupplierPriceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice()
	 * @see #getSupplierPriceType()
	 * @generated
	 */
	EAttribute getSupplierPriceType_Price();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType <em>Translated Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translated Description Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType
	 * @generated
	 */
	EClass getTranslatedDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType#getDescription()
	 * @see #getTranslatedDescriptionType()
	 * @generated
	 */
	EAttribute getTranslatedDescriptionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType#getLanguage()
	 * @see #getTranslatedDescriptionType()
	 * @generated
	 */
	EAttribute getTranslatedDescriptionType_Language();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification <em>Product Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Product Classification</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @generated
	 */
	EEnum getProductClassification();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification <em>Product Classification Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Product Classification Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification"
	 *        extendedMetaData="name='ProductClassification:Object' baseType='ProductClassification'" 
	 * @generated
	 */
	EDataType getProductClassificationObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemapFactory getFeaturemapFactory();

} //FeaturemapPackage
