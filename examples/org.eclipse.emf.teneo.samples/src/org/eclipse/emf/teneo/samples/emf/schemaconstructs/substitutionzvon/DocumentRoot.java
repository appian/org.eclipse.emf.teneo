/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexEven <em>Complex Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexOdd <em>Complex Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getEven <em>Even</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getMyAbstract <em>My Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getOdd <em>Odd</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Complex Even</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Even</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Even</em>' containment reference.
	 * @see #setComplexEven(ComplexEvenType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_ComplexEven()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='complexEven' namespace='##targetNamespace' affiliation='myComplexAbstract'"
	 * @generated
	 */
	ComplexEvenType getComplexEven();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexEven <em>Complex Even</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Even</em>' containment reference.
	 * @see #getComplexEven()
	 * @generated
	 */
	void setComplexEven(ComplexEvenType value);

	/**
	 * Returns the value of the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Complex Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Complex Abstract</em>' containment reference.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_MyComplexAbstract()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myComplexAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexAAA getMyComplexAbstract();

	/**
	 * Returns the value of the '<em><b>Complex Odd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Odd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Odd</em>' containment reference.
	 * @see #setComplexOdd(ComplexOddType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_ComplexOdd()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='complexOdd' namespace='##targetNamespace' affiliation='myComplexAbstract'"
	 * @generated
	 */
	ComplexOddType getComplexOdd();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getComplexOdd <em>Complex Odd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Odd</em>' containment reference.
	 * @see #getComplexOdd()
	 * @generated
	 */
	void setComplexOdd(ComplexOddType value);

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_Even()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.EvenType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='even' namespace='##targetNamespace' affiliation='myAbstract'"
	 * @generated
	 */
	BigInteger getEven();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getEven <em>Even</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Even</em>' attribute.
	 * @see #getEven()
	 * @generated
	 */
	void setEven(BigInteger value);

	/**
	 * Returns the value of the '<em><b>My Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Abstract</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_MyAbstract()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.AAA" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myAbstract' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMyAbstract();

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_Odd()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.OddType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='odd' namespace='##targetNamespace' affiliation='myAbstract'"
	 * @generated
	 */
	BigInteger getOdd();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getOdd <em>Odd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Odd</em>' attribute.
	 * @see #getOdd()
	 * @generated
	 */
	void setOdd(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(RootType)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getDocumentRoot_Root()
	 * @model containment="true" resolveProxies="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='root' namespace='##targetNamespace'"
	 * @generated
	 */
	RootType getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.DocumentRoot#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootType value);

} // DocumentRoot
