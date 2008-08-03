/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorImpl.java,v 1.1 2008/08/03 19:23:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz242995.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz242995.Author;
import org.eclipse.emf.teneo.samples.issues.bz242995.OneTimeWonder;
import org.eclipse.emf.teneo.samples.issues.bz242995.bz242995Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.impl.AuthorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.impl.AuthorImpl#getTheBook <em>The Book</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz242995.impl.AuthorImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorImpl extends EObjectImpl implements Author {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheBook() <em>The Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheBook()
	 * @generated
	 * @ordered
	 */
	protected OneTimeWonder theBook;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return bz242995Package.Literals.AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, bz242995Package.AUTHOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneTimeWonder getTheBook() {
		if (theBook != null && theBook.eIsProxy()) {
			InternalEObject oldTheBook = (InternalEObject)theBook;
			theBook = (OneTimeWonder)eResolveProxy(oldTheBook);
			if (theBook != oldTheBook) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, bz242995Package.AUTHOR__THE_BOOK, oldTheBook, theBook));
			}
		}
		return theBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneTimeWonder basicGetTheBook() {
		return theBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheBook(OneTimeWonder newTheBook, NotificationChain msgs) {
		OneTimeWonder oldTheBook = theBook;
		theBook = newTheBook;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, bz242995Package.AUTHOR__THE_BOOK, oldTheBook, newTheBook);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheBook(OneTimeWonder newTheBook) {
		if (newTheBook != theBook) {
			NotificationChain msgs = null;
			if (theBook != null)
				msgs = ((InternalEObject)theBook).eInverseRemove(this, bz242995Package.ONE_TIME_WONDER__THE_AUTHOR, OneTimeWonder.class, msgs);
			if (newTheBook != null)
				msgs = ((InternalEObject)newTheBook).eInverseAdd(this, bz242995Package.ONE_TIME_WONDER__THE_AUTHOR, OneTimeWonder.class, msgs);
			msgs = basicSetTheBook(newTheBook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, bz242995Package.AUTHOR__THE_BOOK, newTheBook, newTheBook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, bz242995Package.AUTHOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case bz242995Package.AUTHOR__THE_BOOK:
				if (theBook != null)
					msgs = ((InternalEObject)theBook).eInverseRemove(this, bz242995Package.ONE_TIME_WONDER__THE_AUTHOR, OneTimeWonder.class, msgs);
				return basicSetTheBook((OneTimeWonder)otherEnd, msgs);
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
			case bz242995Package.AUTHOR__THE_BOOK:
				return basicSetTheBook(null, msgs);
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
			case bz242995Package.AUTHOR__NAME:
				return getName();
			case bz242995Package.AUTHOR__THE_BOOK:
				if (resolve) return getTheBook();
				return basicGetTheBook();
			case bz242995Package.AUTHOR__ID:
				return new Long(getId());
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
			case bz242995Package.AUTHOR__NAME:
				setName((String)newValue);
				return;
			case bz242995Package.AUTHOR__THE_BOOK:
				setTheBook((OneTimeWonder)newValue);
				return;
			case bz242995Package.AUTHOR__ID:
				setId(((Long)newValue).longValue());
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
			case bz242995Package.AUTHOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case bz242995Package.AUTHOR__THE_BOOK:
				setTheBook((OneTimeWonder)null);
				return;
			case bz242995Package.AUTHOR__ID:
				setId(ID_EDEFAULT);
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
			case bz242995Package.AUTHOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case bz242995Package.AUTHOR__THE_BOOK:
				return theBook != null;
			case bz242995Package.AUTHOR__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AuthorImpl
