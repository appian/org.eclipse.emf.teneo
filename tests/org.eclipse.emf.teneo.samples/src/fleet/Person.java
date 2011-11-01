/**
 * <copyright>
 * </copyright>
 *
 * $Id: Person.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;

import temporal.Temporal;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fleet.Person#getId <em>Id</em>}</li>
 *   <li>{@link fleet.Person#getName <em>Name</em>}</li>
 *   <li>{@link fleet.Person#isEmployed <em>Employed</em>}</li>
 *   <li>{@link fleet.Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link fleet.Person#getOwnedVehicles <em>Owned Vehicles</em>}</li>
 *   <li>{@link fleet.Person#getBirthAddress <em>Birth Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see fleet.FleetPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Temporal {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fleet.FleetPackage#getPerson_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fleet.Person#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fleet.FleetPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fleet.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employed</em>' attribute.
	 * @see #setEmployed(boolean)
	 * @see fleet.FleetPackage#getPerson_Employed()
	 * @model
	 * @generated
	 */
	boolean isEmployed();

	/**
	 * Sets the value of the '{@link fleet.Person#isEmployed <em>Employed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employed</em>' attribute.
	 * @see #isEmployed()
	 * @generated
	 */
	void setEmployed(boolean value);

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
	 * The list contents are of type {@link fleet.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference list.
	 * @see fleet.FleetPackage#getPerson_Addresses()
	 * @model type="fleet.Address" containment="true"
	 * @generated
	 */
	EList getAddresses();

	/**
	 * Returns the value of the '<em><b>Owned Vehicles</b></em>' reference list.
	 * The list contents are of type {@link fleet.VehicleInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Vehicles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Vehicles</em>' reference list.
	 * @see fleet.FleetPackage#getPerson_OwnedVehicles()
	 * @model type="fleet.VehicleInfo"
	 * @generated
	 */
	EList getOwnedVehicles();

	/**
	 * Returns the value of the '<em><b>Birth Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Address</em>' containment reference.
	 * @see #setBirthAddress(Address)
	 * @see fleet.FleetPackage#getPerson_BirthAddress()
	 * @model containment="true"
	 * @generated
	 */
	Address getBirthAddress();

	/**
	 * Sets the value of the '{@link fleet.Person#getBirthAddress <em>Birth Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Address</em>' containment reference.
	 * @see #getBirthAddress()
	 * @generated
	 */
	void setBirthAddress(Address value);

} // Person
