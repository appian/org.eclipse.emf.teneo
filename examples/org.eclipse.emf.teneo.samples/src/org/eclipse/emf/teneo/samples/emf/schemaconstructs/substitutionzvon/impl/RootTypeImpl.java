/**
 * <copyright>
 * </copyright>
 *
 * $Id: RootTypeImpl.java,v 1.1 2006/07/11 16:56:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.ComplexAAA;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.RootType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.SubstitutionzvonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl#getMyAbstractGroup <em>My Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl#getMyAbstract <em>My Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitutionzvon.impl.RootTypeImpl#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootTypeImpl extends EObjectImpl implements RootType {
	/**
	 * The cached value of the '{@link #getMyAbstractGroup() <em>My Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap myAbstractGroup = null;

	/**
	 * The default value of the '{@link #getMyAbstract() <em>My Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MY_ABSTRACT_EDEFAULT = null;

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
	protected RootTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SubstitutionzvonPackage.eINSTANCE.getRootType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMyAbstractGroup() {
		if (myAbstractGroup == null) {
			myAbstractGroup = new BasicFeatureMap(this, SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP);
		}
		return myAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMyAbstract() {
		return (BigInteger)getMyAbstractGroup().get(SubstitutionzvonPackage.eINSTANCE.getRootType_MyAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMyComplexAbstractGroup() {
		if (myComplexAbstractGroup == null) {
			myComplexAbstractGroup = new BasicFeatureMap(this, SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		}
		return myComplexAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexAAA getMyComplexAbstract() {
		return (ComplexAAA)getMyComplexAbstractGroup().get(SubstitutionzvonPackage.eINSTANCE.getRootType_MyComplexAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyComplexAbstract(ComplexAAA newMyComplexAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMyComplexAbstractGroup()).basicAdd(SubstitutionzvonPackage.eINSTANCE.getRootType_MyComplexAbstract(), newMyComplexAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP:
					return ((InternalEList)getMyAbstractGroup()).basicRemove(otherEnd, msgs);
				case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
					return ((InternalEList)getMyComplexAbstractGroup()).basicRemove(otherEnd, msgs);
				case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT:
					return basicSetMyComplexAbstract(null, msgs);
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
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP:
				return getMyAbstractGroup();
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT:
				return getMyAbstract();
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return getMyComplexAbstractGroup();
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT:
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
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP:
				getMyAbstractGroup().clear();
				getMyAbstractGroup().addAll((Collection)newValue);
				return;
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
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
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP:
				getMyAbstractGroup().clear();
				return;
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
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
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT_GROUP:
				return myAbstractGroup != null && !myAbstractGroup.isEmpty();
			case SubstitutionzvonPackage.ROOT_TYPE__MY_ABSTRACT:
				return MY_ABSTRACT_EDEFAULT == null ? getMyAbstract() != null : !MY_ABSTRACT_EDEFAULT.equals(getMyAbstract());
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return myComplexAbstractGroup != null && !myComplexAbstractGroup.isEmpty();
			case SubstitutionzvonPackage.ROOT_TYPE__MY_COMPLEX_ABSTRACT:
				return getMyComplexAbstract() != null;
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
		result.append(" (myAbstractGroup: ");
		result.append(myAbstractGroup);
		result.append(", myComplexAbstractGroup: ");
		result.append(myComplexAbstractGroup);
		result.append(')');
		return result.toString();
	}

} //RootTypeImpl
