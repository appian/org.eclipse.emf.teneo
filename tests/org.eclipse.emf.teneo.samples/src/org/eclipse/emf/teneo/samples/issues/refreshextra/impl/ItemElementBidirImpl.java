/**
 */
package org.eclipse.emf.teneo.samples.issues.refreshextra.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemContainer2;
import org.eclipse.emf.teneo.samples.issues.refreshextra.ItemElementBidir;
import org.eclipse.emf.teneo.samples.issues.refreshextra.RefreshextraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Element Bidir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.refreshextra.impl.ItemElementBidirImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemElementBidirImpl extends MinimalEObjectImpl.Container implements ItemElementBidir {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemElementBidirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefreshextraPackage.Literals.ITEM_ELEMENT_BIDIR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefreshextraPackage.ITEM_ELEMENT_BIDIR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemContainer2 getItem() {
		if (eContainerFeatureID() != RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM) return null;
		return (ItemContainer2)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(ItemContainer2 newItem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newItem, RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(ItemContainer2 newItem) {
		if (newItem != eInternalContainer() || (eContainerFeatureID() != RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM && newItem != null)) {
			if (EcoreUtil.isAncestor(this, newItem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newItem != null)
				msgs = ((InternalEObject)newItem).eInverseAdd(this, RefreshextraPackage.ITEM_CONTAINER2__ELEMENTS, ItemContainer2.class, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetItem((ItemContainer2)otherEnd, msgs);
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
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				return basicSetItem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				return eInternalContainer().eInverseRemove(this, RefreshextraPackage.ITEM_CONTAINER2__ELEMENTS, ItemContainer2.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__NAME:
				return getName();
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				return getItem();
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
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__NAME:
				setName((String)newValue);
				return;
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				setItem((ItemContainer2)newValue);
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
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				setItem((ItemContainer2)null);
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
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RefreshextraPackage.ITEM_ELEMENT_BIDIR__ITEM:
				return getItem() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ItemElementBidirImpl
