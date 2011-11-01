/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarTypeImpl.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.CarFrame;
import com.example.car.CarPackage;
import com.example.car.CarType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.car.impl.CarTypeImpl#getCarFrame <em>Car Frame</em>}</li>
 *   <li>{@link com.example.car.impl.CarTypeImpl#getCarID <em>Car ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarTypeImpl extends EObjectImpl implements CarType {
	/**
	 * The cached value of the '{@link #getCarFrame() <em>Car Frame</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarFrame()
	 * @generated
	 * @ordered
	 */
	protected EList<CarFrame> carFrame;

	/**
	 * The default value of the '{@link #getCarID() <em>Car ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarID()
	 * @generated
	 * @ordered
	 */
	protected static final String CAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarID() <em>Car ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarID()
	 * @generated
	 * @ordered
	 */
	protected String carID = CAR_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarPackage.Literals.CAR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarFrame> getCarFrame() {
		if (carFrame == null) {
			carFrame = new EObjectContainmentEList<CarFrame>(CarFrame.class, this, CarPackage.CAR_TYPE__CAR_FRAME);
		}
		return carFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarID() {
		return carID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarID(String newCarID) {
		String oldCarID = carID;
		carID = newCarID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.CAR_TYPE__CAR_ID, oldCarID, carID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarPackage.CAR_TYPE__CAR_FRAME:
				return ((InternalEList<?>)getCarFrame()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CarPackage.CAR_TYPE__CAR_FRAME:
				return getCarFrame();
			case CarPackage.CAR_TYPE__CAR_ID:
				return getCarID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CarPackage.CAR_TYPE__CAR_FRAME:
				getCarFrame().clear();
				getCarFrame().addAll((Collection<? extends CarFrame>)newValue);
				return;
			case CarPackage.CAR_TYPE__CAR_ID:
				setCarID((String)newValue);
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
			case CarPackage.CAR_TYPE__CAR_FRAME:
				getCarFrame().clear();
				return;
			case CarPackage.CAR_TYPE__CAR_ID:
				setCarID(CAR_ID_EDEFAULT);
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
			case CarPackage.CAR_TYPE__CAR_FRAME:
				return carFrame != null && !carFrame.isEmpty();
			case CarPackage.CAR_TYPE__CAR_ID:
				return CAR_ID_EDEFAULT == null ? carID != null : !CAR_ID_EDEFAULT.equals(carID);
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
		result.append(" (carID: ");
		result.append(carID);
		result.append(')');
		return result.toString();
	}

} //CarTypeImpl
