/**
 * <copyright>
 * </copyright>
 *
 * $Id: MixedFactory.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.MixedPackage
 * @generated
 */
public interface MixedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MixedFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.schemaconstructs.mixed.impl.MixedFactoryImpl();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Letter Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Letter Body Type</em>'.
	 * @generated
	 */
	LetterBodyType createLetterBodyType();

	/**
	 * Returns a new object of class '<em>Salutation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salutation Type</em>'.
	 * @generated
	 */
	SalutationType createSalutationType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MixedPackage getMixedPackage();

} //MixedFactory
