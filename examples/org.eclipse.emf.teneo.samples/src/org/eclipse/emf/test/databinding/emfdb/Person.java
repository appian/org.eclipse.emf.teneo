/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2009/08/23 16:04:41 mtaal Exp $
 */
package org.eclipse.emf.test.databinding.emfdb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.databinding.emfdb.Person#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.eclipse.emf.test.databinding.emfdb.Person#getParents <em>Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.test.databinding.emfdb.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getPerson_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.test.databinding.emfdb.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.eclipse.emf.test.databinding.emfdb.EmfdbPackage#getPerson_Parents()
	 * @model
	 * @generated
	 */
	EList<Person> getParents();

} // Person
