/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parent.java,v 1.3 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.joincolumns;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Parent#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.JoincolumnsPackage#getParent_Children()
	 * @model type="org.eclipse.emf.teneo.samples.emf.annotations.joincolumns.Child"
	 *        annotation="teneo.jpa appinfo='@JoinColumns({@JoinColumn(name=\"myParentFirstName\" referencedColumnName=\"firstName\"),\n\t@JoinColumn(name=\"myParentLastName\" referencedColumnName=\"lastName\")})'"
	 * @generated
	 */
	EList<Child> getChildren();

} // Parent