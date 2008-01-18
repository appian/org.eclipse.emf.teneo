/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimLineCompositeKeyImpl.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.claim.Claim;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Line Composite Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl#getClaim <em>Claim</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineCompositeKeyImpl#getClaimLineNumber <em>Claim Line Number</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClaimLineCompositeKeyImpl extends EObjectImpl implements ClaimLineCompositeKey {
	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * The default value of the '{@link #getClaimLineNumber() <em>Claim Line Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClaimLineNumber() <em>Claim Line Number</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineNumber()
	 * @generated
	 * @ordered
	 */
	protected String claimLineNumber = CLAIM_LINE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClaimLineCompositeKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClaimPackage.Literals.CLAIM_LINE_COMPOSITE_KEY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Claim getClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM,
				oldClaim, claim));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClaimLineNumber() {
		return claimLineNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaimLineNumber(String newClaimLineNumber) {
		String oldClaimLineNumber = claimLineNumber;
		claimLineNumber = newClaimLineNumber;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
				ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER, oldClaimLineNumber, claimLineNumber));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM:
				return getClaim();
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER:
				return getClaimLineNumber();
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
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM:
				setClaim((Claim) newValue);
				return;
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER:
				setClaimLineNumber((String) newValue);
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
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM:
				setClaim((Claim) null);
				return;
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER:
				setClaimLineNumber(CLAIM_LINE_NUMBER_EDEFAULT);
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
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM:
				return claim != null;
			case ClaimPackage.CLAIM_LINE_COMPOSITE_KEY__CLAIM_LINE_NUMBER:
				return CLAIM_LINE_NUMBER_EDEFAULT == null ? claimLineNumber != null : !CLAIM_LINE_NUMBER_EDEFAULT
					.equals(claimLineNumber);
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (claimLineNumber: ");
		result.append(claimLineNumber);
		result.append(')');
		return result.toString();
	}

} // ClaimLineCompositeKeyImpl
