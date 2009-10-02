/**
 * <copyright>
 * </copyright>
 *
 * $Id: Foo.java,v 1.1 2009/10/02 07:47:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz290969.Foo#getBarKey <em>Bar Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package#getFoo()
 * @model annotation="teneo.jpa appinfo='@Entity(name=\"FooEntity\")'"
 * @generated
 */
public interface Foo extends EObject {
	/**
	 * Returns the value of the '<em><b>Bar Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Key</em>' reference.
	 * @see #setBarKey(BarKey)
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package#getFoo_BarKey()
	 * @model resolveProxies="false"
	 * @generated
	 */
	BarKey getBarKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz290969.Foo#getBarKey <em>Bar Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar Key</em>' reference.
	 * @see #getBarKey()
	 * @generated
	 */
	void setBarKey(BarKey value);

} // Foo
