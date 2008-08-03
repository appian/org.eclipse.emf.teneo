/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneTimeWonder.java,v 1.1 2008/08/03 19:23:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz242995;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Time Wonder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getTheAuthor <em>The Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package#getOneTimeWonder()
 * @model
 * @generated
 */
public interface OneTimeWonder extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package#getOneTimeWonder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>The Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz242995.Author#getTheBook <em>The Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Author</em>' reference.
	 * @see #setTheAuthor(Author)
	 * @see org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package#getOneTimeWonder_TheAuthor()
	 * @see org.eclipse.emf.teneo.samples.issues.bz242995.Author#getTheBook
	 * @model opposite="theBook" required="true"
	 *        annotation="teneo.jpa value='@PrimaryKeyJoinColumn'"
	 * @generated
	 */
	Author getTheAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getTheAuthor <em>The Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Author</em>' reference.
	 * @see #getTheAuthor()
	 * @generated
	 */
	void setTheAuthor(Author value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package#getOneTimeWonder_Id()
	 * @model annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // OneTimeWonder
