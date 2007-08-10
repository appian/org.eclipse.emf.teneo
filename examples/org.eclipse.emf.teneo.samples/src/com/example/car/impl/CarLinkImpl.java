/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarLinkImpl.java,v 1.1 2007/08/10 20:17:32 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.CarLink;
import com.example.car.CarPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.car.impl.CarLinkImpl#getCarLinkId <em>Car Link Id</em>}</li>
 *   <li>{@link com.example.car.impl.CarLinkImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarLinkImpl extends EObjectImpl implements CarLink {
	/**
	 * The default value of the '{@link #getCarLinkId() <em>Car Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAR_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarLinkId() <em>Car Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLinkId()
	 * @generated
	 * @ordered
	 */
	protected String carLinkId = CAR_LINK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarPackage.Literals.CAR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarLinkId() {
		return carLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarLinkId(String newCarLinkId) {
		String oldCarLinkId = carLinkId;
		carLinkId = newCarLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.CAR_LINK__CAR_LINK_ID, oldCarLinkId, carLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.CAR_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CarPackage.CAR_LINK__CAR_LINK_ID:
				return getCarLinkId();
			case CarPackage.CAR_LINK__NAME:
				return getName();
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
			case CarPackage.CAR_LINK__CAR_LINK_ID:
				setCarLinkId((String)newValue);
				return;
			case CarPackage.CAR_LINK__NAME:
				setName((String)newValue);
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
			case CarPackage.CAR_LINK__CAR_LINK_ID:
				setCarLinkId(CAR_LINK_ID_EDEFAULT);
				return;
			case CarPackage.CAR_LINK__NAME:
				setName(NAME_EDEFAULT);
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
			case CarPackage.CAR_LINK__CAR_LINK_ID:
				return CAR_LINK_ID_EDEFAULT == null ? carLinkId != null : !CAR_LINK_ID_EDEFAULT.equals(carLinkId);
			case CarPackage.CAR_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (carLinkId: ");
		result.append(carLinkId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CarLinkImpl
