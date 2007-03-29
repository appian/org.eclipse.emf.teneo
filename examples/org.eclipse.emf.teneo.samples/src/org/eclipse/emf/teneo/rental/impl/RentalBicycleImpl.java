/**
 * <copyright>
 * </copyright>
 *
 * $Id: RentalBicycleImpl.java,v 1.2 2007/03/29 22:13:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.rental.Manufacturer;
import org.eclipse.emf.teneo.rental.RentalBicycle;
import org.eclipse.emf.teneo.rental.RentalBicycleType;
import org.eclipse.emf.teneo.rental.RentalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bicycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.impl.RentalBicycleImpl#getManufacturer <em>Manufacturer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RentalBicycleImpl extends RentalUnitImpl implements RentalBicycle {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RentalBicycleType TYPE_EDEFAULT = RentalBicycleType.STANDARD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RentalBicycleType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet = false;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected Manufacturer manufacturer = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalBicycleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RentalPackage.Literals.RENTAL_BICYCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RentalBicycleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RentalBicycleType newType) {
		RentalBicycleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_BICYCLE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		RentalBicycleType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RentalPackage.RENTAL_BICYCLE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manufacturer getManufacturer() {
		if (manufacturer != null && manufacturer.eIsProxy()) {
			InternalEObject oldManufacturer = (InternalEObject)manufacturer;
			manufacturer = (Manufacturer)eResolveProxy(oldManufacturer);
			if (manufacturer != oldManufacturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RentalPackage.RENTAL_BICYCLE__MANUFACTURER, oldManufacturer, manufacturer));
			}
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manufacturer basicGetManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(Manufacturer newManufacturer) {
		Manufacturer oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RentalPackage.RENTAL_BICYCLE__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RentalPackage.RENTAL_BICYCLE__TYPE:
				return getType();
			case RentalPackage.RENTAL_BICYCLE__MANUFACTURER:
				if (resolve) return getManufacturer();
				return basicGetManufacturer();
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
			case RentalPackage.RENTAL_BICYCLE__TYPE:
				setType((RentalBicycleType)newValue);
				return;
			case RentalPackage.RENTAL_BICYCLE__MANUFACTURER:
				setManufacturer((Manufacturer)newValue);
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
			case RentalPackage.RENTAL_BICYCLE__TYPE:
				unsetType();
				return;
			case RentalPackage.RENTAL_BICYCLE__MANUFACTURER:
				setManufacturer((Manufacturer)null);
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
			case RentalPackage.RENTAL_BICYCLE__TYPE:
				return isSetType();
			case RentalPackage.RENTAL_BICYCLE__MANUFACTURER:
				return manufacturer != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RentalBicycleImpl
