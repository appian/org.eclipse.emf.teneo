/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.10 2009/06/11 04:59:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getPhoneNumbers <em>Phone Numbers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getEmergencyContact <em>Emergency Contact</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getBirthPlace <em>Birth Place</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getDouble <em>Double</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Name NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumbers() <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumbers() <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected int[] numbers = NUMBERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList phoneNumbers;

	/**
	 * The default value of the '{@link #getEmergencyContact() <em>Emergency Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyContact()
	 * @generatedNOT
	 * @ordered
	 */
	protected static final UsaPhoneNumber EMERGENCY_CONTACT_EDEFAULT = (UsaPhoneNumber)UsertypeFactory.eINSTANCE.createFromString(UsertypePackage.eINSTANCE.getPhoneNumber(), "000_000_000");

	/**
	 * The cached value of the '{@link #getEmergencyContact() <em>Emergency Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmergencyContact()
	 * @generated
	 * @ordered
	 */
	protected UsaPhoneNumber emergencyContact = EMERGENCY_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList addresses;

	/**
	 * The default value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTH_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected String birthPlace = BIRTH_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected Double double_ = DOUBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UsertypePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getNumbers() {
		return numbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(int[] newNumbers) {
		int[] oldNumbers = numbers;
		numbers = newNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__NUMBERS, oldNumbers, numbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new EDataTypeUniqueEList(UsaPhoneNumber.class, this, UsertypePackage.PERSON__PHONE_NUMBERS);
		}
		return phoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsaPhoneNumber getEmergencyContact() {
		return emergencyContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyContact(UsaPhoneNumber newEmergencyContact) {
		UsaPhoneNumber oldEmergencyContact = emergencyContact;
		emergencyContact = newEmergencyContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__EMERGENCY_CONTACT, oldEmergencyContact, emergencyContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddresses() {
		if (addresses == null) {
			addresses = new EObjectWithInverseResolvingEList(Address.class, this, UsertypePackage.PERSON__ADDRESSES, UsertypePackage.ADDRESS__PERSON);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthPlace(String newBirthPlace) {
		String oldBirthPlace = birthPlace;
		birthPlace = newBirthPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__BIRTH_PLACE, oldBirthPlace, birthPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(Double newDouble) {
		Double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__DOUBLE, oldDouble, double_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsertypePackage.PERSON__ADDRESSES:
				return ((InternalEList)getAddresses()).basicAdd(otherEnd, msgs);
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
			case UsertypePackage.PERSON__ADDRESSES:
				return ((InternalEList)getAddresses()).basicRemove(otherEnd, msgs);
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
			case UsertypePackage.PERSON__NAME:
				return getName();
			case UsertypePackage.PERSON__NUMBERS:
				return getNumbers();
			case UsertypePackage.PERSON__PHONE_NUMBERS:
				return getPhoneNumbers();
			case UsertypePackage.PERSON__EMERGENCY_CONTACT:
				return getEmergencyContact();
			case UsertypePackage.PERSON__ADDRESSES:
				return getAddresses();
			case UsertypePackage.PERSON__BIRTH_PLACE:
				return getBirthPlace();
			case UsertypePackage.PERSON__DOUBLE:
				return getDouble();
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
			case UsertypePackage.PERSON__NAME:
				setName((Name)newValue);
				return;
			case UsertypePackage.PERSON__NUMBERS:
				setNumbers((int[])newValue);
				return;
			case UsertypePackage.PERSON__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				getPhoneNumbers().addAll((Collection)newValue);
				return;
			case UsertypePackage.PERSON__EMERGENCY_CONTACT:
				setEmergencyContact((UsaPhoneNumber)newValue);
				return;
			case UsertypePackage.PERSON__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection)newValue);
				return;
			case UsertypePackage.PERSON__BIRTH_PLACE:
				setBirthPlace((String)newValue);
				return;
			case UsertypePackage.PERSON__DOUBLE:
				setDouble((Double)newValue);
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
			case UsertypePackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UsertypePackage.PERSON__NUMBERS:
				setNumbers(NUMBERS_EDEFAULT);
				return;
			case UsertypePackage.PERSON__PHONE_NUMBERS:
				getPhoneNumbers().clear();
				return;
			case UsertypePackage.PERSON__EMERGENCY_CONTACT:
				setEmergencyContact(EMERGENCY_CONTACT_EDEFAULT);
				return;
			case UsertypePackage.PERSON__ADDRESSES:
				getAddresses().clear();
				return;
			case UsertypePackage.PERSON__BIRTH_PLACE:
				setBirthPlace(BIRTH_PLACE_EDEFAULT);
				return;
			case UsertypePackage.PERSON__DOUBLE:
				setDouble(DOUBLE_EDEFAULT);
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
			case UsertypePackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UsertypePackage.PERSON__NUMBERS:
				return NUMBERS_EDEFAULT == null ? numbers != null : !NUMBERS_EDEFAULT.equals(numbers);
			case UsertypePackage.PERSON__PHONE_NUMBERS:
				return phoneNumbers != null && !phoneNumbers.isEmpty();
			case UsertypePackage.PERSON__EMERGENCY_CONTACT:
				return EMERGENCY_CONTACT_EDEFAULT == null ? emergencyContact != null : !EMERGENCY_CONTACT_EDEFAULT.equals(emergencyContact);
			case UsertypePackage.PERSON__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
			case UsertypePackage.PERSON__BIRTH_PLACE:
				return BIRTH_PLACE_EDEFAULT == null ? birthPlace != null : !BIRTH_PLACE_EDEFAULT.equals(birthPlace);
			case UsertypePackage.PERSON__DOUBLE:
				return DOUBLE_EDEFAULT == null ? double_ != null : !DOUBLE_EDEFAULT.equals(double_);
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
		result.append(", numbers: ");
		result.append(numbers);
		result.append(", phoneNumbers: ");
		result.append(phoneNumbers);
		result.append(", emergencyContact: ");
		result.append(emergencyContact);
		result.append(", birthPlace: ");
		result.append(birthPlace);
		result.append(", double: ");
		result.append(double_);
		result.append(')');
		return result.toString();
	}

} //PersonImpl