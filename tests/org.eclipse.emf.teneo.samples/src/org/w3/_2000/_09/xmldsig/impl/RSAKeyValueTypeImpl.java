/**
 * <copyright>
 * </copyright>
 *
 * $Id: RSAKeyValueTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._2000._09.xmldsig.RSAKeyValueType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>RSA Key Value Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl#getModulus <em>Modulus</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.impl.RSAKeyValueTypeImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RSAKeyValueTypeImpl extends EObjectImpl implements RSAKeyValueType {
	/**
	 * The default value of the '{@link #getModulus() <em>Modulus</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getModulus()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] MODULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulus() <em>Modulus</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getModulus()
	 * @generated
	 * @ordered
	 */
	protected byte[] modulus = MODULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] EXPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected byte[] exponent = EXPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RSAKeyValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.RSA_KEY_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public byte[] getModulus() {
		return modulus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModulus(byte[] newModulus) {
		byte[] oldModulus = modulus;
		modulus = newModulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.RSA_KEY_VALUE_TYPE__MODULUS, oldModulus, modulus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public byte[] getExponent() {
		return exponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setExponent(byte[] newExponent) {
		byte[] oldExponent = exponent;
		exponent = newExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					XmldsigPackage.RSA_KEY_VALUE_TYPE__EXPONENT, oldExponent, exponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__MODULUS:
			return getModulus();
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__EXPONENT:
			return getExponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__MODULUS:
			setModulus((byte[]) newValue);
			return;
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__EXPONENT:
			setExponent((byte[]) newValue);
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
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__MODULUS:
			setModulus(MODULUS_EDEFAULT);
			return;
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__EXPONENT:
			setExponent(EXPONENT_EDEFAULT);
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
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__MODULUS:
			return MODULUS_EDEFAULT == null ? modulus != null : !MODULUS_EDEFAULT.equals(modulus);
		case XmldsigPackage.RSA_KEY_VALUE_TYPE__EXPONENT:
			return EXPONENT_EDEFAULT == null ? exponent != null : !EXPONENT_EDEFAULT.equals(exponent);
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
		result.append(" (modulus: ");
		result.append(modulus);
		result.append(", exponent: ");
		result.append(exponent);
		result.append(')');
		return result.toString();
	}

} // RSAKeyValueTypeImpl
