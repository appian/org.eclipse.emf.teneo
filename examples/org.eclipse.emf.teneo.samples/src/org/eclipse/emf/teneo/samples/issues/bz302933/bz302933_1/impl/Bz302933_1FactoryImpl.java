/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz302933_1FactoryImpl.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz302933_1FactoryImpl extends EFactoryImpl implements Bz302933_1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz302933_1Factory init() {
		try {
			Bz302933_1Factory theBz302933_1Factory = (Bz302933_1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz302933/subpackage1"); 
			if (theBz302933_1Factory != null) {
				return theBz302933_1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz302933_1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz302933_1FactoryImpl() {
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
			case Bz302933_1Package.TEST_TYPE: return createTestType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestType createTestType() {
		TestTypeImpl testType = new TestTypeImpl();
		return testType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz302933_1Package getBz302933_1Package() {
		return (Bz302933_1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz302933_1Package getPackage() {
		return Bz302933_1Package.eINSTANCE;
	}

} //Bz302933_1FactoryImpl
