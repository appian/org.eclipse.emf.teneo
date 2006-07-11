/**
 * <copyright>
 * </copyright>
 *
 * $Id: SchoolBookImpl.java,v 1.1 2006/07/11 16:56:57 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.BookCategory;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.LibraryPackage;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.Writer;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.library.impl.BookImpl;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.Asset;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoolBook;
import org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.SchoollibraryPackage;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schoollibrary.schoollibrary.impl.SchoolBookImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchoolBookImpl extends BookImpl implements SchoolBook {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SchoollibraryPackage.eINSTANCE.getSchoolBook();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchoollibraryPackage.SCHOOL_BOOK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
					if (author != null)
						msgs = ((InternalEObject)author).eInverseRemove(this, LibraryPackage.WRITER__BOOKS, Writer.class, msgs);
					return basicSetAuthor((Writer)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
					return basicSetAuthor(null, msgs);
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
			case SchoollibraryPackage.SCHOOL_BOOK__TITLE:
				return getTitle();
			case SchoollibraryPackage.SCHOOL_BOOK__PAGES:
				return new Integer(getPages());
			case SchoollibraryPackage.SCHOOL_BOOK__CATEGORY:
				return getCategory();
			case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case SchoollibraryPackage.SCHOOL_BOOK__VALUE:
				return new Float(getValue());
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
			case SchoollibraryPackage.SCHOOL_BOOK__TITLE:
				setTitle((String)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__PAGES:
				setPages(((Integer)newValue).intValue());
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__CATEGORY:
				setCategory((BookCategory)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
				setAuthor((Writer)newValue);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__VALUE:
				setValue(((Float)newValue).floatValue());
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
			case SchoollibraryPackage.SCHOOL_BOOK__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__PAGES:
				setPages(PAGES_EDEFAULT);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
				setAuthor((Writer)null);
				return;
			case SchoollibraryPackage.SCHOOL_BOOK__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case SchoollibraryPackage.SCHOOL_BOOK__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case SchoollibraryPackage.SCHOOL_BOOK__PAGES:
				return pages != PAGES_EDEFAULT;
			case SchoollibraryPackage.SCHOOL_BOOK__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case SchoollibraryPackage.SCHOOL_BOOK__AUTHOR:
				return author != null;
			case SchoollibraryPackage.SCHOOL_BOOK__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Asset.class) {
			switch (derivedFeatureID) {
				case SchoollibraryPackage.SCHOOL_BOOK__VALUE: return SchoollibraryPackage.ASSET__VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Asset.class) {
			switch (baseFeatureID) {
				case SchoollibraryPackage.ASSET__VALUE: return SchoollibraryPackage.SCHOOL_BOOK__VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SchoolBookImpl
