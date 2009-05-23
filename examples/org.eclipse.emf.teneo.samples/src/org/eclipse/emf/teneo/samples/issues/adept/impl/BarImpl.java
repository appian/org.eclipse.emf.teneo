/**
 * <copyright>
 * </copyright>
 *
 * $Id: BarImpl.java,v 1.2 2009/05/23 13:57:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.adept.Bar;
import org.eclipse.emf.teneo.samples.issues.adept.Baz;
import org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.impl.BarImpl#getBaz <em>Baz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarImpl extends BazImpl implements Bar {
	/**
	 * The cached value of the '{@link #getBaz() <em>Baz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaz()
	 * @generated
	 * @ordered
	 */
	protected Baz baz;

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
		return Bz277570Package.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baz getBaz() {
		if (baz != null && baz.eIsProxy()) {
			InternalEObject oldBaz = (InternalEObject)baz;
			baz = (Baz)eResolveProxy(oldBaz);
			if (baz != oldBaz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz277570Package.BAR__BAZ, oldBaz, baz));
			}
		}
		return baz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Baz basicGetBaz() {
		return baz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaz(Baz newBaz) {
		Baz oldBaz = baz;
		baz = newBaz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz277570Package.BAR__BAZ, oldBaz, baz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz277570Package.BAR__BAZ:
				if (resolve) return getBaz();
				return basicGetBaz();
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
			case Bz277570Package.BAR__BAZ:
				setBaz((Baz)newValue);
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
			case Bz277570Package.BAR__BAZ:
				setBaz((Baz)null);
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
			case Bz277570Package.BAR__BAZ:
				return baz != null;
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
