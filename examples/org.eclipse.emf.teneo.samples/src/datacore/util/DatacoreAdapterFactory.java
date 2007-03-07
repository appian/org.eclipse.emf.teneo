/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacoreAdapterFactory.java,v 1.1 2007/03/07 23:34:07 mtaal Exp $
 */
package datacore.util;

import datacore.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see datacore.DatacorePackage
 * @generated
 */
public class DatacoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatacorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatacorePackage.eINSTANCE;
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
	protected DatacoreSwitch<Adapter> modelSwitch =
		new DatacoreSwitch<Adapter>() {
			@Override
			public Adapter caseCSMXML(CSMXML object) {
				return createCSMXMLAdapter();
			}
			@Override
			public Adapter caseCSMElement(CSMElement object) {
				return createCSMElementAdapter();
			}
			@Override
			public Adapter caseCSMMetaElement(CSMMetaElement object) {
				return createCSMMetaElementAdapter();
			}
			@Override
			public Adapter caseCSMClass(CSMClass object) {
				return createCSMClassAdapter();
			}
			@Override
			public Adapter caseCSMCharacteristicDefinition(CSMCharacteristicDefinition object) {
				return createCSMCharacteristicDefinitionAdapter();
			}
			@Override
			public Adapter caseCSMInstance(CSMInstance object) {
				return createCSMInstanceAdapter();
			}
			@Override
			public Adapter caseCSMCharacteristicValueContainer(CSMCharacteristicValueContainer object) {
				return createCSMCharacteristicValueContainerAdapter();
			}
			@Override
			public Adapter caseCSMValueSet(CSMValueSet object) {
				return createCSMValueSetAdapter();
			}
			@Override
			public Adapter caseCSMType(CSMType object) {
				return createCSMTypeAdapter();
			}
			@Override
			public Adapter caseCSMObject(CSMObject object) {
				return createCSMObjectAdapter();
			}
			@Override
			public Adapter caseCSMRepresentationRoot(CSMRepresentationRoot object) {
				return createCSMRepresentationRootAdapter();
			}
			@Override
			public Adapter caseCSMValue(CSMValue object) {
				return createCSMValueAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseUserProperty(UserProperty object) {
				return createUserPropertyAdapter();
			}
			@Override
			public Adapter caseCSMRepresentation(CSMRepresentation object) {
				return createCSMRepresentationAdapter();
			}
			@Override
			public Adapter caseDataSourceDefinitions(DataSourceDefinitions object) {
				return createDataSourceDefinitionsAdapter();
			}
			@Override
			public Adapter caseColumnDefinition(ColumnDefinition object) {
				return createColumnDefinitionAdapter();
			}
			@Override
			public Adapter caseCSMRepresentationRootDescriptor(CSMRepresentationRootDescriptor object) {
				return createCSMRepresentationRootDescriptorAdapter();
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
	 * Creates a new adapter for an object of class '{@link datacore.CSMXML <em>CSMXML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMXML
	 * @generated
	 */
	public Adapter createCSMXMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMElement <em>CSM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMElement
	 * @generated
	 */
	public Adapter createCSMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMMetaElement <em>CSM Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMMetaElement
	 * @generated
	 */
	public Adapter createCSMMetaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMClass <em>CSM Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMClass
	 * @generated
	 */
	public Adapter createCSMClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMCharacteristicDefinition <em>CSM Characteristic Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMCharacteristicDefinition
	 * @generated
	 */
	public Adapter createCSMCharacteristicDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMInstance <em>CSM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMInstance
	 * @generated
	 */
	public Adapter createCSMInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMCharacteristicValueContainer <em>CSM Characteristic Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMCharacteristicValueContainer
	 * @generated
	 */
	public Adapter createCSMCharacteristicValueContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMValueSet <em>CSM Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMValueSet
	 * @generated
	 */
	public Adapter createCSMValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMType <em>CSM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMType
	 * @generated
	 */
	public Adapter createCSMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMObject <em>CSM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMObject
	 * @generated
	 */
	public Adapter createCSMObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMRepresentationRoot <em>CSM Representation Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMRepresentationRoot
	 * @generated
	 */
	public Adapter createCSMRepresentationRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMValue <em>CSM Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMValue
	 * @generated
	 */
	public Adapter createCSMValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.UserProperty <em>User Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.UserProperty
	 * @generated
	 */
	public Adapter createUserPropertyAdapter() {
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
	 * Creates a new adapter for an object of class '{@link datacore.DataSourceDefinitions <em>Data Source Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.DataSourceDefinitions
	 * @generated
	 */
	public Adapter createDataSourceDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.ColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.ColumnDefinition
	 * @generated
	 */
	public Adapter createColumnDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link datacore.CSMRepresentationRootDescriptor <em>CSM Representation Root Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see datacore.CSMRepresentationRootDescriptor
	 * @generated
	 */
	public Adapter createCSMRepresentationRootDescriptorAdapter() {
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

} //DatacoreAdapterFactory
