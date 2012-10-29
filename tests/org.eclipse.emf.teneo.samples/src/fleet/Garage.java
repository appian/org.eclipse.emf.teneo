/**
 * <copyright>
 * </copyright>
 *
 * $Id: Garage.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;

import temporal.Temporal;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Garage</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.Garage#getVehicles <em>Vehicles</em>}</li>
 * <li>{@link fleet.Garage#getCustomerShuttles <em>Customer Shuttles</em>}</li>
 * <li>{@link fleet.Garage#getAddress <em>Address</em>}</li>
 * <li>{@link fleet.Garage#getFleetsUsingGarage <em>Fleets Using Garage</em>}</li>
 * <li>{@link fleet.Garage#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getGarage()
 * @model
 * @generated
 */
public interface Garage extends Temporal {
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
	 * @see fleet.FleetPackage#getGarage_Vehicles()
	 * @model type="fleet.Vehicle"
	 * @generated
	 */
	EList getVehicles();

	/**
	 * Returns the value of the '<em><b>Customer Shuttles</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Shuttles</em>' reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Customer Shuttles</em>' containment reference.
	 * @see #setCustomerShuttles(Fleet)
	 * @see fleet.FleetPackage#getGarage_CustomerShuttles()
	 * @model containment="true"
	 * @generated
	 */
	Fleet getCustomerShuttles();

	/**
	 * Sets the value of the '{@link fleet.Garage#getCustomerShuttles <em>Customer Shuttles</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Customer Shuttles</em>' containment reference.
	 * @see #getCustomerShuttles()
	 * @generated
	 */
	void setCustomerShuttles(Fleet value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see fleet.FleetPackage#getGarage_Address()
	 * @model containment="true"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link fleet.Garage#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Fleets Using Garage</b></em>' reference list. The list
	 * contents are of type {@link fleet.Fleet}. It is bidirectional and its opposite is '
	 * {@link fleet.Fleet#getServiceGarage <em>Service Garage</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fleets Using Garage</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fleets Using Garage</em>' reference list.
	 * @see fleet.FleetPackage#getGarage_FleetsUsingGarage()
	 * @see fleet.Fleet#getServiceGarage
	 * @model type="fleet.Fleet" opposite="serviceGarage"
	 * @generated
	 */
	EList getFleetsUsingGarage();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fleet.FleetPackage#getGarage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fleet.Garage#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Garage
