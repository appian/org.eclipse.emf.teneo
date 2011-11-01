/**
 * <copyright>
 * </copyright>
 *
 * $Id: DistrictUKAddressImpl.java,v 1.1 2008/03/10 22:19:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage;
import org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>District UK Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.impl.DistrictUKAddressImpl#getDistrict <em>District</em>}</li>
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
	protected boolean districtESet;

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
	@Override
	protected EClass eStaticClass() {
		return AbstractsuperPackage.Literals.DISTRICT_UK_ADDRESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT, oldDistrict, district, !oldDistrictESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT, oldDistrict, DISTRICT_EDEFAULT, oldDistrictESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				return getDistrict();
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
			case AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				setDistrict((String)newValue);
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
			case AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				unsetDistrict();
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
			case AbstractsuperPackage.DISTRICT_UK_ADDRESS__DISTRICT:
				return isSetDistrict();
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
		result.append(" (district: ");
		if (districtESet) result.append(district); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DistrictUKAddressImpl
