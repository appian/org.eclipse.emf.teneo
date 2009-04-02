/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.4 2009/04/02 20:46:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.library;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook()
 * @model extendedMetaData="name='Book' kind='elementOnly'"
 * @extends SerializableEObject
 * @generated
 */
public interface Book extends SerializableEObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook_Title()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #isSetPages()
	 * @see #unsetPages()
	 * @see #setPages(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook_Pages()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='pages'"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #isSetPages()
	 * @see #unsetPages()
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPages()
	 * @see #getPages()
	 * @see #setPages(int)
	 * @generated
	 */
	void unsetPages();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getPages <em>Pages</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pages</em>' attribute is set.
	 * @see #unsetPages()
	 * @see #getPages()
	 * @see #setPages(int)
	 * @generated
	 */
	boolean isSetPages();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(BookCategory)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook_Category()
	 * @model unsettable="true" required="true"
	 *        annotation="teneo.jpa appinfo='@Enumerated(ORDINAL)'"
	 *        extendedMetaData="kind='element' name='category'"
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.BookCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(BookCategory)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getCategory <em>Category</em>}' attribute is set.
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
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Writer)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook_Author()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.Writer#getBooks
	 * @model opposite="books" required="true"
	 *        extendedMetaData="kind='element' name='author'"
	 * @generated
	 */
	Writer getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Writer value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #isSetTest()
	 * @see #unsetTest()
	 * @see #setTest(int)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.library.LibraryPackage#getBook_Test()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	int getTest();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #isSetTest()
	 * @see #unsetTest()
	 * @see #getTest()
	 * @generated
	 */
	void setTest(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTest()
	 * @see #getTest()
	 * @see #setTest(int)
	 * @generated
	 */
	void unsetTest();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.library.Book#getTest <em>Test</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Test</em>' attribute is set.
	 * @see #unsetTest()
	 * @see #getTest()
	 * @see #setTest(int)
	 * @generated
	 */
	boolean isSetTest();

} // Book
