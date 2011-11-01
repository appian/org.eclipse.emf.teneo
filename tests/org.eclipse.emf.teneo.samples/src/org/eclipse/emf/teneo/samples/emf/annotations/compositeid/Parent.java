/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parent.java,v 1.5 2008/04/06 13:45:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.compositeid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.compositeid.Parent#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositeid.CompositeidPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.compositeid.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.compositeid.CompositeidPackage#getParent_Children()
	 * @model annotation="teneo.jpa appinfo='@JoinColumns({\n\t@JoinColumn(name=\"myParentFirstName\", referencedColumnName=\"firstName\"),\n\t@JoinColumn(name=\"myParentLastName\", referencedColumnName=\"lastName\")\n})'"
	 * @generated
	 */
	EList<Child> getChildren();

} // Parent
