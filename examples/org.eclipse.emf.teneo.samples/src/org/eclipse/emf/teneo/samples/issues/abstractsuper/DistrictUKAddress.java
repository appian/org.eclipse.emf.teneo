/**
 * <copyright>
 * </copyright>
 *
 * $Id: DistrictUKAddress.java,v 1.1 2008/03/10 22:19:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.abstractsuper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>District UK Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress#getDistrict <em>District</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage#getDistrictUKAddress()
 * @model extendedMetaData="name='DistrictUKAddress' kind='elementOnly'"
 * @generated
 */
public interface DistrictUKAddress extends UKAddress {
	/**
	 * Returns the value of the '<em><b>District</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>District</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>District</em>' attribute.
	 * @see #isSetDistrict()
	 * @see #unsetDistrict()
	 * @see #setDistrict(String)
	 * @see org.eclipse.emf.teneo.samples.issues.abstractsuper.AbstractsuperPackage#getDistrictUKAddress_District()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='district'"
	 * @generated
	 */
	String getDistrict();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>District</em>' attribute.
	 * @see #isSetDistrict()
	 * @see #unsetDistrict()
	 * @see #getDistrict()
	 * @generated
	 */
	void setDistrict(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress#getDistrict <em>District</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistrict()
	 * @see #getDistrict()
	 * @see #setDistrict(String)
	 * @generated
	 */
	void unsetDistrict();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.issues.abstractsuper.DistrictUKAddress#getDistrict <em>District</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>District</em>' attribute is set.
	 * @see #unsetDistrict()
	 * @see #getDistrict()
	 * @see #setDistrict(String)
	 * @generated
	 */
	boolean isSetDistrict();

} // DistrictUKAddress
