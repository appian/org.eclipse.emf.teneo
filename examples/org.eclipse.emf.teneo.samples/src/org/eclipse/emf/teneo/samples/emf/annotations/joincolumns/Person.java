/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.3 2007/07/17 17:37:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFriends <em>Friends</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getOppositeFriends <em>Opposite Friends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getPerson()
 * @model annotation="teneo.jpa appinfo='@IdClass(org.eclipse.emf.teneo.samples.emf.annotations.compositeid.PersonID)'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getPerson_FirstName()
	 * @model annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getPerson_LastName()
	 * @model annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Friends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getOppositeFriends <em>Opposite Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getPerson_Friends()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getOppositeFriends
	 * @model opposite="oppositeFriends"
	 * @generated
	 */
	EList<Person> getFriends();

	/**
	 * Returns the value of the '<em><b>Opposite Friends</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite Friends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite Friends</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getPerson_OppositeFriends()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Person#getFriends
	 * @model opposite="friends"
	 * @generated
	 */
	EList<Person> getOppositeFriends();

} // Person