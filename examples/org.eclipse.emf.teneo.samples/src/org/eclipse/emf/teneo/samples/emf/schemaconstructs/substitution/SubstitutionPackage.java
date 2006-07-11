/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutionPackage.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution;

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
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionFactory
 * @model kind="package"
 * @generated
 */
public interface SubstitutionPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "substitution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/store/test/emf/schemaconstructs/substitution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "substitution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubstitutionPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.ComplexNumberImpl <em>Complex Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.ComplexNumberImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getComplexNumber()
	 * @generated
	 */
	int COMPLEX_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NUMBER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NUMBER__UNIT = 1;

	/**
	 * The number of structural features of the the '<em>Complex Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NUMBER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Even</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVEN = 3;

	/**
	 * The feature id for the '<em><b>My Simple Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MY_SIMPLE_ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Even Complex Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVEN_COMPLEX_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MY_COMPLEX_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Multi Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Odd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ODD = 9;

	/**
	 * The feature id for the '<em><b>Odd Complex Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ODD_COMPLEX_NUMBER = 10;

	/**
	 * The number of structural features of the the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.EvenComplexNumberTypeImpl <em>Even Complex Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.EvenComplexNumberTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getEvenComplexNumberType()
	 * @generated
	 */
	int EVEN_COMPLEX_NUMBER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COMPLEX_NUMBER_TYPE__VALUE = COMPLEX_NUMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COMPLEX_NUMBER_TYPE__UNIT = COMPLEX_NUMBER__UNIT;

	/**
	 * The number of structural features of the the '<em>Even Complex Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVEN_COMPLEX_NUMBER_TYPE_FEATURE_COUNT = COMPLEX_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.MultiNumberTypeImpl <em>Multi Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.MultiNumberTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getMultiNumberType()
	 * @generated
	 */
	int MULTI_NUMBER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NUMBER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>My Complex Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>My Complex Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT = 2;

	/**
	 * The number of structural features of the the '<em>Multi Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_NUMBER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl <em>Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getNumberType()
	 * @generated
	 */
	int NUMBER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>My Simple Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>My Simple Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MY_SIMPLE_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>My Complex Abstract Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP = 3;

	/**
	 * The feature id for the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE__MY_COMPLEX_ABSTRACT = 4;

	/**
	 * The number of structural features of the the '<em>Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.OddComplexNumberTypeImpl <em>Odd Complex Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.OddComplexNumberTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getOddComplexNumberType()
	 * @generated
	 */
	int ODD_COMPLEX_NUMBER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COMPLEX_NUMBER_TYPE__VALUE = COMPLEX_NUMBER__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COMPLEX_NUMBER_TYPE__UNIT = COMPLEX_NUMBER__UNIT;

	/**
	 * The number of structural features of the the '<em>Odd Complex Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODD_COMPLEX_NUMBER_TYPE_FEATURE_COUNT = COMPLEX_NUMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Even Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getEvenType()
	 * @generated
	 */
	int EVEN_TYPE = 6;

	/**
	 * The meta object id for the '<em>Odd Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getOddType()
	 * @generated
	 */
	int ODD_TYPE = 7;

	/**
	 * The meta object id for the '<em>Simple Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.SubstitutionPackageImpl#getSimpleNumber()
	 * @generated
	 */
	int SIMPLE_NUMBER = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber <em>Complex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber
	 * @generated
	 */
	EClass getComplexNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber#getValue()
	 * @see #getComplexNumber()
	 * @generated
	 */
	EAttribute getComplexNumber_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber#getUnit()
	 * @see #getComplexNumber()
	 * @generated
	 */
	EAttribute getComplexNumber_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEven <em>Even</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Even</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEven()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Even();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMySimpleAbstract <em>My Simple Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Simple Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMySimpleAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MySimpleAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEvenComplexNumber <em>Even Complex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Even Complex Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEvenComplexNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EvenComplexNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMyComplexAbstract <em>My Complex Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Complex Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMyComplexAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MyComplexAbstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMultiNumber <em>Multi Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMultiNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOdd <em>Odd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Odd</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOdd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Odd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOddComplexNumber <em>Odd Complex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Odd Complex Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOddComplexNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OddComplexNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenComplexNumberType <em>Even Complex Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Even Complex Number Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenComplexNumberType
	 * @generated
	 */
	EClass getEvenComplexNumberType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType <em>Multi Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Number Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType
	 * @generated
	 */
	EClass getMultiNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getName()
	 * @see #getMultiNumberType()
	 * @generated
	 */
	EAttribute getMultiNumberType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Complex Abstract Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getMyComplexAbstractGroup()
	 * @see #getMultiNumberType()
	 * @generated
	 */
	EAttribute getMultiNumberType_MyComplexAbstractGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getMyComplexAbstract <em>My Complex Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Complex Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType#getMyComplexAbstract()
	 * @see #getMultiNumberType()
	 * @generated
	 */
	EReference getMultiNumberType_MyComplexAbstract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType <em>Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType
	 * @generated
	 */
	EClass getNumberType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getName()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstractGroup <em>My Simple Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Simple Abstract Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstractGroup()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MySimpleAbstractGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstract <em>My Simple Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Simple Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstract()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MySimpleAbstract();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>My Complex Abstract Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstractGroup()
	 * @see #getNumberType()
	 * @generated
	 */
	EAttribute getNumberType_MyComplexAbstractGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstract <em>My Complex Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Complex Abstract</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstract()
	 * @see #getNumberType()
	 * @generated
	 */
	EReference getNumberType_MyComplexAbstract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType <em>Odd Complex Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Odd Complex Number Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddComplexNumberType
	 * @generated
	 */
	EClass getOddComplexNumberType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Even Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Even Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='even_._type' baseType='simpleNumber' enumeration='2 4 6 8'" 
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
	 *        extendedMetaData="name='odd_._type' baseType='simpleNumber' enumeration='1 3 5 7 9'" 
	 * @generated
	 */
	EDataType getOddType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Simple Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='simpleNumber' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='1' maxInclusive='9'" 
	 * @generated
	 */
	EDataType getSimpleNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubstitutionFactory getSubstitutionFactory();

} //SubstitutionPackage
