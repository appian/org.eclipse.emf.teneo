/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionzvonPackage.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonFactory
 * @model kind="package"
 * @generated
 */
public interface SubstitutionzvonPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "substitutionzvon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/substitutionzvon";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "substitutionzvon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstitutionzvonPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexAAAImpl <em>Complex AAA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexAAAImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getComplexAAA()
	 * @generated
	 */
	int COMPLEX_AAA = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_AAA__VALUE = 0;

	/**
	 * The number of structural features of the the '<em>Complex AAA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_AAA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexEvenTypeImpl <em>Complex Even Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexEvenTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getComplexEvenType()
	 * @generated
	 */
	int COMPLEX_EVEN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVEN_TYPE__VALUE = COMPLEX_AAA__VALUE;

	/**
	 * The number of structural features of the the '<em>Complex Even Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_EVEN_TYPE_FEATURE_COUNT = COMPLEX_AAA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexOddTypeImpl <em>Complex Odd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.ComplexOddTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getComplexOddType()
	 * @generated
	 */
	int COMPLEX_ODD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ODD_TYPE__VALUE = COMPLEX_AAA__VALUE;

	/**
	 * The number of structural features of the the '<em>Complex Odd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ODD_TYPE_FEATURE_COUNT = COMPLEX_AAA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Complex Even</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_EVEN = 3;

	/**
	 * The feature id for the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Complex Odd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPLEX_ODD = 5;

	/**
	 * The feature id for the '<em><b>Even</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVEN = 6;

	/**
	 * The feature id for the '<em><b>My Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MY_ABSTRACT = 7;

	/**
	 * The feature id for the '<em><b>Odd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ODD = 8;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT = 9;

	/**
	 * The number of structural features of the the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl <em>Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getRootType()
	 * @generated
	 */
	int ROOT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>My Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__MY_ABSTRACT_GROUP = 0;

	/**
	 * The feature id for the '<em><b>My Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__MY_ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>My Complex Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__MY_COMPLEX_ABSTRACT = 3;

	/**
	 * The number of structural features of the the '<em>Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>AAA</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getAAA()
	 * @generated
	 */
	int AAA = 5;

	/**
	 * The meta object id for the '<em>Even Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getEvenType()
	 * @generated
	 */
	int EVEN_TYPE = 6;

	/**
	 * The meta object id for the '<em>Odd Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.SubstitutionzvonPackageImpl#getOddType()
	 * @generated
	 */
	int ODD_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA <em>Complex AAA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex AAA</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA
	 * @generated
	 */
	EClass getComplexAAA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA#getValue()
	 * @see #getComplexAAA()
	 * @generated
	 */
	EAttribute getComplexAAA_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexEvenType <em>Complex Even Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Even Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexEvenType
	 * @generated
	 */
	EClass getComplexEvenType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexOddType <em>Complex Odd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Odd Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexOddType
	 * @generated
	 */
	EClass getComplexOddType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexEven <em>Complex Even</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Even</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexEven()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexEven();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyComplexAbstract <em>My Complex Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Complex Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyComplexAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MyComplexAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexOdd <em>Complex Odd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Odd</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexOdd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComplexOdd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getEven <em>Even</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Even</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getEven()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Even();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyAbstract <em>My Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MyAbstract();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getOdd <em>Odd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odd</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getOdd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Odd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getRoot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Root();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType
	 * @generated
	 */
	EClass getRootType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstractGroup <em>My Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Abstract Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstractGroup()
	 * @see #getRootType()
	 * @generated
	 */
	EAttribute getRootType_MyAbstractGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstract <em>My Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstract()
	 * @see #getRootType()
	 * @generated
	 */
	EAttribute getRootType_MyAbstract();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Complex Abstract Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstractGroup()
	 * @see #getRootType()
	 * @generated
	 */
	EAttribute getRootType_MyComplexAbstractGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstract <em>My Complex Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Complex Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstract()
	 * @see #getRootType()
	 * @generated
	 */
	EReference getRootType_MyComplexAbstract();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>AAA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>AAA</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='AAA' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='1' maxInclusive='9'" 
	 * @generated
	 */
	EDataType getAAA();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Even Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Even Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='even_._type' baseType='AAA' enumeration='2 4 6 8'" 
	 * @generated
	 */
	EDataType getEvenType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Odd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Odd Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='odd_._type' baseType='AAA' enumeration='1 3 5 7 9'" 
	 * @generated
	 */
	EDataType getOddType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubstitutionzvonFactory getSubstitutionzvonFactory();

} //SubstitutionzvonPackage
