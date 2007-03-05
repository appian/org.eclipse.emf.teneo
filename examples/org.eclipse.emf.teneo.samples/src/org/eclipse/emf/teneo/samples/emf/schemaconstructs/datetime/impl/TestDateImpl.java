/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestDateImpl.java,v 1.1.2.2 2007/03/05 18:07:53 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.DatetimePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.TestDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Date</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.impl.TestDateImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.datetime.impl.TestDateImpl#getDatetime <em>Datetime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestDateImpl extends EObjectImpl implements TestDate {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Object date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected Object datetime = DATETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DatetimePackage.Literals.TEST_DATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Object newDate) {
		Object oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetimePackage.TEST_DATE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatetime(Object newDatetime) {
		Object oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatetimePackage.TEST_DATE__DATETIME, oldDatetime, datetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatetimePackage.TEST_DATE__DATE:
				return getDate();
			case DatetimePackage.TEST_DATE__DATETIME:
				return getDatetime();
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
			case DatetimePackage.TEST_DATE__DATE:
				setDate((Object)newValue);
				return;
			case DatetimePackage.TEST_DATE__DATETIME:
				setDatetime((Object)newValue);
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
			case DatetimePackage.TEST_DATE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case DatetimePackage.TEST_DATE__DATETIME:
				setDatetime(DATETIME_EDEFAULT);
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
			case DatetimePackage.TEST_DATE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case DatetimePackage.TEST_DATE__DATETIME:
				return DATETIME_EDEFAULT == null ? datetime != null : !DATETIME_EDEFAULT.equals(datetime);
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
		result.append(" (date: ");
		result.append(date);
		result.append(", datetime: ");
		result.append(datetime);
		result.append(')');
		return result.toString();
	}

} //TestDateImpl