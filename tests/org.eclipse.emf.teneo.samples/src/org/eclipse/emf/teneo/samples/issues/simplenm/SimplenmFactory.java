/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplenmFactory.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.simplenm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.simplenm.SimplenmPackage
 * @generated
 */
public interface SimplenmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplenmFactory eINSTANCE = new org.eclipse.emf.teneo.samples.issues.simplenm.impl.SimplenmFactoryImpl();

	/**
	 * Returns a new object of class '<em>Me</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Me</em>'.
	 * @generated
	 */
	Me createMe();

	/**
	 * Returns a new object of class '<em>You</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>You</em>'.
	 * @generated
	 */
	You createYou();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplenmPackage getSimplenmPackage();

} //SimplenmFactory
