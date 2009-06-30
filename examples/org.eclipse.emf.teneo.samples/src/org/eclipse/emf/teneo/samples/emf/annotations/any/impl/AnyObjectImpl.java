/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyObjectImpl.java,v 1.2.2.2 2009/06/30 07:30:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.any.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyObject;
import org.eclipse.emf.teneo.samples.emf.annotations.any.AnyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getGlobalInt <em>Global Int</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getGlobalString <em>Global String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getAnyOne <em>Any One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.any.impl.AnyObjectImpl#getAny1 <em>Any1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyObjectImpl extends EObjectImpl implements AnyObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalInt() <em>Global Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalInt()
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGlobalInt() <em>Global Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalInt()
	 * @generated
	 * @ordered
	 */
	protected int globalInt = GLOBAL_INT_EDEFAULT;

	/**
	 * This is true if the Global Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean globalIntESet;

	/**
	 * The default value of the '{@link #getGlobalString() <em>Global String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalString()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalString() <em>Global String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalString()
	 * @generated
	 * @ordered
	 */
	protected String globalString = GLOBAL_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyOne() <em>Any One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOne()
	 * @generated
	 * @ordered
	 */
	protected EObject anyOne;

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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnyPackage.Literals.ANY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyPackage.ANY_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGlobalInt() {
		return globalInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalInt(int newGlobalInt) {
		int oldGlobalInt = globalInt;
		globalInt = newGlobalInt;
		boolean oldGlobalIntESet = globalIntESet;
		globalIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyPackage.ANY_OBJECT__GLOBAL_INT, oldGlobalInt, globalInt, !oldGlobalIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalInt() {
		int oldGlobalInt = globalInt;
		boolean oldGlobalIntESet = globalIntESet;
		globalInt = GLOBAL_INT_EDEFAULT;
		globalIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnyPackage.ANY_OBJECT__GLOBAL_INT, oldGlobalInt, GLOBAL_INT_EDEFAULT, oldGlobalIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalInt() {
		return globalIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalString() {
		return globalString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalString(String newGlobalString) {
		String oldGlobalString = globalString;
		globalString = newGlobalString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyPackage.ANY_OBJECT__GLOBAL_STRING, oldGlobalString, globalString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getAnyOne() {
		return anyOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnyOne(EObject newAnyOne, NotificationChain msgs) {
		EObject oldAnyOne = anyOne;
		anyOne = newAnyOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnyPackage.ANY_OBJECT__ANY_ONE, oldAnyOne, newAnyOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnyOne(EObject newAnyOne) {
		if (newAnyOne != anyOne) {
			NotificationChain msgs = null;
			if (anyOne != null)
				msgs = ((InternalEObject)anyOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnyPackage.ANY_OBJECT__ANY_ONE, null, msgs);
			if (newAnyOne != null)
				msgs = ((InternalEObject)newAnyOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnyPackage.ANY_OBJECT__ANY_ONE, null, msgs);
			msgs = basicSetAnyOne(newAnyOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnyPackage.ANY_OBJECT__ANY_ONE, newAnyOne, newAnyOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, AnyPackage.ANY_OBJECT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AnyPackage.ANY_OBJECT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(AnyPackage.Literals.ANY_OBJECT__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnyPackage.ANY_OBJECT__ANY_ONE:
				return basicSetAnyOne(null, msgs);
			case AnyPackage.ANY_OBJECT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case AnyPackage.ANY_OBJECT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AnyPackage.ANY_OBJECT__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
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
			case AnyPackage.ANY_OBJECT__ID:
				return getId();
			case AnyPackage.ANY_OBJECT__GLOBAL_INT:
				return new Integer(getGlobalInt());
			case AnyPackage.ANY_OBJECT__GLOBAL_STRING:
				return getGlobalString();
			case AnyPackage.ANY_OBJECT__ANY_ONE:
				return getAnyOne();
			case AnyPackage.ANY_OBJECT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case AnyPackage.ANY_OBJECT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AnyPackage.ANY_OBJECT__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
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
			case AnyPackage.ANY_OBJECT__ID:
				setId((String)newValue);
				return;
			case AnyPackage.ANY_OBJECT__GLOBAL_INT:
				setGlobalInt(((Integer)newValue).intValue());
				return;
			case AnyPackage.ANY_OBJECT__GLOBAL_STRING:
				setGlobalString((String)newValue);
				return;
			case AnyPackage.ANY_OBJECT__ANY_ONE:
				setAnyOne((EObject)newValue);
				return;
			case AnyPackage.ANY_OBJECT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case AnyPackage.ANY_OBJECT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AnyPackage.ANY_OBJECT__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
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
			case AnyPackage.ANY_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case AnyPackage.ANY_OBJECT__GLOBAL_INT:
				unsetGlobalInt();
				return;
			case AnyPackage.ANY_OBJECT__GLOBAL_STRING:
				setGlobalString(GLOBAL_STRING_EDEFAULT);
				return;
			case AnyPackage.ANY_OBJECT__ANY_ONE:
				setAnyOne((EObject)null);
				return;
			case AnyPackage.ANY_OBJECT__ANY:
				getAny().clear();
				return;
			case AnyPackage.ANY_OBJECT__GROUP:
				getGroup().clear();
				return;
			case AnyPackage.ANY_OBJECT__ANY1:
				getAny1().clear();
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
			case AnyPackage.ANY_OBJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AnyPackage.ANY_OBJECT__GLOBAL_INT:
				return isSetGlobalInt();
			case AnyPackage.ANY_OBJECT__GLOBAL_STRING:
				return GLOBAL_STRING_EDEFAULT == null ? globalString != null : !GLOBAL_STRING_EDEFAULT.equals(globalString);
			case AnyPackage.ANY_OBJECT__ANY_ONE:
				return anyOne != null;
			case AnyPackage.ANY_OBJECT__ANY:
				return any != null && !any.isEmpty();
			case AnyPackage.ANY_OBJECT__GROUP:
				return group != null && !group.isEmpty();
			case AnyPackage.ANY_OBJECT__ANY1:
				return !getAny1().isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", globalInt: ");
		if (globalIntESet) result.append(globalInt); else result.append("<unset>");
		result.append(", globalString: ");
		result.append(globalString);
		result.append(", any: ");
		result.append(any);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AnyObjectImpl
