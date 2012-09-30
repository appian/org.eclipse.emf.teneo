/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz390773;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz390773.Other#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Bz390773Package#getOther()
 * @model
 * @generated
 */
public interface Other extends EObject {

	/**
	 * Returns the value of the '<em><b>Main</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Main#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' container reference.
	 * @see #setMain(Main)
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Bz390773Package#getOther_Main()
	 * @see org.eclipse.emf.teneo.samples.issues.bz390773.Main#getOther
	 * @model opposite="other" transient="false"
	 * @generated
	 */
	Main getMain();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz390773.Other#getMain <em>Main</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' container reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Main value);
} // Other
