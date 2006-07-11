/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransientsuperFactoryImpl.java,v 1.1 2006/07/11 16:57:16 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.transientsuper.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.transientsuper.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransientsuperFactoryImpl extends EFactoryImpl implements TransientsuperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransientsuperFactory init() {
		try {
			TransientsuperFactory theTransientsuperFactory = (TransientsuperFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/transientsuper"); 
			if (theTransientsuperFactory != null) {
				return theTransientsuperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransientsuperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientsuperFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransientsuperPackage.PBASE_OBJECT: return createPBaseObject();
			case TransientsuperPackage.PVERSION_OBJECT: return createPVersionObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PBaseObject createPBaseObject() {
		PBaseObjectImpl pBaseObject = new PBaseObjectImpl();
		return pBaseObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PVersionObject createPVersionObject() {
		PVersionObjectImpl pVersionObject = new PVersionObjectImpl();
		return pVersionObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientsuperPackage getTransientsuperPackage() {
		return (TransientsuperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TransientsuperPackage getPackage() {
		return TransientsuperPackage.eINSTANCE;
	}

} //TransientsuperFactoryImpl
