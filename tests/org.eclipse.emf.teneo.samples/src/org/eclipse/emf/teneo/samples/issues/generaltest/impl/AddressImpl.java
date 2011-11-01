/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressImpl.java,v 1.2 2007/07/09 17:39:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.generaltest.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.issues.generaltest.Address;
import org.eclipse.emf.teneo.samples.issues.generaltest.Contact;
import org.eclipse.emf.teneo.samples.issues.generaltest.City;
import org.eclipse.emf.teneo.samples.issues.generaltest.Country;
import org.eclipse.emf.teneo.samples.issues.generaltest.GeneralTestPackage;
import org.eclipse.emf.teneo.samples.issues.generaltest.State;
import org.eclipse.emf.teneo.samples.issues.generaltest.TC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.generaltest.impl.AddressImpl#getVolatileString <em>Volatile String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends EObjectImpl implements Address {
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
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getTc() <em>Tc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTc()
	 * @generated
	 * @ordered
	 */
	protected EList<TC> tc;

	/**
	 * The default value of the '{@link #getVolatileString() <em>Volatile String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatileString()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLATILE_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneralTestPackage.Literals.ADDRESS;
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
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralTestPackage.ADDRESS__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts =
					new EObjectContainmentWithInverseEList<Contact>(Contact.class, this,
						GeneralTestPackage.ADDRESS__CONTACTS, GeneralTestPackage.CONTACT__ADDRESS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject) state;
			state = (State) eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralTestPackage.ADDRESS__STATE,
						oldState, state));
				}
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralTestPackage.ADDRESS__STATE, oldState, state));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject) country;
			country = (Country) eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneralTestPackage.ADDRESS__COUNTRY,
						oldCountry, country));
				}
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralTestPackage.ADDRESS__COUNTRY, oldCountry,
				country));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(City newCity, NotificationChain msgs) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification =
					new ENotificationImpl(this, Notification.SET, GeneralTestPackage.ADDRESS__CITY, oldCity, newCity);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null) {
				msgs =
						((InternalEObject) city).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
								GeneralTestPackage.ADDRESS__CITY, null, msgs);
			}
			if (newCity != null) {
				msgs =
						((InternalEObject) newCity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
								GeneralTestPackage.ADDRESS__CITY, null, msgs);
			}
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, GeneralTestPackage.ADDRESS__CITY, newCity, newCity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TC> getTc() {
		if (tc == null) {
			tc =
					new EObjectContainmentWithInverseEList<TC>(TC.class, this, GeneralTestPackage.ADDRESS__TC,
						GeneralTestPackage.TC__ADDRESS);
		}
		return tc;
	}

	private String volatileString = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getVolatileString() {
		return volatileString;
// // TODO: implement this method to return the 'Volatile String' attribute
// // Ensure that you remove @generated or mark it @generated NOT
// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatileString(String newVolatileString) {
		volatileString = newVolatileString;
// // TODO: implement this method to set the 'Volatile String' attribute
// // Ensure that you remove @generated or mark it @generated NOT
// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneralTestPackage.ADDRESS__CONTACTS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getContacts()).basicAdd(otherEnd, msgs);
			case GeneralTestPackage.ADDRESS__TC:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTc()).basicAdd(otherEnd, msgs);
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
			case GeneralTestPackage.ADDRESS__CONTACTS:
				return ((InternalEList<?>) getContacts()).basicRemove(otherEnd, msgs);
			case GeneralTestPackage.ADDRESS__CITY:
				return basicSetCity(null, msgs);
			case GeneralTestPackage.ADDRESS__TC:
				return ((InternalEList<?>) getTc()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneralTestPackage.ADDRESS__NAME:
				return getName();
			case GeneralTestPackage.ADDRESS__CONTACTS:
				return getContacts();
			case GeneralTestPackage.ADDRESS__STATE:
				if (resolve) {
					return getState();
				}
				return basicGetState();
			case GeneralTestPackage.ADDRESS__COUNTRY:
				if (resolve) {
					return getCountry();
				}
				return basicGetCountry();
			case GeneralTestPackage.ADDRESS__CITY:
				return getCity();
			case GeneralTestPackage.ADDRESS__TC:
				return getTc();
			case GeneralTestPackage.ADDRESS__VOLATILE_STRING:
				return getVolatileString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneralTestPackage.ADDRESS__NAME:
				setName((String) newValue);
				return;
			case GeneralTestPackage.ADDRESS__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends Contact>) newValue);
				return;
			case GeneralTestPackage.ADDRESS__STATE:
				setState((State) newValue);
				return;
			case GeneralTestPackage.ADDRESS__COUNTRY:
				setCountry((Country) newValue);
				return;
			case GeneralTestPackage.ADDRESS__CITY:
				setCity((City) newValue);
				return;
			case GeneralTestPackage.ADDRESS__TC:
				getTc().clear();
				getTc().addAll((Collection<? extends TC>) newValue);
				return;
			case GeneralTestPackage.ADDRESS__VOLATILE_STRING:
				setVolatileString((String) newValue);
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
			case GeneralTestPackage.ADDRESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeneralTestPackage.ADDRESS__CONTACTS:
				getContacts().clear();
				return;
			case GeneralTestPackage.ADDRESS__STATE:
				setState((State) null);
				return;
			case GeneralTestPackage.ADDRESS__COUNTRY:
				setCountry((Country) null);
				return;
			case GeneralTestPackage.ADDRESS__CITY:
				setCity((City) null);
				return;
			case GeneralTestPackage.ADDRESS__TC:
				getTc().clear();
				return;
			case GeneralTestPackage.ADDRESS__VOLATILE_STRING:
				setVolatileString(VOLATILE_STRING_EDEFAULT);
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
			case GeneralTestPackage.ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeneralTestPackage.ADDRESS__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case GeneralTestPackage.ADDRESS__STATE:
				return state != null;
			case GeneralTestPackage.ADDRESS__COUNTRY:
				return country != null;
			case GeneralTestPackage.ADDRESS__CITY:
				return city != null;
			case GeneralTestPackage.ADDRESS__TC:
				return tc != null && !tc.isEmpty();
			case GeneralTestPackage.ADDRESS__VOLATILE_STRING:
				return VOLATILE_STRING_EDEFAULT == null ? getVolatileString() != null : !VOLATILE_STRING_EDEFAULT
					.equals(getVolatileString());
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
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // AddressImpl
