/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayFactory.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayPackage
 * @generated
 */
public interface PlayFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlayFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayFactoryImpl();

	/**
	 * Returns a new object of class '<em>Act Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Act Type</em>'.
	 * @generated
	 */
	ActType createActType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Fm Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fm Type</em>'.
	 * @generated
	 */
	FmType createFmType();

	/**
	 * Returns a new object of class '<em>Personae Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personae Type</em>'.
	 * @generated
	 */
	PersonaeType createPersonaeType();

	/**
	 * Returns a new object of class '<em>Persona Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persona Group Type</em>'.
	 * @generated
	 */
	PersonaGroupType createPersonaGroupType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	PlayType createPlayType();

	/**
	 * Returns a new object of class '<em>Scene Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scene Type</em>'.
	 * @generated
	 */
	SceneType createSceneType();

	/**
	 * Returns a new object of class '<em>Speech Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Type</em>'.
	 * @generated
	 */
	SpeechType createSpeechType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlayPackage getPlayPackage();

} //PlayFactory
