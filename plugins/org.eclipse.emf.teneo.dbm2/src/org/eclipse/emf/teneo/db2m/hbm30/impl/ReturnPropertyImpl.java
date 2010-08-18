/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReturnPropertyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

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

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnColumn;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnPropertyImpl#getReturnColumn <em>Return Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnPropertyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ReturnPropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnPropertyImpl extends EObjectImpl implements ReturnProperty {
	/**
	 * The cached value of the '{@link #getReturnColumn() <em>Return Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<ReturnColumn> returnColumn;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected String column = COLUMN_EDEFAULT;

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
	protected ReturnPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getReturnProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnColumn> getReturnColumn() {
		if (returnColumn == null) {
			returnColumn = new EObjectContainmentEList<ReturnColumn>(ReturnColumn.class, this, Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN);
		}
		return returnColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(String newColumn) {
		String oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN_PROPERTY__COLUMN, oldColumn, column));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.RETURN_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN:
				return ((InternalEList<?>)getReturnColumn()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN:
				return getReturnColumn();
			case Hbm30Package.RETURN_PROPERTY__COLUMN:
				return getColumn();
			case Hbm30Package.RETURN_PROPERTY__NAME:
				return getName();
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
			case Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN:
				getReturnColumn().clear();
				getReturnColumn().addAll((Collection<? extends ReturnColumn>)newValue);
				return;
			case Hbm30Package.RETURN_PROPERTY__COLUMN:
				setColumn((String)newValue);
				return;
			case Hbm30Package.RETURN_PROPERTY__NAME:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN:
				getReturnColumn().clear();
				return;
			case Hbm30Package.RETURN_PROPERTY__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case Hbm30Package.RETURN_PROPERTY__NAME:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hbm30Package.RETURN_PROPERTY__RETURN_COLUMN:
				return returnColumn != null && !returnColumn.isEmpty();
			case Hbm30Package.RETURN_PROPERTY__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case Hbm30Package.RETURN_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (column: ");
		result.append(column);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReturnPropertyImpl
