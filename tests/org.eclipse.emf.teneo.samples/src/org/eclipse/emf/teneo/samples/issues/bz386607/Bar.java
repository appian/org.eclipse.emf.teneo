/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz386607;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz386607.Bar#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz386607.Bz386607Package#getBar()
 * @model
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Foo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo</em>' reference.
	 * @see #setFoo(Foo)
	 * @see org.eclipse.emf.teneo.samples.issues.bz386607.Bz386607Package#getBar_Foo()
	 * @model required="true"
	 * @generated
	 */
	Foo getFoo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz386607.Bar#getFoo <em>Foo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foo</em>' reference.
	 * @see #getFoo()
	 * @generated
	 */
	void setFoo(Foo value);

} // Bar
