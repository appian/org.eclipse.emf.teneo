/**
 * <copyright>
 * </copyright>
 *
 * $Id: CapacityEntryImpl.java,v 1.1 2006/08/14 05:08:58 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.capa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.capa.CapaPackage;
import org.eclipse.emf.teneo.samples.emf.sample.capa.CapacityEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl#getCapacityEntryId <em>Capacity Entry Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.capa.impl.CapacityEntryImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapacityEntryImpl extends EObjectImpl implements CapacityEntry {
	/**
	 * The default value of the '{@link #getCapacityEntryId() <em>Capacity Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityEntryId()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_ENTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityEntryId() <em>Capacity Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityEntryId()
	 * @generated
	 * @ordered
	 */
	protected String capacityEntryId = CAPACITY_ENTRY_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CapaPackage.Literals.CAPACITY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityEntryId() {
		return capacityEntryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityEntryId(String newCapacityEntryId) {
		String oldCapacityEntryId = capacityEntryId;
		capacityEntryId = newCapacityEntryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.CAPACITY_ENTRY__CAPACITY_ENTRY_ID, oldCapacityEntryId, capacityEntryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapaPackage.CAPACITY_ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapaPackage.CAPACITY_ENTRY__CAPACITY_ENTRY_ID:
				return getCapacityEntryId();
			case CapaPackage.CAPACITY_ENTRY__NAME:
				return getName();
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
			case CapaPackage.CAPACITY_ENTRY__CAPACITY_ENTRY_ID:
				setCapacityEntryId((String)newValue);
				return;
			case CapaPackage.CAPACITY_ENTRY__NAME:
				setName((String)newValue);
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
			case CapaPackage.CAPACITY_ENTRY__CAPACITY_ENTRY_ID:
				setCapacityEntryId(CAPACITY_ENTRY_ID_EDEFAULT);
				return;
			case CapaPackage.CAPACITY_ENTRY__NAME:
				setName(NAME_EDEFAULT);
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
			case CapaPackage.CAPACITY_ENTRY__CAPACITY_ENTRY_ID:
				return CAPACITY_ENTRY_ID_EDEFAULT == null ? capacityEntryId != null : !CAPACITY_ENTRY_ID_EDEFAULT.equals(capacityEntryId);
			case CapaPackage.CAPACITY_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (capacityEntryId: ");
		result.append(capacityEntryId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CapacityEntryImpl