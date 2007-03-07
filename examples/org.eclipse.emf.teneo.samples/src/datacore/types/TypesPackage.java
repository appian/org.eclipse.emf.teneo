/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesPackage.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.types;

import datacore.DatacorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see datacore.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.arcsolutions.de/remarc/types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = datacore.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link datacore.types.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.StringTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = DatacorePackage.CSM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.CSMNumberTypeImpl <em>CSM Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.CSMNumberTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getCSMNumberType()
	 * @generated
	 */
	int CSM_NUMBER_TYPE = 4;

	/**
	 * The number of structural features of the '<em>CSM Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_NUMBER_TYPE_FEATURE_COUNT = DatacorePackage.CSM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.DoubleTypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.DoubleTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getDoubleType()
	 * @generated
	 */
	int DOUBLE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.StringValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__DATA_TYPE = DatacorePackage.CSM_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = DatacorePackage.CSM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = DatacorePackage.CSM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.CSMNumberValueImpl <em>CSM Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.CSMNumberValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getCSMNumberValue()
	 * @generated
	 */
	int CSM_NUMBER_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_NUMBER_VALUE__DATA_TYPE = DatacorePackage.CSM_VALUE__DATA_TYPE;

	/**
	 * The number of structural features of the '<em>CSM Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_NUMBER_VALUE_FEATURE_COUNT = DatacorePackage.CSM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.DoubleValueImpl <em>Double Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.DoubleValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getDoubleValue()
	 * @generated
	 */
	int DOUBLE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.BooleanValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__DATA_TYPE = DatacorePackage.CSM_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = DatacorePackage.CSM_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = DatacorePackage.CSM_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.BooleanTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = DatacorePackage.CSM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.IntegerValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.IntegerTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 9;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.ByteValueImpl <em>Byte Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.ByteValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getByteValue()
	 * @generated
	 */
	int BYTE_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.ByteTypeImpl <em>Byte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.ByteTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getByteType()
	 * @generated
	 */
	int BYTE_TYPE = 11;

	/**
	 * The number of structural features of the '<em>Byte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.FloatValueImpl <em>Float Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.FloatValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getFloatValue()
	 * @generated
	 */
	int FLOAT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.FloatTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.LongValueImpl <em>Long Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.LongValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getLongValue()
	 * @generated
	 */
	int LONG_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Long Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.LongTypeImpl <em>Long Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.LongTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getLongType()
	 * @generated
	 */
	int LONG_TYPE = 15;

	/**
	 * The number of structural features of the '<em>Long Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link datacore.types.impl.ShortValueImpl <em>Short Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.ShortValueImpl
	 * @see datacore.types.impl.TypesPackageImpl#getShortValue()
	 * @generated
	 */
	int SHORT_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE__DATA_TYPE = CSM_NUMBER_VALUE__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE__VALUE = CSM_NUMBER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Short Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_VALUE_FEATURE_COUNT = CSM_NUMBER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link datacore.types.impl.ShortTypeImpl <em>Short Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see datacore.types.impl.ShortTypeImpl
	 * @see datacore.types.impl.TypesPackageImpl#getShortType()
	 * @generated
	 */
	int SHORT_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Short Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_TYPE_FEATURE_COUNT = CSM_NUMBER_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link datacore.types.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see datacore.types.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link datacore.types.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see datacore.types.DoubleType
	 * @generated
	 */
	EClass getDoubleType();

	/**
	 * Returns the meta object for class '{@link datacore.types.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see datacore.types.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.DoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Value</em>'.
	 * @see datacore.types.DoubleValue
	 * @generated
	 */
	EClass getDoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.DoubleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.DoubleValue#getValue()
	 * @see #getDoubleValue()
	 * @generated
	 */
	EAttribute getDoubleValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.CSMNumberType <em>CSM Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Number Type</em>'.
	 * @see datacore.types.CSMNumberType
	 * @generated
	 */
	EClass getCSMNumberType();

	/**
	 * Returns the meta object for class '{@link datacore.types.CSMNumberValue <em>CSM Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSM Number Value</em>'.
	 * @see datacore.types.CSMNumberValue
	 * @generated
	 */
	EClass getCSMNumberValue();

	/**
	 * Returns the meta object for class '{@link datacore.types.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see datacore.types.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see datacore.types.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link datacore.types.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see datacore.types.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see datacore.types.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link datacore.types.ByteValue <em>Byte Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Value</em>'.
	 * @see datacore.types.ByteValue
	 * @generated
	 */
	EClass getByteValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.ByteValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.ByteValue#getValue()
	 * @see #getByteValue()
	 * @generated
	 */
	EAttribute getByteValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.ByteType <em>Byte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Type</em>'.
	 * @see datacore.types.ByteType
	 * @generated
	 */
	EClass getByteType();

	/**
	 * Returns the meta object for class '{@link datacore.types.FloatValue <em>Float Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Value</em>'.
	 * @see datacore.types.FloatValue
	 * @generated
	 */
	EClass getFloatValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.FloatValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.FloatValue#getValue()
	 * @see #getFloatValue()
	 * @generated
	 */
	EAttribute getFloatValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see datacore.types.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for class '{@link datacore.types.LongValue <em>Long Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Value</em>'.
	 * @see datacore.types.LongValue
	 * @generated
	 */
	EClass getLongValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.LongValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.LongValue#getValue()
	 * @see #getLongValue()
	 * @generated
	 */
	EAttribute getLongValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Type</em>'.
	 * @see datacore.types.LongType
	 * @generated
	 */
	EClass getLongType();

	/**
	 * Returns the meta object for class '{@link datacore.types.ShortValue <em>Short Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Value</em>'.
	 * @see datacore.types.ShortValue
	 * @generated
	 */
	EClass getShortValue();

	/**
	 * Returns the meta object for the attribute '{@link datacore.types.ShortValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see datacore.types.ShortValue#getValue()
	 * @see #getShortValue()
	 * @generated
	 */
	EAttribute getShortValue_Value();

	/**
	 * Returns the meta object for class '{@link datacore.types.ShortType <em>Short Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Type</em>'.
	 * @see datacore.types.ShortType
	 * @generated
	 */
	EClass getShortType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link datacore.types.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.StringTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.DoubleTypeImpl <em>Double Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.DoubleTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getDoubleType()
		 * @generated
		 */
		EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.StringValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.DoubleValueImpl <em>Double Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.DoubleValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getDoubleValue()
		 * @generated
		 */
		EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.CSMNumberTypeImpl <em>CSM Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.CSMNumberTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getCSMNumberType()
		 * @generated
		 */
		EClass CSM_NUMBER_TYPE = eINSTANCE.getCSMNumberType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.CSMNumberValueImpl <em>CSM Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.CSMNumberValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getCSMNumberValue()
		 * @generated
		 */
		EClass CSM_NUMBER_VALUE = eINSTANCE.getCSMNumberValue();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.BooleanValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.BooleanTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.IntegerValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.IntegerTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.ByteValueImpl <em>Byte Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.ByteValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getByteValue()
		 * @generated
		 */
		EClass BYTE_VALUE = eINSTANCE.getByteValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_VALUE__VALUE = eINSTANCE.getByteValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.ByteTypeImpl <em>Byte Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.ByteTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getByteType()
		 * @generated
		 */
		EClass BYTE_TYPE = eINSTANCE.getByteType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.FloatValueImpl <em>Float Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.FloatValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getFloatValue()
		 * @generated
		 */
		EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.FloatTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.LongValueImpl <em>Long Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.LongValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getLongValue()
		 * @generated
		 */
		EClass LONG_VALUE = eINSTANCE.getLongValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG_VALUE__VALUE = eINSTANCE.getLongValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.LongTypeImpl <em>Long Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.LongTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getLongType()
		 * @generated
		 */
		EClass LONG_TYPE = eINSTANCE.getLongType();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.ShortValueImpl <em>Short Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.ShortValueImpl
		 * @see datacore.types.impl.TypesPackageImpl#getShortValue()
		 * @generated
		 */
		EClass SHORT_VALUE = eINSTANCE.getShortValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_VALUE__VALUE = eINSTANCE.getShortValue_Value();

		/**
		 * The meta object literal for the '{@link datacore.types.impl.ShortTypeImpl <em>Short Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see datacore.types.impl.ShortTypeImpl
		 * @see datacore.types.impl.TypesPackageImpl#getShortType()
		 * @generated
		 */
		EClass SHORT_TYPE = eINSTANCE.getShortType();

	}

} //TypesPackage
