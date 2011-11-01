/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationTree.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nav.NavigationTree#getNavElement <em>Nav Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#getNavigationTree()
 * @model extendedMetaData="name='NavigationTree' kind='elementOnly'"
 * @generated
 */
public interface NavigationTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Nav Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.nav.NavElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Element</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.nav.NavPackage#getNavigationTree_NavElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nav-element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NavElement> getNavElement();

} // NavigationTree
