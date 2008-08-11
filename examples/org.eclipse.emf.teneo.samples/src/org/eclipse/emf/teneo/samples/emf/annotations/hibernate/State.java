/**
 * <copyright>
 * </copyright>
 *
 * $Id: State.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail <em>State Detail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>State Detail</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Detail</em>' reference.
	 * @see #setStateDetail(StateDetail)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getState_StateDetail()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState
	 * @model opposite="state"
	 *        annotation="teneo.jpa value='@OneToOne(mappedBy=\"state\")'"
	 * @generated
	 */
	StateDetail getStateDetail();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail <em>State Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Detail</em>' reference.
	 * @see #getStateDetail()
	 * @generated
	 */
	void setStateDetail(StateDetail value);

} // State
