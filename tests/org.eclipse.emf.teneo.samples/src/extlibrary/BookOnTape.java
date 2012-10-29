/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookOnTape.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Book On Tape</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link extlibrary.BookOnTape#getReader <em>Reader</em>}</li>
 * <li>{@link extlibrary.BookOnTape#getBookAuthor <em>Book Author</em>}</li>
 * </ul>
 * </p>
 * 
 * @see extlibrary.ExtlibraryPackage#getBookOnTape()
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
	 * @see extlibrary.ExtlibraryPackage#getBookOnTape_Reader()
	 * @model
	 * @generated
	 */
	Person getReader();

	/**
	 * Sets the value of the '{@link extlibrary.BookOnTape#getReader <em>Reader</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
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
	 * @see extlibrary.ExtlibraryPackage#getBookOnTape_BookAuthor()
	 * @model annotation="http://annotation.elver.org/JoinColumn name='BookOnTapeAuthor'"
	 * @generated
	 */
	Writer getBookAuthor();

	/**
	 * Sets the value of the '{@link extlibrary.BookOnTape#getBookAuthor <em>Book Author</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Book Author</em>' reference.
	 * @see #getBookAuthor()
	 * @generated
	 */
	void setBookAuthor(Writer value);

} // BookOnTape