/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookOnTape.java,v 1.2 2010/03/02 06:08:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Book On Tape</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookOnTape#getReader <em>Reader
 * </em>}</li>
 * <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookOnTape#getBookAuthor <em>Book
 * Author</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getBookOnTape()
 * @model
 * @generated
 */
public interface BookOnTape extends AudioVisualItem {
	/**
	 * Returns the value of the '<em><b>Reader</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reader</em>' reference.
	 * @see #setReader(Person)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getBookOnTape_Reader()
	 * @model
	 * @generated
	 */
	Person getReader();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookOnTape#getReader
	 * <em>Reader</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Reader</em>' reference.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(Person value);

	/**
	 * Returns the value of the '<em><b>Book Author</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book Author</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Book Author</em>' reference.
	 * @see #setBookAuthor(Writer)
	 * @see org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage#getBookOnTape_BookAuthor()
	 * @model annotation="http://annotation.elver.org/JoinColumn name='BookOnTapeAuthor'"
	 * @generated
	 */
	Writer getBookAuthor();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookOnTape#getBookAuthor
	 * <em>Book Author</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Book Author</em>' reference.
	 * @see #getBookAuthor()
	 * @generated
	 */
	void setBookAuthor(Writer value);

} // BookOnTape
