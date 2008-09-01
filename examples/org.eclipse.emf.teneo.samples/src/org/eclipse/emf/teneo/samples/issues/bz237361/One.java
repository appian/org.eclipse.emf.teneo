/**
 * <copyright>
 * </copyright>
 *
 * $Id: One.java,v 1.2 2008/09/01 13:39:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237361;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.One#getManies <em>Manies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package#getOne()
 * @model
 * @generated
 */
public interface One extends EObject {
	/**
	 * Returns the value of the '<em><b>Manies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.bz237361.Many}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manies</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package#getOne_Manies()
	 * @see org.eclipse.emf.teneo.samples.issues.bz237361.Many#getOne
	 * @model opposite="one" resolveProxies="false"
	 *        annotation="teneo.jpa value='@OneToMany(indexed=false, mappedBy=\"one\")\n@JoinTable(name=\"maniesofone\")'"
	 * @generated
	 */
	EList<Many> getManies();

} // One
