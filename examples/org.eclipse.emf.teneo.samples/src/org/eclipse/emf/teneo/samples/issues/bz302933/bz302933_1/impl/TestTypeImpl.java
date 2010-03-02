/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestTypeImpl.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Package;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.NotTransientType;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.TransientType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl#getTransientReference <em>Transient Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl.TestTypeImpl#getNotTransientReference <em>Not Transient Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestTypeImpl extends EObjectImpl implements TestType {
	/**
	 * The cached value of the '{@link #getTransientReference() <em>Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientReference()
	 * @generated
	 * @ordered
	 */
	protected TransientType transientReference;

	/**
	 * The cached value of the '{@link #getNotTransientReference() <em>Not Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotTransientReference()
	 * @generated
	 * @ordered
	 */
	protected NotTransientType notTransientReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz302933_1Package.Literals.TEST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientType getTransientReference() {
		if (transientReference != null && transientReference.eIsProxy()) {
			InternalEObject oldTransientReference = (InternalEObject)transientReference;
			transientReference = (TransientType)eResolveProxy(oldTransientReference);
			if (transientReference != oldTransientReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE, oldTransientReference, transientReference));
			}
		}
		return transientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientType basicGetTransientReference() {
		return transientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientReference(TransientType newTransientReference) {
		TransientType oldTransientReference = transientReference;
		transientReference = newTransientReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE, oldTransientReference, transientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTransientType getNotTransientReference() {
		if (notTransientReference != null && notTransientReference.eIsProxy()) {
			InternalEObject oldNotTransientReference = (InternalEObject)notTransientReference;
			notTransientReference = (NotTransientType)eResolveProxy(oldNotTransientReference);
			if (notTransientReference != oldNotTransientReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE, oldNotTransientReference, notTransientReference));
			}
		}
		return notTransientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTransientType basicGetNotTransientReference() {
		return notTransientReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotTransientReference(NotTransientType newNotTransientReference) {
		NotTransientType oldNotTransientReference = notTransientReference;
		notTransientReference = newNotTransientReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE, oldNotTransientReference, notTransientReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE:
				if (resolve) return getTransientReference();
				return basicGetTransientReference();
			case Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE:
				if (resolve) return getNotTransientReference();
				return basicGetNotTransientReference();
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
			case Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE:
				setTransientReference((TransientType)newValue);
				return;
			case Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE:
				setNotTransientReference((NotTransientType)newValue);
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
			case Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE:
				setTransientReference((TransientType)null);
				return;
			case Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE:
				setNotTransientReference((NotTransientType)null);
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
			case Bz302933_1Package.TEST_TYPE__TRANSIENT_REFERENCE:
				return transientReference != null;
			case Bz302933_1Package.TEST_TYPE__NOT_TRANSIENT_REFERENCE:
				return notTransientReference != null;
		}
		return super.eIsSet(featureID);
	}

} //TestTypeImpl
