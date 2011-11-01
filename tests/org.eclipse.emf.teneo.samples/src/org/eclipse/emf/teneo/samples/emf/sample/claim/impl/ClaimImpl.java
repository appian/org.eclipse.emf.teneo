/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClaimImpl.java,v 1.1 2008/01/18 06:20:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.claim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.claim.Claim;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimCompositeKey;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimLine;
import org.eclipse.emf.teneo.samples.emf.sample.claim.ClaimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl#getClaimCompositeKey <em>Claim Composite Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl#getBillingName <em>Billing Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl#getClaimGroupVSPId <em>Claim Group VSP Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl#getClaimStatus <em>Claim Status</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.claim.impl.ClaimImpl#getClaimLine <em>Claim Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends EObjectImpl implements Claim {
	/**
	 * The cached value of the '{@link #getClaimCompositeKey() <em>Claim Composite Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimCompositeKey()
	 * @generated
	 * @ordered
	 */
	protected ClaimCompositeKey claimCompositeKey;

	/**
	 * The default value of the '{@link #getBillingName() <em>Billing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBillingName() <em>Billing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingName()
	 * @generated
	 * @ordered
	 */
	protected String billingName = BILLING_NAME_EDEFAULT;

	/**
	 * This is true if the Billing Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean billingNameESet;

	/**
	 * The default value of the '{@link #getClaimGroupVSPId() <em>Claim Group VSP Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimGroupVSPId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_GROUP_VSP_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClaimGroupVSPId() <em>Claim Group VSP Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimGroupVSPId()
	 * @generated
	 * @ordered
	 */
	protected String claimGroupVSPId = CLAIM_GROUP_VSP_ID_EDEFAULT;

	/**
	 * This is true if the Claim Group VSP Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean claimGroupVSPIdESet;

	/**
	 * The default value of the '{@link #getClaimStatus() <em>Claim Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String CLAIM_STATUS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getClaimStatus() <em>Claim Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimStatus()
	 * @generated
	 * @ordered
	 */
	protected String claimStatus = CLAIM_STATUS_EDEFAULT;

	/**
	 * This is true if the Claim Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean claimStatusESet;

	/**
	 * The cached value of the '{@link #getClaimLine() <em>Claim Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimLine()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimLine> claimLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClaimPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimCompositeKey getClaimCompositeKey() {
		return claimCompositeKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimCompositeKey(ClaimCompositeKey newClaimCompositeKey, NotificationChain msgs) {
		ClaimCompositeKey oldClaimCompositeKey = claimCompositeKey;
		claimCompositeKey = newClaimCompositeKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY, oldClaimCompositeKey, newClaimCompositeKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimCompositeKey(ClaimCompositeKey newClaimCompositeKey) {
		if (newClaimCompositeKey != claimCompositeKey) {
			NotificationChain msgs = null;
			if (claimCompositeKey != null)
				msgs = ((InternalEObject)claimCompositeKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY, null, msgs);
			if (newClaimCompositeKey != null)
				msgs = ((InternalEObject)newClaimCompositeKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY, null, msgs);
			msgs = basicSetClaimCompositeKey(newClaimCompositeKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY, newClaimCompositeKey, newClaimCompositeKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillingName() {
		return billingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillingName(String newBillingName) {
		String oldBillingName = billingName;
		billingName = newBillingName;
		boolean oldBillingNameESet = billingNameESet;
		billingNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM__BILLING_NAME, oldBillingName, billingName, !oldBillingNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBillingName() {
		String oldBillingName = billingName;
		boolean oldBillingNameESet = billingNameESet;
		billingName = BILLING_NAME_EDEFAULT;
		billingNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClaimPackage.CLAIM__BILLING_NAME, oldBillingName, BILLING_NAME_EDEFAULT, oldBillingNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBillingName() {
		return billingNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClaimGroupVSPId() {
		return claimGroupVSPId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimGroupVSPId(String newClaimGroupVSPId) {
		String oldClaimGroupVSPId = claimGroupVSPId;
		claimGroupVSPId = newClaimGroupVSPId;
		boolean oldClaimGroupVSPIdESet = claimGroupVSPIdESet;
		claimGroupVSPIdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID, oldClaimGroupVSPId, claimGroupVSPId, !oldClaimGroupVSPIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClaimGroupVSPId() {
		String oldClaimGroupVSPId = claimGroupVSPId;
		boolean oldClaimGroupVSPIdESet = claimGroupVSPIdESet;
		claimGroupVSPId = CLAIM_GROUP_VSP_ID_EDEFAULT;
		claimGroupVSPIdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID, oldClaimGroupVSPId, CLAIM_GROUP_VSP_ID_EDEFAULT, oldClaimGroupVSPIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClaimGroupVSPId() {
		return claimGroupVSPIdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClaimStatus() {
		return claimStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimStatus(String newClaimStatus) {
		String oldClaimStatus = claimStatus;
		claimStatus = newClaimStatus;
		boolean oldClaimStatusESet = claimStatusESet;
		claimStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaimPackage.CLAIM__CLAIM_STATUS, oldClaimStatus, claimStatus, !oldClaimStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClaimStatus() {
		String oldClaimStatus = claimStatus;
		boolean oldClaimStatusESet = claimStatusESet;
		claimStatus = CLAIM_STATUS_EDEFAULT;
		claimStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ClaimPackage.CLAIM__CLAIM_STATUS, oldClaimStatus, CLAIM_STATUS_EDEFAULT, oldClaimStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClaimStatus() {
		return claimStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimLine> getClaimLine() {
		if (claimLine == null) {
			claimLine = new EObjectContainmentWithInverseEList<ClaimLine>(ClaimLine.class, this, ClaimPackage.CLAIM__CLAIM_LINE, ClaimPackage.CLAIM_LINE__CLAIM);
		}
		return claimLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClaimPackage.CLAIM__CLAIM_LINE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClaimLine()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY:
				return basicSetClaimCompositeKey(null, msgs);
			case ClaimPackage.CLAIM__CLAIM_LINE:
				return ((InternalEList<?>)getClaimLine()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY:
				return getClaimCompositeKey();
			case ClaimPackage.CLAIM__BILLING_NAME:
				return getBillingName();
			case ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID:
				return getClaimGroupVSPId();
			case ClaimPackage.CLAIM__CLAIM_STATUS:
				return getClaimStatus();
			case ClaimPackage.CLAIM__CLAIM_LINE:
				return getClaimLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY:
				setClaimCompositeKey((ClaimCompositeKey)newValue);
				return;
			case ClaimPackage.CLAIM__BILLING_NAME:
				setBillingName((String)newValue);
				return;
			case ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID:
				setClaimGroupVSPId((String)newValue);
				return;
			case ClaimPackage.CLAIM__CLAIM_STATUS:
				setClaimStatus((String)newValue);
				return;
			case ClaimPackage.CLAIM__CLAIM_LINE:
				getClaimLine().clear();
				getClaimLine().addAll((Collection<? extends ClaimLine>)newValue);
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
			case ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY:
				setClaimCompositeKey((ClaimCompositeKey)null);
				return;
			case ClaimPackage.CLAIM__BILLING_NAME:
				unsetBillingName();
				return;
			case ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID:
				unsetClaimGroupVSPId();
				return;
			case ClaimPackage.CLAIM__CLAIM_STATUS:
				unsetClaimStatus();
				return;
			case ClaimPackage.CLAIM__CLAIM_LINE:
				getClaimLine().clear();
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
			case ClaimPackage.CLAIM__CLAIM_COMPOSITE_KEY:
				return claimCompositeKey != null;
			case ClaimPackage.CLAIM__BILLING_NAME:
				return isSetBillingName();
			case ClaimPackage.CLAIM__CLAIM_GROUP_VSP_ID:
				return isSetClaimGroupVSPId();
			case ClaimPackage.CLAIM__CLAIM_STATUS:
				return isSetClaimStatus();
			case ClaimPackage.CLAIM__CLAIM_LINE:
				return claimLine != null && !claimLine.isEmpty();
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
		result.append(" (billingName: ");
		if (billingNameESet) result.append(billingName); else result.append("<unset>");
		result.append(", claimGroupVSPId: ");
		if (claimGroupVSPIdESet) result.append(claimGroupVSPId); else result.append("<unset>");
		result.append(", claimStatus: ");
		if (claimStatusESet) result.append(claimStatus); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClaimImpl
