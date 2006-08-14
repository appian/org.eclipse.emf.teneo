/**
 * <copyright>
 * </copyright>
 *
 * $Id: MachineImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.emf.sample.capa.Machine;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Task;
import org.eclipse.emf.teneo.samples.emf.sample.capa.WorkWeek;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getWorkWeek <em>Work Week</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getMachineId <em>Machine Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getMachineSearchString <em>Machine Search String</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.MachineImpl#getTaskSearchString <em>Task Search String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends EObjectImpl implements Machine {
	/**
	 * The cached value of the '{@link #getWorkWeek() <em>Work Week</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkWeek()
	 * @generated
	 * @ordered
	 */
	protected WorkWeek workWeek = null;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList tasks = null;

	/**
	 * The default value of the '{@link #getMachineId() <em>Machine Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineId()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineId() <em>Machine Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineId()
	 * @generated
	 * @ordered
	 */
	protected String machineId = MACHINE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMachineSearchString() <em>Machine Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineSearchString()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_SEARCH_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineSearchString() <em>Machine Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineSearchString()
	 * @generated
	 * @ordered
	 */
	protected String machineSearchString = MACHINE_SEARCH_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet = false;

	/**
	 * The default value of the '{@link #getTaskSearchString() <em>Task Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSearchString()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_SEARCH_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskSearchString() <em>Task Search String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSearchString()
	 * @generated
	 * @ordered
	 */
	protected String taskSearchString = TASK_SEARCH_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkWeek getWorkWeek() {
		return workWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkWeek(WorkWeek newWorkWeek, NotificationChain msgs) {
		WorkWeek oldWorkWeek = workWeek;
		workWeek = newWorkWeek;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__WORK_WEEK, oldWorkWeek, newWorkWeek);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkWeek(WorkWeek newWorkWeek) {
		if (newWorkWeek != workWeek) {
			NotificationChain msgs = null;
			if (workWeek != null)
				msgs = ((InternalEObject)workWeek).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapaPackage.MACHINE__WORK_WEEK, null, msgs);
			if (newWorkWeek != null)
				msgs = ((InternalEObject)newWorkWeek).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapaPackage.MACHINE__WORK_WEEK, null, msgs);
			msgs = basicSetWorkWeek(newWorkWeek, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__WORK_WEEK, newWorkWeek, newWorkWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList(Task.class, this, CapaPackage.MACHINE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineId() {
		return machineId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineId(String newMachineId) {
		String oldMachineId = machineId;
		machineId = newMachineId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__MACHINE_ID, oldMachineId, machineId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineSearchString() {
		return machineSearchString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineSearchString(String newMachineSearchString) {
		String oldMachineSearchString = machineSearchString;
		machineSearchString = newMachineSearchString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__MACHINE_SEARCH_STRING, oldMachineSearchString, machineSearchString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplicity() {
		int oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.MACHINE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskSearchString() {
		return taskSearchString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskSearchString(String newTaskSearchString) {
		String oldTaskSearchString = taskSearchString;
		taskSearchString = newTaskSearchString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.MACHINE__TASK_SEARCH_STRING, oldTaskSearchString, taskSearchString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapaPackage.MACHINE__WORK_WEEK:
				return basicSetWorkWeek(null, msgs);
			case CapaPackage.MACHINE__TASKS:
				return ((InternalEList)getTasks()).basicRemove(otherEnd, msgs);
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
			case CapaPackage.MACHINE__WORK_WEEK:
				return getWorkWeek();
			case CapaPackage.MACHINE__TASKS:
				return getTasks();
			case CapaPackage.MACHINE__MACHINE_ID:
				return getMachineId();
			case CapaPackage.MACHINE__MACHINE_SEARCH_STRING:
				return getMachineSearchString();
			case CapaPackage.MACHINE__MULTIPLICITY:
				return new Integer(getMultiplicity());
			case CapaPackage.MACHINE__TASK_SEARCH_STRING:
				return getTaskSearchString();
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
			case CapaPackage.MACHINE__WORK_WEEK:
				setWorkWeek((WorkWeek)newValue);
				return;
			case CapaPackage.MACHINE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection)newValue);
				return;
			case CapaPackage.MACHINE__MACHINE_ID:
				setMachineId((String)newValue);
				return;
			case CapaPackage.MACHINE__MACHINE_SEARCH_STRING:
				setMachineSearchString((String)newValue);
				return;
			case CapaPackage.MACHINE__MULTIPLICITY:
				setMultiplicity(((Integer)newValue).intValue());
				return;
			case CapaPackage.MACHINE__TASK_SEARCH_STRING:
				setTaskSearchString((String)newValue);
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
			case CapaPackage.MACHINE__WORK_WEEK:
				setWorkWeek((WorkWeek)null);
				return;
			case CapaPackage.MACHINE__TASKS:
				getTasks().clear();
				return;
			case CapaPackage.MACHINE__MACHINE_ID:
				setMachineId(MACHINE_ID_EDEFAULT);
				return;
			case CapaPackage.MACHINE__MACHINE_SEARCH_STRING:
				setMachineSearchString(MACHINE_SEARCH_STRING_EDEFAULT);
				return;
			case CapaPackage.MACHINE__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case CapaPackage.MACHINE__TASK_SEARCH_STRING:
				setTaskSearchString(TASK_SEARCH_STRING_EDEFAULT);
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
			case CapaPackage.MACHINE__WORK_WEEK:
				return workWeek != null;
			case CapaPackage.MACHINE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case CapaPackage.MACHINE__MACHINE_ID:
				return MACHINE_ID_EDEFAULT == null ? machineId != null : !MACHINE_ID_EDEFAULT.equals(machineId);
			case CapaPackage.MACHINE__MACHINE_SEARCH_STRING:
				return MACHINE_SEARCH_STRING_EDEFAULT == null ? machineSearchString != null : !MACHINE_SEARCH_STRING_EDEFAULT.equals(machineSearchString);
			case CapaPackage.MACHINE__MULTIPLICITY:
				return isSetMultiplicity();
			case CapaPackage.MACHINE__TASK_SEARCH_STRING:
				return TASK_SEARCH_STRING_EDEFAULT == null ? taskSearchString != null : !TASK_SEARCH_STRING_EDEFAULT.equals(taskSearchString);
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
		result.append(" (machineId: ");
		result.append(machineId);
		result.append(", machineSearchString: ");
		result.append(machineSearchString);
		result.append(", multiplicity: ");
		if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
		result.append(", taskSearchString: ");
		result.append(taskSearchString);
		result.append(')');
		return result.toString();
	}

} //MachineImpl