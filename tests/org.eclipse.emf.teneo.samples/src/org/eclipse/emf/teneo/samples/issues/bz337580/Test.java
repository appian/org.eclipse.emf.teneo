/**
 * <copyright>
 * </copyright>
 *
 * $Id: Test.java,v 1.1 2011/02/21 06:40:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz337580;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz337580.Test#getNameWhichShouldBeTrunctated <em>Name Which Should Be Trunctated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package#getTest()
 * @model annotation="teneo.jpa appinfo='@Table(name=\"AVERYLONGNAMEFORTEST\")\n\t\t\t'"
 *        extendedMetaData="name='Test' kind='elementOnly'"
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Which Should Be Trunctated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Which Should Be Trunctated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Which Should Be Trunctated</em>' attribute.
	 * @see #setNameWhichShouldBeTrunctated(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz337580.Bz337580Package#getTest_NameWhichShouldBeTrunctated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='nameWhichShouldBeTrunctated'"
	 * @generated
	 */
	String getNameWhichShouldBeTrunctated();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz337580.Test#getNameWhichShouldBeTrunctated <em>Name Which Should Be Trunctated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Which Should Be Trunctated</em>' attribute.
	 * @see #getNameWhichShouldBeTrunctated()
	 * @generated
	 */
	void setNameWhichShouldBeTrunctated(String value);

} // Test
