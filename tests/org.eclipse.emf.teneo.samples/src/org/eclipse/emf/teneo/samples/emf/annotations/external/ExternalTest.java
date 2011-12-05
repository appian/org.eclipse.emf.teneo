/**
 * <copyright>
 * </copyright>
 *
 * $Id: ExternalTest.java,v 1.2 2011/02/27 20:10:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.external;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getExternalObject <em>External Object</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getExternalObjects <em>External Objects</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_EClass()
	 * @model annotation="teneo.jpa value='@External(type=\"org.eclipse.emf.teneo.hibernate.mapping.EcoreModelElementType\")'"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>External Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Object</em>' reference.
	 * @see #setExternalObject(ExternalObject)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_ExternalObject()
	 * @model
	 * @generated
	 */
	ExternalObject getExternalObject();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalTest#getExternalObject <em>External Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Object</em>' reference.
	 * @see #getExternalObject()
	 * @generated
	 */
	void setExternalObject(ExternalObject value);

	/**
	 * Returns the value of the '<em><b>External Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Objects</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.external.ExternalPackage#getExternalTest_ExternalObjects()
	 * @model
	 * @generated
	 */
	EList<ExternalObject> getExternalObjects();

} // ExternalTest
