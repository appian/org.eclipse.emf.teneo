/**
 * <copyright>
 * </copyright>
 *
 * $Id: Department.java,v 1.1 2008/04/23 15:45:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.employee;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Department#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Department#getEmployees <em>Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getDepartment()
 * @model extendedMetaData="name='Department' kind='elementOnly'"
 * @generated
 */
public interface Department extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getDepartment_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.employee.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.employee.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.employee.EmployeePackage#getDepartment_Employees()
	 * @model containment="true"
	 *        annotation="teneo.hibernate appinfo='\n\t\t\t\t@OneToMany(indexed=false)\n\t\t\t\t@Filter(name=\"ageRange\", condition=\"age between :fromAge and :toAge\")\n\t\t\t\t@Filter(name=\"salaryHigherThan\", condition=\"salary &gt; :salary\")\n\t\t\t'"
	 *        extendedMetaData="kind='element' name='employees'"
	 * @generated
	 */
	EList<Employee> getEmployees();

} // Department
