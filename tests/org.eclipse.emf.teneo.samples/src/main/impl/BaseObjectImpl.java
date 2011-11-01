/**
 * <copyright>
 * </copyright>
 *
 * $Id: BaseObjectImpl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import main.BaseObject;
import main.ChildObject1;
import main.MainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link main.impl.BaseObjectImpl#getObject1 <em>Object1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseObjectImpl extends BaseComponentImpl implements BaseObject {
	/**
	 * The cached value of the '{@link #getObject1() <em>Object1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject1()
	 * @generated
	 * @ordered
	 */
	protected ChildObject1 object1 = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MainPackage.Literals.BASE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildObject1 getObject1() {
		if (object1 != null && object1.eIsProxy()) {
			InternalEObject oldObject1 = (InternalEObject)object1;
			object1 = (ChildObject1)eResolveProxy(oldObject1);
			if (object1 != oldObject1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.BASE_OBJECT__OBJECT1, oldObject1, object1));
			}
		}
		return object1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildObject1 basicGetObject1() {
		return object1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject1(ChildObject1 newObject1, NotificationChain msgs) {
		ChildObject1 oldObject1 = object1;
		object1 = newObject1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MainPackage.BASE_OBJECT__OBJECT1, oldObject1, newObject1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject1(ChildObject1 newObject1) {
		if (newObject1 != object1) {
			NotificationChain msgs = null;
			if (object1 != null)
				msgs = ((InternalEObject)object1).eInverseRemove(this, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, ChildObject1.class, msgs);
			if (newObject1 != null)
				msgs = ((InternalEObject)newObject1).eInverseAdd(this, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, ChildObject1.class, msgs);
			msgs = basicSetObject1(newObject1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.BASE_OBJECT__OBJECT1, newObject1, newObject1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				if (object1 != null)
					msgs = ((InternalEObject)object1).eInverseRemove(this, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, ChildObject1.class, msgs);
				return basicSetObject1((ChildObject1)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				return basicSetObject1(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				if (resolve) return getObject1();
				return basicGetObject1();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				setObject1((ChildObject1)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				setObject1((ChildObject1)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MainPackage.BASE_OBJECT__OBJECT1:
				return object1 != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseObjectImpl