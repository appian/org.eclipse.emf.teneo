/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyInfoType.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getKeyValue <em>Key Value</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getRetrievalMethod <em>Retrieval Method</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getX509Data <em>X509 Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getPGPData <em>PGP Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getSPKIData <em>SPKI Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getMgmtData <em>Mgmt Data</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.KeyInfoType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType()
 * @model extendedMetaData="name='KeyInfoType' kind='mixed'"
 * @generated
 */
public interface KeyInfoType extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_KeyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyName' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getKeyName();

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_KeyValue()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValue' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeyValueType> getKeyValue();

	/**
	 * Returns the value of the '<em><b>Retrieval Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.RetrievalMethodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieval Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retrieval Method</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_RetrievalMethod()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetrievalMethod' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<RetrievalMethodType> getRetrievalMethod();

	/**
	 * Returns the value of the '<em><b>X509 Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.X509DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X509 Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_X509Data()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Data' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<X509DataType> getX509Data();

	/**
	 * Returns the value of the '<em><b>PGP Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.PGPDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PGP Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PGP Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_PGPData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PGPData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PGPDataType> getPGPData();

	/**
	 * Returns the value of the '<em><b>SPKI Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3._2000._09.xmldsig.SPKIDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPKI Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPKI Data</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_SPKIData()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPKIData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SPKIDataType> getSPKIData();

	/**
	 * Returns the value of the '<em><b>Mgmt Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mgmt Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgmt Data</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_MgmtData()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MgmtData' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getMgmtData();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getKeyInfoType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.KeyInfoType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // KeyInfoType
