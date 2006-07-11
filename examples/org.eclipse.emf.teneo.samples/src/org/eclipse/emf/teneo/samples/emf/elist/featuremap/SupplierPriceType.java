/**
 * <copyright>
 * </copyright>
 *
 * $Id: SupplierPriceType.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Price Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getSupplierPriceType()
 * @model extendedMetaData="name='SupplierPriceType' kind='elementOnly'"
 * @generated
 */
public interface SupplierPriceType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getSupplierPriceType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #setPrice(double)
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getSupplierPriceType_Price()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='Price'"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	void unsetPrice();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType#getPrice <em>Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price</em>' attribute is set.
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	boolean isSetPrice();

} // SupplierPriceType
