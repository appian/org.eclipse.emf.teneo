/**
 * <copyright>
 * </copyright>
 *
 * $Id: TaskImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Production;
import org.eclipse.emf.teneo.samples.emf.sample.capa.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getCapacityEntry <em>Capacity Entry</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getProduction <em>Production</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getTaskId <em>Task Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getTimePerPice <em>Time Per Pice</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.TaskImpl#getTimePerPreperation <em>Time Per Preperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getCapacityEntry() <em>Capacity Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityEntry()
	 * @generated
	 * @ordered
	 */
	protected CapacityEntry capacityEntry = null;

	/**
	 * The cached value of the '{@link #getProduction() <em>Production</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduction()
	 * @generated
	 * @ordered
	 */
	protected Production production = null;

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
	 * The default value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskId() <em>Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskId()
	 * @generated
	 * @ordered
	 */
	protected String taskId = TASK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimePerPice() <em>Time Per Pice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePerPice()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_PER_PICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimePerPice() <em>Time Per Pice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePerPice()
	 * @generated
	 * @ordered
	 */
	protected float timePerPice = TIME_PER_PICE_EDEFAULT;

	/**
	 * This is true if the Time Per Pice attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timePerPiceESet = false;

	/**
	 * The default value of the '{@link #getTimePerPreperation() <em>Time Per Preperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePerPreperation()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_PER_PREPERATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTimePerPreperation() <em>Time Per Preperation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePerPreperation()
	 * @generated
	 * @ordered
	 */
	protected float timePerPreperation = TIME_PER_PREPERATION_EDEFAULT;

	/**
	 * This is true if the Time Per Preperation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timePerPreperationESet = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapacityEntry getCapacityEntry() {
		return capacityEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacityEntry(CapacityEntry newCapacityEntry, NotificationChain msgs) {
		CapacityEntry oldCapacityEntry = capacityEntry;
		capacityEntry = newCapacityEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__CAPACITY_ENTRY, oldCapacityEntry, newCapacityEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityEntry(CapacityEntry newCapacityEntry) {
		if (newCapacityEntry != capacityEntry) {
			NotificationChain msgs = null;
			if (capacityEntry != null)
				msgs = ((InternalEObject)capacityEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapaPackage.TASK__CAPACITY_ENTRY, null, msgs);
			if (newCapacityEntry != null)
				msgs = ((InternalEObject)newCapacityEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapaPackage.TASK__CAPACITY_ENTRY, null, msgs);
			msgs = basicSetCapacityEntry(newCapacityEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__CAPACITY_ENTRY, newCapacityEntry, newCapacityEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Production getProduction() {
		return production;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduction(Production newProduction, NotificationChain msgs) {
		Production oldProduction = production;
		production = newProduction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__PRODUCTION, oldProduction, newProduction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduction(Production newProduction) {
		if (newProduction != production) {
			NotificationChain msgs = null;
			if (production != null)
				msgs = ((InternalEObject)production).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapaPackage.TASK__PRODUCTION, null, msgs);
			if (newProduction != null)
				msgs = ((InternalEObject)newProduction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapaPackage.TASK__PRODUCTION, null, msgs);
			msgs = basicSetProduction(newProduction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__PRODUCTION, newProduction, newProduction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaskId() {
		return taskId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskId(String newTaskId) {
		String oldTaskId = taskId;
		taskId = newTaskId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__TASK_ID, oldTaskId, taskId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimePerPice() {
		return timePerPice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePerPice(float newTimePerPice) {
		float oldTimePerPice = timePerPice;
		timePerPice = newTimePerPice;
		boolean oldTimePerPiceESet = timePerPiceESet;
		timePerPiceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__TIME_PER_PICE, oldTimePerPice, timePerPice, !oldTimePerPiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimePerPice() {
		float oldTimePerPice = timePerPice;
		boolean oldTimePerPiceESet = timePerPiceESet;
		timePerPice = TIME_PER_PICE_EDEFAULT;
		timePerPiceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.TASK__TIME_PER_PICE, oldTimePerPice, TIME_PER_PICE_EDEFAULT, oldTimePerPiceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimePerPice() {
		return timePerPiceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimePerPreperation() {
		return timePerPreperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimePerPreperation(float newTimePerPreperation) {
		float oldTimePerPreperation = timePerPreperation;
		timePerPreperation = newTimePerPreperation;
		boolean oldTimePerPreperationESet = timePerPreperationESet;
		timePerPreperationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.TASK__TIME_PER_PREPERATION, oldTimePerPreperation, timePerPreperation, !oldTimePerPreperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimePerPreperation() {
		float oldTimePerPreperation = timePerPreperation;
		boolean oldTimePerPreperationESet = timePerPreperationESet;
		timePerPreperation = TIME_PER_PREPERATION_EDEFAULT;
		timePerPreperationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CapaPackage.TASK__TIME_PER_PREPERATION, oldTimePerPreperation, TIME_PER_PREPERATION_EDEFAULT, oldTimePerPreperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimePerPreperation() {
		return timePerPreperationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapaPackage.TASK__CAPACITY_ENTRY:
				return basicSetCapacityEntry(null, msgs);
			case CapaPackage.TASK__PRODUCTION:
				return basicSetProduction(null, msgs);
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
			case CapaPackage.TASK__CAPACITY_ENTRY:
				return getCapacityEntry();
			case CapaPackage.TASK__PRODUCTION:
				return getProduction();
			case CapaPackage.TASK__NAME:
				return getName();
			case CapaPackage.TASK__TASK_ID:
				return getTaskId();
			case CapaPackage.TASK__TIME_PER_PICE:
				return new Float(getTimePerPice());
			case CapaPackage.TASK__TIME_PER_PREPERATION:
				return new Float(getTimePerPreperation());
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
			case CapaPackage.TASK__CAPACITY_ENTRY:
				setCapacityEntry((CapacityEntry)newValue);
				return;
			case CapaPackage.TASK__PRODUCTION:
				setProduction((Production)newValue);
				return;
			case CapaPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case CapaPackage.TASK__TASK_ID:
				setTaskId((String)newValue);
				return;
			case CapaPackage.TASK__TIME_PER_PICE:
				setTimePerPice(((Float)newValue).floatValue());
				return;
			case CapaPackage.TASK__TIME_PER_PREPERATION:
				setTimePerPreperation(((Float)newValue).floatValue());
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
			case CapaPackage.TASK__CAPACITY_ENTRY:
				setCapacityEntry((CapacityEntry)null);
				return;
			case CapaPackage.TASK__PRODUCTION:
				setProduction((Production)null);
				return;
			case CapaPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CapaPackage.TASK__TASK_ID:
				setTaskId(TASK_ID_EDEFAULT);
				return;
			case CapaPackage.TASK__TIME_PER_PICE:
				unsetTimePerPice();
				return;
			case CapaPackage.TASK__TIME_PER_PREPERATION:
				unsetTimePerPreperation();
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
			case CapaPackage.TASK__CAPACITY_ENTRY:
				return capacityEntry != null;
			case CapaPackage.TASK__PRODUCTION:
				return production != null;
			case CapaPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CapaPackage.TASK__TASK_ID:
				return TASK_ID_EDEFAULT == null ? taskId != null : !TASK_ID_EDEFAULT.equals(taskId);
			case CapaPackage.TASK__TIME_PER_PICE:
				return isSetTimePerPice();
			case CapaPackage.TASK__TIME_PER_PREPERATION:
				return isSetTimePerPreperation();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", taskId: ");
		result.append(taskId);
		result.append(", timePerPice: ");
		if (timePerPiceESet) result.append(timePerPice); else result.append("<unset>");
		result.append(", timePerPreperation: ");
		if (timePerPreperationESet) result.append(timePerPreperation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TaskImpl