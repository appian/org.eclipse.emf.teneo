/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarFrameImpl.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.CarFrame;
import com.example.car.CarLink;
import com.example.car.CarPackage;
import com.example.car.CarWheel;

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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Frame</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link com.example.car.impl.CarFrameImpl#getCarWheel <em>Car Wheel</em>}</li>
 * <li>{@link com.example.car.impl.CarFrameImpl#getCarLinkRef <em>Car Link Ref</em>}</li>
 * <li>{@link com.example.car.impl.CarFrameImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CarFrameImpl extends EObjectImpl implements CarFrame {
	/**
	 * The cached value of the '{@link #getCarWheel() <em>Car Wheel</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCarWheel()
	 * @generated
	 * @ordered
	 */
	protected EList<CarWheel> carWheel;

	/**
	 * The cached value of the '{@link #getCarLinkRef() <em>Car Link Ref</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCarLinkRef()
	 * @generated
	 * @ordered
	 */
	protected CarLink carLinkRef;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CarFrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarPackage.Literals.CAR_FRAME;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CarWheel> getCarWheel() {
		if (carWheel == null) {
			carWheel = new EObjectContainmentEList<CarWheel>(CarWheel.class, this,
					CarPackage.CAR_FRAME__CAR_WHEEL);
		}
		return carWheel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarLink getCarLinkRef() {
		return carLinkRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCarLinkRef(CarLink newCarLinkRef) {
		CarLink oldCarLinkRef = carLinkRef;
		carLinkRef = newCarLinkRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.CAR_FRAME__CAR_LINK_REF,
					oldCarLinkRef, carLinkRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarPackage.CAR_FRAME__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case CarPackage.CAR_FRAME__CAR_WHEEL:
			return ((InternalEList<?>) getCarWheel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CarPackage.CAR_FRAME__CAR_WHEEL:
			return getCarWheel();
		case CarPackage.CAR_FRAME__CAR_LINK_REF:
			return getCarLinkRef();
		case CarPackage.CAR_FRAME__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CarPackage.CAR_FRAME__CAR_WHEEL:
			getCarWheel().clear();
			getCarWheel().addAll((Collection<? extends CarWheel>) newValue);
			return;
		case CarPackage.CAR_FRAME__CAR_LINK_REF:
			setCarLinkRef((CarLink) newValue);
			return;
		case CarPackage.CAR_FRAME__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CarPackage.CAR_FRAME__CAR_WHEEL:
			getCarWheel().clear();
			return;
		case CarPackage.CAR_FRAME__CAR_LINK_REF:
			setCarLinkRef((CarLink) null);
			return;
		case CarPackage.CAR_FRAME__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CarPackage.CAR_FRAME__CAR_WHEEL:
			return carWheel != null && !carWheel.isEmpty();
		case CarPackage.CAR_FRAME__CAR_LINK_REF:
			return carLinkRef != null;
		case CarPackage.CAR_FRAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // CarFrameImpl
