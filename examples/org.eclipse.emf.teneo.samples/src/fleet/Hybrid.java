/**
 * <copyright>
 * </copyright>
 *
 * $Id: Hybrid.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fleet.Hybrid#isHasRechargePlug <em>Has Recharge Plug</em>}</li>
 *   <li>{@link fleet.Hybrid#getBatteryLife <em>Battery Life</em>}</li>
 * </ul>
 * </p>
 *
 * @see fleet.FleetPackage#getHybrid()
 * @model
 * @generated
 */
public interface Hybrid extends Car, PassengerVehicle {
	/**
	 * Returns the value of the '<em><b>Has Recharge Plug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Recharge Plug</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Recharge Plug</em>' attribute.
	 * @see #setHasRechargePlug(boolean)
	 * @see fleet.FleetPackage#getHybrid_HasRechargePlug()
	 * @model
	 * @generated
	 */
	boolean isHasRechargePlug();

	/**
	 * Sets the value of the '{@link fleet.Hybrid#isHasRechargePlug <em>Has Recharge Plug</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Recharge Plug</em>' attribute.
	 * @see #isHasRechargePlug()
	 * @generated
	 */
	void setHasRechargePlug(boolean value);

	/**
	 * Returns the value of the '<em><b>Battery Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Life</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Life</em>' attribute.
	 * @see #setBatteryLife(int)
	 * @see fleet.FleetPackage#getHybrid_BatteryLife()
	 * @model
	 * @generated
	 */
	int getBatteryLife();

	/**
	 * Sets the value of the '{@link fleet.Hybrid#getBatteryLife <em>Battery Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Life</em>' attribute.
	 * @see #getBatteryLife()
	 * @generated
	 */
	void setBatteryLife(int value);

} // Hybrid
