/**
 * <copyright>
 * </copyright>
 *
 * $Id: VinImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.Vehicle;
import fleet.Vin;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.VinImpl#getId <em>Id</em>}</li>
 *   <li>{@link fleet.impl.VinImpl#getInstallationDate <em>Installation Date</em>}</li>
 *   <li>{@link fleet.impl.VinImpl#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VinImpl extends TemporalBaseEObjectImpl implements Vin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.VIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(FleetPackage.Literals.VIN__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(FleetPackage.Literals.VIN__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInstallationDate() {
		return (Date)eGet(FleetPackage.Literals.VIN__INSTALLATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstallationDate(Date newInstallationDate) {
		eSet(FleetPackage.Literals.VIN__INSTALLATION_DATE, newInstallationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		return (Vehicle)eGet(FleetPackage.Literals.VIN__VEHICLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		eSet(FleetPackage.Literals.VIN__VEHICLE, newVehicle);
	}

} //VinImpl
