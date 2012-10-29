/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransformType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transform Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.TransformType#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.TransformType#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.TransformType#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.TransformType#getXPath <em>XPath</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.TransformType#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType()
 * @model extendedMetaData="name='TransformType' kind='mixed'"
 * @generated
 */
public interface TransformType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>XPath</b></em>' attribute list. The list contents are of type
	 * {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPath</em>' attribute list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XPath</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType_XPath()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true"
	 *        volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XPath' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getXPath();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getTransformType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.TransformType#getAlgorithm
	 * <em>Algorithm</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // TransformType
