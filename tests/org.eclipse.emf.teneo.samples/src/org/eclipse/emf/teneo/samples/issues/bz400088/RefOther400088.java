/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Other400088</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther <em>Ref Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getRefOther400088()
 * @model annotation="teneo.jpa value='@Entity(name=\"org.eclipse.emf.teneo.samples.issues.bz4000888.RefOther400088\")'"
 * @generated
 */
public interface RefOther400088 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Other</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Other</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Other</em>' container reference.
	 * @see #setRefOther(Ref400088)
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getRefOther400088_RefOther()
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef
	 * @model opposite="ref" transient="false"
	 * @generated
	 */
	Ref400088 getRefOther();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther <em>Ref Other</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Other</em>' container reference.
	 * @see #getRefOther()
	 * @generated
	 */
	void setRefOther(Ref400088 value);

} // RefOther400088
