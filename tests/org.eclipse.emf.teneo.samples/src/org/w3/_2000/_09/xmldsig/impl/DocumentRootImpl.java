/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.CanonicalizationMethodType;
import org.w3._2000._09.xmldsig.DSAKeyValueType;
import org.w3._2000._09.xmldsig.DigestMethodType;
import org.w3._2000._09.xmldsig.DocumentRoot;
import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.KeyValueType;
import org.w3._2000._09.xmldsig.ManifestType;
import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.PGPDataType;
import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.ReferenceType;
import org.w3._2000._09.xmldsig.RetrievalMethodType;
import org.w3._2000._09.xmldsig.SPKIDataType;
import org.w3._2000._09.xmldsig.SignatureMethodType;
import org.w3._2000._09.xmldsig.SignaturePropertiesType;
import org.w3._2000._09.xmldsig.SignaturePropertyType;
import org.w3._2000._09.xmldsig.SignatureType;
import org.w3._2000._09.xmldsig.SignatureValueType;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.TransformType;
import org.w3._2000._09.xmldsig.TransformsType;
import org.w3._2000._09.xmldsig.X509DataType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema
 * Location</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getCanonicalizationMethod <em>
 * Canonicalization Method</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestMethod <em>Digest Method</em>}
 * </li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDigestValue <em>Digest Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getDSAKeyValue <em>DSA Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyInfo <em>Key Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyName <em>Key Name</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getKeyValue <em>Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getManifest <em>Manifest</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getMgmtData <em>Mgmt Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getObject <em>Object</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getPGPData <em>PGP Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getReference <em>Reference</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRetrievalMethod <em>Retrieval Method
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getRSAKeyValue <em>RSA Key Value</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignature <em>Signature</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureMethod <em>Signature Method
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperties <em>Signature
 * Properties</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureProperty <em>Signature
 * Property</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignatureValue <em>Signature Value
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSignedInfo <em>Signed Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getSPKIData <em>SPKI Data</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransform <em>Transform</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getTransforms <em>Transforms</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.DocumentRootImpl#getX509Data <em>X509 Data</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getDigestValue() <em>Digest Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDigestValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DIGEST_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMgmtData() <em>Mgmt Data</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMgmtData()
	 * @generated
	 * @ordered
	 */
	protected static final String MGMT_DATA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmldsigPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class,
					this, XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class,
					this, XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CanonicalizationMethodType getCanonicalizationMethod() {
		return (CanonicalizationMethodType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCanonicalizationMethod(
			CanonicalizationMethodType newCanonicalizationMethod, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, newCanonicalizationMethod,
				msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCanonicalizationMethod(CanonicalizationMethodType newCanonicalizationMethod) {
		((FeatureMap.Internal) getMixed()).set(
				XmldsigPackage.Literals.DOCUMENT_ROOT__CANONICALIZATION_METHOD, newCanonicalizationMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DigestMethodType getDigestMethod() {
		return (DigestMethodType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDigestMethod(DigestMethodType newDigestMethod,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD, newDigestMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDigestMethod(DigestMethodType newDigestMethod) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_METHOD,
				newDigestMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public byte[] getDigestValue() {
		return (byte[]) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDigestValue(byte[] newDigestValue) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DIGEST_VALUE,
				newDigestValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DSAKeyValueType getDSAKeyValue() {
		return (DSAKeyValueType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDSAKeyValue(DSAKeyValueType newDSAKeyValue,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE, newDSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDSAKeyValue(DSAKeyValueType newDSAKeyValue) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__DSA_KEY_VALUE,
				newDSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public KeyInfoType getKeyInfo() {
		return (KeyInfoType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType newKeyInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO, newKeyInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKeyInfo(KeyInfoType newKeyInfo) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_INFO,
				newKeyInfo);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getKeyName() {
		return (String) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_NAME,
				newKeyName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public KeyValueType getKeyValue() {
		return (KeyValueType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetKeyValue(KeyValueType newKeyValue, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE, newKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKeyValue(KeyValueType newKeyValue) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__KEY_VALUE,
				newKeyValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ManifestType getManifest() {
		return (ManifestType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetManifest(ManifestType newManifest, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST, newManifest, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setManifest(ManifestType newManifest) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MANIFEST,
				newManifest);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMgmtData() {
		return (String) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMgmtData(String newMgmtData) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__MGMT_DATA,
				newMgmtData);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectType getObject() {
		return (ObjectType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectType newObject, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, newObject, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setObject(ObjectType newObject) {
		((FeatureMap.Internal) getMixed())
				.set(XmldsigPackage.Literals.DOCUMENT_ROOT__OBJECT, newObject);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PGPDataType getPGPData() {
		return (PGPDataType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPGPData(PGPDataType newPGPData, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA, newPGPData, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPGPData(PGPDataType newPGPData) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__PGP_DATA,
				newPGPData);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReferenceType getReference() {
		return (ReferenceType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE, newReference, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__REFERENCE,
				newReference);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RetrievalMethodType getRetrievalMethod() {
		return (RetrievalMethodType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRetrievalMethod(RetrievalMethodType newRetrievalMethod,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD, newRetrievalMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRetrievalMethod(RetrievalMethodType newRetrievalMethod) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RETRIEVAL_METHOD,
				newRetrievalMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RSAKeyValueType getRSAKeyValue() {
		return (RSAKeyValueType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetRSAKeyValue(RSAKeyValueType newRSAKeyValue,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE, newRSAKeyValue, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRSAKeyValue(RSAKeyValueType newRSAKeyValue) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__RSA_KEY_VALUE,
				newRSAKeyValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignatureType getSignature() {
		return (SignatureType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignature(SignatureType newSignature, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE, newSignature, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignature(SignatureType newSignature) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE,
				newSignature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignatureMethodType getSignatureMethod() {
		return (SignatureMethodType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignatureMethod(SignatureMethodType newSignatureMethod,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD, newSignatureMethod, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignatureMethod(SignatureMethodType newSignatureMethod) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_METHOD,
				newSignatureMethod);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignaturePropertiesType getSignatureProperties() {
		return (SignaturePropertiesType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperties(
			SignaturePropertiesType newSignatureProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, newSignatureProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignatureProperties(SignaturePropertiesType newSignatureProperties) {
		((FeatureMap.Internal) getMixed()).set(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTIES, newSignatureProperties);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignaturePropertyType getSignatureProperty() {
		return (SignaturePropertyType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignatureProperty(SignaturePropertyType newSignatureProperty,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, newSignatureProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignatureProperty(SignaturePropertyType newSignatureProperty) {
		((FeatureMap.Internal) getMixed()).set(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_PROPERTY, newSignatureProperty);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignatureValueType getSignatureValue() {
		return (SignatureValueType) getMixed().get(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignatureValue(SignatureValueType newSignatureValue,
			NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE, newSignatureValue, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignatureValue(SignatureValueType newSignatureValue) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNATURE_VALUE,
				newSignatureValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignedInfoType getSignedInfo() {
		return (SignedInfoType) getMixed()
				.get(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignedInfo(SignedInfoType newSignedInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO, newSignedInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignedInfo(SignedInfoType newSignedInfo) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SIGNED_INFO,
				newSignedInfo);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SPKIDataType getSPKIData() {
		return (SPKIDataType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSPKIData(SPKIDataType newSPKIData, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA, newSPKIData, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSPKIData(SPKIDataType newSPKIData) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__SPKI_DATA,
				newSPKIData);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransformType getTransform() {
		return (TransformType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTransform(TransformType newTransform, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM, newTransform, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransform(TransformType newTransform) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORM,
				newTransform);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransformsType getTransforms() {
		return (TransformsType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTransforms(TransformsType newTransforms, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS, newTransforms, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransforms(TransformsType newTransforms) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__TRANSFORMS,
				newTransforms);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public X509DataType getX509Data() {
		return (X509DataType) getMixed().get(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetX509Data(X509DataType newX509Data, NotificationChain msgs) {
		return ((FeatureMap.Internal) getMixed()).basicAdd(
				XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA, newX509Data, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setX509Data(X509DataType newX509Data) {
		((FeatureMap.Internal) getMixed()).set(XmldsigPackage.Literals.DOCUMENT_ROOT__X509_DATA,
				newX509Data);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case XmldsigPackage.DOCUMENT_ROOT__MIXED:
			return ((InternalEList<?>) getMixed()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			return ((InternalEList<?>) getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			return ((InternalEList<?>) getXSISchemaLocation()).basicRemove(otherEnd, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			return basicSetCanonicalizationMethod(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			return basicSetDigestMethod(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			return basicSetDSAKeyValue(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			return basicSetKeyInfo(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			return basicSetKeyValue(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			return basicSetManifest(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			return basicSetObject(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			return basicSetPGPData(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			return basicSetReference(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			return basicSetRetrievalMethod(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			return basicSetRSAKeyValue(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			return basicSetSignature(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			return basicSetSignatureMethod(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			return basicSetSignatureProperties(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			return basicSetSignatureProperty(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			return basicSetSignatureValue(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			return basicSetSignedInfo(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			return basicSetSPKIData(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			return basicSetTransform(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			return basicSetTransforms(null, msgs);
		case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			return basicSetX509Data(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmldsigPackage.DOCUMENT_ROOT__MIXED:
			if (coreType)
				return getMixed();
			return ((FeatureMap.Internal) getMixed()).getWrapper();
		case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			if (coreType)
				return getXMLNSPrefixMap();
			else
				return getXMLNSPrefixMap().map();
		case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			if (coreType)
				return getXSISchemaLocation();
			else
				return getXSISchemaLocation().map();
		case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			return getCanonicalizationMethod();
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			return getDigestMethod();
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
			return getDigestValue();
		case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			return getDSAKeyValue();
		case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			return getKeyInfo();
		case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
			return getKeyName();
		case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			return getKeyValue();
		case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			return getManifest();
		case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
			return getMgmtData();
		case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			return getObject();
		case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			return getPGPData();
		case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			return getReference();
		case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			return getRetrievalMethod();
		case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			return getRSAKeyValue();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			return getSignature();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			return getSignatureMethod();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			return getSignatureProperties();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			return getSignatureProperty();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			return getSignatureValue();
		case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			return getSignedInfo();
		case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			return getSPKIData();
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			return getTransform();
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			return getTransforms();
		case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			return getX509Data();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.DOCUMENT_ROOT__MIXED:
			((FeatureMap.Internal) getMixed()).set(newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			((EStructuralFeature.Setting) getXMLNSPrefixMap()).set(newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			((EStructuralFeature.Setting) getXSISchemaLocation()).set(newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			setCanonicalizationMethod((CanonicalizationMethodType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			setDigestMethod((DigestMethodType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
			setDigestValue((byte[]) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			setDSAKeyValue((DSAKeyValueType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			setKeyInfo((KeyInfoType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
			setKeyName((String) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			setKeyValue((KeyValueType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			setManifest((ManifestType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
			setMgmtData((String) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			setObject((ObjectType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			setPGPData((PGPDataType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			setReference((ReferenceType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			setRetrievalMethod((RetrievalMethodType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			setRSAKeyValue((RSAKeyValueType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			setSignature((SignatureType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			setSignatureMethod((SignatureMethodType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			setSignatureProperties((SignaturePropertiesType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			setSignatureProperty((SignaturePropertyType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			setSignatureValue((SignatureValueType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			setSignedInfo((SignedInfoType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			setSPKIData((SPKIDataType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			setTransform((TransformType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			setTransforms((TransformsType) newValue);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			setX509Data((X509DataType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XmldsigPackage.DOCUMENT_ROOT__MIXED:
			getMixed().clear();
			return;
		case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			getXMLNSPrefixMap().clear();
			return;
		case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			getXSISchemaLocation().clear();
			return;
		case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			setCanonicalizationMethod((CanonicalizationMethodType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			setDigestMethod((DigestMethodType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
			setDigestValue(DIGEST_VALUE_EDEFAULT);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			setDSAKeyValue((DSAKeyValueType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			setKeyInfo((KeyInfoType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
			setKeyName(KEY_NAME_EDEFAULT);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			setKeyValue((KeyValueType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			setManifest((ManifestType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
			setMgmtData(MGMT_DATA_EDEFAULT);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			setObject((ObjectType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			setPGPData((PGPDataType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			setReference((ReferenceType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			setRetrievalMethod((RetrievalMethodType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			setRSAKeyValue((RSAKeyValueType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			setSignature((SignatureType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			setSignatureMethod((SignatureMethodType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			setSignatureProperties((SignaturePropertiesType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			setSignatureProperty((SignaturePropertyType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			setSignatureValue((SignatureValueType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			setSignedInfo((SignedInfoType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			setSPKIData((SPKIDataType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			setTransform((TransformType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			setTransforms((TransformsType) null);
			return;
		case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			setX509Data((X509DataType) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XmldsigPackage.DOCUMENT_ROOT__MIXED:
			return mixed != null && !mixed.isEmpty();
		case XmldsigPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
			return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
		case XmldsigPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
			return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
		case XmldsigPackage.DOCUMENT_ROOT__CANONICALIZATION_METHOD:
			return getCanonicalizationMethod() != null;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_METHOD:
			return getDigestMethod() != null;
		case XmldsigPackage.DOCUMENT_ROOT__DIGEST_VALUE:
			return DIGEST_VALUE_EDEFAULT == null ? getDigestValue() != null : !DIGEST_VALUE_EDEFAULT
					.equals(getDigestValue());
		case XmldsigPackage.DOCUMENT_ROOT__DSA_KEY_VALUE:
			return getDSAKeyValue() != null;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_INFO:
			return getKeyInfo() != null;
		case XmldsigPackage.DOCUMENT_ROOT__KEY_NAME:
			return KEY_NAME_EDEFAULT == null ? getKeyName() != null : !KEY_NAME_EDEFAULT
					.equals(getKeyName());
		case XmldsigPackage.DOCUMENT_ROOT__KEY_VALUE:
			return getKeyValue() != null;
		case XmldsigPackage.DOCUMENT_ROOT__MANIFEST:
			return getManifest() != null;
		case XmldsigPackage.DOCUMENT_ROOT__MGMT_DATA:
			return MGMT_DATA_EDEFAULT == null ? getMgmtData() != null : !MGMT_DATA_EDEFAULT
					.equals(getMgmtData());
		case XmldsigPackage.DOCUMENT_ROOT__OBJECT:
			return getObject() != null;
		case XmldsigPackage.DOCUMENT_ROOT__PGP_DATA:
			return getPGPData() != null;
		case XmldsigPackage.DOCUMENT_ROOT__REFERENCE:
			return getReference() != null;
		case XmldsigPackage.DOCUMENT_ROOT__RETRIEVAL_METHOD:
			return getRetrievalMethod() != null;
		case XmldsigPackage.DOCUMENT_ROOT__RSA_KEY_VALUE:
			return getRSAKeyValue() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE:
			return getSignature() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_METHOD:
			return getSignatureMethod() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTIES:
			return getSignatureProperties() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_PROPERTY:
			return getSignatureProperty() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNATURE_VALUE:
			return getSignatureValue() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SIGNED_INFO:
			return getSignedInfo() != null;
		case XmldsigPackage.DOCUMENT_ROOT__SPKI_DATA:
			return getSPKIData() != null;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORM:
			return getTransform() != null;
		case XmldsigPackage.DOCUMENT_ROOT__TRANSFORMS:
			return getTransforms() != null;
		case XmldsigPackage.DOCUMENT_ROOT__X509_DATA:
			return getX509Data() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} // DocumentRootImpl
