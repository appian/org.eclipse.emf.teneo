/**
 * <copyright>
 * </copyright>
 *
 * $Id: HybridImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.Hybrid;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.HybridImpl#isHasRechargePlug <em>Has Recharge Plug</em>}</li>
 *   <li>{@link fleet.impl.HybridImpl#getBatteryLife <em>Battery Life</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HybridImpl extends CarImpl implements Hybrid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.HYBRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasRechargePlug() {
		return ((Boolean)eGet(FleetPackage.Literals.HYBRID__HAS_RECHARGE_PLUG, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRechargePlug(boolean newHasRechargePlug) {
		eSet(FleetPackage.Literals.HYBRID__HAS_RECHARGE_PLUG, new Boolean(newHasRechargePlug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBatteryLife() {
		return ((Integer)eGet(FleetPackage.Literals.HYBRID__BATTERY_LIFE, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryLife(int newBatteryLife) {
		eSet(FleetPackage.Literals.HYBRID__BATTERY_LIFE, new Integer(newBatteryLife));
	}

} //HybridImpl
