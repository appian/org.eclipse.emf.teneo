/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestAnyImpl.java,v 1.1 2006/07/11 16:56:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.AnytypePackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.TestAny;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getSingleAnyType <em>Single Any Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getMultiAnyType <em>Multi Any Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getMyAny <em>My Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestAnyImpl extends EObjectImpl implements TestAny {
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
	 * The cached value of the '{@link #getSingleAnyType() <em>Single Any Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleAnyType()
	 * @generated
	 * @ordered
	 */
	protected EObject singleAnyType = null;

	/**
	 * The cached value of the '{@link #getMultiAnyType() <em>Multi Any Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiAnyType()
	 * @generated
	 * @ordered
	 */
	protected EList multiAnyType = null;

	/**
	 * The cached value of the '{@link #getMyAny() <em>My Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap myAny = null;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestAnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AnytypePackage.eINSTANCE.getTestAny();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.TEST_ANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSingleAnyType() {
		return singleAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleAnyType(EObject newSingleAnyType, NotificationChain msgs) {
		EObject oldSingleAnyType = singleAnyType;
		singleAnyType = newSingleAnyType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE, oldSingleAnyType, newSingleAnyType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleAnyType(EObject newSingleAnyType) {
		if (newSingleAnyType != singleAnyType) {
			NotificationChain msgs = null;
			if (singleAnyType != null)
				msgs = ((InternalEObject)singleAnyType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE, null, msgs);
			if (newSingleAnyType != null)
				msgs = ((InternalEObject)newSingleAnyType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE, null, msgs);
			msgs = basicSetSingleAnyType(newSingleAnyType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE, newSingleAnyType, newSingleAnyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMultiAnyType() {
		if (multiAnyType == null) {
			multiAnyType = new EObjectContainmentEList(EObject.class, this, AnytypePackage.TEST_ANY__MULTI_ANY_TYPE);
		}
		return multiAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMyAny() {
		if (myAny == null) {
			myAny = new BasicFeatureMap(this, AnytypePackage.TEST_ANY__MY_ANY);
		}
		return myAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, AnytypePackage.TEST_ANY__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
					return basicSetSingleAnyType(null, msgs);
				case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
					return ((InternalEList)getMultiAnyType()).basicRemove(otherEnd, msgs);
				case AnytypePackage.TEST_ANY__MY_ANY:
					return ((InternalEList)getMyAny()).basicRemove(otherEnd, msgs);
				case AnytypePackage.TEST_ANY__ANY:
					return ((InternalEList)getAny()).basicRemove(otherEnd, msgs);
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
			case AnytypePackage.TEST_ANY__NAME:
				return getName();
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				return getSingleAnyType();
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				return getMultiAnyType();
			case AnytypePackage.TEST_ANY__MY_ANY:
				return getMyAny();
			case AnytypePackage.TEST_ANY__ANY:
				return getAny();
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
			case AnytypePackage.TEST_ANY__NAME:
				setName((String)newValue);
				return;
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				setSingleAnyType((EObject)newValue);
				return;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				getMultiAnyType().clear();
				getMultiAnyType().addAll((Collection)newValue);
				return;
			case AnytypePackage.TEST_ANY__MY_ANY:
				getMyAny().clear();
				getMyAny().addAll((Collection)newValue);
				return;
			case AnytypePackage.TEST_ANY__ANY:
				getAny().clear();
				getAny().addAll((Collection)newValue);
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
			case AnytypePackage.TEST_ANY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				setSingleAnyType((EObject)null);
				return;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				getMultiAnyType().clear();
				return;
			case AnytypePackage.TEST_ANY__MY_ANY:
				getMyAny().clear();
				return;
			case AnytypePackage.TEST_ANY__ANY:
				getAny().clear();
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
			case AnytypePackage.TEST_ANY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				return singleAnyType != null;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				return multiAnyType != null && !multiAnyType.isEmpty();
			case AnytypePackage.TEST_ANY__MY_ANY:
				return myAny != null && !myAny.isEmpty();
			case AnytypePackage.TEST_ANY__ANY:
				return any != null && !any.isEmpty();
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
		result.append(", myAny: ");
		result.append(myAny);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //TestAnyImpl
