/**
 */
package org.eclipse.emf.teneo.samples.issues.bz400088;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref400088</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getRef400088()
 * @model annotation="teneo.jpa value='@Entity(name=\"org.eclipse.emf.teneo.samples.issues.bz4000888.Ref400088\")'"
 * @generated
 */
public interface Ref400088 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther <em>Ref Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' containment reference list.
	 * @see #isSetRef()
	 * @see #unsetRef()
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.Bz400088Package#getRef400088_Ref()
	 * @see org.eclipse.emf.teneo.samples.issues.bz400088.RefOther400088#getRefOther
	 * @model opposite="refOther" containment="true" unsettable="true"
	 * @generated
	 */
	EList<RefOther400088> getRef();

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef <em>Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRef()
	 * @see #getRef()
	 * @generated
	 */
	void unsetRef();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz400088.Ref400088#getRef <em>Ref</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref</em>' containment reference list is set.
	 * @see #unsetRef()
	 * @see #getRef()
	 * @generated
	 */
	boolean isSetRef();

} // Ref400088
