/**
 * <copyright>
 * </copyright>
 *
 * $Id: EdatatypeColumnPackageImpl.java,v 1.2 2007/02/08 23:09:27 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdatatypeColumnPackageImpl extends EPackageImpl implements EdatatypeColumnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pagesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pagesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType titleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType weightTypeEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.edatatypeColumn.EdatatypeColumnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdatatypeColumnPackageImpl() {
		super(eNS_URI, EdatatypeColumnFactory.eINSTANCE);
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
	public static EdatatypeColumnPackage init() {
		if (isInited) return (EdatatypeColumnPackage)EPackage.Registry.INSTANCE.getEPackage(EdatatypeColumnPackage.eNS_URI);

		// Obtain or create and register package
		EdatatypeColumnPackageImpl theEdatatypeColumnPackage = (EdatatypeColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EdatatypeColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EdatatypeColumnPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEdatatypeColumnPackage.createPackageContents();

		// Initialize created meta-data
		theEdatatypeColumnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdatatypeColumnPackage.freeze();

		return theEdatatypeColumnPackage;
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
	public EDataType getPagesType() {
		return pagesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPagesTypeObject() {
		return pagesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTitleType() {
		return titleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWeightType() {
		return weightTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdatatypeColumnFactory getEdatatypeColumnFactory() {
		return (EdatatypeColumnFactory)getEFactoryInstance();
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

		// Create data types
		pagesTypeEDataType = createEDataType(PAGES_TYPE);
		pagesTypeObjectEDataType = createEDataType(PAGES_TYPE_OBJECT);
		titleTypeEDataType = createEDataType(TITLE_TYPE);
		weightTypeEDataType = createEDataType(WEIGHT_TYPE);
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

		// Initialize classes and features; add operations and parameters
		initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBook_Title(), this.getTitleType(), "title", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Pages(), this.getPagesType(), "pages", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Weight(), this.getWeightType(), "weight", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBook_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(pagesTypeEDataType, int.class, "PagesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pagesTypeObjectEDataType, Integer.class, "PagesTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(titleTypeEDataType, String.class, "TitleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(weightTypeEDataType, BigDecimal.class, "WeightType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// teneo.jpa
		createTeneoAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa";		
		addAnnotation
		  (bookEClass, 
		   source, 
		   new String[] {
			 "appinfo", "@Table(name=\"mybooktable\")"
		   });			
		addAnnotation
		  (getBook_Title(), 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"titel\" unique=\"true\" length=\"25\")"
		   });						
		addAnnotation
		  (pagesTypeEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "@Column(updatable=\"false\" insertable=\"false\")"
		   });				
		addAnnotation
		  (titleTypeEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"mytitle\" unique=\"false\" length=\"50\")"
		   });			
		addAnnotation
		  (weightTypeEDataType, 
		   source, 
		   new String[] {
			 "appinfo", "@Column(name=\"gewicht\" nullable=\"true\" precision=\"5\" scale=\"2\")"
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
		addAnnotation
		  (pagesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PagesType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int"
		   });		
		addAnnotation
		  (pagesTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PagesType:Object",
			 "baseType", "PagesType"
		   });			
		addAnnotation
		  (titleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "TitleType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (weightTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "WeightType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
	}

} //EdatatypeColumnPackageImpl
