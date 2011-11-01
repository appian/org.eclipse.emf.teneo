/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.1 2011/03/17 09:47:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321765;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getEmployeePK <em>Employee PK</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getSalary <em>Salary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployee()
 * @model extendedMetaData="name='Employee' kind='elementOnly'"
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee PK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee PK</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee PK</em>' containment reference.
	 * @see #setEmployeePK(EmployeePK)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployee_EmployeePK()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@EmbeddedId\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='EmployeePK'"
	 * @generated
	 */
	EmployeePK getEmployeePK();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getEmployeePK <em>Employee PK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee PK</em>' containment reference.
	 * @see #getEmployeePK()
	 * @generated
	 */
	void setEmployeePK(EmployeePK value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployee_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployee_Salary()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='Salary'"
	 * @generated
	 */
	BigInteger getSalary();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz321765.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(BigInteger value);

} // Employee
