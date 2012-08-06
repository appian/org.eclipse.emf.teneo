/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz386607.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz386607.Bar;
import org.eclipse.emf.teneo.samples.issues.bz386607.Bz386607Package;
import org.eclipse.emf.teneo.samples.issues.bz386607.Foo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz386607.impl.BarImpl#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BarImpl extends EObjectImpl implements Bar {
	/**
	 * The cached value of the '{@link #getFoo() <em>Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoo()
	 * @generated
	 * @ordered
	 */
	protected Foo foo;

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
		return Bz386607Package.Literals.BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo getFoo() {
		if (foo != null && foo.eIsProxy()) {
			InternalEObject oldFoo = (InternalEObject)foo;
			foo = (Foo)eResolveProxy(oldFoo);
			if (foo != oldFoo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz386607Package.BAR__FOO, oldFoo, foo));
			}
		}
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo basicGetFoo() {
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoo(Foo newFoo) {
		Foo oldFoo = foo;
		foo = newFoo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz386607Package.BAR__FOO, oldFoo, foo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz386607Package.BAR__FOO:
				if (resolve) return getFoo();
				return basicGetFoo();
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
			case Bz386607Package.BAR__FOO:
				setFoo((Foo)newValue);
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
			case Bz386607Package.BAR__FOO:
				setFoo((Foo)null);
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
			case Bz386607Package.BAR__FOO:
				return foo != null;
		}
		return super.eIsSet(featureID);
	}

} //BarImpl
