/**
 * <copyright>
 * </copyright>
 *
 * $Id: Role.java,v 1.2 2007/06/29 07:30:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getRole()
 * @model extendedMetaData="name='Role' kind='elementOnly'"
 * @generated
 */
public interface Role extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getRole_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.ForcedidbagPackage#getRole_Users()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User#getRoles
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.forcedidbag.User" opposite="roles"
	 *        annotation="teneo.hibernate appinfo='@IdBag'"
	 *        extendedMetaData="kind='element' name='users'"
	 * @generated
	 */
	EList<User> getUsers();

} // Role
