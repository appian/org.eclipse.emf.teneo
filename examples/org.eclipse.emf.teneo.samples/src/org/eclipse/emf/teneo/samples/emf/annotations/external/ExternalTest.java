/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalTest.java,v 1.1 2008/12/16 20:40:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.external;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getEObject <em>EObject</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getEObjects <em>EObjects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest()
 * @model
 * @generated
 */
public interface ExternalTest extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='city'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_EObject()
	 * @model annotation="teneo.jpa value='@External'"
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

	/**
	 * Returns the value of the '<em><b>EObjects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObjects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObjects</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_EObjects()
	 * @model annotation="teneo.jpa value='@External'"
	 * @generated
	 */
	EList<EObject> getEObjects();

} // ExternalTest
