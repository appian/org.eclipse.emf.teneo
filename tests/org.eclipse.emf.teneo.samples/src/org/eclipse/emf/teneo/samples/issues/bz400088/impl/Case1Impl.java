/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case1;
import org.eclipse.emf.teneo.samples.issues.bz400088.Case2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl#getCase2 <em>Case2</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.Case1Impl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Case1Impl extends EObjectImpl implements Case1 {
	/**
	 * The cached value of the '{@link #getCase2() <em>Case2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCase2()
	 * @generated
	 * @ordered
	 */
	protected EList<Case2> case2;

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
	protected Case1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz400088Package.Literals.CASE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case2> getCase2() {
		if (case2 == null) {
			case2 = new EObjectWithInverseResolvingEList<Case2>(Case2.class, this, Bz400088Package.CASE1__CASE2, Bz400088Package.CASE2__CASE1);
		}
		return case2;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE1__BDS_ID, oldBdsId, bdsId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.CASE1__BDS_VERSION, oldBdsVersion, bdsVersion));
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
			case Bz400088Package.CASE1__CASE2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCase2()).basicAdd(otherEnd, msgs);
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
			case Bz400088Package.CASE1__CASE2:
				return ((InternalEList<?>)getCase2()).basicRemove(otherEnd, msgs);
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
			case Bz400088Package.CASE1__CASE2:
				return getCase2();
			case Bz400088Package.CASE1__BDS_ID:
				return getBdsId();
			case Bz400088Package.CASE1__BDS_VERSION:
				return getBdsVersion();
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
			case Bz400088Package.CASE1__CASE2:
				getCase2().clear();
				getCase2().addAll((Collection<? extends Case2>)newValue);
				return;
			case Bz400088Package.CASE1__BDS_ID:
				setBdsId((Long)newValue);
				return;
			case Bz400088Package.CASE1__BDS_VERSION:
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
			case Bz400088Package.CASE1__CASE2:
				getCase2().clear();
				return;
			case Bz400088Package.CASE1__BDS_ID:
				setBdsId(BDS_ID_EDEFAULT);
				return;
			case Bz400088Package.CASE1__BDS_VERSION:
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
			case Bz400088Package.CASE1__CASE2:
				return case2 != null && !case2.isEmpty();
			case Bz400088Package.CASE1__BDS_ID:
				return BDS_ID_EDEFAULT == null ? bdsId != null : !BDS_ID_EDEFAULT.equals(bdsId);
			case Bz400088Package.CASE1__BDS_VERSION:
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

} //Case1Impl
