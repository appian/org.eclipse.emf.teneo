/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooFactoryImpl.java,v 1.1 2006/11/07 10:22:27 mtaal Exp $
 */
package com.pareis.trading.yahoo.impl;

import com.pareis.trading.yahoo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YahooFactoryImpl extends EFactoryImpl implements YahooFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YahooFactory init() {
		try {
			YahooFactory theYahooFactory = (YahooFactory)EPackage.Registry.INSTANCE.getEFactory("http:///com/pareis/trading/yahoo.ecore"); 
			if (theYahooFactory != null) {
				return theYahooFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YahooFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case YahooPackage.YAHOO: return createYahoo();
			case YahooPackage.YAHOO_INDICES_COMPONENTS_SOURCE: return createYahooIndicesComponentsSource();
			case YahooPackage.YAHOO_INDICES_SEED: return createYahooIndicesSeed();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Yahoo createYahoo() {
		YahooImpl yahoo = new YahooImpl();
		return yahoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooIndicesComponentsSource createYahooIndicesComponentsSource() {
		YahooIndicesComponentsSourceImpl yahooIndicesComponentsSource = new YahooIndicesComponentsSourceImpl();
		return yahooIndicesComponentsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooIndicesSeed createYahooIndicesSeed() {
		YahooIndicesSeedImpl yahooIndicesSeed = new YahooIndicesSeedImpl();
		return yahooIndicesSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooPackage getYahooPackage() {
		return (YahooPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static YahooPackage getPackage() {
		return YahooPackage.eINSTANCE;
	}

} //YahooFactoryImpl
