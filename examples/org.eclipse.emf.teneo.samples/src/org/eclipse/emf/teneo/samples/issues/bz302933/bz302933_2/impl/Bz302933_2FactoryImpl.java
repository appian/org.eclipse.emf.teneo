/**
 * <copyright>
 * </copyright>
 *
 * $Id: Bz302933_2FactoryImpl.java,v 1.1 2010/03/02 21:43:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.bz302933.bz302933_2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bz302933_2FactoryImpl extends EFactoryImpl implements Bz302933_2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bz302933_2Factory init() {
		try {
			Bz302933_2Factory theBz302933_2Factory = (Bz302933_2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/bz302933/subpackage2"); 
			if (theBz302933_2Factory != null) {
				return theBz302933_2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bz302933_2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz302933_2FactoryImpl() {
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
			case Bz302933_2Package.TRANSIENT_TYPE: return createTransientType();
			case Bz302933_2Package.NOT_TRANSIENT_TYPE: return createNotTransientType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientType createTransientType() {
		TransientTypeImpl transientType = new TransientTypeImpl();
		return transientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotTransientType createNotTransientType() {
		NotTransientTypeImpl notTransientType = new NotTransientTypeImpl();
		return notTransientType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bz302933_2Package getBz302933_2Package() {
		return (Bz302933_2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bz302933_2Package getPackage() {
		return Bz302933_2Package.eINSTANCE;
	}

} //Bz302933_2FactoryImpl
