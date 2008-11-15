/**
 * <copyright>
 * </copyright>
 *
 * $Id: Two.java,v 1.1 2008/11/15 21:37:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz253799;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz253799.Two#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Package#getTwo()
 * @model
 * @generated
 */
public interface Two extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(One)
	 * @see org.eclipse.emf.teneo.samples.issues.bz253799.Bz253799Package#getTwo_Ref()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@OneToOne(optional=false)\n@JoinColumn(name=\"ref1\")'"
	 * @generated
	 */
	One getRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz253799.Two#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(One value);

} // Two
