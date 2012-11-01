/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.12 2010/06/03 14:06:56 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Address;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Certificate;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Name;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.Person;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsaPhoneNumber;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypeFactory;
import org.eclipse.emf.teneo.samples.emf.hibernate.usertype.UsertypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Person</b></em>'. <!--
 * end-user-doc -->
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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.hibernate.usertype.impl.PersonImpl#getCertificates <em>Certificates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
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
	 * The default value of the '{@link #getNumbers() <em>Numbers</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumbers() <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getNumbers()
	 * @generated
	 * @ordered
	 */
	protected int[] numbers = NUMBERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPhoneNumbers() <em>Phone Numbers</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPhoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UsaPhoneNumber> phoneNumbers;

	/**
	 * The default value of the '{@link #getEmergencyContact() <em>Emergency Contact</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEmergencyContact()
	 * @generatedNOT
	 * @ordered
	 */
	protected static final UsaPhoneNumber EMERGENCY_CONTACT_EDEFAULT = (UsaPhoneNumber) UsertypeFactory.eINSTANCE
			.createFromString(UsertypePackage.eINSTANCE.getPhoneNumber(), "000_000_000");

	/**
	 * The cached value of the '{@link #getEmergencyContact() <em>Emergency Contact</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmergencyContact()
	 * @generated
	 * @ordered
	 */
	protected UsaPhoneNumber emergencyContact = EMERGENCY_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * The default value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String BIRTH_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthPlace() <em>Birth Place</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBirthPlace()
	 * @generated
	 * @ordered
	 */
	protected String birthPlace = BIRTH_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected Double double_ = DOUBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected Certificate certificate;

	/**
	 * The cached value of the '{@link #getCertificates() <em>Certificates</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCertificates()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificate> certificates;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsertypePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getNumbers() {
		return numbers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(int[] newNumbers) {
		int[] oldNumbers = numbers;
		numbers = newNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__NUMBERS, oldNumbers, numbers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsaPhoneNumber> getPhoneNumbers() {
		if (phoneNumbers == null) {
			phoneNumbers = new EDataTypeUniqueEList<UsaPhoneNumber>(UsaPhoneNumber.class, this, UsertypePackage.PERSON__PHONE_NUMBERS);
		}
		return phoneNumbers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsaPhoneNumber getEmergencyContact() {
		return emergencyContact;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyContact(UsaPhoneNumber newEmergencyContact) {
		UsaPhoneNumber oldEmergencyContact = emergencyContact;
		emergencyContact = newEmergencyContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__EMERGENCY_CONTACT, oldEmergencyContact, emergencyContact));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectWithInverseResolvingEList<Address>(Address.class, this, UsertypePackage.PERSON__ADDRESSES, UsertypePackage.ADDRESS__PERSON);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getBirthPlace() {
		return birthPlace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthPlace(String newBirthPlace) {
		String oldBirthPlace = birthPlace;
		birthPlace = newBirthPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__BIRTH_PLACE, oldBirthPlace, birthPlace));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(Double newDouble) {
		Double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__DOUBLE, oldDouble, double_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate getCertificate() {
		if (certificate != null && certificate.eIsProxy()) {
			InternalEObject oldCertificate = (InternalEObject)certificate;
			certificate = (Certificate)eResolveProxy(oldCertificate);
			if (certificate != oldCertificate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsertypePackage.PERSON__CERTIFICATE, oldCertificate, certificate));
			}
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate basicGetCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(Certificate newCertificate) {
		Certificate oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsertypePackage.PERSON__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Certificate> getCertificates() {
		if (certificates == null) {
			certificates = new EObjectResolvingEList<Certificate>(Certificate.class, this, UsertypePackage.PERSON__CERTIFICATES);
		}
		return certificates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generatedNOT
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case UsertypePackage.PERSON__ADDRESSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAddresses()).basicAdd(
					otherEnd, msgs);
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
			case UsertypePackage.PERSON__ADDRESSES:
				return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
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
			case UsertypePackage.PERSON__CERTIFICATE:
				if (resolve) return getCertificate();
				return basicGetCertificate();
			case UsertypePackage.PERSON__CERTIFICATES:
				return getCertificates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
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
				getPhoneNumbers().addAll((Collection<? extends UsaPhoneNumber>)newValue);
				return;
			case UsertypePackage.PERSON__EMERGENCY_CONTACT:
				setEmergencyContact((UsaPhoneNumber)newValue);
				return;
			case UsertypePackage.PERSON__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
				return;
			case UsertypePackage.PERSON__BIRTH_PLACE:
				setBirthPlace((String)newValue);
				return;
			case UsertypePackage.PERSON__DOUBLE:
				setDouble((Double)newValue);
				return;
			case UsertypePackage.PERSON__CERTIFICATE:
				setCertificate((Certificate)newValue);
				return;
			case UsertypePackage.PERSON__CERTIFICATES:
				getCertificates().clear();
				getCertificates().addAll((Collection<? extends Certificate>)newValue);
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
			case UsertypePackage.PERSON__CERTIFICATE:
				setCertificate((Certificate)null);
				return;
			case UsertypePackage.PERSON__CERTIFICATES:
				getCertificates().clear();
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
			case UsertypePackage.PERSON__CERTIFICATE:
				return certificate != null;
			case UsertypePackage.PERSON__CERTIFICATES:
				return certificates != null && !certificates.isEmpty();
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

} // PersonImpl