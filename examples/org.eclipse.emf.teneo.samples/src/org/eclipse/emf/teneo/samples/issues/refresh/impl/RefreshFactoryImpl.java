/**
 * <copyright>
 * </copyright>
 *
 * $Id: RefreshFactoryImpl.java,v 1.1 2006/07/11 16:57:02 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.refresh.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.teneo.samples.issues.refresh.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefreshFactoryImpl extends EFactoryImpl implements RefreshFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefreshPackage.ITEM: return createItem();
			case RefreshPackage.LINE_ONE: return createLineOne();
			case RefreshPackage.LINE_TWO: return createLineTwo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineOne createLineOne() {
		LineOneImpl lineOne = new LineOneImpl();
		return lineOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTwo createLineTwo() {
		LineTwoImpl lineTwo = new LineTwoImpl();
		return lineTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshPackage getRefreshPackage() {
		return (RefreshPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static RefreshPackage getPackage() {
		return RefreshPackage.eINSTANCE;
	}

} //RefreshFactoryImpl
