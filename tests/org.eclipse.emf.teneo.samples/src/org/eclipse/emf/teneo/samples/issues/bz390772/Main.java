/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.issues.bz390772;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz390772.Main#getSecondary <em>Secondary</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz390772.Main#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz390772.Bz390772Package#getMain()
 * @model annotation="teneo.jpa value='@SecondaryTable(name=\"secondary\")'"
 * @generated
 */
public interface Main extends EObject {
	/**
	 * Returns the value of the '<em><b>Secondary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary</em>' reference.
	 * @see #setSecondary(Secondary)
	 * @see org.eclipse.emf.teneo.samples.issues.bz390772.Bz390772Package#getMain_Secondary()
	 * @model annotation="teneo.jpa value='@JoinColumn(table=\"secondary\", name=\"secondary_join\")'"
	 * @generated
	 */
	Secondary getSecondary();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz390772.Main#getSecondary <em>Secondary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary</em>' reference.
	 * @see #getSecondary()
	 * @generated
	 */
	void setSecondary(Secondary value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see org.eclipse.emf.teneo.samples.issues.bz390772.Bz390772Package#getMain_Test()
	 * @model annotation="teneo.jpa value='@Column(table=\"secondary\")'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz390772.Main#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

} // Main
