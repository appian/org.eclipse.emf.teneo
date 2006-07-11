/**
 * <copyright>
 * </copyright>
 *
 * $Id: GlobalAddressImpl.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.epo2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.teneo.samples.emf.sample.epo2.EPO2Package;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalAddress;
import org.eclipse.emf.teneo.samples.emf.sample.epo2.GlobalLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalAddressImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.epo2.impl.GlobalAddressImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalAddressImpl extends AddressImpl implements GlobalAddress {
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTRY_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected int countryCode = COUNTRY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList location = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EPO2Package.eINSTANCE.getGlobalAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(int newCountryCode) {
		int oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocation() {
		if (location == null) {
			location = new EDataTypeUniqueEList(String.class, this, EPO2Package.GLOBAL_ADDRESS__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case EPO2Package.GLOBAL_ADDRESS__NAME:
				return getName();
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY:
				return getCountry();
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE:
				return new Integer(getCountryCode());
			case EPO2Package.GLOBAL_ADDRESS__LOCATION:
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
			case EPO2Package.GLOBAL_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY:
				setCountry((String)newValue);
				return;
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE:
				setCountryCode(((Integer)newValue).intValue());
				return;
			case EPO2Package.GLOBAL_ADDRESS__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection)newValue);
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
			case EPO2Package.GLOBAL_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case EPO2Package.GLOBAL_ADDRESS__LOCATION:
				getLocation().clear();
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
			case EPO2Package.GLOBAL_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE:
				return countryCode != COUNTRY_CODE_EDEFAULT;
			case EPO2Package.GLOBAL_ADDRESS__LOCATION:
				return location != null && !location.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == GlobalLocation.class) {
			switch (derivedFeatureID) {
				case EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE: return EPO2Package.GLOBAL_LOCATION__COUNTRY_CODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == GlobalLocation.class) {
			switch (baseFeatureID) {
				case EPO2Package.GLOBAL_LOCATION__COUNTRY_CODE: return EPO2Package.GLOBAL_ADDRESS__COUNTRY_CODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (countryCode: ");
		result.append(countryCode);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //GlobalAddressImpl
