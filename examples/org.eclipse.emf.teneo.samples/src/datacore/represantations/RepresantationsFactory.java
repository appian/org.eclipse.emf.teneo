/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepresantationsFactory.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see datacore.represantations.RepresantationsPackage
 * @generated
 */
public interface RepresantationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresantationsFactory eINSTANCE = datacore.represantations.impl.RepresantationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CSM File Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM File Representation</em>'.
	 * @generated
	 */
	CSMFileRepresentation createCSMFileRepresentation();

	/**
	 * Returns a new object of class '<em>CSM Url Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSM Url Representation</em>'.
	 * @generated
	 */
	CSMUrlRepresentation createCSMUrlRepresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepresantationsPackage getRepresantationsPackage();

} //RepresantationsFactory
