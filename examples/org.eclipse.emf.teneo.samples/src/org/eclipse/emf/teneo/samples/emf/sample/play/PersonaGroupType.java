/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonaGroupType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getGroupDescription <em>Group Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaGroupType()
 * @model extendedMetaData="name='personaGroup_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonaGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Persona</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaGroupType_Persona()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='persona' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getPersona();

	/**
	 * Returns the value of the '<em><b>Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Description</em>' attribute.
	 * @see #setGroupDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaGroupType_GroupDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='groupDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getGroupDescription <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Description</em>' attribute.
	 * @see #getGroupDescription()
	 * @generated
	 */
	void setGroupDescription(String value);

} // PersonaGroupType
