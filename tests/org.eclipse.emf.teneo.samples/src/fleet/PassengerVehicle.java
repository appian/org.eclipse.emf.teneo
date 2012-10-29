/**
 * <copyright>
 * </copyright>
 *
 * $Id: PassengerVehicle.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Passenger Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.PassengerVehicle#getPassengerName <em>Passenger Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getPassengerVehicle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PassengerVehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Name</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Passenger Name</em>' attribute.
	 * @see #setPassengerName(String)
	 * @see fleet.FleetPackage#getPassengerVehicle_PassengerName()
	 * @model
	 * @generated
	 */
	String getPassengerName();

	/**
	 * Sets the value of the '{@link fleet.PassengerVehicle#getPassengerName <em>Passenger Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Passenger Name</em>' attribute.
	 * @see #getPassengerName()
	 * @generated
	 */
	void setPassengerName(String value);

} // PassengerVehicle
