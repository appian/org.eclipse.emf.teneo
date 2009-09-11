/**
 * <copyright>
 * </copyright>
 *
 * $Id: WriterImpl.java,v 1.2 2009/09/11 15:38:42 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.City;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Pen;
import org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.impl.WriterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.impl.WriterImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.impl.WriterImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.impl.WriterImpl#getPens <em>Pens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WriterImpl extends EObjectImpl implements Writer {
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
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getPens() <em>Pens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPens()
	 * @generated
	 * @ordered
	 */
	protected EList<Pen> pens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EavlibraryPackage.Literals.WRITER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EavlibraryPackage.WRITER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectWithInverseResolvingEList<Book>(Book.class, this, EavlibraryPackage.WRITER__BOOKS, EavlibraryPackage.BOOK__AUTHOR);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject)city;
			city = (City)eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EavlibraryPackage.WRITER__CITY, oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EavlibraryPackage.WRITER__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pen> getPens() {
		if (pens == null) {
			pens = new EObjectContainmentEList<Pen>(Pen.class, this, EavlibraryPackage.WRITER__PENS);
		}
		return pens;
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
			case EavlibraryPackage.WRITER__BOOKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooks()).basicAdd(otherEnd, msgs);
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
			case EavlibraryPackage.WRITER__BOOKS:
				return ((InternalEList<?>)getBooks()).basicRemove(otherEnd, msgs);
			case EavlibraryPackage.WRITER__PENS:
				return ((InternalEList<?>)getPens()).basicRemove(otherEnd, msgs);
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
			case EavlibraryPackage.WRITER__NAME:
				return getName();
			case EavlibraryPackage.WRITER__BOOKS:
				return getBooks();
			case EavlibraryPackage.WRITER__CITY:
				if (resolve) return getCity();
				return basicGetCity();
			case EavlibraryPackage.WRITER__PENS:
				return getPens();
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
			case EavlibraryPackage.WRITER__NAME:
				setName((String)newValue);
				return;
			case EavlibraryPackage.WRITER__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
			case EavlibraryPackage.WRITER__CITY:
				setCity((City)newValue);
				return;
			case EavlibraryPackage.WRITER__PENS:
				getPens().clear();
				getPens().addAll((Collection<? extends Pen>)newValue);
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
			case EavlibraryPackage.WRITER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EavlibraryPackage.WRITER__BOOKS:
				getBooks().clear();
				return;
			case EavlibraryPackage.WRITER__CITY:
				setCity((City)null);
				return;
			case EavlibraryPackage.WRITER__PENS:
				getPens().clear();
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
			case EavlibraryPackage.WRITER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EavlibraryPackage.WRITER__BOOKS:
				return books != null && !books.isEmpty();
			case EavlibraryPackage.WRITER__CITY:
				return city != null;
			case EavlibraryPackage.WRITER__PENS:
				return pens != null && !pens.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WriterImpl
