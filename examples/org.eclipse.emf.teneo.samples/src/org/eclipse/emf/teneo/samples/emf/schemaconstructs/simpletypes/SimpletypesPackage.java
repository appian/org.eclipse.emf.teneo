/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpletypesPackage.java,v 1.2 2006/09/22 13:58:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesFactory
 * @model kind="package"
 * @generated
 */
public interface SimpletypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpletypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/simpletypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpletypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpletypesPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl <em>Simple List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleList()
	 * @generated
	 */
	int SIMPLE_LIST = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__CODE = 0;

	/**
	 * The feature id for the '<em><b>Boo</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__BOO = 1;

	/**
	 * The feature id for the '<em><b>Byt</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__BYT = 2;

	/**
	 * The feature id for the '<em><b>Doubl</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__DOUBL = 3;

	/**
	 * The feature id for the '<em><b>Floa</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__FLOA = 4;

	/**
	 * The feature id for the '<em><b>Inte</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__INTE = 5;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__LONG = 6;

	/**
	 * The feature id for the '<em><b>Shor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__SHOR = 7;

	/**
	 * The feature id for the '<em><b>Dat</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__DAT = 8;

	/**
	 * The feature id for the '<em><b>Limitedstring</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__LIMITEDSTRING = 9;

	/**
	 * The feature id for the '<em><b>Int Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__INT_ARRAY = 10;

	/**
	 * The feature id for the '<em><b>Double Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__DOUBLE_ARRAY = 11;

	/**
	 * The feature id for the '<em><b>String Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__STRING_ARRAY = 12;

	/**
	 * The feature id for the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST__BYTE_ARRAY = 13;

	/**
	 * The number of structural features of the '<em>Simple List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LIST_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Boo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__BOO = 1;

	/**
	 * The feature id for the '<em><b>Byt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__BYT = 2;

	/**
	 * The feature id for the '<em><b>Doubl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__DOUBL = 3;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__FLOAT = 4;

	/**
	 * The feature id for the '<em><b>Inte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__INTE = 5;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__LON = 6;

	/**
	 * The feature id for the '<em><b>Shor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__SHOR = 7;

	/**
	 * The feature id for the '<em><b>Enu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__ENU = 8;

	/**
	 * The feature id for the '<em><b>Dat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__DAT = 9;

	/**
	 * The feature id for the '<em><b>Limitedstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__LIMITEDSTRING = 10;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl <em>Simple Type Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleTypeObject()
	 * @generated
	 */
	int SIMPLE_TYPE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Boo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__BOO = 1;

	/**
	 * The feature id for the '<em><b>Byt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__BYT = 2;

	/**
	 * The feature id for the '<em><b>Doubl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__DOUBL = 3;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__FLOAT = 4;

	/**
	 * The feature id for the '<em><b>Inte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__INTE = 5;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__LON = 6;

	/**
	 * The feature id for the '<em><b>Shor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__SHOR = 7;

	/**
	 * The feature id for the '<em><b>Enu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__ENU = 8;

	/**
	 * The feature id for the '<em><b>Dat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT__DAT = 9;

	/**
	 * The number of structural features of the '<em>Simple Type Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_OBJECT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum <em>Simple Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleEnum()
	 * @generated
	 */
	int SIMPLE_ENUM = 3;

	/**
	 * The meta object id for the '<em>Bool</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 4;

	/**
	 * The meta object id for the '<em>Byte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getByte()
	 * @generated
	 */
	int BYTE = 5;

	/**
	 * The meta object id for the '<em>Byte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getByteArray()
	 * @generated
	 */
	int BYTE_ARRAY = 6;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 7;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 8;

	/**
	 * The meta object id for the '<em>Double Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDoubleArray()
	 * @generated
	 */
	int DOUBLE_ARRAY = 9;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 10;

	/**
	 * The meta object id for the '<em>Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getInt()
	 * @generated
	 */
	int INT = 11;

	/**
	 * The meta object id for the '<em>Int Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getIntArray()
	 * @generated
	 */
	int INT_ARRAY = 12;

	/**
	 * The meta object id for the '<em>Limited String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getLimitedString()
	 * @generated
	 */
	int LIMITED_STRING = 13;

	/**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 14;

	/**
	 * The meta object id for the '<em>Simple Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleEnumObject()
	 * @generated
	 */
	int SIMPLE_ENUM_OBJECT = 15;


	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 16;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList <em>Simple List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple List</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList
	 * @generated
	 */
	EClass getSimpleList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getCode()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getBoo <em>Boo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boo</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getBoo()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Boo();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByt <em>Byt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byt</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByt()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Byt();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubl <em>Doubl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Doubl</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubl()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Doubl();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getFloa <em>Floa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Floa</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getFloa()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Floa();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getInte <em>Inte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inte</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getInte()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Inte();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Long</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLong()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Long();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getShor <em>Shor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shor</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getShor()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Shor();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDat <em>Dat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDat()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Dat();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLimitedstring <em>Limitedstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Limitedstring</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getLimitedstring()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_Limitedstring();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getIntArray <em>Int Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Array</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getIntArray()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_IntArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubleArray <em>Double Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Array</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getDoubleArray()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_DoubleArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getStringArray <em>String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Array</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getStringArray()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_StringArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList#getByteArray()
	 * @see #getSimpleList()
	 * @generated
	 */
	EAttribute getSimpleList_ByteArray();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getCode()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo <em>Boo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boo</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#isBoo()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Boo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt <em>Byt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byt</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getByt()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Byt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl <em>Doubl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doubl</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDoubl()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Doubl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getFloat()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte <em>Inte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inte</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getInte()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Inte();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLon()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Lon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor <em>Shor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shor</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getShor()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Shor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu <em>Enu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enu</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getEnu()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Enu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDat <em>Dat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getDat()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Dat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedstring <em>Limitedstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limitedstring</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleType#getLimitedstring()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Limitedstring();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject <em>Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject
	 * @generated
	 */
	EClass getSimpleTypeObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getCode()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo <em>Boo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boo</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getBoo()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Boo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt <em>Byt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byt</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getByt()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Byt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl <em>Doubl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doubl</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDoubl()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Doubl();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getFloat()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte <em>Inte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inte</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getInte()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Inte();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getLon()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Lon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor <em>Shor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shor</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getShor()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Shor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu <em>Enu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enu</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getEnu()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Enu();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat <em>Dat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dat</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleTypeObject#getDat()
	 * @see #getSimpleTypeObject()
	 * @generated
	 */
	EAttribute getSimpleTypeObject_Dat();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum <em>Simple Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simple Enum</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @generated
	 */
	EEnum getSimpleEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bool</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='Bool'" 
	 * @generated
	 */
	EDataType getBool();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 *        extendedMetaData="name='Byte'" 
	 * @generated
	 */
	EDataType getByte();

	/**
	 * Returns the meta object for data type '<em>Byte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte Array</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='ByteArray'" 
	 * @generated
	 */
	EDataType getByteArray();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 *        extendedMetaData="name='Date'" 
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Double'" 
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '<em>Double Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array</em>'.
	 * @model instanceClass="double[]"
	 *        extendedMetaData="name='DoubleArray'" 
	 * @generated
	 */
	EDataType getDoubleArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='Float'" 
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='Int'" 
	 * @generated
	 */
	EDataType getInt();

	/**
	 * Returns the meta object for data type '<em>Int Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int Array</em>'.
	 * @model instanceClass="int[]"
	 *        extendedMetaData="name='IntArray'" 
	 * @generated
	 */
	EDataType getIntArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Limited String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Limited String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LimitedString' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='10'" 
	 * @generated
	 */
	EDataType getLimitedString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='Long'" 
	 * @generated
	 */
	EDataType getLong();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum <em>Simple Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Enum Object</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
	 * @model instanceClass="org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum"
	 *        extendedMetaData="name='SimpleEnum:Object' baseType='SimpleEnum'" 
	 * @generated
	 */
	EDataType getSimpleEnumObject();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="String[]"
	 *        extendedMetaData="name='StringArray'" 
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpletypesFactory getSimpletypesFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl <em>Simple List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleList()
		 * @generated
		 */
		EClass SIMPLE_LIST = eINSTANCE.getSimpleList();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__CODE = eINSTANCE.getSimpleList_Code();

		/**
		 * The meta object literal for the '<em><b>Boo</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__BOO = eINSTANCE.getSimpleList_Boo();

		/**
		 * The meta object literal for the '<em><b>Byt</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__BYT = eINSTANCE.getSimpleList_Byt();

		/**
		 * The meta object literal for the '<em><b>Doubl</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__DOUBL = eINSTANCE.getSimpleList_Doubl();

		/**
		 * The meta object literal for the '<em><b>Floa</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__FLOA = eINSTANCE.getSimpleList_Floa();

		/**
		 * The meta object literal for the '<em><b>Inte</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__INTE = eINSTANCE.getSimpleList_Inte();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__LONG = eINSTANCE.getSimpleList_Long();

		/**
		 * The meta object literal for the '<em><b>Shor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__SHOR = eINSTANCE.getSimpleList_Shor();

		/**
		 * The meta object literal for the '<em><b>Dat</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__DAT = eINSTANCE.getSimpleList_Dat();

		/**
		 * The meta object literal for the '<em><b>Limitedstring</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__LIMITEDSTRING = eINSTANCE.getSimpleList_Limitedstring();

		/**
		 * The meta object literal for the '<em><b>Int Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__INT_ARRAY = eINSTANCE.getSimpleList_IntArray();

		/**
		 * The meta object literal for the '<em><b>Double Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__DOUBLE_ARRAY = eINSTANCE.getSimpleList_DoubleArray();

		/**
		 * The meta object literal for the '<em><b>String Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__STRING_ARRAY = eINSTANCE.getSimpleList_StringArray();

		/**
		 * The meta object literal for the '<em><b>Byte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LIST__BYTE_ARRAY = eINSTANCE.getSimpleList_ByteArray();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__CODE = eINSTANCE.getSimpleType_Code();

		/**
		 * The meta object literal for the '<em><b>Boo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__BOO = eINSTANCE.getSimpleType_Boo();

		/**
		 * The meta object literal for the '<em><b>Byt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__BYT = eINSTANCE.getSimpleType_Byt();

		/**
		 * The meta object literal for the '<em><b>Doubl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__DOUBL = eINSTANCE.getSimpleType_Doubl();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__FLOAT = eINSTANCE.getSimpleType_Float();

		/**
		 * The meta object literal for the '<em><b>Inte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__INTE = eINSTANCE.getSimpleType_Inte();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__LON = eINSTANCE.getSimpleType_Lon();

		/**
		 * The meta object literal for the '<em><b>Shor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__SHOR = eINSTANCE.getSimpleType_Shor();

		/**
		 * The meta object literal for the '<em><b>Enu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__ENU = eINSTANCE.getSimpleType_Enu();

		/**
		 * The meta object literal for the '<em><b>Dat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__DAT = eINSTANCE.getSimpleType_Dat();

		/**
		 * The meta object literal for the '<em><b>Limitedstring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__LIMITEDSTRING = eINSTANCE.getSimpleType_Limitedstring();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl <em>Simple Type Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleTypeObjectImpl
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleTypeObject()
		 * @generated
		 */
		EClass SIMPLE_TYPE_OBJECT = eINSTANCE.getSimpleTypeObject();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__CODE = eINSTANCE.getSimpleTypeObject_Code();

		/**
		 * The meta object literal for the '<em><b>Boo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__BOO = eINSTANCE.getSimpleTypeObject_Boo();

		/**
		 * The meta object literal for the '<em><b>Byt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__BYT = eINSTANCE.getSimpleTypeObject_Byt();

		/**
		 * The meta object literal for the '<em><b>Doubl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__DOUBL = eINSTANCE.getSimpleTypeObject_Doubl();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__FLOAT = eINSTANCE.getSimpleTypeObject_Float();

		/**
		 * The meta object literal for the '<em><b>Inte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__INTE = eINSTANCE.getSimpleTypeObject_Inte();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__LON = eINSTANCE.getSimpleTypeObject_Lon();

		/**
		 * The meta object literal for the '<em><b>Shor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__SHOR = eINSTANCE.getSimpleTypeObject_Shor();

		/**
		 * The meta object literal for the '<em><b>Enu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__ENU = eINSTANCE.getSimpleTypeObject_Enu();

		/**
		 * The meta object literal for the '<em><b>Dat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE_OBJECT__DAT = eINSTANCE.getSimpleTypeObject_Dat();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum <em>Simple Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleEnum()
		 * @generated
		 */
		EEnum SIMPLE_ENUM = eINSTANCE.getSimpleEnum();

		/**
		 * The meta object literal for the '<em>Bool</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getBool()
		 * @generated
		 */
		EDataType BOOL = eINSTANCE.getBool();

		/**
		 * The meta object literal for the '<em>Byte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getByte()
		 * @generated
		 */
		EDataType BYTE = eINSTANCE.getByte();

		/**
		 * The meta object literal for the '<em>Byte Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getByteArray()
		 * @generated
		 */
		EDataType BYTE_ARRAY = eINSTANCE.getByteArray();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Double Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getDoubleArray()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY = eINSTANCE.getDoubleArray();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getInt()
		 * @generated
		 */
		EDataType INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em>Int Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getIntArray()
		 * @generated
		 */
		EDataType INT_ARRAY = eINSTANCE.getIntArray();

		/**
		 * The meta object literal for the '<em>Limited String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getLimitedString()
		 * @generated
		 */
		EDataType LIMITED_STRING = eINSTANCE.getLimitedString();

		/**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getLong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '<em>Simple Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleEnum
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getSimpleEnumObject()
		 * @generated
		 */
		EDataType SIMPLE_ENUM_OBJECT = eINSTANCE.getSimpleEnumObject();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpletypesPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

	}

} //SimpletypesPackage
