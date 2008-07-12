/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parent.java,v 1.1 2008/07/12 13:09:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.various;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getTotalPeople <em>Total People</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage#getParent()
 * @model annotation="teneo.jpa value='@ForceDiscriminator'"
 * @generated
 */
public interface Parent extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.various.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage#getParent_Children()
	 * @model
	 * @generated
	 */
	EList<Child> getChildren();

	/**
	 * Returns the value of the '<em><b>Total People</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total People</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total People</em>' attribute.
	 * @see #setTotalPeople(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.various.VariousPackage#getParent_TotalPeople()
	 * @model annotation="teneo.jpa value='@Formula(value=\"(select count(*) from parent)\")'"
	 * @generated
	 */
	int getTotalPeople();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.various.Parent#getTotalPeople <em>Total People</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total People</em>' attribute.
	 * @see #getTotalPeople()
	 * @generated
	 */
	void setTotalPeople(int value);

} // Parent
