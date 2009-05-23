/**
 * <copyright>
 * </copyright>
 *
 * $Id: Baz.java,v 1.1.2.1 2009/05/23 13:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getBaz()
 * @model abstract="true"
 * @generated
 */
public interface Baz extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getBaz_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getBaz_Id()
	 * @model id="true" required="true"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.adept.Baz#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // Baz
