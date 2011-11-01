/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlResultSetMappingImpl.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.impl;

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

import org.eclipse.emf.teneo.jpa.orm.ColumnResult;
import org.eclipse.emf.teneo.jpa.orm.EntityResult;
import org.eclipse.emf.teneo.jpa.orm.OrmPackage;
import org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Result Set Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl#getEntityResult <em>Entity Result</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl#getColumnResult <em>Column Result</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.SqlResultSetMappingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlResultSetMappingImpl extends EObjectImpl implements SqlResultSetMapping {
	/**
	 * The cached value of the '{@link #getEntityResult() <em>Entity Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityResult()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityResult> entityResult;

	/**
	 * The cached value of the '{@link #getColumnResult() <em>Column Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnResult> columnResult;

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
	protected SqlResultSetMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.SQL_RESULT_SET_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityResult> getEntityResult() {
		if (entityResult == null) {
			entityResult = new EObjectContainmentEList<EntityResult>(EntityResult.class, this, OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT);
		}
		return entityResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnResult> getColumnResult() {
		if (columnResult == null) {
			columnResult = new EObjectContainmentEList<ColumnResult>(ColumnResult.class, this, OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT);
		}
		return columnResult;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.SQL_RESULT_SET_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT:
				return ((InternalEList<?>)getEntityResult()).basicRemove(otherEnd, msgs);
			case OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT:
				return ((InternalEList<?>)getColumnResult()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT:
				return getEntityResult();
			case OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT:
				return getColumnResult();
			case OrmPackage.SQL_RESULT_SET_MAPPING__NAME:
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
			case OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT:
				getEntityResult().clear();
				getEntityResult().addAll((Collection<? extends EntityResult>)newValue);
				return;
			case OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT:
				getColumnResult().clear();
				getColumnResult().addAll((Collection<? extends ColumnResult>)newValue);
				return;
			case OrmPackage.SQL_RESULT_SET_MAPPING__NAME:
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
			case OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT:
				getEntityResult().clear();
				return;
			case OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT:
				getColumnResult().clear();
				return;
			case OrmPackage.SQL_RESULT_SET_MAPPING__NAME:
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
			case OrmPackage.SQL_RESULT_SET_MAPPING__ENTITY_RESULT:
				return entityResult != null && !entityResult.isEmpty();
			case OrmPackage.SQL_RESULT_SET_MAPPING__COLUMN_RESULT:
				return columnResult != null && !columnResult.isEmpty();
			case OrmPackage.SQL_RESULT_SET_MAPPING__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SqlResultSetMappingImpl
