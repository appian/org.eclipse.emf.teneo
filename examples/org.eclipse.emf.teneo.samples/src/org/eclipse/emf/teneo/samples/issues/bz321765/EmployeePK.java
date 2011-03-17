/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmployeePK.java,v 1.1 2011/03/17 09:47:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321765;

import java.io.Serializable;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Employee PK</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getId
 * <em>Id</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getFirstName
 * <em>First Name</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getLastName
 * <em>Last Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployeePK()
 * @model annotation="teneo.jpa appinfo='\n\t\t\t\t@Embeddable\n\t\t\t'"
 *        extendedMetaData="name='EmployeePK' kind='elementOnly'"
 * @generatedNOT
 */
public interface EmployeePK extends EObject, Serializable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployeePK_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	BigInteger getId();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(BigInteger value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployeePK_FirstName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='firstName'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getFirstName
	 * <em>First Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz321765.Bz321765Package#getEmployeePK_LastName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='lastName'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.emf.teneo.samples.issues.bz321765.EmployeePK#getLastName
	 * <em>Last Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // EmployeePK
