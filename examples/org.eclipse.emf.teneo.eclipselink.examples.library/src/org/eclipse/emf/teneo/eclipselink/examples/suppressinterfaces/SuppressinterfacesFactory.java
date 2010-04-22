/**
 * <copyright>
 * </copyright>
 *
 * $Id: SuppressinterfacesFactory.java,v 1.1 2010/04/22 15:33:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.eclipselink.examples.suppressinterfaces.SuppressinterfacesPackage
 * @generated
 */
public class SuppressinterfacesFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SuppressinterfacesFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SuppressinterfacesFactory init() {
		try {
			SuppressinterfacesFactory theSuppressinterfacesFactory = (SuppressinterfacesFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/emf/teneo/eclipselink/examples/test_suppressinterfaces.ecore"); 
			if (theSuppressinterfacesFactory != null) {
				return theSuppressinterfacesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SuppressinterfacesFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppressinterfacesFactory() {
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
			case SuppressinterfacesPackage.TEST: return createtest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test createtest() {
		test test = new test();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppressinterfacesPackage getSuppressinterfacesPackage() {
		return (SuppressinterfacesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SuppressinterfacesPackage getPackage() {
		return SuppressinterfacesPackage.eINSTANCE;
	}

} //SuppressinterfacesFactory
