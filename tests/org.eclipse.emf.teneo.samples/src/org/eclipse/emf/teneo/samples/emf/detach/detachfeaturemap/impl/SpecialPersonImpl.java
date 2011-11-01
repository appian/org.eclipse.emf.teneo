/**
 * <copyright>
 * </copyright>
 *
 * $Id: SpecialPersonImpl.java,v 1.1 2006/07/11 16:57:06 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.SpecialPerson;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SpecialPersonImpl extends PersonImpl implements SpecialPerson {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialPersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DetachfeaturemapPackage.eINSTANCE.getSpecialPerson();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case DetachfeaturemapPackage.SPECIAL_PERSON__PHONES:
					return ((InternalEList)getPhones()).basicRemove(otherEnd, msgs);
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
			case DetachfeaturemapPackage.SPECIAL_PERSON__NAME:
				return getName();
			case DetachfeaturemapPackage.SPECIAL_PERSON__PHONES:
				return getPhones();
			case DetachfeaturemapPackage.SPECIAL_PERSON__OFFICE:
				return getOffice();
			case DetachfeaturemapPackage.SPECIAL_PERSON__MOBILE:
				return getMobile();
			case DetachfeaturemapPackage.SPECIAL_PERSON__FAX:
				return getFax();
			case DetachfeaturemapPackage.SPECIAL_PERSON__HOME:
				return getHome();
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
			case DetachfeaturemapPackage.SPECIAL_PERSON__NAME:
				setName((String)newValue);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__PHONES:
				getPhones().clear();
				getPhones().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__OFFICE:
				getOffice().clear();
				getOffice().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__MOBILE:
				getMobile().clear();
				getMobile().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__FAX:
				getFax().clear();
				getFax().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__HOME:
				getHome().clear();
				getHome().addAll((Collection)newValue);
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
			case DetachfeaturemapPackage.SPECIAL_PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__PHONES:
				getPhones().clear();
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__OFFICE:
				getOffice().clear();
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__MOBILE:
				getMobile().clear();
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__FAX:
				getFax().clear();
				return;
			case DetachfeaturemapPackage.SPECIAL_PERSON__HOME:
				getHome().clear();
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
			case DetachfeaturemapPackage.SPECIAL_PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DetachfeaturemapPackage.SPECIAL_PERSON__PHONES:
				return phones != null && !phones.isEmpty();
			case DetachfeaturemapPackage.SPECIAL_PERSON__OFFICE:
				return !getOffice().isEmpty();
			case DetachfeaturemapPackage.SPECIAL_PERSON__MOBILE:
				return !getMobile().isEmpty();
			case DetachfeaturemapPackage.SPECIAL_PERSON__FAX:
				return !getFax().isEmpty();
			case DetachfeaturemapPackage.SPECIAL_PERSON__HOME:
				return !getHome().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //SpecialPersonImpl
