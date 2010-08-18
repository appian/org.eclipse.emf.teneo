/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListIndexImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.ListIndex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ListIndexImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ListIndexImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ListIndexImpl#getColumn1 <em>Column1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListIndexImpl extends EObjectImpl implements ListIndex {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * This is true if the Base attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baseESet;

	/**
	 * The default value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected String column1 = COLUMN1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getListIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.LIST_INDEX__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.LIST_INDEX__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.LIST_INDEX__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LIST_INDEX__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		boolean oldBaseESet = baseESet;
		baseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LIST_INDEX__BASE, oldBase, base, !oldBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBase() {
		String oldBase = base;
		boolean oldBaseESet = baseESet;
		base = BASE_EDEFAULT;
		baseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.LIST_INDEX__BASE, oldBase, BASE_EDEFAULT, oldBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBase() {
		return baseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn1() {
		return column1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn1(String newColumn1) {
		String oldColumn1 = column1;
		column1 = newColumn1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.LIST_INDEX__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.LIST_INDEX__COLUMN:
				return basicSetColumn(null, msgs);
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
			case Hbm30Package.LIST_INDEX__COLUMN:
				return getColumn();
			case Hbm30Package.LIST_INDEX__BASE:
				return getBase();
			case Hbm30Package.LIST_INDEX__COLUMN1:
				return getColumn1();
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
			case Hbm30Package.LIST_INDEX__COLUMN:
				setColumn((Column)newValue);
				return;
			case Hbm30Package.LIST_INDEX__BASE:
				setBase((String)newValue);
				return;
			case Hbm30Package.LIST_INDEX__COLUMN1:
				setColumn1((String)newValue);
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
			case Hbm30Package.LIST_INDEX__COLUMN:
				setColumn((Column)null);
				return;
			case Hbm30Package.LIST_INDEX__BASE:
				unsetBase();
				return;
			case Hbm30Package.LIST_INDEX__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
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
			case Hbm30Package.LIST_INDEX__COLUMN:
				return column != null;
			case Hbm30Package.LIST_INDEX__BASE:
				return isSetBase();
			case Hbm30Package.LIST_INDEX__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
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
		result.append(" (base: ");
		if (baseESet) result.append(base); else result.append("<unset>");
		result.append(", column1: ");
		result.append(column1);
		result.append(')');
		return result.toString();
	}

} //ListIndexImpl
