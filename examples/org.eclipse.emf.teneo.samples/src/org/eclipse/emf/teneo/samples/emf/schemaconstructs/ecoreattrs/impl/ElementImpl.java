/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementImpl.java,v 1.1 2006/07/11 16:57:06 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.EcoreattrsPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.Element;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.NameList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl#getNameMap <em>Name Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.ecoreattrs.impl.ElementImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getNameMap() <em>Name Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap nameMap = null;

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
		return EcoreattrsPackage.eINSTANCE.getElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getNameMap() {
		if (nameMap == null) {
			nameMap = new BasicFeatureMap(this, EcoreattrsPackage.ELEMENT__NAME_MAP);
		}
		return nameMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameList getNames() {
		return (NameList)getNameMap().get(EcoreattrsPackage.eINSTANCE.getElement_Names(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNames(NameList newNames, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNameMap()).basicAdd(EcoreattrsPackage.eINSTANCE.getElement_Names(), newNames, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNames(NameList newNames) {
		((FeatureMap.Internal)getNameMap()).set(EcoreattrsPackage.eINSTANCE.getElement_Names(), newNames);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case EcoreattrsPackage.ELEMENT__NAME_MAP:
					return ((InternalEList)getNameMap()).basicRemove(otherEnd, msgs);
				case EcoreattrsPackage.ELEMENT__NAMES:
					return basicSetNames(null, msgs);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				return getNameMap();
			case EcoreattrsPackage.ELEMENT__NAMES:
				return getNames();
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				getNameMap().clear();
				getNameMap().addAll((Collection)newValue);
				return;
			case EcoreattrsPackage.ELEMENT__NAMES:
				setNames((NameList)newValue);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				getNameMap().clear();
				return;
			case EcoreattrsPackage.ELEMENT__NAMES:
				setNames((NameList)null);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				return nameMap != null && !nameMap.isEmpty();
			case EcoreattrsPackage.ELEMENT__NAMES:
				return getNames() != null;
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
		result.append(" (nameMap: ");
		result.append(nameMap);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
