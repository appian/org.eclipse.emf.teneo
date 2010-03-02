/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestType.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.NotTransientType;
import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.TransientType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getTransientReference <em>Transient Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getNotTransientReference <em>Not Transient Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Package#getTestType()
 * @model
 * @generated
 */
public interface TestType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Reference</em>' reference.
	 * @see #setTransientReference(TransientType)
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Package#getTestType_TransientReference()
	 * @model
	 * @generated
	 */
	TransientType getTransientReference();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getTransientReference <em>Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Reference</em>' reference.
	 * @see #getTransientReference()
	 * @generated
	 */
	void setTransientReference(TransientType value);

	/**
	 * Returns the value of the '<em><b>Not Transient Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Transient Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Transient Reference</em>' reference.
	 * @see #setNotTransientReference(NotTransientType)
	 * @see org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.Bz302933_1Package#getTestType_NotTransientReference()
	 * @model ordered="false"
	 *        annotation="teneo.jpa value='@Transient'"
	 * @generated
	 */
	NotTransientType getNotTransientReference();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.TestType#getNotTransientReference <em>Not Transient Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Transient Reference</em>' reference.
	 * @see #getNotTransientReference()
	 * @generated
	 */
	void setNotTransientReference(NotTransientType value);

} // TestType
