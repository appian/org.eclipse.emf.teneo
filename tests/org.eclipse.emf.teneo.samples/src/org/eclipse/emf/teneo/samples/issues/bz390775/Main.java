/**
 */
package org.eclipse.emf.teneo.samples.issues.bz390775;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz390775.Main#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz390775.Bz390775Package#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz390775.Other#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference.
	 * @see #setOther(Other)
	 * @see org.eclipse.emf.teneo.samples.issues.bz390775.Bz390775Package#getMain_Other()
	 * @see org.eclipse.emf.teneo.samples.issues.bz390775.Other#getMain
	 * @model opposite="main" containment="true"
	 *        annotation="teneo.jpa value='@OneToOne(mappedBy=\"main\", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER, optional = true)'"
	 * @generated
	 */
	Other getOther();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz390775.Main#getOther <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' containment reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Other value);

} // Main
