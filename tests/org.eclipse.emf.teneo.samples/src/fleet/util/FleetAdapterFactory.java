/**
 * <copyright>
 * </copyright>
 *
 * $Id: FleetAdapterFactory.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.util;

import fleet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import temporal.Temporal;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fleet.FleetPackage
 * @generated
 */
public class FleetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FleetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FleetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FleetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FleetSwitch modelSwitch =
		new FleetSwitch() {
			public Object caseVehicle(Vehicle object) {
				return createVehicleAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object caseAddress(Address object) {
				return createAddressAdapter();
			}
			public Object caseVehicleInfo(VehicleInfo object) {
				return createVehicleInfoAdapter();
			}
			public Object caseManufacturingPlant(ManufacturingPlant object) {
				return createManufacturingPlantAdapter();
			}
			public Object caseFleet(Fleet object) {
				return createFleetAdapter();
			}
			public Object caseGarage(Garage object) {
				return createGarageAdapter();
			}
			public Object caseTire(Tire object) {
				return createTireAdapter();
			}
			public Object caseHybrid(Hybrid object) {
				return createHybridAdapter();
			}
			public Object caseCar(Car object) {
				return createCarAdapter();
			}
			public Object casePassengerVehicle(PassengerVehicle object) {
				return createPassengerVehicleAdapter();
			}
			public Object caseEngineFactory(EngineFactory object) {
				return createEngineFactoryAdapter();
			}
			public Object caseUSAddress(USAddress object) {
				return createUSAddressAdapter();
			}
			public Object caseVin(Vin object) {
				return createVinAdapter();
			}
			public Object caseTransportationDevice(TransportationDevice object) {
				return createTransportationDeviceAdapter();
			}
			public Object caseTemporal(Temporal object) {
				return createTemporalAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fleet.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.VehicleInfo <em>Vehicle Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.VehicleInfo
	 * @generated
	 */
	public Adapter createVehicleInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.ManufacturingPlant <em>Manufacturing Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.ManufacturingPlant
	 * @generated
	 */
	public Adapter createManufacturingPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Fleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Fleet
	 * @generated
	 */
	public Adapter createFleetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Garage <em>Garage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Garage
	 * @generated
	 */
	public Adapter createGarageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Tire <em>Tire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Tire
	 * @generated
	 */
	public Adapter createTireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Hybrid <em>Hybrid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Hybrid
	 * @generated
	 */
	public Adapter createHybridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Car
	 * @generated
	 */
	public Adapter createCarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.PassengerVehicle <em>Passenger Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.PassengerVehicle
	 * @generated
	 */
	public Adapter createPassengerVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.EngineFactory <em>Engine Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.EngineFactory
	 * @generated
	 */
	public Adapter createEngineFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.USAddress
	 * @generated
	 */
	public Adapter createUSAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.Vin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.Vin
	 * @generated
	 */
	public Adapter createVinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fleet.TransportationDevice <em>Transportation Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fleet.TransportationDevice
	 * @generated
	 */
	public Adapter createTransportationDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link temporal.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see temporal.Temporal
	 * @generated
	 */
	public Adapter createTemporalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FleetAdapterFactory
