/**
 * <copyright>
 * </copyright>
 *
 * $Id: USAddress.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip <em>Zip</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#getUSAddress()
 * @model extendedMetaData="name='USAddress' kind='elementOnly'"
 * @generated
 */
public interface USAddress extends Address {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"AK"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(USState)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#getUSAddress_State()
	 * @model default="AK" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='state'"
	 * @generated
	 */
	USState getState();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USState
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(USState value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(USState)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(USState)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip</em>' attribute.
	 * @see #isSetZip()
	 * @see #unsetZip()
	 * @see #setZip(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage#getUSAddress_Zip()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='zip'"
	 * @generated
	 */
	BigInteger getZip();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip</em>' attribute.
	 * @see #isSetZip()
	 * @see #unsetZip()
	 * @see #getZip()
	 * @generated
	 */
	void setZip(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip <em>Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZip()
	 * @see #getZip()
	 * @see #setZip(BigInteger)
	 * @generated
	 */
	void unsetZip();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.USAddress#getZip <em>Zip</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zip</em>' attribute is set.
	 * @see #unsetZip()
	 * @see #getZip()
	 * @see #setZip(BigInteger)
	 * @generated
	 */
	boolean isSetZip();

} // USAddress
