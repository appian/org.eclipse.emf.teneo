/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransportationDeviceImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.TransportationDevice;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transportation Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.TransportationDeviceImpl#getManufacturedBy <em>Manufactured By</em>}</li>
 *   <li>{@link fleet.impl.TransportationDeviceImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportationDeviceImpl extends TemporalBaseEObjectImpl implements TransportationDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportationDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.TRANSPORTATION_DEVICE;
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
	public String getManufacturedBy() {
		return (String)eGet(FleetPackage.Literals.TRANSPORTATION_DEVICE__MANUFACTURED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturedBy(String newManufacturedBy) {
		eSet(FleetPackage.Literals.TRANSPORTATION_DEVICE__MANUFACTURED_BY, newManufacturedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return ((Integer)eGet(FleetPackage.Literals.TRANSPORTATION_DEVICE__YEAR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		eSet(FleetPackage.Literals.TRANSPORTATION_DEVICE__YEAR, new Integer(newYear));
	}

} //TransportationDeviceImpl
