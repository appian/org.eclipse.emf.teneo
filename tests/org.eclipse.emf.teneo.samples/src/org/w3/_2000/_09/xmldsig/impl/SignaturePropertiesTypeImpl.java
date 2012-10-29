/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignaturePropertiesTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
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

import org.w3._2000._09.xmldsig.SignaturePropertiesType;
import org.w3._2000._09.xmldsig.SignaturePropertyType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Signature Properties Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl#getSignatureProperty <em>
 * Signature Property</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.SignaturePropertiesTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SignaturePropertiesTypeImpl extends EObjectImpl implements SignaturePropertiesType {
	/**
	 * The cached value of the '{@link #getSignatureProperty() <em>Signature Property</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignatureProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SignaturePropertyType> signatureProperty;

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
	protected SignaturePropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.SIGNATURE_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SignaturePropertyType> getSignatureProperty() {
		if (signatureProperty == null) {
			signatureProperty = new EObjectContainmentEList<SignaturePropertyType>(
					SignaturePropertyType.class, this,
					XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY);
		}
		return signatureProperty;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__ID, oldId, id));
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
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY:
			return ((InternalEList<?>) getSignatureProperty()).basicRemove(otherEnd, msgs);
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
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY:
			return getSignatureProperty();
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__ID:
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
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY:
			getSignatureProperty().clear();
			getSignatureProperty().addAll((Collection<? extends SignaturePropertyType>) newValue);
			return;
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__ID:
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
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY:
			getSignatureProperty().clear();
			return;
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__ID:
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
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__SIGNATURE_PROPERTY:
			return signatureProperty != null && !signatureProperty.isEmpty();
		case XmldsigPackage.SIGNATURE_PROPERTIES_TYPE__ID:
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

} // SignaturePropertiesTypeImpl
