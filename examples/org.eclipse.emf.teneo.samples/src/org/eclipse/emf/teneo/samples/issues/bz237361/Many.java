/**
 * <copyright>
 * </copyright>
 *
 * $Id: Many.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237361;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne <em>One</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package#getMany()
 * @model
 * @generated
 */
public interface Many extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package#getMany_Name()
	 * @model annotation="teneo.jpa value='@Column(name=\"myname\")'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>One</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz237361.One#getManies <em>Manies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One</em>' reference.
	 * @see #setOne(One)
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package#getMany_One()
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.One#getManies
	 * @model opposite="manies"
	 * @generated
	 */
	One getOne();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne <em>One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One</em>' reference.
	 * @see #getOne()
	 * @generated
	 */
	void setOne(One value);

} // Many
