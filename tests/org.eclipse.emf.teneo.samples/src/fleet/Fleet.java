/**
 * <copyright>
 * </copyright>
 *
 * $Id: Fleet.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;
import temporal.Temporal;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fleet</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.Fleet#getId <em>Id</em>}</li>
 * <li>{@link fleet.Fleet#getVehicles <em>Vehicles</em>}</li>
 * <li>{@link fleet.Fleet#getVehicleInformation <em>Vehicle Information</em>}</li>
 * <li>{@link fleet.Fleet#getServiceGarage <em>Service Garage</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getFleet()
 * @model
 * @generated
 */
public interface Fleet extends Temporal {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fleet.FleetPackage#getFleet_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fleet.Fleet#getId <em>Id</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list. The list contents are of
	 * type {@link fleet.Vehicle}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicles</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see fleet.FleetPackage#getFleet_Vehicles()
	 * @model type="fleet.Vehicle"
	 * @generated
	 */
	EList getVehicles();

	/**
	 * Returns the value of the '<em><b>Vehicle Information</b></em>' containment reference list. The
	 * list contents are of type {@link fleet.VehicleInfo}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Information</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vehicle Information</em>' containment reference list.
	 * @see fleet.FleetPackage#getFleet_VehicleInformation()
	 * @model type="fleet.VehicleInfo" containment="true"
	 * @generated
	 */
	EList getVehicleInformation();

	/**
	 * Returns the value of the '<em><b>Service Garage</b></em>' reference. It is bidirectional and
	 * its opposite is '{@link fleet.Garage#getFleetsUsingGarage <em>Fleets Using Garage</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Garage</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Garage</em>' reference.
	 * @see #setServiceGarage(Garage)
	 * @see fleet.FleetPackage#getFleet_ServiceGarage()
	 * @see fleet.Garage#getFleetsUsingGarage
	 * @model opposite="fleetsUsingGarage"
	 * @generated
	 */
	Garage getServiceGarage();

	/**
	 * Sets the value of the '{@link fleet.Fleet#getServiceGarage <em>Service Garage</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Service Garage</em>' reference.
	 * @see #getServiceGarage()
	 * @generated
	 */
	void setServiceGarage(Garage value);

} // Fleet
