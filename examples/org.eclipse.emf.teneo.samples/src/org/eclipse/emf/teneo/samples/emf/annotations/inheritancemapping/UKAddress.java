/**
 * <copyright>
 * </copyright>
 *
 * $Id: UKAddress.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UK Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress#getPostcode <em>Postcode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#getUKAddress()
 * @model extendedMetaData="name='UKAddress' kind='elementOnly'"
 * @generated
 */
public interface UKAddress extends Address {
	/**
	 * Returns the value of the '<em><b>Postcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcode</em>' attribute.
	 * @see #setPostcode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#getUKAddress_Postcode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='postcode'"
	 * @generated
	 */
	String getPostcode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.UKAddress#getPostcode <em>Postcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcode</em>' attribute.
	 * @see #getPostcode()
	 * @generated
	 */
	void setPostcode(String value);

} // UKAddress
