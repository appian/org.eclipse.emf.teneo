/**
 * <copyright>
 * </copyright>
 *
 * $Id: Family.java,v 1.1 2009/08/23 16:04:41 mtaal Exp $
 */
package org.eclipse.emf.test.databinding.emfdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Family</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.test.databinding.emfdb.Family#getString <em>String</em>}</li>
 * <li>{@link org.eclipse.emf.test.databinding.emfdb.Family#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getFamily_String()
	 * @model
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.test.databinding.emfdb.Family#getString
	 * <em>String</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list. The list
	 * contents are of type {@link org.eclipse.emf.test.databinding.emfdb.Person}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getFamily_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // Family
