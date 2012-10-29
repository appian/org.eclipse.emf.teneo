/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignatureTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2000._09.xmldsig.KeyInfoType;
import org.w3._2000._09.xmldsig.ObjectType;
import org.w3._2000._09.xmldsig.SignatureType;
import org.w3._2000._09.xmldsig.SignatureValueType;
import org.w3._2000._09.xmldsig.SignedInfoType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Signature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl#getSignedInfo <em>Signed Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl#getSignatureValue <em>Signature Value
 * </em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl#getKeyInfo <em>Key Info</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl#getObject <em>Object</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignatureTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SignatureTypeImpl extends EObjectImpl implements SignatureType {
	/**
	 * The cached value of the '{@link #getSignedInfo() <em>Signed Info</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignedInfo()
	 * @generated
	 * @ordered
	 */
	protected SignedInfoType signedInfo;

	/**
	 * The cached value of the '{@link #getSignatureValue() <em>Signature Value</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignatureValue()
	 * @generated
	 * @ordered
	 */
	protected SignatureValueType signatureValue;

	/**
	 * The cached value of the '{@link #getKeyInfo() <em>Key Info</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKeyInfo()
	 * @generated
	 * @ordered
	 */
	protected KeyInfoType keyInfo;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectType> object;

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
	protected SignatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.SIGNATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignedInfoType getSignedInfo() {
		return signedInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignedInfo(SignedInfoType newSignedInfo, NotificationChain msgs) {
		SignedInfoType oldSignedInfo = signedInfo;
		signedInfo = newSignedInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO, oldSignedInfo, newSignedInfo);
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
	public void setSignedInfo(SignedInfoType newSignedInfo) {
		if (newSignedInfo != signedInfo) {
			NotificationChain msgs = null;
			if (signedInfo != null)
				msgs = ((InternalEObject) signedInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO, null, msgs);
			if (newSignedInfo != null)
				msgs = ((InternalEObject) newSignedInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO, null, msgs);
			msgs = basicSetSignedInfo(newSignedInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO, newSignedInfo, newSignedInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SignatureValueType getSignatureValue() {
		return signatureValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSignatureValue(SignatureValueType newSignatureValue,
			NotificationChain msgs) {
		SignatureValueType oldSignatureValue = signatureValue;
		signatureValue = newSignatureValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE, oldSignatureValue, newSignatureValue);
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
	public void setSignatureValue(SignatureValueType newSignatureValue) {
		if (newSignatureValue != signatureValue) {
			NotificationChain msgs = null;
			if (signatureValue != null)
				msgs = ((InternalEObject) signatureValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE, null, msgs);
			if (newSignatureValue != null)
				msgs = ((InternalEObject) newSignatureValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE, null, msgs);
			msgs = basicSetSignatureValue(newSignatureValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE, newSignatureValue, newSignatureValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public KeyInfoType getKeyInfo() {
		return keyInfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetKeyInfo(KeyInfoType newKeyInfo, NotificationChain msgs) {
		KeyInfoType oldKeyInfo = keyInfo;
		keyInfo = newKeyInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__KEY_INFO, oldKeyInfo, newKeyInfo);
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
	public void setKeyInfo(KeyInfoType newKeyInfo) {
		if (newKeyInfo != keyInfo) {
			NotificationChain msgs = null;
			if (keyInfo != null)
				msgs = ((InternalEObject) keyInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__KEY_INFO, null, msgs);
			if (newKeyInfo != null)
				msgs = ((InternalEObject) newKeyInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- XmldsigPackage.SIGNATURE_TYPE__KEY_INFO, null, msgs);
			msgs = basicSetKeyInfo(newKeyInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_TYPE__KEY_INFO, newKeyInfo, newKeyInfo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		if (object == null) {
			object = new EObjectContainmentEList<ObjectType>(ObjectType.class, this,
					XmldsigPackage.SIGNATURE_TYPE__OBJECT);
		}
		return object;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.SIGNATURE_TYPE__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO:
			return basicSetSignedInfo(null, msgs);
		case XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE:
			return basicSetSignatureValue(null, msgs);
		case XmldsigPackage.SIGNATURE_TYPE__KEY_INFO:
			return basicSetKeyInfo(null, msgs);
		case XmldsigPackage.SIGNATURE_TYPE__OBJECT:
			return ((InternalEList<?>) getObject()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO:
			return getSignedInfo();
		case XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE:
			return getSignatureValue();
		case XmldsigPackage.SIGNATURE_TYPE__KEY_INFO:
			return getKeyInfo();
		case XmldsigPackage.SIGNATURE_TYPE__OBJECT:
			return getObject();
		case XmldsigPackage.SIGNATURE_TYPE__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO:
			setSignedInfo((SignedInfoType) newValue);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE:
			setSignatureValue((SignatureValueType) newValue);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__KEY_INFO:
			setKeyInfo((KeyInfoType) newValue);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__OBJECT:
			getObject().clear();
			getObject().addAll((Collection<? extends ObjectType>) newValue);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__ID:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO:
			setSignedInfo((SignedInfoType) null);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE:
			setSignatureValue((SignatureValueType) null);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__KEY_INFO:
			setKeyInfo((KeyInfoType) null);
			return;
		case XmldsigPackage.SIGNATURE_TYPE__OBJECT:
			getObject().clear();
			return;
		case XmldsigPackage.SIGNATURE_TYPE__ID:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XmldsigPackage.SIGNATURE_TYPE__SIGNED_INFO:
			return signedInfo != null;
		case XmldsigPackage.SIGNATURE_TYPE__SIGNATURE_VALUE:
			return signatureValue != null;
		case XmldsigPackage.SIGNATURE_TYPE__KEY_INFO:
			return keyInfo != null;
		case XmldsigPackage.SIGNATURE_TYPE__OBJECT:
			return object != null && !object.isEmpty();
		case XmldsigPackage.SIGNATURE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // SignatureTypeImpl
