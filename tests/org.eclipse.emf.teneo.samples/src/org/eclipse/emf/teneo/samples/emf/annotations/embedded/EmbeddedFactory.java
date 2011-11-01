/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedFactory.java,v 1.5 2010/04/23 08:52:51 mtaal Exp $
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
	 * Returns a new object of class '<em>Also Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Also Embeddable</em>'.
	 * @generated
	 */
	AlsoEmbeddable createAlsoEmbeddable();

	/**
	 * Returns a new object of class '<em>Another Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Another Embeddable</em>'.
	 * @generated
	 */
	AnotherEmbeddable createAnotherEmbeddable();

	/**
	 * Returns a new object of class '<em>AOne To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AOne To Many</em>'.
	 * @generated
	 */
	AOneToMany createAOneToMany();

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
	 * Returns a new object of class '<em>Nested Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Embeddable</em>'.
	 * @generated
	 */
	NestedEmbeddable createNestedEmbeddable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmbeddedPackage getEmbeddedPackage();

} //EmbeddedFactory
