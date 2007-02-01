/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelFactory.java,v 1.5 2007/02/01 12:35:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage
 * @generated
 */
public interface PamodelFactory extends EFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	PamodelFactory eINSTANCE = org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PAnnotated Model</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated Model</em>'.
	 * @generated
	 */
	PAnnotatedModel createPAnnotatedModel();

	/**
	 * Returns a new object of class '<em>PAnnotated EPackage</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated EPackage</em>'.
	 * @generated
	 */
	PAnnotatedEPackage createPAnnotatedEPackage();

	/**
	 * Returns a new object of class '<em>PAnnotated EClass</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated EClass</em>'.
	 * @generated
	 */
	PAnnotatedEClass createPAnnotatedEClass();

	/**
	 * Returns a new object of class '<em>PAnnotated EAttribute</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated EAttribute</em>'.
	 * @generated
	 */
	PAnnotatedEAttribute createPAnnotatedEAttribute();

	/**
	 * Returns a new object of class '<em>PAnnotated EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated EData Type</em>'.
	 * @generated
	 */
	PAnnotatedEDataType createPAnnotatedEDataType();

	/**
	 * Returns a new object of class '<em>PAnnotated EReference</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>PAnnotated EReference</em>'.
	 * @generated
	 */
	PAnnotatedEReference createPAnnotatedEReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PamodelPackage getPamodelPackage();

} // PamodelFactory
