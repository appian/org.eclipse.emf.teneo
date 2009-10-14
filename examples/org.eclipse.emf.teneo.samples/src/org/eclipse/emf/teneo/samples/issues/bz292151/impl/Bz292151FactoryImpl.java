/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz292151FactoryImpl.java,v 1.1 2009/10/14 22:19:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz292151.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz292151.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz292151FactoryImpl extends EFactoryImpl implements Bz292151Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz292151Factory init() {
		try {
			Bz292151Factory theBz292151Factory = (Bz292151Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz292151"); 
			if (theBz292151Factory != null) {
				return theBz292151Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz292151FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz292151FactoryImpl() {
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
			case Bz292151Package.BASE: return createBase();
			case Bz292151Package.SUB1: return createSub1();
			case Bz292151Package.SUB2: return createSub2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base createBase() {
		BaseImpl base = new BaseImpl();
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub1 createSub1() {
		Sub1Impl sub1 = new Sub1Impl();
		return sub1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub2 createSub2() {
		Sub2Impl sub2 = new Sub2Impl();
		return sub2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz292151Package getBz292151Package() {
		return (Bz292151Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz292151Package getPackage() {
		return Bz292151Package.eINSTANCE;
	}

} //Bz292151FactoryImpl
