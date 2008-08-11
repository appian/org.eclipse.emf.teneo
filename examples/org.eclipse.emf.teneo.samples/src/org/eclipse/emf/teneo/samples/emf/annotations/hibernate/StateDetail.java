/**
 * <copyright>
 * </copyright>
 *
 * $Id: StateDetail.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hibernate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getStateDetail()
 * @model
 * @generated
 */
public interface StateDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail <em>State Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.HibernatePackage#getStateDetail_State()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hibernate.State#getStateDetail
	 * @model opposite="stateDetail"
	 *        annotation="teneo.jpa value='@OneToOne(optional=true)\n@JoinColumn(name=\"STATE_ID\")'"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hibernate.StateDetail#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // StateDetail
