/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeeImpl.java,v 1.1 2008/04/23 15:45:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.employee.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.employee.Employee;
import org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.impl.EmployeeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.impl.EmployeeImpl#getHireDate <em>Hire Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
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
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final int SALARY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected int salary = SALARY_EDEFAULT;

	/**
	 * This is true if the Salary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean salaryESet;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * This is true if the Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ageESet;

	/**
	 * The default value of the '{@link #getHireDate() <em>Hire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date HIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHireDate() <em>Hire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHireDate()
	 * @generated
	 * @ordered
	 */
	protected Date hireDate = HIRE_DATE_EDEFAULT;

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
		return EmployeePackage.Literals.EMPLOYEE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(int newSalary) {
		int oldSalary = salary;
		salary = newSalary;
		boolean oldSalaryESet = salaryESet;
		salaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__SALARY, oldSalary, salary, !oldSalaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSalary() {
		int oldSalary = salary;
		boolean oldSalaryESet = salaryESet;
		salary = SALARY_EDEFAULT;
		salaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmployeePackage.EMPLOYEE__SALARY, oldSalary, SALARY_EDEFAULT, oldSalaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSalary() {
		return salaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		boolean oldAgeESet = ageESet;
		ageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__AGE, oldAge, age, !oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAge() {
		int oldAge = age;
		boolean oldAgeESet = ageESet;
		age = AGE_EDEFAULT;
		ageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EmployeePackage.EMPLOYEE__AGE, oldAge, AGE_EDEFAULT, oldAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAge() {
		return ageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getHireDate() {
		return hireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHireDate(Date newHireDate) {
		Date oldHireDate = hireDate;
		hireDate = newHireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmployeePackage.EMPLOYEE__HIRE_DATE, oldHireDate, hireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmployeePackage.EMPLOYEE__NAME:
				return getName();
			case EmployeePackage.EMPLOYEE__SALARY:
				return new Integer(getSalary());
			case EmployeePackage.EMPLOYEE__AGE:
				return new Integer(getAge());
			case EmployeePackage.EMPLOYEE__HIRE_DATE:
				return getHireDate();
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
			case EmployeePackage.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case EmployeePackage.EMPLOYEE__SALARY:
				setSalary(((Integer)newValue).intValue());
				return;
			case EmployeePackage.EMPLOYEE__AGE:
				setAge(((Integer)newValue).intValue());
				return;
			case EmployeePackage.EMPLOYEE__HIRE_DATE:
				setHireDate((Date)newValue);
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
			case EmployeePackage.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmployeePackage.EMPLOYEE__SALARY:
				unsetSalary();
				return;
			case EmployeePackage.EMPLOYEE__AGE:
				unsetAge();
				return;
			case EmployeePackage.EMPLOYEE__HIRE_DATE:
				setHireDate(HIRE_DATE_EDEFAULT);
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
			case EmployeePackage.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmployeePackage.EMPLOYEE__SALARY:
				return isSetSalary();
			case EmployeePackage.EMPLOYEE__AGE:
				return isSetAge();
			case EmployeePackage.EMPLOYEE__HIRE_DATE:
				return HIRE_DATE_EDEFAULT == null ? hireDate != null : !HIRE_DATE_EDEFAULT.equals(hireDate);
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
		result.append(", salary: ");
		if (salaryESet) result.append(salary); else result.append("<unset>");
		result.append(", age: ");
		if (ageESet) result.append(age); else result.append("<unset>");
		result.append(", hireDate: ");
		result.append(hireDate);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
