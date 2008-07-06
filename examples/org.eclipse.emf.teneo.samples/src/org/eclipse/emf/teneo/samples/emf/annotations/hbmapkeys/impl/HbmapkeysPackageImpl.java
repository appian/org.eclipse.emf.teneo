/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbmapkeysPackageImpl.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbmapkeysPackageImpl extends EPackageImpl implements HbmapkeysPackage {
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
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToWriterMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writerToCityMapEntryEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HbmapkeysPackageImpl() {
		super(eNS_URI, HbmapkeysFactory.eINSTANCE);
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
	public static HbmapkeysPackage init() {
		if (isInited) return (HbmapkeysPackage)EPackage.Registry.INSTANCE.getEPackage(HbmapkeysPackage.eNS_URI);

		// Obtain or create and register package
		HbmapkeysPackageImpl theHbmapkeysPackage = (HbmapkeysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof HbmapkeysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new HbmapkeysPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHbmapkeysPackage.createPackageContents();

		// Initialize created meta-data
		theHbmapkeysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHbmapkeysPackage.freeze();

		return theHbmapkeysPackage;
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
	public EReference getBook_WritersByName() {
		return (EReference)bookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBook_CityByWriter() {
		return (EReference)bookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_CityWriter() {
		return (EReference)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToWriterMapEntry() {
		return stringToWriterMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToWriterMapEntry_Key() {
		return (EAttribute)stringToWriterMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToWriterMapEntry_Value() {
		return (EReference)stringToWriterMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriter() {
		return writerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriter_Name() {
		return (EAttribute)writerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriterToCityMapEntry() {
		return writerToCityMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterToCityMapEntry_Key() {
		return (EReference)writerToCityMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriterToCityMapEntry_Value() {
		return (EReference)writerToCityMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbmapkeysFactory getHbmapkeysFactory() {
		return (HbmapkeysFactory)getEFactoryInstance();
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
		createEReference(bookEClass, BOOK__WRITERS_BY_NAME);
		createEReference(bookEClass, BOOK__CITY_BY_WRITER);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);
		createEReference(cityEClass, CITY__CITY_WRITER);

		stringToWriterMapEntryEClass = createEClass(STRING_TO_WRITER_MAP_ENTRY);
		createEAttribute(stringToWriterMapEntryEClass, STRING_TO_WRITER_MAP_ENTRY__KEY);
		createEReference(stringToWriterMapEntryEClass, STRING_TO_WRITER_MAP_ENTRY__VALUE);

		writerEClass = createEClass(WRITER);
		createEAttribute(writerEClass, WRITER__NAME);

		writerToCityMapEntryEClass = createEClass(WRITER_TO_CITY_MAP_ENTRY);
		createEReference(writerToCityMapEntryEClass, WRITER_TO_CITY_MAP_ENTRY__KEY);
		createEReference(writerToCityMapEntryEClass, WRITER_TO_CITY_MAP_ENTRY__VALUE);
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
		initEAttribute(getBook_Title(), theXMLTypePackage.getString(), "title", null, 1, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBook_WritersByName(), this.getStringToWriterMapEntry(), null, "writersByName", null, 0, -1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBook_CityByWriter(), this.getWriterToCityMapEntry(), null, "cityByWriter", null, 0, -1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_CityWriter(), this.getWriter(), null, "cityWriter", null, 1, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToWriterMapEntryEClass, Map.Entry.class, "StringToWriterMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToWriterMapEntry_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToWriterMapEntry_Value(), this.getWriter(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writerEClass, Writer.class, "Writer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWriter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Writer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writerToCityMapEntryEClass, Map.Entry.class, "WriterToCityMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriterToCityMapEntry_Key(), this.getWriter(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWriterToCityMapEntry_Value(), this.getCity(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
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
		  (getBook_WritersByName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "writersByName"
		   });			
		addAnnotation
		  (getBook_CityByWriter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cityByWriter"
		   });		
		addAnnotation
		  (cityEClass, 
		   source, 
		   new String[] {
			 "name", "City",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCity_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });			
		addAnnotation
		  (getCity_CityWriter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cityWriter"
		   });		
		addAnnotation
		  (stringToWriterMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "StringToWriterMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStringToWriterMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getStringToWriterMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (writerEClass, 
		   source, 
		   new String[] {
			 "name", "Writer",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getWriter_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (writerToCityMapEntryEClass, 
		   source, 
		   new String[] {
			 "name", "WriterToCityMapEntry",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getWriterToCityMapEntry_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getWriterToCityMapEntry_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });
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
		  (getBook_WritersByName(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@HbMapKey(columns=@Column(name=\"THENAMEOFTHEWRITER\"))\n\t\t\t\t\t\t@JoinColumn(name=\"JOIN_COLUMN_WRITER\")\n\t\t\t\t\t"
		   });			
		addAnnotation
		  (getBook_CityByWriter(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@MapKeyManyToMany(targetEntity=\"Writer\", joinColumns=@JoinColumn(name=\"THE_CITYWRITER_ID\"))\n\t\t\t\t\t\t@JoinColumn(name=\"JOIN_COLUMN_CITY\")\n\t\t\t\t\t"
		   });					
		addAnnotation
		  (getCity_CityWriter(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@JoinColumn(name=\"THE_CITYWRITER_ID\")\n\t\t\t\t\t"
		   });							
		addAnnotation
		  (getWriter_Name(), 
		   source, 
		   new String[] {
			 "appinfo", "\n\t\t\t\t\t\t@Column(name=\"THENAMEOFTHEWRITER\")\n\t\t\t\t\t"
		   });				
	}

} //HbmapkeysPackageImpl
