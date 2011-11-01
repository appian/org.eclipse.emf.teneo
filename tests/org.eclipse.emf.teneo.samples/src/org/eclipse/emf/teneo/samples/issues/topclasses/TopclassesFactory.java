/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopclassesFactory.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.topclasses.TopclassesPackage
 * @generated
 */
public interface TopclassesFactory extends EFactory{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopclassesFactory eINSTANCE = new org.eclipse.emf.teneo.samples.issues.topclasses.impl.TopclassesFactoryImpl();

	/**
	 * Returns a new object of class '<em>Abstract Super</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Super</em>'.
	 * @generated
	 */
	AbstractSuper createAbstractSuper();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	M createM();

	/**
	 * Returns a new object of class '<em>MList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MList</em>'.
	 * @generated
	 */
	MList createMList();

	/**
	 * Returns a new object of class '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>P</em>'.
	 * @generated
	 */
	P createP();

	/**
	 * Returns a new object of class '<em>PList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PList</em>'.
	 * @generated
	 */
	PList createPList();

	/**
	 * Returns a new object of class '<em>R</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>R</em>'.
	 * @generated
	 */
	R createR();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TopclassesPackage getTopclassesPackage();

} //TopclassesFactory
