/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductType.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getTranslatedDescription <em>Translated Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceByQuantity <em>Price By Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getPriceFromSupplier <em>Price From Supplier</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getSimplePrice <em>Simple Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType()
 * @model extendedMetaData="name='ProductType' kind='elementOnly'"
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_Name()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_Description()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Description' group='#group:1'"
	 * @generated
	 */
	EList getDescription();

	/**
	 * Returns the value of the '<em><b>Translated Description</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translated Description</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated Description</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_TranslatedDescription()
	 * @model type="org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TranslatedDescription' group='#group:1'"
	 * @generated
	 */
	EList getTranslatedDescription();

	/**
	 * Returns the value of the '<em><b>Product Classification</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Classification</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @see #isSetProductClassification()
	 * @see #unsetProductClassification()
	 * @see #setProductClassification(ProductClassification)
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_ProductClassification()
	 * @model default="Normal" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProductClassification'"
	 * @generated
	 */
	ProductClassification getProductClassification();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification <em>Product Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Classification</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification
	 * @see #isSetProductClassification()
	 * @see #unsetProductClassification()
	 * @see #getProductClassification()
	 * @generated
	 */
	void setProductClassification(ProductClassification value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification <em>Product Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductClassification()
	 * @see #getProductClassification()
	 * @see #setProductClassification(ProductClassification)
	 * @generated
	 */
	void unsetProductClassification();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType#getProductClassification <em>Product Classification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product Classification</em>' attribute is set.
	 * @see #unsetProductClassification()
	 * @see #getProductClassification()
	 * @see #setProductClassification(ProductClassification)
	 * @generated
	 */
	boolean isSetProductClassification();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:5'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Price By Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price By Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price By Quantity</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_PriceByQuantity()
	 * @model type="org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PriceByQuantity' group='#group:5'"
	 * @generated
	 */
	EList getPriceByQuantity();

	/**
	 * Returns the value of the '<em><b>Price From Supplier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price From Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price From Supplier</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_PriceFromSupplier()
	 * @model type="org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PriceFromSupplier' group='#group:5'"
	 * @generated
	 */
	EList getPriceFromSupplier();

	/**
	 * Returns the value of the '<em><b>Simple Price</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Price</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Price</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getProductType_SimplePrice()
	 * @model type="double" unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimplePrice' group='#group:5'"
	 * @generated
	 */
	EList getSimplePrice();

} // ProductType
