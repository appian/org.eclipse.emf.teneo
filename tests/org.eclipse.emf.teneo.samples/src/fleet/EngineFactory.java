/**
 * <copyright>
 * </copyright>
 *
 * $Id: EngineFactory.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fleet.EngineFactory#isMakesDieselEngines <em>Makes Diesel Engines</em>}</li>
 *   <li>{@link fleet.EngineFactory#getBrands <em>Brands</em>}</li>
 * </ul>
 * </p>
 *
 * @see fleet.FleetPackage#getEngineFactory()
 * @model
 * @generated
 */
public interface EngineFactory extends ManufacturingPlant {
	/**
	 * Returns the value of the '<em><b>Makes Diesel Engines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Makes Diesel Engines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Makes Diesel Engines</em>' attribute.
	 * @see #setMakesDieselEngines(boolean)
	 * @see fleet.FleetPackage#getEngineFactory_MakesDieselEngines()
	 * @model
	 * @generated
	 */
	boolean isMakesDieselEngines();

	/**
	 * Sets the value of the '{@link fleet.EngineFactory#isMakesDieselEngines <em>Makes Diesel Engines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Makes Diesel Engines</em>' attribute.
	 * @see #isMakesDieselEngines()
	 * @generated
	 */
	void setMakesDieselEngines(boolean value);

	/**
	 * Returns the value of the '<em><b>Brands</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brands</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brands</em>' attribute list.
	 * @see fleet.FleetPackage#getEngineFactory_Brands()
	 * @model required="true"
	 * @generated
	 */
	EList getBrands();

} // EngineFactory
