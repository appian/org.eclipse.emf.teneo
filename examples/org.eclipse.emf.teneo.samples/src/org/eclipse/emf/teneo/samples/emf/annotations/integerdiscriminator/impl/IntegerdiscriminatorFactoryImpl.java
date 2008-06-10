/**
 * <copyright>
 * </copyright>
 *
 * $Id: IntegerdiscriminatorFactoryImpl.java,v 1.1 2008/06/10 06:45:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.integerdiscriminator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerdiscriminatorFactoryImpl extends EFactoryImpl implements IntegerdiscriminatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegerdiscriminatorFactory init() {
		try {
			IntegerdiscriminatorFactory theIntegerdiscriminatorFactory = (IntegerdiscriminatorFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/integerdiscriminator"); 
			if (theIntegerdiscriminatorFactory != null) {
				return theIntegerdiscriminatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IntegerdiscriminatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerdiscriminatorFactoryImpl() {
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
			case IntegerdiscriminatorPackage.SUPER: return createSuper();
			case IntegerdiscriminatorPackage.SUB: return createSub();
			case IntegerdiscriminatorPackage.OTHER_SUB: return createOtherSub();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Super createSuper() {
		SuperImpl super_ = new SuperImpl();
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sub createSub() {
		SubImpl sub = new SubImpl();
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherSub createOtherSub() {
		OtherSubImpl otherSub = new OtherSubImpl();
		return otherSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerdiscriminatorPackage getIntegerdiscriminatorPackage() {
		return (IntegerdiscriminatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IntegerdiscriminatorPackage getPackage() {
		return IntegerdiscriminatorPackage.eINSTANCE;
	}

} //IntegerdiscriminatorFactoryImpl
