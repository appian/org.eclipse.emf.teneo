/**
 * <copyright>
 * </copyright>
 *
 * $Id: DurationFactoryImpl.java,v 1.1 2008/02/03 22:37:05 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.duration.DurationTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DurationFactoryImpl extends EFactoryImpl implements DurationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DurationFactory init() {
		try {
			DurationFactory theDurationFactory = (DurationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/duration"); 
			if (theDurationFactory != null) {
				return theDurationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DurationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFactoryImpl() {
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
			case DurationPackage.DURATION_TEST: return createDurationTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationTest createDurationTest() {
		DurationTestImpl durationTest = new DurationTestImpl();
		return durationTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationPackage getDurationPackage() {
		return (DurationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DurationPackage getPackage() {
		return DurationPackage.eINSTANCE;
	}

} //DurationFactoryImpl
