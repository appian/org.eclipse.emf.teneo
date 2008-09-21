/**
 * <copyright>
 * </copyright>
 *
 * $Id: PoliceChief.java,v 1.1 2008/09/21 18:35:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz245634;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Police Chief</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getPoliceChief()
 * @model
 * @generated
 */
public interface PoliceChief extends EObject {
	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief <em>Police Chief</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getPoliceChief_City()
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief
	 * @model opposite="policeChief"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

} // PoliceChief
