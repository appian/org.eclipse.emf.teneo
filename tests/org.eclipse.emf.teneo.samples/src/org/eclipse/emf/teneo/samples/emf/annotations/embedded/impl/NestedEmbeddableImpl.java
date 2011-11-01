/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedEmbeddableImpl.java,v 1.1 2010/04/23 08:52:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.embedded.NestedEmbeddable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Embeddable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.NestedEmbeddableImpl#getNestedName <em>Nested Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedEmbeddableImpl extends EObjectImpl implements NestedEmbeddable {
	/**
	 * The default value of the '{@link #getNestedName() <em>Nested Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedName()
	 * @generated
	 * @ordered
	 */
	protected static final String NESTED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNestedName() <em>Nested Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedName()
	 * @generated
	 * @ordered
	 */
	protected String nestedName = NESTED_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedEmbeddableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmbeddedPackage.Literals.NESTED_EMBEDDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNestedName() {
		return nestedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedName(String newNestedName) {
		String oldNestedName = nestedName;
		nestedName = newNestedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmbeddedPackage.NESTED_EMBEDDABLE__NESTED_NAME, oldNestedName, nestedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmbeddedPackage.NESTED_EMBEDDABLE__NESTED_NAME:
				return getNestedName();
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
			case EmbeddedPackage.NESTED_EMBEDDABLE__NESTED_NAME:
				setNestedName((String)newValue);
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
			case EmbeddedPackage.NESTED_EMBEDDABLE__NESTED_NAME:
				setNestedName(NESTED_NAME_EDEFAULT);
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
			case EmbeddedPackage.NESTED_EMBEDDABLE__NESTED_NAME:
				return NESTED_NAME_EDEFAULT == null ? nestedName != null : !NESTED_NAME_EDEFAULT.equals(nestedName);
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
		result.append(" (nestedName: ");
		result.append(nestedName);
		result.append(')');
		return result.toString();
	}

} //NestedEmbeddableImpl
