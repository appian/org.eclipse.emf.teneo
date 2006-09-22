/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesPackageImpl.java,v 1.3 2006/09/22 13:58:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.util.SimpletypesValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpletypesPackageImpl extends EPackageImpl implements SimpletypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simpleEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boolEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType limitedStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpletypesPackageImpl() {
		super(eNS_URI, SimpletypesFactory.eINSTANCE);
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
	public static SimpletypesPackage init() {
		if (isInited) return (SimpletypesPackage)EPackage.Registry.INSTANCE.getEPackage(SimpletypesPackage.eNS_URI);

		// Obtain or create and register package
		SimpletypesPackageImpl theSimpletypesPackage = (SimpletypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimpletypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimpletypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimpletypesPackage.createPackageContents();

		// Initialize created meta-data
		theSimpletypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimpletypesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimpletypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimpletypesPackage.freeze();

		return theSimpletypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleList() {
		return simpleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Code() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Boo() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Byt() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Doubl() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Floa() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Inte() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Long() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Shor() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Dat() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_Limitedstring() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_IntArray() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_DoubleArray() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_StringArray() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleList_ByteArray() {
		return (EAttribute)simpleListEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleType() {
		return simpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Code() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Boo() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Byt() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Doubl() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Float() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Inte() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Lon() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Shor() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Enu() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Dat() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleType_Limitedstring() {
		return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTypeObject() {
		return simpleTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Code() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Boo() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Byt() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Doubl() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Float() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Inte() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Lon() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Shor() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Enu() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleTypeObject_Dat() {
		return (EAttribute)simpleTypeObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimpleEnum() {
		return simpleEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBool() {
		return boolEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getByte() {
		return byteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getByteArray() {
		return byteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleArray() {
		return doubleArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt() {
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLimitedString() {
		return limitedStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleEnumObject() {
		return simpleEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpletypesFactory getSimpletypesFactory() {
		return (SimpletypesFactory)getEFactoryInstance();
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
		simpleListEClass = createEClass(SIMPLE_LIST);
		createEAttribute(simpleListEClass, SIMPLE_LIST__CODE);
		createEAttribute(simpleListEClass, SIMPLE_LIST__BOO);
		createEAttribute(simpleListEClass, SIMPLE_LIST__BYT);
		createEAttribute(simpleListEClass, SIMPLE_LIST__DOUBL);
		createEAttribute(simpleListEClass, SIMPLE_LIST__FLOA);
		createEAttribute(simpleListEClass, SIMPLE_LIST__INTE);
		createEAttribute(simpleListEClass, SIMPLE_LIST__LONG);
		createEAttribute(simpleListEClass, SIMPLE_LIST__SHOR);
		createEAttribute(simpleListEClass, SIMPLE_LIST__DAT);
		createEAttribute(simpleListEClass, SIMPLE_LIST__LIMITEDSTRING);
		createEAttribute(simpleListEClass, SIMPLE_LIST__INT_ARRAY);
		createEAttribute(simpleListEClass, SIMPLE_LIST__DOUBLE_ARRAY);
		createEAttribute(simpleListEClass, SIMPLE_LIST__STRING_ARRAY);
		createEAttribute(simpleListEClass, SIMPLE_LIST__BYTE_ARRAY);

		simpleTypeEClass = createEClass(SIMPLE_TYPE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__CODE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__BOO);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__BYT);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__DOUBL);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__FLOAT);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__INTE);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__LON);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__SHOR);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__ENU);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__DAT);
		createEAttribute(simpleTypeEClass, SIMPLE_TYPE__LIMITEDSTRING);

		simpleTypeObjectEClass = createEClass(SIMPLE_TYPE_OBJECT);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__CODE);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__BOO);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__BYT);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__DOUBL);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__FLOAT);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__INTE);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__LON);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__SHOR);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__ENU);
		createEAttribute(simpleTypeObjectEClass, SIMPLE_TYPE_OBJECT__DAT);

		// Create enums
		simpleEnumEEnum = createEEnum(SIMPLE_ENUM);

		// Create data types
		boolEDataType = createEDataType(BOOL);
		byteEDataType = createEDataType(BYTE);
		byteArrayEDataType = createEDataType(BYTE_ARRAY);
		dateEDataType = createEDataType(DATE);
		doubleEDataType = createEDataType(DOUBLE);
		doubleArrayEDataType = createEDataType(DOUBLE_ARRAY);
		floatEDataType = createEDataType(FLOAT);
		intEDataType = createEDataType(INT);
		intArrayEDataType = createEDataType(INT_ARRAY);
		limitedStringEDataType = createEDataType(LIMITED_STRING);
		longEDataType = createEDataType(LONG);
		simpleEnumObjectEDataType = createEDataType(SIMPLE_ENUM_OBJECT);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
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
		initEClass(simpleListEClass, SimpleList.class, "SimpleList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleList_Code(), theXMLTypePackage.getString(), "code", "c1", 1, 1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Boo(), theXMLTypePackage.getBoolean(), "boo", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Byt(), this.getByte(), "byt", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Doubl(), this.getDouble(), "doubl", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Floa(), this.getFloat(), "floa", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Inte(), this.getInt(), "inte", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Long(), this.getLong(), "long", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Shor(), theXMLTypePackage.getShort(), "shor", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Dat(), this.getDate(), "dat", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_Limitedstring(), this.getLimitedString(), "limitedstring", null, 1, -1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_IntArray(), this.getIntArray(), "intArray", null, 1, 1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_DoubleArray(), this.getDoubleArray(), "doubleArray", null, 1, 1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_StringArray(), this.getStringArray(), "stringArray", null, 1, 1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleList_ByteArray(), this.getByteArray(), "byteArray", null, 1, 1, SimpleList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleType_Code(), theXMLTypePackage.getString(), "code", "c1", 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Boo(), theXMLTypePackage.getBoolean(), "boo", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Byt(), theXMLTypePackage.getByte(), "byt", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Doubl(), theXMLTypePackage.getDouble(), "doubl", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Float(), theXMLTypePackage.getFloat(), "float", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Inte(), theXMLTypePackage.getInt(), "inte", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Lon(), theXMLTypePackage.getLong(), "lon", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Shor(), theXMLTypePackage.getShort(), "shor", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Enu(), this.getSimpleEnum(), "enu", "Enum1", 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Dat(), this.getDate(), "dat", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleType_Limitedstring(), this.getLimitedString(), "limitedstring", null, 1, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTypeObjectEClass, SimpleTypeObject.class, "SimpleTypeObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleTypeObject_Code(), theXMLTypePackage.getString(), "code", "c1", 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Boo(), theXMLTypePackage.getBooleanObject(), "boo", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Byt(), theXMLTypePackage.getByteObject(), "byt", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Doubl(), theXMLTypePackage.getDoubleObject(), "doubl", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Float(), theXMLTypePackage.getFloatObject(), "float", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Inte(), theXMLTypePackage.getIntObject(), "inte", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Lon(), theXMLTypePackage.getLongObject(), "lon", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Shor(), theXMLTypePackage.getShortObject(), "shor", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Enu(), this.getSimpleEnumObject(), "enu", "Enum1", 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleTypeObject_Dat(), this.getDate(), "dat", null, 1, 1, SimpleTypeObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(simpleEnumEEnum, SimpleEnum.class, "SimpleEnum");
		addEEnumLiteral(simpleEnumEEnum, SimpleEnum.ENUM1_LITERAL);
		addEEnumLiteral(simpleEnumEEnum, SimpleEnum.ENUM2_LITERAL);

		// Initialize data types
		initEDataType(boolEDataType, Boolean.class, "Bool", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteEDataType, Byte.class, "Byte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteArrayEDataType, byte[].class, "ByteArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "Double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleArrayEDataType, double[].class, "DoubleArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Float.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intEDataType, Integer.class, "Int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intArrayEDataType, int[].class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(limitedStringEDataType, String.class, "LimitedString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "Long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleEnumObjectEDataType, SimpleEnum.class, "SimpleEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://annotation.elver.org/JoinTable
		createJoinTableAnnotations();
		// http://annotation.elver.org/Enumerated
		createEnumeratedAnnotations();
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
		  (boolEDataType, 
		   source, 
		   new String[] {
			 "name", "Bool"
		   });		
		addAnnotation
		  (byteEDataType, 
		   source, 
		   new String[] {
			 "name", "Byte"
		   });		
		addAnnotation
		  (byteArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "ByteArray"
		   });		
		addAnnotation
		  (dateEDataType, 
		   source, 
		   new String[] {
			 "name", "Date"
		   });		
		addAnnotation
		  (doubleEDataType, 
		   source, 
		   new String[] {
			 "name", "Double"
		   });		
		addAnnotation
		  (doubleArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "DoubleArray"
		   });		
		addAnnotation
		  (floatEDataType, 
		   source, 
		   new String[] {
			 "name", "Float"
		   });		
		addAnnotation
		  (intEDataType, 
		   source, 
		   new String[] {
			 "name", "Int"
		   });		
		addAnnotation
		  (intArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "IntArray"
		   });		
		addAnnotation
		  (limitedStringEDataType, 
		   source, 
		   new String[] {
			 "name", "LimitedString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "10"
		   });		
		addAnnotation
		  (longEDataType, 
		   source, 
		   new String[] {
			 "name", "Long"
		   });		
		addAnnotation
		  (simpleEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "SimpleEnum"
		   });		
		addAnnotation
		  (simpleEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SimpleEnum:Object",
			 "baseType", "SimpleEnum"
		   });		
		addAnnotation
		  (simpleListEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleList_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code"
		   });		
		addAnnotation
		  (getSimpleList_Boo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boo"
		   });		
		addAnnotation
		  (getSimpleList_Byt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "byt"
		   });		
		addAnnotation
		  (getSimpleList_Doubl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doubl"
		   });		
		addAnnotation
		  (getSimpleList_Floa(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "floa"
		   });		
		addAnnotation
		  (getSimpleList_Inte(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inte"
		   });			
		addAnnotation
		  (getSimpleList_Long(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "long"
		   });		
		addAnnotation
		  (getSimpleList_Shor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shor"
		   });		
		addAnnotation
		  (getSimpleList_Dat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dat"
		   });		
		addAnnotation
		  (getSimpleList_Limitedstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "limitedstring"
		   });		
		addAnnotation
		  (getSimpleList_IntArray(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "intArray"
		   });		
		addAnnotation
		  (getSimpleList_DoubleArray(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doubleArray"
		   });		
		addAnnotation
		  (getSimpleList_StringArray(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "stringArray"
		   });		
		addAnnotation
		  (getSimpleList_ByteArray(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "byteArray"
		   });		
		addAnnotation
		  (simpleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code"
		   });		
		addAnnotation
		  (getSimpleType_Boo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boo"
		   });		
		addAnnotation
		  (getSimpleType_Byt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "byt"
		   });		
		addAnnotation
		  (getSimpleType_Doubl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doubl"
		   });		
		addAnnotation
		  (getSimpleType_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float"
		   });		
		addAnnotation
		  (getSimpleType_Inte(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inte"
		   });		
		addAnnotation
		  (getSimpleType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lon"
		   });		
		addAnnotation
		  (getSimpleType_Shor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shor"
		   });		
		addAnnotation
		  (getSimpleType_Enu(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enu"
		   });		
		addAnnotation
		  (getSimpleType_Dat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dat"
		   });		
		addAnnotation
		  (getSimpleType_Limitedstring(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "limitedstring"
		   });		
		addAnnotation
		  (simpleTypeObjectEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleTypeObject",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Boo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boo"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Byt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "byt"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Doubl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "doubl"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Inte(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inte"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Lon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lon"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Shor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shor"
		   });			
		addAnnotation
		  (getSimpleTypeObject_Enu(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enu"
		   });		
		addAnnotation
		  (getSimpleTypeObject_Dat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dat"
		   });		
		addAnnotation
		  (stringArrayEDataType, 
		   source, 
		   new String[] {
			 "name", "StringArray"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/JoinTable</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createJoinTableAnnotations() {
		String source = "http://annotation.elver.org/JoinTable";																						
		addAnnotation
		  (getSimpleList_Long(), 
		   source, 
		   new String[] {
			 "name", "longNum"
		   });																																	
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Enumerated</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEnumeratedAnnotations() {
		String source = "http://annotation.elver.org/Enumerated";																																																				
		addAnnotation
		  (getSimpleTypeObject_Enu(), 
		   source, 
		   new String[] {
			 "value", "STRING"
		   });			
	}

} //SimpletypesPackageImpl
