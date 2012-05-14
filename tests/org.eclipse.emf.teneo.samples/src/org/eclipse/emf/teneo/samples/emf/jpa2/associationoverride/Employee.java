/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.associationoverride;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.associationoverride.Employee#getDepartment <em>Department</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.associationoverride.AssociationoverridePackage#getEmployee()
 * @model annotation="teneo.jpa appinfo='@AssociationOverride(name=\"address\" joinTable=@JoinTable(name=\"abc\" joinColumns=@JoinColumn(name=\"employee_addr_id\")))'"
 *        extendedMetaData="name='Employee' kind='elementOnly'"
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.associationoverride.AssociationoverridePackage#getEmployee_Department()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='department'"
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.associationoverride.Employee#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

} // Employee
