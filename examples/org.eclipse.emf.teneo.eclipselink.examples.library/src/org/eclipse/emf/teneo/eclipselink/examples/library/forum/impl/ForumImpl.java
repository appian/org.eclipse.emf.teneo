/**
 * <copyright>
 * </copyright>
 *
 * $Id: ForumImpl.java,v 1.2 2009/01/21 21:34:21 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.eclipselink.examples.library.Book;
import org.eclipse.emf.teneo.eclipselink.examples.library.Writer;

import org.eclipse.emf.teneo.eclipselink.examples.library.forum.Forum;
import org.eclipse.emf.teneo.eclipselink.examples.library.forum.ForumPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl#getRatedAuthors <em>Rated Authors</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.forum.impl.ForumImpl#getFeaturedBooks <em>Featured Books</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForumImpl extends EObjectImpl implements Forum {
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
	 * The cached value of the '{@link #getRatedAuthors() <em>Rated Authors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatedAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList<Writer> ratedAuthors;

	/**
	 * The cached value of the '{@link #getFeaturedBooks() <em>Featured Books</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturedBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> featuredBooks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForumPackage.Literals.FORUM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.FORUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Writer> getRatedAuthors() {
		if (ratedAuthors == null) {
			ratedAuthors = new EObjectResolvingEList<Writer>(Writer.class, this, ForumPackage.FORUM__RATED_AUTHORS);
		}
		return ratedAuthors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getFeaturedBooks() {
		if (featuredBooks == null) {
			featuredBooks = new EObjectResolvingEList<Book>(Book.class, this, ForumPackage.FORUM__FEATURED_BOOKS);
		}
		return featuredBooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForumPackage.FORUM__NAME:
				return getName();
			case ForumPackage.FORUM__RATED_AUTHORS:
				return getRatedAuthors();
			case ForumPackage.FORUM__FEATURED_BOOKS:
				return getFeaturedBooks();
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
			case ForumPackage.FORUM__NAME:
				setName((String)newValue);
				return;
			case ForumPackage.FORUM__RATED_AUTHORS:
				getRatedAuthors().clear();
				getRatedAuthors().addAll((Collection<? extends Writer>)newValue);
				return;
			case ForumPackage.FORUM__FEATURED_BOOKS:
				getFeaturedBooks().clear();
				getFeaturedBooks().addAll((Collection<? extends Book>)newValue);
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
			case ForumPackage.FORUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ForumPackage.FORUM__RATED_AUTHORS:
				getRatedAuthors().clear();
				return;
			case ForumPackage.FORUM__FEATURED_BOOKS:
				getFeaturedBooks().clear();
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
			case ForumPackage.FORUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ForumPackage.FORUM__RATED_AUTHORS:
				return ratedAuthors != null && !ratedAuthors.isEmpty();
			case ForumPackage.FORUM__FEATURED_BOOKS:
				return featuredBooks != null && !featuredBooks.isEmpty();
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

} //ForumImpl
