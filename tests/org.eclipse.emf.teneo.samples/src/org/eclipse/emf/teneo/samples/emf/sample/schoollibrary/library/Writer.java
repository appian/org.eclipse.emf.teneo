/**
 * <copyright>
 * </copyright>
 *
 * $Id: Writer.java,v 1.2 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Writer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Writer#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryPackage#getWriter()
 * @model
 * @generated
 */
public interface Writer extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryPackage#getWriter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Writer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Book}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryPackage#getWriter_Books()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Book#getAuthor
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Book" opposite="author"
	 * @generated
	 */
	EList<Book> getBooks();

} // Writer
