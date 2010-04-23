/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnotherEmbeddable.java,v 1.3 2010/04/23 08:52:51 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Another Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable#getAnotherName <em>Another Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable#getAOneToMany <em>AOne To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable#getNestedEmbedded <em>Nested Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getAnotherEmbeddable()
 * @model annotation="teneo.jpa appinfo='@Embeddable'"
 *        extendedMetaData="name='AnotherEmbeddable' kind='elementOnly'"
 * @generated
 */
public interface AnotherEmbeddable extends AlsoEmbeddable {
	/**
	 * Returns the value of the '<em><b>Another Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Another Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Another Name</em>' attribute.
	 * @see #setAnotherName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getAnotherEmbeddable_AnotherName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='anotherName'"
	 * @generated
	 */
	String getAnotherName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable#getAnotherName <em>Another Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Another Name</em>' attribute.
	 * @see #getAnotherName()
	 * @generated
	 */
	void setAnotherName(String value);

	/**
	 * Returns the value of the '<em><b>AOne To Many</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AOneToMany}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AOne To Many</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AOne To Many</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getAnotherEmbeddable_AOneToMany()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='aOneToMany'"
	 * @generated
	 */
	EList<AOneToMany> getAOneToMany();

	/**
	 * Returns the value of the '<em><b>Nested Embedded</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Embedded</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Embedded</em>' containment reference.
	 * @see #setNestedEmbedded(NestedEmbeddable)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getAnotherEmbeddable_NestedEmbedded()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t\t@Embedded\n\t\t\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='nestedEmbedded'"
	 * @generated
	 */
	NestedEmbeddable getNestedEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.AnotherEmbeddable#getNestedEmbedded <em>Nested Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Embedded</em>' containment reference.
	 * @see #getNestedEmbedded()
	 * @generated
	 */
	void setNestedEmbedded(NestedEmbeddable value);

} // AnotherEmbeddable
