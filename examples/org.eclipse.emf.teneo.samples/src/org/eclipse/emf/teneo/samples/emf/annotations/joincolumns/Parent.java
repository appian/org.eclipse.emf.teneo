/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parent.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
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
 *   <li>{@link org.eclipse.emf.teneo.samples.annotations.joincolumns.Parent#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.annotations.joincolumns.CompositeidPackage#getParent()
 * @model
 * @generated
 */
public interface Parent extends Person {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.annotations.joincolumns.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.annotations.joincolumns.CompositeidPackage#getParent_Children()
	 * @model type="compositeid.Child"
	 *        annotation="http://annotation.elver.org/JoinColumns value='jc1 jc2'"
	 *        annotation="http://annotation.elver.org/JoinColumn/jc1 name='myParentFirstName' referencedColumnName='firstName'"
	 *        annotation="http://annotation.elver.org/JoinColumn/jc2 name='myParentLastName' referencedColumnName='lastName'"
	 *        annotation="http://annotation.elver.org/OrderBy value='firstName'"
	 * @generated
	 */
	EList getChildren();

} // Parent
