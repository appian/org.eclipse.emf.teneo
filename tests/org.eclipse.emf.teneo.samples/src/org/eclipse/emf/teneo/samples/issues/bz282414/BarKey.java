/**
 * <copyright>
 * </copyright>
 *
 * $Id: BarKey.java,v 1.1 2009/07/05 00:09:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz282414;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getClassId <em>Class Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getGroupId <em>Group Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getBarKey()
 * @model annotation="teneo.jpa appinfo='@Embeddable'"
 *        extendedMetaData="name='BarKey' kind='empty'"
 * @generated
 */
public interface BarKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Id</em>' attribute.
	 * @see #setClassId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getBarKey_ClassId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"CLAS_ID\",\n\t\t\t\t\tnullable=false)'"
	 *        extendedMetaData="kind='attribute' name='classId'"
	 * @generated
	 */
	String getClassId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getClassId <em>Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Id</em>' attribute.
	 * @see #getClassId()
	 * @generated
	 */
	void setClassId(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz282414.Bz282414Package#getBarKey_GroupId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="teneo.jpa appinfo='@Column(name=\"GRP_ID\",\n\t\t\t\t\tnullable=false)'"
	 *        extendedMetaData="kind='attribute' name='groupId'"
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz282414.BarKey#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

} // BarKey
