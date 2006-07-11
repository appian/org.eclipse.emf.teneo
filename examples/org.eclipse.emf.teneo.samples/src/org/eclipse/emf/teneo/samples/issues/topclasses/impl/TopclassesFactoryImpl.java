/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopclassesFactoryImpl.java,v 1.1 2006/07/11 16:57:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.topclasses.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.issues.topclasses.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopclassesFactoryImpl extends EFactoryImpl implements TopclassesFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopclassesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TopclassesPackage.ABSTRACT_SUPER: return createAbstractSuper();
			case TopclassesPackage.M: return createM();
			case TopclassesPackage.MLIST: return createMList();
			case TopclassesPackage.P: return createP();
			case TopclassesPackage.PLIST: return createPList();
			case TopclassesPackage.R: return createR();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSuper createAbstractSuper() {
		AbstractSuperImpl abstractSuper = new AbstractSuperImpl();
		return abstractSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M createM() {
		MImpl m = new MImpl();
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MList createMList() {
		MListImpl mList = new MListImpl();
		return mList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public P createP() {
		PImpl p = new PImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PList createPList() {
		PListImpl pList = new PListImpl();
		return pList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R createR() {
		RImpl r = new RImpl();
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopclassesPackage getTopclassesPackage() {
		return (TopclassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TopclassesPackage getPackage() {
		return TopclassesPackage.eINSTANCE;
	}

} //TopclassesFactoryImpl
