/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatacoreFactory.java,v 1.1 2007/03/07 23:34:09 mtaal Exp $
 */
package datacore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datacore.DatacorePackage
 * @generated
 */
public interface DatacoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatacoreFactory eINSTANCE = datacore.impl.DatacoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CSMXML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSMXML</em>'.
	 * @generated
	 */
	CSMXML createCSMXML();

	/**
	 * Returns a new object of class '<em>CSM Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM Instance</em>'.
	 * @generated
	 */
	CSMInstance createCSMInstance();

	/**
	 * Returns a new object of class '<em>CSM Characteristic Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM Characteristic Value Container</em>'.
	 * @generated
	 */
	CSMCharacteristicValueContainer createCSMCharacteristicValueContainer();

	/**
	 * Returns a new object of class '<em>CSM Representation Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM Representation Root</em>'.
	 * @generated
	 */
	CSMRepresentationRoot createCSMRepresentationRoot();

	/**
	 * Returns a new object of class '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interval</em>'.
	 * @generated
	 */
	Interval createInterval();

	/**
	 * Returns a new object of class '<em>User Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Property</em>'.
	 * @generated
	 */
	UserProperty createUserProperty();

	/**
	 * Returns a new object of class '<em>Data Source Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source Definitions</em>'.
	 * @generated
	 */
	DataSourceDefinitions createDataSourceDefinitions();

	/**
	 * Returns a new object of class '<em>Column Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Definition</em>'.
	 * @generated
	 */
	ColumnDefinition createColumnDefinition();

	/**
	 * Returns a new object of class '<em>CSM Representation Root Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM Representation Root Descriptor</em>'.
	 * @generated
	 */
	CSMRepresentationRootDescriptor createCSMRepresentationRootDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatacorePackage getDatacorePackage();

} //DatacoreFactory
