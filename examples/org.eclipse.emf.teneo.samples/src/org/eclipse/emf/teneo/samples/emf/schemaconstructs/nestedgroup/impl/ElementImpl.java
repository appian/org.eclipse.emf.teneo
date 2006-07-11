/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementImpl.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.Element;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.NestedgroupPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.ElementImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.ElementImpl#getTrue <em>True</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.ElementImpl#getC <em>C</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.impl.ElementImpl#getRecursive <em>Recursive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NestedgroupPackage.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, NestedgroupPackage.ELEMENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)getMixed().get(NestedgroupPackage.eINSTANCE.getElement_Name(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(NestedgroupPackage.eINSTANCE.getElement_Name(), newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTrue() {
		return (FeatureMap)((FeatureMap)getMixed()).list(NestedgroupPackage.eINSTANCE.getElement_True());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getC() {
		return ((FeatureMap)getTrue()).list(NestedgroupPackage.eINSTANCE.getElement_C());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRecursive() {
		return (Element)getMixed().get(NestedgroupPackage.eINSTANCE.getElement_Recursive(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursive(Element newRecursive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NestedgroupPackage.eINSTANCE.getElement_Recursive(), newRecursive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursive(Element newRecursive) {
		((FeatureMap.Internal)getMixed()).set(NestedgroupPackage.eINSTANCE.getElement_Recursive(), newRecursive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case NestedgroupPackage.ELEMENT__MIXED:
					return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
				case NestedgroupPackage.ELEMENT__TRUE:
					return ((InternalEList)getTrue()).basicRemove(otherEnd, msgs);
				case NestedgroupPackage.ELEMENT__C:
					return ((InternalEList)getC()).basicRemove(otherEnd, msgs);
				case NestedgroupPackage.ELEMENT__RECURSIVE:
					return basicSetRecursive(null, msgs);
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
			case NestedgroupPackage.ELEMENT__MIXED:
				return getMixed();
			case NestedgroupPackage.ELEMENT__NAME:
				return getName();
			case NestedgroupPackage.ELEMENT__TRUE:
				return getTrue();
			case NestedgroupPackage.ELEMENT__C:
				return getC();
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				return getRecursive();
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
			case NestedgroupPackage.ELEMENT__MIXED:
				getMixed().clear();
				getMixed().addAll((Collection)newValue);
				return;
			case NestedgroupPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case NestedgroupPackage.ELEMENT__TRUE:
				getTrue().clear();
				getTrue().addAll((Collection)newValue);
				return;
			case NestedgroupPackage.ELEMENT__C:
				getC().clear();
				getC().addAll((Collection)newValue);
				return;
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				setRecursive((Element)newValue);
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
			case NestedgroupPackage.ELEMENT__MIXED:
				getMixed().clear();
				return;
			case NestedgroupPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NestedgroupPackage.ELEMENT__TRUE:
				getTrue().clear();
				return;
			case NestedgroupPackage.ELEMENT__C:
				getC().clear();
				return;
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				setRecursive((Element)null);
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
			case NestedgroupPackage.ELEMENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case NestedgroupPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case NestedgroupPackage.ELEMENT__TRUE:
				return !getTrue().isEmpty();
			case NestedgroupPackage.ELEMENT__C:
				return !getC().isEmpty();
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				return getRecursive() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
