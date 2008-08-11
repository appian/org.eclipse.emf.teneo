/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyImpl.java,v 1.1 2008/08/11 20:40:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz237361.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz237361.Bz237361Package;
import org.eclipse.emf.teneo.samples.issues.bz237361.Many;
import org.eclipse.emf.teneo.samples.issues.bz237361.One;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz237361.impl.ManyImpl#getOne <em>One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyImpl extends EObjectImpl implements Many {
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
	 * The cached value of the '{@link #getOne() <em>One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOne()
	 * @generated
	 * @ordered
	 */
	protected One one;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz237361Package.Literals.MANY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Bz237361Package.MANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One getOne() {
		if (one != null && one.eIsProxy()) {
			InternalEObject oldOne = (InternalEObject)one;
			one = (One)eResolveProxy(oldOne);
			if (one != oldOne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bz237361Package.MANY__ONE, oldOne, one));
			}
		}
		return one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One basicGetOne() {
		return one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOne(One newOne, NotificationChain msgs) {
		One oldOne = one;
		one = newOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bz237361Package.MANY__ONE, oldOne, newOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOne(One newOne) {
		if (newOne != one) {
			NotificationChain msgs = null;
			if (one != null)
				msgs = ((InternalEObject)one).eInverseRemove(this, Bz237361Package.ONE__MANIES, One.class, msgs);
			if (newOne != null)
				msgs = ((InternalEObject)newOne).eInverseAdd(this, Bz237361Package.ONE__MANIES, One.class, msgs);
			msgs = basicSetOne(newOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz237361Package.MANY__ONE, newOne, newOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz237361Package.MANY__ONE:
				if (one != null)
					msgs = ((InternalEObject)one).eInverseRemove(this, Bz237361Package.ONE__MANIES, One.class, msgs);
				return basicSetOne((One)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bz237361Package.MANY__ONE:
				return basicSetOne(null, msgs);
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
			case Bz237361Package.MANY__NAME:
				return getName();
			case Bz237361Package.MANY__ONE:
				if (resolve) return getOne();
				return basicGetOne();
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
			case Bz237361Package.MANY__NAME:
				setName((String)newValue);
				return;
			case Bz237361Package.MANY__ONE:
				setOne((One)newValue);
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
			case Bz237361Package.MANY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Bz237361Package.MANY__ONE:
				setOne((One)null);
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
			case Bz237361Package.MANY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Bz237361Package.MANY__ONE:
				return one != null;
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
		result.append(')');
		return result.toString();
	}

} //ManyImpl
