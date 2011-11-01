/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmldsigFactoryImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2000._09.xmldsig.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmldsigFactoryImpl extends EFactoryImpl implements XmldsigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmldsigFactory init() {
		try {
			XmldsigFactory theXmldsigFactory = (XmldsigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2000/09/xmldsig#"); 
			if (theXmldsigFactory != null) {
				return theXmldsigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmldsigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmldsigPackage.CANONICALIZATION_METHOD_TYPE: return createCanonicalizationMethodType();
			case XmldsigPackage.DIGEST_METHOD_TYPE: return createDigestMethodType();
			case XmldsigPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case XmldsigPackage.DSA_KEY_VALUE_TYPE: return createDSAKeyValueType();
			case XmldsigPackage.KEY_INFO_TYPE: return createKeyInfoType();
			case XmldsigPackage.KEY_VALUE_TYPE: return createKeyValueType();
			case XmldsigPackage.MANIFEST_TYPE: return createManifestType();
			case XmldsigPackage.OBJECT_TYPE: return createObjectType();
			case XmldsigPackage.PGP_DATA_TYPE: return createPGPDataType();
			case XmldsigPackage.REFERENCE_TYPE: return createReferenceType();
			case XmldsigPackage.RETRIEVAL_METHOD_TYPE: return createRetrievalMethodType();
			case XmldsigPackage.RSA_KEY_VALUE_TYPE: return createRSAKeyValueType();
			case XmldsigPackage.SIGNATURE_METHOD_TYPE: return createSignatureMethodType();
			case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE: return createSignaturePropertiesType();
			case XmldsigPackage.SIGNATURE_PROPERTY_TYPE: return createSignaturePropertyType();
			case XmldsigPackage.SIGNATURE_TYPE: return createSignatureType();
			case XmldsigPackage.SIGNATURE_VALUE_TYPE: return createSignatureValueType();
			case XmldsigPackage.SIGNED_INFO_TYPE: return createSignedInfoType();
			case XmldsigPackage.SPKI_DATA_TYPE: return createSPKIDataType();
			case XmldsigPackage.TRANSFORMS_TYPE: return createTransformsType();
			case XmldsigPackage.TRANSFORM_TYPE: return createTransformType();
			case XmldsigPackage.X509_DATA_TYPE: return createX509DataType();
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE: return createX509IssuerSerialType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XmldsigPackage.CRYPTO_BINARY:
				return createCryptoBinaryFromString(eDataType, initialValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE:
				return createDigestValueTypeFromString(eDataType, initialValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE:
				return createHMACOutputLengthTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XmldsigPackage.CRYPTO_BINARY:
				return convertCryptoBinaryToString(eDataType, instanceValue);
			case XmldsigPackage.DIGEST_VALUE_TYPE:
				return convertDigestValueTypeToString(eDataType, instanceValue);
			case XmldsigPackage.HMAC_OUTPUT_LENGTH_TYPE:
				return convertHMACOutputLengthTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanonicalizationMethodType createCanonicalizationMethodType() {
		CanonicalizationMethodTypeImpl canonicalizationMethodType = new CanonicalizationMethodTypeImpl();
		return canonicalizationMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigestMethodType createDigestMethodType() {
		DigestMethodTypeImpl digestMethodType = new DigestMethodTypeImpl();
		return digestMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSAKeyValueType createDSAKeyValueType() {
		DSAKeyValueTypeImpl dsaKeyValueType = new DSAKeyValueTypeImpl();
		return dsaKeyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyInfoType createKeyInfoType() {
		KeyInfoTypeImpl keyInfoType = new KeyInfoTypeImpl();
		return keyInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType createKeyValueType() {
		KeyValueTypeImpl keyValueType = new KeyValueTypeImpl();
		return keyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestType createManifestType() {
		ManifestTypeImpl manifestType = new ManifestTypeImpl();
		return manifestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPDataType createPGPDataType() {
		PGPDataTypeImpl pgpDataType = new PGPDataTypeImpl();
		return pgpDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetrievalMethodType createRetrievalMethodType() {
		RetrievalMethodTypeImpl retrievalMethodType = new RetrievalMethodTypeImpl();
		return retrievalMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSAKeyValueType createRSAKeyValueType() {
		RSAKeyValueTypeImpl rsaKeyValueType = new RSAKeyValueTypeImpl();
		return rsaKeyValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureMethodType createSignatureMethodType() {
		SignatureMethodTypeImpl signatureMethodType = new SignatureMethodTypeImpl();
		return signatureMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertiesType createSignaturePropertiesType() {
		SignaturePropertiesTypeImpl signaturePropertiesType = new SignaturePropertiesTypeImpl();
		return signaturePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaturePropertyType createSignaturePropertyType() {
		SignaturePropertyTypeImpl signaturePropertyType = new SignaturePropertyTypeImpl();
		return signaturePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureType createSignatureType() {
		SignatureTypeImpl signatureType = new SignatureTypeImpl();
		return signatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureValueType createSignatureValueType() {
		SignatureValueTypeImpl signatureValueType = new SignatureValueTypeImpl();
		return signatureValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedInfoType createSignedInfoType() {
		SignedInfoTypeImpl signedInfoType = new SignedInfoTypeImpl();
		return signedInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPKIDataType createSPKIDataType() {
		SPKIDataTypeImpl spkiDataType = new SPKIDataTypeImpl();
		return spkiDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformsType createTransformsType() {
		TransformsTypeImpl transformsType = new TransformsTypeImpl();
		return transformsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformType createTransformType() {
		TransformTypeImpl transformType = new TransformTypeImpl();
		return transformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509DataType createX509DataType() {
		X509DataTypeImpl x509DataType = new X509DataTypeImpl();
		return x509DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X509IssuerSerialType createX509IssuerSerialType() {
		X509IssuerSerialTypeImpl x509IssuerSerialType = new X509IssuerSerialTypeImpl();
		return x509IssuerSerialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createCryptoBinaryFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoBinaryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createDigestValueTypeFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigestValueTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createHMACOutputLengthTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHMACOutputLengthTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmldsigPackage getXmldsigPackage() {
		return (XmldsigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmldsigPackage getPackage() {
		return XmldsigPackage.eINSTANCE;
	}

} //XmldsigFactoryImpl
