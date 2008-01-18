/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimLineImpl.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.emf.sample.claim.Claim;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLineCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Line</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl#getClaim <em>Claim</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl#getClaimLineCompositeKey <em>Claim Line Composite Key</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl#getClaimLineBilledAmount <em>Claim Line Billed Amount</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl#getServiceCode <em>Service Code</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimLineImpl#getClaimLineStatus <em>Claim Line Status</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClaimLineImpl extends EObjectImpl implements ClaimLine {
	/**
	 * The cached value of the '{@link #getClaimLineCompositeKey() <em>Claim Line Composite Key</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineCompositeKey()
	 * @generated
	 * @ordered
	 */
	protected ClaimLineCompositeKey claimLineCompositeKey;

	/**
	 * The default value of the '{@link #getClaimLineBilledAmount() <em>Claim Line Billed Amount</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineBilledAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLAIM_LINE_BILLED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClaimLineBilledAmount() <em>Claim Line Billed Amount</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineBilledAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal claimLineBilledAmount = CLAIM_LINE_BILLED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceCode() <em>Service Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceCode() <em>Service Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceCode()
	 * @generated
	 * @ordered
	 */
	protected String serviceCode = SERVICE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClaimLineStatus() <em>Claim Line Status</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_LINE_STATUS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClaimLineStatus() <em>Claim Line Status</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClaimLineStatus()
	 * @generated
	 * @ordered
	 */
	protected String claimLineStatus = CLAIM_LINE_STATUS_EDEFAULT;

	/**
	 * This is true if the Claim Line Status attribute has been set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean claimLineStatusESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClaimLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClaimPackage.Literals.CLAIM_LINE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Claim getClaim() {
		if (eContainerFeatureID != ClaimPackage.CLAIM_LINE__CLAIM) {
			return null;
		}
		return (Claim) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newClaim, ClaimPackage.CLAIM_LINE__CLAIM, msgs);
		getClaimLineCompositeKey().setClaim(newClaim);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		if (newClaim != eInternalContainer() ||
				(eContainerFeatureID != ClaimPackage.CLAIM_LINE__CLAIM && newClaim != null)) {
			if (EcoreUtil.isAncestor(this, newClaim)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newClaim != null) {
				msgs =
						((InternalEObject) newClaim).eInverseAdd(this, ClaimPackage.CLAIM__CLAIM_LINE, Claim.class,
							msgs);
			}
			msgs = basicSetClaim(newClaim, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__CLAIM, newClaim, newClaim));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClaimLineCompositeKey getClaimLineCompositeKey() {
		return claimLineCompositeKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetClaimLineCompositeKey(ClaimLineCompositeKey newClaimLineCompositeKey,
			NotificationChain msgs) {
		ClaimLineCompositeKey oldClaimLineCompositeKey = claimLineCompositeKey;
		claimLineCompositeKey = newClaimLineCompositeKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification =
					new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY,
						oldClaimLineCompositeKey, newClaimLineCompositeKey);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaimLineCompositeKey(ClaimLineCompositeKey newClaimLineCompositeKey) {
		if (newClaimLineCompositeKey != claimLineCompositeKey) {
			NotificationChain msgs = null;
			if (claimLineCompositeKey != null) {
				msgs =
						((InternalEObject) claimLineCompositeKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
								ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY, null, msgs);
			}
			if (newClaimLineCompositeKey != null) {
				msgs =
						((InternalEObject) newClaimLineCompositeKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
								ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY, null, msgs);
			}
			msgs = basicSetClaimLineCompositeKey(newClaimLineCompositeKey, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY,
				newClaimLineCompositeKey, newClaimLineCompositeKey));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigDecimal getClaimLineBilledAmount() {
		return claimLineBilledAmount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaimLineBilledAmount(BigDecimal newClaimLineBilledAmount) {
		BigDecimal oldClaimLineBilledAmount = claimLineBilledAmount;
		claimLineBilledAmount = newClaimLineBilledAmount;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT,
				oldClaimLineBilledAmount, claimLineBilledAmount));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setServiceCode(String newServiceCode) {
		String oldServiceCode = serviceCode;
		serviceCode = newServiceCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__SERVICE_CODE,
				oldServiceCode, serviceCode));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClaimLineStatus() {
		return claimLineStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClaimLineStatus(String newClaimLineStatus) {
		String oldClaimLineStatus = claimLineStatus;
		claimLineStatus = newClaimLineStatus;
		boolean oldClaimLineStatusESet = claimLineStatusESet;
		claimLineStatusESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS,
				oldClaimLineStatus, claimLineStatus, !oldClaimLineStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetClaimLineStatus() {
		String oldClaimLineStatus = claimLineStatus;
		boolean oldClaimLineStatusESet = claimLineStatusESet;
		claimLineStatus = CLAIM_LINE_STATUS_EDEFAULT;
		claimLineStatusESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS,
				oldClaimLineStatus, CLAIM_LINE_STATUS_EDEFAULT, oldClaimLineStatusESet));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetClaimLineStatus() {
		return claimLineStatusESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClaimPackage.CLAIM_LINE__CLAIM:
				if (eInternalContainer() != null) {
					msgs = eBasicRemoveFromContainer(msgs);
				}
				return basicSetClaim((Claim) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClaimPackage.CLAIM_LINE__CLAIM:
				return basicSetClaim(null, msgs);
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY:
				return basicSetClaimLineCompositeKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case ClaimPackage.CLAIM_LINE__CLAIM:
				return eInternalContainer().eInverseRemove(this, ClaimPackage.CLAIM__CLAIM_LINE, Claim.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClaimPackage.CLAIM_LINE__CLAIM:
				return getClaim();
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY:
				return getClaimLineCompositeKey();
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT:
				return getClaimLineBilledAmount();
			case ClaimPackage.CLAIM_LINE__SERVICE_CODE:
				return getServiceCode();
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS:
				return getClaimLineStatus();
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
			case ClaimPackage.CLAIM_LINE__CLAIM:
				setClaim((Claim) newValue);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY:
				setClaimLineCompositeKey((ClaimLineCompositeKey) newValue);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT:
				setClaimLineBilledAmount((BigDecimal) newValue);
				return;
			case ClaimPackage.CLAIM_LINE__SERVICE_CODE:
				setServiceCode((String) newValue);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS:
				setClaimLineStatus((String) newValue);
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
			case ClaimPackage.CLAIM_LINE__CLAIM:
				setClaim((Claim) null);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY:
				setClaimLineCompositeKey((ClaimLineCompositeKey) null);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT:
				setClaimLineBilledAmount(CLAIM_LINE_BILLED_AMOUNT_EDEFAULT);
				return;
			case ClaimPackage.CLAIM_LINE__SERVICE_CODE:
				setServiceCode(SERVICE_CODE_EDEFAULT);
				return;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS:
				unsetClaimLineStatus();
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
			case ClaimPackage.CLAIM_LINE__CLAIM:
				return getClaim() != null;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_COMPOSITE_KEY:
				return claimLineCompositeKey != null;
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_BILLED_AMOUNT:
				return CLAIM_LINE_BILLED_AMOUNT_EDEFAULT == null ? claimLineBilledAmount != null
						: !CLAIM_LINE_BILLED_AMOUNT_EDEFAULT.equals(claimLineBilledAmount);
			case ClaimPackage.CLAIM_LINE__SERVICE_CODE:
				return SERVICE_CODE_EDEFAULT == null ? serviceCode != null : !SERVICE_CODE_EDEFAULT.equals(serviceCode);
			case ClaimPackage.CLAIM_LINE__CLAIM_LINE_STATUS:
				return isSetClaimLineStatus();
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
		result.append(" (claimLineBilledAmount: ");
		result.append(claimLineBilledAmount);
		result.append(", serviceCode: ");
		result.append(serviceCode);
		result.append(", claimLineStatus: ");
		if (claimLineStatusESet) {
			result.append(claimLineStatus);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ClaimLineImpl
