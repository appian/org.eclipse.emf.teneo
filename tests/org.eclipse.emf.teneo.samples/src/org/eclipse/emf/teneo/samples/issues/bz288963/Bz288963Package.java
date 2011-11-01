/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz288963Package.java,v 1.1 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz288963;

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
 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Bz288963Factory
 * @model kind="package"
 * @generated
 */
public interface Bz288963Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bz288963";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/bz288963";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bz288963";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz288963Package eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.BookImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 0;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CITATION = 0;

	/**
	 * The feature id for the '<em><b>Paralist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PARALIST = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ID = 2;

	/**
	 * The feature id for the '<em><b>Selfdef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__SELFDEF = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK = 3;

	/**
	 * The feature id for the '<em><b>Footnote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTNOTE = 4;

	/**
	 * The feature id for the '<em><b>Indentedpara</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INDENTEDPARA = 5;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAGRAPH = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.ParagraphImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.FootnoteImpl <em>Footnote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.FootnoteImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getFootnote()
	 * @generated
	 */
	int FOOTNOTE = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__NUMBER = PARAGRAPH__NUMBER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE__TITLE = PARAGRAPH__TITLE;

	/**
	 * The number of structural features of the '<em>Footnote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.IndentedparaImpl <em>Indentedpara</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.IndentedparaImpl
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getIndentedpara()
	 * @generated
	 */
	int INDENTEDPARA = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDENTEDPARA__NUMBER = PARAGRAPH__NUMBER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDENTEDPARA__TITLE = PARAGRAPH__TITLE;

	/**
	 * The feature id for the '<em><b>Indent Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDENTEDPARA__INDENT_SPACE = PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indentedpara</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDENTEDPARA_FEATURE_COUNT = PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Booktype <em>Booktype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBooktype()
	 * @generated
	 */
	int BOOKTYPE = 5;

	/**
	 * The meta object id for the '<em>Booktype Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBooktypeObject()
	 * @generated
	 */
	int BOOKTYPE_OBJECT = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Citation</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book#getCitation()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Citation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getParalist <em>Paralist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paralist</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book#getParalist()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Paralist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book#getId()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getSelfdef <em>Selfdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selfdef</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book#getSelfdef()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Selfdef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Book#getType()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getBook()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Book();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getFootnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footnote</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getFootnote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Footnote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getIndentedpara <em>Indentedpara</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indentedpara</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getIndentedpara()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Indentedpara();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paragraph</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.DocumentRoot#getParagraph()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Paragraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Footnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Footnote
	 * @generated
	 */
	EClass getFootnote();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara <em>Indentedpara</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indentedpara</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara
	 * @generated
	 */
	EClass getIndentedpara();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace <em>Indent Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indent Space</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Indentedpara#getIndentSpace()
	 * @see #getIndentedpara()
	 * @generated
	 */
	EAttribute getIndentedpara_IndentSpace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph#getNumber()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Paragraph#getTitle()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Title();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Booktype <em>Booktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Booktype</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @generated
	 */
	EEnum getBooktype();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Booktype <em>Booktype Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Booktype Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
	 * @model instanceClass="org.eclipse.emf.teneo.samples.issues.bz288963.Booktype"
	 *        extendedMetaData="name='Booktype:Object' baseType='Booktype'"
	 * @generated
	 */
	EDataType getBooktypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bz288963Factory getBz288963Factory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.BookImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__CITATION = eINSTANCE.getBook_Citation();

		/**
		 * The meta object literal for the '<em><b>Paralist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__PARALIST = eINSTANCE.getBook_Paralist();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__ID = eINSTANCE.getBook_Id();

		/**
		 * The meta object literal for the '<em><b>Selfdef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__SELFDEF = eINSTANCE.getBook_Selfdef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__TYPE = eINSTANCE.getBook_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.DocumentRootImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOK = eINSTANCE.getDocumentRoot_Book();

		/**
		 * The meta object literal for the '<em><b>Footnote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOOTNOTE = eINSTANCE.getDocumentRoot_Footnote();

		/**
		 * The meta object literal for the '<em><b>Indentedpara</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INDENTEDPARA = eINSTANCE.getDocumentRoot_Indentedpara();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAGRAPH = eINSTANCE.getDocumentRoot_Paragraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.FootnoteImpl <em>Footnote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.FootnoteImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getFootnote()
		 * @generated
		 */
		EClass FOOTNOTE = eINSTANCE.getFootnote();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.IndentedparaImpl <em>Indentedpara</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.IndentedparaImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getIndentedpara()
		 * @generated
		 */
		EClass INDENTEDPARA = eINSTANCE.getIndentedpara();

		/**
		 * The meta object literal for the '<em><b>Indent Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDENTEDPARA__INDENT_SPACE = eINSTANCE.getIndentedpara_IndentSpace();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.ParagraphImpl
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__NUMBER = eINSTANCE.getParagraph_Number();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TITLE = eINSTANCE.getParagraph_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.bz288963.Booktype <em>Booktype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBooktype()
		 * @generated
		 */
		EEnum BOOKTYPE = eINSTANCE.getBooktype();

		/**
		 * The meta object literal for the '<em>Booktype Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.Booktype
		 * @see org.eclipse.emf.teneo.samples.issues.bz288963.impl.Bz288963PackageImpl#getBooktypeObject()
		 * @generated
		 */
		EDataType BOOKTYPE_OBJECT = eINSTANCE.getBooktypeObject();

	}

} //Bz288963Package
