/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.Address;
import lobj.LobjPackage;
import lobj.Publisher;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Publisher</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.PublisherImpl#getPublishername <em>Publishername</em>}</li>
 * <li>{@link lobj.impl.PublisherImpl#getAddress <em>Address</em>}</li>
 * <li>{@link lobj.impl.PublisherImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PublisherImpl extends EObjectImpl implements Publisher {
	/**
	 * The default value of the '{@link #getPublishername() <em>Publishername</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPublishername()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishername() <em>Publishername</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPublishername()
	 * @generated
	 * @ordered
	 */
	protected String publishername = PUBLISHERNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

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
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPublishername() {
		return publishername;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPublishername(String newPublishername) {
		String oldPublishername = publishername;
		publishername = newPublishername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISHER__PUBLISHERNAME,
					oldPublishername, publishername));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LobjPackage.PUBLISHER__ADDRESS, oldAddress, newAddress);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.PUBLISHER__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.PUBLISHER__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISHER__ADDRESS,
					newAddress, newAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.PUBLISHER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.PUBLISHER__ADDRESS:
			return basicSetAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.PUBLISHER__PUBLISHERNAME:
			return getPublishername();
		case LobjPackage.PUBLISHER__ADDRESS:
			return getAddress();
		case LobjPackage.PUBLISHER__ID:
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
		case LobjPackage.PUBLISHER__PUBLISHERNAME:
			setPublishername((String) newValue);
			return;
		case LobjPackage.PUBLISHER__ADDRESS:
			setAddress((Address) newValue);
			return;
		case LobjPackage.PUBLISHER__ID:
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
		case LobjPackage.PUBLISHER__PUBLISHERNAME:
			setPublishername(PUBLISHERNAME_EDEFAULT);
			return;
		case LobjPackage.PUBLISHER__ADDRESS:
			setAddress((Address) null);
			return;
		case LobjPackage.PUBLISHER__ID:
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
		case LobjPackage.PUBLISHER__PUBLISHERNAME:
			return PUBLISHERNAME_EDEFAULT == null ? publishername != null : !PUBLISHERNAME_EDEFAULT
					.equals(publishername);
		case LobjPackage.PUBLISHER__ADDRESS:
			return address != null;
		case LobjPackage.PUBLISHER__ID:
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
		result.append(" (publishername: ");
		result.append(publishername);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // PublisherImpl
