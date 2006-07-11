/**
 * <copyright>
 * </copyright>
 *
 * $Id: DistrictUKAddressImpl.java,v 1.1 2006/07/11 16:56:59 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.DistrictUKAddress;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>District UK Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.DistrictUKAddressImpl#getDistrict <em>District</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistrictUKAddressImpl extends UKAddressImpl implements DistrictUKAddress {
	/**
	 * The default value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRICT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected String district = DISTRICT_EDEFAULT;

	/**
	 * This is true if the District attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean districtESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistrictUKAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExtensionPackage.eINSTANCE.getDistrictUKAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistrict(String newDistrict) {
		String oldDistrict = district;
		district = newDistrict;
		boolean oldDistrictESet = districtESet;
		districtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT, oldDistrict, district, !oldDistrictESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistrict() {
		String oldDistrict = district;
		boolean oldDistrictESet = districtESet;
		district = DISTRICT_EDEFAULT;
		districtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT, oldDistrict, DISTRICT_EDEFAULT, oldDistrictESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistrict() {
		return districtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ExtensionPackage.DISTRICT_UK_ADDRESS__NAME:
				return getName();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__STREET:
				return getStreet();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__CITY:
				return getCity();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__POSTCODE:
				return getPostcode();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__EXPORT_CODE:
				return getExportCode();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				return getDistrict();
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
			case ExtensionPackage.DISTRICT_UK_ADDRESS__NAME:
				setName((String)newValue);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__POSTCODE:
				setPostcode((String)newValue);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__EXPORT_CODE:
				setExportCode((BigInteger)newValue);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				setDistrict((String)newValue);
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
			case ExtensionPackage.DISTRICT_UK_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__POSTCODE:
				setPostcode(POSTCODE_EDEFAULT);
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__EXPORT_CODE:
				unsetExportCode();
				return;
			case ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				unsetDistrict();
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
			case ExtensionPackage.DISTRICT_UK_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtensionPackage.DISTRICT_UK_ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case ExtensionPackage.DISTRICT_UK_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case ExtensionPackage.DISTRICT_UK_ADDRESS__POSTCODE:
				return POSTCODE_EDEFAULT == null ? postcode != null : !POSTCODE_EDEFAULT.equals(postcode);
			case ExtensionPackage.DISTRICT_UK_ADDRESS__EXPORT_CODE:
				return isSetExportCode();
			case ExtensionPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				return isSetDistrict();
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
		result.append(" (district: ");
		if (districtESet) result.append(district); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DistrictUKAddressImpl
