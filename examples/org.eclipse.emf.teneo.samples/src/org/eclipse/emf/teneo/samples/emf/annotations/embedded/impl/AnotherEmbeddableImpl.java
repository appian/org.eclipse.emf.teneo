/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnotherEmbeddableImpl.java,v 1.1 2008/04/16 21:08:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Another Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.AnotherEmbeddableImpl#getAnotherName <em>Another Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnotherEmbeddableImpl extends AlsoEmbeddableImpl implements AnotherEmbeddable {
	/**
	 * The default value of the '{@link #getAnotherName() <em>Another Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotherName()
	 * @generated
	 * @ordered
	 */
	protected static final String ANOTHER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnotherName() <em>Another Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotherName()
	 * @generated
	 * @ordered
	 */
	protected String anotherName = ANOTHER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnotherEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedPackage.Literals.ANOTHER_EMBEDDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnotherName() {
		return anotherName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnotherName(String newAnotherName) {
		String oldAnotherName = anotherName;
		anotherName = newAnotherName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME, oldAnotherName, anotherName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				return getAnotherName();
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				setAnotherName((String)newValue);
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				setAnotherName(ANOTHER_NAME_EDEFAULT);
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
			case EmbeddedPackage.ANOTHER_EMBEDDABLE__ANOTHER_NAME:
				return ANOTHER_NAME_EDEFAULT == null ? anotherName != null : !ANOTHER_NAME_EDEFAULT.equals(anotherName);
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
		result.append(" (anotherName: ");
		result.append(anotherName);
		result.append(')');
		return result.toString();
	}

} //AnotherEmbeddableImpl
