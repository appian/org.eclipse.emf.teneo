/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarsListImpl.java,v 1.1 2007/08/10 20:17:31 mtaal Exp $
 */
package com.example.car.impl;

import com.example.car.CarLink;
import com.example.car.CarPackage;
import com.example.car.CarType;
import com.example.car.CarsList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cars List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.car.impl.CarsListImpl#getCarType <em>Car Type</em>}</li>
 *   <li>{@link com.example.car.impl.CarsListImpl#getCarLink <em>Car Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarsListImpl extends EObjectImpl implements CarsList {
	/**
	 * The cached value of the '{@link #getCarType() <em>Car Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarType()
	 * @generated
	 * @ordered
	 */
	protected EList<CarType> carType;

	/**
	 * The cached value of the '{@link #getCarLink() <em>Car Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLink()
	 * @generated
	 * @ordered
	 */
	protected EList<CarLink> carLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarPackage.Literals.CARS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarType> getCarType() {
		if (carType == null) {
			carType = new EObjectContainmentEList<CarType>(CarType.class, this, CarPackage.CARS_LIST__CAR_TYPE);
		}
		return carType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarLink> getCarLink() {
		if (carLink == null) {
			carLink = new EObjectContainmentEList<CarLink>(CarLink.class, this, CarPackage.CARS_LIST__CAR_LINK);
		}
		return carLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CarPackage.CARS_LIST__CAR_TYPE:
				return ((InternalEList<?>)getCarType()).basicRemove(otherEnd, msgs);
			case CarPackage.CARS_LIST__CAR_LINK:
				return ((InternalEList<?>)getCarLink()).basicRemove(otherEnd, msgs);
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
			case CarPackage.CARS_LIST__CAR_TYPE:
				return getCarType();
			case CarPackage.CARS_LIST__CAR_LINK:
				return getCarLink();
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
			case CarPackage.CARS_LIST__CAR_TYPE:
				getCarType().clear();
				getCarType().addAll((Collection<? extends CarType>)newValue);
				return;
			case CarPackage.CARS_LIST__CAR_LINK:
				getCarLink().clear();
				getCarLink().addAll((Collection<? extends CarLink>)newValue);
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
			case CarPackage.CARS_LIST__CAR_TYPE:
				getCarType().clear();
				return;
			case CarPackage.CARS_LIST__CAR_LINK:
				getCarLink().clear();
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
			case CarPackage.CARS_LIST__CAR_TYPE:
				return carType != null && !carType.isEmpty();
			case CarPackage.CARS_LIST__CAR_LINK:
				return carLink != null && !carLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarsListImpl
