/**
 * <copyright>
 * </copyright>
 *
 * $Id: Employee.java,v 1.1 2008/07/13 13:12:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee#getEmployeeNumber <em>Employee Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage#getEmployee()
 * @model annotation="teneo.jpa value='@SecondaryTable(name=\"secondary_table\")'"
 * @generated
 */
public interface Employee extends Person {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage#getEmployee_Address()
	 * @model annotation="teneo.jpa value='@Embedded\n@AttributeOverrides({\n\t@AttributeOverride(name=\"name\" column=@Column(name=\"other_name\" table=\"secondary_table\")),\n\t@AttributeOverride(name=\"street\" column=@Column(name=\"other_street\" table=\"secondary_table\")),\n\t@AttributeOverride(name=\"city\" column=@Column(name=\"other_city\" table=\"secondary_table\"))\n})\n@AssociationOverrides({\n\t@AssociationOverride(name=\"country\" joinColumns=@JoinColumn(name=\"addr_country\" table=\"secondary_table\"))\n})'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Employee Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Number</em>' attribute.
	 * @see #setEmployeeNumber(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage#getEmployee_EmployeeNumber()
	 * @model annotation="teneo.jpa value='@Column(name=\"emp_num\" table=\"secondary_table\")'"
	 * @generated
	 */
	String getEmployeeNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.Employee#getEmployeeNumber <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Number</em>' attribute.
	 * @see #getEmployeeNumber()
	 * @generated
	 */
	void setEmployeeNumber(String value);

} // Employee
