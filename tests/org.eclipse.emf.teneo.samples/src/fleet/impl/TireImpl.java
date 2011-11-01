/**
 * <copyright>
 * </copyright>
 *
 * $Id: TireImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.FleetPackage;
import fleet.Tire;

import org.eclipse.emf.ecore.EClass;

import temporal.mod.TemporalBaseEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.TireImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link fleet.impl.TireImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link fleet.impl.TireImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link fleet.impl.TireImpl#getMake <em>Make</em>}</li>
 *   <li>{@link fleet.impl.TireImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TireImpl extends TemporalBaseEObjectImpl implements Tire {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.TIRE;
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
	public int getRadius() {
		return ((Integer)eGet(FleetPackage.Literals.TIRE__RADIUS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(int newRadius) {
		eSet(FleetPackage.Literals.TIRE__RADIUS, new Integer(newRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return ((Integer)eGet(FleetPackage.Literals.TIRE__WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(FleetPackage.Literals.TIRE__WIDTH, new Integer(newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProfile() {
		return ((Integer)eGet(FleetPackage.Literals.TIRE__PROFILE, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(int newProfile) {
		eSet(FleetPackage.Literals.TIRE__PROFILE, new Integer(newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMake() {
		return (String)eGet(FleetPackage.Literals.TIRE__MAKE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		eSet(FleetPackage.Literals.TIRE__MAKE, newMake);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return (String)eGet(FleetPackage.Literals.TIRE__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		eSet(FleetPackage.Literals.TIRE__MODEL, newModel);
	}

} //TireImpl
