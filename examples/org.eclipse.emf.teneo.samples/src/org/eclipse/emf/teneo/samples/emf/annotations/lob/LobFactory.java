/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobFactory.java,v 1.3 2010/02/06 18:17:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.lob;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.lob.LobPackage
 * @generated
 */
public interface LobFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LobFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.lob.impl.LobFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LobPackage getLobPackage();

} //LobFactory
