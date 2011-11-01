/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.1 2008/04/23 15:45:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.employee;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getHireDate <em>Hire Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getEmployee()
 * @model annotation="teneo.hibernate appinfo='\n\t\t\t@FilterDef(name=\"hireDate\", parameters={ @ParamDef( name=\"date\", type=\"date\" ) } )\n\t\t\t@Filter(name=\"ageRange\", condition=\"age between :fromAge and :toAge\")\n\t\t\t@Filter(name=\"salaryHigherThan\", condition=\"salary &gt; :salary\")\n\t\t\t@Filter(name=\"hireDate\", condition=\"hireDate &gt; :date\")\n\t\t'"
 *        extendedMetaData="name='Employee' kind='elementOnly'"
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getEmployee_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #isSetSalary()
	 * @see #unsetSalary()
	 * @see #setSalary(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getEmployee_Salary()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='salary'"
	 * @generated
	 */
	int getSalary();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #isSetSalary()
	 * @see #unsetSalary()
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSalary()
	 * @see #getSalary()
	 * @see #setSalary(int)
	 * @generated
	 */
	void unsetSalary();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getSalary <em>Salary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Salary</em>' attribute is set.
	 * @see #unsetSalary()
	 * @see #getSalary()
	 * @see #setSalary(int)
	 * @generated
	 */
	boolean isSetSalary();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #setAge(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getEmployee_Age()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='age'"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #isSetAge()
	 * @see #unsetAge()
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAge()
	 * @see #getAge()
	 * @see #setAge(int)
	 * @generated
	 */
	void unsetAge();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getAge <em>Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Age</em>' attribute is set.
	 * @see #unsetAge()
	 * @see #getAge()
	 * @see #setAge(int)
	 * @generated
	 */
	boolean isSetAge();

	/**
	 * Returns the value of the '<em><b>Hire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hire Date</em>' attribute.
	 * @see #setHireDate(Date)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getEmployee_HireDate()
	 * @model dataType="org.eclipse.emf.teneo.samples.emf.sample.employee.Date" required="true"
	 *        extendedMetaData="kind='element' name='hireDate'"
	 * @generated
	 */
	Date getHireDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee#getHireDate <em>Hire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hire Date</em>' attribute.
	 * @see #getHireDate()
	 * @generated
	 */
	void setHireDate(Date value);

} // Employee
