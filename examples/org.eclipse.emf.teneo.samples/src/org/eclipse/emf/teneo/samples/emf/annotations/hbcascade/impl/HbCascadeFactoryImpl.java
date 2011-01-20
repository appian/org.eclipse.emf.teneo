/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbCascadeFactoryImpl.java,v 1.1 2011/01/20 17:13:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.emf.annotations.hbcascade.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HbCascadeFactoryImpl extends EFactoryImpl implements HbCascadeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HbCascadeFactory init() {
		try {
			HbCascadeFactory theHbCascadeFactory = (HbCascadeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/annotations/hbcascade"); 
			if (theHbCascadeFactory != null) {
				return theHbCascadeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HbCascadeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbCascadeFactoryImpl() {
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
			case HbCascadePackage.PARENT: return createParent();
			case HbCascadePackage.CHILD: return createChild();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HbCascadePackage getHbCascadePackage() {
		return (HbCascadePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HbCascadePackage getPackage() {
		return HbCascadePackage.eINSTANCE;
	}

} //HbCascadeFactoryImpl
