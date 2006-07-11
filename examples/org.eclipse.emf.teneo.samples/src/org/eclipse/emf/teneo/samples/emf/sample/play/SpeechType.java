/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpeechType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getStageDirections <em>Stage Directions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSpeechType()
 * @model extendedMetaData="name='speech_._type' kind='elementOnly'"
 * @generated
 */
public interface SpeechType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSpeechType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSpeechType_Speaker()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speaker' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getSpeaker();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSpeechType_Line()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getLine();

	/**
	 * Returns the value of the '<em><b>Stage Directions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage Directions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage Directions</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSpeechType_StageDirections()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stageDirections' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList getStageDirections();

} // SpeechType
