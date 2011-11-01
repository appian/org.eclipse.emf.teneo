/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientotmFactory.java,v 1.1 2007/07/09 14:02:30 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.hibernate.transientotm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.TransientotmPackage
 * @generated
 */
public interface TransientotmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransientotmFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.hibernate.transientotm.impl.TransientotmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TBook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBook</em>'.
	 * @generated
	 */
	TBook createTBook();

	/**
	 * Returns a new object of class '<em>TWriter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TWriter</em>'.
	 * @generated
	 */
	TWriter createTWriter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransientotmPackage getTransientotmPackage();

} //TransientotmFactory
