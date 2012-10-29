/**
 * <copyright>
 * </copyright>
 *
 * $Id: USAddress.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>US Address</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.USAddress#getZipCode <em>Zip Code</em>}</li>
 * <li>{@link fleet.USAddress#getState <em>State</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getUSAddress()
 * @model
 * @generated
 */
public interface USAddress extends Address {
	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see fleet.FleetPackage#getUSAddress_ZipCode()
	 * @model
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link fleet.USAddress#getZipCode <em>Zip Code</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see fleet.FleetPackage#getUSAddress_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link fleet.USAddress#getState <em>State</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // USAddress
