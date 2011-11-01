/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecificCustomerImpl.java,v 1.1 2007/11/15 14:48:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.SpecificCustomer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.SpecificCustomerImpl#getSpecificName <em>Specific Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificCustomerImpl extends CustomerImpl implements SpecificCustomer {
	/**
	 * The default value of the '{@link #getSpecificName() <em>Specific Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificName() <em>Specific Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificName()
	 * @generated
	 * @ordered
	 */
	protected String specificName = SPECIFIC_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificCustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InheritancemappingPackage.Literals.SPECIFIC_CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecificName() {
		return specificName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificName(String newSpecificName) {
		String oldSpecificName = specificName;
		specificName = newSpecificName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InheritancemappingPackage.SPECIFIC_CUSTOMER__SPECIFIC_NAME, oldSpecificName, specificName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InheritancemappingPackage.SPECIFIC_CUSTOMER__SPECIFIC_NAME:
				return getSpecificName();
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
			case InheritancemappingPackage.SPECIFIC_CUSTOMER__SPECIFIC_NAME:
				setSpecificName((String)newValue);
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
			case InheritancemappingPackage.SPECIFIC_CUSTOMER__SPECIFIC_NAME:
				setSpecificName(SPECIFIC_NAME_EDEFAULT);
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
			case InheritancemappingPackage.SPECIFIC_CUSTOMER__SPECIFIC_NAME:
				return SPECIFIC_NAME_EDEFAULT == null ? specificName != null : !SPECIFIC_NAME_EDEFAULT.equals(specificName);
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
		result.append(" (specificName: ");
		result.append(specificName);
		result.append(')');
		return result.toString();
	}

} //SpecificCustomerImpl
