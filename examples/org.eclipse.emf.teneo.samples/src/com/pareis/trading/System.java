/**
 * <copyright>
 * </copyright>
 *
 * $Id: System.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * global singleton, representing the system or the application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.pareis.trading.System#getClients <em>Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.pareis.trading.TradingPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link com.pareis.trading.Client}.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.Client#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see com.pareis.trading.TradingPackage#getSystem_Clients()
	 * @see com.pareis.trading.Client#getSystem
	 * @model type="com.pareis.trading.Client" opposite="System" containment="true"
	 * @generated
	 */
	EList getClients();

} // System