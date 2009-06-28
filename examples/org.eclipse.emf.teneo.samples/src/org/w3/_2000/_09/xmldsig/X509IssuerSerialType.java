/**
 * <copyright>
 * </copyright>
 *
 * $Id: X509IssuerSerialType.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>X509 Issuer Serial Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509IssuerName <em>X509 Issuer Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509SerialNumber <em>X509 Serial Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509IssuerSerialType()
 * @model extendedMetaData="name='X509IssuerSerialType' kind='elementOnly'"
 * @generated
 */
public interface X509IssuerSerialType extends EObject {
	/**
	 * Returns the value of the '<em><b>X509 Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Issuer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Issuer Name</em>' attribute.
	 * @see #setX509IssuerName(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509IssuerSerialType_X509IssuerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='X509IssuerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getX509IssuerName();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509IssuerName <em>X509 Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Issuer Name</em>' attribute.
	 * @see #getX509IssuerName()
	 * @generated
	 */
	void setX509IssuerName(String value);

	/**
	 * Returns the value of the '<em><b>X509 Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Serial Number</em>' attribute.
	 * @see #setX509SerialNumber(BigInteger)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509IssuerSerialType_X509SerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='X509SerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getX509SerialNumber();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.X509IssuerSerialType#getX509SerialNumber <em>X509 Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X509 Serial Number</em>' attribute.
	 * @see #getX509SerialNumber()
	 * @generated
	 */
	void setX509SerialNumber(BigInteger value);

} // X509IssuerSerialType
