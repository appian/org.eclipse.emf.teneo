/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkWeekImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl#getDays <em>Days</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkWeekImpl#getWorkWeekId <em>Work Week Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkWeekImpl extends EObjectImpl implements WorkWeek {
	/**
	 * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected EList days = null;

	/**
	 * The default value of the '{@link #getWorkWeekId() <em>Work Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkWeekId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_WEEK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkWeekId() <em>Work Week Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkWeekId()
	 * @generated
	 * @ordered
	 */
	protected String workWeekId = WORK_WEEK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.WORK_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDays() {
		if (days == null) {
			days = new EObjectContainmentEList(WorkDay.class, this, CapaPackage.WORK_WEEK__DAYS);
		}
		return days;
	}
	
	/** Set the days */
	public void setDays(EList list) {
		days = list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkWeekId() {
		return workWeekId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkWeekId(String newWorkWeekId) {
		String oldWorkWeekId = workWeekId;
		workWeekId = newWorkWeekId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.WORK_WEEK__WORK_WEEK_ID, oldWorkWeekId, workWeekId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapaPackage.WORK_WEEK__DAYS:
				return ((InternalEList)getDays()).basicRemove(otherEnd, msgs);
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
			case CapaPackage.WORK_WEEK__DAYS:
				return getDays();
			case CapaPackage.WORK_WEEK__WORK_WEEK_ID:
				return getWorkWeekId();
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
			case CapaPackage.WORK_WEEK__DAYS:
				getDays().clear();
				getDays().addAll((Collection)newValue);
				return;
			case CapaPackage.WORK_WEEK__WORK_WEEK_ID:
				setWorkWeekId((String)newValue);
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
			case CapaPackage.WORK_WEEK__DAYS:
				getDays().clear();
				return;
			case CapaPackage.WORK_WEEK__WORK_WEEK_ID:
				setWorkWeekId(WORK_WEEK_ID_EDEFAULT);
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
			case CapaPackage.WORK_WEEK__DAYS:
				return days != null && !days.isEmpty();
			case CapaPackage.WORK_WEEK__WORK_WEEK_ID:
				return WORK_WEEK_ID_EDEFAULT == null ? workWeekId != null : !WORK_WEEK_ID_EDEFAULT.equals(workWeekId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (workWeekId: ");
		result.append(workWeekId);
		result.append(')');
		return result.toString();
	}

} //WorkWeekImpl