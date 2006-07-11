/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.refresh.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.refresh.Item;
import org.eclipse.emf.teneo.samples.issues.refresh.LineOne;
import org.eclipse.emf.teneo.samples.issues.refresh.LineTwo;
import org.eclipse.emf.teneo.samples.issues.refresh.RefreshPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.impl.ItemImpl#getLineOne <em>Line One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refresh.impl.ItemImpl#getLineTwo <em>Line Two</em>}</li>
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
	 * The cached value of the '{@link #getLineOne() <em>Line One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOne()
	 * @generated
	 * @ordered
	 */
	protected EList lineOne = null;

	/**
	 * The cached value of the '{@link #getLineTwo() <em>Line Two</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineTwo()
	 * @generated
	 * @ordered
	 */
	protected EList lineTwo = null;

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
		return RefreshPackage.eINSTANCE.getItem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefreshPackage.ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLineOne() {
		if (lineOne == null) {
			lineOne = new EObjectContainmentEList(LineOne.class, this, RefreshPackage.ITEM__LINE_ONE);
		}
		return lineOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLineTwo() {
		if (lineTwo == null) {
			lineTwo = new EObjectContainmentEList(LineTwo.class, this, RefreshPackage.ITEM__LINE_TWO);
		}
		return lineTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case RefreshPackage.ITEM__LINE_ONE:
					return ((InternalEList)getLineOne()).basicRemove(otherEnd, msgs);
				case RefreshPackage.ITEM__LINE_TWO:
					return ((InternalEList)getLineTwo()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RefreshPackage.ITEM__NAME:
				return getName();
			case RefreshPackage.ITEM__LINE_ONE:
				return getLineOne();
			case RefreshPackage.ITEM__LINE_TWO:
				return getLineTwo();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RefreshPackage.ITEM__NAME:
				setName((String)newValue);
				return;
			case RefreshPackage.ITEM__LINE_ONE:
				getLineOne().clear();
				getLineOne().addAll((Collection)newValue);
				return;
			case RefreshPackage.ITEM__LINE_TWO:
				getLineTwo().clear();
				getLineTwo().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RefreshPackage.ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefreshPackage.ITEM__LINE_ONE:
				getLineOne().clear();
				return;
			case RefreshPackage.ITEM__LINE_TWO:
				getLineTwo().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case RefreshPackage.ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefreshPackage.ITEM__LINE_ONE:
				return lineOne != null && !lineOne.isEmpty();
			case RefreshPackage.ITEM__LINE_TWO:
				return lineTwo != null && !lineTwo.isEmpty();
		}
		return eDynamicIsSet(eFeature);
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
