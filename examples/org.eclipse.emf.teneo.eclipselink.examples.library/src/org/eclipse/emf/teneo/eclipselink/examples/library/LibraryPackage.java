/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryPackage.java,v 1.9 2010/04/22 17:57:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryFactory
 * @model kind="package"
 * @generated
 */
public interface LibraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/emf/teneo/eclipselink/examples/library.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "library"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LibraryPackage eINSTANCE = org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.IdentifiableImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PAGES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CATEGORY = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__STYLES = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Translator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TRANSLATOR = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__COVER = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Derived Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__DERIVED_ATTRIBUTE = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__WRITERS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Books</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__BOOKS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getWriter()
	 * @generated
	 */
	int WRITER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Books</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__BOOKS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__ADDRESS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publishers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__PUBLISHERS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Typewriters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__TYPEWRITERS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl <em>String To Book Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getStringToBookMapEntry()
	 * @generated
	 */
	int STRING_TO_BOOK_MAP_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOK_MAP_ENTRY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOK_MAP_ENTRY__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOK_MAP_ENTRY__KEY = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOK_MAP_ENTRY__VALUE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String To Book Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_BOOK_MAP_ENTRY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.AddressImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Town</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TOWN = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.PublisherImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__WRITERS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.StyleImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookStylesMapEntryImpl <em>Book Styles Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookStylesMapEntryImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBookStylesMapEntry()
	 * @generated
	 */
	int BOOK_STYLES_MAP_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_STYLES_MAP_ENTRY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_STYLES_MAP_ENTRY__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_STYLES_MAP_ENTRY__KEY = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_STYLES_MAP_ENTRY__VALUE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Book Styles Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_STYLES_MAP_ENTRY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.TranslatorImpl <em>Translator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.TranslatorImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTranslator()
	 * @generated
	 */
	int TRANSLATOR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR__NAME = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR__LOCATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR__ADDRESS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Translator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATOR_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.TypeWriterImpl <em>Type Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.TypeWriterImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTypeWriter()
	 * @generated
	 */
	int TYPE_WRITER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WRITER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WRITER__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Maker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WRITER__MAKER = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WRITER__TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_WRITER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.CoverImpl <em>Cover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.CoverImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getCover()
	 * @generated
	 */
	int COVER = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER__VERSION = IDENTIFIABLE__VERSION;

	/**
	 * The feature id for the '<em><b>Colored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER__COLORED = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.AbstractTestImpl <em>Abstract Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.AbstractTestImpl
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getAbstractTest()
	 * @generated
	 */
	int ABSTRACT_TEST = 12;

	/**
	 * The number of structural features of the '<em>Abstract Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TEST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory <em>Book Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBookCategory()
	 * @generated
	 */
	int BOOK_CATEGORY = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType <em>TWriter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTWriterType()
	 * @generated
	 */
	int TWRITER_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTitle()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getPages()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Pages();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCategory()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Category();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getAuthor()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Author();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Styles</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getStyles()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Styles();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTranslator <em>Translator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Translator</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getTranslator()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Translator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCover <em>Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cover</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getCover()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Cover();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Book#getDerivedAttribute <em>Derived Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Attribute</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Book#getDerivedAttribute()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_DerivedAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Library#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Writers</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Library#getWriters()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Writers();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Library#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Books</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Library#getBooks()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Books();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer
	 * @generated
	 */
	EClass getWriter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getName()
	 * @see #getWriter()
	 * @generated
	 */
	EAttribute getWriter_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getBooks()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_Books();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getAddress()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_Address();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getPublishers <em>Publishers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publishers</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getPublishers()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_Publishers();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getTypewriters <em>Typewriters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typewriters</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Writer#getTypewriters()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_Typewriters();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Book Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Book Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.teneo.eclipselink.examples.library.Book" valueContainment="true"
	 *        annotation="teneo.jpa value='@Table(name=\"EMFLIB_LIBRARY_BOOK_MAP\")'"
	 * @generated
	 */
	EClass getStringToBookMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBookMapEntry()
	 * @generated
	 */
	EAttribute getStringToBookMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToBookMapEntry()
	 * @generated
	 */
	EReference getStringToBookMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Address#getTown <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Town</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Address#getTown()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Town();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writers</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Publisher#getWriters()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Writers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Style#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Style#getName()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Book Styles Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Styles Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.teneo.eclipselink.examples.library.Style"
	 *        annotation="teneo.jpa value='@Table(name=\"EMFLIB_BOOK_STYLE_MAP\")'"
	 * @generated
	 */
	EClass getBookStylesMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getBookStylesMapEntry()
	 * @generated
	 */
	EAttribute getBookStylesMapEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getBookStylesMapEntry()
	 * @generated
	 */
	EReference getBookStylesMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Translator <em>Translator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translator</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Translator
	 * @generated
	 */
	EClass getTranslator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getName()
	 * @see #getTranslator()
	 * @generated
	 */
	EAttribute getTranslator_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getLocation()
	 * @see #getTranslator()
	 * @generated
	 */
	EAttribute getTranslator_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Translator#getAddress()
	 * @see #getTranslator()
	 * @generated
	 */
	EReference getTranslator_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter <em>Type Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Writer</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter
	 * @generated
	 */
	EClass getTypeWriter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getMaker <em>Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maker</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getMaker()
	 * @see #getTypeWriter()
	 * @generated
	 */
	EAttribute getTypeWriter_Maker();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getType()
	 * @see #getTypeWriter()
	 * @generated
	 */
	EAttribute getTypeWriter_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Cover <em>Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cover</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Cover
	 * @generated
	 */
	EClass getCover();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Cover#isColored <em>Colored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colored</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Cover#isColored()
	 * @see #getCover()
	 * @generated
	 */
	EAttribute getCover_Colored();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.Identifiable#getVersion()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.eclipselink.examples.library.AbstractTest <em>Abstract Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Test</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.AbstractTest
	 * @generated
	 */
	EClass getAbstractTest();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory <em>Book Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Book Category</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory
	 * @generated
	 */
	EEnum getBookCategory();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType <em>TWriter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TWriter Type</em>'.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType
	 * @generated
	 */
	EEnum getTWriterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LibraryFactory getLibraryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TITLE = eINSTANCE.getBook_Title();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PAGES = eINSTANCE.getBook_Pages();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__CATEGORY = eINSTANCE.getBook_Category();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__AUTHOR = eINSTANCE.getBook_Author();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__STYLES = eINSTANCE.getBook_Styles();

		/**
		 * The meta object literal for the '<em><b>Translator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__TRANSLATOR = eINSTANCE.getBook_Translator();

		/**
		 * The meta object literal for the '<em><b>Cover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__COVER = eINSTANCE.getBook_Cover();

		/**
		 * The meta object literal for the '<em><b>Derived Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__DERIVED_ATTRIBUTE = eINSTANCE.getBook_DerivedAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Writers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__WRITERS = eINSTANCE.getLibrary_Writers();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__BOOKS = eINSTANCE.getLibrary_Books();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.WriterImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getWriter()
		 * @generated
		 */
		EClass WRITER = eINSTANCE.getWriter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITER__NAME = eINSTANCE.getWriter_Name();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER__BOOKS = eINSTANCE.getWriter_Books();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER__ADDRESS = eINSTANCE.getWriter_Address();

		/**
		 * The meta object literal for the '<em><b>Publishers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER__PUBLISHERS = eINSTANCE.getWriter_Publishers();

		/**
		 * The meta object literal for the '<em><b>Typewriters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER__TYPEWRITERS = eINSTANCE.getWriter_Typewriters();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl <em>String To Book Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.StringToBookMapEntryImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getStringToBookMapEntry()
		 * @generated
		 */
		EClass STRING_TO_BOOK_MAP_ENTRY = eINSTANCE.getStringToBookMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_BOOK_MAP_ENTRY__KEY = eINSTANCE.getStringToBookMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_BOOK_MAP_ENTRY__VALUE = eINSTANCE.getStringToBookMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.AddressImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Town</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__TOWN = eINSTANCE.getAddress_Town();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.PublisherImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__NAME = eINSTANCE.getPublisher_Name();

		/**
		 * The meta object literal for the '<em><b>Writers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__WRITERS = eINSTANCE.getPublisher_Writers();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.StyleImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookStylesMapEntryImpl <em>Book Styles Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.BookStylesMapEntryImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBookStylesMapEntry()
		 * @generated
		 */
		EClass BOOK_STYLES_MAP_ENTRY = eINSTANCE.getBookStylesMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_STYLES_MAP_ENTRY__KEY = eINSTANCE.getBookStylesMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_STYLES_MAP_ENTRY__VALUE = eINSTANCE.getBookStylesMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.TranslatorImpl <em>Translator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.TranslatorImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTranslator()
		 * @generated
		 */
		EClass TRANSLATOR = eINSTANCE.getTranslator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATOR__NAME = eINSTANCE.getTranslator_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATOR__LOCATION = eINSTANCE.getTranslator_Location();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATOR__ADDRESS = eINSTANCE.getTranslator_Address();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.TypeWriterImpl <em>Type Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.TypeWriterImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTypeWriter()
		 * @generated
		 */
		EClass TYPE_WRITER = eINSTANCE.getTypeWriter();

		/**
		 * The meta object literal for the '<em><b>Maker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_WRITER__MAKER = eINSTANCE.getTypeWriter_Maker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_WRITER__TYPE = eINSTANCE.getTypeWriter_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.CoverImpl <em>Cover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.CoverImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getCover()
		 * @generated
		 */
		EClass COVER = eINSTANCE.getCover();

		/**
		 * The meta object literal for the '<em><b>Colored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVER__COLORED = eINSTANCE.getCover_Colored();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.IdentifiableImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__VERSION = eINSTANCE.getIdentifiable_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.impl.AbstractTestImpl <em>Abstract Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.AbstractTestImpl
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getAbstractTest()
		 * @generated
		 */
		EClass ABSTRACT_TEST = eINSTANCE.getAbstractTest();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory <em>Book Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.BookCategory
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getBookCategory()
		 * @generated
		 */
		EEnum BOOK_CATEGORY = eINSTANCE.getBookCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType <em>TWriter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType
		 * @see org.eclipse.emf.teneo.eclipselink.examples.library.impl.LibraryPackageImpl#getTWriterType()
		 * @generated
		 */
		EEnum TWRITER_TYPE = eINSTANCE.getTWriterType();

	}

} //LibraryPackage
