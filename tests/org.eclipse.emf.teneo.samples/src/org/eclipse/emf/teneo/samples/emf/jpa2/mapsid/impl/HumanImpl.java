/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.HumanClone;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage;
import org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.impl.HumanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.impl.HumanImpl#getHumanClone <em>Human Clone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanImpl extends EObjectImpl implements Human {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getHumanClone() <em>Human Clone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanClone()
	 * @generated
	 * @ordered
	 */
	protected HumanClone humanClone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MapsidPackage.Literals.HUMAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Name)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapsidPackage.HUMAN__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapsidPackage.HUMAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanClone getHumanClone() {
		if (humanClone != null && humanClone.eIsProxy()) {
			InternalEObject oldHumanClone = (InternalEObject)humanClone;
			humanClone = (HumanClone)eResolveProxy(oldHumanClone);
			if (humanClone != oldHumanClone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapsidPackage.HUMAN__HUMAN_CLONE, oldHumanClone, humanClone));
			}
		}
		return humanClone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanClone basicGetHumanClone() {
		return humanClone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanClone(HumanClone newHumanClone) {
		HumanClone oldHumanClone = humanClone;
		humanClone = newHumanClone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MapsidPackage.HUMAN__HUMAN_CLONE, oldHumanClone, humanClone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MapsidPackage.HUMAN__NAME:
				if (resolve) return getName();
				return basicGetName();
			case MapsidPackage.HUMAN__HUMAN_CLONE:
				if (resolve) return getHumanClone();
				return basicGetHumanClone();
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
			case MapsidPackage.HUMAN__NAME:
				setName((Name)newValue);
				return;
			case MapsidPackage.HUMAN__HUMAN_CLONE:
				setHumanClone((HumanClone)newValue);
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
			case MapsidPackage.HUMAN__NAME:
				setName((Name)null);
				return;
			case MapsidPackage.HUMAN__HUMAN_CLONE:
				setHumanClone((HumanClone)null);
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
			case MapsidPackage.HUMAN__NAME:
				return name != null;
			case MapsidPackage.HUMAN__HUMAN_CLONE:
				return humanClone != null;
		}
		return super.eIsSet(featureID);
	}

} //HumanImpl
