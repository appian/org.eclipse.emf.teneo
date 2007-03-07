/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacoreFactoryImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.*;

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
public class DatacoreFactoryImpl extends EFactoryImpl implements DatacoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatacoreFactory init() {
		try {
			DatacoreFactory theDatacoreFactory = (DatacoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.arcsolutions.de/remarc/"); 
			if (theDatacoreFactory != null) {
				return theDatacoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatacoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatacorePackage.CSMXML: return createCSMXML();
			case DatacorePackage.CSM_INSTANCE: return createCSMInstance();
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER: return createCSMCharacteristicValueContainer();
			case DatacorePackage.CSM_REPRESENTATION_ROOT: return createCSMRepresentationRoot();
			case DatacorePackage.INTERVAL: return createInterval();
			case DatacorePackage.USER_PROPERTY: return createUserProperty();
			case DatacorePackage.DATA_SOURCE_DEFINITIONS: return createDataSourceDefinitions();
			case DatacorePackage.COLUMN_DEFINITION: return createColumnDefinition();
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR: return createCSMRepresentationRootDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMXML createCSMXML() {
		CSMXMLImpl csmxml = new CSMXMLImpl();
		return csmxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMInstance createCSMInstance() {
		CSMInstanceImpl csmInstance = new CSMInstanceImpl();
		return csmInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicValueContainer createCSMCharacteristicValueContainer() {
		CSMCharacteristicValueContainerImpl csmCharacteristicValueContainer = new CSMCharacteristicValueContainerImpl();
		return csmCharacteristicValueContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentationRoot createCSMRepresentationRoot() {
		CSMRepresentationRootImpl csmRepresentationRoot = new CSMRepresentationRootImpl();
		return csmRepresentationRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProperty createUserProperty() {
		UserPropertyImpl userProperty = new UserPropertyImpl();
		return userProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceDefinitions createDataSourceDefinitions() {
		DataSourceDefinitionsImpl dataSourceDefinitions = new DataSourceDefinitionsImpl();
		return dataSourceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnDefinition createColumnDefinition() {
		ColumnDefinitionImpl columnDefinition = new ColumnDefinitionImpl();
		return columnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentationRootDescriptor createCSMRepresentationRootDescriptor() {
		CSMRepresentationRootDescriptorImpl csmRepresentationRootDescriptor = new CSMRepresentationRootDescriptorImpl();
		return csmRepresentationRootDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatacorePackage getDatacorePackage() {
		return (DatacorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatacorePackage getPackage() {
		return DatacorePackage.eINSTANCE;
	}

} //DatacoreFactoryImpl
