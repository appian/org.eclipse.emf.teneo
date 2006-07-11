/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionPackageImpl.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.util.ListunionValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListunionPackageImpl extends EPackageImpl implements ListunionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statesByCountryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleStringUnionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleStringUnionTypeMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleStringUnionTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleUnionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleUnionTypeMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleUnionTypeMember1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sixStatesListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zipCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zipUnionsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zipUnionTypeEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ListunionPackageImpl() {
		super(eNS_URI, ListunionFactory.eINSTANCE);
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
	public static ListunionPackage init() {
		if (isInited) return (ListunionPackage)EPackage.Registry.INSTANCE.getEPackage(ListunionPackage.eNS_URI);

		// Obtain or create and register package
		ListunionPackageImpl theListunionPackage = (ListunionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ListunionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ListunionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theListunionPackage.createPackageContents();

		// Initialize created meta-data
		theListunionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theListunionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ListunionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theListunionPackage.freeze();

		return theListunionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstatesByCountry() {
		return statesByCountryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_Country() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_AllStates() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SixImportantStates() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_ZipUnion() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_ZipUnions() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SimpleUnion() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SimpleUnions() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SimpleStringUnion() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SimpleStringUnions() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleStringUnionType() {
		return simpleStringUnionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleStringUnionTypeMember0() {
		return simpleStringUnionTypeMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleStringUnionTypeMember1() {
		return simpleStringUnionTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleUnionType() {
		return simpleUnionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleUnionTypeMember0() {
		return simpleUnionTypeMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleUnionTypeMember1() {
		return simpleUnionTypeMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSixStatesList() {
		return sixStatesListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getState() {
		return stateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStateList() {
		return stateListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringList() {
		return stringListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZipCode() {
		return zipCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZipUnionsType() {
		return zipUnionsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZipUnionType() {
		return zipUnionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListunionFactory getListunionFactory() {
		return (ListunionFactory)getEFactoryInstance();
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
		statesByCountryEClass = createEClass(STATES_BY_COUNTRY);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__COUNTRY);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__ALL_STATES);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIX_IMPORTANT_STATES);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__ZIP_UNION);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__ZIP_UNIONS);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIMPLE_UNION);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIMPLE_UNIONS);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIMPLE_STRING_UNION);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS);

		// Create data types
		simpleStringUnionTypeEDataType = createEDataType(SIMPLE_STRING_UNION_TYPE);
		simpleStringUnionTypeMember0EDataType = createEDataType(SIMPLE_STRING_UNION_TYPE_MEMBER0);
		simpleStringUnionTypeMember1EDataType = createEDataType(SIMPLE_STRING_UNION_TYPE_MEMBER1);
		simpleUnionTypeEDataType = createEDataType(SIMPLE_UNION_TYPE);
		simpleUnionTypeMember0EDataType = createEDataType(SIMPLE_UNION_TYPE_MEMBER0);
		simpleUnionTypeMember1EDataType = createEDataType(SIMPLE_UNION_TYPE_MEMBER1);
		sixStatesListEDataType = createEDataType(SIX_STATES_LIST);
		stateEDataType = createEDataType(STATE);
		stateListEDataType = createEDataType(STATE_LIST);
		stringListEDataType = createEDataType(STRING_LIST);
		zipCodeEDataType = createEDataType(ZIP_CODE);
		zipUnionsTypeEDataType = createEDataType(ZIP_UNIONS_TYPE);
		zipUnionTypeEDataType = createEDataType(ZIP_UNION_TYPE);
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
		initEClass(statesByCountryEClass, statesByCountry.class, "statesByCountry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstatesByCountry_Country(), theXMLTypePackage.getString(), "country", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_AllStates(), this.getStateList(), "allStates", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SixImportantStates(), this.getSixStatesList(), "sixImportantStates", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_ZipUnion(), this.getZipUnionType(), "zipUnion", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_ZipUnions(), this.getZipUnionsType(), "zipUnions", null, 1, -1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SimpleUnion(), this.getSimpleUnionType(), "simpleUnion", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SimpleUnions(), this.getSimpleUnionType(), "simpleUnions", null, 1, -1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SimpleStringUnion(), this.getSimpleStringUnionType(), "simpleStringUnion", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SimpleStringUnions(), this.getSimpleStringUnionType(), "simpleStringUnions", null, 1, -1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(simpleStringUnionTypeEDataType, String.class, "SimpleStringUnionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleStringUnionTypeMember0EDataType, String.class, "SimpleStringUnionTypeMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleStringUnionTypeMember1EDataType, String.class, "SimpleStringUnionTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleUnionTypeEDataType, Object.class, "SimpleUnionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleUnionTypeMember0EDataType, BigInteger.class, "SimpleUnionTypeMember0", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleUnionTypeMember1EDataType, String.class, "SimpleUnionTypeMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sixStatesListEDataType, List.class, "SixStatesList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateEDataType, String.class, "State", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateListEDataType, List.class, "StateList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringListEDataType, List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zipCodeEDataType, String.class, "ZipCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zipUnionsTypeEDataType, String.class, "ZipUnionsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zipUnionTypeEDataType, String.class, "ZipUnionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (simpleStringUnionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "simpleStringUnionType",
			 "memberTypes", "simpleStringUnionType_._member_._0 simpleStringUnionType_._member_._1"
		   });		
		addAnnotation
		  (simpleStringUnionTypeMember0EDataType, 
		   source, 
		   new String[] {
			 "name", "simpleStringUnionType_._member_._0",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "minLength", "1"
		   });		
		addAnnotation
		  (simpleStringUnionTypeMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "simpleStringUnionType_._member_._1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "5"
		   });		
		addAnnotation
		  (simpleUnionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "simpleUnionType",
			 "memberTypes", "simpleUnionType_._member_._0 simpleUnionType_._member_._1"
		   });		
		addAnnotation
		  (simpleUnionTypeMember0EDataType, 
		   source, 
		   new String[] {
			 "name", "simpleUnionType_._member_._0",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });		
		addAnnotation
		  (simpleUnionTypeMember1EDataType, 
		   source, 
		   new String[] {
			 "name", "simpleUnionType_._member_._1",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "enumeration", "N/A"
		   });		
		addAnnotation
		  (sixStatesListEDataType, 
		   source, 
		   new String[] {
			 "name", "SixStatesList",
			 "baseType", "StateList",
			 "length", "6"
		   });		
		addAnnotation
		  (stateEDataType, 
		   source, 
		   new String[] {
			 "name", "State",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "12"
		   });		
		addAnnotation
		  (stateListEDataType, 
		   source, 
		   new String[] {
			 "name", "StateList",
			 "itemType", "State"
		   });		
		addAnnotation
		  (statesByCountryEClass, 
		   source, 
		   new String[] {
			 "name", "CountryStates",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getstatesByCountry_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Country"
		   });		
		addAnnotation
		  (getstatesByCountry_AllStates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AllStates"
		   });		
		addAnnotation
		  (getstatesByCountry_SixImportantStates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SixImportantStates"
		   });		
		addAnnotation
		  (getstatesByCountry_ZipUnion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "zipUnion"
		   });		
		addAnnotation
		  (getstatesByCountry_ZipUnions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "zipUnions"
		   });		
		addAnnotation
		  (getstatesByCountry_SimpleUnion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleUnion"
		   });		
		addAnnotation
		  (getstatesByCountry_SimpleUnions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleUnions"
		   });		
		addAnnotation
		  (getstatesByCountry_SimpleStringUnion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleStringUnion"
		   });		
		addAnnotation
		  (getstatesByCountry_SimpleStringUnions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleStringUnions"
		   });		
		addAnnotation
		  (stringListEDataType, 
		   source, 
		   new String[] {
			 "name", "StringList",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (zipCodeEDataType, 
		   source, 
		   new String[] {
			 "name", "zipCode",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "maxLength", "6"
		   });		
		addAnnotation
		  (zipUnionsTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "zipUnions_._type",
			 "memberTypes", "zipCode State"
		   });		
		addAnnotation
		  (zipUnionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "zipUnion_._type",
			 "memberTypes", "zipCode State"
		   });
	}

} //ListunionPackageImpl
