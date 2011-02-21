/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestImpl.java,v 1.1 2011/02/21 06:40:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz337580.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package;
import org.eclipse.emf.teneo.samples.issues.bz337580.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz337580.impl.TestImpl#getNameWhichShouldBeTrunctated <em>Name Which Should Be Trunctated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends EObjectImpl implements Test {
	/**
	 * The default value of the '{@link #getNameWhichShouldBeTrunctated() <em>Name Which Should Be Trunctated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameWhichShouldBeTrunctated()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_WHICH_SHOULD_BE_TRUNCTATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameWhichShouldBeTrunctated() <em>Name Which Should Be Trunctated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameWhichShouldBeTrunctated()
	 * @generated
	 * @ordered
	 */
	protected String nameWhichShouldBeTrunctated = NAME_WHICH_SHOULD_BE_TRUNCTATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz337580Package.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameWhichShouldBeTrunctated() {
		return nameWhichShouldBeTrunctated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameWhichShouldBeTrunctated(String newNameWhichShouldBeTrunctated) {
		String oldNameWhichShouldBeTrunctated = nameWhichShouldBeTrunctated;
		nameWhichShouldBeTrunctated = newNameWhichShouldBeTrunctated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz337580Package.TEST__NAME_WHICH_SHOULD_BE_TRUNCTATED, oldNameWhichShouldBeTrunctated, nameWhichShouldBeTrunctated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz337580Package.TEST__NAME_WHICH_SHOULD_BE_TRUNCTATED:
				return getNameWhichShouldBeTrunctated();
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
			case Bz337580Package.TEST__NAME_WHICH_SHOULD_BE_TRUNCTATED:
				setNameWhichShouldBeTrunctated((String)newValue);
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
			case Bz337580Package.TEST__NAME_WHICH_SHOULD_BE_TRUNCTATED:
				setNameWhichShouldBeTrunctated(NAME_WHICH_SHOULD_BE_TRUNCTATED_EDEFAULT);
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
			case Bz337580Package.TEST__NAME_WHICH_SHOULD_BE_TRUNCTATED:
				return NAME_WHICH_SHOULD_BE_TRUNCTATED_EDEFAULT == null ? nameWhichShouldBeTrunctated != null : !NAME_WHICH_SHOULD_BE_TRUNCTATED_EDEFAULT.equals(nameWhichShouldBeTrunctated);
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
		result.append(" (nameWhichShouldBeTrunctated: ");
		result.append(nameWhichShouldBeTrunctated);
		result.append(')');
		return result.toString();
	}

} //TestImpl
