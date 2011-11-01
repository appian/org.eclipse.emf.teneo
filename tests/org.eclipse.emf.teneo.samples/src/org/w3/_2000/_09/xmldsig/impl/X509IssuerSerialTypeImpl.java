/**
 * <copyright>
 * </copyright>
 *
 * $Id: X509IssuerSerialTypeImpl.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.w3._2000._09.xmldsig.X509IssuerSerialType;
import org.w3._2000._09.xmldsig.XmldsigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>X509 Issuer Serial Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl#getX509IssuerName <em>X509 Issuer Name</em>}</li>
 *   <li>{@link org.w3._2000._09.xmldsig.impl.X509IssuerSerialTypeImpl#getX509SerialNumber <em>X509 Serial Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class X509IssuerSerialTypeImpl extends EObjectImpl implements X509IssuerSerialType {
	/**
	 * The default value of the '{@link #getX509IssuerName() <em>X509 Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509IssuerName()
	 * @generated
	 * @ordered
	 */
	protected static final String X509_ISSUER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX509IssuerName() <em>X509 Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509IssuerName()
	 * @generated
	 * @ordered
	 */
	protected String x509IssuerName = X509_ISSUER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getX509SerialNumber() <em>X509 Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509SerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger X509_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX509SerialNumber() <em>X509 Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX509SerialNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger x509SerialNumber = X509_SERIAL_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected X509IssuerSerialTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmldsigPackage.Literals.X509_ISSUER_SERIAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX509IssuerName() {
		return x509IssuerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509IssuerName(String newX509IssuerName) {
		String oldX509IssuerName = x509IssuerName;
		x509IssuerName = newX509IssuerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME, oldX509IssuerName, x509IssuerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getX509SerialNumber() {
		return x509SerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX509SerialNumber(BigInteger newX509SerialNumber) {
		BigInteger oldX509SerialNumber = x509SerialNumber;
		x509SerialNumber = newX509SerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER, oldX509SerialNumber, x509SerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME:
				return getX509IssuerName();
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER:
				return getX509SerialNumber();
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
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME:
				setX509IssuerName((String)newValue);
				return;
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER:
				setX509SerialNumber((BigInteger)newValue);
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
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME:
				setX509IssuerName(X509_ISSUER_NAME_EDEFAULT);
				return;
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER:
				setX509SerialNumber(X509_SERIAL_NUMBER_EDEFAULT);
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
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_ISSUER_NAME:
				return X509_ISSUER_NAME_EDEFAULT == null ? x509IssuerName != null : !X509_ISSUER_NAME_EDEFAULT.equals(x509IssuerName);
			case XmldsigPackage.X509_ISSUER_SERIAL_TYPE__X509_SERIAL_NUMBER:
				return X509_SERIAL_NUMBER_EDEFAULT == null ? x509SerialNumber != null : !X509_SERIAL_NUMBER_EDEFAULT.equals(x509SerialNumber);
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
		result.append(" (x509IssuerName: ");
		result.append(x509IssuerName);
		result.append(", x509SerialNumber: ");
		result.append(x509SerialNumber);
		result.append(')');
		return result.toString();
	}

} //X509IssuerSerialTypeImpl
