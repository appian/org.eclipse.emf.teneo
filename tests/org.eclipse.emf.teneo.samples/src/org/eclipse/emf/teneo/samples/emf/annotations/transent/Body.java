/**
 * <copyright>
 * </copyright>
 *
 * $Id: Body.java,v 1.2 2006/09/29 12:30:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.transent;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getTheID <em>The ID</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getHead <em>Head</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage#getBody()
 * @model extendedMetaData="name='Body' kind='elementOnly'"
 * @generated
 */
public interface Body extends EObject {
	/**
	 * Returns the value of the '<em><b>The ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The ID</em>' attribute.
	 * @see #isSetTheID()
	 * @see #unsetTheID()
	 * @see #setTheID(long)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage#getBody_TheID()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 *        extendedMetaData="kind='element' name='theID'"
	 * @generated
	 */
	long getTheID();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getTheID <em>The ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The ID</em>' attribute.
	 * @see #isSetTheID()
	 * @see #unsetTheID()
	 * @see #getTheID()
	 * @generated
	 */
	void setTheID(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getTheID <em>The ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheID()
	 * @see #getTheID()
	 * @see #setTheID(long)
	 * @generated
	 */
	void unsetTheID();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getTheID <em>The ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The ID</em>' attribute is set.
	 * @see #unsetTheID()
	 * @see #getTheID()
	 * @see #setTheID(long)
	 * @generated
	 */
	boolean isSetTheID();

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Head)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.transent.TransentPackage#getBody_Head()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='@Transient'"
	 *        extendedMetaData="kind='element' name='head'"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.transent.Body#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

} // Body
