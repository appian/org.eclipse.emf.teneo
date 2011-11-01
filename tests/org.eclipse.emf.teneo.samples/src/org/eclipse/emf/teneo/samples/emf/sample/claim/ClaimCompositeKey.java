/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimCompositeKey.java,v 1.1 2008/01/18 06:20:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Composite Key</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimNumber <em>Claim Number</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimExtensionNumber <em>Claim Extension Number</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimCompositeKey()
 * @model annotation="teneo.jpa appinfo='@Embeddable'" extendedMetaData="name='ClaimCompositeKey'
 *        kind='elementOnly'"
 * @generated NOT
 */
public interface ClaimCompositeKey extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>Claim Number</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * The Unique Identifier for a Claim.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Claim Number</em>' attribute.
	 * @see #setClaimNumber(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimCompositeKey_ClaimNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" annotation="teneo.jpa
	 *        appinfo='\n\t\t\t\t\t@Column(name=CLM_NBR)\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claimNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimNumber <em>Claim Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Claim Number</em>' attribute.
	 * @see #getClaimNumber()
	 * @generated
	 */
	void setClaimNumber(String value);

	/**
	 * Returns the value of the '<em><b>Claim Extension Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * The Unique Identifier for a Claim.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Claim Extension Number</em>' attribute.
	 * @see #setClaimExtensionNumber(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimCompositeKey_ClaimExtensionNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" annotation="teneo.jpa
	 *        appinfo='\n\t\t\t\t\t@Column(name=CLM_EXT_NBR)\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claimExtensionNumber'
	 *        namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimExtensionNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimExtensionNumber <em>Claim Extension Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Claim Extension Number</em>' attribute.
	 * @see #getClaimExtensionNumber()
	 * @generated
	 */
	void setClaimExtensionNumber(String value);

} // ClaimCompositeKey
