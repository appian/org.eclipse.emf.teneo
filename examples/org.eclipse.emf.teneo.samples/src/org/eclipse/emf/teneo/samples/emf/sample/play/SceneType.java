/**
 * <copyright>
 * </copyright>
 *
 * $Id: SceneType.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getStageDirections <em>Stage Directions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getSpeech <em>Speech</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getPindex <em>Pindex</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType()
 * @model extendedMetaData="name='scene_._type' kind='elementOnly'"
 * @generated
 */ 
public interface SceneType extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType_StageDirections()
	 * @model type="java.lang.String" unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stageDirections' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getStageDirections();

	/**
	 * Returns the value of the '<em><b>Speech</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speech</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speech</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType_Speech()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speech' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SpeechType> getSpeech();

	/**
	 * Returns the value of the '<em><b>Pindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pindex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pindex</em>' attribute.
	 * @see #setPindex(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType_Pindex()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.sample.play.PindexType" required="true"
	 *        extendedMetaData="kind='attribute' name='pindex'"
	 * @generated
	 */
	String getPindex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getPindex <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pindex</em>' attribute.
	 * @see #getPindex()
	 * @generated
	 */
	void setPindex(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getSceneType_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // SceneType
