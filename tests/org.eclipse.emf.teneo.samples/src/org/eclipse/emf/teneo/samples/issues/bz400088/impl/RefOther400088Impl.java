/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package;
import org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088;
import org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Other400088</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.impl.RefOther400088Impl#getRefOther <em>Ref Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefOther400088Impl extends EObjectImpl implements RefOther400088 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefOther400088Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz400088Package.Literals.REF_OTHER400088;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ref400088 getRefOther() {
		if (eContainerFeatureID() != Bz400088Package.REF_OTHER400088__REF_OTHER) return null;
		return (Ref400088)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefOther(Ref400088 newRefOther, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRefOther, Bz400088Package.REF_OTHER400088__REF_OTHER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefOther(Ref400088 newRefOther) {
		if (newRefOther != eInternalContainer() || (eContainerFeatureID() != Bz400088Package.REF_OTHER400088__REF_OTHER && newRefOther != null)) {
			if (EcoreUtil.isAncestor(this, newRefOther))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefOther != null)
				msgs = ((InternalEObject)newRefOther).eInverseAdd(this, Bz400088Package.REF400088__REF, Ref400088.class, msgs);
			msgs = basicSetRefOther(newRefOther, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz400088Package.REF_OTHER400088__REF_OTHER, newRefOther, newRefOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRefOther((Ref400088)otherEnd, msgs);
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
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				return basicSetRefOther(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				return eInternalContainer().eInverseRemove(this, Bz400088Package.REF400088__REF, Ref400088.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				return getRefOther();
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
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				setRefOther((Ref400088)newValue);
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
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				setRefOther((Ref400088)null);
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
			case Bz400088Package.REF_OTHER400088__REF_OTHER:
				return getRefOther() != null;
		}
		return super.eIsSet(featureID);
	}

} //RefOther400088Impl
