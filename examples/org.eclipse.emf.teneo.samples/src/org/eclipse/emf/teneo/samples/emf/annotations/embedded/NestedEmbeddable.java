/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedEmbeddable.java,v 1.1 2010/04/23 08:52:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.NestedEmbeddable#getNestedName <em>Nested Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getNestedEmbeddable()
 * @model annotation="teneo.jpa appinfo='@Embeddable'"
 *        extendedMetaData="name='NestedEmbeddable' kind='elementOnly'"
 * @generated
 */
public interface NestedEmbeddable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nested Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Name</em>' attribute.
	 * @see #setNestedName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getNestedEmbeddable_NestedName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='nestedName'"
	 * @generated
	 */
	String getNestedName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.NestedEmbeddable#getNestedName <em>Nested Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Name</em>' attribute.
	 * @see #getNestedName()
	 * @generated
	 */
	void setNestedName(String value);

} // NestedEmbeddable
