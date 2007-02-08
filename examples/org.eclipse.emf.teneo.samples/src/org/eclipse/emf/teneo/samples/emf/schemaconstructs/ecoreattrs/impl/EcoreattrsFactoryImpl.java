/**
 * <copyright>
 * </copyright>
 *
 * $Id: EcoreattrsFactoryImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreattrsFactoryImpl extends EFactoryImpl implements EcoreattrsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreattrsFactory init() {
		try {
			EcoreattrsFactory theEcoreattrsFactory = (EcoreattrsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/schemaconstructs/ecoreattrs"); 
			if (theEcoreattrsFactory != null) {
				return theEcoreattrsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreattrsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreattrsFactoryImpl() {
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
			case EcoreattrsPackage.ELEMENT: return createElement();
			case EcoreattrsPackage.FEATURE: return createFeature();
			case EcoreattrsPackage.MIXED: return createMixed();
			case EcoreattrsPackage.NAME_LIST: return createNameList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mixed createMixed() {
		MixedImpl mixed = new MixedImpl();
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameList createNameList() {
		NameListImpl nameList = new NameListImpl();
		return nameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreattrsPackage getEcoreattrsPackage() {
		return (EcoreattrsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreattrsPackage getPackage() {
		return EcoreattrsPackage.eINSTANCE;
	}

} //EcoreattrsFactoryImpl
