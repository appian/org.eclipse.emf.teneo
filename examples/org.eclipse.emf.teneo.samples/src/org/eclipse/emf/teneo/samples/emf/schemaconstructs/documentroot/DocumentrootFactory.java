/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentrootFactory.java,v 1.1 2009/07/27 22:12:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.DocumentrootPackage
 * @generated
 */
public interface DocumentrootFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentrootFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.schemaconstructs.documentroot.impl.DocumentrootFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type</em>'.
	 * @generated
	 */
	ComplexType createComplexType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocumentrootPackage getDocumentrootPackage();

} //DocumentrootFactory
