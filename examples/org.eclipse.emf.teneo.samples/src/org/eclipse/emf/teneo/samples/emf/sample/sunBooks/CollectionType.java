/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionType.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getCollectionType()
 * @model extendedMetaData="name='Collection_._type' kind='elementOnly'"
 * @generated
 */
public interface CollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference.
	 * @see #setBooks(BooksType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getCollectionType_Books()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='books'"
	 * @generated
	 */
	BooksType getBooks();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType#getBooks <em>Books</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Books</em>' containment reference.
	 * @see #getBooks()
	 * @generated
	 */
	void setBooks(BooksType value);

} // CollectionType
