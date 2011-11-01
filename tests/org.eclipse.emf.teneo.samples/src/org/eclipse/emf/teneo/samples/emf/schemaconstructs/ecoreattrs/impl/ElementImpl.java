/**
 * <copyright>
 * </copyright>
 *
 * $Id: ElementImpl.java,v 1.2 2007/02/08 23:09:22 mtaal Exp $
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
	@Override
	protected EClass eStaticClass() {
		return EcoreattrsPackage.Literals.ELEMENT;
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
		return (NameList)getNameMap().get(EcoreattrsPackage.Literals.ELEMENT__NAMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNames(NameList newNames, NotificationChain msgs) {
		return ((FeatureMap.Internal)getNameMap()).basicAdd(EcoreattrsPackage.Literals.ELEMENT__NAMES, newNames, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNames(NameList newNames) {
		((FeatureMap.Internal)getNameMap()).set(EcoreattrsPackage.Literals.ELEMENT__NAMES, newNames);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				return ((InternalEList<?>)getNameMap()).basicRemove(otherEnd, msgs);
			case EcoreattrsPackage.ELEMENT__NAMES:
				return basicSetNames(null, msgs);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				if (coreType) return getNameMap();
				return ((FeatureMap.Internal)getNameMap()).getWrapper();
			case EcoreattrsPackage.ELEMENT__NAMES:
				return getNames();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				((FeatureMap.Internal)getNameMap()).set(newValue);
				return;
			case EcoreattrsPackage.ELEMENT__NAMES:
				setNames((NameList)newValue);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				getNameMap().clear();
				return;
			case EcoreattrsPackage.ELEMENT__NAMES:
				setNames((NameList)null);
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
			case EcoreattrsPackage.ELEMENT__NAME_MAP:
				return nameMap != null && !nameMap.isEmpty();
			case EcoreattrsPackage.ELEMENT__NAMES:
				return getNames() != null;
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
		result.append(" (nameMap: ");
		result.append(nameMap);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
