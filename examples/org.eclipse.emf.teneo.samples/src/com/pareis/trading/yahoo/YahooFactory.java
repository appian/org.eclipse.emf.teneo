/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooFactory.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.pareis.trading.yahoo.YahooPackage
 * @generated
 */
public interface YahooFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YahooFactory eINSTANCE = com.pareis.trading.yahoo.impl.YahooFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Yahoo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yahoo</em>'.
	 * @generated
	 */
	Yahoo createYahoo();

	/**
	 * Returns a new object of class '<em>Indices Components Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indices Components Source</em>'.
	 * @generated
	 */
	YahooIndicesComponentsSource createYahooIndicesComponentsSource();

	/**
	 * Returns a new object of class '<em>Indices Seed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indices Seed</em>'.
	 * @generated
	 */
	YahooIndicesSeed createYahooIndicesSeed();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	YahooPackage getYahooPackage();

} //YahooFactory
