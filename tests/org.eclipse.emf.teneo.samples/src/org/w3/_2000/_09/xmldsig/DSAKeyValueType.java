/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSAKeyValueType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>DSA Key Value Type</b></em>
 * '. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getP <em>P</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getQ <em>Q</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getG <em>G</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getY <em>Y</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getJ <em>J</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getSeed <em>Seed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getPgenCounter <em>Pgen Counter</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType()
 * @model extendedMetaData="name='DSAKeyValueType' kind='elementOnly'"
 * @generated
 */
public interface DSAKeyValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_P()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='P' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getP();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getP <em>P</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(byte[] value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see #setQ(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_Q()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='Q' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getQ();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getQ <em>Q</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Q</em>' attribute.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(byte[] value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>G</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>G</em>' attribute.
	 * @see #setG(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_G()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='G' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getG();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getG <em>G</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>G</em>' attribute.
	 * @see #getG()
	 * @generated
	 */
	void setG(byte[] value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_Y()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary" required="true"
	 *        extendedMetaData="kind='element' name='Y' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getY();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getY <em>Y</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(byte[] value);

	/**
	 * Returns the value of the '<em><b>J</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>J</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>J</em>' attribute.
	 * @see #setJ(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_J()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='J' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getJ();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getJ <em>J</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>J</em>' attribute.
	 * @see #getJ()
	 * @generated
	 */
	void setJ(byte[] value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_Seed()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='Seed' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getSeed();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getSeed <em>Seed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(byte[] value);

	/**
	 * Returns the value of the '<em><b>Pgen Counter</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgen Counter</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pgen Counter</em>' attribute.
	 * @see #setPgenCounter(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDSAKeyValueType_PgenCounter()
	 * @model dataType="org.w3._2000._09.xmldsig.CryptoBinary"
	 *        extendedMetaData="kind='element' name='PgenCounter' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getPgenCounter();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DSAKeyValueType#getPgenCounter
	 * <em>Pgen Counter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Pgen Counter</em>' attribute.
	 * @see #getPgenCounter()
	 * @generated
	 */
	void setPgenCounter(byte[] value);

} // DSAKeyValueType
