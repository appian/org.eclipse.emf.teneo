/**
 * <copyright>
 * </copyright>
 *
 * $Id: Tire.java,v 1.1 2008/04/17 11:33:39 mtaal Exp $
 */
package fleet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tire</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fleet.Tire#getRadius <em>Radius</em>}</li>
 * <li>{@link fleet.Tire#getWidth <em>Width</em>}</li>
 * <li>{@link fleet.Tire#getProfile <em>Profile</em>}</li>
 * <li>{@link fleet.Tire#getMake <em>Make</em>}</li>
 * <li>{@link fleet.Tire#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fleet.FleetPackage#getTire()
 * @model
 * @generated
 */
public interface Tire extends EObject {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see fleet.FleetPackage#getTire_Radius()
	 * @model
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link fleet.Tire#getRadius <em>Radius</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see fleet.FleetPackage#getTire_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link fleet.Tire#getWidth <em>Width</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Profile</em>' attribute.
	 * @see #setProfile(int)
	 * @see fleet.FleetPackage#getTire_Profile()
	 * @model
	 * @generated
	 */
	int getProfile();

	/**
	 * Sets the value of the '{@link fleet.Tire#getProfile <em>Profile</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Profile</em>' attribute.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(int value);

	/**
	 * Returns the value of the '<em><b>Make</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Make</em>' attribute.
	 * @see #setMake(String)
	 * @see fleet.FleetPackage#getTire_Make()
	 * @model
	 * @generated
	 */
	String getMake();

	/**
	 * Sets the value of the '{@link fleet.Tire#getMake <em>Make</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Make</em>' attribute.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see fleet.FleetPackage#getTire_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link fleet.Tire#getModel <em>Model</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // Tire
