/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignatureType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Signature Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.SignatureType#getSignedInfo <em>Signed Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignatureType#getSignatureValue <em>Signature Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignatureType#getKeyInfo <em>Key Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignatureType#getObject <em>Object</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignatureType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType()
 * @model extendedMetaData="name='SignatureType' kind='elementOnly'"
 * @generated
 */
public interface SignatureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signed Info</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed Info</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signed Info</em>' containment reference.
	 * @see #setSignedInfo(SignedInfoType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType_SignedInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignedInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedInfoType getSignedInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType#getSignedInfo
	 * <em>Signed Info</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signed Info</em>' containment reference.
	 * @see #getSignedInfo()
	 * @generated
	 */
	void setSignedInfo(SignedInfoType value);

	/**
	 * Returns the value of the '<em><b>Signature Value</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Value</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature Value</em>' containment reference.
	 * @see #setSignatureValue(SignatureValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType_SignatureValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignatureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureValueType getSignatureValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType#getSignatureValue
	 * <em>Signature Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature Value</em>' containment reference.
	 * @see #getSignatureValue()
	 * @generated
	 */
	void setSignatureValue(SignatureValueType value);

	/**
	 * Returns the value of the '<em><b>Key Info</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Key Info</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key Info</em>' containment reference.
	 * @see #setKeyInfo(KeyInfoType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType_KeyInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType getKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType#getKeyInfo
	 * <em>Key Info</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list. The list contents
	 * are of type {@link org.w3._2000._09.xmldsig.ObjectType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType_Object()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignatureType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignatureType#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignatureType
