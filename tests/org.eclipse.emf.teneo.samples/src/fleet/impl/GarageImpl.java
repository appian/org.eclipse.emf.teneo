/**
 * <copyright>
 * </copyright>
 *
 * $Id: GarageImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Address;
import fleet.Fleet;
import fleet.FleetPackage;
import fleet.Garage;
import fleet.Vehicle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.impl.TemporalImpl;
import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Garage</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fleet.impl.GarageImpl#getVehicles <em>Vehicles</em>}</li>
 * <li>{@link fleet.impl.GarageImpl#getCustomerShuttles <em>Customer Shuttles</em>}</li>
 * <li>{@link fleet.impl.GarageImpl#getAddress <em>Address</em>}</li>
 * <li>{@link fleet.impl.GarageImpl#getFleetsUsingGarage <em>Fleets Using Garage</em>}</li>
 * <li>{@link fleet.impl.GarageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GarageImpl extends TemporalImpl implements Garage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GarageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.GARAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getVehicles() {
		return (EList) eGet(FleetPackage.Literals.GARAGE__VEHICLES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Fleet getCustomerShuttles() {
		return (Fleet) eGet(FleetPackage.Literals.GARAGE__CUSTOMER_SHUTTLES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCustomerShuttles(Fleet newCustomerShuttles) {
		eSet(FleetPackage.Literals.GARAGE__CUSTOMER_SHUTTLES, newCustomerShuttles);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Address getAddress() {
		return (Address) eGet(FleetPackage.Literals.GARAGE__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		eSet(FleetPackage.Literals.GARAGE__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getFleetsUsingGarage() {
		return (EList) eGet(FleetPackage.Literals.GARAGE__FLEETS_USING_GARAGE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(FleetPackage.Literals.GARAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(FleetPackage.Literals.GARAGE__NAME, newName);
	}

} // GarageImpl
