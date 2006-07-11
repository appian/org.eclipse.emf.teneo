/**
 * <copyright>
 * </copyright>
 *
 * $Id: PriceByQuantityType.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price By Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getPriceByQuantityType()
 * @model extendedMetaData="name='PriceByQuantityType' kind='elementOnly'"
 * @generated
 */
public interface PriceByQuantityType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getPriceByQuantityType_Price()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='Price'"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice <em>Price</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	void unsetPrice();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getPrice <em>Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price</em>' attribute is set.
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	boolean isSetPrice();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #setQuantity(double)
	 * @see org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage#getPriceByQuantityType_Quantity()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='Quantity'"
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #isSetQuantity()
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(double)
	 * @generated
	 */
	void unsetQuantity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType#getQuantity <em>Quantity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity</em>' attribute is set.
	 * @see #unsetQuantity()
	 * @see #getQuantity()
	 * @see #setQuantity(double)
	 * @generated
	 */
	boolean isSetQuantity();

} // PriceByQuantityType
