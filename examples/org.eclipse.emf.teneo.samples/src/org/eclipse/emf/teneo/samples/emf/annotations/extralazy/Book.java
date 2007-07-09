/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.1 2007/07/09 12:55:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.extralazy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Book#getAuthors <em>Authors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage#getBook()
 * @model extendedMetaData="name='Book' kind='elementOnly'"
 * @generated
 */
public interface Book extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage#getBook_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.extralazy.Writer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.extralazy.ExtralazyPackage#getBook_Authors()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@OneToMany(fetch=EXTRA)'"
	 *        extendedMetaData="kind='element' name='authors'"
	 * @generated
	 */
	EList<Writer> getAuthors();

} // Book
