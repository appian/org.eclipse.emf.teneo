/**
 * <copyright>
 * </copyright>
 *
 * $Id: CollectionTypeImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.BooksType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.CollectionType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.CollectionTypeImpl#getBooks <em>Books</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectionTypeImpl extends EObjectImpl implements CollectionType {
	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected BooksType books = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SunBooksPackage.Literals.COLLECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooksType getBooks() {
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooks(BooksType newBooks, NotificationChain msgs) {
		BooksType oldBooks = books;
		books = newBooks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SunBooksPackage.COLLECTION_TYPE__BOOKS, oldBooks, newBooks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooks(BooksType newBooks) {
		if (newBooks != books) {
			NotificationChain msgs = null;
			if (books != null)
				msgs = ((InternalEObject)books).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.COLLECTION_TYPE__BOOKS, null, msgs);
			if (newBooks != null)
				msgs = ((InternalEObject)newBooks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SunBooksPackage.COLLECTION_TYPE__BOOKS, null, msgs);
			msgs = basicSetBooks(newBooks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SunBooksPackage.COLLECTION_TYPE__BOOKS, newBooks, newBooks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SunBooksPackage.COLLECTION_TYPE__BOOKS:
				return basicSetBooks(null, msgs);
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
			case SunBooksPackage.COLLECTION_TYPE__BOOKS:
				return getBooks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SunBooksPackage.COLLECTION_TYPE__BOOKS:
				setBooks((BooksType)newValue);
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
			case SunBooksPackage.COLLECTION_TYPE__BOOKS:
				setBooks((BooksType)null);
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
			case SunBooksPackage.COLLECTION_TYPE__BOOKS:
				return books != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionTypeImpl
