/**
 * <copyright>
 * </copyright>
 *
 * $Id: RSAKeyValueType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>RSA Key Value Type</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus <em>Modulus</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType()
 * @model extendedMetaData="name='RSAKeyValueType' kind='elementOnly'"
 * @generated
 */
public interface RSAKeyValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulus</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulus</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Modulus</em>' attribute.
	 * @see #setModulus(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType_Modulus()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary" required="true"
	 *        extendedMetaData="kind='element' name='Modulus' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getModulus();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getModulus
	 * <em>Modulus</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Modulus</em>' attribute.
	 * @see #getModulus()
	 * @generated
	 */
	void setModulus(byte[] value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exponent</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getRSAKeyValueType_Exponent()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary" required="true"
	 *        extendedMetaData="kind='element' name='Exponent' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getExponent();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.RSAKeyValueType#getExponent
	 * <em>Exponent</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(byte[] value);

} // RSAKeyValueType
