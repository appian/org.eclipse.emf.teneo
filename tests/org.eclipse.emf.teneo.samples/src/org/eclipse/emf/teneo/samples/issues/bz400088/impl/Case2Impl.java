/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case1;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl#getCase1 <em>Case1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case2Impl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Case2Impl extends EObjectImpl implements Case2 {
	/**
	 * The cached value of the '{@link #getCase1() <em>Case1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase1()
	 * @generated
	 * @ordered
	 */
	protected Case1 case1;

	/**
	 * The default value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsId()
	 * @generated
	 * @ordered
	 */
	protected static final Long BDS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsId()
	 * @generated
	 * @ordered
	 */
	protected Long bdsId = BDS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Long BDS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBdsVersion()
	 * @generated
	 * @ordered
	 */
	protected Long bdsVersion = BDS_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Case2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz400088Package.Literals.CASE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case1 getCase1() {
		if (case1 != null && case1.eIsProxy()) {
			InternalEObject oldCase1 = (InternalEObject)case1;
			case1 = (Case1)eResolveProxy(oldCase1);
			if (case1 != oldCase1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz400088Package.CASE2__CASE1, oldCase1, case1));
			}
		}
		return case1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case1 basicGetCase1() {
		return case1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCase1(Case1 newCase1, NotificationChain msgs) {
		Case1 oldCase1 = case1;
		case1 = newCase1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE2__CASE1, oldCase1, newCase1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCase1(Case1 newCase1) {
		if (newCase1 != case1) {
			NotificationChain msgs = null;
			if (case1 != null)
				msgs = ((InternalEObject)case1).eInverseRemove(this, Bz400088Package.CASE1__CASE2, Case1.class, msgs);
			if (newCase1 != null)
				msgs = ((InternalEObject)newCase1).eInverseAdd(this, Bz400088Package.CASE1__CASE2, Case1.class, msgs);
			msgs = basicSetCase1(newCase1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE2__CASE1, newCase1, newCase1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBdsId() {
		return bdsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBdsId(Long newBdsId) {
		Long oldBdsId = bdsId;
		bdsId = newBdsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE2__BDS_ID, oldBdsId, bdsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBdsVersion() {
		return bdsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBdsVersion(Long newBdsVersion) {
		Long oldBdsVersion = bdsVersion;
		bdsVersion = newBdsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE2__BDS_VERSION, oldBdsVersion, bdsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz400088Package.CASE2__CASE1:
				if (case1 != null)
					msgs = ((InternalEObject)case1).eInverseRemove(this, Bz400088Package.CASE1__CASE2, Case1.class, msgs);
				return basicSetCase1((Case1)otherEnd, msgs);
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
			case Bz400088Package.CASE2__CASE1:
				return basicSetCase1(null, msgs);
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
			case Bz400088Package.CASE2__CASE1:
				if (resolve) return getCase1();
				return basicGetCase1();
			case Bz400088Package.CASE2__BDS_ID:
				return getBdsId();
			case Bz400088Package.CASE2__BDS_VERSION:
				return getBdsVersion();
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
			case Bz400088Package.CASE2__CASE1:
				setCase1((Case1)newValue);
				return;
			case Bz400088Package.CASE2__BDS_ID:
				setBdsId((Long)newValue);
				return;
			case Bz400088Package.CASE2__BDS_VERSION:
				setBdsVersion((Long)newValue);
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
			case Bz400088Package.CASE2__CASE1:
				setCase1((Case1)null);
				return;
			case Bz400088Package.CASE2__BDS_ID:
				setBdsId(BDS_ID_EDEFAULT);
				return;
			case Bz400088Package.CASE2__BDS_VERSION:
				setBdsVersion(BDS_VERSION_EDEFAULT);
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
			case Bz400088Package.CASE2__CASE1:
				return case1 != null;
			case Bz400088Package.CASE2__BDS_ID:
				return BDS_ID_EDEFAULT == null ? bdsId != null : !BDS_ID_EDEFAULT.equals(bdsId);
			case Bz400088Package.CASE2__BDS_VERSION:
				return BDS_VERSION_EDEFAULT == null ? bdsVersion != null : !BDS_VERSION_EDEFAULT.equals(bdsVersion);
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
		result.append(" (bdsId: ");
		result.append(bdsId);
		result.append(", bdsVersion: ");
		result.append(bdsVersion);
		result.append(')');
		return result.toString();
	}

} //Case2Impl
