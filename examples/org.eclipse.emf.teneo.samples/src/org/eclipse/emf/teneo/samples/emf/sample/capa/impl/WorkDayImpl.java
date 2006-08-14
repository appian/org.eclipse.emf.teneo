/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkDayImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkDay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.WorkDayImpl#getStartTime <em>Start Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDayImpl extends EObjectImpl implements WorkDay {
	/**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_OF_WEEK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected int dayOfWeek = DAY_OF_WEEK_EDEFAULT;

	/**
	 * This is true if the Day Of Week attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dayOfWeekESet = false;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * This is true if the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationESet = false;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final int START_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected int startTime = START_TIME_EDEFAULT;

	/**
	 * This is true if the Start Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startTimeESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.WORK_DAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfWeek(int newDayOfWeek) {
		int oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek;
		boolean oldDayOfWeekESet = dayOfWeekESet;
		dayOfWeekESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.WORK_DAY__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek, !oldDayOfWeekESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayOfWeek() {
		int oldDayOfWeek = dayOfWeek;
		boolean oldDayOfWeekESet = dayOfWeekESet;
		dayOfWeek = DAY_OF_WEEK_EDEFAULT;
		dayOfWeekESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.WORK_DAY__DAY_OF_WEEK, oldDayOfWeek, DAY_OF_WEEK_EDEFAULT, oldDayOfWeekESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayOfWeek() {
		return dayOfWeekESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		boolean oldDurationESet = durationESet;
		durationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.WORK_DAY__DURATION, oldDuration, duration, !oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDuration() {
		int oldDuration = duration;
		boolean oldDurationESet = durationESet;
		duration = DURATION_EDEFAULT;
		durationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.WORK_DAY__DURATION, oldDuration, DURATION_EDEFAULT, oldDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDuration() {
		return durationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(int newStartTime) {
		int oldStartTime = startTime;
		startTime = newStartTime;
		boolean oldStartTimeESet = startTimeESet;
		startTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.WORK_DAY__START_TIME, oldStartTime, startTime, !oldStartTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartTime() {
		int oldStartTime = startTime;
		boolean oldStartTimeESet = startTimeESet;
		startTime = START_TIME_EDEFAULT;
		startTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.WORK_DAY__START_TIME, oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartTime() {
		return startTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapaPackage.WORK_DAY__DAY_OF_WEEK:
				return new Integer(getDayOfWeek());
			case CapaPackage.WORK_DAY__DURATION:
				return new Integer(getDuration());
			case CapaPackage.WORK_DAY__START_TIME:
				return new Integer(getStartTime());
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
			case CapaPackage.WORK_DAY__DAY_OF_WEEK:
				setDayOfWeek(((Integer)newValue).intValue());
				return;
			case CapaPackage.WORK_DAY__DURATION:
				setDuration(((Integer)newValue).intValue());
				return;
			case CapaPackage.WORK_DAY__START_TIME:
				setStartTime(((Integer)newValue).intValue());
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
			case CapaPackage.WORK_DAY__DAY_OF_WEEK:
				unsetDayOfWeek();
				return;
			case CapaPackage.WORK_DAY__DURATION:
				unsetDuration();
				return;
			case CapaPackage.WORK_DAY__START_TIME:
				unsetStartTime();
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
			case CapaPackage.WORK_DAY__DAY_OF_WEEK:
				return isSetDayOfWeek();
			case CapaPackage.WORK_DAY__DURATION:
				return isSetDuration();
			case CapaPackage.WORK_DAY__START_TIME:
				return isSetStartTime();
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
		result.append(" (dayOfWeek: ");
		if (dayOfWeekESet) result.append(dayOfWeek); else result.append("<unset>");
		result.append(", duration: ");
		if (durationESet) result.append(duration); else result.append("<unset>");
		result.append(", startTime: ");
		if (startTimeESet) result.append(startTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WorkDayImpl