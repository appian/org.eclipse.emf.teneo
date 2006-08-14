/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package extlibrary;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link extlibrary.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link extlibrary.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link extlibrary.Book#getCategory <em>Category</em>}</li>
 *   <li>{@link extlibrary.Book#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see extlibrary.ExtlibraryPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends CirculatingItem {
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
	 * @see extlibrary.ExtlibraryPackage#getBook_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link extlibrary.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #setPages(int)
	 * @see extlibrary.ExtlibraryPackage#getBook_Pages()
	 * @model default="100"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link extlibrary.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link extlibrary.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see extlibrary.BookCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(BookCategory)
	 * @see extlibrary.ExtlibraryPackage#getBook_Category()
	 * @model unsettable="true"
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link extlibrary.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see extlibrary.BookCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

	/**
	 * Unsets the value of the '{@link extlibrary.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(BookCategory)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link extlibrary.Book#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(BookCategory)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link extlibrary.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Writer)
	 * @see extlibrary.ExtlibraryPackage#getBook_Author()
	 * @see extlibrary.Writer#getBooks
	 * @model opposite="books" required="true"
	 * @generated
	 */
	Writer getAuthor();

	/**
	 * Sets the value of the '{@link extlibrary.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Writer value);

} // Book