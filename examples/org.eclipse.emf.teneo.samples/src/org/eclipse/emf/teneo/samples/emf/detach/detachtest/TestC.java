/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestC.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getMyDate <em>My Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getTestB <em>Test B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestC()
 * @model extendedMetaData="name='TestC' kind='elementOnly'"
 * @generated
 */
public interface TestC extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestC_Code()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>My Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Date</em>' attribute.
	 * @see #setMyDate(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestC_MyDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='myDate'"
	 * @generated
	 */
	Object getMyDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestC#getMyDate <em>My Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Date</em>' attribute.
	 * @see #getMyDate()
	 * @generated
	 */
	void setMyDate(Object value);

	/**
	 * Returns the value of the '<em><b>Test B</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test B</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test B</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestC_TestB()
	 * @model type="org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestB" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='testB'"
	 * @generated
	 */
	EList<TestB> getTestB();

} // TestC
