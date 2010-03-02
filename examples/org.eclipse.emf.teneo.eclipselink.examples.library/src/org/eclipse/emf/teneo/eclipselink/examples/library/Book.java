/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.3 2010/03/02 21:50:32 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTranslator <em>Translator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCover <em>Cover</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getDerivedAttribute <em>Derived Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Title()
	 * @model default=""
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTitle <em>Title</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Pages()
	 * @model default="100"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory
	 * @see #setCategory(BookCategory)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Category()
	 * @model
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Writer)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Author()
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getBooks
	 * @model opposite="books" required="true"
	 * @generated
	 */
	Writer getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Writer value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.teneo.eclipselink.examples.library.Style},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' map.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Styles()
	 * @model mapType="org.eclipse.emf.teneo.eclipselink.examples.library.BookStylesMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.teneo.eclipselink.examples.library.Style>"
	 * @generated
	 */
	EMap<String, Style> getStyles();

	/**
	 * Returns the value of the '<em><b>Translator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translator</em>' reference.
	 * @see #setTranslator(Translator)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Translator()
	 * @model
	 * @generated
	 */
	Translator getTranslator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTranslator <em>Translator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translator</em>' reference.
	 * @see #getTranslator()
	 * @generated
	 */
	void setTranslator(Translator value);

	/**
	 * Returns the value of the '<em><b>Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cover</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cover</em>' containment reference.
	 * @see #setCover(Cover)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_Cover()
	 * @model containment="true"
	 * @generated
	 */
	Cover getCover();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCover <em>Cover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cover</em>' containment reference.
	 * @see #getCover()
	 * @generated
	 */
	void setCover(Cover value);

	/**
	 * Returns the value of the '<em><b>Derived Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Attribute</em>' attribute.
	 * @see #setDerivedAttribute(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getBook_DerivedAttribute()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getDerivedAttribute <em>Derived Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Attribute</em>' attribute.
	 * @see #getDerivedAttribute()
	 * @generated
	 */
	void setDerivedAttribute(String value);

} // Book
