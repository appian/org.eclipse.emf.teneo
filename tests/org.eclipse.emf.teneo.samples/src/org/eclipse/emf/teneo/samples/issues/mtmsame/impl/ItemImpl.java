/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.1 2006/11/12 00:08:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.mtmsame.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.teneo.samples.issues.mtmsame.Item;
import org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.impl.ItemImpl#getMySide <em>My Side</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.mtmsame.impl.ItemImpl#getYourSide <em>Your Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
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
	 * The cached value of the '{@link #getMySide() <em>My Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySide()
	 * @generated
	 * @ordered
	 */
	protected EList mySide = null;

	/**
	 * The cached value of the '{@link #getYourSide() <em>Your Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYourSide()
	 * @generated
	 * @ordered
	 */
	protected EList yourSide = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MtmsamePackage.Literals.ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MtmsamePackage.ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMySide() {
		if (mySide == null) {
			mySide = new EObjectWithInverseResolvingEList.ManyInverse(Item.class, this, MtmsamePackage.ITEM__MY_SIDE, MtmsamePackage.ITEM__YOUR_SIDE);
		}
		return mySide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getYourSide() {
		if (yourSide == null) {
			yourSide = new EObjectWithInverseResolvingEList.ManyInverse(Item.class, this, MtmsamePackage.ITEM__YOUR_SIDE, MtmsamePackage.ITEM__MY_SIDE);
		}
		return yourSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtmsamePackage.ITEM__MY_SIDE:
				return ((InternalEList)getMySide()).basicAdd(otherEnd, msgs);
			case MtmsamePackage.ITEM__YOUR_SIDE:
				return ((InternalEList)getYourSide()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MtmsamePackage.ITEM__MY_SIDE:
				return ((InternalEList)getMySide()).basicRemove(otherEnd, msgs);
			case MtmsamePackage.ITEM__YOUR_SIDE:
				return ((InternalEList)getYourSide()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MtmsamePackage.ITEM__NAME:
				return getName();
			case MtmsamePackage.ITEM__MY_SIDE:
				return getMySide();
			case MtmsamePackage.ITEM__YOUR_SIDE:
				return getYourSide();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MtmsamePackage.ITEM__NAME:
				setName((String)newValue);
				return;
			case MtmsamePackage.ITEM__MY_SIDE:
				getMySide().clear();
				getMySide().addAll((Collection)newValue);
				return;
			case MtmsamePackage.ITEM__YOUR_SIDE:
				getYourSide().clear();
				getYourSide().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MtmsamePackage.ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MtmsamePackage.ITEM__MY_SIDE:
				getMySide().clear();
				return;
			case MtmsamePackage.ITEM__YOUR_SIDE:
				getYourSide().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MtmsamePackage.ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MtmsamePackage.ITEM__MY_SIDE:
				return mySide != null && !mySide.isEmpty();
			case MtmsamePackage.ITEM__YOUR_SIDE:
				return yourSide != null && !yourSide.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ItemImpl