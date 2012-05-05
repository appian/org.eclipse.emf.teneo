/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee <em>Employee</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployeeInfo()
 * @model
 * @generated
 */
public interface EmployeeInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployeeInfo_Id()
	 * @model annotation="teneo.jpa value='@Id\n@GeneratedValue'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployeeInfo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo <em>Employee Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Employee)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployeeInfo_Employee()
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo
	 * @model opposite="employeeInfo"
	 * @generated
	 */
	Employee getEmployee();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Employee value);

} // EmployeeInfo
