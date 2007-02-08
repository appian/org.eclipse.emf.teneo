/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementImpl.java,v 1.2 2007/02/08 23:09:17 mtaal Exp $
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

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.nestedgroup.CType;
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
	@Override
	protected EClass eStaticClass() {
		return NestedgroupPackage.Literals.ELEMENT;
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
		return (String)getMixed().get(NestedgroupPackage.Literals.ELEMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(NestedgroupPackage.Literals.ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTrue() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(NestedgroupPackage.Literals.ELEMENT__TRUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CType> getC() {
		return getTrue().list(NestedgroupPackage.Literals.ELEMENT__C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRecursive() {
		return (Element)getMixed().get(NestedgroupPackage.Literals.ELEMENT__RECURSIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursive(Element newRecursive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(NestedgroupPackage.Literals.ELEMENT__RECURSIVE, newRecursive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursive(Element newRecursive) {
		((FeatureMap.Internal)getMixed()).set(NestedgroupPackage.Literals.ELEMENT__RECURSIVE, newRecursive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NestedgroupPackage.ELEMENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case NestedgroupPackage.ELEMENT__TRUE:
				return ((InternalEList<?>)getTrue()).basicRemove(otherEnd, msgs);
			case NestedgroupPackage.ELEMENT__C:
				return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				return basicSetRecursive(null, msgs);
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
			case NestedgroupPackage.ELEMENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case NestedgroupPackage.ELEMENT__NAME:
				return getName();
			case NestedgroupPackage.ELEMENT__TRUE:
				if (coreType) return getTrue();
				return ((FeatureMap.Internal)getTrue()).getWrapper();
			case NestedgroupPackage.ELEMENT__C:
				return getC();
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				return getRecursive();
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
			case NestedgroupPackage.ELEMENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case NestedgroupPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case NestedgroupPackage.ELEMENT__TRUE:
				((FeatureMap.Internal)getTrue()).set(newValue);
				return;
			case NestedgroupPackage.ELEMENT__C:
				getC().clear();
				getC().addAll((Collection<? extends CType>)newValue);
				return;
			case NestedgroupPackage.ELEMENT__RECURSIVE:
				setRecursive((Element)newValue);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
