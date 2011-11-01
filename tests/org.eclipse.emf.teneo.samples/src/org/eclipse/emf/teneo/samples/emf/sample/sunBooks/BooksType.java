/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooksType.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Books Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType#getBook <em>Book</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBooksType()
 * @model extendedMetaData="name='books_._type' kind='elementOnly'"
 * @generated
 */
public interface BooksType extends EObject{
	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBooksType_Book()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='book'"
	 * @generated
	 */
	EList<BookType> getBook();

} // BooksType
