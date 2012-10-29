/**
 * <copyright>
 * </copyright>
 *
 * $Id: Vehicle.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Vehicle</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.Vehicle#getBrand <em>Brand</em>}</li>
 * <li>{@link fleet.Vehicle#getModel <em>Model</em>}</li>
 * <li>{@link fleet.Vehicle#getMake <em>Make</em>}</li>
 * <li>{@link fleet.Vehicle#getColor <em>Color</em>}</li>
 * <li>{@link fleet.Vehicle#getPlate <em>Plate</em>}</li>
 * <li>{@link fleet.Vehicle#getId <em>Id</em>}</li>
 * <li>{@link fleet.Vehicle#getYear <em>Year</em>}</li>
 * <li>{@link fleet.Vehicle#getLength <em>Length</em>}</li>
 * <li>{@link fleet.Vehicle#getAvailableColors <em>Available Colors</em>}</li>
 * <li>{@link fleet.Vehicle#getOwner <em>Owner</em>}</li>
 * <li>{@link fleet.Vehicle#getManufacturedAt <em>Manufactured At</em>}</li>
 * <li>{@link fleet.Vehicle#getTireSpec <em>Tire Spec</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see fleet.FleetPackage#getVehicle_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getBrand <em>Brand</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see fleet.FleetPackage#getVehicle_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getModel <em>Model</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Make</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Make</em>' attribute.
	 * @see #setMake(String)
	 * @see fleet.FleetPackage#getVehicle_Make()
	 * @model
	 * @generated
	 */
	String getMake();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getMake <em>Make</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Make</em>' attribute.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see fleet.FleetPackage#getVehicle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getColor <em>Color</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Plate</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plate</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Plate</em>' attribute.
	 * @see #setPlate(String)
	 * @see fleet.FleetPackage#getVehicle_Plate()
	 * @model
	 * @generated
	 */
	String getPlate();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getPlate <em>Plate</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Plate</em>' attribute.
	 * @see #getPlate()
	 * @generated
	 */
	void setPlate(String value);

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
	 * @see fleet.FleetPackage#getVehicle_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getId <em>Id</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see fleet.FleetPackage#getVehicle_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getYear <em>Year</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(long)
	 * @see fleet.FleetPackage#getVehicle_Length()
	 * @model
	 * @generated
	 */
	long getLength();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getLength <em>Length</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(long value);

	/**
	 * Returns the value of the '<em><b>Available Colors</b></em>' attribute list. The list contents
	 * are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Colors</em>' attribute list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Colors</em>' attribute list.
	 * @see fleet.FleetPackage#getVehicle_AvailableColors()
	 * @model
	 * @generated
	 */
	EList getAvailableColors();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Person)
	 * @see fleet.FleetPackage#getVehicle_Owner()
	 * @model containment="true"
	 * @generated
	 */
	Person getOwner();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Person value);

	/**
	 * Returns the value of the '<em><b>Manufactured At</b></em>' reference list. The list contents
	 * are of type {@link fleet.ManufacturingPlant}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufactured At</em>' reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Manufactured At</em>' reference list.
	 * @see fleet.FleetPackage#getVehicle_ManufacturedAt()
	 * @model type="fleet.ManufacturingPlant"
	 * @generated
	 */
	EList getManufacturedAt();

	/**
	 * Returns the value of the '<em><b>Tire Spec</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tire Spec</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Tire Spec</em>' reference.
	 * @see #setTireSpec(Tire)
	 * @see fleet.FleetPackage#getVehicle_TireSpec()
	 * @model
	 * @generated
	 */
	Tire getTireSpec();

	/**
	 * Sets the value of the '{@link fleet.Vehicle#getTireSpec <em>Tire Spec</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Tire Spec</em>' reference.
	 * @see #getTireSpec()
	 * @generated
	 */
	void setTireSpec(Tire value);

} // Vehicle
