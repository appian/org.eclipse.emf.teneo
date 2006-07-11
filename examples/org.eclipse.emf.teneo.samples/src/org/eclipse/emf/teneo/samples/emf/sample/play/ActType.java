/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActType.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Act Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getScene <em>Scene</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex <em>Pindex</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getActType()
 * @model extendedMetaData="name='act_._type' kind='elementOnly'"
 * @generated
 */
public interface ActType extends EObject{
	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getActType_Scene()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.play.SceneType" containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='scene' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getScene();

	/**
	 * Returns the value of the '<em><b>Pindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pindex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pindex</em>' attribute.
	 * @see #isSetPindex()
	 * @see #unsetPindex()
	 * @see #setPindex(byte)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getActType_Pindex()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte" required="true"
	 *        extendedMetaData="kind='attribute' name='pindex'"
	 * @generated
	 */
	byte getPindex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pindex</em>' attribute.
	 * @see #isSetPindex()
	 * @see #unsetPindex()
	 * @see #getPindex()
	 * @generated
	 */
	void setPindex(byte value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex <em>Pindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPindex()
	 * @see #getPindex()
	 * @see #setPindex(byte)
	 * @generated
	 */
	void unsetPindex();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex <em>Pindex</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pindex</em>' attribute is set.
	 * @see #unsetPindex()
	 * @see #getPindex()
	 * @see #setPindex(byte)
	 * @generated
	 */
	boolean isSetPindex();

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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage#getActType_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // ActType
