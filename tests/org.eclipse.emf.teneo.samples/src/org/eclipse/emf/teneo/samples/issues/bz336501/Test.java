/**
 * <copyright>
 * </copyright>
 *
 * $Id: Test.java,v 1.1 2011/02/21 05:47:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz336501;

import java.sql.Timestamp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Test</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.Test#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.Test#getDateOrTime <em>Date Or Time</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz336501.Test#getDateOrTimes <em>Date Or Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package#getTest()
 * @model extendedMetaData="name='Test' kind='elementOnly'"
 * @generated
 */
public interface Test extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package#getTest_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz336501.Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date Or Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Or Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date Or Time</em>' attribute.
	 * @see #setDateOrTime(Timestamp)
	 * @see org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package#getTest_DateOrTime()
	 * @model 
	 *        dataType="org.eclipse.emf.teneo.samples.issues.bz336501.JavaDateTime"
	 *        required="true"
	 *        extendedMetaData="kind='element' name='dateOrTime'"
	 * @generated
	 */
	Timestamp getDateOrTime();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz336501.Test#getDateOrTime <em>Date Or Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Date Or Time</em>' attribute.
	 * @see #getDateOrTime()
	 * @generated
	 */
	void setDateOrTime(Timestamp value);

	/**
	 * Returns the value of the '<em><b>Date Or Times</b></em>' attribute list.
	 * The list contents are of type {@link java.sql.Timestamp}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Or Times</em>' attribute list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date Or Times</em>' attribute list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz336501.Bz336501Package#getTest_DateOrTimes()
	 * @model unique="false"
	 *        dataType="org.eclipse.emf.teneo.samples.issues.bz336501.JavaDateTime"
	 *        required="true"
	 *        extendedMetaData="kind='element' name='dateOrTimes'"
	 * @generated
	 */
	EList<Timestamp> getDateOrTimes();

} // Test
