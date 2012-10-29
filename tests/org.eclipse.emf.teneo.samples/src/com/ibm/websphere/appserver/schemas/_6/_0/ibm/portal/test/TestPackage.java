/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestPackage.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestFactory
 * @model kind="package" annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.ibm.com/websphere/appserver/schemas/6.0/ibm-portal-test.xsd";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TestPackage eINSTANCE = com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl
	 * <em>Book Definition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBookDefinition()
	 * @generated
	 */
	int BOOK_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION__UNIQUE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Book Definition</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl
	 * <em>Adult Books</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getAdultBooks()
	 * @generated
	 */
	int ADULT_BOOKS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__DESCRIPTION = BOOK_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__LOCATION = BOOK_DEFINITION__LOCATION;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__UNIQUE_NAME = BOOK_DEFINITION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__TITLE = BOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Checkedout</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__CHECKEDOUT = BOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS__USERID = BOOK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Adult Books</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADULT_BOOKS_FEATURE_COUNT = BOOK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ResourceLinkImpl
	 * <em>Resource Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ResourceLinkImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getResourceLink()
	 * @generated
	 */
	int RESOURCE_LINK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource Link</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RESOURCE_LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionResourceLinkImpl
	 * <em>Book Definition Resource Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionResourceLinkImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBookDefinitionResourceLink()
	 * @generated
	 */
	int BOOK_DEFINITION_RESOURCE_LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION_RESOURCE_LINK__NAME = RESOURCE_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Book Subject</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT = RESOURCE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Book Definition Resource Link</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOK_DEFINITION_RESOURCE_LINK_FEATURE_COUNT = RESOURCE_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BooksInLibImpl
	 * <em>Books In Lib</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BooksInLibImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBooksInLib()
	 * @generated
	 */
	int BOOKS_IN_LIB = 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOKS_IN_LIB__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Books In Lib</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BOOKS_IN_LIB_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl
	 * <em>Children Books</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getChildrenBooks()
	 * @generated
	 */
	int CHILDREN_BOOKS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__DESCRIPTION = BOOK_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__LOCATION = BOOK_DEFINITION__LOCATION;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__UNIQUE_NAME = BOOK_DEFINITION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__TITLE = BOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cartoon</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__CARTOON = BOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Popup</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__POPUP = BOOK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publisher Definition Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF = BOOK_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Children Books</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHILDREN_BOOKS_FEATURE_COUNT = BOOK_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl
	 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract Book Definition</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Adult Books</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADULT_BOOKS = 4;

	/**
	 * The feature id for the '<em><b>Booksinlib</b></em>' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOKSINLIB = 5;

	/**
	 * The feature id for the '<em><b>Children Books</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHILDREN_BOOKS = 6;

	/**
	 * The feature id for the '<em><b>Publisher Definition</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER_DEFINITION = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl
	 * <em>Library</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 6;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Abstract Book Definition Group</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Abstract Book Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ABSTRACT_BOOK_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY__UNIQUE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl
	 * <em>Publisher Definition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getPublisherDefinition()
	 * @generated
	 */
	int PUBLISHER_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION__DESCRIPTION = BOOK_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION__LOCATION = BOOK_DEFINITION__LOCATION;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION__UNIQUE_NAME = BOOK_DEFINITION__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION__TITLE = BOOK_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Link</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION__RESOURCE_LINK = BOOK_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Publisher Definition</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_DEFINITION_FEATURE_COUNT = BOOK_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks
	 * <em>Adult Books</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Adult Books</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks
	 * @generated
	 */
	EClass getAdultBooks();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getTitle
	 * <em>Title</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getTitle()
	 * @see #getAdultBooks()
	 * @generated
	 */
	EAttribute getAdultBooks_Title();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getCheckedout
	 * <em>Checkedout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Checkedout</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getCheckedout()
	 * @see #getAdultBooks()
	 * @generated
	 */
	EAttribute getAdultBooks_Checkedout();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getUserid
	 * <em>Userid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Userid</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks#getUserid()
	 * @see #getAdultBooks()
	 * @generated
	 */
	EAttribute getAdultBooks_Userid();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition
	 * <em>Book Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Book Definition</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition
	 * @generated
	 */
	EClass getBookDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getDescription()
	 * @see #getBookDefinition()
	 * @generated
	 */
	EAttribute getBookDefinition_Description();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getLocation
	 * <em>Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getLocation()
	 * @see #getBookDefinition()
	 * @generated
	 */
	EAttribute getBookDefinition_Location();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getUniqueName
	 * <em>Unique Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition#getUniqueName()
	 * @see #getBookDefinition()
	 * @generated
	 */
	EAttribute getBookDefinition_UniqueName();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink
	 * <em>Book Definition Resource Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Book Definition Resource Link</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink
	 * @generated
	 */
	EClass getBookDefinitionResourceLink();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink#getBookSubject
	 * <em>Book Subject</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Book Subject</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink#getBookSubject()
	 * @see #getBookDefinitionResourceLink()
	 * @generated
	 */
	EAttribute getBookDefinitionResourceLink_BookSubject();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib
	 * <em>Books In Lib</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Books In Lib</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib
	 * @generated
	 */
	EClass getBooksInLib();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib#getLibrary
	 * <em>Library</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib#getLibrary()
	 * @see #getBooksInLib()
	 * @generated
	 */
	EReference getBooksInLib_Library();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks
	 * <em>Children Books</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Children Books</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks
	 * @generated
	 */
	EClass getChildrenBooks();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getTitle
	 * <em>Title</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getTitle()
	 * @see #getChildrenBooks()
	 * @generated
	 */
	EAttribute getChildrenBooks_Title();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getCartoon
	 * <em>Cartoon</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Cartoon</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getCartoon()
	 * @see #getChildrenBooks()
	 * @generated
	 */
	EAttribute getChildrenBooks_Cartoon();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPopup
	 * <em>Popup</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Popup</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPopup()
	 * @see #getChildrenBooks()
	 * @generated
	 */
	EAttribute getChildrenBooks_Popup();

	/**
	 * Returns the meta object for the reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPublisherDefinitionRef
	 * <em>Publisher Definition Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Publisher Definition Ref</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks#getPublisherDefinitionRef()
	 * @see #getChildrenBooks()
	 * @generated
	 */
	EReference getChildrenBooks_PublisherDefinitionRef();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getMixed
	 * <em>Mixed</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXMLNSPrefixMap
	 * <em>XMLNS Prefix Map</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXSISchemaLocation
	 * <em>XSI Schema Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAbstractBookDefinition
	 * <em>Abstract Book Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Abstract Book Definition</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAbstractBookDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractBookDefinition();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAdultBooks
	 * <em>Adult Books</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Adult Books</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getAdultBooks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AdultBooks();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getBooksinlib
	 * <em>Booksinlib</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Booksinlib</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getBooksinlib()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Booksinlib();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getChildrenBooks
	 * <em>Children Books</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Children Books</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getChildrenBooks()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ChildrenBooks();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getPublisherDefinition
	 * <em>Publisher Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Publisher Definition</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot#getPublisherDefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PublisherDefinition();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library <em>Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Library</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getLibrary
	 * <em>Library</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getLibrary()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Library();

	/**
	 * Returns the meta object for the attribute list '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinitionGroup
	 * <em>Abstract Book Definition Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Abstract Book Definition Group</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinitionGroup()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_AbstractBookDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinition
	 * <em>Abstract Book Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Abstract Book Definition</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getAbstractBookDefinition()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_AbstractBookDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getUniqueName
	 * <em>Unique Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library#getUniqueName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_UniqueName();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition
	 * <em>Publisher Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Publisher Definition</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition
	 * @generated
	 */
	EClass getPublisherDefinition();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getTitle
	 * <em>Title</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getTitle()
	 * @see #getPublisherDefinition()
	 * @generated
	 */
	EAttribute getPublisherDefinition_Title();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getResourceLink
	 * <em>Resource Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Resource Link</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition#getResourceLink()
	 * @see #getPublisherDefinition()
	 * @generated
	 */
	EReference getPublisherDefinition_ResourceLink();

	/**
	 * Returns the meta object for class '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink
	 * <em>Resource Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Resource Link</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink
	 * @generated
	 */
	EClass getResourceLink();

	/**
	 * Returns the meta object for the attribute '
	 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink#getName()
	 * @see #getResourceLink()
	 * @generated
	 */
	EAttribute getResourceLink_Name();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl
		 * <em>Adult Books</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.AdultBooksImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getAdultBooks()
		 * @generated
		 */
		EClass ADULT_BOOKS = eINSTANCE.getAdultBooks();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADULT_BOOKS__TITLE = eINSTANCE.getAdultBooks_Title();

		/**
		 * The meta object literal for the '<em><b>Checkedout</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADULT_BOOKS__CHECKEDOUT = eINSTANCE.getAdultBooks_Checkedout();

		/**
		 * The meta object literal for the '<em><b>Userid</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ADULT_BOOKS__USERID = eINSTANCE.getAdultBooks_Userid();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl
		 * <em>Book Definition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBookDefinition()
		 * @generated
		 */
		EClass BOOK_DEFINITION = eINSTANCE.getBookDefinition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK_DEFINITION__DESCRIPTION = eINSTANCE.getBookDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK_DEFINITION__LOCATION = eINSTANCE.getBookDefinition_Location();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK_DEFINITION__UNIQUE_NAME = eINSTANCE.getBookDefinition_UniqueName();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionResourceLinkImpl
		 * <em>Book Definition Resource Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BookDefinitionResourceLinkImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBookDefinitionResourceLink()
		 * @generated
		 */
		EClass BOOK_DEFINITION_RESOURCE_LINK = eINSTANCE.getBookDefinitionResourceLink();

		/**
		 * The meta object literal for the '<em><b>Book Subject</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT = eINSTANCE
				.getBookDefinitionResourceLink_BookSubject();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BooksInLibImpl
		 * <em>Books In Lib</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BooksInLibImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getBooksInLib()
		 * @generated
		 */
		EClass BOOKS_IN_LIB = eINSTANCE.getBooksInLib();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BOOKS_IN_LIB__LIBRARY = eINSTANCE.getBooksInLib_Library();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl
		 * <em>Children Books</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getChildrenBooks()
		 * @generated
		 */
		EClass CHILDREN_BOOKS = eINSTANCE.getChildrenBooks();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILDREN_BOOKS__TITLE = eINSTANCE.getChildrenBooks_Title();

		/**
		 * The meta object literal for the '<em><b>Cartoon</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILDREN_BOOKS__CARTOON = eINSTANCE.getChildrenBooks_Cartoon();

		/**
		 * The meta object literal for the '<em><b>Popup</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CHILDREN_BOOKS__POPUP = eINSTANCE.getChildrenBooks_Popup();

		/**
		 * The meta object literal for the '<em><b>Publisher Definition Ref</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF = eINSTANCE
				.getChildrenBooks_PublisherDefinitionRef();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl
		 * <em>Document Root</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.DocumentRootImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abstract Book Definition</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION = eINSTANCE
				.getDocumentRoot_AbstractBookDefinition();

		/**
		 * The meta object literal for the '<em><b>Adult Books</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADULT_BOOKS = eINSTANCE.getDocumentRoot_AdultBooks();

		/**
		 * The meta object literal for the '<em><b>Booksinlib</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOKSINLIB = eINSTANCE.getDocumentRoot_Booksinlib();

		/**
		 * The meta object literal for the '<em><b>Children Books</b></em>' containment reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHILDREN_BOOKS = eINSTANCE.getDocumentRoot_ChildrenBooks();

		/**
		 * The meta object literal for the '<em><b>Publisher Definition</b></em>' containment reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLISHER_DEFINITION = eINSTANCE
				.getDocumentRoot_PublisherDefinition();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl
		 * <em>Library</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.LibraryImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__LIBRARY = eINSTANCE.getLibrary_Library();

		/**
		 * The meta object literal for the '<em><b>Abstract Book Definition Group</b></em>' attribute
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP = eINSTANCE
				.getLibrary_AbstractBookDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Book Definition</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LIBRARY__ABSTRACT_BOOK_DEFINITION = eINSTANCE.getLibrary_AbstractBookDefinition();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LIBRARY__UNIQUE_NAME = eINSTANCE.getLibrary_UniqueName();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl
		 * <em>Publisher Definition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.PublisherDefinitionImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getPublisherDefinition()
		 * @generated
		 */
		EClass PUBLISHER_DEFINITION = eINSTANCE.getPublisherDefinition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PUBLISHER_DEFINITION__TITLE = eINSTANCE.getPublisherDefinition_Title();

		/**
		 * The meta object literal for the '<em><b>Resource Link</b></em>' containment reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PUBLISHER_DEFINITION__RESOURCE_LINK = eINSTANCE
				.getPublisherDefinition_ResourceLink();

		/**
		 * The meta object literal for the '
		 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ResourceLinkImpl
		 * <em>Resource Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ResourceLinkImpl
		 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.TestPackageImpl#getResourceLink()
		 * @generated
		 */
		EClass RESOURCE_LINK = eINSTANCE.getResourceLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RESOURCE_LINK__NAME = eINSTANCE.getResourceLink_Name();

	}

} // TestPackage
