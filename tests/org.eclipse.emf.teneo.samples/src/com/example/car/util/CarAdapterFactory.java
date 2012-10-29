/**
 * <copyright>
 * </copyright>
 *
 * $Id: CarAdapterFactory.java,v 1.1 2007/08/10 20:17:32 mtaal Exp $
 */
package com.example.car.util;

import com.example.car.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see com.example.car.CarPackage
 * @generated
 */
public class CarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static CarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is
	 * an instance object of the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected CarSwitch<Adapter> modelSwitch = new CarSwitch<Adapter>() {
		@Override
		public Adapter caseCarFrame(CarFrame object) {
			return createCarFrameAdapter();
		}

		@Override
		public Adapter caseCarLink(CarLink object) {
			return createCarLinkAdapter();
		}

		@Override
		public Adapter caseCarsList(CarsList object) {
			return createCarsListAdapter();
		}

		@Override
		public Adapter caseCarTire(CarTire object) {
			return createCarTireAdapter();
		}

		@Override
		public Adapter caseCarType(CarType object) {
			return createCarTypeAdapter();
		}

		@Override
		public Adapter caseCarWheel(CarWheel object) {
			return createCarWheelAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *          the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarFrame
	 * @generated
	 */
	public Adapter createCarFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarLink <em>Link</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarLink
	 * @generated
	 */
	public Adapter createCarLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarsList
	 * <em>Cars List</em>}'. <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarsList
	 * @generated
	 */
	public Adapter createCarsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarTire <em>Tire</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarTire
	 * @generated
	 */
	public Adapter createCarTireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarType <em>Type</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarType
	 * @generated
	 */
	public Adapter createCarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.CarWheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.CarWheel
	 * @generated
	 */
	public Adapter createCarWheelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.example.car.DocumentRoot
	 * <em>Document Root</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see com.example.car.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation
	 * returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // CarAdapterFactory
