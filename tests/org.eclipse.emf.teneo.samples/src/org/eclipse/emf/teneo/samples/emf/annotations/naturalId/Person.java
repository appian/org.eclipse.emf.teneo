/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2008/06/29 14:23:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.naturalId;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getFamily <em>Family</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getCallName <em>Call Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson()
 * @model
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson_FirstName()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@NaturalId'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getFirstName <em>First Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson_LastName()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@NaturalId'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' reference.
	 * @see #setFamily(Family)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson_Family()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@NaturalId'"
	 * @generated
	 */
	Family getFamily();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getFamily <em>Family</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Family value);

	/**
	 * Returns the value of the '<em><b>Call Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Name</em>' attribute.
	 * @see #setCallName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.naturalId.NaturalIdPackage#getPerson_CallName()
	 * @model required="true"
	 * @generated
	 */
	String getCallName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.naturalId.Person#getCallName <em>Call Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Name</em>' attribute.
	 * @see #getCallName()
	 * @generated
	 */
	void setCallName(String value);

} // Person
