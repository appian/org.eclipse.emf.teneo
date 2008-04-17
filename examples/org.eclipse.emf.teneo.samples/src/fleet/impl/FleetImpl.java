/**
 * <copyright>
 * </copyright>
 *
 * $Id: FleetImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Fleet;
import fleet.FleetPackage;

import fleet.Garage;
import fleet.Vehicle;
import fleet.VehicleInfo;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import temporal.impl.TemporalImpl;
import temporal.mod.TemporalBaseEObjectImpl;

import org.eclipse.emf.ecore.impl.DynamicEStoreEObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fleet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.FleetImpl#getId <em>Id</em>}</li>
 *   <li>{@link fleet.impl.FleetImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link fleet.impl.FleetImpl#getVehicleInformation <em>Vehicle Information</em>}</li>
 *   <li>{@link fleet.impl.FleetImpl#getServiceGarage <em>Service Garage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FleetImpl extends TemporalImpl implements Fleet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FleetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.FLEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(FleetPackage.Literals.FLEET__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(FleetPackage.Literals.FLEET__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getVehicles() {
		return (EList)eGet(FleetPackage.Literals.FLEET__VEHICLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getVehicleInformation() {
		return (EList)eGet(FleetPackage.Literals.FLEET__VEHICLE_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garage getServiceGarage() {
		return (Garage)eGet(FleetPackage.Literals.FLEET__SERVICE_GARAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceGarage(Garage newServiceGarage) {
		eSet(FleetPackage.Literals.FLEET__SERVICE_GARAGE, newServiceGarage);
	}

} //FleetImpl
