/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmldsigAdapterFactory.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3._2000._09.xmldsig.*;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage
 * @generated
 */
public class XmldsigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static XmldsigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XmldsigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XmldsigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is
	 * an instance object of the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected XmldsigSwitch<Adapter> modelSwitch = new XmldsigSwitch<Adapter>() {
		@Override
		public Adapter caseCanonicalizationMethodType(CanonicalizationMethodType object) {
			return createCanonicalizationMethodTypeAdapter();
		}

		@Override
		public Adapter caseDigestMethodType(DigestMethodType object) {
			return createDigestMethodTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseDSAKeyValueType(DSAKeyValueType object) {
			return createDSAKeyValueTypeAdapter();
		}

		@Override
		public Adapter caseKeyInfoType(KeyInfoType object) {
			return createKeyInfoTypeAdapter();
		}

		@Override
		public Adapter caseKeyValueType(KeyValueType object) {
			return createKeyValueTypeAdapter();
		}

		@Override
		public Adapter caseManifestType(ManifestType object) {
			return createManifestTypeAdapter();
		}

		@Override
		public Adapter caseObjectType(ObjectType object) {
			return createObjectTypeAdapter();
		}

		@Override
		public Adapter casePGPDataType(PGPDataType object) {
			return createPGPDataTypeAdapter();
		}

		@Override
		public Adapter caseReferenceType(ReferenceType object) {
			return createReferenceTypeAdapter();
		}

		@Override
		public Adapter caseRetrievalMethodType(RetrievalMethodType object) {
			return createRetrievalMethodTypeAdapter();
		}

		@Override
		public Adapter caseRSAKeyValueType(RSAKeyValueType object) {
			return createRSAKeyValueTypeAdapter();
		}

		@Override
		public Adapter caseSignatureMethodType(SignatureMethodType object) {
			return createSignatureMethodTypeAdapter();
		}

		@Override
		public Adapter caseSignaturePropertiesType(SignaturePropertiesType object) {
			return createSignaturePropertiesTypeAdapter();
		}

		@Override
		public Adapter caseSignaturePropertyType(SignaturePropertyType object) {
			return createSignaturePropertyTypeAdapter();
		}

		@Override
		public Adapter caseSignatureType(SignatureType object) {
			return createSignatureTypeAdapter();
		}

		@Override
		public Adapter caseSignatureValueType(SignatureValueType object) {
			return createSignatureValueTypeAdapter();
		}

		@Override
		public Adapter caseSignedInfoType(SignedInfoType object) {
			return createSignedInfoTypeAdapter();
		}

		@Override
		public Adapter caseSPKIDataType(SPKIDataType object) {
			return createSPKIDataTypeAdapter();
		}

		@Override
		public Adapter caseTransformsType(TransformsType object) {
			return createTransformsTypeAdapter();
		}

		@Override
		public Adapter caseTransformType(TransformType object) {
			return createTransformTypeAdapter();
		}

		@Override
		public Adapter caseX509DataType(X509DataType object) {
			return createX509DataTypeAdapter();
		}

		@Override
		public Adapter caseX509IssuerSerialType(X509IssuerSerialType object) {
			return createX509IssuerSerialTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.CanonicalizationMethodType
	 * <em>Canonicalization Method Type</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.CanonicalizationMethodType
	 * @generated
	 */
	public Adapter createCanonicalizationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DigestMethodType
	 * <em>Digest Method Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DigestMethodType
	 * @generated
	 */
	public Adapter createDigestMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.DSAKeyValueType
	 * <em>DSA Key Value Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.DSAKeyValueType
	 * @generated
	 */
	public Adapter createDSAKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyInfoType
	 * <em>Key Info Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyInfoType
	 * @generated
	 */
	public Adapter createKeyInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.KeyValueType
	 * <em>Key Value Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.KeyValueType
	 * @generated
	 */
	public Adapter createKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ManifestType
	 * <em>Manifest Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ManifestType
	 * @generated
	 */
	public Adapter createManifestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ObjectType
	 * <em>Object Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.PGPDataType
	 * <em>PGP Data Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.PGPDataType
	 * @generated
	 */
	public Adapter createPGPDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.ReferenceType
	 * <em>Reference Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.RetrievalMethodType <em>Retrieval Method Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RetrievalMethodType
	 * @generated
	 */
	public Adapter createRetrievalMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.RSAKeyValueType
	 * <em>RSA Key Value Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.RSAKeyValueType
	 * @generated
	 */
	public Adapter createRSAKeyValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.SignatureMethodType <em>Signature Method Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureMethodType
	 * @generated
	 */
	public Adapter createSignatureMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.SignaturePropertiesType <em>Signature Properties Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertiesType
	 * @generated
	 */
	public Adapter createSignaturePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.SignaturePropertyType <em>Signature Property Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignaturePropertyType
	 * @generated
	 */
	public Adapter createSignaturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignatureType
	 * <em>Signature Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureType
	 * @generated
	 */
	public Adapter createSignatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.SignatureValueType <em>Signature Value Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignatureValueType
	 * @generated
	 */
	public Adapter createSignatureValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SignedInfoType
	 * <em>Signed Info Type</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SignedInfoType
	 * @generated
	 */
	public Adapter createSignedInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.SPKIDataType
	 * <em>SPKI Data Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.SPKIDataType
	 * @generated
	 */
	public Adapter createSPKIDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformsType
	 * <em>Transforms Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformsType
	 * @generated
	 */
	public Adapter createTransformsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.TransformType
	 * <em>Transform Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.TransformType
	 * @generated
	 */
	public Adapter createTransformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3._2000._09.xmldsig.X509DataType
	 * <em>X509 Data Type</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509DataType
	 * @generated
	 */
	public Adapter createX509DataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.w3._2000._09.xmldsig.X509IssuerSerialType <em>X509 Issuer Serial Type</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.w3._2000._09.xmldsig.X509IssuerSerialType
	 * @generated
	 */
	public Adapter createX509IssuerSerialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation
	 * returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // XmldsigAdapterFactory
