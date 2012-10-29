/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Car;
import fleet.FleetPackage;
import fleet.ManufacturingPlant;
import fleet.Person;
import fleet.PassengerVehicle;
import fleet.Tire;

import fleet.Vehicle;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;
import temporal.mod.TemporalUtil;
import temporal.Temporal;
import temporal.TemporalPackage;
import temporal.VersionHolder;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Car</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fleet.impl.CarImpl#getPassengerName <em>Passenger Name</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getBrand <em>Brand</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getModel <em>Model</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getMake <em>Make</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getColor <em>Color</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getPlate <em>Plate</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getId <em>Id</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getYear <em>Year</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getLength <em>Length</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getAvailableColors <em>Available Colors</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getOwner <em>Owner</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getManufacturedAt <em>Manufactured At</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getTireSpec <em>Tire Spec</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getDate <em>Date</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getTouchedAttributes <em>Touched Attributes</em>}</li>
 * <li>{@link fleet.impl.CarImpl#isContinuity <em>Continuity</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getVersionHolder <em>Version Holder</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getVersionHolderContainment <em>Version Holder Containment</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getNumPassengers <em>Num Passengers</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getNumTires <em>Num Tires</em>}</li>
 * <li>{@link fleet.impl.CarImpl#getTires <em>Tires</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CarImpl extends TemporalBaseEObjectImpl implements Car {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPassengerName() {
		return (String) eGet(FleetPackage.Literals.PASSENGER_VEHICLE__PASSENGER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPassengerName(String newPassengerName) {
		eSet(FleetPackage.Literals.PASSENGER_VEHICLE__PASSENGER_NAME, newPassengerName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getBrand() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__BRAND, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBrand(String newBrand) {
		eSet(FleetPackage.Literals.VEHICLE__BRAND, newBrand);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getModel() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(FleetPackage.Literals.VEHICLE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMake() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__MAKE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMake(String newMake) {
		eSet(FleetPackage.Literals.VEHICLE__MAKE, newMake);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getColor() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(String newColor) {
		eSet(FleetPackage.Literals.VEHICLE__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPlate() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__PLATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPlate(String newPlate) {
		eSet(FleetPackage.Literals.VEHICLE__PLATE, newPlate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return (String) eGet(FleetPackage.Literals.VEHICLE__ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		eSet(FleetPackage.Literals.VEHICLE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getYear() {
		return ((Integer) eGet(FleetPackage.Literals.VEHICLE__YEAR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setYear(int newYear) {
		eSet(FleetPackage.Literals.VEHICLE__YEAR, new Integer(newYear));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getLength() {
		return ((Long) eGet(FleetPackage.Literals.VEHICLE__LENGTH, true)).longValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLength(long newLength) {
		eSet(FleetPackage.Literals.VEHICLE__LENGTH, new Long(newLength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getAvailableColors() {
		return (EList) eGet(FleetPackage.Literals.VEHICLE__AVAILABLE_COLORS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person getOwner() {
		return (Person) eGet(FleetPackage.Literals.VEHICLE__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOwner(Person newOwner) {
		eSet(FleetPackage.Literals.VEHICLE__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getManufacturedAt() {
		return (EList) eGet(FleetPackage.Literals.VEHICLE__MANUFACTURED_AT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Tire getTireSpec() {
		return (Tire) eGet(FleetPackage.Literals.VEHICLE__TIRE_SPEC, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTireSpec(Tire newTireSpec) {
		eSet(FleetPackage.Literals.VEHICLE__TIRE_SPEC, newTireSpec);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getDate() {
		return (Date) eGet(TemporalPackage.Literals.TEMPORAL__DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(TemporalPackage.Literals.TEMPORAL__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public byte[] getTouchedAttributes() {
		return (byte[]) eGet(TemporalPackage.Literals.TEMPORAL__TOUCHED_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTouchedAttributes(byte[] newTouchedAttributes) {
		eSet(TemporalPackage.Literals.TEMPORAL__TOUCHED_ATTRIBUTES, newTouchedAttributes);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isContinuity() {
		return ((Boolean) eGet(TemporalPackage.Literals.TEMPORAL__CONTINUITY, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContinuity(boolean newContinuity) {
		eSet(TemporalPackage.Literals.TEMPORAL__CONTINUITY, new Boolean(newContinuity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionHolder getVersionHolder() {
		return (VersionHolder) eGet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersionHolder(VersionHolder newVersionHolder) {
		eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER, newVersionHolder);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VersionHolder getVersionHolderContainment() {
		return (VersionHolder) eGet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER_CONTAINMENT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVersionHolderContainment(VersionHolder newVersionHolderContainment) {
		eSet(TemporalPackage.Literals.TEMPORAL__VERSION_HOLDER_CONTAINMENT, newVersionHolderContainment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getNumPassengers() {
		return ((Integer) eGet(FleetPackage.Literals.CAR__NUM_PASSENGERS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNumPassengers(int newNumPassengers) {
		eSet(FleetPackage.Literals.CAR__NUM_PASSENGERS, new Integer(newNumPassengers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getNumTires() {
		return ((Integer) eGet(FleetPackage.Literals.CAR__NUM_TIRES, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNumTires(int newNumTires) {
		eSet(FleetPackage.Literals.CAR__NUM_TIRES, new Integer(newNumTires));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getTires() {
		return (EList) eGet(FleetPackage.Literals.CAR__TIRES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Temporal versionAt(Date date) {
		return TemporalUtil.versionAt(this, date);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Temporal createVersion() {
		return TemporalUtil.createVersion(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDateWithinVersion(Date date) {
		return TemporalUtil.isDateWithinVersion(this, date);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Temporal continuity() {
		return TemporalUtil.continuity(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Temporal currentVersion() {
		return TemporalUtil.currentVersion(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList versions() {
		return TemporalUtil.versions(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Vehicle.class) {
			switch (derivedFeatureID) {
			case FleetPackage.CAR__BRAND:
				return FleetPackage.VEHICLE__BRAND;
			case FleetPackage.CAR__MODEL:
				return FleetPackage.VEHICLE__MODEL;
			case FleetPackage.CAR__MAKE:
				return FleetPackage.VEHICLE__MAKE;
			case FleetPackage.CAR__COLOR:
				return FleetPackage.VEHICLE__COLOR;
			case FleetPackage.CAR__PLATE:
				return FleetPackage.VEHICLE__PLATE;
			case FleetPackage.CAR__ID:
				return FleetPackage.VEHICLE__ID;
			case FleetPackage.CAR__YEAR:
				return FleetPackage.VEHICLE__YEAR;
			case FleetPackage.CAR__LENGTH:
				return FleetPackage.VEHICLE__LENGTH;
			case FleetPackage.CAR__AVAILABLE_COLORS:
				return FleetPackage.VEHICLE__AVAILABLE_COLORS;
			case FleetPackage.CAR__OWNER:
				return FleetPackage.VEHICLE__OWNER;
			case FleetPackage.CAR__MANUFACTURED_AT:
				return FleetPackage.VEHICLE__MANUFACTURED_AT;
			case FleetPackage.CAR__TIRE_SPEC:
				return FleetPackage.VEHICLE__TIRE_SPEC;
			default:
				return -1;
			}
		}
		if (baseClass == Temporal.class) {
			switch (derivedFeatureID) {
			case FleetPackage.CAR__DATE:
				return TemporalPackage.TEMPORAL__DATE;
			case FleetPackage.CAR__TOUCHED_ATTRIBUTES:
				return TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES;
			case FleetPackage.CAR__CONTINUITY:
				return TemporalPackage.TEMPORAL__CONTINUITY;
			case FleetPackage.CAR__VERSION_HOLDER:
				return TemporalPackage.TEMPORAL__VERSION_HOLDER;
			case FleetPackage.CAR__VERSION_HOLDER_CONTAINMENT:
				return TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Vehicle.class) {
			switch (baseFeatureID) {
			case FleetPackage.VEHICLE__BRAND:
				return FleetPackage.CAR__BRAND;
			case FleetPackage.VEHICLE__MODEL:
				return FleetPackage.CAR__MODEL;
			case FleetPackage.VEHICLE__MAKE:
				return FleetPackage.CAR__MAKE;
			case FleetPackage.VEHICLE__COLOR:
				return FleetPackage.CAR__COLOR;
			case FleetPackage.VEHICLE__PLATE:
				return FleetPackage.CAR__PLATE;
			case FleetPackage.VEHICLE__ID:
				return FleetPackage.CAR__ID;
			case FleetPackage.VEHICLE__YEAR:
				return FleetPackage.CAR__YEAR;
			case FleetPackage.VEHICLE__LENGTH:
				return FleetPackage.CAR__LENGTH;
			case FleetPackage.VEHICLE__AVAILABLE_COLORS:
				return FleetPackage.CAR__AVAILABLE_COLORS;
			case FleetPackage.VEHICLE__OWNER:
				return FleetPackage.CAR__OWNER;
			case FleetPackage.VEHICLE__MANUFACTURED_AT:
				return FleetPackage.CAR__MANUFACTURED_AT;
			case FleetPackage.VEHICLE__TIRE_SPEC:
				return FleetPackage.CAR__TIRE_SPEC;
			default:
				return -1;
			}
		}
		if (baseClass == Temporal.class) {
			switch (baseFeatureID) {
			case TemporalPackage.TEMPORAL__DATE:
				return FleetPackage.CAR__DATE;
			case TemporalPackage.TEMPORAL__TOUCHED_ATTRIBUTES:
				return FleetPackage.CAR__TOUCHED_ATTRIBUTES;
			case TemporalPackage.TEMPORAL__CONTINUITY:
				return FleetPackage.CAR__CONTINUITY;
			case TemporalPackage.TEMPORAL__VERSION_HOLDER:
				return FleetPackage.CAR__VERSION_HOLDER;
			case TemporalPackage.TEMPORAL__VERSION_HOLDER_CONTAINMENT:
				return FleetPackage.CAR__VERSION_HOLDER_CONTAINMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // CarImpl
