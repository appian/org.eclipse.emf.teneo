/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation1to1FactoryImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Relation1to1FactoryImpl extends EFactoryImpl implements Relation1to1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Relation1to1Factory init() {
		try {
			Relation1to1Factory theRelation1to1Factory = (Relation1to1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/relation/relation1to1"); 
			if (theRelation1to1Factory != null) {
				return theRelation1to1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Relation1to1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1to1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Relation1to1Package.CONTAINED_CHILD_NR: return createContainedChildNR();
			case Relation1to1Package.CONTAINED_CHILD_R: return createContainedChildR();
			case Relation1to1Package.MAIN: return createMain();
			case Relation1to1Package.NOT_CONTAINED_CHILD_NR: return createNotContainedChildNR();
			case Relation1to1Package.NOT_CONTAINED_CHILD_NRT: return createNotContainedChildNRT();
			case Relation1to1Package.NOT_CONTAINED_CHILD_NRTNR: return createNotContainedChildNRTNR();
			case Relation1to1Package.NOT_CONTAINED_CHILD_R: return createNotContainedChildR();
			case Relation1to1Package.NOT_CONTAINED_CHILD_RTNR: return createNotContainedChildRTNR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedChildNR createContainedChildNR() {
		ContainedChildNRImpl containedChildNR = new ContainedChildNRImpl();
		return containedChildNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedChildR createContainedChildR() {
		ContainedChildRImpl containedChildR = new ContainedChildRImpl();
		return containedChildR;
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
	public NotContainedChildNR createNotContainedChildNR() {
		NotContainedChildNRImpl notContainedChildNR = new NotContainedChildNRImpl();
		return notContainedChildNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildNRT createNotContainedChildNRT() {
		NotContainedChildNRTImpl notContainedChildNRT = new NotContainedChildNRTImpl();
		return notContainedChildNRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildNRTNR createNotContainedChildNRTNR() {
		NotContainedChildNRTNRImpl notContainedChildNRTNR = new NotContainedChildNRTNRImpl();
		return notContainedChildNRTNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildR createNotContainedChildR() {
		NotContainedChildRImpl notContainedChildR = new NotContainedChildRImpl();
		return notContainedChildR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotContainedChildRTNR createNotContainedChildRTNR() {
		NotContainedChildRTNRImpl notContainedChildRTNR = new NotContainedChildRTNRImpl();
		return notContainedChildRTNR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation1to1Package getRelation1to1Package() {
		return (Relation1to1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Relation1to1Package getPackage() {
		return Relation1to1Package.eINSTANCE;
	}

} //Relation1to1FactoryImpl
