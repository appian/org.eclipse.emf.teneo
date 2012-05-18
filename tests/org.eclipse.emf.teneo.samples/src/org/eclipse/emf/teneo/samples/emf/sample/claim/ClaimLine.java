/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimLine.java,v 1.1 2008/01/18 06:20:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Claim Line Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineCompositeKey <em>Claim Line Composite Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineBilledAmount <em>Claim Line Billed Amount</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getServiceCode <em>Service Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus <em>Claim Line Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine()
 * @model annotation="teneo.jpa appinfo='\t\n\t\t@Table(\n\t\t  name=PCLM_NPRC_CLMLN\t\t  \n\t\t )\n\t\t'"
 *        extendedMetaData="name='ClaimLine' kind='elementOnly'"
 * @generated
 */
public interface ClaimLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimLine <em>Claim Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A generated key to uniquely the parent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' container reference.
	 * @see #setClaim(Claim)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine_Claim()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimLine
	 * @model opposite="claimLine" resolveProxies="false" required="true" transient="false"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@Transient\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim <em>Claim</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' container reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Line Composite Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Line Composite Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Line Composite Key</em>' containment reference.
	 * @see #setClaimLineCompositeKey(ClaimLineCompositeKey)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine_ClaimLineCompositeKey()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='@EmbeddedId'"
	 *        extendedMetaData="kind='element' name='claimLineCompositeKey' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimLineCompositeKey getClaimLineCompositeKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineCompositeKey <em>Claim Line Composite Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Line Composite Key</em>' containment reference.
	 * @see #getClaimLineCompositeKey()
	 * @generated
	 */
	void setClaimLineCompositeKey(ClaimLineCompositeKey value);

	/**
	 * Returns the value of the '<em><b>Claim Line Billed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The Unique Identifier for a Claim. 
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Line Billed Amount</em>' attribute.
	 * @see #setClaimLineBilledAmount(BigDecimal)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine_ClaimLineBilledAmount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t@Column(name=CLMLN_BILL_AMT)\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claimLineBilledAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getClaimLineBilledAmount();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineBilledAmount <em>Claim Line Billed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Line Billed Amount</em>' attribute.
	 * @see #getClaimLineBilledAmount()
	 * @generated
	 */
	void setClaimLineBilledAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Service Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 					The Unique Identifier for a Claim. 
	 * 				
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Code</em>' attribute.
	 * @see #setServiceCode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine_ServiceCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t@Column(name=SVC_CD)\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='serviceCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getServiceCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getServiceCode <em>Service Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Code</em>' attribute.
	 * @see #getServiceCode()
	 * @generated
	 */
	void setServiceCode(String value);

	/**
	 * Returns the value of the '<em><b>Claim Line Status</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Line Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Line Status</em>' attribute.
	 * @see #isSetClaimLineStatus()
	 * @see #unsetClaimLineStatus()
	 * @see #setClaimLineStatus(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLine_ClaimLineStatus()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Column(name=CLMLN_STATUS,length=\"2\")'"
	 *        extendedMetaData="kind='element' name='claimLineStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimLineStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus <em>Claim Line Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Line Status</em>' attribute.
	 * @see #isSetClaimLineStatus()
	 * @see #unsetClaimLineStatus()
	 * @see #getClaimLineStatus()
	 * @generated
	 */
	void setClaimLineStatus(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus <em>Claim Line Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClaimLineStatus()
	 * @see #getClaimLineStatus()
	 * @see #setClaimLineStatus(String)
	 * @generated
	 */
	void unsetClaimLineStatus();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus <em>Claim Line Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Claim Line Status</em>' attribute is set.
	 * @see #unsetClaimLineStatus()
	 * @see #getClaimLineStatus()
	 * @see #setClaimLineStatus(String)
	 * @generated
	 */
	boolean isSetClaimLineStatus();

} // ClaimLine
