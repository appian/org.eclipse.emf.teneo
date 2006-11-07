/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooPackage.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo;

import com.pareis.trading.TradingPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.pareis.trading.yahoo.YahooFactory
 * @model kind="package"
 * @generated
 */
public interface YahooPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yahoo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/pareis/trading/yahoo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.pareis.trading.yahoo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YahooPackage eINSTANCE = com.pareis.trading.yahoo.impl.YahooPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.pareis.trading.yahoo.impl.YahooImpl <em>Yahoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pareis.trading.yahoo.impl.YahooImpl
	 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahoo()
	 * @generated
	 */
	int YAHOO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO__ID = TradingPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Indices Components Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO__INDICES_COMPONENTS_SOURCE = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indices Seed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO__INDICES_SEED = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO__CLIENT = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Yahoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_FEATURE_COUNT = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl <em>Indices Components Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl
	 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahooIndicesComponentsSource()
	 * @generated
	 */
	int YAHOO_INDICES_COMPONENTS_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_COMPONENTS_SOURCE__ID = TradingPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Indices Components Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_COMPONENTS_SOURCE_FEATURE_COUNT = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.pareis.trading.yahoo.impl.YahooIndicesSeedImpl <em>Indices Seed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.pareis.trading.yahoo.impl.YahooIndicesSeedImpl
	 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahooIndicesSeed()
	 * @generated
	 */
	int YAHOO_INDICES_SEED = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_SEED__ID = TradingPackage.IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Seed Symbols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_SEED__SEED_SYMBOLS = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_SEED__VENDOR = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indices Seed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YAHOO_INDICES_SEED_FEATURE_COUNT = TradingPackage.IDENTIFIABLE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link com.pareis.trading.yahoo.Yahoo <em>Yahoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yahoo</em>'.
	 * @see com.pareis.trading.yahoo.Yahoo
	 * @generated
	 */
	EClass getYahoo();

	/**
	 * Returns the meta object for the containment reference '{@link com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource <em>Indices Components Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indices Components Source</em>'.
	 * @see com.pareis.trading.yahoo.Yahoo#getIndicesComponentsSource()
	 * @see #getYahoo()
	 * @generated
	 */
	EReference getYahoo_IndicesComponentsSource();

	/**
	 * Returns the meta object for the containment reference '{@link com.pareis.trading.yahoo.Yahoo#getIndicesSeed <em>Indices Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indices Seed</em>'.
	 * @see com.pareis.trading.yahoo.Yahoo#getIndicesSeed()
	 * @see #getYahoo()
	 * @generated
	 */
	EReference getYahoo_IndicesSeed();

	/**
	 * Returns the meta object for the container reference '{@link com.pareis.trading.yahoo.Yahoo#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Client</em>'.
	 * @see com.pareis.trading.yahoo.Yahoo#getClient()
	 * @see #getYahoo()
	 * @generated
	 */
	EReference getYahoo_Client();

	/**
	 * Returns the meta object for class '{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource <em>Indices Components Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indices Components Source</em>'.
	 * @see com.pareis.trading.yahoo.YahooIndicesComponentsSource
	 * @generated
	 */
	EClass getYahooIndicesComponentsSource();

	/**
	 * Returns the meta object for the container reference '{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vendor</em>'.
	 * @see com.pareis.trading.yahoo.YahooIndicesComponentsSource#getVendor()
	 * @see #getYahooIndicesComponentsSource()
	 * @generated
	 */
	EReference getYahooIndicesComponentsSource_Vendor();

	/**
	 * Returns the meta object for class '{@link com.pareis.trading.yahoo.YahooIndicesSeed <em>Indices Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indices Seed</em>'.
	 * @see com.pareis.trading.yahoo.YahooIndicesSeed
	 * @generated
	 */
	EClass getYahooIndicesSeed();

	/**
	 * Returns the meta object for the attribute '{@link com.pareis.trading.yahoo.YahooIndicesSeed#getSeedSymbols <em>Seed Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Symbols</em>'.
	 * @see com.pareis.trading.yahoo.YahooIndicesSeed#getSeedSymbols()
	 * @see #getYahooIndicesSeed()
	 * @generated
	 */
	EAttribute getYahooIndicesSeed_SeedSymbols();

	/**
	 * Returns the meta object for the container reference '{@link com.pareis.trading.yahoo.YahooIndicesSeed#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vendor</em>'.
	 * @see com.pareis.trading.yahoo.YahooIndicesSeed#getVendor()
	 * @see #getYahooIndicesSeed()
	 * @generated
	 */
	EReference getYahooIndicesSeed_Vendor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YahooFactory getYahooFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link com.pareis.trading.yahoo.impl.YahooImpl <em>Yahoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pareis.trading.yahoo.impl.YahooImpl
		 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahoo()
		 * @generated
		 */
		EClass YAHOO = eINSTANCE.getYahoo();

		/**
		 * The meta object literal for the '<em><b>Indices Components Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAHOO__INDICES_COMPONENTS_SOURCE = eINSTANCE.getYahoo_IndicesComponentsSource();

		/**
		 * The meta object literal for the '<em><b>Indices Seed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAHOO__INDICES_SEED = eINSTANCE.getYahoo_IndicesSeed();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAHOO__CLIENT = eINSTANCE.getYahoo_Client();

		/**
		 * The meta object literal for the '{@link com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl <em>Indices Components Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pareis.trading.yahoo.impl.YahooIndicesComponentsSourceImpl
		 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahooIndicesComponentsSource()
		 * @generated
		 */
		EClass YAHOO_INDICES_COMPONENTS_SOURCE = eINSTANCE.getYahooIndicesComponentsSource();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR = eINSTANCE.getYahooIndicesComponentsSource_Vendor();

		/**
		 * The meta object literal for the '{@link com.pareis.trading.yahoo.impl.YahooIndicesSeedImpl <em>Indices Seed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.pareis.trading.yahoo.impl.YahooIndicesSeedImpl
		 * @see com.pareis.trading.yahoo.impl.YahooPackageImpl#getYahooIndicesSeed()
		 * @generated
		 */
		EClass YAHOO_INDICES_SEED = eINSTANCE.getYahooIndicesSeed();

		/**
		 * The meta object literal for the '<em><b>Seed Symbols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YAHOO_INDICES_SEED__SEED_SYMBOLS = eINSTANCE.getYahooIndicesSeed_SeedSymbols();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YAHOO_INDICES_SEED__VENDOR = eINSTANCE.getYahooIndicesSeed_Vendor();

	}

} //YahooPackage
