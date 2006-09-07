/**
 * <copyright>
 * </copyright>
 *
 * $Id: Embeddable.java,v 1.2 2006/09/07 10:06:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

import org.eclipse.emf.ecore.EObject;
 
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embeddable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyString <em>My String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger <em>My Integer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbeddable()
 * @model annotation="http://annotation.elver.org/Embeddable appinfo='true'"
 *        extendedMetaData="name='Embeddable' kind='elementOnly'"
 * @generated
 */
public interface Embeddable extends EObject {
	/**
	 * Returns the value of the '<em><b>My String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My String</em>' attribute.
	 * @see #setMyString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbeddable_MyString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='myString'"
	 * @generated
	 */
	String getMyString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyString <em>My String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My String</em>' attribute.
	 * @see #getMyString()
	 * @generated
	 */
	void setMyString(String value);

	/**
	 * Returns the value of the '<em><b>My Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Integer</em>' attribute.
	 * @see #isSetMyInteger()
	 * @see #unsetMyInteger()
	 * @see #setMyInteger(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage#getEmbeddable_MyInteger()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='myInteger'"
	 * @generated
	 */
	int getMyInteger();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger <em>My Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Integer</em>' attribute.
	 * @see #isSetMyInteger()
	 * @see #unsetMyInteger()
	 * @see #getMyInteger()
	 * @generated
	 */
	void setMyInteger(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger <em>My Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMyInteger()
	 * @see #getMyInteger()
	 * @see #setMyInteger(int)
	 * @generated
	 */
	void unsetMyInteger();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.embedded.Embeddable#getMyInteger <em>My Integer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>My Integer</em>' attribute is set.
	 * @see #unsetMyInteger()
	 * @see #getMyInteger()
	 * @see #setMyInteger(int)
	 * @generated
	 */
	boolean isSetMyInteger();

} // Embeddable
