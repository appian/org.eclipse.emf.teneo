/**
 * <copyright>
 * </copyright>
 *
 * $Id: Manufacturer.java,v 1.2 2010/10/29 09:35:33 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufacturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.Manufacturer#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.rental.Manufacturer#getTrusted <em>Trusted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getManufacturer()
 * @model
 * @generated
 */
public interface Manufacturer extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getManufacturer_Code()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.Manufacturer#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Trusted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trusted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted</em>' attribute.
	 * @see #setTrusted(Boolean)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getManufacturer_Trusted()
	 * @model
	 * @generated
	 */
	Boolean getTrusted();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.Manufacturer#getTrusted <em>Trusted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted</em>' attribute.
	 * @see #getTrusted()
	 * @generated
	 */
	void setTrusted(Boolean value);

} // Manufacturer
