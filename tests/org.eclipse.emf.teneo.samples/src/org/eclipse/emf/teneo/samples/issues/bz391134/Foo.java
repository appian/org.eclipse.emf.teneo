/**
 */
package org.eclipse.emf.teneo.samples.issues.bz391134;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz391134.Foo#getBar <em>Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz391134.Bz391134Package#getFoo()
 * @model
 * @generated
 */
public interface Foo extends EObject {
	/**
	 * Returns the value of the '<em><b>Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar</em>' reference.
	 * @see #setBar(Bar)
	 * @see org.eclipse.emf.teneo.samples.issues.bz391134.Bz391134Package#getFoo_Bar()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@JoinColumn(nullable=\"true\")'"
	 * @generated
	 */
	Bar getBar();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz391134.Foo#getBar <em>Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar</em>' reference.
	 * @see #getBar()
	 * @generated
	 */
	void setBar(Bar value);

} // Foo
