/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListPackageImpl.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.statesByCountry;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.util.ListValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListPackageImpl extends EPackageImpl implements ListPackage {
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.list.ListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ListPackageImpl() {
		super(eNS_URI, ListFactory.eINSTANCE);
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
	public static ListPackage init() {
		if (isInited) return (ListPackage)EPackage.Registry.INSTANCE.getEPackage(ListPackage.eNS_URI);

		// Obtain or create and register package
		ListPackageImpl theListPackage = (ListPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ListPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ListPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theListPackage.createPackageContents();

		// Initialize created meta-data
		theListPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theListPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ListValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theListPackage.freeze();

		return theListPackage;
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
	public EAttribute getstatesByCountry_Index() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_AllStates() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstatesByCountry_SixImportantStates() {
		return (EAttribute)statesByCountryEClass.getEStructuralFeatures().get(3);
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
	public ListFactory getListFactory() {
		return (ListFactory)getEFactoryInstance();
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
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__INDEX);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__ALL_STATES);
		createEAttribute(statesByCountryEClass, STATES_BY_COUNTRY__SIX_IMPORTANT_STATES);

		// Create data types
		sixStatesListEDataType = createEDataType(SIX_STATES_LIST);
		stateEDataType = createEDataType(STATE);
		stateListEDataType = createEDataType(STATE_LIST);
		stringListEDataType = createEDataType(STRING_LIST);
		zipCodeEDataType = createEDataType(ZIP_CODE);
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
		initEClass(statesByCountryEClass, statesByCountry.class, "statesByCountry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstatesByCountry_Country(), theXMLTypePackage.getString(), "country", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_Index(), theXMLTypePackage.getInt(), "index", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_AllStates(), this.getStateList(), "allStates", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getstatesByCountry_SixImportantStates(), this.getSixStatesList(), "sixImportantStates", null, 1, 1, statesByCountry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(sixStatesListEDataType, List.class, "SixStatesList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateEDataType, String.class, "State", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stateListEDataType, List.class, "StateList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringListEDataType, List.class, "StringList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zipCodeEDataType, String.class, "ZipCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getstatesByCountry_Index(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "index"
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
	}

} //ListPackageImpl
