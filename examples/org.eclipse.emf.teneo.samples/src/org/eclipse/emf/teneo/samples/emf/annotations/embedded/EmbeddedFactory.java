/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedFactory.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage
 * @generated
 */
public interface EmbeddedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmbeddedFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.embedded.impl.EmbeddedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embeddable</em>'.
	 * @generated
	 */
	Embeddable createEmbeddable();

	/**
	 * Returns a new object of class '<em>Embedder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedder</em>'.
	 * @generated
	 */
	Embedder createEmbedder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmbeddedPackage getEmbeddedPackage();

} //EmbeddedFactory
