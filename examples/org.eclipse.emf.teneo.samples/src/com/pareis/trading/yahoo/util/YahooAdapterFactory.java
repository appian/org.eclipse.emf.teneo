/**
 * <copyright>
 * </copyright>
 *
 * $Id: YahooAdapterFactory.java,v 1.1 2006/11/07 10:22:28 mtaal Exp $
 */
package com.pareis.trading.yahoo.util;

import com.pareis.trading.Identifiable;

import com.pareis.trading.yahoo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.pareis.trading.yahoo.YahooPackage
 * @generated
 */
public class YahooAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static YahooPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YahooAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = YahooPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YahooSwitch modelSwitch =
		new YahooSwitch() {
			public Object caseYahoo(Yahoo object) {
				return createYahooAdapter();
			}
			public Object caseYahooIndicesComponentsSource(YahooIndicesComponentsSource object) {
				return createYahooIndicesComponentsSourceAdapter();
			}
			public Object caseYahooIndicesSeed(YahooIndicesSeed object) {
				return createYahooIndicesSeedAdapter();
			}
			public Object caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.pareis.trading.yahoo.Yahoo <em>Yahoo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.pareis.trading.yahoo.Yahoo
	 * @generated
	 */
	public Adapter createYahooAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.pareis.trading.yahoo.YahooIndicesComponentsSource <em>Indices Components Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.pareis.trading.yahoo.YahooIndicesComponentsSource
	 * @generated
	 */
	public Adapter createYahooIndicesComponentsSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.pareis.trading.yahoo.YahooIndicesSeed <em>Indices Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.pareis.trading.yahoo.YahooIndicesSeed
	 * @generated
	 */
	public Adapter createYahooIndicesSeedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.pareis.trading.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.pareis.trading.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //YahooAdapterFactory
