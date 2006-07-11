/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogType.java,v 1.1 2006/07/11 16:57:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getSubCatalog <em>Sub Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getCatalogType()
 * @model extendedMetaData="name='CatalogType' kind='elementOnly'"
 * @generated
 */
public interface CatalogType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getCatalogType_Name()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getCatalogType_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sub Catalog</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Catalog</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Catalog</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getCatalogType_SubCatalog()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SubCatalog'"
	 * @generated
	 */
	EList getSubCatalog();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getCatalogType_Product()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='Product'"
	 * @generated
	 */
	EList getProduct();

} // CatalogType
