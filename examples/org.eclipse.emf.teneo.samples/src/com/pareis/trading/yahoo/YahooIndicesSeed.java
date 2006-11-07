/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooIndicesSeed.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo;

import com.pareis.trading.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indices Seed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.pareis.trading.yahoo.YahooIndicesSeed#getSeedSymbols <em>Seed Symbols</em>}</li>
 *   <li>{@link com.pareis.trading.yahoo.YahooIndicesSeed#getVendor <em>Vendor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.pareis.trading.yahoo.YahooPackage#getYahooIndicesSeed()
 * @model
 * @generated
 */
public interface YahooIndicesSeed extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Seed Symbols</b></em>' attribute.
	 * The default value is <code>"^NDX ^DJI ^DJA ^NJ ^GSPC"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the symbols have to be separated by space
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seed Symbols</em>' attribute.
	 * @see #setSeedSymbols(String)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahooIndicesSeed_SeedSymbols()
	 * @model default="^NDX ^DJI ^DJA ^NJ ^GSPC"
	 * @generated
	 */
	String getSeedSymbols();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.YahooIndicesSeed#getSeedSymbols <em>Seed Symbols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Symbols</em>' attribute.
	 * @see #getSeedSymbols()
	 * @generated
	 */
	void setSeedSymbols(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.pareis.trading.yahoo.Yahoo#getIndicesSeed <em>Indices Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' container reference.
	 * @see #setVendor(Yahoo)
	 * @see com.pareis.trading.yahoo.YahooPackage#getYahooIndicesSeed_Vendor()
	 * @see com.pareis.trading.yahoo.Yahoo#getIndicesSeed
	 * @model opposite="indicesSeed"
	 * @generated
	 */
	Yahoo getVendor();

	/**
	 * Sets the value of the '{@link com.pareis.trading.yahoo.YahooIndicesSeed#getVendor <em>Vendor</em>}' container reference.
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
	void seed();

} // YahooIndicesSeed