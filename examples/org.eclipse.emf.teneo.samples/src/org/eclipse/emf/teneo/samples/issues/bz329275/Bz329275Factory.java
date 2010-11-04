/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz329275Factory.java,v 1.1 2010/11/04 05:22:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz329275;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package
 * @generated
 */
public interface Bz329275Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz329275Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz329275.impl.Bz329275FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz329275Package getBz329275Package();

} //Bz329275Factory
