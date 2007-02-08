/**
 * <copyright>
 * </copyright>
 *
 * $Id: LetterBodyType.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter Body Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getShipDate <em>Ship Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType()
 * @model extendedMetaData="name='letterBody_._type' kind='mixed'"
 * @generated
 */
public interface LetterBodyType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Salutation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salutation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salutation</em>' containment reference.
	 * @see #setSalutation(SalutationType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType_Salutation()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='salutation'"
	 * @generated
	 */
	SalutationType getSalutation();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getSalutation <em>Salutation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salutation</em>' containment reference.
	 * @see #getSalutation()
	 * @generated
	 */
	void setSalutation(SalutationType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType_Quantity()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='quantity'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType_ProductName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='productName'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Date</em>' attribute.
	 * @see #setShipDate(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage#getLetterBodyType_ShipDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='shipDate'"
	 * @generated
	 */
	Object getShipDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.LetterBodyType#getShipDate <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Date</em>' attribute.
	 * @see #getShipDate()
	 * @generated
	 */
	void setShipDate(Object value);

} // LetterBodyType
