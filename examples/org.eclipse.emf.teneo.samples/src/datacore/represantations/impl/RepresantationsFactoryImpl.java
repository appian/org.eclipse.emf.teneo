/**
 * <copyright>
 * </copyright>
 *
 * $Id: RepresantationsFactoryImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.represantations.impl;

import datacore.represantations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresantationsFactoryImpl extends EFactoryImpl implements RepresantationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepresantationsFactory init() {
		try {
			RepresantationsFactory theRepresantationsFactory = (RepresantationsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.arcsolutions.de/remarc/represantations"); 
			if (theRepresantationsFactory != null) {
				return theRepresantationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepresantationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresantationsFactoryImpl() {
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
			case RepresantationsPackage.CSM_FILE_REPRESENTATION: return createCSMFileRepresentation();
			case RepresantationsPackage.CSM_URL_REPRESENTATION: return createCSMUrlRepresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMFileRepresentation createCSMFileRepresentation() {
		CSMFileRepresentationImpl csmFileRepresentation = new CSMFileRepresentationImpl();
		return csmFileRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMUrlRepresentation createCSMUrlRepresentation() {
		CSMUrlRepresentationImpl csmUrlRepresentation = new CSMUrlRepresentationImpl();
		return csmUrlRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresantationsPackage getRepresantationsPackage() {
		return (RepresantationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepresantationsPackage getPackage() {
		return RepresantationsPackage.eINSTANCE;
	}

} //RepresantationsFactoryImpl
