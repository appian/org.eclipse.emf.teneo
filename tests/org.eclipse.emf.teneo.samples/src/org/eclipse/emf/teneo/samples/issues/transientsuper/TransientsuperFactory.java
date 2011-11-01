/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientsuperFactory.java,v 1.1 2006/07/11 16:57:12 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.transientsuper.TransientsuperPackage
 * @generated
 */
public interface TransientsuperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransientsuperFactory eINSTANCE = org.eclipse.emf.teneo.samples.issues.transientsuper.impl.TransientsuperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PBase Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PBase Object</em>'.
	 * @generated
	 */
	PBaseObject createPBaseObject();

	/**
	 * Returns a new object of class '<em>PVersion Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PVersion Object</em>'.
	 * @generated
	 */
	PVersionObject createPVersionObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransientsuperPackage getTransientsuperPackage();

} //TransientsuperFactory
