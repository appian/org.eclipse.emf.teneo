/**
 * <copyright>
 * </copyright>
 *
 * $Id: SunBooksPackage.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksFactory
 * @model kind="package"
 * @generated
 */
public interface SunBooksPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sunBooks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/sample/sun_books";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sunBooks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SunBooksPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.AuthorsTypeImpl <em>Authors Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.AuthorsTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getAuthorsType()
	 * @generated
	 */
	int AUTHORS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE__AUTHOR_NAME = 0;

	/**
	 * The number of structural features of the the '<em>Authors Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BooksTypeImpl <em>Books Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BooksTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBooksType()
	 * @generated
	 */
	int BOOKS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKS_TYPE__BOOK = 0;

	/**
	 * The number of structural features of the the '<em>Books Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.BookTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>ISBN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__ISBN = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__AUTHORS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Promotion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__PROMOTION = 5;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__PUBLICATION_DATE = 6;

	/**
	 * The feature id for the '<em><b>Book Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__BOOK_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__ITEM_ID = 8;

	/**
	 * The number of structural features of the the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.CollectionTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__BOOKS = 0;

	/**
	 * The number of structural features of the the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION = 3;

	/**
	 * The number of structural features of the the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.PromotionTypeImpl <em>Promotion Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.PromotionTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getPromotionType()
	 * @generated
	 */
	int PROMOTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_TYPE__DISCOUNT = 0;

	/**
	 * The feature id for the '<em><b>None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_TYPE__NONE = 1;

	/**
	 * The number of structural features of the the '<em>Promotion Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType <em>Book Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBookCategoryType()
	 * @generated
	 */
	int BOOK_CATEGORY_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1 <em>Book Category Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBookCategoryType1()
	 * @generated
	 */
	int BOOK_CATEGORY_TYPE1 = 7;

	/**
	 * The meta object id for the '<em>Book Category Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBookCategoryTypeObject()
	 * @generated
	 */
	int BOOK_CATEGORY_TYPE_OBJECT = 8;

	/**
	 * The meta object id for the '<em>Book Category Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.SunBooksPackageImpl#getBookCategoryTypeObject1()
	 * @generated
	 */
	int BOOK_CATEGORY_TYPE_OBJECT1 = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType <em>Authors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authors Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType
	 * @generated
	 */
	EClass getAuthorsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType#getAuthorName()
	 * @see #getAuthorsType()
	 * @generated
	 */
	EAttribute getAuthorsType_AuthorName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType <em>Books Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Books Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType
	 * @generated
	 */
	EClass getBooksType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType#getBook()
	 * @see #getBooksType()
	 * @generated
	 */
	EReference getBooksType_Book();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getName()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN <em>ISBN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISBN</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getISBN()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_ISBN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPrice()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Price();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authors</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getAuthors()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Authors();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getDescription()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPromotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Promotion</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPromotion()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Promotion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getPublicationDate()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_PublicationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory <em>Book Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Book Category</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getBookCategory()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_BookCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getItemId <em>Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType#getItemId()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_ItemId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Books</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType#getBooks()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_Books();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot#getCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType <em>Promotion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType
	 * @generated
	 */
	EClass getPromotionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getDiscount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getDiscount()
	 * @see #getPromotionType()
	 * @generated
	 */
	EAttribute getPromotionType_Discount();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType#getNone()
	 * @see #getPromotionType()
	 * @generated
	 */
	EAttribute getPromotionType_None();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType <em>Book Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Book Category Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType
	 * @generated
	 */
	EEnum getBookCategoryType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1 <em>Book Category Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Book Category Type1</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @generated
	 */
	EEnum getBookCategoryType1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType <em>Book Category Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Book Category Type Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType"
	 *        extendedMetaData="name='bookCategoryType:Object' baseType='bookCategoryType'" 
	 * @generated
	 */
	EDataType getBookCategoryTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1 <em>Book Category Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Book Category Type Object1</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1"
	 *        extendedMetaData="name='bookCategory_._type:Object' baseType='bookCategory_._type'" 
	 * @generated
	 */
	EDataType getBookCategoryTypeObject1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SunBooksFactory getSunBooksFactory();

} //SunBooksPackage
