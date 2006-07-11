/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchoolLibraryImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.LibraryImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoolLibrary;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoollibraryPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl.SchoolLibraryImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchoolLibraryImpl extends LibraryImpl implements SchoolLibrary {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SchoollibraryPackage.eINSTANCE.getSchoolLibrary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoollibraryPackage.SCHOOL_LIBRARY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SchoollibraryPackage.SCHOOL_LIBRARY__WRITERS:
					return ((InternalEList)getWriters()).basicRemove(otherEnd, msgs);
				case SchoollibraryPackage.SCHOOL_LIBRARY__BOOKS:
					return ((InternalEList)getBooks()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SchoollibraryPackage.SCHOOL_LIBRARY__NAME:
				return getName();
			case SchoollibraryPackage.SCHOOL_LIBRARY__WRITERS:
				return getWriters();
			case SchoollibraryPackage.SCHOOL_LIBRARY__BOOKS:
				return getBooks();
			case SchoollibraryPackage.SCHOOL_LIBRARY__LOCATION:
				return getLocation();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SchoollibraryPackage.SCHOOL_LIBRARY__NAME:
				setName((String)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__WRITERS:
				getWriters().clear();
				getWriters().addAll((Collection)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__LOCATION:
				setLocation((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SchoollibraryPackage.SCHOOL_LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__WRITERS:
				getWriters().clear();
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__BOOKS:
				getBooks().clear();
				return;
			case SchoollibraryPackage.SCHOOL_LIBRARY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SchoollibraryPackage.SCHOOL_LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SchoollibraryPackage.SCHOOL_LIBRARY__WRITERS:
				return writers != null && !writers.isEmpty();
			case SchoollibraryPackage.SCHOOL_LIBRARY__BOOKS:
				return books != null && !books.isEmpty();
			case SchoollibraryPackage.SCHOOL_LIBRARY__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SchoolLibraryImpl
