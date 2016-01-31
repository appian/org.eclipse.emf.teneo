/**
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositefkid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person#getLastName <em>Last Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#getPerson()
 * @model annotation="teneo.jpa appinfo='@IdClass(org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.PersonID)'"
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#getPerson_FirstName()
	 * @model annotation="teneo.jpa appinfo='@Id'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' reference.
	 * @see #setLastName(Name)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.CompositefkidPackage#getPerson_LastName()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@Id\n@JoinColumn(name=\"lastName\")'"
	 * @generated
	 */
	Name getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.compositefkid.Person#getLastName <em>Last Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' reference.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(Name value);

} // Person
