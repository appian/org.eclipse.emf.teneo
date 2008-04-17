/**
 * <copyright>
 * </copyright>
 *
 * $Id: EngineFactoryImpl.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet.impl;

import fleet.EngineFactory;
import fleet.FleetPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fleet.impl.EngineFactoryImpl#isMakesDieselEngines <em>Makes Diesel Engines</em>}</li>
 *   <li>{@link fleet.impl.EngineFactoryImpl#getBrands <em>Brands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EngineFactoryImpl extends ManufacturingPlantImpl implements EngineFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FleetPackage.Literals.ENGINE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMakesDieselEngines() {
		return ((Boolean)eGet(FleetPackage.Literals.ENGINE_FACTORY__MAKES_DIESEL_ENGINES, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakesDieselEngines(boolean newMakesDieselEngines) {
		eSet(FleetPackage.Literals.ENGINE_FACTORY__MAKES_DIESEL_ENGINES, new Boolean(newMakesDieselEngines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList getBrands() {
		return (EList)eGet(FleetPackage.Literals.ENGINE_FACTORY__BRANDS, true);
	}

} //EngineFactoryImpl
