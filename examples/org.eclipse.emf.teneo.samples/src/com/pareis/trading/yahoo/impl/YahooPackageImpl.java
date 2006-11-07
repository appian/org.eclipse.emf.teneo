/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooPackageImpl.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading.yahoo.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.pareis.trading.TradingPackage;
import com.pareis.trading.impl.TradingPackageImpl;
import com.pareis.trading.yahoo.Yahoo;
import com.pareis.trading.yahoo.YahooFactory;
import com.pareis.trading.yahoo.YahooIndicesComponentsSource;
import com.pareis.trading.yahoo.YahooIndicesSeed;
import com.pareis.trading.yahoo.YahooPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YahooPackageImpl extends EPackageImpl implements YahooPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yahooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yahooIndicesComponentsSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yahooIndicesSeedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.pareis.trading.yahoo.YahooPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private YahooPackageImpl() {
		super(eNS_URI, YahooFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static YahooPackage init() {
		if (isInited) return (YahooPackage)EPackage.Registry.INSTANCE.getEPackage(YahooPackage.eNS_URI);

		// Obtain or create and register package
		YahooPackageImpl theYahooPackage = (YahooPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof YahooPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new YahooPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TradingPackageImpl theTradingPackage = (TradingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TradingPackage.eNS_URI) instanceof TradingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TradingPackage.eNS_URI) : TradingPackage.eINSTANCE);

		// Create package meta-data objects
		theYahooPackage.createPackageContents();
		theTradingPackage.createPackageContents();

		// Initialize created meta-data
		theYahooPackage.initializePackageContents();
		theTradingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theYahooPackage.freeze();

		return theYahooPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYahoo() {
		return yahooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYahoo_IndicesComponentsSource() {
		return (EReference)yahooEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYahoo_IndicesSeed() {
		return (EReference)yahooEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYahoo_Client() {
		return (EReference)yahooEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYahooIndicesComponentsSource() {
		return yahooIndicesComponentsSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYahooIndicesComponentsSource_Vendor() {
		return (EReference)yahooIndicesComponentsSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYahooIndicesSeed() {
		return yahooIndicesSeedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYahooIndicesSeed_SeedSymbols() {
		return (EAttribute)yahooIndicesSeedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYahooIndicesSeed_Vendor() {
		return (EReference)yahooIndicesSeedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooFactory getYahooFactory() {
		return (YahooFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yahooEClass = createEClass(YAHOO);
		createEReference(yahooEClass, YAHOO__INDICES_COMPONENTS_SOURCE);
		createEReference(yahooEClass, YAHOO__INDICES_SEED);
		createEReference(yahooEClass, YAHOO__CLIENT);

		yahooIndicesComponentsSourceEClass = createEClass(YAHOO_INDICES_COMPONENTS_SOURCE);
		createEReference(yahooIndicesComponentsSourceEClass, YAHOO_INDICES_COMPONENTS_SOURCE__VENDOR);

		yahooIndicesSeedEClass = createEClass(YAHOO_INDICES_SEED);
		createEAttribute(yahooIndicesSeedEClass, YAHOO_INDICES_SEED__SEED_SYMBOLS);
		createEReference(yahooIndicesSeedEClass, YAHOO_INDICES_SEED__VENDOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TradingPackage theTradingPackage = (TradingPackage)EPackage.Registry.INSTANCE.getEPackage(TradingPackage.eNS_URI);

		// Add supertypes to classes
		yahooEClass.getESuperTypes().add(theTradingPackage.getIdentifiable());
		yahooIndicesComponentsSourceEClass.getESuperTypes().add(theTradingPackage.getIdentifiable());
		yahooIndicesSeedEClass.getESuperTypes().add(theTradingPackage.getIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(yahooEClass, Yahoo.class, "Yahoo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYahoo_IndicesComponentsSource(), this.getYahooIndicesComponentsSource(), this.getYahooIndicesComponentsSource_Vendor(), "indicesComponentsSource", null, 0, 1, Yahoo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYahoo_IndicesSeed(), this.getYahooIndicesSeed(), this.getYahooIndicesSeed_Vendor(), "indicesSeed", null, 0, 1, Yahoo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYahoo_Client(), theTradingPackage.getClient(), theTradingPackage.getClient_Vendors(), "Client", null, 0, 1, Yahoo.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yahooIndicesComponentsSourceEClass, YahooIndicesComponentsSource.class, "YahooIndicesComponentsSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYahooIndicesComponentsSource_Vendor(), this.getYahoo(), this.getYahoo_IndicesComponentsSource(), "vendor", null, 0, 1, YahooIndicesComponentsSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yahooIndicesComponentsSourceEClass, null, "addToAllStockIndices");

		initEClass(yahooIndicesSeedEClass, YahooIndicesSeed.class, "YahooIndicesSeed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYahooIndicesSeed_SeedSymbols(), ecorePackage.getEString(), "seedSymbols", "^NDX ^DJI ^DJA ^NJ ^GSPC", 0, 1, YahooIndicesSeed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYahooIndicesSeed_Vendor(), this.getYahoo(), this.getYahoo_IndicesSeed(), "vendor", null, 0, 1, YahooIndicesSeed.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yahooIndicesSeedEClass, null, "seed");
	}

} //YahooPackageImpl
