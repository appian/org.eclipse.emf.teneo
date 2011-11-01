/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getAct <em>Act</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getFm <em>Fm</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getGroupDescription <em>Group Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getLine <em>Line</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersona <em>Persona</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonae <em>Personae</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonaGroup <em>Persona Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlay <em>Play</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlaySubTitle <em>Play Sub Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getScene <em>Scene</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSceneDescription <em>Scene Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeech <em>Speech</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getStageDirections <em>Stage Directions</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference.
	 * @see #setAct(ActType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Act()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='act' namespace='##targetNamespace'"
	 * @generated
	 */
	ActType getAct();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getAct <em>Act</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act</em>' containment reference.
	 * @see #getAct()
	 * @generated
	 */
	void setAct(ActType value);

	/**
	 * Returns the value of the '<em><b>Fm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fm</em>' containment reference.
	 * @see #setFm(FmType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Fm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='fm' namespace='##targetNamespace'"
	 * @generated
	 */
	FmType getFm();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getFm <em>Fm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fm</em>' containment reference.
	 * @see #getFm()
	 * @generated
	 */
	void setFm(FmType value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_GroupDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='groupDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGroupDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getGroupDescription <em>Group Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Description</em>' attribute.
	 * @see #getGroupDescription()
	 * @generated
	 */
	void setGroupDescription(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Line()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='line' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_P()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	String getP();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(String value);

	/**
	 * Returns the value of the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona</em>' attribute.
	 * @see #setPersona(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Persona()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='persona' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersona();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersona <em>Persona</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona</em>' attribute.
	 * @see #getPersona()
	 * @generated
	 */
	void setPersona(String value);

	/**
	 * Returns the value of the '<em><b>Personae</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personae</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personae</em>' containment reference.
	 * @see #setPersonae(PersonaeType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Personae()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personae' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonaeType getPersonae();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonae <em>Personae</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personae</em>' containment reference.
	 * @see #getPersonae()
	 * @generated
	 */
	void setPersonae(PersonaeType value);

	/**
	 * Returns the value of the '<em><b>Persona Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persona Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persona Group</em>' containment reference.
	 * @see #setPersonaGroup(PersonaGroupType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_PersonaGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='personaGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonaGroupType getPersonaGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonaGroup <em>Persona Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persona Group</em>' containment reference.
	 * @see #getPersonaGroup()
	 * @generated
	 */
	void setPersonaGroup(PersonaGroupType value);

	/**
	 * Returns the value of the '<em><b>Play</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' containment reference.
	 * @see #setPlay(PlayType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Play()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='play' namespace='##targetNamespace'"
	 * @generated
	 */
	PlayType getPlay();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlay <em>Play</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play</em>' containment reference.
	 * @see #getPlay()
	 * @generated
	 */
	void setPlay(PlayType value);

	/**
	 * Returns the value of the '<em><b>Play Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Sub Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Sub Title</em>' attribute.
	 * @see #setPlaySubTitle(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_PlaySubTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='playSubTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlaySubTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlaySubTitle <em>Play Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Sub Title</em>' attribute.
	 * @see #getPlaySubTitle()
	 * @generated
	 */
	void setPlaySubTitle(String value);

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference.
	 * @see #setScene(SceneType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Scene()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='##targetNamespace'"
	 * @generated
	 */
	SceneType getScene();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getScene <em>Scene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' containment reference.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(SceneType value);

	/**
	 * Returns the value of the '<em><b>Scene Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Description</em>' attribute.
	 * @see #setSceneDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_SceneDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sceneDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSceneDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSceneDescription <em>Scene Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Description</em>' attribute.
	 * @see #getSceneDescription()
	 * @generated
	 */
	void setSceneDescription(String value);

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' attribute.
	 * @see #setSpeaker(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Speaker()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speaker' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSpeaker();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeaker <em>Speaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' attribute.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(String value);

	/**
	 * Returns the value of the '<em><b>Speech</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speech</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speech</em>' containment reference.
	 * @see #setSpeech(SpeechType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Speech()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='speech' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechType getSpeech();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeech <em>Speech</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech</em>' containment reference.
	 * @see #getSpeech()
	 * @generated
	 */
	void setSpeech(SpeechType value);

	/**
	 * Returns the value of the '<em><b>Stage Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stage Directions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage Directions</em>' attribute.
	 * @see #setStageDirections(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_StageDirections()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stageDirections' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStageDirections();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getStageDirections <em>Stage Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage Directions</em>' attribute.
	 * @see #getStageDirections()
	 * @generated
	 */
	void setStageDirections(String value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // DocumentRoot
