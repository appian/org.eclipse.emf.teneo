/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Address;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.Employee;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.EmployeeInfo;
import org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.OrphanremovalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl#getEmployeeInfo <em>Employee Info</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.orphanremoval.impl.EmployeeImpl#getAddresses <em>Addresses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployeeInfo() <em>Employee Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeInfo()
	 * @generated
	 * @ordered
	 */
	protected EmployeeInfo employeeInfo;

	/**
	 * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> addresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrphanremovalPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeInfo getEmployeeInfo() {
		if (employeeInfo != null && employeeInfo.eIsProxy()) {
			InternalEObject oldEmployeeInfo = (InternalEObject)employeeInfo;
			employeeInfo = (EmployeeInfo)eResolveProxy(oldEmployeeInfo);
			if (employeeInfo != oldEmployeeInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, oldEmployeeInfo, employeeInfo));
			}
		}
		return employeeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeInfo basicGetEmployeeInfo() {
		return employeeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmployeeInfo(EmployeeInfo newEmployeeInfo, NotificationChain msgs) {
		EmployeeInfo oldEmployeeInfo = employeeInfo;
		employeeInfo = newEmployeeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, oldEmployeeInfo, newEmployeeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeInfo(EmployeeInfo newEmployeeInfo) {
		if (newEmployeeInfo != employeeInfo) {
			NotificationChain msgs = null;
			if (employeeInfo != null)
				msgs = ((InternalEObject)employeeInfo).eInverseRemove(this, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, EmployeeInfo.class, msgs);
			if (newEmployeeInfo != null)
				msgs = ((InternalEObject)newEmployeeInfo).eInverseAdd(this, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, EmployeeInfo.class, msgs);
			msgs = basicSetEmployeeInfo(newEmployeeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO, newEmployeeInfo, newEmployeeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getAddresses() {
		if (addresses == null) {
			addresses = new EObjectResolvingEList<Address>(Address.class, this, OrphanremovalPackage.EMPLOYEE__ADDRESSES);
		}
		return addresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				if (employeeInfo != null)
					msgs = ((InternalEObject)employeeInfo).eInverseRemove(this, OrphanremovalPackage.EMPLOYEE_INFO__EMPLOYEE, EmployeeInfo.class, msgs);
				return basicSetEmployeeInfo((EmployeeInfo)otherEnd, msgs);
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
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				return basicSetEmployeeInfo(null, msgs);
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
			case OrphanremovalPackage.EMPLOYEE__ID:
				return getId();
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				if (resolve) return getEmployeeInfo();
				return basicGetEmployeeInfo();
			case OrphanremovalPackage.EMPLOYEE__ADDRESSES:
				return getAddresses();
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
			case OrphanremovalPackage.EMPLOYEE__ID:
				setId((Long)newValue);
				return;
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				setEmployeeInfo((EmployeeInfo)newValue);
				return;
			case OrphanremovalPackage.EMPLOYEE__ADDRESSES:
				getAddresses().clear();
				getAddresses().addAll((Collection<? extends Address>)newValue);
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
			case OrphanremovalPackage.EMPLOYEE__ID:
				setId(ID_EDEFAULT);
				return;
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				setEmployeeInfo((EmployeeInfo)null);
				return;
			case OrphanremovalPackage.EMPLOYEE__ADDRESSES:
				getAddresses().clear();
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
			case OrphanremovalPackage.EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case OrphanremovalPackage.EMPLOYEE__EMPLOYEE_INFO:
				return employeeInfo != null;
			case OrphanremovalPackage.EMPLOYEE__ADDRESSES:
				return addresses != null && !addresses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
