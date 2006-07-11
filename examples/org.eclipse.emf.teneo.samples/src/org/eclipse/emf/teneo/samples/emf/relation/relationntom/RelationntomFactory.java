/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationntomFactory.java,v 1.1 2006/07/11 16:56:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.relation.relationntom.RelationntomPackage
 * @generated
 */
public interface RelationntomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationntomFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl.RelationntomFactoryImpl();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>Multi NN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi NN</em>'.
	 * @generated
	 */
	MultiNN createMultiNN();

	/**
	 * Returns a new object of class '<em>Multi NR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi NR</em>'.
	 * @generated
	 */
	MultiNR createMultiNR();

	/**
	 * Returns a new object of class '<em>Multi RN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi RN</em>'.
	 * @generated
	 */
	MultiRN createMultiRN();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationntomPackage getRelationntomPackage();

} //RelationntomFactory
