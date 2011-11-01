/**
 * <copyright>
 * </copyright>
 *
 * $Id: PromotionType.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getDiscount <em>Discount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getNone <em>None</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getPromotionType()
 * @model extendedMetaData="name='promotion_._type' kind='elementOnly'"
 * @generated
 */
public interface PromotionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getPromotionType_Discount()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Discount'"
	 * @generated
	 */
	String getDiscount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(String value);

	/**
	 * Returns the value of the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>None</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' attribute.
	 * @see #setNone(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getPromotionType_None()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='None'"
	 * @generated
	 */
	String getNone();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' attribute.
	 * @see #getNone()
	 * @generated
	 */
	void setNone(String value);

} // PromotionType
