/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressImpl.java,v 1.3 2010/02/06 20:50:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Address</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl#getAddressInfo <em>Address Info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.AddressImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
	/**
	 * The default value of the '{@link #getAddressInfo() <em>Address Info</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddressInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressInfo() <em>Address Info</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddressInfo()
	 * @generated
	 * @ordered
	 */
	protected String addressInfo = ADDRESS_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsertypePackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressInfo() {
		return addressInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressInfo(String newAddressInfo) {
		String oldAddressInfo = addressInfo;
		addressInfo = newAddressInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.ADDRESS__ADDRESS_INFO, oldAddressInfo, addressInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsertypePackage.ADDRESS__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsertypePackage.ADDRESS__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, UsertypePackage.PERSON__ADDRESSES, Person.class, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, UsertypePackage.PERSON__ADDRESSES, Person.class, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.ADDRESS__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__PERSON:
				if (person != null)
					msgs = ((InternalEObject)person).eInverseRemove(this, UsertypePackage.PERSON__ADDRESSES, Person.class, msgs);
				return basicSetPerson((Person)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__PERSON:
				return basicSetPerson(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__ADDRESS_INFO:
				return getAddressInfo();
			case UsertypePackage.ADDRESS__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__ADDRESS_INFO:
				setAddressInfo((String)newValue);
				return;
			case UsertypePackage.ADDRESS__PERSON:
				setPerson((Person)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__ADDRESS_INFO:
				setAddressInfo(ADDRESS_INFO_EDEFAULT);
				return;
			case UsertypePackage.ADDRESS__PERSON:
				setPerson((Person)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsertypePackage.ADDRESS__ADDRESS_INFO:
				return ADDRESS_INFO_EDEFAULT == null ? addressInfo != null : !ADDRESS_INFO_EDEFAULT.equals(addressInfo);
			case UsertypePackage.ADDRESS__PERSON:
				return person != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (addressInfo: ");
		result.append(addressInfo);
		result.append(')');
		return result.toString();
	}

} // AddressImpl
