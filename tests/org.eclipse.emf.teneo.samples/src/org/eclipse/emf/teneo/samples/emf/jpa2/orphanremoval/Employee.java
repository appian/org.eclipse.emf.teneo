/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo <em>Employee Info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployee()
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
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployee_Id()
	 * @model annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Employee Info</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Info</em>' reference.
	 * @see #setEmployeeInfo(EmployeeInfo)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployee_EmployeeInfo()
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo#getEmployee
	 * @model opposite="employee"
	 *        annotation="teneo.jpa value='@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval=true)'"
	 * @generated
	 */
	EmployeeInfo getEmployeeInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee#getEmployeeInfo <em>Employee Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Info</em>' reference.
	 * @see #getEmployeeInfo()
	 * @generated
	 */
	void setEmployeeInfo(EmployeeInfo value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage#getEmployee_Addresses()
	 * @model annotation="teneo.jpa value='@OneToMany(orphanRemoval=true)'"
	 * @generated
	 */
	EList<Address> getAddresses();

} // Employee
