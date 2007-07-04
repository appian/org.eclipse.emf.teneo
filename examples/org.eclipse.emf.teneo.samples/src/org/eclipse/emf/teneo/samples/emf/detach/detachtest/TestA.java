/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestA.java,v 1.3 2007/07/04 19:29:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachtest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getTestB <em>Test B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestA()
 * @model extendedMetaData="name='TestA' kind='elementOnly'"
 * @generated
 */
public interface TestA extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestA_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Test B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test B</em>' reference.
	 * @see #setTestB(EObject)
	 * @see org.eclipse.emf.teneo.samples.emf.detach.detachtest.DetachtestPackage#getTestA_TestB()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='testB'"
	 * @generated
	 */
	EObject getTestB();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.detach.detachtest.TestA#getTestB <em>Test B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test B</em>' reference.
	 * @see #getTestB()
	 * @generated
	 */
	void setTestB(EObject value);

} // TestA
