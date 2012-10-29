/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.Address;
import lobj.LobjPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Address</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.AddressImpl#getStreet <em>Street</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getPostcode <em>Postcode</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getCity <em>City</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getState <em>State</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getCountry <em>Country</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getPhone <em>Phone</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getFax <em>Fax</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getEmail <em>Email</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getOtheraddr <em>Otheraddr</em>}</li>
 * <li>{@link lobj.impl.AddressImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcode() <em>Postcode</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcode() <em>Postcode</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPostcode()
	 * @generated
	 * @ordered
	 */
	protected String postcode = POSTCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFax() <em>Fax</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected static final String FAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFax() <em>Fax</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFax()
	 * @generated
	 * @ordered
	 */
	protected String fax = FAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtheraddr() <em>Otheraddr</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOtheraddr()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHERADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtheraddr() <em>Otheraddr</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOtheraddr()
	 * @generated
	 * @ordered
	 */
	protected String otheraddr = OTHERADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__STREET, oldStreet,
					street));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPostcode(String newPostcode) {
		String oldPostcode = postcode;
		postcode = newPostcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__POSTCODE,
					oldPostcode, postcode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__CITY, oldCity,
					city));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__COUNTRY,
					oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__PHONE, oldPhone,
					phone));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFax(String newFax) {
		String oldFax = fax;
		fax = newFax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__FAX, oldFax, fax));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__EMAIL, oldEmail,
					email));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getOtheraddr() {
		return otheraddr;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOtheraddr(String newOtheraddr) {
		String oldOtheraddr = otheraddr;
		otheraddr = newOtheraddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__OTHERADDR,
					oldOtheraddr, otheraddr));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ADDRESS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.ADDRESS__STREET:
			return getStreet();
		case LobjPackage.ADDRESS__POSTCODE:
			return getPostcode();
		case LobjPackage.ADDRESS__CITY:
			return getCity();
		case LobjPackage.ADDRESS__STATE:
			return getState();
		case LobjPackage.ADDRESS__COUNTRY:
			return getCountry();
		case LobjPackage.ADDRESS__PHONE:
			return getPhone();
		case LobjPackage.ADDRESS__FAX:
			return getFax();
		case LobjPackage.ADDRESS__EMAIL:
			return getEmail();
		case LobjPackage.ADDRESS__OTHERADDR:
			return getOtheraddr();
		case LobjPackage.ADDRESS__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.ADDRESS__STREET:
			setStreet((String) newValue);
			return;
		case LobjPackage.ADDRESS__POSTCODE:
			setPostcode((String) newValue);
			return;
		case LobjPackage.ADDRESS__CITY:
			setCity((String) newValue);
			return;
		case LobjPackage.ADDRESS__STATE:
			setState((String) newValue);
			return;
		case LobjPackage.ADDRESS__COUNTRY:
			setCountry((String) newValue);
			return;
		case LobjPackage.ADDRESS__PHONE:
			setPhone((String) newValue);
			return;
		case LobjPackage.ADDRESS__FAX:
			setFax((String) newValue);
			return;
		case LobjPackage.ADDRESS__EMAIL:
			setEmail((String) newValue);
			return;
		case LobjPackage.ADDRESS__OTHERADDR:
			setOtheraddr((String) newValue);
			return;
		case LobjPackage.ADDRESS__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.ADDRESS__STREET:
			setStreet(STREET_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__POSTCODE:
			setPostcode(POSTCODE_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__STATE:
			setState(STATE_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__COUNTRY:
			setCountry(COUNTRY_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__PHONE:
			setPhone(PHONE_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__FAX:
			setFax(FAX_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__OTHERADDR:
			setOtheraddr(OTHERADDR_EDEFAULT);
			return;
		case LobjPackage.ADDRESS__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.ADDRESS__STREET:
			return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
		case LobjPackage.ADDRESS__POSTCODE:
			return POSTCODE_EDEFAULT == null ? postcode != null : !POSTCODE_EDEFAULT.equals(postcode);
		case LobjPackage.ADDRESS__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case LobjPackage.ADDRESS__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case LobjPackage.ADDRESS__COUNTRY:
			return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
		case LobjPackage.ADDRESS__PHONE:
			return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
		case LobjPackage.ADDRESS__FAX:
			return FAX_EDEFAULT == null ? fax != null : !FAX_EDEFAULT.equals(fax);
		case LobjPackage.ADDRESS__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case LobjPackage.ADDRESS__OTHERADDR:
			return OTHERADDR_EDEFAULT == null ? otheraddr != null : !OTHERADDR_EDEFAULT.equals(otheraddr);
		case LobjPackage.ADDRESS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (street: ");
		result.append(street);
		result.append(", postcode: ");
		result.append(postcode);
		result.append(", city: ");
		result.append(city);
		result.append(", state: ");
		result.append(state);
		result.append(", country: ");
		result.append(country);
		result.append(", phone: ");
		result.append(phone);
		result.append(", fax: ");
		result.append(fax);
		result.append(", email: ");
		result.append(email);
		result.append(", otheraddr: ");
		result.append(otheraddr);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // AddressImpl
