/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooksInLibImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.BooksInLib;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.Library;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Books In Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.BooksInLibImpl#getLibrary
 * <em>Library</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BooksInLibImpl extends EObjectImpl implements BooksInLib {
	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> library;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BooksInLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.BOOKS_IN_LIB;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Library> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Library>(Library.class, this,
					TestPackage.BOOKS_IN_LIB__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case TestPackage.BOOKS_IN_LIB__LIBRARY:
			return ((InternalEList<?>) getLibrary()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestPackage.BOOKS_IN_LIB__LIBRARY:
			return getLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestPackage.BOOKS_IN_LIB__LIBRARY:
			getLibrary().clear();
			getLibrary().addAll((Collection<? extends Library>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestPackage.BOOKS_IN_LIB__LIBRARY:
			getLibrary().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestPackage.BOOKS_IN_LIB__LIBRARY:
			return library != null && !library.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BooksInLibImpl
