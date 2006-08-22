/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColumnPackageImpl.java,v 1.2 2006/08/22 22:24:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.column.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.column.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnPackageImpl extends EPackageImpl implements ColumnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColumnPackageImpl() {
		super(eNS_URI, ColumnFactory.eINSTANCE);
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
	public static ColumnPackage init() {
		if (isInited) return (ColumnPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI);

		// Obtain or create and register package
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ColumnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theColumnPackage.createPackageContents();

		// Initialize created meta-data
		theColumnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theColumnPackage.freeze();

		return theColumnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBook() {
		return bookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Title() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Pages() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Weight() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBook_Author() {
		return (EAttribute)bookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnFactory getColumnFactory() {
		return (ColumnFactory)getEFactoryInstance();
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
		bookEClass = createEClass(BOOK);
		createEAttribute(bookEClass, BOOK__TITLE);
		createEAttribute(bookEClass, BOOK__PAGES);
		createEAttribute(bookEClass, BOOK__WEIGHT);
		createEAttribute(bookEClass, BOOK__AUTHOR);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBook_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Pages(), theXMLTypePackage.getInt(), "pages", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Weight(), theXMLTypePackage.getDecimal(), "weight", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://ejb.elver.org/Table
		createTableAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://ejb.elver.org/Column
		createColumnAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Table</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTableAnnotations() {
		String source = "http://ejb.elver.org/Table";		
		addAnnotation
		  (bookEClass, 
		   source, 
		   new String[] {
			 "name", "mybooktable"
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
		  (bookEClass, 
		   source, 
		   new String[] {
			 "name", "Book",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getBook_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title"
		   });			
		addAnnotation
		  (getBook_Pages(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pages"
		   });			
		addAnnotation
		  (getBook_Weight(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "weight"
		   });		
		addAnnotation
		  (getBook_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createColumnAnnotations() {
		String source = "http://ejb.elver.org/Column";				
		addAnnotation
		  (getBook_Title(), 
		   source, 
		   new String[] {
			 "name", "titel",
			 "unique", "true",
			 "length", "25"
		   });			
		addAnnotation
		  (getBook_Pages(), 
		   source, 
		   new String[] {
			 "updatable", "false",
			 "insertable", "false"
		   });			
		addAnnotation
		  (getBook_Weight(), 
		   source, 
		   new String[] {
			 "name", "gewicht",
			 "nullable", "true",
			 "precision", "5",
			 "scale", "2"
		   });		
	}

} //ColumnPackageImpl
