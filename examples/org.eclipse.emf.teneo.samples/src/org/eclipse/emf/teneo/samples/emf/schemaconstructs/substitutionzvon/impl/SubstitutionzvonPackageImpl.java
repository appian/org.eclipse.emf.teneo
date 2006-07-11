/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionzvonPackageImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexEvenType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexOddType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.util.SubstitutionzvonValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionzvonPackageImpl extends EPackageImpl implements SubstitutionzvonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexAAAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexEvenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexOddTypeEClass = null;

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
	private EClass rootTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aaaEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType evenTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oddTypeEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubstitutionzvonPackageImpl() {
		super(eNS_URI, SubstitutionzvonFactory.eINSTANCE);
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
	public static SubstitutionzvonPackage init() {
		if (isInited) return (SubstitutionzvonPackage)EPackage.Registry.INSTANCE.getEPackage(SubstitutionzvonPackage.eNS_URI);

		// Obtain or create and register package
		SubstitutionzvonPackageImpl theSubstitutionzvonPackage = (SubstitutionzvonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SubstitutionzvonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SubstitutionzvonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theSubstitutionzvonPackage.createPackageContents();

		// Initialize created meta-data
		theSubstitutionzvonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSubstitutionzvonPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SubstitutionzvonValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSubstitutionzvonPackage.freeze();

		return theSubstitutionzvonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexAAA() {
		return complexAAAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexAAA_Value() {
		return (EAttribute)complexAAAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexEvenType() {
		return complexEvenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexOddType() {
		return complexOddTypeEClass;
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
	public EReference getDocumentRoot_ComplexEven() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MyComplexAbstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComplexOdd() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Even() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MyAbstract() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Odd() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Root() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootType() {
		return rootTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootType_MyAbstractGroup() {
		return (EAttribute)rootTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootType_MyAbstract() {
		return (EAttribute)rootTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootType_MyComplexAbstractGroup() {
		return (EAttribute)rootTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootType_MyComplexAbstract() {
		return (EReference)rootTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAAA() {
		return aaaEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEvenType() {
		return evenTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOddType() {
		return oddTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionzvonFactory getSubstitutionzvonFactory() {
		return (SubstitutionzvonFactory)getEFactoryInstance();
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
		complexAAAEClass = createEClass(COMPLEX_AAA);
		createEAttribute(complexAAAEClass, COMPLEX_AAA__VALUE);

		complexEvenTypeEClass = createEClass(COMPLEX_EVEN_TYPE);

		complexOddTypeEClass = createEClass(COMPLEX_ODD_TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPLEX_EVEN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPLEX_ODD);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EVEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MY_ABSTRACT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ODD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT);

		rootTypeEClass = createEClass(ROOT_TYPE);
		createEAttribute(rootTypeEClass, ROOT_TYPE__MY_ABSTRACT_GROUP);
		createEAttribute(rootTypeEClass, ROOT_TYPE__MY_ABSTRACT);
		createEAttribute(rootTypeEClass, ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		createEReference(rootTypeEClass, ROOT_TYPE__MY_COMPLEX_ABSTRACT);

		// Create data types
		aaaEDataType = createEDataType(AAA);
		evenTypeEDataType = createEDataType(EVEN_TYPE);
		oddTypeEDataType = createEDataType(ODD_TYPE);
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
		complexEvenTypeEClass.getESuperTypes().add(this.getComplexAAA());
		complexOddTypeEClass.getESuperTypes().add(this.getComplexAAA());

		// Initialize classes and features; add operations and parameters
		initEClass(complexAAAEClass, ComplexAAA.class, "ComplexAAA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexAAA_Value(), theXMLTypePackage.getLong(), "value", null, 1, 1, ComplexAAA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexEvenTypeEClass, ComplexEvenType.class, "ComplexEvenType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complexOddTypeEClass, ComplexOddType.class, "ComplexOddType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComplexEven(), this.getComplexEvenType(), null, "complexEven", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MyComplexAbstract(), this.getComplexAAA(), null, "myComplexAbstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComplexOdd(), this.getComplexOddType(), null, "complexOdd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Even(), this.getEvenType(), "even", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MyAbstract(), this.getAAA(), "myAbstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Odd(), this.getOddType(), "odd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Root(), this.getRootType(), null, "root", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rootTypeEClass, RootType.class, "RootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootType_MyAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "myAbstractGroup", null, 1, 1, RootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootType_MyAbstract(), this.getAAA(), "myAbstract", null, 1, 1, RootType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootType_MyComplexAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "myComplexAbstractGroup", null, 1, 1, RootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootType_MyComplexAbstract(), this.getComplexAAA(), null, "myComplexAbstract", null, 1, 1, RootType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(aaaEDataType, BigInteger.class, "AAA", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(evenTypeEDataType, BigInteger.class, "EvenType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oddTypeEDataType, BigInteger.class, "OddType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (aaaEDataType, 
		   source, 
		   new String[] {
			 "name", "AAA",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "1",
			 "maxInclusive", "9"
		   });		
		addAnnotation
		  (complexAAAEClass, 
		   source, 
		   new String[] {
			 "name", "complexAAA",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getComplexAAA_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (complexEvenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "complexEven_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (complexOddTypeEClass, 
		   source, 
		   new String[] {
			 "name", "complexOdd_._type",
			 "kind", "elementOnly"
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
		  (getDocumentRoot_ComplexEven(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complexEven",
			 "namespace", "##targetNamespace",
			 "affiliation", "myComplexAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_MyComplexAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myComplexAbstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ComplexOdd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "complexOdd",
			 "namespace", "##targetNamespace",
			 "affiliation", "myComplexAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_Even(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "even",
			 "namespace", "##targetNamespace",
			 "affiliation", "myAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_MyAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myAbstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Odd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "odd",
			 "namespace", "##targetNamespace",
			 "affiliation", "myAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_Root(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "root",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (evenTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "even_._type",
			 "baseType", "AAA",
			 "enumeration", "2 4 6 8"
		   });		
		addAnnotation
		  (oddTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "odd_._type",
			 "baseType", "AAA",
			 "enumeration", "1 3 5 7 9"
		   });		
		addAnnotation
		  (rootTypeEClass, 
		   source, 
		   new String[] {
			 "name", "root_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRootType_MyAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "myAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRootType_MyAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myAbstract",
			 "namespace", "##targetNamespace",
			 "group", "myAbstract:group"
		   });		
		addAnnotation
		  (getRootType_MyComplexAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "myComplexAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRootType_MyComplexAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myComplexAbstract",
			 "namespace", "##targetNamespace",
			 "group", "myComplexAbstract:group"
		   });
	}

} //SubstitutionzvonPackageImpl
