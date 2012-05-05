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
 * A representation of the model object '<em><b>Human</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human#getHumanClone <em>Human Clone</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHuman()
 * @model extendedMetaData="name='Human' kind='elementOnly'"
 * @generated
 */
public interface Human extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Name)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHuman_Name()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@EmbeddedId'"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Human Clone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Human Clone</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Clone</em>' reference.
	 * @see #setHumanClone(HumanClone)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHuman_HumanClone()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@MapsId'"
	 *        extendedMetaData="kind='element' name='humanClone'"
	 * @generated
	 */
	HumanClone getHumanClone();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.Human#getHumanClone <em>Human Clone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Clone</em>' reference.
	 * @see #getHumanClone()
	 * @generated
	 */
	void setHumanClone(HumanClone value);

} // Human
