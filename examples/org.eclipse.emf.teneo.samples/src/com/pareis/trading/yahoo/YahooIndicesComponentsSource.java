/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooIndicesComponentsSource.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo;

import com.pareis.trading.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indices Components Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.pareis.trading.yahoo.YahooPackage#getYahooIndicesComponentsSource()
 * @model
 * @generated
 */
public interface YahooIndicesComponentsSource extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource <em>Indices Components Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' container reference.
	 * @see #setVendor(Yahoo)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahooIndicesComponentsSource_Vendor()
	 * @see com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource
	 * @model opposite="indicesComponentsSource"
	 * @generated
	 */
	Yahoo getVendor();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor <em>Vendor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' container reference.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Yahoo value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToAllStockIndices();

} // YahooIndicesComponentsSource