/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeeImpl.java,v 1.1 2008/07/13 13:12:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Address;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.impl.EmployeeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.impl.EmployeeImpl#getEmployeeNumber <em>Employee Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends PersonImpl implements Employee {
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * The default value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected String employeeNumber = EMPLOYEE_NUMBER_EDEFAULT;

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
		return AttroverridesecondarytablePackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (Address)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeNumber(String newEmployeeNumber) {
		String oldEmployeeNumber = employeeNumber;
		employeeNumber = newEmployeeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttroverridesecondarytablePackage.EMPLOYEE__EMPLOYEE_NUMBER, oldEmployeeNumber, employeeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
			case AttroverridesecondarytablePackage.EMPLOYEE__EMPLOYEE_NUMBER:
				return getEmployeeNumber();
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
			case AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS:
				setAddress((Address)newValue);
				return;
			case AttroverridesecondarytablePackage.EMPLOYEE__EMPLOYEE_NUMBER:
				setEmployeeNumber((String)newValue);
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
			case AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS:
				setAddress((Address)null);
				return;
			case AttroverridesecondarytablePackage.EMPLOYEE__EMPLOYEE_NUMBER:
				setEmployeeNumber(EMPLOYEE_NUMBER_EDEFAULT);
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
			case AttroverridesecondarytablePackage.EMPLOYEE__ADDRESS:
				return address != null;
			case AttroverridesecondarytablePackage.EMPLOYEE__EMPLOYEE_NUMBER:
				return EMPLOYEE_NUMBER_EDEFAULT == null ? employeeNumber != null : !EMPLOYEE_NUMBER_EDEFAULT.equals(employeeNumber);
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
		result.append(" (employeeNumber: ");
		result.append(employeeNumber);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
