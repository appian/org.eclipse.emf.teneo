/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignedInfoType.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Signed Info Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod <em>Canonicalization
 * Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod <em>Signature Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getReference <em>Reference</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignedInfoType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType()
 * @model extendedMetaData="name='SignedInfoType' kind='elementOnly'"
 * @generated
 */
public interface SignedInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Canonicalization Method</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canonicalization Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #setCanonicalizationMethod(CanonicalizationMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_CanonicalizationMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CanonicalizationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CanonicalizationMethodType getCanonicalizationMethod();

	/**
	 * Sets the value of the '
	 * {@link org.w3._2000._09.xmldsig.SignedInfoType#getCanonicalizationMethod
	 * <em>Canonicalization Method</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Canonicalization Method</em>' containment reference.
	 * @see #getCanonicalizationMethod()
	 * @generated
	 */
	void setCanonicalizationMethod(CanonicalizationMethodType value);

	/**
	 * Returns the value of the '<em><b>Signature Method</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Method</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature Method</em>' containment reference.
	 * @see #setSignatureMethod(SignatureMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_SignatureMethod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SignatureMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureMethodType getSignatureMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignedInfoType#getSignatureMethod
	 * <em>Signature Method</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature Method</em>' containment reference.
	 * @see #getSignatureMethod()
	 * @generated
	 */
	void setSignatureMethod(SignatureMethodType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list. The list
	 * contents are of type {@link org.w3._2000._09.xmldsig.ReferenceType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceType> getReference();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignedInfoType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignedInfoType#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // SignedInfoType
