/**
 * <copyright>
 * </copyright>
 *
 * $Id: SPKIDataType.java,v 1.1 2009/06/28 02:03:50 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SPKI Data Type</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.SPKIDataType#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SPKIDataType#getSPKISexp <em>SPKI Sexp</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SPKIDataType#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSPKIDataType()
 * @model extendedMetaData="name='SPKIDataType' kind='elementOnly'"
 * @generated
 */
public interface SPKIDataType extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSPKIDataType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SPKI Sexp</b></em>' attribute list. The list contents are of
	 * type {@link byte}[]. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPKI Sexp</em>' attribute list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>SPKI Sexp</em>' attribute list.
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSPKIDataType_SPKISexp()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary" required="true"
	 *        transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='element' name='SPKISexp' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<byte[]> getSPKISexp();

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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSPKIDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

} // SPKIDataType
