/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyValueType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyValueType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyValueType#getDSAKeyValue <em>DSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyValueType#getRSAKeyValue <em>RSA Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyValueType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyValueType()
 * @model extendedMetaData="name='KeyValueType' kind='mixed'"
 * @generated
 */
public interface KeyValueType extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyValueType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>DSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSA Key Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #setDSAKeyValue(DSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyValueType_DSAKeyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAKeyValueType getDSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.KeyValueType#getDSAKeyValue <em>DSA Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #getDSAKeyValue()
	 * @generated
	 */
	void setDSAKeyValue(DSAKeyValueType value);

	/**
	 * Returns the value of the '<em><b>RSA Key Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSA Key Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #setRSAKeyValue(RSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyValueType_RSAKeyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RSAKeyValueType getRSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.KeyValueType#getRSAKeyValue <em>RSA Key Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #getRSAKeyValue()
	 * @generated
	 */
	void setRSAKeyValue(RSAKeyValueType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyValueType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // KeyValueType
