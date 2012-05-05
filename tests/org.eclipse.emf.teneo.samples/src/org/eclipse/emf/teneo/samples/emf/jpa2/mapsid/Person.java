/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.mapsid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getPerson_Name()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='@EmbeddedId'"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(PersonIdentifier)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getPerson_Identifier()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@MapsId(\"firstName\")'"
	 *        extendedMetaData="kind='element' name='identifier'"
	 * @generated
	 */
	PersonIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Person#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(PersonIdentifier value);

} // Person
