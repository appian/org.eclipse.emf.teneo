/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Address;
import fleet.FleetPackage;
import fleet.Person;
import fleet.VehicleInfo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import temporal.impl.TemporalImpl;
import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Person</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fleet.impl.PersonImpl#getId <em>Id</em>}</li>
 * <li>{@link fleet.impl.PersonImpl#getName <em>Name</em>}</li>
 * <li>{@link fleet.impl.PersonImpl#isEmployed <em>Employed</em>}</li>
 * <li>{@link fleet.impl.PersonImpl#getAddresses <em>Addresses</em>}</li>
 * <li>{@link fleet.impl.PersonImpl#getOwnedVehicles <em>Owned Vehicles</em>}</li>
 * <li>{@link fleet.impl.PersonImpl#getBirthAddress <em>Birth Address</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PersonImpl extends TemporalImpl implements Person {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return (String) eGet(FleetPackage.Literals.PERSON__ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		eSet(FleetPackage.Literals.PERSON__ID, newId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(FleetPackage.Literals.PERSON__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(FleetPackage.Literals.PERSON__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEmployed() {
		return ((Boolean) eGet(FleetPackage.Literals.PERSON__EMPLOYED, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEmployed(boolean newEmployed) {
		eSet(FleetPackage.Literals.PERSON__EMPLOYED, new Boolean(newEmployed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getAddresses() {
		return (EList) eGet(FleetPackage.Literals.PERSON__ADDRESSES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getOwnedVehicles() {
		return (EList) eGet(FleetPackage.Literals.PERSON__OWNED_VEHICLES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Address getBirthAddress() {
		return (Address) eGet(FleetPackage.Literals.PERSON__BIRTH_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBirthAddress(Address newBirthAddress) {
		eSet(FleetPackage.Literals.PERSON__BIRTH_ADDRESS, newBirthAddress);
	}

} // PersonImpl
