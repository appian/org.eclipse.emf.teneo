/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainAdapterFactory.java,v 1.1 2006/09/21 00:56:53 mtaal Exp $
 */
package main.util;

import main.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * 
 * @see main.MainPackage
 * @generated
 */
public class MainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static MainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MainPackage.eINSTANCE;
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
	protected MainSwitch modelSwitch = new MainSwitch() {
		public Object caseChildObject2(ChildObject2 object) {
			return createChildObject2Adapter();
		}

		public Object caseChildObject1(ChildObject1 object) {
			return createChildObject1Adapter();
		}

		public Object caseBaseObject(BaseObject object) {
			return createBaseObjectAdapter();
		}

		public Object caseBaseGroup(BaseGroup object) {
			return createBaseGroupAdapter();
		}

		public Object caseBaseComponent(BaseComponent object) {
			return createBaseComponentAdapter();
		}

		public Object caseChildObject3(ChildObject3 object) {
			return createChildObject3Adapter();
		}

		public Object caseChildObject4(ChildObject4 object) {
			return createChildObject4Adapter();
		}

		public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.ChildObject2 <em>Child Object2</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.ChildObject2
	 * @generated
	 */
	public Adapter createChildObject2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.ChildObject1 <em>Child Object1</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.ChildObject1
	 * @generated
	 */
	public Adapter createChildObject1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.BaseObject
	 * @generated
	 */
	public Adapter createBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.BaseGroup <em>Base Group</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.BaseGroup
	 * @generated
	 */
	public Adapter createBaseGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.BaseComponent
	 * <em>Base Component</em>}'. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
	 * the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.BaseComponent
	 * @generated
	 */
	public Adapter createBaseComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.ChildObject3 <em>Child Object3</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.ChildObject3
	 * @generated
	 */
	public Adapter createChildObject3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link main.ChildObject4 <em>Child Object4</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see main.ChildObject4
	 * @generated
	 */
	public Adapter createChildObject4Adapter() {
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

} // MainAdapterFactory
