/**
 * <copyright>
 * </copyright>
 *
 * $Id: Yahoo.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo;

import com.pareis.trading.Client;
import com.pareis.trading.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Yahoo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource <em>Indices Components Source</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.Yahoo#getIndicesSeed <em>Indices Seed</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.Yahoo#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.pareis.trading.yahoo.YahooPackage#getYahoo()
 * @model
 * @generated
 */
public interface Yahoo extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Indices Components Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices Components Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices Components Source</em>' containment reference.
	 * @see #setIndicesComponentsSource(YahooIndicesComponentsSource)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahoo_IndicesComponentsSource()
	 * @see com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor
	 * @model opposite="vendor" containment="true"
	 * @generated
	 */
	YahooIndicesComponentsSource getIndicesComponentsSource();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource <em>Indices Components Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indices Components Source</em>' containment reference.
	 * @see #getIndicesComponentsSource()
	 * @generated
	 */
	void setIndicesComponentsSource(YahooIndicesComponentsSource value);

	/**
	 * Returns the value of the '<em><b>Indices Seed</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.yahoo.YahooIndicesSeed#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices Seed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices Seed</em>' containment reference.
	 * @see #setIndicesSeed(YahooIndicesSeed)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahoo_IndicesSeed()
	 * @see com.pareis.trading.yahoo.YahooIndicesSeed#getVendor
	 * @model opposite="vendor" containment="true"
	 * @generated
	 */
	YahooIndicesSeed getIndicesSeed();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.Yahoo#getIndicesSeed <em>Indices Seed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indices Seed</em>' containment reference.
	 * @see #getIndicesSeed()
	 * @generated
	 */
	void setIndicesSeed(YahooIndicesSeed value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.Client#getVendors <em>Vendors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' container reference.
	 * @see #setClient(Client)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahoo_Client()
	 * @see com.pareis.trading.Client#getVendors
	 * @model opposite="vendors"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.Yahoo#getClient <em>Client</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' container reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

} // Yahoo