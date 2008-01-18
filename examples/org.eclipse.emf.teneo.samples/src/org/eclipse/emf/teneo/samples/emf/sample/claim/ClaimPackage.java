/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimPackage.java,v 1.1 2008/01/18 06:20:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimFactory
 * @model kind="package"
 * @generated
 */
public interface ClaimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "claim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/sample/claim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "claim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClaimPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 0;

	/**
	 * The feature id for the '<em><b>Claim Composite Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_COMPOSITE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Billing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__BILLING_NAME = 1;

	/**
	 * The feature id for the '<em><b>Claim Group VSP Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_GROUP_VSP_ID = 2;

	/**
	 * The feature id for the '<em><b>Claim Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Claim Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_LINE = 4;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl <em>Composite Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimCompositeKey()
	 * @generated
	 */
	int CLAIM_COMPOSITE_KEY = 1;

	/**
	 * The feature id for the '<em><b>Claim Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_COMPOSITE_KEY__CLAIM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Claim Extension Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Composite Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_COMPOSITE_KEY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimLine()
	 * @generated
	 */
	int CLAIM_LINE = 2;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE__CLAIM = 0;

	/**
	 * The feature id for the '<em><b>Claim Line Composite Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY = 1;

	/**
	 * The feature id for the '<em><b>Claim Line Billed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Service Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE__SERVICE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Claim Line Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE__CLAIM_LINE_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl <em>Line Composite Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimLineCompositeKey()
	 * @generated
	 */
	int CLAIM_LINE_COMPOSITE_KEY = 3;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE_COMPOSITE_KEY__CLAIM = 0;

	/**
	 * The feature id for the '<em><b>Claim Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Line Composite Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_LINE_COMPOSITE_KEY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimCompositeKey <em>Claim Composite Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claim Composite Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimCompositeKey()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimCompositeKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName <em>Billing Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getBillingName()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_BillingName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId <em>Claim Group VSP Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Group VSP Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimGroupVSPId()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_ClaimGroupVSPId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus <em>Claim Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Status</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimStatus()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_ClaimStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimLine <em>Claim Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claim Line</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.Claim#getClaimLine()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimLine();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey <em>Composite Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey
	 * @generated
	 */
	EClass getClaimCompositeKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimNumber <em>Claim Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimNumber()
	 * @see #getClaimCompositeKey()
	 * @generated
	 */
	EAttribute getClaimCompositeKey_ClaimNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimExtensionNumber <em>Claim Extension Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Extension Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey#getClaimExtensionNumber()
	 * @see #getClaimCompositeKey()
	 * @generated
	 */
	EAttribute getClaimCompositeKey_ClaimExtensionNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine
	 * @generated
	 */
	EClass getClaimLine();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Claim</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaim()
	 * @see #getClaimLine()
	 * @generated
	 */
	EReference getClaimLine_Claim();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineCompositeKey <em>Claim Line Composite Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claim Line Composite Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineCompositeKey()
	 * @see #getClaimLine()
	 * @generated
	 */
	EReference getClaimLine_ClaimLineCompositeKey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineBilledAmount <em>Claim Line Billed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Line Billed Amount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineBilledAmount()
	 * @see #getClaimLine()
	 * @generated
	 */
	EAttribute getClaimLine_ClaimLineBilledAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getServiceCode <em>Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getServiceCode()
	 * @see #getClaimLine()
	 * @generated
	 */
	EAttribute getClaimLine_ServiceCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus <em>Claim Line Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Line Status</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine#getClaimLineStatus()
	 * @see #getClaimLine()
	 * @generated
	 */
	EAttribute getClaimLine_ClaimLineStatus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey <em>Line Composite Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Composite Key</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey
	 * @generated
	 */
	EClass getClaimLineCompositeKey();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaim()
	 * @see #getClaimLineCompositeKey()
	 * @generated
	 */
	EReference getClaimLineCompositeKey_Claim();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaimLineNumber <em>Claim Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Line Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey#getClaimLineNumber()
	 * @see #getClaimLineCompositeKey()
	 * @generated
	 */
	EAttribute getClaimLineCompositeKey_ClaimLineNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClaimFactory getClaimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Claim Composite Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_COMPOSITE_KEY = eINSTANCE.getClaim_ClaimCompositeKey();

		/**
		 * The meta object literal for the '<em><b>Billing Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__BILLING_NAME = eINSTANCE.getClaim_BillingName();

		/**
		 * The meta object literal for the '<em><b>Claim Group VSP Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__CLAIM_GROUP_VSP_ID = eINSTANCE.getClaim_ClaimGroupVSPId();

		/**
		 * The meta object literal for the '<em><b>Claim Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__CLAIM_STATUS = eINSTANCE.getClaim_ClaimStatus();

		/**
		 * The meta object literal for the '<em><b>Claim Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_LINE = eINSTANCE.getClaim_ClaimLine();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl <em>Composite Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimCompositeKey()
		 * @generated
		 */
		EClass CLAIM_COMPOSITE_KEY = eINSTANCE.getClaimCompositeKey();

		/**
		 * The meta object literal for the '<em><b>Claim Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_COMPOSITE_KEY__CLAIM_NUMBER = eINSTANCE.getClaimCompositeKey_ClaimNumber();

		/**
		 * The meta object literal for the '<em><b>Claim Extension Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER = eINSTANCE.getClaimCompositeKey_ClaimExtensionNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimLine()
		 * @generated
		 */
		EClass CLAIM_LINE = eINSTANCE.getClaimLine();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_LINE__CLAIM = eINSTANCE.getClaimLine_Claim();

		/**
		 * The meta object literal for the '<em><b>Claim Line Composite Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY = eINSTANCE.getClaimLine_ClaimLineCompositeKey();

		/**
		 * The meta object literal for the '<em><b>Claim Line Billed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT = eINSTANCE.getClaimLine_ClaimLineBilledAmount();

		/**
		 * The meta object literal for the '<em><b>Service Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_LINE__SERVICE_CODE = eINSTANCE.getClaimLine_ServiceCode();

		/**
		 * The meta object literal for the '<em><b>Claim Line Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_LINE__CLAIM_LINE_STATUS = eINSTANCE.getClaimLine_ClaimLineStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl <em>Line Composite Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl
		 * @see org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimPackageImpl#getClaimLineCompositeKey()
		 * @generated
		 */
		EClass CLAIM_LINE_COMPOSITE_KEY = eINSTANCE.getClaimLineCompositeKey();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_LINE_COMPOSITE_KEY__CLAIM = eINSTANCE.getClaimLineCompositeKey_Claim();

		/**
		 * The meta object literal for the '<em><b>Claim Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER = eINSTANCE.getClaimLineCompositeKey_ClaimLineNumber();

	}

} //ClaimPackage
