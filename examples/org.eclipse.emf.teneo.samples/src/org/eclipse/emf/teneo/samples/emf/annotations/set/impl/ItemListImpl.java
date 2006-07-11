/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemListImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.set.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.annotations.set.ContainedItem;
import org.eclipse.emf.teneo.samples.emf.annotations.set.Item;
import org.eclipse.emf.teneo.samples.emf.annotations.set.ItemList;
import org.eclipse.emf.teneo.samples.emf.annotations.set.SetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.impl.ItemListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.impl.ItemListImpl#getContainedItem <em>Contained Item</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.impl.ItemListImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.set.impl.ItemListImpl#getJoinedItem <em>Joined Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemListImpl extends EObjectImpl implements ItemList {
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
	 * The cached value of the '{@link #getContainedItem() <em>Contained Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedItem()
	 * @generated
	 * @ordered
	 */
	protected EList containedItem = null;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList item = null;

	/**
	 * The cached value of the '{@link #getJoinedItem() <em>Joined Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinedItem()
	 * @generated
	 * @ordered
	 */
	protected EList joinedItem = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SetPackage.Literals.ITEM_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SetPackage.ITEM_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedItem() {
		if (containedItem == null) {
			containedItem = new EObjectContainmentEList(ContainedItem.class, this, SetPackage.ITEM_LIST__CONTAINED_ITEM);
		}
		return containedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getItem() {
		if (item == null) {
			item = new EObjectWithInverseResolvingEList(Item.class, this, SetPackage.ITEM_LIST__ITEM, SetPackage.ITEM__ITEM_LIST);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getJoinedItem() {
		if (joinedItem == null) {
			joinedItem = new EObjectResolvingEList(Item.class, this, SetPackage.ITEM_LIST__JOINED_ITEM);
		}
		return joinedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SetPackage.ITEM_LIST__ITEM:
				return ((InternalEList)getItem()).basicAdd(otherEnd, msgs);
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
			case SetPackage.ITEM_LIST__CONTAINED_ITEM:
				return ((InternalEList)getContainedItem()).basicRemove(otherEnd, msgs);
			case SetPackage.ITEM_LIST__ITEM:
				return ((InternalEList)getItem()).basicRemove(otherEnd, msgs);
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
			case SetPackage.ITEM_LIST__NAME:
				return getName();
			case SetPackage.ITEM_LIST__CONTAINED_ITEM:
				return getContainedItem();
			case SetPackage.ITEM_LIST__ITEM:
				return getItem();
			case SetPackage.ITEM_LIST__JOINED_ITEM:
				return getJoinedItem();
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
			case SetPackage.ITEM_LIST__NAME:
				setName((String)newValue);
				return;
			case SetPackage.ITEM_LIST__CONTAINED_ITEM:
				getContainedItem().clear();
				getContainedItem().addAll((Collection)newValue);
				return;
			case SetPackage.ITEM_LIST__ITEM:
				getItem().clear();
				getItem().addAll((Collection)newValue);
				return;
			case SetPackage.ITEM_LIST__JOINED_ITEM:
				getJoinedItem().clear();
				getJoinedItem().addAll((Collection)newValue);
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
			case SetPackage.ITEM_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SetPackage.ITEM_LIST__CONTAINED_ITEM:
				getContainedItem().clear();
				return;
			case SetPackage.ITEM_LIST__ITEM:
				getItem().clear();
				return;
			case SetPackage.ITEM_LIST__JOINED_ITEM:
				getJoinedItem().clear();
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
			case SetPackage.ITEM_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SetPackage.ITEM_LIST__CONTAINED_ITEM:
				return containedItem != null && !containedItem.isEmpty();
			case SetPackage.ITEM_LIST__ITEM:
				return item != null && !item.isEmpty();
			case SetPackage.ITEM_LIST__JOINED_ITEM:
				return joinedItem != null && !joinedItem.isEmpty();
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

} //ItemListImpl
