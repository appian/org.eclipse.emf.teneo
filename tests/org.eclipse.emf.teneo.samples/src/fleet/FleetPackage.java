/**
 * <copyright>
 * </copyright>
 *
 * $Id: FleetPackage.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import temporal.TemporalPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fleet.FleetFactory
 * @model kind="package"
 * @generated
 */
public interface FleetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fleet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fleet.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fleet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FleetPackage eINSTANCE = fleet.impl.FleetPackageImpl.init();

	/**
	 * The meta object id for the '{@link fleet.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.VehicleImpl
	 * @see fleet.impl.FleetPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__BRAND = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MAKE = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__PLATE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__YEAR = 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__LENGTH = 7;

	/**
	 * The feature id for the '<em><b>Available Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__AVAILABLE_COLORS = 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__OWNER = 9;

	/**
	 * The feature id for the '<em><b>Manufactured At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__MANUFACTURED_AT = 10;

	/**
	 * The feature id for the '<em><b>Tire Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TIRE_SPEC = 11;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link fleet.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.PersonImpl
	 * @see fleet.impl.FleetPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE = TemporalPackage.TEMPORAL__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TOUCHED_ATTRIBUTES = TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTINUITY = TemporalPackage.TEMPORAL__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VERSION_HOLDER = TemporalPackage.TEMPORAL__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VERSION_HOLDER_CONTAINMENT = TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = TemporalPackage.TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = TemporalPackage.TEMPORAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Employed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYED = TemporalPackage.TEMPORAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ADDRESSES = TemporalPackage.TEMPORAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OWNED_VEHICLES = TemporalPackage.TEMPORAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Birth Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_ADDRESS = TemporalPackage.TEMPORAL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = TemporalPackage.TEMPORAL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fleet.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.AddressImpl
	 * @see fleet.impl.FleetPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__DATE = TemporalPackage.TEMPORAL__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TOUCHED_ATTRIBUTES = TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CONTINUITY = TemporalPackage.TEMPORAL__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VERSION_HOLDER = TemporalPackage.TEMPORAL__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__VERSION_HOLDER_CONTAINMENT = TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NAME = TemporalPackage.TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET_NUMBER = TemporalPackage.TEMPORAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = TemporalPackage.TEMPORAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = TemporalPackage.TEMPORAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = TemporalPackage.TEMPORAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fleet.impl.VehicleInfoImpl <em>Vehicle Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.VehicleInfoImpl
	 * @see fleet.impl.FleetPackageImpl#getVehicleInfo()
	 * @generated
	 */
	int VEHICLE_INFO = 3;

	/**
	 * The feature id for the '<em><b>Acquisition Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__ACQUISITION_DATE = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO__VEHICLE = 1;

	/**
	 * The number of structural features of the '<em>Vehicle Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fleet.impl.ManufacturingPlantImpl <em>Manufacturing Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.ManufacturingPlantImpl
	 * @see fleet.impl.FleetPackageImpl#getManufacturingPlant()
	 * @generated
	 */
	int MANUFACTURING_PLANT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_PLANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_PLANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_PLANT__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Transport Fleet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_PLANT__TRANSPORT_FLEET = 3;

	/**
	 * The number of structural features of the '<em>Manufacturing Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_PLANT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fleet.impl.FleetImpl <em>Fleet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.FleetImpl
	 * @see fleet.impl.FleetPackageImpl#getFleet()
	 * @generated
	 */
	int FLEET = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__DATE = TemporalPackage.TEMPORAL__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__TOUCHED_ATTRIBUTES = TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__CONTINUITY = TemporalPackage.TEMPORAL__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VERSION_HOLDER = TemporalPackage.TEMPORAL__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VERSION_HOLDER_CONTAINMENT = TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__ID = TemporalPackage.TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VEHICLES = TemporalPackage.TEMPORAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vehicle Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VEHICLE_INFORMATION = TemporalPackage.TEMPORAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Garage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__SERVICE_GARAGE = TemporalPackage.TEMPORAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fleet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_FEATURE_COUNT = TemporalPackage.TEMPORAL_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link fleet.impl.GarageImpl <em>Garage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.GarageImpl
	 * @see fleet.impl.FleetPackageImpl#getGarage()
	 * @generated
	 */
	int GARAGE = 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__DATE = TemporalPackage.TEMPORAL__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__TOUCHED_ATTRIBUTES = TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__CONTINUITY = TemporalPackage.TEMPORAL__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__VERSION_HOLDER = TemporalPackage.TEMPORAL__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__VERSION_HOLDER_CONTAINMENT = TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__VEHICLES = TemporalPackage.TEMPORAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Shuttles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__CUSTOMER_SHUTTLES = TemporalPackage.TEMPORAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__ADDRESS = TemporalPackage.TEMPORAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fleets Using Garage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__FLEETS_USING_GARAGE = TemporalPackage.TEMPORAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE__NAME = TemporalPackage.TEMPORAL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Garage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARAGE_FEATURE_COUNT = TemporalPackage.TEMPORAL_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fleet.impl.TireImpl <em>Tire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.TireImpl
	 * @see fleet.impl.FleetPackageImpl#getTire()
	 * @generated
	 */
	int TIRE = 7;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE__RADIUS = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE__PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE__MAKE = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Tire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIRE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fleet.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.CarImpl
	 * @see fleet.impl.FleetPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 9;

	/**
	 * The meta object id for the '{@link fleet.impl.HybridImpl <em>Hybrid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.HybridImpl
	 * @see fleet.impl.FleetPackageImpl#getHybrid()
	 * @generated
	 */
	int HYBRID = 8;

	/**
	 * The meta object id for the '{@link fleet.PassengerVehicle <em>Passenger Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.PassengerVehicle
	 * @see fleet.impl.FleetPackageImpl#getPassengerVehicle()
	 * @generated
	 */
	int PASSENGER_VEHICLE = 10;

	/**
	 * The feature id for the '<em><b>Passenger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_VEHICLE__PASSENGER_NAME = 0;

	/**
	 * The number of structural features of the '<em>Passenger Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_VEHICLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Passenger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PASSENGER_NAME = PASSENGER_VEHICLE__PASSENGER_NAME;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__BRAND = PASSENGER_VEHICLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MODEL = PASSENGER_VEHICLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MAKE = PASSENGER_VEHICLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__COLOR = PASSENGER_VEHICLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PLATE = PASSENGER_VEHICLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ID = PASSENGER_VEHICLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__YEAR = PASSENGER_VEHICLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__LENGTH = PASSENGER_VEHICLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Available Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__AVAILABLE_COLORS = PASSENGER_VEHICLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__OWNER = PASSENGER_VEHICLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Manufactured At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__MANUFACTURED_AT = PASSENGER_VEHICLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tire Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__TIRE_SPEC = PASSENGER_VEHICLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__DATE = PASSENGER_VEHICLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__TOUCHED_ATTRIBUTES = PASSENGER_VEHICLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__CONTINUITY = PASSENGER_VEHICLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__VERSION_HOLDER = PASSENGER_VEHICLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__VERSION_HOLDER_CONTAINMENT = PASSENGER_VEHICLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Num Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NUM_PASSENGERS = PASSENGER_VEHICLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Num Tires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NUM_TIRES = PASSENGER_VEHICLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__TIRES = PASSENGER_VEHICLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = PASSENGER_VEHICLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Passenger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__PASSENGER_NAME = CAR__PASSENGER_NAME;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__BRAND = CAR__BRAND;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__MODEL = CAR__MODEL;

	/**
	 * The feature id for the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__MAKE = CAR__MAKE;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__COLOR = CAR__COLOR;

	/**
	 * The feature id for the '<em><b>Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__PLATE = CAR__PLATE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__ID = CAR__ID;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__YEAR = CAR__YEAR;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__LENGTH = CAR__LENGTH;

	/**
	 * The feature id for the '<em><b>Available Colors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__AVAILABLE_COLORS = CAR__AVAILABLE_COLORS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__OWNER = CAR__OWNER;

	/**
	 * The feature id for the '<em><b>Manufactured At</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__MANUFACTURED_AT = CAR__MANUFACTURED_AT;

	/**
	 * The feature id for the '<em><b>Tire Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__TIRE_SPEC = CAR__TIRE_SPEC;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__DATE = CAR__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__TOUCHED_ATTRIBUTES = CAR__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__CONTINUITY = CAR__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__VERSION_HOLDER = CAR__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__VERSION_HOLDER_CONTAINMENT = CAR__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Num Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__NUM_PASSENGERS = CAR__NUM_PASSENGERS;

	/**
	 * The feature id for the '<em><b>Num Tires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__NUM_TIRES = CAR__NUM_TIRES;

	/**
	 * The feature id for the '<em><b>Tires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__TIRES = CAR__TIRES;

	/**
	 * The feature id for the '<em><b>Has Recharge Plug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__HAS_RECHARGE_PLUG = CAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Battery Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID__BATTERY_LIFE = CAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hybrid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_FEATURE_COUNT = CAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fleet.impl.EngineFactoryImpl <em>Engine Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.EngineFactoryImpl
	 * @see fleet.impl.FleetPackageImpl#getEngineFactory()
	 * @generated
	 */
	int ENGINE_FACTORY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__ID = MANUFACTURING_PLANT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__NAME = MANUFACTURING_PLANT__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__ADDRESS = MANUFACTURING_PLANT__ADDRESS;

	/**
	 * The feature id for the '<em><b>Transport Fleet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__TRANSPORT_FLEET = MANUFACTURING_PLANT__TRANSPORT_FLEET;

	/**
	 * The feature id for the '<em><b>Makes Diesel Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__MAKES_DIESEL_ENGINES = MANUFACTURING_PLANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Brands</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY__BRANDS = MANUFACTURING_PLANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Engine Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_FACTORY_FEATURE_COUNT = MANUFACTURING_PLANT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fleet.impl.USAddressImpl <em>US Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.USAddressImpl
	 * @see fleet.impl.FleetPackageImpl#getUSAddress()
	 * @generated
	 */
	int US_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__DATE = ADDRESS__DATE;

	/**
	 * The feature id for the '<em><b>Touched Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__TOUCHED_ATTRIBUTES = ADDRESS__TOUCHED_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Continuity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__CONTINUITY = ADDRESS__CONTINUITY;

	/**
	 * The feature id for the '<em><b>Version Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__VERSION_HOLDER = ADDRESS__VERSION_HOLDER;

	/**
	 * The feature id for the '<em><b>Version Holder Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__VERSION_HOLDER_CONTAINMENT = ADDRESS__VERSION_HOLDER_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Street Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STREET_NAME = ADDRESS__STREET_NAME;

	/**
	 * The feature id for the '<em><b>Street Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STREET_NUMBER = ADDRESS__STREET_NUMBER;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__COUNTRY = ADDRESS__COUNTRY;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__ZIP_CODE = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS__STATE = ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>US Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fleet.impl.VinImpl <em>Vin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.VinImpl
	 * @see fleet.impl.FleetPackageImpl#getVin()
	 * @generated
	 */
	int VIN = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Installation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN__INSTALLATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN__VEHICLE = 2;

	/**
	 * The number of structural features of the '<em>Vin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fleet.impl.TransportationDeviceImpl <em>Transportation Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fleet.impl.TransportationDeviceImpl
	 * @see fleet.impl.FleetPackageImpl#getTransportationDevice()
	 * @generated
	 */
	int TRANSPORTATION_DEVICE = 14;

	/**
	 * The feature id for the '<em><b>Manufactured By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_DEVICE__MANUFACTURED_BY = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_DEVICE__YEAR = 1;

	/**
	 * The number of structural features of the '<em>Transportation Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_DEVICE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link fleet.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see fleet.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see fleet.Vehicle#getBrand()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Brand();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see fleet.Vehicle#getModel()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Model();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see fleet.Vehicle#getMake()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Make();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fleet.Vehicle#getColor()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Color();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getPlate <em>Plate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plate</em>'.
	 * @see fleet.Vehicle#getPlate()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Plate();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fleet.Vehicle#getId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Id();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see fleet.Vehicle#getYear()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Year();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vehicle#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see fleet.Vehicle#getLength()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Length();

	/**
	 * Returns the meta object for the attribute list '{@link fleet.Vehicle#getAvailableColors <em>Available Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available Colors</em>'.
	 * @see fleet.Vehicle#getAvailableColors()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_AvailableColors();

	/**
	 * Returns the meta object for the containment reference '{@link fleet.Vehicle#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see fleet.Vehicle#getOwner()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Owner();

	/**
	 * Returns the meta object for the reference list '{@link fleet.Vehicle#getManufacturedAt <em>Manufactured At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manufactured At</em>'.
	 * @see fleet.Vehicle#getManufacturedAt()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_ManufacturedAt();

	/**
	 * Returns the meta object for the reference '{@link fleet.Vehicle#getTireSpec <em>Tire Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tire Spec</em>'.
	 * @see fleet.Vehicle#getTireSpec()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_TireSpec();

	/**
	 * Returns the meta object for class '{@link fleet.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see fleet.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fleet.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fleet.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Person#isEmployed <em>Employed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employed</em>'.
	 * @see fleet.Person#isEmployed()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Employed();

	/**
	 * Returns the meta object for the containment reference list '{@link fleet.Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Addresses</em>'.
	 * @see fleet.Person#getAddresses()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Addresses();

	/**
	 * Returns the meta object for the reference list '{@link fleet.Person#getOwnedVehicles <em>Owned Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Vehicles</em>'.
	 * @see fleet.Person#getOwnedVehicles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_OwnedVehicles();

	/**
	 * Returns the meta object for the containment reference '{@link fleet.Person#getBirthAddress <em>Birth Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Birth Address</em>'.
	 * @see fleet.Person#getBirthAddress()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_BirthAddress();

	/**
	 * Returns the meta object for class '{@link fleet.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see fleet.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Address#getStreetName <em>Street Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Name</em>'.
	 * @see fleet.Address#getStreetName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_StreetName();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Address#getStreetNumber <em>Street Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street Number</em>'.
	 * @see fleet.Address#getStreetNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_StreetNumber();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see fleet.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see fleet.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for class '{@link fleet.VehicleInfo <em>Vehicle Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Info</em>'.
	 * @see fleet.VehicleInfo
	 * @generated
	 */
	EClass getVehicleInfo();

	/**
	 * Returns the meta object for the attribute '{@link fleet.VehicleInfo#getAcquisitionDate <em>Acquisition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquisition Date</em>'.
	 * @see fleet.VehicleInfo#getAcquisitionDate()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EAttribute getVehicleInfo_AcquisitionDate();

	/**
	 * Returns the meta object for the reference '{@link fleet.VehicleInfo#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see fleet.VehicleInfo#getVehicle()
	 * @see #getVehicleInfo()
	 * @generated
	 */
	EReference getVehicleInfo_Vehicle();

	/**
	 * Returns the meta object for class '{@link fleet.ManufacturingPlant <em>Manufacturing Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing Plant</em>'.
	 * @see fleet.ManufacturingPlant
	 * @generated
	 */
	EClass getManufacturingPlant();

	/**
	 * Returns the meta object for the attribute '{@link fleet.ManufacturingPlant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fleet.ManufacturingPlant#getId()
	 * @see #getManufacturingPlant()
	 * @generated
	 */
	EAttribute getManufacturingPlant_Id();

	/**
	 * Returns the meta object for the attribute '{@link fleet.ManufacturingPlant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fleet.ManufacturingPlant#getName()
	 * @see #getManufacturingPlant()
	 * @generated
	 */
	EAttribute getManufacturingPlant_Name();

	/**
	 * Returns the meta object for the reference '{@link fleet.ManufacturingPlant#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see fleet.ManufacturingPlant#getAddress()
	 * @see #getManufacturingPlant()
	 * @generated
	 */
	EReference getManufacturingPlant_Address();

	/**
	 * Returns the meta object for the reference '{@link fleet.ManufacturingPlant#getTransportFleet <em>Transport Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transport Fleet</em>'.
	 * @see fleet.ManufacturingPlant#getTransportFleet()
	 * @see #getManufacturingPlant()
	 * @generated
	 */
	EReference getManufacturingPlant_TransportFleet();

	/**
	 * Returns the meta object for class '{@link fleet.Fleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fleet</em>'.
	 * @see fleet.Fleet
	 * @generated
	 */
	EClass getFleet();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Fleet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fleet.Fleet#getId()
	 * @see #getFleet()
	 * @generated
	 */
	EAttribute getFleet_Id();

	/**
	 * Returns the meta object for the reference list '{@link fleet.Fleet#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see fleet.Fleet#getVehicles()
	 * @see #getFleet()
	 * @generated
	 */
	EReference getFleet_Vehicles();

	/**
	 * Returns the meta object for the containment reference list '{@link fleet.Fleet#getVehicleInformation <em>Vehicle Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Information</em>'.
	 * @see fleet.Fleet#getVehicleInformation()
	 * @see #getFleet()
	 * @generated
	 */
	EReference getFleet_VehicleInformation();

	/**
	 * Returns the meta object for the reference '{@link fleet.Fleet#getServiceGarage <em>Service Garage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Garage</em>'.
	 * @see fleet.Fleet#getServiceGarage()
	 * @see #getFleet()
	 * @generated
	 */
	EReference getFleet_ServiceGarage();

	/**
	 * Returns the meta object for class '{@link fleet.Garage <em>Garage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Garage</em>'.
	 * @see fleet.Garage
	 * @generated
	 */
	EClass getGarage();

	/**
	 * Returns the meta object for the reference list '{@link fleet.Garage#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see fleet.Garage#getVehicles()
	 * @see #getGarage()
	 * @generated
	 */
	EReference getGarage_Vehicles();

	/**
	 * Returns the meta object for the containment reference '{@link fleet.Garage#getCustomerShuttles <em>Customer Shuttles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Customer Shuttles</em>'.
	 * @see fleet.Garage#getCustomerShuttles()
	 * @see #getGarage()
	 * @generated
	 */
	EReference getGarage_CustomerShuttles();

	/**
	 * Returns the meta object for the containment reference '{@link fleet.Garage#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see fleet.Garage#getAddress()
	 * @see #getGarage()
	 * @generated
	 */
	EReference getGarage_Address();

	/**
	 * Returns the meta object for the reference list '{@link fleet.Garage#getFleetsUsingGarage <em>Fleets Using Garage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fleets Using Garage</em>'.
	 * @see fleet.Garage#getFleetsUsingGarage()
	 * @see #getGarage()
	 * @generated
	 */
	EReference getGarage_FleetsUsingGarage();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Garage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fleet.Garage#getName()
	 * @see #getGarage()
	 * @generated
	 */
	EAttribute getGarage_Name();

	/**
	 * Returns the meta object for class '{@link fleet.Tire <em>Tire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tire</em>'.
	 * @see fleet.Tire
	 * @generated
	 */
	EClass getTire();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Tire#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see fleet.Tire#getRadius()
	 * @see #getTire()
	 * @generated
	 */
	EAttribute getTire_Radius();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Tire#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fleet.Tire#getWidth()
	 * @see #getTire()
	 * @generated
	 */
	EAttribute getTire_Width();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Tire#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see fleet.Tire#getProfile()
	 * @see #getTire()
	 * @generated
	 */
	EAttribute getTire_Profile();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Tire#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make</em>'.
	 * @see fleet.Tire#getMake()
	 * @see #getTire()
	 * @generated
	 */
	EAttribute getTire_Make();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Tire#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see fleet.Tire#getModel()
	 * @see #getTire()
	 * @generated
	 */
	EAttribute getTire_Model();

	/**
	 * Returns the meta object for class '{@link fleet.Hybrid <em>Hybrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid</em>'.
	 * @see fleet.Hybrid
	 * @generated
	 */
	EClass getHybrid();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Hybrid#isHasRechargePlug <em>Has Recharge Plug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Recharge Plug</em>'.
	 * @see fleet.Hybrid#isHasRechargePlug()
	 * @see #getHybrid()
	 * @generated
	 */
	EAttribute getHybrid_HasRechargePlug();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Hybrid#getBatteryLife <em>Battery Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Life</em>'.
	 * @see fleet.Hybrid#getBatteryLife()
	 * @see #getHybrid()
	 * @generated
	 */
	EAttribute getHybrid_BatteryLife();

	/**
	 * Returns the meta object for class '{@link fleet.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see fleet.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Car#getNumPassengers <em>Num Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Passengers</em>'.
	 * @see fleet.Car#getNumPassengers()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_NumPassengers();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Car#getNumTires <em>Num Tires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tires</em>'.
	 * @see fleet.Car#getNumTires()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_NumTires();

	/**
	 * Returns the meta object for the containment reference list '{@link fleet.Car#getTires <em>Tires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tires</em>'.
	 * @see fleet.Car#getTires()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Tires();

	/**
	 * Returns the meta object for class '{@link fleet.PassengerVehicle <em>Passenger Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Vehicle</em>'.
	 * @see fleet.PassengerVehicle
	 * @generated
	 */
	EClass getPassengerVehicle();

	/**
	 * Returns the meta object for the attribute '{@link fleet.PassengerVehicle#getPassengerName <em>Passenger Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Name</em>'.
	 * @see fleet.PassengerVehicle#getPassengerName()
	 * @see #getPassengerVehicle()
	 * @generated
	 */
	EAttribute getPassengerVehicle_PassengerName();

	/**
	 * Returns the meta object for class '{@link fleet.EngineFactory <em>Engine Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine Factory</em>'.
	 * @see fleet.EngineFactory
	 * @generated
	 */
	EClass getEngineFactory();

	/**
	 * Returns the meta object for the attribute '{@link fleet.EngineFactory#isMakesDieselEngines <em>Makes Diesel Engines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Makes Diesel Engines</em>'.
	 * @see fleet.EngineFactory#isMakesDieselEngines()
	 * @see #getEngineFactory()
	 * @generated
	 */
	EAttribute getEngineFactory_MakesDieselEngines();

	/**
	 * Returns the meta object for the attribute list '{@link fleet.EngineFactory#getBrands <em>Brands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Brands</em>'.
	 * @see fleet.EngineFactory#getBrands()
	 * @see #getEngineFactory()
	 * @generated
	 */
	EAttribute getEngineFactory_Brands();

	/**
	 * Returns the meta object for class '{@link fleet.USAddress <em>US Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US Address</em>'.
	 * @see fleet.USAddress
	 * @generated
	 */
	EClass getUSAddress();

	/**
	 * Returns the meta object for the attribute '{@link fleet.USAddress#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see fleet.USAddress#getZipCode()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link fleet.USAddress#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see fleet.USAddress#getState()
	 * @see #getUSAddress()
	 * @generated
	 */
	EAttribute getUSAddress_State();

	/**
	 * Returns the meta object for class '{@link fleet.Vin <em>Vin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vin</em>'.
	 * @see fleet.Vin
	 * @generated
	 */
	EClass getVin();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fleet.Vin#getId()
	 * @see #getVin()
	 * @generated
	 */
	EAttribute getVin_Id();

	/**
	 * Returns the meta object for the attribute '{@link fleet.Vin#getInstallationDate <em>Installation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Installation Date</em>'.
	 * @see fleet.Vin#getInstallationDate()
	 * @see #getVin()
	 * @generated
	 */
	EAttribute getVin_InstallationDate();

	/**
	 * Returns the meta object for the reference '{@link fleet.Vin#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see fleet.Vin#getVehicle()
	 * @see #getVin()
	 * @generated
	 */
	EReference getVin_Vehicle();

	/**
	 * Returns the meta object for class '{@link fleet.TransportationDevice <em>Transportation Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation Device</em>'.
	 * @see fleet.TransportationDevice
	 * @generated
	 */
	EClass getTransportationDevice();

	/**
	 * Returns the meta object for the attribute '{@link fleet.TransportationDevice#getManufacturedBy <em>Manufactured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufactured By</em>'.
	 * @see fleet.TransportationDevice#getManufacturedBy()
	 * @see #getTransportationDevice()
	 * @generated
	 */
	EAttribute getTransportationDevice_ManufacturedBy();

	/**
	 * Returns the meta object for the attribute '{@link fleet.TransportationDevice#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see fleet.TransportationDevice#getYear()
	 * @see #getTransportationDevice()
	 * @generated
	 */
	EAttribute getTransportationDevice_Year();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FleetFactory getFleetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fleet.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.VehicleImpl
		 * @see fleet.impl.FleetPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__BRAND = eINSTANCE.getVehicle_Brand();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MODEL = eINSTANCE.getVehicle_Model();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__MAKE = eINSTANCE.getVehicle_Make();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__COLOR = eINSTANCE.getVehicle_Color();

		/**
		 * The meta object literal for the '<em><b>Plate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__PLATE = eINSTANCE.getVehicle_Plate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ID = eINSTANCE.getVehicle_Id();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__YEAR = eINSTANCE.getVehicle_Year();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__LENGTH = eINSTANCE.getVehicle_Length();

		/**
		 * The meta object literal for the '<em><b>Available Colors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__AVAILABLE_COLORS = eINSTANCE.getVehicle_AvailableColors();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__OWNER = eINSTANCE.getVehicle_Owner();

		/**
		 * The meta object literal for the '<em><b>Manufactured At</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__MANUFACTURED_AT = eINSTANCE.getVehicle_ManufacturedAt();

		/**
		 * The meta object literal for the '<em><b>Tire Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__TIRE_SPEC = eINSTANCE.getVehicle_TireSpec();

		/**
		 * The meta object literal for the '{@link fleet.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.PersonImpl
		 * @see fleet.impl.FleetPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Employed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMPLOYED = eINSTANCE.getPerson_Employed();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

		/**
		 * The meta object literal for the '<em><b>Owned Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__OWNED_VEHICLES = eINSTANCE.getPerson_OwnedVehicles();

		/**
		 * The meta object literal for the '<em><b>Birth Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__BIRTH_ADDRESS = eINSTANCE.getPerson_BirthAddress();

		/**
		 * The meta object literal for the '{@link fleet.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.AddressImpl
		 * @see fleet.impl.FleetPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET_NAME = eINSTANCE.getAddress_StreetName();

		/**
		 * The meta object literal for the '<em><b>Street Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET_NUMBER = eINSTANCE.getAddress_StreetNumber();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '{@link fleet.impl.VehicleInfoImpl <em>Vehicle Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.VehicleInfoImpl
		 * @see fleet.impl.FleetPackageImpl#getVehicleInfo()
		 * @generated
		 */
		EClass VEHICLE_INFO = eINSTANCE.getVehicleInfo();

		/**
		 * The meta object literal for the '<em><b>Acquisition Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_INFO__ACQUISITION_DATE = eINSTANCE.getVehicleInfo_AcquisitionDate();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE_INFO__VEHICLE = eINSTANCE.getVehicleInfo_Vehicle();

		/**
		 * The meta object literal for the '{@link fleet.impl.ManufacturingPlantImpl <em>Manufacturing Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.ManufacturingPlantImpl
		 * @see fleet.impl.FleetPackageImpl#getManufacturingPlant()
		 * @generated
		 */
		EClass MANUFACTURING_PLANT = eINSTANCE.getManufacturingPlant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUFACTURING_PLANT__ID = eINSTANCE.getManufacturingPlant_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUFACTURING_PLANT__NAME = eINSTANCE.getManufacturingPlant_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_PLANT__ADDRESS = eINSTANCE.getManufacturingPlant_Address();

		/**
		 * The meta object literal for the '<em><b>Transport Fleet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_PLANT__TRANSPORT_FLEET = eINSTANCE.getManufacturingPlant_TransportFleet();

		/**
		 * The meta object literal for the '{@link fleet.impl.FleetImpl <em>Fleet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.FleetImpl
		 * @see fleet.impl.FleetPackageImpl#getFleet()
		 * @generated
		 */
		EClass FLEET = eINSTANCE.getFleet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEET__ID = eINSTANCE.getFleet_Id();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEET__VEHICLES = eINSTANCE.getFleet_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Vehicle Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEET__VEHICLE_INFORMATION = eINSTANCE.getFleet_VehicleInformation();

		/**
		 * The meta object literal for the '<em><b>Service Garage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEET__SERVICE_GARAGE = eINSTANCE.getFleet_ServiceGarage();

		/**
		 * The meta object literal for the '{@link fleet.impl.GarageImpl <em>Garage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.GarageImpl
		 * @see fleet.impl.FleetPackageImpl#getGarage()
		 * @generated
		 */
		EClass GARAGE = eINSTANCE.getGarage();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARAGE__VEHICLES = eINSTANCE.getGarage_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Customer Shuttles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARAGE__CUSTOMER_SHUTTLES = eINSTANCE.getGarage_CustomerShuttles();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARAGE__ADDRESS = eINSTANCE.getGarage_Address();

		/**
		 * The meta object literal for the '<em><b>Fleets Using Garage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARAGE__FLEETS_USING_GARAGE = eINSTANCE.getGarage_FleetsUsingGarage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GARAGE__NAME = eINSTANCE.getGarage_Name();

		/**
		 * The meta object literal for the '{@link fleet.impl.TireImpl <em>Tire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.TireImpl
		 * @see fleet.impl.FleetPackageImpl#getTire()
		 * @generated
		 */
		EClass TIRE = eINSTANCE.getTire();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIRE__RADIUS = eINSTANCE.getTire_Radius();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIRE__WIDTH = eINSTANCE.getTire_Width();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIRE__PROFILE = eINSTANCE.getTire_Profile();

		/**
		 * The meta object literal for the '<em><b>Make</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIRE__MAKE = eINSTANCE.getTire_Make();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIRE__MODEL = eINSTANCE.getTire_Model();

		/**
		 * The meta object literal for the '{@link fleet.impl.HybridImpl <em>Hybrid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.HybridImpl
		 * @see fleet.impl.FleetPackageImpl#getHybrid()
		 * @generated
		 */
		EClass HYBRID = eINSTANCE.getHybrid();

		/**
		 * The meta object literal for the '<em><b>Has Recharge Plug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID__HAS_RECHARGE_PLUG = eINSTANCE.getHybrid_HasRechargePlug();

		/**
		 * The meta object literal for the '<em><b>Battery Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID__BATTERY_LIFE = eINSTANCE.getHybrid_BatteryLife();

		/**
		 * The meta object literal for the '{@link fleet.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.CarImpl
		 * @see fleet.impl.FleetPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Num Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__NUM_PASSENGERS = eINSTANCE.getCar_NumPassengers();

		/**
		 * The meta object literal for the '<em><b>Num Tires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__NUM_TIRES = eINSTANCE.getCar_NumTires();

		/**
		 * The meta object literal for the '<em><b>Tires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__TIRES = eINSTANCE.getCar_Tires();

		/**
		 * The meta object literal for the '{@link fleet.PassengerVehicle <em>Passenger Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.PassengerVehicle
		 * @see fleet.impl.FleetPackageImpl#getPassengerVehicle()
		 * @generated
		 */
		EClass PASSENGER_VEHICLE = eINSTANCE.getPassengerVehicle();

		/**
		 * The meta object literal for the '<em><b>Passenger Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_VEHICLE__PASSENGER_NAME = eINSTANCE.getPassengerVehicle_PassengerName();

		/**
		 * The meta object literal for the '{@link fleet.impl.EngineFactoryImpl <em>Engine Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.EngineFactoryImpl
		 * @see fleet.impl.FleetPackageImpl#getEngineFactory()
		 * @generated
		 */
		EClass ENGINE_FACTORY = eINSTANCE.getEngineFactory();

		/**
		 * The meta object literal for the '<em><b>Makes Diesel Engines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_FACTORY__MAKES_DIESEL_ENGINES = eINSTANCE.getEngineFactory_MakesDieselEngines();

		/**
		 * The meta object literal for the '<em><b>Brands</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGINE_FACTORY__BRANDS = eINSTANCE.getEngineFactory_Brands();

		/**
		 * The meta object literal for the '{@link fleet.impl.USAddressImpl <em>US Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.USAddressImpl
		 * @see fleet.impl.FleetPackageImpl#getUSAddress()
		 * @generated
		 */
		EClass US_ADDRESS = eINSTANCE.getUSAddress();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__ZIP_CODE = eINSTANCE.getUSAddress_ZipCode();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_ADDRESS__STATE = eINSTANCE.getUSAddress_State();

		/**
		 * The meta object literal for the '{@link fleet.impl.VinImpl <em>Vin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.VinImpl
		 * @see fleet.impl.FleetPackageImpl#getVin()
		 * @generated
		 */
		EClass VIN = eINSTANCE.getVin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIN__ID = eINSTANCE.getVin_Id();

		/**
		 * The meta object literal for the '<em><b>Installation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIN__INSTALLATION_DATE = eINSTANCE.getVin_InstallationDate();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIN__VEHICLE = eINSTANCE.getVin_Vehicle();

		/**
		 * The meta object literal for the '{@link fleet.impl.TransportationDeviceImpl <em>Transportation Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fleet.impl.TransportationDeviceImpl
		 * @see fleet.impl.FleetPackageImpl#getTransportationDevice()
		 * @generated
		 */
		EClass TRANSPORTATION_DEVICE = eINSTANCE.getTransportationDevice();

		/**
		 * The meta object literal for the '<em><b>Manufactured By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_DEVICE__MANUFACTURED_BY = eINSTANCE.getTransportationDevice_ManufacturedBy();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_DEVICE__YEAR = eINSTANCE.getTransportationDevice_Year();

	}

} //FleetPackage
