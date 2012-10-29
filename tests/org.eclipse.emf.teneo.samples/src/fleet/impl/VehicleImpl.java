/**
 * <copyright>
 * </copyright>
 *
 * $Id: VehicleImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.ManufacturingPlant;
import fleet.Person;
import fleet.Tire;
import fleet.Vehicle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Vehicle</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fleet.impl.VehicleImpl#getBrand <em>Brand</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getModel <em>Model</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getMake <em>Make</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getColor <em>Color</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getPlate <em>Plate</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getId <em>Id</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getYear <em>Year</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getLength <em>Length</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getAvailableColors <em>Available Colors</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getOwner <em>Owner</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getManufacturedAt <em>Manufactured At</em>}</li>
 * <li>{@link fleet.impl.VehicleImpl#getTireSpec <em>Tire Spec</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VehicleImpl extends TemporalBaseEObjectImpl implements Vehicle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.VEHICLE;
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

} // VehicleImpl
