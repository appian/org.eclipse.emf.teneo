/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersonImpl.java,v 1.1 2006/07/11 16:57:06 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.DetachfeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getPhones <em>Phones</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getOffice <em>Office</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getFax <em>Fax</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.detach.detachfeaturemap.impl.PersonImpl#getHome <em>Home</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
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
	 * The cached value of the '{@link #getPhones() <em>Phones</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhones()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap phones = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return DetachfeaturemapPackage.eINSTANCE.getPerson();
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
			eNotify(new ENotificationImpl(this, Notification.SET, DetachfeaturemapPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPhones() {
		if (phones == null) {
			phones = new BasicFeatureMap(this, DetachfeaturemapPackage.PERSON__PHONES);
		}
		return phones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOffice() {
		return ((FeatureMap)getPhones()).list(DetachfeaturemapPackage.eINSTANCE.getPerson_Office());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMobile() {
		return ((FeatureMap)getPhones()).list(DetachfeaturemapPackage.eINSTANCE.getPerson_Mobile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFax() {
		return ((FeatureMap)getPhones()).list(DetachfeaturemapPackage.eINSTANCE.getPerson_Fax());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHome() {
		return ((FeatureMap)getPhones()).list(DetachfeaturemapPackage.eINSTANCE.getPerson_Home());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case DetachfeaturemapPackage.PERSON__PHONES:
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
			case DetachfeaturemapPackage.PERSON__NAME:
				return getName();
			case DetachfeaturemapPackage.PERSON__PHONES:
				return getPhones();
			case DetachfeaturemapPackage.PERSON__OFFICE:
				return getOffice();
			case DetachfeaturemapPackage.PERSON__MOBILE:
				return getMobile();
			case DetachfeaturemapPackage.PERSON__FAX:
				return getFax();
			case DetachfeaturemapPackage.PERSON__HOME:
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
			case DetachfeaturemapPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case DetachfeaturemapPackage.PERSON__PHONES:
				getPhones().clear();
				getPhones().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.PERSON__OFFICE:
				getOffice().clear();
				getOffice().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.PERSON__MOBILE:
				getMobile().clear();
				getMobile().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.PERSON__FAX:
				getFax().clear();
				getFax().addAll((Collection)newValue);
				return;
			case DetachfeaturemapPackage.PERSON__HOME:
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
			case DetachfeaturemapPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DetachfeaturemapPackage.PERSON__PHONES:
				getPhones().clear();
				return;
			case DetachfeaturemapPackage.PERSON__OFFICE:
				getOffice().clear();
				return;
			case DetachfeaturemapPackage.PERSON__MOBILE:
				getMobile().clear();
				return;
			case DetachfeaturemapPackage.PERSON__FAX:
				getFax().clear();
				return;
			case DetachfeaturemapPackage.PERSON__HOME:
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
			case DetachfeaturemapPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DetachfeaturemapPackage.PERSON__PHONES:
				return phones != null && !phones.isEmpty();
			case DetachfeaturemapPackage.PERSON__OFFICE:
				return !getOffice().isEmpty();
			case DetachfeaturemapPackage.PERSON__MOBILE:
				return !getMobile().isEmpty();
			case DetachfeaturemapPackage.PERSON__FAX:
				return !getFax().isEmpty();
			case DetachfeaturemapPackage.PERSON__HOME:
				return !getHome().isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", phones: ");
		result.append(phones);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
