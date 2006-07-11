/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEven <em>Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMySimpleAbstract <em>My Simple Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEvenComplexNumber <em>Even Complex Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMultiNumber <em>Multi Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOdd <em>Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOddComplexNumber <em>Odd Complex Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Even</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even</em>' attribute.
	 * @see #setEven(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_Even()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.EvenType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='even' namespace='##targetNamespace' affiliation='mySimpleAbstract'"
	 * @generated
	 */
	BigInteger getEven();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEven <em>Even</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even</em>' attribute.
	 * @see #getEven()
	 * @generated
	 */
	void setEven(BigInteger value);

	/**
	 * Returns the value of the '<em><b>My Simple Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Simple Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Simple Abstract</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_MySimpleAbstract()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SimpleNumber" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mySimpleAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMySimpleAbstract();

	/**
	 * Returns the value of the '<em><b>Even Complex Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Even Complex Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Even Complex Number</em>' containment reference.
	 * @see #setEvenComplexNumber(EvenComplexNumberType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_EvenComplexNumber()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='evenComplexNumber' namespace='##targetNamespace' affiliation='myComplexAbstract'"
	 * @generated
	 */
	EvenComplexNumberType getEvenComplexNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getEvenComplexNumber <em>Even Complex Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even Complex Number</em>' containment reference.
	 * @see #getEvenComplexNumber()
	 * @generated
	 */
	void setEvenComplexNumber(EvenComplexNumberType value);

	/**
	 * Returns the value of the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Complex Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Complex Abstract</em>' containment reference.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_MyComplexAbstract()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myComplexAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexNumber getMyComplexAbstract();

	/**
	 * Returns the value of the '<em><b>Multi Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Number</em>' containment reference.
	 * @see #setMultiNumber(MultiNumberType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_MultiNumber()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multiNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiNumberType getMultiNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getMultiNumber <em>Multi Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Number</em>' containment reference.
	 * @see #getMultiNumber()
	 * @generated
	 */
	void setMultiNumber(MultiNumberType value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' containment reference.
	 * @see #setNumber(NumberType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_Number()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	NumberType getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getNumber <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' containment reference.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(NumberType value);

	/**
	 * Returns the value of the '<em><b>Odd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd</em>' attribute.
	 * @see #setOdd(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_Odd()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.OddType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='odd' namespace='##targetNamespace' affiliation='mySimpleAbstract'"
	 * @generated
	 */
	BigInteger getOdd();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOdd <em>Odd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd</em>' attribute.
	 * @see #getOdd()
	 * @generated
	 */
	void setOdd(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Odd Complex Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Odd Complex Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Odd Complex Number</em>' containment reference.
	 * @see #setOddComplexNumber(OddComplexNumberType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getDocumentRoot_OddComplexNumber()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oddComplexNumber' namespace='##targetNamespace' affiliation='myComplexAbstract'"
	 * @generated
	 */
	OddComplexNumberType getOddComplexNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.DocumentRoot#getOddComplexNumber <em>Odd Complex Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd Complex Number</em>' containment reference.
	 * @see #getOddComplexNumber()
	 * @generated
	 */
	void setOddComplexNumber(OddComplexNumberType value);

} // DocumentRoot
