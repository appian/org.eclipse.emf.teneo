/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bar.java,v 1.1.2.1 2009/05/23 13:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.adept.Bar#getBaz <em>Baz</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getBar()
 * @model
 * @generated
 */
public interface Bar extends Baz {
	/**
	 * Returns the value of the '<em><b>Baz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baz</em>' reference.
	 * @see #setBaz(Baz)
	 * @see org.eclipse.emf.teneo.samples.issues.adept.Bz277570Package#getBar_Baz()
	 * @model
	 * @generated
	 */
	Baz getBaz();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.adept.Bar#getBaz <em>Baz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baz</em>' reference.
	 * @see #getBaz()
	 * @generated
	 */
	void setBaz(Baz value);

} // Bar
