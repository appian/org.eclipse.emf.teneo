/**
 * <copyright>
 * </copyright>
 *
 * $Id: FooImpl.java,v 1.1 2009/10/02 07:47:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz290969.BarKey;
import org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package;
import org.eclipse.emf.teneo.samples.issues.bz290969.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz290969.impl.FooImpl#getBarKey <em>Bar Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FooImpl extends EObjectImpl implements Foo {
	/**
	 * The cached value of the '{@link #getBarKey() <em>Bar Key</em>}' reference.
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
	protected FooImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz290969Package.Literals.FOO;
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
	public void setBarKey(BarKey newBarKey) {
		BarKey oldBarKey = barKey;
		barKey = newBarKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz290969Package.FOO__BAR_KEY, oldBarKey, barKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz290969Package.FOO__BAR_KEY:
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
			case Bz290969Package.FOO__BAR_KEY:
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
			case Bz290969Package.FOO__BAR_KEY:
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
			case Bz290969Package.FOO__BAR_KEY:
				return barKey != null;
		}
		return super.eIsSet(featureID);
	}

} //FooImpl
