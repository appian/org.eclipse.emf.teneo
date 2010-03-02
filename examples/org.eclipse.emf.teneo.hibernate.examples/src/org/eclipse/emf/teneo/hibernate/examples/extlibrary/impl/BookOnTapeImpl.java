/**
 * <copyright>
 * </copyright>
 *
 * $Id: BookOnTapeImpl.java,v 1.2 2010/03/02 06:08:37 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.examples.extlibrary.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.hibernate.examples.extlibrary.BookOnTape;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Person;
import org.eclipse.emf.teneo.hibernate.examples.extlibrary.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book On Tape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.impl.BookOnTapeImpl#getReader <em>Reader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.examples.extlibrary.impl.BookOnTapeImpl#getBookAuthor <em>Book Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookOnTapeImpl extends AudioVisualItemImpl implements BookOnTape {
	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected Person reader;

	/**
	 * The cached value of the '{@link #getBookAuthor() <em>Book Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookAuthor()
	 * @generated
	 * @ordered
	 */
	protected Writer bookAuthor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookOnTapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.BOOK_ON_TAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getReader() {
		if (reader != null && reader.eIsProxy()) {
			InternalEObject oldReader = (InternalEObject)reader;
			reader = (Person)eResolveProxy(oldReader);
			if (reader != oldReader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtlibraryPackage.BOOK_ON_TAPE__READER, oldReader, reader));
			}
		}
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReader(Person newReader) {
		Person oldReader = reader;
		reader = newReader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.BOOK_ON_TAPE__READER, oldReader, reader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer getBookAuthor() {
		if (bookAuthor != null && bookAuthor.eIsProxy()) {
			InternalEObject oldBookAuthor = (InternalEObject)bookAuthor;
			bookAuthor = (Writer)eResolveProxy(oldBookAuthor);
			if (bookAuthor != oldBookAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR, oldBookAuthor, bookAuthor));
			}
		}
		return bookAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer basicGetBookAuthor() {
		return bookAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookAuthor(Writer newBookAuthor) {
		Writer oldBookAuthor = bookAuthor;
		bookAuthor = newBookAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR, oldBookAuthor, bookAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				if (resolve) return getReader();
				return basicGetReader();
			case ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR:
				if (resolve) return getBookAuthor();
				return basicGetBookAuthor();
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
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				setReader((Person)newValue);
				return;
			case ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR:
				setBookAuthor((Writer)newValue);
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
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				setReader((Person)null);
				return;
			case ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR:
				setBookAuthor((Writer)null);
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
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				return reader != null;
			case ExtlibraryPackage.BOOK_ON_TAPE__BOOK_AUTHOR:
				return bookAuthor != null;
		}
		return super.eIsSet(featureID);
	}

} //BookOnTapeImpl
