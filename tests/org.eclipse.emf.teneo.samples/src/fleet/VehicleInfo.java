/**
 * <copyright>
 * </copyright>
 *
 * $Id: VehicleInfo.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Vehicle Info</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.VehicleInfo#getAcquisitionDate <em>Acquisition Date</em>}</li>
 * <li>{@link fleet.VehicleInfo#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getVehicleInfo()
 * @model
 * @generated
 */
public interface VehicleInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Acquisition Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquisition Date</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Acquisition Date</em>' attribute.
	 * @see #setAcquisitionDate(Date)
	 * @see fleet.FleetPackage#getVehicleInfo_AcquisitionDate()
	 * @model required="true"
	 * @generated
	 */
	Date getAcquisitionDate();

	/**
	 * Sets the value of the '{@link fleet.VehicleInfo#getAcquisitionDate <em>Acquisition Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Acquisition Date</em>' attribute.
	 * @see #getAcquisitionDate()
	 * @generated
	 */
	void setAcquisitionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see fleet.FleetPackage#getVehicleInfo_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link fleet.VehicleInfo#getVehicle <em>Vehicle</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

} // VehicleInfo
