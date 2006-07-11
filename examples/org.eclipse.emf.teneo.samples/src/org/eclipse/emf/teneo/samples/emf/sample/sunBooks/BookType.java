/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookType.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN <em>ISBN</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory <em>Book Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getItemId <em>Item Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType()
 * @model extendedMetaData="name='bookType' kind='elementOnly'"
 * @generated
 */
public interface BookType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISBN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISBN</em>' attribute.
	 * @see #isSetISBN()
	 * @see #unsetISBN()
	 * @see #setISBN(long)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_ISBN()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='ISBN'"
	 * @generated
	 */
	long getISBN();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISBN</em>' attribute.
	 * @see #isSetISBN()
	 * @see #unsetISBN()
	 * @see #getISBN()
	 * @generated
	 */
	void setISBN(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN <em>ISBN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetISBN()
	 * @see #getISBN()
	 * @see #setISBN(long)
	 * @generated
	 */
	void unsetISBN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN <em>ISBN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ISBN</em>' attribute is set.
	 * @see #unsetISBN()
	 * @see #getISBN()
	 * @see #setISBN(long)
	 * @generated
	 */
	boolean isSetISBN();

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_Price()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='price'"
	 * @generated
	 */
	String getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference.
	 * @see #setAuthors(AuthorsType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_Authors()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='authors'"
	 * @generated
	 */
	AuthorsType getAuthors();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getAuthors <em>Authors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' containment reference.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(AuthorsType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_Description()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Promotion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion</em>' containment reference.
	 * @see #setPromotion(PromotionType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_Promotion()
	 * @model containment="true" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='promotion'"
	 * @generated
	 */
	PromotionType getPromotion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPromotion <em>Promotion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion</em>' containment reference.
	 * @see #getPromotion()
	 * @generated
	 */
	void setPromotion(PromotionType value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_PublicationDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='publicationDate'"
	 * @generated
	 */
	Object getPublicationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPublicationDate <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(Object value);

	/**
	 * Returns the value of the '<em><b>Book Category</b></em>' attribute.
	 * The default value is <code>"magazine"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @see #isSetBookCategory()
	 * @see #unsetBookCategory()
	 * @see #setBookCategory(BookCategoryType1)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_BookCategory()
	 * @model default="magazine" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='bookCategory'"
	 * @generated
	 */
	BookCategoryType1 getBookCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory <em>Book Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @see #isSetBookCategory()
	 * @see #unsetBookCategory()
	 * @see #getBookCategory()
	 * @generated
	 */
	void setBookCategory(BookCategoryType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory <em>Book Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBookCategory()
	 * @see #getBookCategory()
	 * @see #setBookCategory(BookCategoryType1)
	 * @generated
	 */
	void unsetBookCategory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory <em>Book Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Book Category</em>' attribute is set.
	 * @see #unsetBookCategory()
	 * @see #getBookCategory()
	 * @see #setBookCategory(BookCategoryType1)
	 * @generated
	 */
	boolean isSetBookCategory();

	/**
	 * Returns the value of the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Id</em>' attribute.
	 * @see #setItemId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#getBookType_ItemId()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='itemId'"
	 * @generated
	 */
	String getItemId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getItemId <em>Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Id</em>' attribute.
	 * @see #getItemId()
	 * @generated
	 */
	void setItemId(String value);

} // BookType
