/**
 * <copyright>
 * </copyright>
 *
 * $Id: MtmsameFactory.java,v 1.1 2006/11/12 00:08:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.mtmsame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.mtmsame.MtmsamePackage
 * @generated
 */
public interface MtmsameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MtmsameFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.mtmsame.impl.MtmsameFactoryImpl.init();

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
	MtmsamePackage getMtmsamePackage();

} //MtmsameFactory
