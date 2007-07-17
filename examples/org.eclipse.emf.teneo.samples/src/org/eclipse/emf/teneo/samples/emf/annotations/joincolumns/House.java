/**
 * <copyright>
 * </copyright>
 *
 * $Id: House.java,v 1.1 2007/07/17 17:37:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getVisitors <em>Visitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Parent)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getHouse_Owner()
	 * @model
	 * @generated
	 */
	Parent getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.House#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Parent value);

	/**
	 * Returns the value of the '<em><b>Visitors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitors</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getHouse_Visitors()
	 * @model annotation="teneo.jpa value='@JoinColumns({@JoinColumn(name=\"wrongcolumn\")})\n@JoinTable(joinColumns={@JoinColumn(name=\"rightcolumn\")})'"
	 * @generated
	 */
	EList<Person> getVisitors();

} // House
