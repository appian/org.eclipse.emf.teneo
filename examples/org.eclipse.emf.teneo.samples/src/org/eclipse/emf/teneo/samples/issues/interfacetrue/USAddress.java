/**
 * <copyright>
 * </copyright>
 *
 * $Id: USAddress.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.interfacetrue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.interfacetrue.USAddress#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage#getUSAddress()
 * @model extendedMetaData="name='USAddress' kind='elementOnly'"
 * @generated
 */
public interface USAddress extends Address{
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.eclipse.emf.teneo.samples.issues.interfacetrue.InterfacetruePackage#getUSAddress_State()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='state'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.interfacetrue.USAddress#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // USAddress
