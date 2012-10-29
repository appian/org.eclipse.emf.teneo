/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmldsigSwitch.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.*;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage
 * @generated
 */
public class XmldsigSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static XmldsigPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XmldsigSwitch() {
		if (modelPackage == null) {
			modelPackage = XmldsigPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0),
					theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it
	 * yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case XmldsigPackage.CANONICALIZATION_METHOD_TYPE: {
			CanonicalizationMethodType canonicalizationMethodType = (CanonicalizationMethodType) theEObject;
			T result = caseCanonicalizationMethodType(canonicalizationMethodType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.DIGEST_METHOD_TYPE: {
			DigestMethodType digestMethodType = (DigestMethodType) theEObject;
			T result = caseDigestMethodType(digestMethodType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.DSA_KEY_VALUE_TYPE: {
			DSAKeyValueType dsaKeyValueType = (DSAKeyValueType) theEObject;
			T result = caseDSAKeyValueType(dsaKeyValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.KEY_INFO_TYPE: {
			KeyInfoType keyInfoType = (KeyInfoType) theEObject;
			T result = caseKeyInfoType(keyInfoType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.KEY_VALUE_TYPE: {
			KeyValueType keyValueType = (KeyValueType) theEObject;
			T result = caseKeyValueType(keyValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.MANIFEST_TYPE: {
			ManifestType manifestType = (ManifestType) theEObject;
			T result = caseManifestType(manifestType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.OBJECT_TYPE: {
			ObjectType objectType = (ObjectType) theEObject;
			T result = caseObjectType(objectType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.PGP_DATA_TYPE: {
			PGPDataType pgpDataType = (PGPDataType) theEObject;
			T result = casePGPDataType(pgpDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.REFERENCE_TYPE: {
			ReferenceType referenceType = (ReferenceType) theEObject;
			T result = caseReferenceType(referenceType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.RETRIEVAL_METHOD_TYPE: {
			RetrievalMethodType retrievalMethodType = (RetrievalMethodType) theEObject;
			T result = caseRetrievalMethodType(retrievalMethodType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.RSA_KEY_VALUE_TYPE: {
			RSAKeyValueType rsaKeyValueType = (RSAKeyValueType) theEObject;
			T result = caseRSAKeyValueType(rsaKeyValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNATURE_METHOD_TYPE: {
			SignatureMethodType signatureMethodType = (SignatureMethodType) theEObject;
			T result = caseSignatureMethodType(signatureMethodType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE: {
			SignaturePropertiesType signaturePropertiesType = (SignaturePropertiesType) theEObject;
			T result = caseSignaturePropertiesType(signaturePropertiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNATURE_PROPERTY_TYPE: {
			SignaturePropertyType signaturePropertyType = (SignaturePropertyType) theEObject;
			T result = caseSignaturePropertyType(signaturePropertyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNATURE_TYPE: {
			SignatureType signatureType = (SignatureType) theEObject;
			T result = caseSignatureType(signatureType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNATURE_VALUE_TYPE: {
			SignatureValueType signatureValueType = (SignatureValueType) theEObject;
			T result = caseSignatureValueType(signatureValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SIGNED_INFO_TYPE: {
			SignedInfoType signedInfoType = (SignedInfoType) theEObject;
			T result = caseSignedInfoType(signedInfoType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.SPKI_DATA_TYPE: {
			SPKIDataType spkiDataType = (SPKIDataType) theEObject;
			T result = caseSPKIDataType(spkiDataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.TRANSFORMS_TYPE: {
			TransformsType transformsType = (TransformsType) theEObject;
			T result = caseTransformsType(transformsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.TRANSFORM_TYPE: {
			TransformType transformType = (TransformType) theEObject;
			T result = caseTransformType(transformType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.X509_DATA_TYPE: {
			X509DataType x509DataType = (X509DataType) theEObject;
			T result = caseX509DataType(x509DataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XmldsigPackage.X509_ISSUER_SERIAL_TYPE: {
			X509IssuerSerialType x509IssuerSerialType = (X509IssuerSerialType) theEObject;
			T result = caseX509IssuerSerialType(x509IssuerSerialType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Canonicalization Method Type</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Canonicalization Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCanonicalizationMethodType(CanonicalizationMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digest Method Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digest Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigestMethodType(DigestMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSA Key Value Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSA Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAKeyValueType(DSAKeyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Info Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyInfoType(KeyInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueType(KeyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestType(ManifestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PGP Data Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PGP Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePGPDataType(PGPDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retrieval Method Type</em>
	 * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retrieval Method Type</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetrievalMethodType(RetrievalMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSA Key Value Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSA Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSAKeyValueType(RSAKeyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Method Type</em>
	 * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Method Type</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureMethodType(SignatureMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Signature Properties Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Signature Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignaturePropertiesType(SignaturePropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Signature Property Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Signature Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignaturePropertyType(SignaturePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureType(SignatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Value Type</em>
	 * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Value Type</em>
	 *         '.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureValueType(SignatureValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Info Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedInfoType(SignedInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPKI Data Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPKI Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPKIDataType(SPKIDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transforms Type</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transforms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformsType(TransformsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformType(TransformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X509 Data Type</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X509 Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX509DataType(X509DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>X509 Issuer Serial Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>X509 Issuer Serial Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX509IssuerSerialType(X509IssuerSerialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate
	 * the switch, but this is the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *          the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // XmldsigSwitch
