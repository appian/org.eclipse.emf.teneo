/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestPackageImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.AdultBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BookDefinitionResourceLink;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.DocumentRoot;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ResourceLink;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestFactory;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adultBooksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookDefinitionResourceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booksInLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenBooksEClass = null;

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
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceLinkEClass = null;

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
	 * @see com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
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
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdultBooks() {
		return adultBooksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdultBooks_Title() {
		return (EAttribute)adultBooksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdultBooks_Checkedout() {
		return (EAttribute)adultBooksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdultBooks_Userid() {
		return (EAttribute)adultBooksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookDefinition() {
		return bookDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookDefinition_Description() {
		return (EAttribute)bookDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookDefinition_Location() {
		return (EAttribute)bookDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookDefinition_UniqueName() {
		return (EAttribute)bookDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookDefinitionResourceLink() {
		return bookDefinitionResourceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookDefinitionResourceLink_BookSubject() {
		return (EAttribute)bookDefinitionResourceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooksInLib() {
		return booksInLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooksInLib_Library() {
		return (EReference)booksInLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildrenBooks() {
		return childrenBooksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildrenBooks_Title() {
		return (EAttribute)childrenBooksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildrenBooks_Cartoon() {
		return (EAttribute)childrenBooksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildrenBooks_Popup() {
		return (EAttribute)childrenBooksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildrenBooks_PublisherDefinitionRef() {
		return (EReference)childrenBooksEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_AbstractBookDefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AdultBooks() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Booksinlib() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChildrenBooks() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PublisherDefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Library() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_AbstractBookDefinitionGroup() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_AbstractBookDefinition() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_UniqueName() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisherDefinition() {
		return publisherDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisherDefinition_Title() {
		return (EAttribute)publisherDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisherDefinition_ResourceLink() {
		return (EReference)publisherDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceLink() {
		return resourceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceLink_Name() {
		return (EAttribute)resourceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
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
		adultBooksEClass = createEClass(ADULT_BOOKS);
		createEAttribute(adultBooksEClass, ADULT_BOOKS__TITLE);
		createEAttribute(adultBooksEClass, ADULT_BOOKS__CHECKEDOUT);
		createEAttribute(adultBooksEClass, ADULT_BOOKS__USERID);

		bookDefinitionEClass = createEClass(BOOK_DEFINITION);
		createEAttribute(bookDefinitionEClass, BOOK_DEFINITION__DESCRIPTION);
		createEAttribute(bookDefinitionEClass, BOOK_DEFINITION__LOCATION);
		createEAttribute(bookDefinitionEClass, BOOK_DEFINITION__UNIQUE_NAME);

		bookDefinitionResourceLinkEClass = createEClass(BOOK_DEFINITION_RESOURCE_LINK);
		createEAttribute(bookDefinitionResourceLinkEClass, BOOK_DEFINITION_RESOURCE_LINK__BOOK_SUBJECT);

		booksInLibEClass = createEClass(BOOKS_IN_LIB);
		createEReference(booksInLibEClass, BOOKS_IN_LIB__LIBRARY);

		childrenBooksEClass = createEClass(CHILDREN_BOOKS);
		createEAttribute(childrenBooksEClass, CHILDREN_BOOKS__TITLE);
		createEAttribute(childrenBooksEClass, CHILDREN_BOOKS__CARTOON);
		createEAttribute(childrenBooksEClass, CHILDREN_BOOKS__POPUP);
		createEReference(childrenBooksEClass, CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_BOOK_DEFINITION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADULT_BOOKS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOKSINLIB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHILDREN_BOOKS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER_DEFINITION);

		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__ABSTRACT_BOOK_DEFINITION_GROUP);
		createEReference(libraryEClass, LIBRARY__ABSTRACT_BOOK_DEFINITION);
		createEAttribute(libraryEClass, LIBRARY__UNIQUE_NAME);

		publisherDefinitionEClass = createEClass(PUBLISHER_DEFINITION);
		createEAttribute(publisherDefinitionEClass, PUBLISHER_DEFINITION__TITLE);
		createEReference(publisherDefinitionEClass, PUBLISHER_DEFINITION__RESOURCE_LINK);

		resourceLinkEClass = createEClass(RESOURCE_LINK);
		createEAttribute(resourceLinkEClass, RESOURCE_LINK__NAME);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adultBooksEClass.getESuperTypes().add(this.getBookDefinition());
		bookDefinitionResourceLinkEClass.getESuperTypes().add(this.getResourceLink());
		childrenBooksEClass.getESuperTypes().add(this.getBookDefinition());
		publisherDefinitionEClass.getESuperTypes().add(this.getBookDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(adultBooksEClass, AdultBooks.class, "AdultBooks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdultBooks_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, AdultBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdultBooks_Checkedout(), theXMLTypePackage.getString(), "checkedout", null, 1, 1, AdultBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdultBooks_Userid(), theXMLTypePackage.getString(), "userid", null, 1, 1, AdultBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookDefinitionEClass, BookDefinition.class, "BookDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookDefinition_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, BookDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookDefinition_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, BookDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookDefinition_UniqueName(), theXMLTypePackage.getID(), "uniqueName", null, 1, 1, BookDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookDefinitionResourceLinkEClass, BookDefinitionResourceLink.class, "BookDefinitionResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookDefinitionResourceLink_BookSubject(), theXMLTypePackage.getString(), "bookSubject", null, 0, 1, BookDefinitionResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booksInLibEClass, BooksInLib.class, "BooksInLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooksInLib_Library(), this.getLibrary(), null, "library", null, 1, -1, BooksInLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childrenBooksEClass, ChildrenBooks.class, "ChildrenBooks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildrenBooks_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, ChildrenBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildrenBooks_Cartoon(), theXMLTypePackage.getString(), "cartoon", null, 1, 1, ChildrenBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildrenBooks_Popup(), theXMLTypePackage.getString(), "popup", null, 1, 1, ChildrenBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildrenBooks_PublisherDefinitionRef(), this.getPublisherDefinition(), null, "publisherDefinitionRef", null, 1, 1, ChildrenBooks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractBookDefinition(), this.getBookDefinition(), null, "abstractBookDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AdultBooks(), this.getAdultBooks(), null, "adultBooks", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Booksinlib(), this.getBooksInLib(), null, "booksinlib", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChildrenBooks(), this.getChildrenBooks(), null, "childrenBooks", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PublisherDefinition(), this.getPublisherDefinition(), null, "publisherDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Library(), this.getLibrary(), null, "library", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_AbstractBookDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "abstractBookDefinitionGroup", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_AbstractBookDefinition(), this.getBookDefinition(), null, "abstractBookDefinition", null, 0, -1, Library.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_UniqueName(), theXMLTypePackage.getID(), "uniqueName", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherDefinitionEClass, PublisherDefinition.class, "PublisherDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisherDefinition_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, PublisherDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublisherDefinition_ResourceLink(), this.getBookDefinitionResourceLink(), null, "resourceLink", null, 1, 1, PublisherDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceLinkEClass, ResourceLink.class, "ResourceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceLink_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNamespaceAnnotations() {
		String source = "http://www.w3.org/XML/1998/namespace";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "lang", "en"
		   });																																				
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
		  (adultBooksEClass, 
		   source, 
		   new String[] {
			 "name", "AdultBooks",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAdultBooks_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAdultBooks_Checkedout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "checkedout",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAdultBooks_Userid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (bookDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "BookDefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBookDefinition_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookDefinition_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookDefinition_UniqueName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uniqueName"
		   });		
		addAnnotation
		  (bookDefinitionResourceLinkEClass, 
		   source, 
		   new String[] {
			 "name", "BookDefinitionResourceLink",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBookDefinitionResourceLink_BookSubject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bookSubject"
		   });		
		addAnnotation
		  (booksInLibEClass, 
		   source, 
		   new String[] {
			 "name", "BooksInLib",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBooksInLib_Library(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "library",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (childrenBooksEClass, 
		   source, 
		   new String[] {
			 "name", "ChildrenBooks",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChildrenBooks_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChildrenBooks_Cartoon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cartoon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChildrenBooks_Popup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "popup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChildrenBooks_PublisherDefinitionRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "publisherDefinitionRef"
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
		  (getDocumentRoot_AbstractBookDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-book-definition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_AdultBooks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "adult-books",
			 "namespace", "##targetNamespace",
			 "affiliation", "abstract-book-definition"
		   });		
		addAnnotation
		  (getDocumentRoot_Booksinlib(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "booksinlib",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChildrenBooks(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "children-books",
			 "namespace", "##targetNamespace",
			 "affiliation", "abstract-book-definition"
		   });		
		addAnnotation
		  (getDocumentRoot_PublisherDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher-definition",
			 "namespace", "##targetNamespace",
			 "affiliation", "abstract-book-definition"
		   });		
		addAnnotation
		  (libraryEClass, 
		   source, 
		   new String[] {
			 "name", "Library",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLibrary_Library(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "library",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLibrary_AbstractBookDefinitionGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "abstract-book-definition:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLibrary_AbstractBookDefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract-book-definition",
			 "namespace", "##targetNamespace",
			 "group", "abstract-book-definition:group"
		   });		
		addAnnotation
		  (getLibrary_UniqueName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uniqueName"
		   });		
		addAnnotation
		  (publisherDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "PublisherDefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPublisherDefinition_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublisherDefinition_ResourceLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource-link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resourceLinkEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceLink",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getResourceLink_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });
	}

} //TestPackageImpl
