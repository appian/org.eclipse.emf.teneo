/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.Address;
import fleet.FleetPackage;

import org.eclipse.emf.ecore.EClass;

import temporal.impl.TemporalImpl;
import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.AddressImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link fleet.impl.AddressImpl#getStreetNumber <em>Street Number</em>}</li>
 *   <li>{@link fleet.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link fleet.impl.AddressImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressImpl extends TemporalImpl implements Address {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName() {
		return (String)eGet(FleetPackage.Literals.ADDRESS__STREET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName) {
		eSet(FleetPackage.Literals.ADDRESS__STREET_NAME, newStreetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetNumber() {
		return (String)eGet(FleetPackage.Literals.ADDRESS__STREET_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetNumber(String newStreetNumber) {
		eSet(FleetPackage.Literals.ADDRESS__STREET_NUMBER, newStreetNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return (String)eGet(FleetPackage.Literals.ADDRESS__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		eSet(FleetPackage.Literals.ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return (String)eGet(FleetPackage.Literals.ADDRESS__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		eSet(FleetPackage.Literals.ADDRESS__COUNTRY, newCountry);
	}

} //AddressImpl
