/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimCompositeKeyImpl.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl#getClaimNumber <em>Claim Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimCompositeKeyImpl#getClaimExtensionNumber <em>Claim Extension Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimCompositeKeyImpl extends EObjectImpl implements ClaimCompositeKey {
	/**
	 * The default value of the '{@link #getClaimNumber() <em>Claim Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClaimNumber() <em>Claim Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimNumber()
	 * @generated
	 * @ordered
	 */
	protected String claimNumber = CLAIM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getClaimExtensionNumber() <em>Claim Extension Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimExtensionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_EXTENSION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClaimExtensionNumber() <em>Claim Extension Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimExtensionNumber()
	 * @generated
	 * @ordered
	 */
	protected String claimExtensionNumber = CLAIM_EXTENSION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimCompositeKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClaimPackage.Literals.CLAIM_COMPOSITE_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClaimNumber() {
		return claimNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimNumber(String newClaimNumber) {
		String oldClaimNumber = claimNumber;
		claimNumber = newClaimNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_NUMBER, oldClaimNumber, claimNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClaimExtensionNumber() {
		return claimExtensionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimExtensionNumber(String newClaimExtensionNumber) {
		String oldClaimExtensionNumber = claimExtensionNumber;
		claimExtensionNumber = newClaimExtensionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER, oldClaimExtensionNumber, claimExtensionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_NUMBER:
				return getClaimNumber();
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER:
				return getClaimExtensionNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_NUMBER:
				setClaimNumber((String)newValue);
				return;
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER:
				setClaimExtensionNumber((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_NUMBER:
				setClaimNumber(CLAIM_NUMBER_EDEFAULT);
				return;
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER:
				setClaimExtensionNumber(CLAIM_EXTENSION_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_NUMBER:
				return CLAIM_NUMBER_EDEFAULT == null ? claimNumber != null : !CLAIM_NUMBER_EDEFAULT.equals(claimNumber);
			case ClaimPackage.CLAIM_COMPOSITE_KEY__CLAIM_EXTENSION_NUMBER:
				return CLAIM_EXTENSION_NUMBER_EDEFAULT == null ? claimExtensionNumber != null : !CLAIM_EXTENSION_NUMBER_EDEFAULT.equals(claimExtensionNumber);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (claimNumber: ");
		result.append(claimNumber);
		result.append(", claimExtensionNumber: ");
		result.append(claimExtensionNumber);
		result.append(')');
		return result.toString();
	}

} //ClaimCompositeKeyImpl
