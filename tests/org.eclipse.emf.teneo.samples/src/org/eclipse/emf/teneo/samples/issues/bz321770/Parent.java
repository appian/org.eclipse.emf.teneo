/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parent.java,v 1.1 2010/08/18 13:40:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321770;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz321770.Parent#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package#getParent()
 * @model extendedMetaData="name='Parent' kind='elementOnly'"
 * @generated
 */
public interface Parent extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz321770.Child}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz321770.Bz321770Package#getParent_Child()
	 * @model containment="true" required="true"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@OrderBy\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='Child'"
	 * @generated
	 */
	EList<Child> getChild();

} // Parent
