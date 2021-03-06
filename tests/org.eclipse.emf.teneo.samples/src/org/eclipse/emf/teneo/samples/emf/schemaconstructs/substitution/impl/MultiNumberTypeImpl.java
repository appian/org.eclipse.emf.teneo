/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultiNumberTypeImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

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

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.MultiNumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.MultiNumberTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.MultiNumberTypeImpl#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.MultiNumberTypeImpl#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiNumberTypeImpl extends EObjectImpl implements MultiNumberType {
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
	 * The cached value of the '{@link #getMyComplexAbstractGroup() <em>My Complex Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyComplexAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap myComplexAbstractGroup = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SubstitutionPackage.eINSTANCE.getMultiNumberType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubstitutionPackage.MULTI_NUMBER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMyComplexAbstractGroup() {
		if (myComplexAbstractGroup == null) {
			myComplexAbstractGroup = new BasicFeatureMap(this, SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		}
		return myComplexAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMyComplexAbstract() {
		return ((FeatureMap)getMyComplexAbstractGroup()).list(SubstitutionPackage.eINSTANCE.getMultiNumberType_MyComplexAbstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
					return ((InternalEList)getMyComplexAbstractGroup()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
					return ((InternalEList)getMyComplexAbstract()).basicRemove(otherEnd, msgs);
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
			case SubstitutionPackage.MULTI_NUMBER_TYPE__NAME:
				return getName();
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return getMyComplexAbstractGroup();
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract();
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
			case SubstitutionPackage.MULTI_NUMBER_TYPE__NAME:
				setName((String)newValue);
				return;
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				getMyComplexAbstractGroup().clear();
				getMyComplexAbstractGroup().addAll((Collection)newValue);
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
			case SubstitutionPackage.MULTI_NUMBER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				getMyComplexAbstractGroup().clear();
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
			case SubstitutionPackage.MULTI_NUMBER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return myComplexAbstractGroup != null && !myComplexAbstractGroup.isEmpty();
			case SubstitutionPackage.MULTI_NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
				return !getMyComplexAbstract().isEmpty();
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
		result.append(", myComplexAbstractGroup: ");
		result.append(myComplexAbstractGroup);
		result.append(')');
		return result.toString();
	}

} //MultiNumberTypeImpl
