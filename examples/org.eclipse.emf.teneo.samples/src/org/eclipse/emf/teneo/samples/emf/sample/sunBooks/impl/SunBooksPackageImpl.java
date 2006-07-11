/**
 * <copyright>
 * </copyright>
 *
 * $Id: SunBooksPackageImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookCategoryType1;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BookType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.PromotionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksFactory;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SunBooksPackageImpl extends EPackageImpl implements SunBooksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promotionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookCategoryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookCategoryType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bookCategoryTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bookCategoryTypeObject1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SunBooksPackageImpl() {
		super(eNS_URI, SunBooksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SunBooksPackage init() {
		if (isInited) return (SunBooksPackage)EPackage.Registry.INSTANCE.getEPackage(SunBooksPackage.eNS_URI);

		// Obtain or create and register package
		SunBooksPackageImpl theSunBooksPackage = (SunBooksPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SunBooksPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SunBooksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theSunBooksPackage.createPackageContents();

		// Initialize created meta-data
		theSunBooksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSunBooksPackage.freeze();

		return theSunBooksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorsType() {
		return authorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorsType_AuthorName() {
		return (EAttribute)authorsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooksType() {
		return booksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooksType_Book() {
		return (EReference)booksTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookType() {
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Name() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_ISBN() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Price() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Authors() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Description() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Promotion() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_PublicationDate() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_BookCategory() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_ItemId() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_Books() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Collection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromotionType() {
		return promotionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotionType_Discount() {
		return (EAttribute)promotionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPromotionType_None() {
		return (EAttribute)promotionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookCategoryType() {
		return bookCategoryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookCategoryType1() {
		return bookCategoryType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBookCategoryTypeObject() {
		return bookCategoryTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBookCategoryTypeObject1() {
		return bookCategoryTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunBooksFactory getSunBooksFactory() {
		return (SunBooksFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorsTypeEClass = createEClass(AUTHORS_TYPE);
		createEAttribute(authorsTypeEClass, AUTHORS_TYPE__AUTHOR_NAME);

		booksTypeEClass = createEClass(BOOKS_TYPE);
		createEReference(booksTypeEClass, BOOKS_TYPE__BOOK);

		bookTypeEClass = createEClass(BOOK_TYPE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__NAME);
		createEAttribute(bookTypeEClass, BOOK_TYPE__ISBN);
		createEAttribute(bookTypeEClass, BOOK_TYPE__PRICE);
		createEReference(bookTypeEClass, BOOK_TYPE__AUTHORS);
		createEAttribute(bookTypeEClass, BOOK_TYPE__DESCRIPTION);
		createEReference(bookTypeEClass, BOOK_TYPE__PROMOTION);
		createEAttribute(bookTypeEClass, BOOK_TYPE__PUBLICATION_DATE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__BOOK_CATEGORY);
		createEAttribute(bookTypeEClass, BOOK_TYPE__ITEM_ID);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__BOOKS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLECTION);

		promotionTypeEClass = createEClass(PROMOTION_TYPE);
		createEAttribute(promotionTypeEClass, PROMOTION_TYPE__DISCOUNT);
		createEAttribute(promotionTypeEClass, PROMOTION_TYPE__NONE);

		// Create enums
		bookCategoryTypeEEnum = createEEnum(BOOK_CATEGORY_TYPE);
		bookCategoryType1EEnum = createEEnum(BOOK_CATEGORY_TYPE1);

		// Create data types
		bookCategoryTypeObjectEDataType = createEDataType(BOOK_CATEGORY_TYPE_OBJECT);
		bookCategoryTypeObject1EDataType = createEDataType(BOOK_CATEGORY_TYPE_OBJECT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(authorsTypeEClass, AuthorsType.class, "AuthorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorsType_AuthorName(), theXMLTypePackage.getString(), "authorName", null, 1, -1, AuthorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booksTypeEClass, BooksType.class, "BooksType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooksType_Book(), this.getBookType(), null, "book", null, 1, -1, BooksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_ISBN(), theXMLTypePackage.getLong(), "iSBN", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Price(), theXMLTypePackage.getString(), "price", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Authors(), this.getAuthorsType(), null, "authors", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Promotion(), this.getPromotionType(), null, "promotion", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_PublicationDate(), theXMLTypePackage.getDate(), "publicationDate", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_BookCategory(), this.getBookCategoryType1(), "bookCategory", "magazine", 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_ItemId(), theXMLTypePackage.getString(), "itemId", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_Books(), this.getBooksType(), null, "books", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Collection(), this.getCollectionType(), null, "collection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(promotionTypeEClass, PromotionType.class, "PromotionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromotionType_Discount(), theXMLTypePackage.getString(), "discount", null, 0, 1, PromotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotionType_None(), theXMLTypePackage.getString(), "none", null, 0, 1, PromotionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bookCategoryTypeEEnum, BookCategoryType.class, "BookCategoryType");
		addEEnumLiteral(bookCategoryTypeEEnum, BookCategoryType.MAGAZINE_LITERAL);
		addEEnumLiteral(bookCategoryTypeEEnum, BookCategoryType.NOVEL_LITERAL);
		addEEnumLiteral(bookCategoryTypeEEnum, BookCategoryType.FICTION_LITERAL);
		addEEnumLiteral(bookCategoryTypeEEnum, BookCategoryType.OTHER_LITERAL);

		initEEnum(bookCategoryType1EEnum, BookCategoryType1.class, "BookCategoryType1");
		addEEnumLiteral(bookCategoryType1EEnum, BookCategoryType1.MAGAZINE_LITERAL);
		addEEnumLiteral(bookCategoryType1EEnum, BookCategoryType1.NOVEL_LITERAL);
		addEEnumLiteral(bookCategoryType1EEnum, BookCategoryType1.FICTION_LITERAL);
		addEEnumLiteral(bookCategoryType1EEnum, BookCategoryType1.OTHER_LITERAL);

		// Initialize data types
		initEDataType(bookCategoryTypeObjectEDataType, BookCategoryType.class, "BookCategoryTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bookCategoryTypeObject1EDataType, BookCategoryType1.class, "BookCategoryTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (authorsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "authors_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthorsType_AuthorName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authorName"
		   });		
		addAnnotation
		  (bookCategoryTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "bookCategoryType"
		   });		
		addAnnotation
		  (bookCategoryType1EEnum, 
		   source, 
		   new String[] {
			 "name", "bookCategory_._type"
		   });		
		addAnnotation
		  (bookCategoryTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "bookCategoryType:Object",
			 "baseType", "bookCategoryType"
		   });		
		addAnnotation
		  (bookCategoryTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "bookCategory_._type:Object",
			 "baseType", "bookCategory_._type"
		   });		
		addAnnotation
		  (booksTypeEClass, 
		   source, 
		   new String[] {
			 "name", "books_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBooksType_Book(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "book"
		   });		
		addAnnotation
		  (bookTypeEClass, 
		   source, 
		   new String[] {
			 "name", "bookType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBookType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getBookType_ISBN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ISBN"
		   });		
		addAnnotation
		  (getBookType_Price(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "price"
		   });		
		addAnnotation
		  (getBookType_Authors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authors"
		   });		
		addAnnotation
		  (getBookType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getBookType_Promotion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "promotion"
		   });		
		addAnnotation
		  (getBookType_PublicationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publicationDate"
		   });		
		addAnnotation
		  (getBookType_BookCategory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bookCategory"
		   });		
		addAnnotation
		  (getBookType_ItemId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "itemId"
		   });		
		addAnnotation
		  (collectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Collection_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCollectionType_Books(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "books"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Collection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Collection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (promotionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "promotion_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPromotionType_Discount(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Discount"
		   });		
		addAnnotation
		  (getPromotionType_None(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "None"
		   });
	}

} //SunBooksPackageImpl
