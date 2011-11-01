/**
 * <copyright>
 * </copyright>
 *
 * $Id: Foo.java,v 1.2 2009/05/23 13:57:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getBars <em>Bars</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getBiffs <em>Biffs</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getFoo()
 * @model
 * @generated
 */
public interface Foo extends EObject {
	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.adept.Bar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getFoo_Bars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bar> getBars();

	/**
	 * Returns the value of the '<em><b>Biffs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.adept.Biff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biffs</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getFoo_Biffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Biff> getBiffs();

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
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getFoo_Id()
	 * @model id="true" required="true"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.adept.Foo#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // Foo
