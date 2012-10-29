/**
 * <copyright>
 * </copyright>
 *
 * $Id: CanonicalizationMethodType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Canonicalization Method Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getCanonicalizationMethodType()
 * @model extendedMetaData="name='CanonicalizationMethodType' kind='mixed'"
 * @generated
 */
public interface CanonicalizationMethodType extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getCanonicalizationMethodType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getCanonicalizationMethodType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##any' name=':1' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getCanonicalizationMethodType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.CanonicalizationMethodType#getAlgorithm
	 * <em>Algorithm</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

} // CanonicalizationMethodType
