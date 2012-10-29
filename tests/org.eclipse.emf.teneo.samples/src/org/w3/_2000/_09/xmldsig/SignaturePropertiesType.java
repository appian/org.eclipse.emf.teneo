/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignaturePropertiesType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Signature Properties Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertiesType#getSignatureProperty <em>Signature
 * Property</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertiesType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertiesType()
 * @model extendedMetaData="name='SignaturePropertiesType' kind='elementOnly'"
 * @generated
 */
public interface SignaturePropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature Property</b></em>' containment reference list. The
	 * list contents are of type {@link org.w3._2000._09.xmldsig.SignaturePropertyType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature Property</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertiesType_SignatureProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignatureProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SignaturePropertyType> getSignatureProperty();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertiesType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignaturePropertiesType#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignaturePropertiesType
