/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.enumtest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.enumtest.EnumtestPackage;
import org.eclipse.emf.teneo.samples.issues.enumtest.Item;
import org.eclipse.emf.teneo.samples.issues.enumtest.ItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.enumtest.impl.ItemImpl#getNullableItemType <em>Nullable Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ItemType ITEM_TYPE_EDEFAULT = ItemType.PRODUCT_LITERAL;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected ItemType itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * This is true if the Item Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemTypeESet = false;

	/**
	 * The default value of the '{@link #getNullableItemType() <em>Nullable Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullableItemType()
	 * @ordered
	 */
	protected static final ItemType NULLABLE_ITEM_TYPE_EDEFAULT = null;//ItemType.PRODUCT_LITERAL;

	/**
	 * The cached value of the '{@link #getNullableItemType() <em>Nullable Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullableItemType()
	 * @generated
	 * @ordered
	 */
	protected ItemType nullableItemType = NULLABLE_ITEM_TYPE_EDEFAULT;

	/**
	 * This is true if the Nullable Item Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullableItemTypeESet = false;

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
		return EnumtestPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(ItemType newItemType) {
		ItemType oldItemType = itemType;
		itemType = newItemType == null ? ITEM_TYPE_EDEFAULT : newItemType;
		boolean oldItemTypeESet = itemTypeESet;
		itemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumtestPackage.ITEM__ITEM_TYPE, oldItemType, itemType, !oldItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItemType() {
		ItemType oldItemType = itemType;
		boolean oldItemTypeESet = itemTypeESet;
		itemType = ITEM_TYPE_EDEFAULT;
		itemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EnumtestPackage.ITEM__ITEM_TYPE, oldItemType, ITEM_TYPE_EDEFAULT, oldItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemType() {
		return itemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType getNullableItemType() {
		return nullableItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullableItemType(ItemType newNullableItemType) {
		ItemType oldNullableItemType = nullableItemType;
		nullableItemType = newNullableItemType == null ? NULLABLE_ITEM_TYPE_EDEFAULT : newNullableItemType;
		boolean oldNullableItemTypeESet = nullableItemTypeESet;
		nullableItemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE, oldNullableItemType, nullableItemType, !oldNullableItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullableItemType() {
		ItemType oldNullableItemType = nullableItemType;
		boolean oldNullableItemTypeESet = nullableItemTypeESet;
		nullableItemType = NULLABLE_ITEM_TYPE_EDEFAULT;
		nullableItemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE, oldNullableItemType, NULLABLE_ITEM_TYPE_EDEFAULT, oldNullableItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullableItemType() {
		return nullableItemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnumtestPackage.ITEM__ITEM_TYPE:
				return getItemType();
			case EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE:
				return getNullableItemType();
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
			case EnumtestPackage.ITEM__ITEM_TYPE:
				setItemType((ItemType)newValue);
				return;
			case EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE:
				setNullableItemType((ItemType)newValue);
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
			case EnumtestPackage.ITEM__ITEM_TYPE:
				unsetItemType();
				return;
			case EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE:
				unsetNullableItemType();
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
			case EnumtestPackage.ITEM__ITEM_TYPE:
				return isSetItemType();
			case EnumtestPackage.ITEM__NULLABLE_ITEM_TYPE:
				return isSetNullableItemType();
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
		result.append(" (itemType: ");
		if (itemTypeESet) result.append(itemType); else result.append("<unset>");
		result.append(", nullableItemType: ");
		if (nullableItemTypeESet) result.append(nullableItemType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ItemImpl
