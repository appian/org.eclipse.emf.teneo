/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.1 2008/06/29 20:09:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.otopk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee#getEmployeeInfo <em>Employee Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage#getEmployee_Id()
	 * @model annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Employee Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Info</em>' reference.
	 * @see #setEmployeeInfo(EmployeeInfo)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.otopk.OtopkPackage#getEmployee_EmployeeInfo()
	 * @model annotation="teneo.jpa value='@OneToOne\n@PrimaryKeyJoinColumn'"
	 * @generated
	 */
	EmployeeInfo getEmployeeInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.otopk.Employee#getEmployeeInfo <em>Employee Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Info</em>' reference.
	 * @see #getEmployeeInfo()
	 * @generated
	 */
	void setEmployeeInfo(EmployeeInfo value);

} // Employee
