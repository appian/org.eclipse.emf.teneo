/**
 * <copyright>
 * </copyright>
 *
 * $Id: SignaturePropertyType.java,v 1.1 2009/06/28 02:03:49 mtaal Exp $
 */
package org.w3._2000._09.xmldsig;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Signature Property Type</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getGroup <em>Group</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getAny <em>Any</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getId <em>Id</em>}</li>
 * <li>{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType()
 * @model extendedMetaData="name='SignaturePropertyType' kind='mixed'"
 * @generated
 */
public interface SignaturePropertyType extends EObject {
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType_Mixed()
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType_Group()
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
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        transient="true" volatile="true" derived="true" extendedMetaData=
	 *        "kind='elementWildcard' wildcards='##other' name=':2' processing='lax' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getId <em>Id</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.w3._2000._09.xmldsig.XmldsigPackage#getSignaturePropertyType_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='Target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.w3._2000._09.xmldsig.SignaturePropertyType#getTarget
	 * <em>Target</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // SignaturePropertyType
