/**
 * <copyright>
 * </copyright>
 *
 * $Id: CityImpl.java,v 1.1 2008/09/21 18:35:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz245634.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package;
import org.eclipse.emf.teneo.samples.issues.bz245634.City;
import org.eclipse.emf.teneo.samples.issues.bz245634.Country;
import org.eclipse.emf.teneo.samples.issues.bz245634.Mayor;
import org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl#getMayor <em>Mayor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl#getPoliceChief <em>Police Chief</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.impl.CityImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityImpl extends EObjectImpl implements City {
	/**
	 * The cached value of the '{@link #getMayor() <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMayor()
	 * @generated
	 * @ordered
	 */
	protected Mayor mayor;

	/**
	 * The cached value of the '{@link #getPoliceChief() <em>Police Chief</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoliceChief()
	 * @generated
	 * @ordered
	 */
	protected PoliceChief policeChief;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz245634Package.Literals.CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor getMayor() {
		if (mayor != null && mayor.eIsProxy()) {
			InternalEObject oldMayor = (InternalEObject)mayor;
			mayor = (Mayor)eResolveProxy(oldMayor);
			if (mayor != oldMayor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz245634Package.CITY__MAYOR, oldMayor, mayor));
			}
		}
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mayor basicGetMayor() {
		return mayor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMayor(Mayor newMayor, NotificationChain msgs) {
		Mayor oldMayor = mayor;
		mayor = newMayor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__MAYOR, oldMayor, newMayor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMayor(Mayor newMayor) {
		if (newMayor != mayor) {
			NotificationChain msgs = null;
			if (mayor != null)
				msgs = ((InternalEObject)mayor).eInverseRemove(this, Bz245634Package.MAYOR__CITY, Mayor.class, msgs);
			if (newMayor != null)
				msgs = ((InternalEObject)newMayor).eInverseAdd(this, Bz245634Package.MAYOR__CITY, Mayor.class, msgs);
			msgs = basicSetMayor(newMayor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__MAYOR, newMayor, newMayor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliceChief getPoliceChief() {
		if (policeChief != null && policeChief.eIsProxy()) {
			InternalEObject oldPoliceChief = (InternalEObject)policeChief;
			policeChief = (PoliceChief)eResolveProxy(oldPoliceChief);
			if (policeChief != oldPoliceChief) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz245634Package.CITY__POLICE_CHIEF, oldPoliceChief, policeChief));
			}
		}
		return policeChief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliceChief basicGetPoliceChief() {
		return policeChief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoliceChief(PoliceChief newPoliceChief, NotificationChain msgs) {
		PoliceChief oldPoliceChief = policeChief;
		policeChief = newPoliceChief;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__POLICE_CHIEF, oldPoliceChief, newPoliceChief);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoliceChief(PoliceChief newPoliceChief) {
		if (newPoliceChief != policeChief) {
			NotificationChain msgs = null;
			if (policeChief != null)
				msgs = ((InternalEObject)policeChief).eInverseRemove(this, Bz245634Package.POLICE_CHIEF__CITY, PoliceChief.class, msgs);
			if (newPoliceChief != null)
				msgs = ((InternalEObject)newPoliceChief).eInverseAdd(this, Bz245634Package.POLICE_CHIEF__CITY, PoliceChief.class, msgs);
			msgs = basicSetPoliceChief(newPoliceChief, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__POLICE_CHIEF, newPoliceChief, newPoliceChief));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz245634Package.CITY__COUNTRY, oldCountry, country));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz245634Package.CITY__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz245634Package.CITY__MAYOR:
				if (mayor != null)
					msgs = ((InternalEObject)mayor).eInverseRemove(this, Bz245634Package.MAYOR__CITY, Mayor.class, msgs);
				return basicSetMayor((Mayor)otherEnd, msgs);
			case Bz245634Package.CITY__POLICE_CHIEF:
				if (policeChief != null)
					msgs = ((InternalEObject)policeChief).eInverseRemove(this, Bz245634Package.POLICE_CHIEF__CITY, PoliceChief.class, msgs);
				return basicSetPoliceChief((PoliceChief)otherEnd, msgs);
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
			case Bz245634Package.CITY__MAYOR:
				return basicSetMayor(null, msgs);
			case Bz245634Package.CITY__POLICE_CHIEF:
				return basicSetPoliceChief(null, msgs);
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
			case Bz245634Package.CITY__MAYOR:
				if (resolve) return getMayor();
				return basicGetMayor();
			case Bz245634Package.CITY__POLICE_CHIEF:
				if (resolve) return getPoliceChief();
				return basicGetPoliceChief();
			case Bz245634Package.CITY__ID:
				return new Long(getId());
			case Bz245634Package.CITY__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
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
			case Bz245634Package.CITY__MAYOR:
				setMayor((Mayor)newValue);
				return;
			case Bz245634Package.CITY__POLICE_CHIEF:
				setPoliceChief((PoliceChief)newValue);
				return;
			case Bz245634Package.CITY__ID:
				setId(((Long)newValue).longValue());
				return;
			case Bz245634Package.CITY__COUNTRY:
				setCountry((Country)newValue);
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
			case Bz245634Package.CITY__MAYOR:
				setMayor((Mayor)null);
				return;
			case Bz245634Package.CITY__POLICE_CHIEF:
				setPoliceChief((PoliceChief)null);
				return;
			case Bz245634Package.CITY__ID:
				setId(ID_EDEFAULT);
				return;
			case Bz245634Package.CITY__COUNTRY:
				setCountry((Country)null);
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
			case Bz245634Package.CITY__MAYOR:
				return mayor != null;
			case Bz245634Package.CITY__POLICE_CHIEF:
				return policeChief != null;
			case Bz245634Package.CITY__ID:
				return id != ID_EDEFAULT;
			case Bz245634Package.CITY__COUNTRY:
				return country != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CityImpl
