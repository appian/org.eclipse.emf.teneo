/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeeImpl.java,v 1.1 2008/06/29 20:09:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.otopk.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee;
import org.eclipse.emf.teneo.samples.emf.annotations.otopk.EmployeeInfo;
import org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.impl.EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.impl.EmployeeImpl#getEmployeeInfo <em>Employee Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
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
	 * The cached value of the '{@link #getEmployeeInfo() <em>Employee Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeInfo()
	 * @generated
	 * @ordered
	 */
	protected EmployeeInfo employeeInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OtopkPackage.Literals.EMPLOYEE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OtopkPackage.EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeInfo getEmployeeInfo() {
		if (employeeInfo != null && employeeInfo.eIsProxy()) {
			InternalEObject oldEmployeeInfo = (InternalEObject)employeeInfo;
			employeeInfo = (EmployeeInfo)eResolveProxy(oldEmployeeInfo);
			if (employeeInfo != oldEmployeeInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OtopkPackage.EMPLOYEE__EMPLOYEE_INFO, oldEmployeeInfo, employeeInfo));
			}
		}
		return employeeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeInfo basicGetEmployeeInfo() {
		return employeeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeInfo(EmployeeInfo newEmployeeInfo) {
		EmployeeInfo oldEmployeeInfo = employeeInfo;
		employeeInfo = newEmployeeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OtopkPackage.EMPLOYEE__EMPLOYEE_INFO, oldEmployeeInfo, employeeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OtopkPackage.EMPLOYEE__ID:
				return new Long(getId());
			case OtopkPackage.EMPLOYEE__EMPLOYEE_INFO:
				if (resolve) return getEmployeeInfo();
				return basicGetEmployeeInfo();
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
			case OtopkPackage.EMPLOYEE__ID:
				setId(((Long)newValue).longValue());
				return;
			case OtopkPackage.EMPLOYEE__EMPLOYEE_INFO:
				setEmployeeInfo((EmployeeInfo)newValue);
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
			case OtopkPackage.EMPLOYEE__ID:
				setId(ID_EDEFAULT);
				return;
			case OtopkPackage.EMPLOYEE__EMPLOYEE_INFO:
				setEmployeeInfo((EmployeeInfo)null);
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
			case OtopkPackage.EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case OtopkPackage.EMPLOYEE__EMPLOYEE_INFO:
				return employeeInfo != null;
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

} //EmployeeImpl
