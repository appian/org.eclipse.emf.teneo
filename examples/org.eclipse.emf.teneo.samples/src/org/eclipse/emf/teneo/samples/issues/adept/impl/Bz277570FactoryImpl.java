/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz277570FactoryImpl.java,v 1.1.2.1 2009/05/23 13:09:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.adept.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.adept.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz277570FactoryImpl extends EFactoryImpl implements Bz277570Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz277570Factory init() {
		try {
			Bz277570Factory theBz277570Factory = (Bz277570Factory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.emf.teneo.samples.issues.bz277570"); 
			if (theBz277570Factory != null) {
				return theBz277570Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz277570FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz277570FactoryImpl() {
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
			case Bz277570Package.FOO: return createFoo();
			case Bz277570Package.BAR: return createBar();
			case Bz277570Package.BIFF: return createBiff();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foo createFoo() {
		FooImpl foo = new FooImpl();
		return foo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biff createBiff() {
		BiffImpl biff = new BiffImpl();
		return biff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz277570Package getBz277570Package() {
		return (Bz277570Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz277570Package getPackage() {
		return Bz277570Package.eINSTANCE;
	}

} //Bz277570FactoryImpl
