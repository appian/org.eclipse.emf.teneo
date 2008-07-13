/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonEmployee.java,v 1.1 2008/07/13 13:12:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.NonEmployee#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage#getNonEmployee()
 * @model
 * @generated
 */
public interface NonEmployee extends Person {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.AttroverridesecondarytablePackage#getNonEmployee_Address()
	 * @model annotation="teneo.jpa value='@Embedded'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.attroverridesecondarytable.NonEmployee#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // NonEmployee
