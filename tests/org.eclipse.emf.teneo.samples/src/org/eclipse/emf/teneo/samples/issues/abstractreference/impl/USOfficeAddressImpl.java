/**
 * <copyright>
 * </copyright>
 *
 * $Id: USOfficeAddressImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractreference.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.abstractreference.AbstractreferencePackage;
import org.eclipse.emf.teneo.samples.issues.abstractreference.USOfficeAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>US Office Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.abstractreference.impl.USOfficeAddressImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class USOfficeAddressImpl extends USAddressImpl implements USOfficeAddress {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USOfficeAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AbstractreferencePackage.eINSTANCE.getUSOfficeAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractreferencePackage.US_OFFICE_ADDRESS__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AbstractreferencePackage.US_OFFICE_ADDRESS__NAME:
				return getName();
			case AbstractreferencePackage.US_OFFICE_ADDRESS__COUNTRY:
				return getCountry();
			case AbstractreferencePackage.US_OFFICE_ADDRESS__STATE:
				return getState();
			case AbstractreferencePackage.US_OFFICE_ADDRESS__LOCATION:
				return getLocation();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AbstractreferencePackage.US_OFFICE_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__COUNTRY:
				getCountry().clear();
				getCountry().addAll((Collection)newValue);
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__STATE:
				setState((String)newValue);
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__LOCATION:
				setLocation((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AbstractreferencePackage.US_OFFICE_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__COUNTRY:
				getCountry().clear();
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AbstractreferencePackage.US_OFFICE_ADDRESS__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case AbstractreferencePackage.US_OFFICE_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AbstractreferencePackage.US_OFFICE_ADDRESS__COUNTRY:
				return country != null && !country.isEmpty();
			case AbstractreferencePackage.US_OFFICE_ADDRESS__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case AbstractreferencePackage.US_OFFICE_ADDRESS__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //USOfficeAddressImpl
