/**
 * <copyright>
 * </copyright>
 *
 * $Id: Car.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;
import temporal.Temporal;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Car</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.Car#getNumPassengers <em>Num Passengers</em>}</li>
 * <li>{@link fleet.Car#getNumTires <em>Num Tires</em>}</li>
 * <li>{@link fleet.Car#getTires <em>Tires</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends PassengerVehicle, Vehicle, Temporal {
	/**
	 * Returns the value of the '<em><b>Num Passengers</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Passengers</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Num Passengers</em>' attribute.
	 * @see #setNumPassengers(int)
	 * @see fleet.FleetPackage#getCar_NumPassengers()
	 * @model
	 * @generated
	 */
	int getNumPassengers();

	/**
	 * Sets the value of the '{@link fleet.Car#getNumPassengers <em>Num Passengers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Num Passengers</em>' attribute.
	 * @see #getNumPassengers()
	 * @generated
	 */
	void setNumPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Num Tires</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Tires</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Num Tires</em>' attribute.
	 * @see #setNumTires(int)
	 * @see fleet.FleetPackage#getCar_NumTires()
	 * @model
	 * @generated
	 */
	int getNumTires();

	/**
	 * Sets the value of the '{@link fleet.Car#getNumTires <em>Num Tires</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Num Tires</em>' attribute.
	 * @see #getNumTires()
	 * @generated
	 */
	void setNumTires(int value);

	/**
	 * Returns the value of the '<em><b>Tires</b></em>' containment reference list. The list contents
	 * are of type {@link fleet.Tire}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tires</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tires</em>' containment reference list.
	 * @see fleet.FleetPackage#getCar_Tires()
	 * @model type="fleet.Tire" containment="true"
	 * @generated
	 */
	EList getTires();

} // Car
