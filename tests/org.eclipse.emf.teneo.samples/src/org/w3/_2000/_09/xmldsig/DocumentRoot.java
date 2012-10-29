/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod <em>Canonicalization
 * Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod <em>Digest Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue <em>Digest Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue <em>DSA Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo <em>Key Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName <em>Key Name</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue <em>Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest <em>Manifest</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData <em>Mgmt Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject <em>Object</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData <em>PGP Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference <em>Reference</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod <em>Retrieval Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue <em>RSA Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature <em>Signature</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod <em>Signature Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties <em>Signature Properties
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty <em>Signature Property
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue <em>Signature Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo <em>Signed Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData <em>SPKI Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform <em>Transform</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms <em>Transforms</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data <em>X509 Data</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map. The key is of type
	 * {@link java.lang.String}, and the value is of type {@link java.lang.String}, <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType=
	 *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 *        transient="true" extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map. The key is of type
	 * {@link java.lang.String}, and the value is of type {@link java.lang.String}, <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType=
	 *        "org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 *        transient="true" extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_CanonicalizationMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData
	 *        ="kind='element' name='CanonicalizationMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	CanonicalizationMethodType getCanonicalizationMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getCanonicalizationMethod
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
	 * Returns the value of the '<em><b>Digest Method</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Method</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Digest Method</em>' containment reference.
	 * @see #setDigestMethod(DigestMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	DigestMethodType getDigestMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestMethod
	 * <em>Digest Method</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Digest Method</em>' containment reference.
	 * @see #getDigestMethod()
	 * @generated
	 */
	void setDigestMethod(DigestMethodType value);

	/**
	 * Returns the value of the '<em><b>Digest Value</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest Value</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Digest Value</em>' attribute.
	 * @see #setDigestValue(byte[])
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DigestValue()
	 * @model unique="false" dataType="org.w3._2000._09.xmldsig.DigestValueType" upper="-2"
	 *        transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DigestValue' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getDigestValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDigestValue
	 * <em>Digest Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Digest Value</em>' attribute.
	 * @see #getDigestValue()
	 * @generated
	 */
	void setDigestValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>DSA Key Value</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSA Key Value</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #setDSAKeyValue(DSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_DSAKeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAKeyValueType getDSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getDSAKeyValue
	 * <em>DSA Key Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>DSA Key Value</em>' containment reference.
	 * @see #getDSAKeyValue()
	 * @generated
	 */
	void setDSAKeyValue(DSAKeyValueType value);

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyInfoType getKeyInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyInfo
	 * <em>Key Info</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Key Info</em>' containment reference.
	 * @see #getKeyInfo()
	 * @generated
	 */
	void setKeyInfo(KeyInfoType value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2"
	 *        transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyName
	 * <em>Key Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Key Value</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Key Value</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key Value</em>' containment reference.
	 * @see #setKeyValue(KeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_KeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	KeyValueType getKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getKeyValue
	 * <em>Key Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Key Value</em>' containment reference.
	 * @see #getKeyValue()
	 * @generated
	 */
	void setKeyValue(KeyValueType value);

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Manifest</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Manifest</em>' containment reference.
	 * @see #setManifest(ManifestType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Manifest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Manifest' namespace='##targetNamespace'"
	 * @generated
	 */
	ManifestType getManifest();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getManifest
	 * <em>Manifest</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Manifest</em>' containment reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(ManifestType value);

	/**
	 * Returns the value of the '<em><b>Mgmt Data</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mgmt Data</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mgmt Data</em>' attribute.
	 * @see #setMgmtData(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_MgmtData()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2"
	 *        transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MgmtData' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMgmtData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getMgmtData
	 * <em>Mgmt Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Mgmt Data</em>' attribute.
	 * @see #getMgmtData()
	 * @generated
	 */
	void setMgmtData(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Object()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getObject <em>Object</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>PGP Data</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>PGP Data</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>PGP Data</em>' containment reference.
	 * @see #setPGPData(PGPDataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_PGPData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PGPData' namespace='##targetNamespace'"
	 * @generated
	 */
	PGPDataType getPGPData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getPGPData
	 * <em>PGP Data</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>PGP Data</em>' containment reference.
	 * @see #getPGPData()
	 * @generated
	 */
	void setPGPData(PGPDataType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Reference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getReference
	 * <em>Reference</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Retrieval Method</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retrieval Method</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Retrieval Method</em>' containment reference.
	 * @see #setRetrievalMethod(RetrievalMethodType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RetrievalMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetrievalMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	RetrievalMethodType getRetrievalMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRetrievalMethod
	 * <em>Retrieval Method</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>Retrieval Method</em>' containment reference.
	 * @see #getRetrievalMethod()
	 * @generated
	 */
	void setRetrievalMethod(RetrievalMethodType value);

	/**
	 * Returns the value of the '<em><b>RSA Key Value</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RSA Key Value</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #setRSAKeyValue(RSAKeyValueType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_RSAKeyValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RSAKeyValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RSAKeyValueType getRSAKeyValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getRSAKeyValue
	 * <em>RSA Key Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>RSA Key Value</em>' containment reference.
	 * @see #getRSAKeyValue()
	 * @generated
	 */
	void setRSAKeyValue(RSAKeyValueType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(SignatureType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Signature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Signature' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureType getSignature();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignature
	 * <em>Signature</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(SignatureType value);

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureMethod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureMethodType getSignatureMethod();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureMethod
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
	 * Returns the value of the '<em><b>Signature Properties</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Properties</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature Properties</em>' containment reference.
	 * @see #setSignatureProperties(SignaturePropertiesType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData
	 *        ="kind='element' name='SignatureProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertiesType getSignatureProperties();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperties
	 * <em>Signature Properties</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature Properties</em>' containment reference.
	 * @see #getSignatureProperties()
	 * @generated
	 */
	void setSignatureProperties(SignaturePropertiesType value);

	/**
	 * Returns the value of the '<em><b>Signature Property</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Property</em>' containment reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signature Property</em>' containment reference.
	 * @see #setSignatureProperty(SignaturePropertyType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureProperty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	SignaturePropertyType getSignatureProperty();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureProperty
	 * <em>Signature Property</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature Property</em>' containment reference.
	 * @see #getSignatureProperty()
	 * @generated
	 */
	void setSignatureProperty(SignaturePropertyType value);

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignatureValue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignatureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	SignatureValueType getSignatureValue();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignatureValue
	 * <em>Signature Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signature Value</em>' containment reference.
	 * @see #getSignatureValue()
	 * @generated
	 */
	void setSignatureValue(SignatureValueType value);

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SignedInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	SignedInfoType getSignedInfo();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSignedInfo
	 * <em>Signed Info</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Signed Info</em>' containment reference.
	 * @see #getSignedInfo()
	 * @generated
	 */
	void setSignedInfo(SignedInfoType value);

	/**
	 * Returns the value of the '<em><b>SPKI Data</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>SPKI Data</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>SPKI Data</em>' containment reference.
	 * @see #setSPKIData(SPKIDataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_SPKIData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPKIData' namespace='##targetNamespace'"
	 * @generated
	 */
	SPKIDataType getSPKIData();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getSPKIData
	 * <em>SPKI Data</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>SPKI Data</em>' containment reference.
	 * @see #getSPKIData()
	 * @generated
	 */
	void setSPKIData(SPKIDataType value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(TransformType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transform' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformType getTransform();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransform
	 * <em>Transform</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(TransformType value);

	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transforms</em>' containment reference.
	 * @see #setTransforms(TransformsType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_Transforms()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Transforms' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformsType getTransforms();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getTransforms
	 * <em>Transforms</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Transforms</em>' containment reference.
	 * @see #getTransforms()
	 * @generated
	 */
	void setTransforms(TransformsType value);

	/**
	 * Returns the value of the '<em><b>X509 Data</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>X509 Data</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509 Data</em>' containment reference.
	 * @see #setX509Data(X509DataType)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getDocumentRoot_X509Data()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='X509Data' namespace='##targetNamespace'"
	 * @generated
	 */
	X509DataType getX509Data();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.DocumentRoot#getX509Data
	 * <em>X509 Data</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>X509 Data</em>' containment reference.
	 * @see #getX509Data()
	 * @generated
	 */
	void setX509Data(X509DataType value);

} // DocumentRoot
