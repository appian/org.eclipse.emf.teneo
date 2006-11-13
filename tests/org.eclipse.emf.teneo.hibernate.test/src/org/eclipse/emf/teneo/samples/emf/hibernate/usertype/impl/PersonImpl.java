/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.7 2006/11/13 14:52:45 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	protected EList phoneNumbers = null;

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
		result.append(')');
		return result.toString();
	}

} //PersonImpl