/**
 * <copyright>
 * </copyright>
 *
 * $Id: VehicleInfoImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.Vehicle;
import fleet.VehicleInfo;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.VehicleInfoImpl#getAcquisitionDate <em>Acquisition Date</em>}</li>
 *   <li>{@link fleet.impl.VehicleInfoImpl#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleInfoImpl extends TemporalBaseEObjectImpl implements VehicleInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.VEHICLE_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAcquisitionDate() {
		return (Date)eGet(FleetPackage.Literals.VEHICLE_INFO__ACQUISITION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquisitionDate(Date newAcquisitionDate) {
		eSet(FleetPackage.Literals.VEHICLE_INFO__ACQUISITION_DATE, newAcquisitionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		return (Vehicle)eGet(FleetPackage.Literals.VEHICLE_INFO__VEHICLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		eSet(FleetPackage.Literals.VEHICLE_INFO__VEHICLE, newVehicle);
	}

} //VehicleInfoImpl
