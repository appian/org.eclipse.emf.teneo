/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumberTypeImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.ComplexNumber;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.NumberType;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.SubstitutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl#getMySimpleAbstractGroup <em>My Simple Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl#getMySimpleAbstract <em>My Simple Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl#getMyComplexAbstractGroup <em>My Complex Abstract Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.substitution.impl.NumberTypeImpl#getMyComplexAbstract <em>My Complex Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberTypeImpl extends EObjectImpl implements NumberType {
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
	 * The cached value of the '{@link #getMySimpleAbstractGroup() <em>My Simple Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySimpleAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mySimpleAbstractGroup = null;

	/**
	 * The default value of the '{@link #getMySimpleAbstract() <em>My Simple Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMySimpleAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MY_SIMPLE_ABSTRACT_EDEFAULT = null;

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
	protected NumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SubstitutionPackage.eINSTANCE.getNumberType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubstitutionPackage.NUMBER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMySimpleAbstractGroup() {
		if (mySimpleAbstractGroup == null) {
			mySimpleAbstractGroup = new BasicFeatureMap(this, SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP);
		}
		return mySimpleAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMySimpleAbstract() {
		return (BigInteger)getMySimpleAbstractGroup().get(SubstitutionPackage.eINSTANCE.getNumberType_MySimpleAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMyComplexAbstractGroup() {
		if (myComplexAbstractGroup == null) {
			myComplexAbstractGroup = new BasicFeatureMap(this, SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP);
		}
		return myComplexAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexNumber getMyComplexAbstract() {
		return (ComplexNumber)getMyComplexAbstractGroup().get(SubstitutionPackage.eINSTANCE.getNumberType_MyComplexAbstract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyComplexAbstract(ComplexNumber newMyComplexAbstract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMyComplexAbstractGroup()).basicAdd(SubstitutionPackage.eINSTANCE.getNumberType_MyComplexAbstract(), newMyComplexAbstract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP:
					return ((InternalEList)getMySimpleAbstractGroup()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
					return ((InternalEList)getMyComplexAbstractGroup()).basicRemove(otherEnd, msgs);
				case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
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
			case SubstitutionPackage.NUMBER_TYPE__NAME:
				return getName();
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP:
				return getMySimpleAbstractGroup();
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT:
				return getMySimpleAbstract();
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return getMyComplexAbstractGroup();
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
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
			case SubstitutionPackage.NUMBER_TYPE__NAME:
				setName((String)newValue);
				return;
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP:
				getMySimpleAbstractGroup().clear();
				getMySimpleAbstractGroup().addAll((Collection)newValue);
				return;
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
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
			case SubstitutionPackage.NUMBER_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP:
				getMySimpleAbstractGroup().clear();
				return;
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
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
			case SubstitutionPackage.NUMBER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT_GROUP:
				return mySimpleAbstractGroup != null && !mySimpleAbstractGroup.isEmpty();
			case SubstitutionPackage.NUMBER_TYPE__MY_SIMPLE_ABSTRACT:
				return MY_SIMPLE_ABSTRACT_EDEFAULT == null ? getMySimpleAbstract() != null : !MY_SIMPLE_ABSTRACT_EDEFAULT.equals(getMySimpleAbstract());
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT_GROUP:
				return myComplexAbstractGroup != null && !myComplexAbstractGroup.isEmpty();
			case SubstitutionPackage.NUMBER_TYPE__MY_COMPLEX_ABSTRACT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mySimpleAbstractGroup: ");
		result.append(mySimpleAbstractGroup);
		result.append(", myComplexAbstractGroup: ");
		result.append(myComplexAbstractGroup);
		result.append(')');
		return result.toString();
	}

} //NumberTypeImpl
