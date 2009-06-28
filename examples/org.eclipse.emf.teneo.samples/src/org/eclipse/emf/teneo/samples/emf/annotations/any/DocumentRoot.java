/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRoot.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.any;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalInt <em>Global Int</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalObject <em>Global Object</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalString <em>Global String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot()
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_Mixed()
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Global Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Int</em>' attribute.
	 * @see #setGlobalInt(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_GlobalInt()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalInt' namespace='##targetNamespace'"
	 * @generated
	 */
	int getGlobalInt();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalInt <em>Global Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Int</em>' attribute.
	 * @see #getGlobalInt()
	 * @generated
	 */
	void setGlobalInt(int value);

	/**
	 * Returns the value of the '<em><b>Global Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Object</em>' containment reference.
	 * @see #setGlobalObject(GlobalObjectType)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_GlobalObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalObject' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalObjectType getGlobalObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalObject <em>Global Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Object</em>' containment reference.
	 * @see #getGlobalObject()
	 * @generated
	 */
	void setGlobalObject(GlobalObjectType value);

	/**
	 * Returns the value of the '<em><b>Global String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global String</em>' attribute.
	 * @see #setGlobalString(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage#getDocumentRoot_GlobalString()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='globalString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGlobalString();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.any.DocumentRoot#getGlobalString <em>Global String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global String</em>' attribute.
	 * @see #getGlobalString()
	 * @generated
	 */
	void setGlobalString(String value);

} // DocumentRoot
