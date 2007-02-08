/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductType.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getProductType()
 * @model extendedMetaData="name='ProductType' kind='elementOnly'"
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getProductType_Code()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getProductType_Description()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Remark</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remark</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remark</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getProductType_Remark()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Remark'"
	 * @generated
	 */
	EList<StringType> getRemark();

	/**
	 * Returns the value of the '<em><b>Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' containment reference.
	 * @see #setPrice(PriceType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getProductType_Price()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Price'"
	 * @generated
	 */
	PriceType getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType#getPrice <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' containment reference.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(PriceType value);

} // ProductType
