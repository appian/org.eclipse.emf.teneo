/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bar.java,v 1.1 2009/10/02 07:47:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz290969;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz290969.Bar#getBarKeys <em>Bar Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package#getBar()
 * @model annotation="teneo.jpa appinfo='@Entity(name=\"BarEntity\")'"
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Bar Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz290969.BarKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bar Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar Keys</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz290969.Bz290969Package#getBar_BarKeys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BarKey> getBarKeys();

} // Bar
