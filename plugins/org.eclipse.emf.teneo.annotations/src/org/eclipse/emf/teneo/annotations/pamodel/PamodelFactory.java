/**
 * <copyright>
 * </copyright>
 *
 * $Id: PamodelFactory.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage
 * @generated
 */
public interface PamodelFactory extends EFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PamodelFactory eINSTANCE = new org.eclipse.emf.teneo.annotations.pamodel.impl.PamodelFactoryImpl();

	/**
	 * Returns a new object of class '<em>PAnnotated Model</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>PAnnotated Model</em>'.
	 * @generated
	 */
	PAnnotatedModel createPAnnotatedModel();

	/**
	 * Returns a new object of class '<em>PAnnotated EPackage</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>PAnnotated EPackage</em>'.
	 * @generated
	 */
	PAnnotatedEPackage createPAnnotatedEPackage();

	/**
	 * Returns a new object of class '<em>PAnnotated EClass</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>PAnnotated EClass</em>'.
	 * @generated
	 */
	PAnnotatedEClass createPAnnotatedEClass();

	/**
	 * Returns a new object of class '<em>PAnnotated EAttribute</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>PAnnotated EAttribute</em>'.
	 * @generated
	 */
	PAnnotatedEAttribute createPAnnotatedEAttribute();

	/**
	 * Returns a new object of class '<em>PAnnotated EReference</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>PAnnotated EReference</em>'.
	 * @generated
	 */
	PAnnotatedEReference createPAnnotatedEReference();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	PamodelPackage getPamodelPackage();

} // PamodelFactory
