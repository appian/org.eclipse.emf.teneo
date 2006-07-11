/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumberType.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstractGroup <em>My Simple Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMySimpleAbstract <em>My Simple Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType()
 * @model extendedMetaData="name='number_._type' kind='elementOnly'"
 * @generated
 */
public interface NumberType extends EObject{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>My Simple Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Simple Abstract Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Simple Abstract Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType_MySimpleAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true"
	 *        extendedMetaData="kind='group' name='mySimpleAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMySimpleAbstractGroup();

	/**
	 * Returns the value of the '<em><b>My Simple Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Simple Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Simple Abstract</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType_MySimpleAbstract()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SimpleNumber" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mySimpleAbstract' namespace='##targetNamespace' group='mySimpleAbstract:group'"
	 * @generated
	 */
	BigInteger getMySimpleAbstract();

	/**
	 * Returns the value of the '<em><b>My Complex Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Complex Abstract Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Complex Abstract Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType_MyComplexAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true"
	 *        extendedMetaData="kind='group' name='myComplexAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMyComplexAbstractGroup();

	/**
	 * Returns the value of the '<em><b>My Complex Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Complex Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Complex Abstract</em>' containment reference.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage#getNumberType_MyComplexAbstract()
	 * @model containment="true" resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myComplexAbstract' namespace='##targetNamespace' group='myComplexAbstract:group'"
	 * @generated
	 */
	ComplexNumber getMyComplexAbstract();

} // NumberType
