/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz237498FactoryImpl.java,v 1.2 2008/09/01 12:45:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237498.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.issues.bz237498.*;
import org.eclipse.emf.teneo.samples.issues.bz237498.Bz237498Factory;
import org.eclipse.emf.teneo.samples.issues.bz237498.Bz237498Package;
import org.eclipse.emf.teneo.samples.issues.bz237498.Many;
import org.eclipse.emf.teneo.samples.issues.bz237498.One;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class Bz237498FactoryImpl extends EFactoryImpl implements Bz237498Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz237498Factory init() {
		try {
			Bz237498Factory theBz237498Factory = (Bz237498Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz237498"); 
			if (theBz237498Factory != null) {
				return theBz237498Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz237498FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bz237498FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bz237498Package.ONE: return createOne();
			case Bz237498Package.MANY: return createMany();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public One createOne() {
		OneImpl one = new OneImpl();
		return one;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Many createMany() {
		ManyImpl many = new ManyImpl();
		return many;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Bz237498Package getBz237498Package() {
		return (Bz237498Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz237498Package getPackage() {
		return Bz237498Package.eINSTANCE;
	}

} // Bz237498FactoryImpl
