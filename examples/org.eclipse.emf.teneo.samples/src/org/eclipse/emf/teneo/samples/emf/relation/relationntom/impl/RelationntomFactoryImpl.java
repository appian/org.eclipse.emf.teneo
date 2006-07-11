/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationntomFactoryImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relationntom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.emf.relation.relationntom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationntomFactoryImpl extends EFactoryImpl implements RelationntomFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationntomFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RelationntomPackage.MAIN: return createMain();
			case RelationntomPackage.MULTI_NN: return createMultiNN();
			case RelationntomPackage.MULTI_NR: return createMultiNR();
			case RelationntomPackage.MULTI_RN: return createMultiRN();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNN createMultiNN() {
		MultiNNImpl multiNN = new MultiNNImpl();
		return multiNN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiNR createMultiNR() {
		MultiNRImpl multiNR = new MultiNRImpl();
		return multiNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRN createMultiRN() {
		MultiRNImpl multiRN = new MultiRNImpl();
		return multiRN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationntomPackage getRelationntomPackage() {
		return (RelationntomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RelationntomPackage getPackage() {
		return RelationntomPackage.eINSTANCE;
	}

} //RelationntomFactoryImpl
