/**
 * <copyright>
 * </copyright>
 *
 * $Id: RootType.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstractGroup <em>My Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyAbstract <em>My Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getRootType()
 * @model extendedMetaData="name='root_._type' kind='elementOnly'"
 * @generated
 */
public interface RootType extends EObject{
	/**
	 * Returns the value of the '<em><b>My Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Abstract Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Abstract Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getRootType_MyAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true"
	 *        extendedMetaData="kind='group' name='myAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMyAbstractGroup();

	/**
	 * Returns the value of the '<em><b>My Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Abstract</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getRootType_MyAbstract()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.AAA" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myAbstract' namespace='##targetNamespace' group='myAbstract:group'"
	 * @generated
	 */
	BigInteger getMyAbstract();

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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getRootType_MyComplexAbstractGroup()
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage#getRootType_MyComplexAbstract()
	 * @model containment="true" resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='myComplexAbstract' namespace='##targetNamespace' group='myComplexAbstract:group'"
	 * @generated
	 */
	ComplexAAA getMyComplexAbstract();

} // RootType
