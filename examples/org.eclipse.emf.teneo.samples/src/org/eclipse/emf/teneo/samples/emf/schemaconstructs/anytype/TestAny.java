/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestAny.java,v 1.3 2008/04/07 14:34:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getSingleAnyType <em>Single Any Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMultiAnyType <em>Multi Any Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getMyAny <em>My Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny()
 * @model extendedMetaData="name='testAny' kind='elementOnly'"
 * @generated
 */
public interface TestAny extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Single Any Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Any Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Any Type</em>' containment reference.
	 * @see #setSingleAnyType(EObject)
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny_SingleAnyType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='singleAnyType'"
	 * @generated
	 */
	EObject getSingleAnyType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny#getSingleAnyType <em>Single Any Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Any Type</em>' containment reference.
	 * @see #getSingleAnyType()
	 * @generated
	 */
	void setSingleAnyType(EObject value);

	/**
	 * Returns the value of the '<em><b>Multi Any Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Any Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Any Type</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny_MultiAnyType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiAnyType'"
	 * @generated
	 */
	EList<EObject> getMultiAnyType();

	/**
	 * Returns the value of the '<em><b>My Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Any</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny_MyAny()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='strict'"
	 * @generated
	 */
	FeatureMap getMyAny();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage#getTestAny_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // TestAny
