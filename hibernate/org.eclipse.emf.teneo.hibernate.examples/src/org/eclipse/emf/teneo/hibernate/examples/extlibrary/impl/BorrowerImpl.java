/**
 * <copyright>
 * </copyright>
 *
 * $Id: BorrowerImpl.java,v 1.2 2010/03/02 06:08:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Borrower;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Lendable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Borrower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.impl.BorrowerImpl#getBorrowed <em>Borrowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorrowerImpl extends PersonImpl implements Borrower {
	/**
	 * The cached value of the '{@link #getBorrowed() <em>Borrowed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorrowed()
	 * @generated
	 * @ordered
	 */
	protected EList<Lendable> borrowed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorrowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.BORROWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lendable> getBorrowed() {
		if (borrowed == null) {
			borrowed = new EObjectWithInverseResolvingEList.ManyInverse<Lendable>(Lendable.class, this, ExtlibraryPackage.BORROWER__BORROWED, ExtlibraryPackage.LENDABLE__BORROWERS);
		}
		return borrowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBorrowed()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				return ((InternalEList<?>)getBorrowed()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				return getBorrowed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				getBorrowed().clear();
				getBorrowed().addAll((Collection<? extends Lendable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				getBorrowed().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtlibraryPackage.BORROWER__BORROWED:
				return borrowed != null && !borrowed.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BorrowerImpl
