/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressListImpl.java,v 1.2 2007/02/05 16:13:45 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressListImpl#getFirstAddress <em>First Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.AddressListImpl#getSecondAddress <em>Second Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressListImpl extends EObjectImpl implements AddressList {
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
	 * The cached value of the '{@link #getFirstAddress() <em>First Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAddress()
	 * @generated
	 * @ordered
	 */
	protected FirstAddressHolder firstAddress = null;

	/**
	 * The cached value of the '{@link #getSecondAddress() <em>Second Address</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondAddress()
	 * @generated
	 * @ordered
	 */
	protected EList secondAddress = null;

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
		return ExtensionPackage.Literals.ADDRESS_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.ADDRESS_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstAddressHolder getFirstAddress() {
		return firstAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstAddress(FirstAddressHolder newFirstAddress, NotificationChain msgs) {
		FirstAddressHolder oldFirstAddress = firstAddress;
		firstAddress = newFirstAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS, oldFirstAddress, newFirstAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstAddress(FirstAddressHolder newFirstAddress) {
		if (newFirstAddress != firstAddress) {
			NotificationChain msgs = null;
			if (firstAddress != null)
				msgs = ((InternalEObject)firstAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS, null, msgs);
			if (newFirstAddress != null)
				msgs = ((InternalEObject)newFirstAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS, null, msgs);
			msgs = basicSetFirstAddress(newFirstAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS, newFirstAddress, newFirstAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSecondAddress() {
		if (secondAddress == null) {
			secondAddress = new EObjectResolvingEList(Address.class, this, ExtensionPackage.ADDRESS_LIST__SECOND_ADDRESS);
		}
		return secondAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS:
				return basicSetFirstAddress(null, msgs);
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
			case ExtensionPackage.ADDRESS_LIST__NAME:
				return getName();
			case ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS:
				return getFirstAddress();
			case ExtensionPackage.ADDRESS_LIST__SECOND_ADDRESS:
				return getSecondAddress();
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
			case ExtensionPackage.ADDRESS_LIST__NAME:
				setName((String)newValue);
				return;
			case ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS:
				setFirstAddress((FirstAddressHolder)newValue);
				return;
			case ExtensionPackage.ADDRESS_LIST__SECOND_ADDRESS:
				getSecondAddress().clear();
				getSecondAddress().addAll((Collection)newValue);
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
			case ExtensionPackage.ADDRESS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS:
				setFirstAddress((FirstAddressHolder)null);
				return;
			case ExtensionPackage.ADDRESS_LIST__SECOND_ADDRESS:
				getSecondAddress().clear();
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
			case ExtensionPackage.ADDRESS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExtensionPackage.ADDRESS_LIST__FIRST_ADDRESS:
				return firstAddress != null;
			case ExtensionPackage.ADDRESS_LIST__SECOND_ADDRESS:
				return secondAddress != null && !secondAddress.isEmpty();
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

} //AddressListImpl
