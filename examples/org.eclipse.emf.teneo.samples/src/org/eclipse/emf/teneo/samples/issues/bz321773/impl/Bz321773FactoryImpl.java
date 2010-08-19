/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz321773FactoryImpl.java,v 1.1 2010/08/19 08:34:52 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz321773.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz321773.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz321773FactoryImpl extends EFactoryImpl implements Bz321773Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz321773Factory init() {
		try {
			Bz321773Factory theBz321773Factory = (Bz321773Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz321773"); 
			if (theBz321773Factory != null) {
				return theBz321773Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz321773FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321773FactoryImpl() {
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
			case Bz321773Package.ITEM1: return createItem1();
			case Bz321773Package.ITEM2: return createItem2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item1 createItem1() {
		Item1Impl item1 = new Item1Impl();
		return item1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item2 createItem2() {
		Item2Impl item2 = new Item2Impl();
		return item2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz321773Package getBz321773Package() {
		return (Bz321773Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz321773Package getPackage() {
		return Bz321773Package.eINSTANCE;
	}

} //Bz321773FactoryImpl
