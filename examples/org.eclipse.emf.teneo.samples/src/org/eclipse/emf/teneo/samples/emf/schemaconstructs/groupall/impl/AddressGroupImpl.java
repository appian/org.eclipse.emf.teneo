/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressGroupImpl.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.AddressGroup;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.GroupallPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl#getBillTo <em>Bill To</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.groupall.impl.AddressGroupImpl#getSimpleAddress <em>Simple Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressGroupImpl extends EObjectImpl implements AddressGroup {
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
	 * The cached value of the '{@link #getShipTo() <em>Ship To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected Address shipTo = null;

	/**
	 * The cached value of the '{@link #getBillTo() <em>Bill To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected Address billTo = null;

	/**
	 * The default value of the '{@link #getSimpleAddress() <em>Simple Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleAddress() <em>Simple Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAddress()
	 * @generated
	 * @ordered
	 */
	protected String simpleAddress = SIMPLE_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GroupallPackage.eINSTANCE.getAddressGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__GROUP_NAME, oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getShipTo() {
		return shipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipTo(Address newShipTo, NotificationChain msgs) {
		Address oldShipTo = shipTo;
		shipTo = newShipTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__SHIP_TO, oldShipTo, newShipTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(Address newShipTo) {
		if (newShipTo != shipTo) {
			NotificationChain msgs = null;
			if (shipTo != null)
				msgs = ((InternalEObject)shipTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupallPackage.ADDRESS_GROUP__SHIP_TO, null, msgs);
			if (newShipTo != null)
				msgs = ((InternalEObject)newShipTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupallPackage.ADDRESS_GROUP__SHIP_TO, null, msgs);
			msgs = basicSetShipTo(newShipTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__SHIP_TO, newShipTo, newShipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getBillTo() {
		return billTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBillTo(Address newBillTo, NotificationChain msgs) {
		Address oldBillTo = billTo;
		billTo = newBillTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__BILL_TO, oldBillTo, newBillTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillTo(Address newBillTo) {
		if (newBillTo != billTo) {
			NotificationChain msgs = null;
			if (billTo != null)
				msgs = ((InternalEObject)billTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GroupallPackage.ADDRESS_GROUP__BILL_TO, null, msgs);
			if (newBillTo != null)
				msgs = ((InternalEObject)newBillTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GroupallPackage.ADDRESS_GROUP__BILL_TO, null, msgs);
			msgs = basicSetBillTo(newBillTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__BILL_TO, newBillTo, newBillTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleAddress() {
		return simpleAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleAddress(String newSimpleAddress) {
		String oldSimpleAddress = simpleAddress;
		simpleAddress = newSimpleAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupallPackage.ADDRESS_GROUP__SIMPLE_ADDRESS, oldSimpleAddress, simpleAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case GroupallPackage.ADDRESS_GROUP__SHIP_TO:
					return basicSetShipTo(null, msgs);
				case GroupallPackage.ADDRESS_GROUP__BILL_TO:
					return basicSetBillTo(null, msgs);
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
			case GroupallPackage.ADDRESS_GROUP__GROUP_NAME:
				return getGroupName();
			case GroupallPackage.ADDRESS_GROUP__SHIP_TO:
				return getShipTo();
			case GroupallPackage.ADDRESS_GROUP__BILL_TO:
				return getBillTo();
			case GroupallPackage.ADDRESS_GROUP__SIMPLE_ADDRESS:
				return getSimpleAddress();
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
			case GroupallPackage.ADDRESS_GROUP__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case GroupallPackage.ADDRESS_GROUP__SHIP_TO:
				setShipTo((Address)newValue);
				return;
			case GroupallPackage.ADDRESS_GROUP__BILL_TO:
				setBillTo((Address)newValue);
				return;
			case GroupallPackage.ADDRESS_GROUP__SIMPLE_ADDRESS:
				setSimpleAddress((String)newValue);
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
			case GroupallPackage.ADDRESS_GROUP__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case GroupallPackage.ADDRESS_GROUP__SHIP_TO:
				setShipTo((Address)null);
				return;
			case GroupallPackage.ADDRESS_GROUP__BILL_TO:
				setBillTo((Address)null);
				return;
			case GroupallPackage.ADDRESS_GROUP__SIMPLE_ADDRESS:
				setSimpleAddress(SIMPLE_ADDRESS_EDEFAULT);
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
			case GroupallPackage.ADDRESS_GROUP__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case GroupallPackage.ADDRESS_GROUP__SHIP_TO:
				return shipTo != null;
			case GroupallPackage.ADDRESS_GROUP__BILL_TO:
				return billTo != null;
			case GroupallPackage.ADDRESS_GROUP__SIMPLE_ADDRESS:
				return SIMPLE_ADDRESS_EDEFAULT == null ? simpleAddress != null : !SIMPLE_ADDRESS_EDEFAULT.equals(simpleAddress);
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
		result.append(", simpleAddress: ");
		result.append(simpleAddress);
		result.append(')');
		return result.toString();
	}

} //AddressGroupImpl
