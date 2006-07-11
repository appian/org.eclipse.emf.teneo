/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressListImpl.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl#getAddrs <em>Addrs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressListImpl#getBillTo <em>Bill To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressListImpl extends EObjectImpl implements AddressList {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddrs() <em>Addrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap addrs = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GroupallPackage.eINSTANCE.getAddressList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_LIST__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAddrs() {
		if (addrs == null) {
			addrs = new BasicFeatureMap(this, GroupallPackage.ADDRESS_LIST__ADDRS);
		}
		return addrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getShipTo() {
		return ((FeatureMap)getAddrs()).list(GroupallPackage.eINSTANCE.getAddressList_ShipTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBillTo() {
		return ((FeatureMap)getAddrs()).list(GroupallPackage.eINSTANCE.getAddressList_BillTo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GroupallPackage.ADDRESS_LIST__ADDRS:
					return ((InternalEList)getAddrs()).basicRemove(otherEnd, msgs);
				case GroupallPackage.ADDRESS_LIST__SHIP_TO:
					return ((InternalEList)getShipTo()).basicRemove(otherEnd, msgs);
				case GroupallPackage.ADDRESS_LIST__BILL_TO:
					return ((InternalEList)getBillTo()).basicRemove(otherEnd, msgs);
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
			case GroupallPackage.ADDRESS_LIST__GROUP_NAME:
				return getGroupName();
			case GroupallPackage.ADDRESS_LIST__ADDRS:
				return getAddrs();
			case GroupallPackage.ADDRESS_LIST__SHIP_TO:
				return getShipTo();
			case GroupallPackage.ADDRESS_LIST__BILL_TO:
				return getBillTo();
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
			case GroupallPackage.ADDRESS_LIST__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case GroupallPackage.ADDRESS_LIST__ADDRS:
				getAddrs().clear();
				getAddrs().addAll((Collection)newValue);
				return;
			case GroupallPackage.ADDRESS_LIST__SHIP_TO:
				getShipTo().clear();
				getShipTo().addAll((Collection)newValue);
				return;
			case GroupallPackage.ADDRESS_LIST__BILL_TO:
				getBillTo().clear();
				getBillTo().addAll((Collection)newValue);
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
			case GroupallPackage.ADDRESS_LIST__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case GroupallPackage.ADDRESS_LIST__ADDRS:
				getAddrs().clear();
				return;
			case GroupallPackage.ADDRESS_LIST__SHIP_TO:
				getShipTo().clear();
				return;
			case GroupallPackage.ADDRESS_LIST__BILL_TO:
				getBillTo().clear();
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
			case GroupallPackage.ADDRESS_LIST__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case GroupallPackage.ADDRESS_LIST__ADDRS:
				return addrs != null && !addrs.isEmpty();
			case GroupallPackage.ADDRESS_LIST__SHIP_TO:
				return !getShipTo().isEmpty();
			case GroupallPackage.ADDRESS_LIST__BILL_TO:
				return !getBillTo().isEmpty();
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
		result.append(" (groupName: ");
		result.append(groupName);
		result.append(", addrs: ");
		result.append(addrs);
		result.append(')');
		return result.toString();
	}

} //AddressListImpl
