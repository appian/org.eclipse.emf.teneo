/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestImpl.java,v 1.1 2011/02/21 05:47:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz336501.impl;

import java.sql.Timestamp;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package;
import org.eclipse.emf.teneo.samples.issues.bz336501.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.impl.TestImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.impl.TestImpl#getDateOrTime <em>Date Or Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.impl.TestImpl#getDateOrTimes <em>Date Or Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestImpl extends EObjectImpl implements Test {
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
	 * The default value of the '{@link #getDateOrTime() <em>Date Or Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOrTime()
	 * @generated
	 * @ordered
	 */
	protected static final Timestamp DATE_OR_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOrTime() <em>Date Or Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOrTime()
	 * @generated
	 * @ordered
	 */
	protected Timestamp dateOrTime = DATE_OR_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateOrTimes() <em>Date Or Times</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOrTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<Timestamp> dateOrTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz336501Package.Literals.TEST;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz336501Package.TEST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp getDateOrTime() {
		return dateOrTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOrTime(Timestamp newDateOrTime) {
		Timestamp oldDateOrTime = dateOrTime;
		dateOrTime = newDateOrTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz336501Package.TEST__DATE_OR_TIME, oldDateOrTime, dateOrTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timestamp> getDateOrTimes() {
		if (dateOrTimes == null) {
			dateOrTimes = new EDataTypeEList<Timestamp>(Timestamp.class, this, Bz336501Package.TEST__DATE_OR_TIMES);
		}
		return dateOrTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz336501Package.TEST__NAME:
				return getName();
			case Bz336501Package.TEST__DATE_OR_TIME:
				return getDateOrTime();
			case Bz336501Package.TEST__DATE_OR_TIMES:
				return getDateOrTimes();
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
			case Bz336501Package.TEST__NAME:
				setName((String)newValue);
				return;
			case Bz336501Package.TEST__DATE_OR_TIME:
				setDateOrTime((Timestamp)newValue);
				return;
			case Bz336501Package.TEST__DATE_OR_TIMES:
				getDateOrTimes().clear();
				getDateOrTimes().addAll((Collection<? extends Timestamp>)newValue);
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
			case Bz336501Package.TEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bz336501Package.TEST__DATE_OR_TIME:
				setDateOrTime(DATE_OR_TIME_EDEFAULT);
				return;
			case Bz336501Package.TEST__DATE_OR_TIMES:
				getDateOrTimes().clear();
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
			case Bz336501Package.TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Bz336501Package.TEST__DATE_OR_TIME:
				return DATE_OR_TIME_EDEFAULT == null ? dateOrTime != null : !DATE_OR_TIME_EDEFAULT.equals(dateOrTime);
			case Bz336501Package.TEST__DATE_OR_TIMES:
				return dateOrTimes != null && !dateOrTimes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", dateOrTime: ");
		result.append(dateOrTime);
		result.append(", dateOrTimes: ");
		result.append(dateOrTimes);
		result.append(')');
		return result.toString();
	}

} //TestImpl
