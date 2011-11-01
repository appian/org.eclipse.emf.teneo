/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeeImpl.java,v 1.1 2011/03/17 09:47:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321765.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package;
import org.eclipse.emf.teneo.samples.issues.bz321765.Employee;
import org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.impl.EmployeeImpl#getEmployeePK <em>Employee PK</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.impl.EmployeeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The cached value of the '{@link #getEmployeePK() <em>Employee PK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePK()
	 * @generated
	 * @ordered
	 */
	protected EmployeePK employeePK;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SALARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected BigInteger salary = SALARY_EDEFAULT;

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
		return Bz321765Package.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeePK getEmployeePK() {
		return employeePK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmployeePK(EmployeePK newEmployeePK, NotificationChain msgs) {
		EmployeePK oldEmployeePK = employeePK;
		employeePK = newEmployeePK;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz321765Package.EMPLOYEE__EMPLOYEE_PK, oldEmployeePK, newEmployeePK);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeePK(EmployeePK newEmployeePK) {
		if (newEmployeePK != employeePK) {
			NotificationChain msgs = null;
			if (employeePK != null)
				msgs = ((InternalEObject)employeePK).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bz321765Package.EMPLOYEE__EMPLOYEE_PK, null, msgs);
			if (newEmployeePK != null)
				msgs = ((InternalEObject)newEmployeePK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bz321765Package.EMPLOYEE__EMPLOYEE_PK, null, msgs);
			msgs = basicSetEmployeePK(newEmployeePK, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz321765Package.EMPLOYEE__EMPLOYEE_PK, newEmployeePK, newEmployeePK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz321765Package.EMPLOYEE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(BigInteger newSalary) {
		BigInteger oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz321765Package.EMPLOYEE__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz321765Package.EMPLOYEE__EMPLOYEE_PK:
				return basicSetEmployeePK(null, msgs);
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
			case Bz321765Package.EMPLOYEE__EMPLOYEE_PK:
				return getEmployeePK();
			case Bz321765Package.EMPLOYEE__TITLE:
				return getTitle();
			case Bz321765Package.EMPLOYEE__SALARY:
				return getSalary();
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
			case Bz321765Package.EMPLOYEE__EMPLOYEE_PK:
				setEmployeePK((EmployeePK)newValue);
				return;
			case Bz321765Package.EMPLOYEE__TITLE:
				setTitle((String)newValue);
				return;
			case Bz321765Package.EMPLOYEE__SALARY:
				setSalary((BigInteger)newValue);
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
			case Bz321765Package.EMPLOYEE__EMPLOYEE_PK:
				setEmployeePK((EmployeePK)null);
				return;
			case Bz321765Package.EMPLOYEE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Bz321765Package.EMPLOYEE__SALARY:
				setSalary(SALARY_EDEFAULT);
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
			case Bz321765Package.EMPLOYEE__EMPLOYEE_PK:
				return employeePK != null;
			case Bz321765Package.EMPLOYEE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Bz321765Package.EMPLOYEE__SALARY:
				return SALARY_EDEFAULT == null ? salary != null : !SALARY_EDEFAULT.equals(salary);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", salary: ");
		result.append(salary);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
