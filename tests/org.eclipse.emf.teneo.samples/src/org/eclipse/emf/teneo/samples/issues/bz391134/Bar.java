/**
 */
package org.eclipse.emf.teneo.samples.issues.bz391134;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz391134.Bar#getFoo <em>Foo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz391134.Bz391134Package#getBar()
 * @model
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Foo</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz391134.Foo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foo</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz391134.Bz391134Package#getBar_Foo()
	 * @model
	 * @generated
	 */
	EList<Foo> getFoo();

} // Bar
