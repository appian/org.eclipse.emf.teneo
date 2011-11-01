/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateImpl.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.City;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State;
import org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.impl.StateImpl#getStateDetail <em>State Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The cached value of the '{@link #getStateDetail() <em>State Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDetail()
	 * @generated
	 * @ordered
	 */
	protected StateDetail stateDetail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HibernatePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateDetail getStateDetail() {
		if (stateDetail != null && stateDetail.eIsProxy()) {
			InternalEObject oldStateDetail = (InternalEObject)stateDetail;
			stateDetail = (StateDetail)eResolveProxy(oldStateDetail);
			if (stateDetail != oldStateDetail) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HibernatePackage.STATE__STATE_DETAIL, oldStateDetail, stateDetail));
			}
		}
		return stateDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateDetail basicGetStateDetail() {
		return stateDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateDetail(StateDetail newStateDetail, NotificationChain msgs) {
		StateDetail oldStateDetail = stateDetail;
		stateDetail = newStateDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HibernatePackage.STATE__STATE_DETAIL, oldStateDetail, newStateDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDetail(StateDetail newStateDetail) {
		if (newStateDetail != stateDetail) {
			NotificationChain msgs = null;
			if (stateDetail != null)
				msgs = ((InternalEObject)stateDetail).eInverseRemove(this, HibernatePackage.STATE_DETAIL__STATE, StateDetail.class, msgs);
			if (newStateDetail != null)
				msgs = ((InternalEObject)newStateDetail).eInverseAdd(this, HibernatePackage.STATE_DETAIL__STATE, StateDetail.class, msgs);
			msgs = basicSetStateDetail(newStateDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HibernatePackage.STATE__STATE_DETAIL, newStateDetail, newStateDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HibernatePackage.STATE__STATE_DETAIL:
				if (stateDetail != null)
					msgs = ((InternalEObject)stateDetail).eInverseRemove(this, HibernatePackage.STATE_DETAIL__STATE, StateDetail.class, msgs);
				return basicSetStateDetail((StateDetail)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HibernatePackage.STATE__STATE_DETAIL:
				return basicSetStateDetail(null, msgs);
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
			case HibernatePackage.STATE__STATE_DETAIL:
				if (resolve) return getStateDetail();
				return basicGetStateDetail();
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
			case HibernatePackage.STATE__STATE_DETAIL:
				setStateDetail((StateDetail)newValue);
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
			case HibernatePackage.STATE__STATE_DETAIL:
				setStateDetail((StateDetail)null);
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
			case HibernatePackage.STATE__STATE_DETAIL:
				return stateDetail != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
