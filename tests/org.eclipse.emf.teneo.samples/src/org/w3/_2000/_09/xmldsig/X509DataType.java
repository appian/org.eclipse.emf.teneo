/**
 * <copyright>
 * </copyright>
 *
 * $Id: X509DataType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>X509 Data Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getX509IssuerSerial <em>X509 Issuer Serial</em>}
 * </li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getX509SKI <em>X509SKI</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getX509SubjectName <em>X509 Subject Name</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getX509Certificate <em>X509 Certificate</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getX509CRL <em>X509CRL</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.X509DataType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType()
 * @model extendedMetaData="name='X509DataType' kind='elementOnly'"
 * @generated
 */
public interface X509DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>X509 Issuer Serial</b></em>' containment reference list. The
	 * list contents are of type {@link org.w3._2000._09.xmldsig.X509IssuerSerialType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Issuer Serial</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509 Issuer Serial</em>' containment reference list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_X509IssuerSerial()
	 * @model containment="true" transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='X509IssuerSerial' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<X509IssuerSerialType> getX509IssuerSerial();

	/**
	 * Returns the value of the '<em><b>X509SKI</b></em>' attribute list. The list contents are of
	 * type {@link byte}[]. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509SKI</em>' attribute list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509SKI</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_X509SKI()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true"
	 *        volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='X509SKI' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509SKI();

	/**
	 * Returns the value of the '<em><b>X509 Subject Name</b></em>' attribute list. The list contents
	 * are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Subject Name</em>' attribute list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509 Subject Name</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_X509SubjectName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true"
	 *        volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='X509SubjectName' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getX509SubjectName();

	/**
	 * Returns the value of the '<em><b>X509 Certificate</b></em>' attribute list. The list contents
	 * are of type {@link byte}[]. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509 Certificate</em>' attribute list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509 Certificate</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_X509Certificate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true"
	 *        volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='X509Certificate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509Certificate();

	/**
	 * Returns the value of the '<em><b>X509CRL</b></em>' attribute list. The list contents are of
	 * type {@link byte}[]. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X509CRL</em>' attribute list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X509CRL</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_X509CRL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" transient="true"
	 *        volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='X509CRL' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getX509CRL();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getX509DataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='elementWildcard' wildcards='##other' name=':6' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // X509DataType
