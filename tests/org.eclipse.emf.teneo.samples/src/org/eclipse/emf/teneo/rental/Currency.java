/**
 * <copyright>
 * </copyright>
 *
 * $Id: Currency.java,v 1.1 2007/03/29 14:59:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.rental;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Currency</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.rental.Currency#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.rental.RentalPackage#getCurrency()
 * @model
 * @generated
 */
public interface Currency extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.rental.RentalPackage#getCurrency_Code()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.rental.Currency#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Currency
