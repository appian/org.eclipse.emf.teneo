/**
 * <copyright>
 * </copyright>
 *
 * $Id: Sub2Impl.java,v 1.1 2009/10/14 22:19:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package;
import org.eclipse.emf.teneo.samples.issues.bz292151.Sub2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz292151.impl.Sub2Impl#getA1 <em>A1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Sub2Impl extends BaseImpl implements Sub2 {
	/**
	 * The cached value of the '{@link #getA1() <em>A1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA1()
	 * @generated
	 * @ordered
	 */
	protected EObject a1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sub2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz292151Package.Literals.SUB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getA1() {
		if (a1 != null && a1.eIsProxy()) {
			InternalEObject oldA1 = (InternalEObject)a1;
			a1 = eResolveProxy(oldA1);
			if (a1 != oldA1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz292151Package.SUB2__A1, oldA1, a1));
			}
		}
		return a1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetA1() {
		return a1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA1(EObject newA1) {
		EObject oldA1 = a1;
		a1 = newA1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz292151Package.SUB2__A1, oldA1, a1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz292151Package.SUB2__A1:
				if (resolve) return getA1();
				return basicGetA1();
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
			case Bz292151Package.SUB2__A1:
				setA1((EObject)newValue);
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
			case Bz292151Package.SUB2__A1:
				setA1((EObject)null);
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
			case Bz292151Package.SUB2__A1:
				return a1 != null;
		}
		return super.eIsSet(featureID);
	}

} //Sub2Impl
