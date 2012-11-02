/**
 */
package org.eclipse.emf.teneo.samples.issues.simplearray;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.simplearray.SimplearrayPackage
 * @generated
 */
public interface SimplearrayFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplearrayFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.simplearray.impl.SimplearrayFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple List</em>'.
	 * @generated
	 */
	SimpleList createSimpleList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplearrayPackage getSimplearrayPackage();

} //SimplearrayFactory
