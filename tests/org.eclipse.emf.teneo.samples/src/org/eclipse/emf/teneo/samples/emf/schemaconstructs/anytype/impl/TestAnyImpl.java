/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestAnyImpl.java,v 1.3 2008/04/07 15:14:20 mtaal Exp $
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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.anytype.impl.TestAnyImpl#getA <em>A</em>}</li>
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
	protected EObject singleAnyType;

	/**
	 * The cached value of the '{@link #getMultiAnyType() <em>Multi Any Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiAnyType()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> multiAnyType;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final String A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected String a = A_EDEFAULT;

	/**
	 * This is true if the A attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aESet;

	/**
	 * The cached value of the '{@link #getMyAny() <em>My Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap myAny;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	@Override
	protected EClass eStaticClass() {
		return AnytypePackage.Literals.TEST_ANY;
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
	public EList<EObject> getMultiAnyType() {
		if (multiAnyType == null) {
			multiAnyType = new EObjectContainmentEList<EObject>(EObject.class, this, AnytypePackage.TEST_ANY__MULTI_ANY_TYPE);
		}
		return multiAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(String newA) {
		String oldA = a;
		a = newA;
		boolean oldAESet = aESet;
		aESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnytypePackage.TEST_ANY__A, oldA, a, !oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetA() {
		String oldA = a;
		boolean oldAESet = aESet;
		a = A_EDEFAULT;
		aESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnytypePackage.TEST_ANY__A, oldA, A_EDEFAULT, oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetA() {
		return aESet;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				return basicSetSingleAnyType(null, msgs);
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				return ((InternalEList<?>)getMultiAnyType()).basicRemove(otherEnd, msgs);
			case AnytypePackage.TEST_ANY__MY_ANY:
				return ((InternalEList<?>)getMyAny()).basicRemove(otherEnd, msgs);
			case AnytypePackage.TEST_ANY__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case AnytypePackage.TEST_ANY__NAME:
				return getName();
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				return getSingleAnyType();
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				return getMultiAnyType();
			case AnytypePackage.TEST_ANY__A:
				return getA();
			case AnytypePackage.TEST_ANY__MY_ANY:
				if (coreType) return getMyAny();
				return ((FeatureMap.Internal)getMyAny()).getWrapper();
			case AnytypePackage.TEST_ANY__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case AnytypePackage.TEST_ANY__NAME:
				setName((String)newValue);
				return;
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				setSingleAnyType((EObject)newValue);
				return;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				getMultiAnyType().clear();
				getMultiAnyType().addAll((Collection<? extends EObject>)newValue);
				return;
			case AnytypePackage.TEST_ANY__A:
				setA((String)newValue);
				return;
			case AnytypePackage.TEST_ANY__MY_ANY:
				((FeatureMap.Internal)getMyAny()).set(newValue);
				return;
			case AnytypePackage.TEST_ANY__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case AnytypePackage.TEST_ANY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				setSingleAnyType((EObject)null);
				return;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				getMultiAnyType().clear();
				return;
			case AnytypePackage.TEST_ANY__A:
				unsetA();
				return;
			case AnytypePackage.TEST_ANY__MY_ANY:
				getMyAny().clear();
				return;
			case AnytypePackage.TEST_ANY__ANY:
				getAny().clear();
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
			case AnytypePackage.TEST_ANY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnytypePackage.TEST_ANY__SINGLE_ANY_TYPE:
				return singleAnyType != null;
			case AnytypePackage.TEST_ANY__MULTI_ANY_TYPE:
				return multiAnyType != null && !multiAnyType.isEmpty();
			case AnytypePackage.TEST_ANY__A:
				return isSetA();
			case AnytypePackage.TEST_ANY__MY_ANY:
				return myAny != null && !myAny.isEmpty();
			case AnytypePackage.TEST_ANY__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", a: ");
		if (aESet) result.append(a); else result.append("<unset>");
		result.append(", myAny: ");
		result.append(myAny);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //TestAnyImpl
