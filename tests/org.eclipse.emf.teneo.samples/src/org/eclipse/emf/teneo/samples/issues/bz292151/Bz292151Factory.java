/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz292151Factory.java,v 1.1 2009/10/14 22:19:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.bz292151.Bz292151Package
 * @generated
 */
public interface Bz292151Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bz292151Factory eINSTANCE = org.eclipse.emf.teneo.samples.issues.bz292151.impl.Bz292151FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base</em>'.
	 * @generated
	 */
	Base createBase();

	/**
	 * Returns a new object of class '<em>Sub1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub1</em>'.
	 * @generated
	 */
	Sub1 createSub1();

	/**
	 * Returns a new object of class '<em>Sub2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub2</em>'.
	 * @generated
	 */
	Sub2 createSub2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bz292151Package getBz292151Package();

} //Bz292151Factory
