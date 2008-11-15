/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytablehibernateFactory.java,v 1.3 2008/11/15 21:37:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.SecondarytablehibernatePackage
 * @generated
 */
public interface SecondarytablehibernateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecondarytablehibernateFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.secondarytablehibernate.impl.SecondarytablehibernateFactoryImpl.init();

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
	SecondarytablehibernatePackage getSecondarytablehibernatePackage();

} //SecondarytablehibernateFactory
