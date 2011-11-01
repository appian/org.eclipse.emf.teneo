/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionPackageImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

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

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.util.SubstitutionValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubstitutionPackageImpl extends EPackageImpl implements SubstitutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNumberEClass = null;

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
	private EClass evenComplexNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oddComplexNumberTypeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleNumberEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SubstitutionPackageImpl() {
		super(eNS_URI, SubstitutionFactory.eINSTANCE);
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
	public static SubstitutionPackage init() {
		if (isInited) return (SubstitutionPackage)EPackage.Registry.INSTANCE.getEPackage(SubstitutionPackage.eNS_URI);

		// Obtain or create and register package
		SubstitutionPackageImpl theSubstitutionPackage = (SubstitutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SubstitutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SubstitutionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theSubstitutionPackage.createPackageContents();

		// Initialize created meta-data
		theSubstitutionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSubstitutionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SubstitutionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSubstitutionPackage.freeze();

		return theSubstitutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexNumber() {
		return complexNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexNumber_Value() {
		return (EAttribute)complexNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexNumber_Unit() {
		return (EAttribute)complexNumberEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDocumentRoot_Even() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MySimpleAbstract() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EvenComplexNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MyComplexAbstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Number() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Odd() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OddComplexNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvenComplexNumberType() {
		return evenComplexNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiNumberType() {
		return multiNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiNumberType_Name() {
		return (EAttribute)multiNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiNumberType_MyComplexAbstractGroup() {
		return (EAttribute)multiNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiNumberType_MyComplexAbstract() {
		return (EReference)multiNumberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberType() {
		return numberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_Name() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MySimpleAbstractGroup() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MySimpleAbstract() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberType_MyComplexAbstractGroup() {
		return (EAttribute)numberTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberType_MyComplexAbstract() {
		return (EReference)numberTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOddComplexNumberType() {
		return oddComplexNumberTypeEClass;
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
	public EDataType getSimpleNumber() {
		return simpleNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutionFactory getSubstitutionFactory() {
		return (SubstitutionFactory)getEFactoryInstance();
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
		complexNumberEClass = createEClass(COMPLEX_NUMBER);
		createEAttribute(complexNumberEClass, COMPLEX_NUMBER__VALUE);
		createEAttribute(complexNumberEClass, COMPLEX_NUMBER__UNIT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EVEN);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MY_SIMPLE_ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MULTI_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NUMBER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ODD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ODD_COMPLEX_NUMBER);

		evenComplexNumberTypeEClass = createEClass(EVEN_COMPLEX_NUMBER_TYPE);

		multiNumberTypeEClass = createEClass(MULTI_NUMBER_TYPE);
		createEAttribute(multiNumberTypeEClass, MULTI_NUMBER_TYPE__NAME);
		createEAttribute(multiNumberTypeEClass, MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		createEReference(multiNumberTypeEClass, MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT);

		numberTypeEClass = createEClass(NUMBER_TYPE);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__NAME);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__MY_SIMPLE_ABSTRACT);
		createEAttribute(numberTypeEClass, NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		createEReference(numberTypeEClass, NUMBER_TYPE__MY_COMPLEX_ABSTRACT);

		oddComplexNumberTypeEClass = createEClass(ODD_COMPLEX_NUMBER_TYPE);

		// Create data types
		evenTypeEDataType = createEDataType(EVEN_TYPE);
		oddTypeEDataType = createEDataType(ODD_TYPE);
		simpleNumberEDataType = createEDataType(SIMPLE_NUMBER);
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
		evenComplexNumberTypeEClass.getESuperTypes().add(this.getComplexNumber());
		oddComplexNumberTypeEClass.getESuperTypes().add(this.getComplexNumber());

		// Initialize classes and features; add operations and parameters
		initEClass(complexNumberEClass, ComplexNumber.class, "ComplexNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexNumber_Value(), theXMLTypePackage.getInteger(), "value", null, 1, 1, ComplexNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexNumber_Unit(), theXMLTypePackage.getString(), "unit", null, 1, 1, ComplexNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Even(), this.getEvenType(), "even", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MySimpleAbstract(), this.getSimpleNumber(), "mySimpleAbstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EvenComplexNumber(), this.getEvenComplexNumberType(), null, "evenComplexNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MyComplexAbstract(), this.getComplexNumber(), null, "myComplexAbstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MultiNumber(), this.getMultiNumberType(), null, "multiNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Number(), this.getNumberType(), null, "number", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Odd(), this.getOddType(), "odd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OddComplexNumber(), this.getOddComplexNumberType(), null, "oddComplexNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(evenComplexNumberTypeEClass, EvenComplexNumberType.class, "EvenComplexNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiNumberTypeEClass, MultiNumberType.class, "MultiNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiNumberType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MultiNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiNumberType_MyComplexAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "myComplexAbstractGroup", null, 1, -1, MultiNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiNumberType_MyComplexAbstract(), this.getComplexNumber(), null, "myComplexAbstract", null, 1, -1, MultiNumberType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(numberTypeEClass, NumberType.class, "NumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_MySimpleAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "mySimpleAbstractGroup", null, 1, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_MySimpleAbstract(), this.getSimpleNumber(), "mySimpleAbstract", null, 1, 1, NumberType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberType_MyComplexAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "myComplexAbstractGroup", null, 1, 1, NumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberType_MyComplexAbstract(), this.getComplexNumber(), null, "myComplexAbstract", null, 1, 1, NumberType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(oddComplexNumberTypeEClass, OddComplexNumberType.class, "OddComplexNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(evenTypeEDataType, BigInteger.class, "EvenType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oddTypeEDataType, BigInteger.class, "OddType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleNumberEDataType, BigInteger.class, "SimpleNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (complexNumberEClass, 
		   source, 
		   new String[] {
			 "name", "complexNumber",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getComplexNumber_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value"
		   });		
		addAnnotation
		  (getComplexNumber_Unit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unit"
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
		  (getDocumentRoot_Even(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "even",
			 "namespace", "##targetNamespace",
			 "affiliation", "mySimpleAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_MySimpleAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mySimpleAbstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_EvenComplexNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "evenComplexNumber",
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
		  (getDocumentRoot_MultiNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "multiNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Odd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "odd",
			 "namespace", "##targetNamespace",
			 "affiliation", "mySimpleAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_OddComplexNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "oddComplexNumber",
			 "namespace", "##targetNamespace",
			 "affiliation", "myComplexAbstract"
		   });		
		addAnnotation
		  (evenComplexNumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "evenComplexNumber_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (evenTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "even_._type",
			 "baseType", "simpleNumber",
			 "enumeration", "2 4 6 8"
		   });		
		addAnnotation
		  (multiNumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "multiNumber_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiNumberType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getMultiNumberType_MyComplexAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "myComplexAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMultiNumberType_MyComplexAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myComplexAbstract",
			 "namespace", "##targetNamespace",
			 "group", "myComplexAbstract:group"
		   });		
		addAnnotation
		  (numberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "number_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNumberType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getNumberType_MySimpleAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "mySimpleAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_MySimpleAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mySimpleAbstract",
			 "namespace", "##targetNamespace",
			 "group", "mySimpleAbstract:group"
		   });		
		addAnnotation
		  (getNumberType_MyComplexAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "myComplexAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNumberType_MyComplexAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myComplexAbstract",
			 "namespace", "##targetNamespace",
			 "group", "myComplexAbstract:group"
		   });		
		addAnnotation
		  (oddComplexNumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "oddComplexNumber_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (oddTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "odd_._type",
			 "baseType", "simpleNumber",
			 "enumeration", "1 3 5 7 9"
		   });		
		addAnnotation
		  (simpleNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "simpleNumber",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			 "minInclusive", "1",
			 "maxInclusive", "9"
		   });
	}

} //SubstitutionPackageImpl
