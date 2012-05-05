/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeInfoImpl#getEmployee <em>Employee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeInfoImpl extends EObjectImpl implements EmployeeInfo {
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
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Employee employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrphanremovalPackage.Literals.EMPLOYEE_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE_INFO__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject)employee;
			employee = (Employee)eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmployee(Employee newEmployee, NotificationChain msgs) {
		Employee oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, oldEmployee, newEmployee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployee(Employee newEmployee) {
		if (newEmployee != employee) {
			NotificationChain msgs = null;
			if (employee != null)
				msgs = ((InternalEObject)employee).eInverseRemove(this, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, Employee.class, msgs);
			if (newEmployee != null)
				msgs = ((InternalEObject)newEmployee).eInverseAdd(this, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, Employee.class, msgs);
			msgs = basicSetEmployee(newEmployee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, newEmployee, newEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				if (employee != null)
					msgs = ((InternalEObject)employee).eInverseRemove(this, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, Employee.class, msgs);
				return basicSetEmployee((Employee)otherEnd, msgs);
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
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				return basicSetEmployee(null, msgs);
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
			case OrphanremovalPackage.EMPLOYEE_INFO__ID:
				return getId();
			case OrphanremovalPackage.EMPLOYEE_INFO__NAME:
				return getName();
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
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
			case OrphanremovalPackage.EMPLOYEE_INFO__ID:
				setId((Long)newValue);
				return;
			case OrphanremovalPackage.EMPLOYEE_INFO__NAME:
				setName((String)newValue);
				return;
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				setEmployee((Employee)newValue);
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
			case OrphanremovalPackage.EMPLOYEE_INFO__ID:
				setId(ID_EDEFAULT);
				return;
			case OrphanremovalPackage.EMPLOYEE_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				setEmployee((Employee)null);
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
			case OrphanremovalPackage.EMPLOYEE_INFO__ID:
				return id != ID_EDEFAULT;
			case OrphanremovalPackage.EMPLOYEE_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE:
				return employee != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EmployeeInfoImpl
