/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.2 2010/03/02 06:08:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Employee</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Employee#getManager <em>Manager
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Employee)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getEmployee_Manager()
	 * @model
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.Employee#getManager
	 * <em>Manager</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

} // Employee
