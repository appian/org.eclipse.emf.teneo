/**
 * <copyright>
 * </copyright>
 *
 * $Id: HouseImpl.java,v 1.1 2007/07/17 17:37:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent;
import org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.impl.HouseImpl#getVisitors <em>Visitors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HouseImpl extends EObjectImpl implements House {
	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Parent owner;

	/**
	 * The cached value of the '{@link #getVisitors() <em>Visitors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitors()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> visitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JoincolumnsPackage.Literals.HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Parent)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JoincolumnsPackage.HOUSE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Parent newOwner) {
		Parent oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JoincolumnsPackage.HOUSE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getVisitors() {
		if (visitors == null) {
			visitors = new EObjectResolvingEList<Person>(Person.class, this, JoincolumnsPackage.HOUSE__VISITORS);
		}
		return visitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JoincolumnsPackage.HOUSE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case JoincolumnsPackage.HOUSE__VISITORS:
				return getVisitors();
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
			case JoincolumnsPackage.HOUSE__OWNER:
				setOwner((Parent)newValue);
				return;
			case JoincolumnsPackage.HOUSE__VISITORS:
				getVisitors().clear();
				getVisitors().addAll((Collection<? extends Person>)newValue);
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
			case JoincolumnsPackage.HOUSE__OWNER:
				setOwner((Parent)null);
				return;
			case JoincolumnsPackage.HOUSE__VISITORS:
				getVisitors().clear();
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
			case JoincolumnsPackage.HOUSE__OWNER:
				return owner != null;
			case JoincolumnsPackage.HOUSE__VISITORS:
				return visitors != null && !visitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HouseImpl
