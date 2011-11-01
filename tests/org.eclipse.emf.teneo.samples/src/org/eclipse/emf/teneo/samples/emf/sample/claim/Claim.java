/**
 * <copyright>
 * </copyright>
 *
 * $Id: Claim.java,v 1.2 2009/11/10 10:05:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Claim Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimCompositeKey <em>Claim Composite Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName <em>Billing Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId <em>Claim Group VSP Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus <em>Claim Status</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimLine <em>Claim Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim()
 * @model annotation="teneo.extra appinfo='\t\n\t@Table(\n\t  name=PCLM_NPRC_CLM\n\t  uniqueConstraints = {\t@UniqueConstraint(columnNames={\"CLM_NBR\", \"CLM_EXT_NBR\"})\n\t  \t\t\t\t\t  }\t  \n\t)\n\t'"
 *        extendedMetaData="name='Claim' kind='elementOnly'"
 * @generated
 */
public interface Claim extends EObject {
	/**
	 * Returns the value of the '<em><b>Claim Composite Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Composite Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Composite Key</em>' containment reference.
	 * @see #setClaimCompositeKey(ClaimCompositeKey)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim_ClaimCompositeKey()
	 * @model containment="true" required="true"
	 *        annotation="teneo.extra.test appinfo='@EmbeddedId'"
	 *        extendedMetaData="kind='element' name='claimCompositeKey' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimCompositeKey getClaimCompositeKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimCompositeKey <em>Claim Composite Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Composite Key</em>' containment reference.
	 * @see #getClaimCompositeKey()
	 * @generated
	 */
	void setClaimCompositeKey(ClaimCompositeKey value);

	/**
	 * Returns the value of the '<em><b>Billing Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Billing Name</em>' attribute.
	 * @see #isSetBillingName()
	 * @see #unsetBillingName()
	 * @see #setBillingName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim_BillingName()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Column(name=BILLING_NAME,length=\"50\")'"
	 *        extendedMetaData="kind='element' name='billingName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBillingName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName <em>Billing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Name</em>' attribute.
	 * @see #isSetBillingName()
	 * @see #unsetBillingName()
	 * @see #getBillingName()
	 * @generated
	 */
	void setBillingName(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName <em>Billing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBillingName()
	 * @see #getBillingName()
	 * @see #setBillingName(String)
	 * @generated
	 */
	void unsetBillingName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName <em>Billing Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Billing Name</em>' attribute is set.
	 * @see #unsetBillingName()
	 * @see #getBillingName()
	 * @see #setBillingName(String)
	 * @generated
	 */
	boolean isSetBillingName();

	/**
	 * Returns the value of the '<em><b>Claim Group VSP Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim Group VSP Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Group VSP Id</em>' attribute.
	 * @see #isSetClaimGroupVSPId()
	 * @see #unsetClaimGroupVSPId()
	 * @see #setClaimGroupVSPId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim_ClaimGroupVSPId()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.extra.test appinfo='@Column(name=CLM_GRP_VSP_ID,length=\"3\")'"
	 *        extendedMetaData="kind='element' name='claimGroupVSPId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimGroupVSPId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId <em>Claim Group VSP Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Group VSP Id</em>' attribute.
	 * @see #isSetClaimGroupVSPId()
	 * @see #unsetClaimGroupVSPId()
	 * @see #getClaimGroupVSPId()
	 * @generated
	 */
	void setClaimGroupVSPId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId <em>Claim Group VSP Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClaimGroupVSPId()
	 * @see #getClaimGroupVSPId()
	 * @see #setClaimGroupVSPId(String)
	 * @generated
	 */
	void unsetClaimGroupVSPId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId <em>Claim Group VSP Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Claim Group VSP Id</em>' attribute is set.
	 * @see #unsetClaimGroupVSPId()
	 * @see #getClaimGroupVSPId()
	 * @see #setClaimGroupVSPId(String)
	 * @generated
	 */
	boolean isSetClaimGroupVSPId();

	/**
	 * Returns the value of the '<em><b>Claim Status</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Status</em>' attribute.
	 * @see #isSetClaimStatus()
	 * @see #unsetClaimStatus()
	 * @see #setClaimStatus(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim_ClaimStatus()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.extra.test appinfo='@Column(name=CLM_STATUS,length=\"2\")'"
	 *        extendedMetaData="kind='element' name='claimStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus <em>Claim Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Status</em>' attribute.
	 * @see #isSetClaimStatus()
	 * @see #unsetClaimStatus()
	 * @see #getClaimStatus()
	 * @generated
	 */
	void setClaimStatus(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus <em>Claim Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClaimStatus()
	 * @see #getClaimStatus()
	 * @see #setClaimStatus(String)
	 * @generated
	 */
	void unsetClaimStatus();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus <em>Claim Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Claim Status</em>' attribute is set.
	 * @see #unsetClaimStatus()
	 * @see #getClaimStatus()
	 * @see #setClaimStatus(String)
	 * @generated
	 */
	boolean isSetClaimStatus();

	/**
	 * Returns the value of the '<em><b>Claim Line</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Line</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaim_ClaimLine()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim
	 * @model opposite="claim" containment="true"
	 *        annotation="teneo.extra appinfo='\n\t\t\t\t\t@OneToMany(mappedBy=\"ClaimLine\", indexed=false)\n\t\t\t\t\t@JoinColumns({\n    \t\t\t\t\t@JoinColumn(name=\"CLM_NBR\"),\n    \t\t\t\t\t@JoinColumn(name=\"CLM_EXT_NBR\")\n    \t\t\t\t})\t\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claimLine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimLine> getClaimLine();

} // Claim
