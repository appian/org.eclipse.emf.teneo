/**
 * <copyright>
 * </copyright>
 *
 * $Id: City.java,v 1.1 2008/09/21 18:35:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz245634;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor <em>Mayor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief <em>Police Chief</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Mayor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mayor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mayor</em>' reference.
	 * @see #setMayor(Mayor)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getCity_Mayor()
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Mayor#getCity
	 * @model opposite="city"
	 * @generated
	 */
	Mayor getMayor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getMayor <em>Mayor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mayor</em>' reference.
	 * @see #getMayor()
	 * @generated
	 */
	void setMayor(Mayor value);

	/**
	 * Returns the value of the '<em><b>Police Chief</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Police Chief</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Police Chief</em>' reference.
	 * @see #setPoliceChief(PoliceChief)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getCity_PoliceChief()
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.PoliceChief#getCity
	 * @model opposite="city"
	 * @generated
	 */
	PoliceChief getPoliceChief();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getPoliceChief <em>Police Chief</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Police Chief</em>' reference.
	 * @see #getPoliceChief()
	 * @generated
	 */
	void setPoliceChief(PoliceChief value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getCity_Id()
	 * @model required="true"
	 *        annotation="teneo.jpa value='@Id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see org.eclipse.emf.teneo.samples.issues.bz245634.Bz245634Package#getCity_Country()
	 * @model
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.bz245634.City#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

} // City
