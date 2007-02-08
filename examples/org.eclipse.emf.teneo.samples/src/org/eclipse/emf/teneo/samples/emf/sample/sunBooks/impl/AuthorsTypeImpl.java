/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuthorsTypeImpl.java,v 1.2 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.AuthorsType;
import org.eclipse.emf.teneo.samples.emf.sample.sunBooks.SunBooksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.sunBooks.impl.AuthorsTypeImpl#getAuthorName <em>Author Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorsTypeImpl extends EObjectImpl implements AuthorsType {
	/**
	 * The cached value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> authorName = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SunBooksPackage.Literals.AUTHORS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAuthorName() {
		if (authorName == null) {
			authorName = new EDataTypeEList<String>(String.class, this, SunBooksPackage.AUTHORS_TYPE__AUTHOR_NAME);
		}
		return authorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SunBooksPackage.AUTHORS_TYPE__AUTHOR_NAME:
				return getAuthorName();
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
			case SunBooksPackage.AUTHORS_TYPE__AUTHOR_NAME:
				getAuthorName().clear();
				getAuthorName().addAll((Collection<? extends String>)newValue);
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
			case SunBooksPackage.AUTHORS_TYPE__AUTHOR_NAME:
				getAuthorName().clear();
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
			case SunBooksPackage.AUTHORS_TYPE__AUTHOR_NAME:
				return authorName != null && !authorName.isEmpty();
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
		result.append(" (authorName: ");
		result.append(authorName);
		result.append(')');
		return result.toString();
	}

} //AuthorsTypeImpl
