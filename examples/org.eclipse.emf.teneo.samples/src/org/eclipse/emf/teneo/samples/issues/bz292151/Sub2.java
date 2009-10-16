/**
 * <copyright>
 * </copyright>
 *
 * $Id: Sub2.java,v 1.2 2009/10/16 09:32:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub2#getA1 <em>A1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package#getSub2()
 * @model
 * @generated
 */
public interface Sub2 extends Base {
	/**
	 * Returns the value of the '<em><b>A1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A1</em>' reference.
	 * @see #setA1(Sub1)
	 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package#getSub2_A1()
	 * @model
	 * @generated
	 */
	Sub1 getA1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz292151.Sub2#getA1 <em>A1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A1</em>' reference.
	 * @see #getA1()
	 * @generated
	 */
	void setA1(Sub1 value);

} // Sub2
