/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimLineCompositeKey.java,v 1.1 2008/01/18 06:20:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import java.io.Serializable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Line Composite Key</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaim <em>Claim</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaimLineNumber <em>Claim Line Number</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLineCompositeKey()
 * @model annotation="teneo.jpa appinfo='@Embeddable'"
 *        extendedMetaData="name='ClaimLineCompositeKey' kind='elementOnly'"
 * @generated NOT
 */
public interface ClaimLineCompositeKey extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>Claim</b></em>' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> A generated key to uniquely the parent <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Claim</em>' reference.
	 * @see #setClaim(Claim)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLineCompositeKey_Claim()
	 * @model resolveProxies="false" required="true" annotation="teneo.jpa
	 *        appinfo='\n\t\t\t\t\t\t@ManyToOne\n\t\t\t\t\t\t@JoinColumns({\n\t\t
	 *        \t\t\t\t@JoinColumn(name=\"CLM_NBR\", referencedColumnName = \"CLM_NBR\"),\n\t\t
	 *        \t\t\t\t@JoinColumn(name=\"CLM_EXT_NBR\", referencedColumnName =\"CLM_EXT_NBR\")\n\t\t
	 *        \t\t\t})\n\t\t\t\t\t\t'" extendedMetaData="kind='element' name='claim'
	 *        namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaim <em>Claim</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Claim</em>' reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Line Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * 
	 * The Unique Identifier for a Claim.
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Claim Line Number</em>' attribute.
	 * @see #setClaimLineNumber(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage#getClaimLineCompositeKey_ClaimLineNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true" annotation="teneo.jpa
	 *        appinfo='\n\t\t\t\t\t@Column(name=CLMLN_NBR)\n\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='claimLineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getClaimLineNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaimLineNumber <em>Claim Line Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Claim Line Number</em>' attribute.
	 * @see #getClaimLineNumber()
	 * @generated
	 */
	void setClaimLineNumber(String value);

} // ClaimLineCompositeKey
