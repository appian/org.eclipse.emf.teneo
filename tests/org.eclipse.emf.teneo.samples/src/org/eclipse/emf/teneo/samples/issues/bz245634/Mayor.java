/**
 * <copyright>
 * </copyright>
 *
 * $Id: Mayor.java,v 1.1 2008/09/21 18:35:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz245634;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mayor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getMayor()
 * @model
 * @generated
 */
public interface Mayor extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor <em>Mayor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getMayor_City()
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor
	 * @model opposite="mayor"
	 *        annotation="teneo.jpa value='@OneToOne(fetch=LAZY, mappedBy=\"mayor\")'"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

} // Mayor
