/**
 * <copyright>
 * </copyright>
 *
 * $Id: User.java,v 1.3 2007/07/17 17:37:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getUser()
 * @model extendedMetaData="name='User' kind='elementOnly'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getUser_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getUser_Roles()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role#getUsers
	 * @model opposite="users"
	 *        annotation="teneo.hibernate appinfo='@IdBag @JoinTable(name=\"myjoin\")'"
	 *        extendedMetaData="kind='element' name='role'"
	 * @generated
	 */
	EList<Role> getRoles();

} // User
