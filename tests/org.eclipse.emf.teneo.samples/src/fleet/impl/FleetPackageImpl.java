/**
 * <copyright>
 * </copyright>
 *
 * $Id: FleetPackageImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Address;
import fleet.Car;
import fleet.EngineFactory;
import fleet.Fleet;
import fleet.FleetFactory;
import fleet.FleetPackage;

import fleet.Garage;
import fleet.Hybrid;
import fleet.ManufacturingPlant;
import fleet.PassengerVehicle;
import fleet.Person;
import fleet.Tire;
import fleet.TransportationDevice;
import fleet.USAddress;
import fleet.Vehicle;
import fleet.VehicleInfo;
import fleet.Vin;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import temporal.TemporalPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class FleetPackageImpl extends EPackageImpl implements FleetPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vehicleEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass personEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass addressEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vehicleInfoEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass manufacturingPlantEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass fleetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass garageEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tireEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass hybridEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass carEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass passengerVehicleEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass engineFactoryEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass usAddressEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vinEClass = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transportationDeviceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
	 * value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init
	 * init()}, which also performs initialization of the package, or returns the registered package,
	 * if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fleet.FleetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FleetPackageImpl() {
		super(eNS_URI, FleetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
	 * which it depends. Simple dependencies are satisfied by calling this method on all dependent
	 * packages before doing anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not yet been registered by
	 * their URI values are first created and registered. The packages are then initialized in two
	 * steps: meta-model objects for all of the packages are created before any are initialized, since
	 * one package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already been initialized. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FleetPackage init() {
		if (isInited)
			return (FleetPackage) EPackage.Registry.INSTANCE.getEPackage(FleetPackage.eNS_URI);

		// Obtain or create and register package
		FleetPackageImpl theFleetPackage = (FleetPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof FleetPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) : new FleetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TemporalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFleetPackage.createPackageContents();

		// Initialize created meta-data
		theFleetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFleetPackage.freeze();

		return theFleetPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Brand() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Model() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Make() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Color() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Plate() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Id() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Year() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_Length() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicle_AvailableColors() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVehicle_Owner() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVehicle_ManufacturedAt() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVehicle_TireSpec() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPerson_Id() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPerson_Employed() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPerson_Addresses() {
		return (EReference) personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPerson_OwnedVehicles() {
		return (EReference) personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPerson_BirthAddress() {
		return (EReference) personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAddress_StreetName() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAddress_StreetNumber() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAddress_Country() {
		return (EAttribute) addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVehicleInfo() {
		return vehicleInfoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVehicleInfo_AcquisitionDate() {
		return (EAttribute) vehicleInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVehicleInfo_Vehicle() {
		return (EReference) vehicleInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getManufacturingPlant() {
		return manufacturingPlantEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getManufacturingPlant_Id() {
		return (EAttribute) manufacturingPlantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getManufacturingPlant_Name() {
		return (EAttribute) manufacturingPlantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getManufacturingPlant_Address() {
		return (EReference) manufacturingPlantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getManufacturingPlant_TransportFleet() {
		return (EReference) manufacturingPlantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFleet() {
		return fleetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFleet_Id() {
		return (EAttribute) fleetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFleet_Vehicles() {
		return (EReference) fleetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFleet_VehicleInformation() {
		return (EReference) fleetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFleet_ServiceGarage() {
		return (EReference) fleetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGarage() {
		return garageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGarage_Vehicles() {
		return (EReference) garageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGarage_CustomerShuttles() {
		return (EReference) garageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGarage_Address() {
		return (EReference) garageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGarage_FleetsUsingGarage() {
		return (EReference) garageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGarage_Name() {
		return (EAttribute) garageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTire() {
		return tireEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTire_Radius() {
		return (EAttribute) tireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTire_Width() {
		return (EAttribute) tireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTire_Profile() {
		return (EAttribute) tireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTire_Make() {
		return (EAttribute) tireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTire_Model() {
		return (EAttribute) tireEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getHybrid() {
		return hybridEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getHybrid_HasRechargePlug() {
		return (EAttribute) hybridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getHybrid_BatteryLife() {
		return (EAttribute) hybridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCar() {
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCar_NumPassengers() {
		return (EAttribute) carEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getCar_NumTires() {
		return (EAttribute) carEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCar_Tires() {
		return (EReference) carEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPassengerVehicle() {
		return passengerVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPassengerVehicle_PassengerName() {
		return (EAttribute) passengerVehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEngineFactory() {
		return engineFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEngineFactory_MakesDieselEngines() {
		return (EAttribute) engineFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEngineFactory_Brands() {
		return (EAttribute) engineFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUSAddress() {
		return usAddressEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUSAddress_ZipCode() {
		return (EAttribute) usAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getUSAddress_State() {
		return (EAttribute) usAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVin() {
		return vinEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVin_Id() {
		return (EAttribute) vinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVin_InstallationDate() {
		return (EAttribute) vinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVin_Vehicle() {
		return (EReference) vinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransportationDevice() {
		return transportationDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransportationDevice_ManufacturedBy() {
		return (EAttribute) transportationDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransportationDevice_Year() {
		return (EAttribute) transportationDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FleetFactory getFleetFactory() {
		return (FleetFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__BRAND);
		createEAttribute(vehicleEClass, VEHICLE__MODEL);
		createEAttribute(vehicleEClass, VEHICLE__MAKE);
		createEAttribute(vehicleEClass, VEHICLE__COLOR);
		createEAttribute(vehicleEClass, VEHICLE__PLATE);
		createEAttribute(vehicleEClass, VEHICLE__ID);
		createEAttribute(vehicleEClass, VEHICLE__YEAR);
		createEAttribute(vehicleEClass, VEHICLE__LENGTH);
		createEAttribute(vehicleEClass, VEHICLE__AVAILABLE_COLORS);
		createEReference(vehicleEClass, VEHICLE__OWNER);
		createEReference(vehicleEClass, VEHICLE__MANUFACTURED_AT);
		createEReference(vehicleEClass, VEHICLE__TIRE_SPEC);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__ID);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__EMPLOYED);
		createEReference(personEClass, PERSON__ADDRESSES);
		createEReference(personEClass, PERSON__OWNED_VEHICLES);
		createEReference(personEClass, PERSON__BIRTH_ADDRESS);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__STREET_NAME);
		createEAttribute(addressEClass, ADDRESS__STREET_NUMBER);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);

		vehicleInfoEClass = createEClass(VEHICLE_INFO);
		createEAttribute(vehicleInfoEClass, VEHICLE_INFO__ACQUISITION_DATE);
		createEReference(vehicleInfoEClass, VEHICLE_INFO__VEHICLE);

		manufacturingPlantEClass = createEClass(MANUFACTURING_PLANT);
		createEAttribute(manufacturingPlantEClass, MANUFACTURING_PLANT__ID);
		createEAttribute(manufacturingPlantEClass, MANUFACTURING_PLANT__NAME);
		createEReference(manufacturingPlantEClass, MANUFACTURING_PLANT__ADDRESS);
		createEReference(manufacturingPlantEClass, MANUFACTURING_PLANT__TRANSPORT_FLEET);

		fleetEClass = createEClass(FLEET);
		createEAttribute(fleetEClass, FLEET__ID);
		createEReference(fleetEClass, FLEET__VEHICLES);
		createEReference(fleetEClass, FLEET__VEHICLE_INFORMATION);
		createEReference(fleetEClass, FLEET__SERVICE_GARAGE);

		garageEClass = createEClass(GARAGE);
		createEReference(garageEClass, GARAGE__VEHICLES);
		createEReference(garageEClass, GARAGE__CUSTOMER_SHUTTLES);
		createEReference(garageEClass, GARAGE__ADDRESS);
		createEReference(garageEClass, GARAGE__FLEETS_USING_GARAGE);
		createEAttribute(garageEClass, GARAGE__NAME);

		tireEClass = createEClass(TIRE);
		createEAttribute(tireEClass, TIRE__RADIUS);
		createEAttribute(tireEClass, TIRE__WIDTH);
		createEAttribute(tireEClass, TIRE__PROFILE);
		createEAttribute(tireEClass, TIRE__MAKE);
		createEAttribute(tireEClass, TIRE__MODEL);

		hybridEClass = createEClass(HYBRID);
		createEAttribute(hybridEClass, HYBRID__HAS_RECHARGE_PLUG);
		createEAttribute(hybridEClass, HYBRID__BATTERY_LIFE);

		carEClass = createEClass(CAR);
		createEAttribute(carEClass, CAR__NUM_PASSENGERS);
		createEAttribute(carEClass, CAR__NUM_TIRES);
		createEReference(carEClass, CAR__TIRES);

		passengerVehicleEClass = createEClass(PASSENGER_VEHICLE);
		createEAttribute(passengerVehicleEClass, PASSENGER_VEHICLE__PASSENGER_NAME);

		engineFactoryEClass = createEClass(ENGINE_FACTORY);
		createEAttribute(engineFactoryEClass, ENGINE_FACTORY__MAKES_DIESEL_ENGINES);
		createEAttribute(engineFactoryEClass, ENGINE_FACTORY__BRANDS);

		usAddressEClass = createEClass(US_ADDRESS);
		createEAttribute(usAddressEClass, US_ADDRESS__ZIP_CODE);
		createEAttribute(usAddressEClass, US_ADDRESS__STATE);

		vinEClass = createEClass(VIN);
		createEAttribute(vinEClass, VIN__ID);
		createEAttribute(vinEClass, VIN__INSTALLATION_DATE);
		createEReference(vinEClass, VIN__VEHICLE);

		transportationDeviceEClass = createEClass(TRANSPORTATION_DEVICE);
		createEAttribute(transportationDeviceEClass, TRANSPORTATION_DEVICE__MANUFACTURED_BY);
		createEAttribute(transportationDeviceEClass, TRANSPORTATION_DEVICE__YEAR);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have
	 * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TemporalPackage theTemporalPackage = (TemporalPackage) EPackage.Registry.INSTANCE
				.getEPackage(TemporalPackage.eNS_URI);

		// Add supertypes to classes
		personEClass.getESuperTypes().add(theTemporalPackage.getTemporal());
		addressEClass.getESuperTypes().add(theTemporalPackage.getTemporal());
		fleetEClass.getESuperTypes().add(theTemporalPackage.getTemporal());
		garageEClass.getESuperTypes().add(theTemporalPackage.getTemporal());
		hybridEClass.getESuperTypes().add(this.getCar());
		hybridEClass.getESuperTypes().add(this.getPassengerVehicle());
		carEClass.getESuperTypes().add(this.getPassengerVehicle());
		carEClass.getESuperTypes().add(this.getVehicle());
		carEClass.getESuperTypes().add(theTemporalPackage.getTemporal());
		engineFactoryEClass.getESuperTypes().add(this.getManufacturingPlant());
		usAddressEClass.getESuperTypes().add(this.getAddress());

		// Initialize classes and features; add operations and parameters
		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Brand(), ecorePackage.getEString(), "brand", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Model(), ecorePackage.getEString(), "model", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Make(), ecorePackage.getEString(), "make", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVehicle_Color(), ecorePackage.getEString(), "color", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Plate(), ecorePackage.getEString(), "plate", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_Id(), ecorePackage.getEString(), "id", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVehicle_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVehicle_Length(), ecorePackage.getELong(), "length", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_AvailableColors(), ecorePackage.getEString(), "availableColors",
				null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Owner(), this.getPerson(), null, "owner", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_ManufacturedAt(), this.getManufacturingPlant(), null,
				"manufacturedAt", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_TireSpec(), this.getTire(), null, "tireSpec", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Id(), ecorePackage.getEString(), "id", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPerson_Employed(), ecorePackage.getEBoolean(), "employed", null, 0, 1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Addresses(), this.getAddress(), null, "addresses", null, 0, -1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_OwnedVehicles(), this.getVehicleInfo(), null, "ownedVehicles", null,
				0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_BirthAddress(), this.getAddress(), null, "birthAddress", null, 0, 1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_StreetName(), ecorePackage.getEString(), "streetName", null, 0, 1,
				Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_StreetNumber(), ecorePackage.getEString(), "streetNumber", null, 0,
				1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, Address.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAddress_Country(), ecorePackage.getEString(), "country", null, 0, 1,
				Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleInfoEClass, VehicleInfo.class, "VehicleInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleInfo_AcquisitionDate(), ecorePackage.getEDate(), "acquisitionDate",
				null, 1, 1, VehicleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicleInfo_Vehicle(), this.getVehicle(), null, "vehicle", null, 1, 1,
				VehicleInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturingPlantEClass, ManufacturingPlant.class, "ManufacturingPlant",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManufacturingPlant_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				ManufacturingPlant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManufacturingPlant_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ManufacturingPlant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingPlant_Address(), this.getAddress(), null, "address", null, 0, 1,
				ManufacturingPlant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingPlant_TransportFleet(), this.getFleet(), null, "transportFleet",
				null, 0, 1, ManufacturingPlant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fleetEClass, Fleet.class, "Fleet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFleet_Id(), ecorePackage.getEString(), "id", null, 0, 1, Fleet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFleet_Vehicles(), this.getVehicle(), null, "vehicles", null, 0, -1,
				Fleet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFleet_VehicleInformation(), this.getVehicleInfo(), null,
				"vehicleInformation", null, 0, -1, Fleet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFleet_ServiceGarage(), this.getGarage(), this.getGarage_FleetsUsingGarage(),
				"serviceGarage", null, 0, 1, Fleet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(garageEClass, Garage.class, "Garage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGarage_Vehicles(), this.getVehicle(), null, "vehicles", null, 0, -1,
				Garage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGarage_CustomerShuttles(), this.getFleet(), null, "customerShuttles", null,
				0, 1, Garage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGarage_Address(), this.getAddress(), null, "address", null, 0, 1,
				Garage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGarage_FleetsUsingGarage(), this.getFleet(), this.getFleet_ServiceGarage(),
				"fleetsUsingGarage", null, 0, -1, Garage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGarage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Garage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tireEClass, Tire.class, "Tire", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTire_Radius(), ecorePackage.getEInt(), "radius", null, 0, 1, Tire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTire_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Tire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTire_Profile(), ecorePackage.getEInt(), "profile", null, 0, 1, Tire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTire_Make(), ecorePackage.getEString(), "make", null, 0, 1, Tire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTire_Model(), ecorePackage.getEString(), "model", null, 0, 1, Tire.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(hybridEClass, Hybrid.class, "Hybrid", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHybrid_HasRechargePlug(), ecorePackage.getEBoolean(), "hasRechargePlug",
				null, 0, 1, Hybrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHybrid_BatteryLife(), ecorePackage.getEInt(), "batteryLife", null, 0, 1,
				Hybrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCar_NumPassengers(), ecorePackage.getEInt(), "numPassengers", null, 0, 1,
				Car.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCar_NumTires(), ecorePackage.getEInt(), "numTires", null, 0, 1, Car.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCar_Tires(), this.getTire(), null, "tires", null, 0, -1, Car.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerVehicleEClass, PassengerVehicle.class, "PassengerVehicle", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerVehicle_PassengerName(), ecorePackage.getEString(), "passengerName",
				null, 0, 1, PassengerVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineFactoryEClass, EngineFactory.class, "EngineFactory", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngineFactory_MakesDieselEngines(), ecorePackage.getEBoolean(),
				"makesDieselEngines", null, 0, 1, EngineFactory.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngineFactory_Brands(), ecorePackage.getEString(), "brands", null, 1, -1,
				EngineFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usAddressEClass, USAddress.class, "USAddress", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUSAddress_ZipCode(), ecorePackage.getEString(), "zipCode", null, 0, 1,
				USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSAddress_State(), ecorePackage.getEString(), "state", null, 0, 1,
				USAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vinEClass, Vin.class, "Vin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVin_Id(), ecorePackage.getEString(), "id", null, 0, 1, Vin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getVin_InstallationDate(), ecorePackage.getEDate(), "installationDate", null, 0,
				1, Vin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVin_Vehicle(), this.getVehicle(), null, "vehicle", null, 1, 1, Vin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportationDeviceEClass, TransportationDevice.class, "TransportationDevice",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportationDevice_ManufacturedBy(), ecorePackage.getEString(),
				"manufacturedBy", null, 0, 1, TransportationDevice.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportationDevice_Year(), ecorePackage.getEInt(), "year", null, 0, 1,
				TransportationDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // FleetPackageImpl
