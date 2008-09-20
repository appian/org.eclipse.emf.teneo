/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz247939FactoryImpl.java,v 1.1 2008/09/20 21:20:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz247939.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz247939.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz247939FactoryImpl extends EFactoryImpl implements Bz247939Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz247939Factory init() {
		try {
			Bz247939Factory theBz247939Factory = (Bz247939Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz247939"); 
			if (theBz247939Factory != null) {
				return theBz247939Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz247939FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz247939FactoryImpl() {
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
			case Bz247939Package.ANIMAL: return createAnimal();
			case Bz247939Package.OWNER: return createOwner();
			case Bz247939Package.CAT: return createCat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animal createAnimal() {
		AnimalImpl animal = new AnimalImpl();
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cat createCat() {
		CatImpl cat = new CatImpl();
		return cat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz247939Package getBz247939Package() {
		return (Bz247939Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz247939Package getPackage() {
		return Bz247939Package.eINSTANCE;
	}

} //Bz247939FactoryImpl
