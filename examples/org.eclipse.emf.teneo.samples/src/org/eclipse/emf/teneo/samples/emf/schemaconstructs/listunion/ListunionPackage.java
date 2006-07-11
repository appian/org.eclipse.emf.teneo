/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListunionPackage.java,v 1.1 2006/07/11 16:57:14 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.ListunionFactory
 * @model kind="package"
 * @generated
 */
public interface ListunionPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "listunion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/listunion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "listunion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListunionPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl <em>states By Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.statesByCountryImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getstatesByCountry()
	 * @generated
	 */
	int STATES_BY_COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>All States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__ALL_STATES = 1;

	/**
	 * The feature id for the '<em><b>Six Important States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIX_IMPORTANT_STATES = 2;

	/**
	 * The feature id for the '<em><b>Zip Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__ZIP_UNION = 3;

	/**
	 * The feature id for the '<em><b>Zip Unions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__ZIP_UNIONS = 4;

	/**
	 * The feature id for the '<em><b>Simple Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIMPLE_UNION = 5;

	/**
	 * The feature id for the '<em><b>Simple Unions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIMPLE_UNIONS = 6;

	/**
	 * The feature id for the '<em><b>Simple String Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIMPLE_STRING_UNION = 7;

	/**
	 * The feature id for the '<em><b>Simple String Unions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY__SIMPLE_STRING_UNIONS = 8;

	/**
	 * The number of structural features of the the '<em>states By Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATES_BY_COUNTRY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '<em>Simple String Union Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleStringUnionTypeMember0()
	 * @generated
	 */
	int SIMPLE_STRING_UNION_TYPE_MEMBER0 = 2;

	/**
	 * The meta object id for the '<em>State</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 8;

	/**
	 * The meta object id for the '<em>Simple String Union Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleStringUnionType()
	 * @generated
	 */
	int SIMPLE_STRING_UNION_TYPE = 1;

	/**
	 * The meta object id for the '<em>Simple String Union Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleStringUnionTypeMember1()
	 * @generated
	 */
	int SIMPLE_STRING_UNION_TYPE_MEMBER1 = 3;

	/**
	 * The meta object id for the '<em>Simple Union Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleUnionType()
	 * @generated
	 */
	int SIMPLE_UNION_TYPE = 4;

	/**
	 * The meta object id for the '<em>Simple Union Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleUnionTypeMember0()
	 * @generated
	 */
	int SIMPLE_UNION_TYPE_MEMBER0 = 5;

	/**
	 * The meta object id for the '<em>Simple Union Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSimpleUnionTypeMember1()
	 * @generated
	 */
	int SIMPLE_UNION_TYPE_MEMBER1 = 6;

	/**
	 * The meta object id for the '<em>Six States List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getSixStatesList()
	 * @generated
	 */
	int SIX_STATES_LIST = 7;

	/**
	 * The meta object id for the '<em>State List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getStateList()
	 * @generated
	 */
	int STATE_LIST = 9;

	/**
	 * The meta object id for the '<em>String List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getStringList()
	 * @generated
	 */
	int STRING_LIST = 10;

	/**
	 * The meta object id for the '<em>Zip Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getZipCode()
	 * @generated
	 */
	int ZIP_CODE = 11;

	/**
	 * The meta object id for the '<em>Zip Unions Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getZipUnionsType()
	 * @generated
	 */
	int ZIP_UNIONS_TYPE = 12;

	/**
	 * The meta object id for the '<em>Zip Union Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.impl.ListunionPackageImpl#getZipUnionType()
	 * @generated
	 */
	int ZIP_UNION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry <em>states By Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>states By Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry
	 * @generated
	 */
	EClass getstatesByCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getCountry()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getAllStates <em>All States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All States</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getAllStates()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_AllStates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSixImportantStates <em>Six Important States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Six Important States</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSixImportantStates()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SixImportantStates();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnion <em>Zip Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Union</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnion()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_ZipUnion();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnions <em>Zip Unions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Zip Unions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getZipUnions()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_ZipUnions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnion <em>Simple Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Union</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnion()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SimpleUnion();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnions <em>Simple Unions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Unions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleUnions()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SimpleUnions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnion <em>Simple String Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple String Union</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnion()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SimpleStringUnion();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnions <em>Simple String Unions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple String Unions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.listunion.statesByCountry#getSimpleStringUnions()
	 * @see #getstatesByCountry()
	 * @generated
	 */
	EAttribute getstatesByCountry_SimpleStringUnions();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Simple String Union Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple String Union Type Member0</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='simpleStringUnionType_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'" 
	 * @generated
	 */
	EDataType getSimpleStringUnionTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='State' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='12'" 
	 * @generated
	 */
	EDataType getState();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Simple String Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple String Union Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='simpleStringUnionType' memberTypes='simpleStringUnionType_._member_._0 simpleStringUnionType_._member_._1'" 
	 * @generated
	 */
	EDataType getSimpleStringUnionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Simple String Union Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple String Union Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='simpleStringUnionType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='5'" 
	 * @generated
	 */
	EDataType getSimpleStringUnionTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Simple Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Union Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='simpleUnionType' memberTypes='simpleUnionType_._member_._0 simpleUnionType_._member_._1'" 
	 * @generated
	 */
	EDataType getSimpleUnionType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Simple Union Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Union Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='simpleUnionType_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#integer'" 
	 * @generated
	 */
	EDataType getSimpleUnionTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Simple Union Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Union Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='simpleUnionType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#string' enumeration='N/A'" 
	 * @generated
	 */
	EDataType getSimpleUnionTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Six States List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Six States List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='SixStatesList' baseType='StateList' length='6'" 
	 * @generated
	 */
	EDataType getSixStatesList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>State List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>State List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='StateList' itemType='State'" 
	 * @generated
	 */
	EDataType getStateList();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>String List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='StringList' itemType='http://www.eclipse.org/emf/2003/XMLType#string'" 
	 * @generated
	 */
	EDataType getStringList();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zip Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='zipCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='6'" 
	 * @generated
	 */
	EDataType getZipCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zip Unions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zip Unions Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='zipUnions_._type' memberTypes='zipCode State'" 
	 * @generated
	 */
	EDataType getZipUnionsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Zip Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zip Union Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='zipUnion_._type' memberTypes='zipCode State'" 
	 * @generated
	 */
	EDataType getZipUnionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListunionFactory getListunionFactory();

} //ListunionPackage
