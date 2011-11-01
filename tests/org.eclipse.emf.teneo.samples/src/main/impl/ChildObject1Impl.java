/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildObject1Impl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
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
 * An implementation of the model object '<em><b>Child Object1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link main.impl.ChildObject1Impl#getLinkedObject <em>Linked Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildObject1Impl extends BaseObjectImpl implements ChildObject1 {
	/**
	 * The cached value of the '{@link #getLinkedObject() <em>Linked Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedObject()
	 * @generated
	 * @ordered
	 */
	protected BaseObject linkedObject = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildObject1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MainPackage.Literals.CHILD_OBJECT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseObject getLinkedObject() {
		if (linkedObject != null && linkedObject.eIsProxy()) {
			InternalEObject oldLinkedObject = (InternalEObject)linkedObject;
			linkedObject = (BaseObject)eResolveProxy(oldLinkedObject);
			if (linkedObject != oldLinkedObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, oldLinkedObject, linkedObject));
			}
		}
		return linkedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseObject basicGetLinkedObject() {
		return linkedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedObject(BaseObject newLinkedObject, NotificationChain msgs) {
		BaseObject oldLinkedObject = linkedObject;
		linkedObject = newLinkedObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, oldLinkedObject, newLinkedObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedObject(BaseObject newLinkedObject) {
		if (newLinkedObject != linkedObject) {
			NotificationChain msgs = null;
			if (linkedObject != null)
				msgs = ((InternalEObject)linkedObject).eInverseRemove(this, MainPackage.BASE_OBJECT__OBJECT1, BaseObject.class, msgs);
			if (newLinkedObject != null)
				msgs = ((InternalEObject)newLinkedObject).eInverseAdd(this, MainPackage.BASE_OBJECT__OBJECT1, BaseObject.class, msgs);
			msgs = basicSetLinkedObject(newLinkedObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MainPackage.CHILD_OBJECT1__LINKED_OBJECT, newLinkedObject, newLinkedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				if (linkedObject != null)
					msgs = ((InternalEObject)linkedObject).eInverseRemove(this, MainPackage.BASE_OBJECT__OBJECT1, BaseObject.class, msgs);
				return basicSetLinkedObject((BaseObject)otherEnd, msgs);
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
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				return basicSetLinkedObject(null, msgs);
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
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				if (resolve) return getLinkedObject();
				return basicGetLinkedObject();
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
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				setLinkedObject((BaseObject)newValue);
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
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				setLinkedObject((BaseObject)null);
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
			case MainPackage.CHILD_OBJECT1__LINKED_OBJECT:
				return linkedObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildObject1Impl