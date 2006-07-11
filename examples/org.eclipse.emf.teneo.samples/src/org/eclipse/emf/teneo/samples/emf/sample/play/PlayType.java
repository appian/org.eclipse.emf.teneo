/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getFm <em>Fm</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPersonae <em>Personae</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getSceneDescription <em>Scene Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPlaySubTitle <em>Play Sub Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getAct <em>Act</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType()
 * @model extendedMetaData="name='play_._type' kind='elementOnly'"
 * @generated
 */
public interface PlayType extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_Fm()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='fm' namespace='##targetNamespace'"
	 * @generated
	 */
	FmType getFm();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getFm <em>Fm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fm</em>' containment reference.
	 * @see #getFm()
	 * @generated
	 */
	void setFm(FmType value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_Personae()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='personae' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonaeType getPersonae();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPersonae <em>Personae</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personae</em>' containment reference.
	 * @see #getPersonae()
	 * @generated
	 */
	void setPersonae(PersonaeType value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_SceneDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='sceneDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSceneDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getSceneDescription <em>Scene Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Description</em>' attribute.
	 * @see #getSceneDescription()
	 * @generated
	 */
	void setSceneDescription(String value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_PlaySubTitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='playSubTitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlaySubTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPlaySubTitle <em>Play Sub Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Sub Title</em>' attribute.
	 * @see #getPlaySubTitle()
	 * @generated
	 */
	void setPlaySubTitle(String value);

	/**
	 * Returns the value of the '<em><b>Act</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getPlayType_Act()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.play.ActType" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='act' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAct();

} // PlayType
