/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestElement.java,v 1.1 2008/04/11 03:21:47 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.largemapvalue;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement#getTestMap <em>Test Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement#getTestProp <em>Test Prop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage#getTestElement()
 * @model
 * @generated
 */
public interface TestElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Test Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Map</em>' map.
	 * @see org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage#getTestElement_TestMap()
	 * @model mapType="org.eclipse.emf.teneo.samples.issues.largemapvalue.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getTestMap();

	/**
	 * Returns the value of the '<em><b>Test Prop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Prop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Prop</em>' attribute.
	 * @see #setTestProp(String)
	 * @see org.eclipse.emf.teneo.samples.issues.largemapvalue.LargemapvaluePackage#getTestElement_TestProp()
	 * @model annotation="teneo.jpa value='@Lob\n@Column(length=1000000)'"
	 *        annotation="teneo.jpa.auditing value='@Lob\n@Column(length=1000000)'"
	 * @generated
	 */
	String getTestProp();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.largemapvalue.TestElement#getTestProp <em>Test Prop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Prop</em>' attribute.
	 * @see #getTestProp()
	 * @generated
	 */
	void setTestProp(String value);

} // TestElement
