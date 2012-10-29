/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Employee</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link extlibrary.Employee#getManager <em>Manager</em>}</li>
 * </ul>
 * </p>
 * 
 * @see extlibrary.ExtlibraryPackage#getEmployee()
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
	 * @see extlibrary.ExtlibraryPackage#getEmployee_Manager()
	 * @model
	 * @generated
	 */
	Employee getManager();

	/**
	 * Sets the value of the '{@link extlibrary.Employee#getManager <em>Manager</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Employee value);

} // Employee