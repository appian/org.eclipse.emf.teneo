/**
 * <copyright>
 * </copyright>
 *
 * $Id: UKAddressImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UK Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.impl.UKAddressImpl#getPostcode <em>Postcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UKAddressImpl extends AddressImpl implements UKAddress {
	/**
	 * The default value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcode() <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected String postcode = POSTCODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UKAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InheritancemappingPackage.Literals.UK_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcode(String newPostcode) {
		String oldPostcode = postcode;
		postcode = newPostcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InheritancemappingPackage.UK_ADDRESS__POSTCODE, oldPostcode, postcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InheritancemappingPackage.UK_ADDRESS__POSTCODE:
				return getPostcode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InheritancemappingPackage.UK_ADDRESS__POSTCODE:
				setPostcode((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case InheritancemappingPackage.UK_ADDRESS__POSTCODE:
				setPostcode(POSTCODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InheritancemappingPackage.UK_ADDRESS__POSTCODE:
				return POSTCODE_EDEFAULT == null ? postcode != null : !POSTCODE_EDEFAULT.equals(postcode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (postcode: ");
		result.append(postcode);
		result.append(')');
		return result.toString();
	}

} //UKAddressImpl
