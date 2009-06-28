/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestMethod <em>Digest Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestValue <em>Digest Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.ReferenceType#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType()
 * @model extendedMetaData="name='ReferenceType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_Transforms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType getTransforms();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getTransforms <em>Transforms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType value);

	/**
	 * Returns the value of the '<em><b>Digest Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Method</em>' containment reference.
	 * @see #setDigestMethod(DigestMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_DigestMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DigestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	DigestMethodType getDigestMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestMethod <em>Digest Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Method</em>' containment reference.
	 * @see #getDigestMethod()
	 * @generated
	 */
	void setDigestMethod(DigestMethodType value);

	/**
	 * Returns the value of the '<em><b>Digest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest Value</em>' attribute.
	 * @see #setDigestValue(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_DigestValue()
	 * @model dataType="org.w3._2000._09.xmldsig.DigestValueType" required="true"
	 *        extendedMetaData="kind='element' name='DigestValue' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getDigestValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getDigestValue <em>Digest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest Value</em>' attribute.
	 * @see #getDigestValue()
	 * @generated
	 */
	void setDigestValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URI</em>' attribute.
	 * @see #setURI(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getReferenceType_URI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='URI'"
	 * @generated
	 */
	String getURI();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.ReferenceType#getURI <em>URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URI</em>' attribute.
	 * @see #getURI()
	 * @generated
	 */
	void setURI(String value);

} // ReferenceType
