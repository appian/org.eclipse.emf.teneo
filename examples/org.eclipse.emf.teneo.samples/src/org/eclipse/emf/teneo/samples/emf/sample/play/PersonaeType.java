/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonaeType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personae Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersonaGroup <em>Persona Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaeType()
 * @model extendedMetaData="name='personae_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonaeType extends EObject{
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaeType_Title()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getTitle();

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaeType_Persona()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='persona' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getPersona();

	/**
	 * Returns the value of the '<em><b>Persona Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona Group</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPersonaeType_PersonaGroup()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType" containment="true" resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personaGroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getPersonaGroup();

} // PersonaeType
