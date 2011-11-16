/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz363777;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap#getKey <em>Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package#getChannelMap()
 * @model extendedMetaData="kind='elementOnly'"
 *        annotation="teneo.jpa appinfo='@Entity'"
 * @generated
 */
public interface ChannelMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(Integer)
	 * @see org.eclipse.emf.teneo.samples.issues.bz363777.Bz363777Package#getChannelMap_Key()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	Integer getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz363777.ChannelMap#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Integer value);

} // ChannelMap
