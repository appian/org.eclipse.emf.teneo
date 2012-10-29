/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManufacturingPlantImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Address;
import fleet.Fleet;
import fleet.FleetPackage;
import fleet.ManufacturingPlant;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Manufacturing Plant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fleet.impl.ManufacturingPlantImpl#getId <em>Id</em>}</li>
 * <li>{@link fleet.impl.ManufacturingPlantImpl#getName <em>Name</em>}</li>
 * <li>{@link fleet.impl.ManufacturingPlantImpl#getAddress <em>Address</em>}</li>
 * <li>{@link fleet.impl.ManufacturingPlantImpl#getTransportFleet <em>Transport Fleet</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ManufacturingPlantImpl extends TemporalBaseEObjectImpl implements ManufacturingPlant {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ManufacturingPlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.MANUFACTURING_PLANT;
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
	public String getId() {
		return (String) eGet(FleetPackage.Literals.MANUFACTURING_PLANT__ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		eSet(FleetPackage.Literals.MANUFACTURING_PLANT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(FleetPackage.Literals.MANUFACTURING_PLANT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(FleetPackage.Literals.MANUFACTURING_PLANT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Address getAddress() {
		return (Address) eGet(FleetPackage.Literals.MANUFACTURING_PLANT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		eSet(FleetPackage.Literals.MANUFACTURING_PLANT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Fleet getTransportFleet() {
		return (Fleet) eGet(FleetPackage.Literals.MANUFACTURING_PLANT__TRANSPORT_FLEET, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTransportFleet(Fleet newTransportFleet) {
		eSet(FleetPackage.Literals.MANUFACTURING_PLANT__TRANSPORT_FLEET, newTransportFleet);
	}

} // ManufacturingPlantImpl
