/**
 * <copyright>
 * </copyright>
 *
 * $Id: Head.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.resource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.resource.Head#getHair <em>Hair</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.resource.ResourcePackage#getHead()
 * @model extendedMetaData="name='Head' kind='elementOnly'"
 * @generated
 */
public interface Head extends EObject {
	/**
	 * Returns the value of the '<em><b>Hair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hair</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hair</em>' attribute.
	 * @see #setHair(String)
	 * @see org.eclipse.emf.teneo.samples.issues.resource.ResourcePackage#getHead_Hair()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='hair'"
	 * @generated
	 */
	String getHair();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.resource.Head#getHair <em>Hair</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hair</em>' attribute.
	 * @see #getHair()
	 * @generated
	 */
	void setHair(String value);

} // Head
