/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransportationDevice.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportation Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fleet.TransportationDevice#getManufacturedBy <em>Manufactured By</em>}</li>
 *   <li>{@link fleet.TransportationDevice#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see fleet.FleetPackage#getTransportationDevice()
 * @model
 * @generated
 */
public interface TransportationDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Manufactured By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufactured By</em>' attribute.
	 * @see #setManufacturedBy(String)
	 * @see fleet.FleetPackage#getTransportationDevice_ManufacturedBy()
	 * @model
	 * @generated
	 */
	String getManufacturedBy();

	/**
	 * Sets the value of the '{@link fleet.TransportationDevice#getManufacturedBy <em>Manufactured By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufactured By</em>' attribute.
	 * @see #getManufacturedBy()
	 * @generated
	 */
	void setManufacturedBy(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see fleet.FleetPackage#getTransportationDevice_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link fleet.TransportationDevice#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // TransportationDevice
