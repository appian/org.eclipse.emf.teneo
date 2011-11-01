/**
 * <copyright>
 * </copyright>
 *
 * $Id: BarImpl.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz282414.Bar;
import org.eclipse.emf.teneo.samples.issues.bz282414.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.impl.BarImpl#getBarKey <em>Bar Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarImpl extends EObjectImpl implements Bar {
	/**
	 * The cached value of the '{@link #getBarKey() <em>Bar Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarKey()
	 * @generated
	 * @ordered
	 */
	protected BarKey barKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz282414Package.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarKey getBarKey() {
		return barKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBarKey(BarKey newBarKey, NotificationChain msgs) {
		BarKey oldBarKey = barKey;
		barKey = newBarKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz282414Package.BAR__BAR_KEY, oldBarKey, newBarKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarKey(BarKey newBarKey) {
		if (newBarKey != barKey) {
			NotificationChain msgs = null;
			if (barKey != null)
				msgs = ((InternalEObject)barKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bz282414Package.BAR__BAR_KEY, null, msgs);
			if (newBarKey != null)
				msgs = ((InternalEObject)newBarKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bz282414Package.BAR__BAR_KEY, null, msgs);
			msgs = basicSetBarKey(newBarKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz282414Package.BAR__BAR_KEY, newBarKey, newBarKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz282414Package.BAR__BAR_KEY:
				return basicSetBarKey(null, msgs);
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
			case Bz282414Package.BAR__BAR_KEY:
				return getBarKey();
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
			case Bz282414Package.BAR__BAR_KEY:
				setBarKey((BarKey)newValue);
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
			case Bz282414Package.BAR__BAR_KEY:
				setBarKey((BarKey)null);
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
			case Bz282414Package.BAR__BAR_KEY:
				return barKey != null;
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
