/**
 * <copyright>
 * </copyright>
 *
 * $Id: Client.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading;

import com.pareis.trading.yahoo.Yahoo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Mandant or a Client
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.pareis.trading.Client#getSystem <em>System</em>}</li>
 *   <li>{@link com.pareis.trading.Client#getVendors <em>Vendors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.pareis.trading.TradingPackage#getClient()
 * @model
 * @generated
 */
public interface Client extends Identifiable {
	/**
	 * Returns the value of the '<em><b>System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.System#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' container reference.
	 * @see #setSystem(com.pareis.trading.System)
	 * @see com.pareis.trading.TradingPackage#getClient_System()
	 * @see com.pareis.trading.System#getClients
	 * @model opposite="clients"
	 * @generated
	 */
	com.pareis.trading.System getSystem();

	/**
	 * Sets the value of the '{@link com.pareis.trading.Client#getSystem <em>System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' container reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(com.pareis.trading.System value);

	/**
	 * Returns the value of the '<em><b>Vendors</b></em>' containment reference list.
	 * The list contents are of type {@link com.pareis.trading.yahoo.Yahoo}.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.yahoo.Yahoo#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendors</em>' containment reference list.
	 * @see com.pareis.trading.TradingPackage#getClient_Vendors()
	 * @see com.pareis.trading.yahoo.Yahoo#getClient
	 * @model type="com.pareis.trading.yahoo.Yahoo" opposite="Client" containment="true"
	 * @generated
	 */
	EList getVendors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Yahoo createDefaultStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createYahooStructureAndSeed();

} // Client