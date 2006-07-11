/**
 * <copyright>
 * </copyright>
 *
 * $Id: Me.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.simplenm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Me</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me#getYou <em>You</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmPackage#getMe()
 * @model extendedMetaData="name='Me' kind='elementOnly'"
 * @generated
 */
public interface Me extends EObject{
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
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmPackage#getMe_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.simplenm.Me#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>You</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.simplenm.You}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.simplenm.You#getMe <em>Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>You</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>You</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmPackage#getMe_You()
	 * @see org.eclipse.emf.teneo.samples.issues.simplenm.You#getMe
	 * @model type="org.eclipse.emf.teneo.samples.issues.simplenm.You" opposite="me" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='you'"
	 * @generated
	 */
	EList getYou();

} // Me
