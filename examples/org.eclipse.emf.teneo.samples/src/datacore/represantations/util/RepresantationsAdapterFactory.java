/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepresantationsAdapterFactory.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore.represantations.util;

import datacore.CSMRepresentation;

import datacore.represantations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datacore.represantations.RepresantationsPackage
 * @generated
 */
public class RepresantationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepresantationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresantationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RepresantationsPackage.eINSTANCE;
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
	@Override
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
	protected RepresantationsSwitch<Adapter> modelSwitch =
		new RepresantationsSwitch<Adapter>() {
			@Override
			public Adapter caseCSMFileRepresentation(CSMFileRepresentation object) {
				return createCSMFileRepresentationAdapter();
			}
			@Override
			public Adapter caseCSMUrlRepresentation(CSMUrlRepresentation object) {
				return createCSMUrlRepresentationAdapter();
			}
			@Override
			public Adapter caseCSMRepresentation(CSMRepresentation object) {
				return createCSMRepresentationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link datacore.represantations.CSMFileRepresentation <em>CSM File Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.represantations.CSMFileRepresentation
	 * @generated
	 */
	public Adapter createCSMFileRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.represantations.CSMUrlRepresentation <em>CSM Url Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.represantations.CSMUrlRepresentation
	 * @generated
	 */
	public Adapter createCSMUrlRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMRepresentation <em>CSM Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMRepresentation
	 * @generated
	 */
	public Adapter createCSMRepresentationAdapter() {
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

} //RepresantationsAdapterFactory
