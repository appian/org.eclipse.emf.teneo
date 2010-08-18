/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.OnDeleteType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyImpl extends EObjectImpl implements Key {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

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
	 * The default value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected String foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean notNull = NOT_NULL_EDEFAULT;

	/**
	 * This is true if the Not Null attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notNullESet;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final OnDeleteType ON_DELETE_EDEFAULT = OnDeleteType.NOACTION;

	/**
	 * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected OnDeleteType onDelete = ON_DELETE_EDEFAULT;

	/**
	 * This is true if the On Delete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onDeleteESet;

	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * This is true if the Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueESet;

	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;

	/**
	 * This is true if the Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, Hbm30Package.KEY__COLUMN);
		}
		return column;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(String newForeignKey) {
		String oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotNull() {
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotNull(boolean newNotNull) {
		boolean oldNotNull = notNull;
		notNull = newNotNull;
		boolean oldNotNullESet = notNullESet;
		notNullESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__NOT_NULL, oldNotNull, notNull, !oldNotNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotNull() {
		boolean oldNotNull = notNull;
		boolean oldNotNullESet = notNullESet;
		notNull = NOT_NULL_EDEFAULT;
		notNullESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.KEY__NOT_NULL, oldNotNull, NOT_NULL_EDEFAULT, oldNotNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotNull() {
		return notNullESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDeleteType getOnDelete() {
		return onDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDelete(OnDeleteType newOnDelete) {
		OnDeleteType oldOnDelete = onDelete;
		onDelete = newOnDelete == null ? ON_DELETE_EDEFAULT : newOnDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDeleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__ON_DELETE, oldOnDelete, onDelete, !oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOnDelete() {
		OnDeleteType oldOnDelete = onDelete;
		boolean oldOnDeleteESet = onDeleteESet;
		onDelete = ON_DELETE_EDEFAULT;
		onDeleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.KEY__ON_DELETE, oldOnDelete, ON_DELETE_EDEFAULT, oldOnDeleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOnDelete() {
		return onDeleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		boolean oldUniqueESet = uniqueESet;
		uniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__UNIQUE, oldUnique, unique, !oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnique() {
		boolean oldUnique = unique;
		boolean oldUniqueESet = uniqueESet;
		unique = UNIQUE_EDEFAULT;
		uniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.KEY__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnique() {
		return uniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		boolean oldUpdateESet = updateESet;
		updateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY__UPDATE, oldUpdate, update, !oldUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdate() {
		boolean oldUpdate = update;
		boolean oldUpdateESet = updateESet;
		update = UPDATE_EDEFAULT;
		updateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.KEY__UPDATE, oldUpdate, UPDATE_EDEFAULT, oldUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdate() {
		return updateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.KEY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.KEY__COLUMN:
				return getColumn();
			case Hbm30Package.KEY__COLUMN1:
				return getColumn1();
			case Hbm30Package.KEY__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.KEY__NOT_NULL:
				return isNotNull();
			case Hbm30Package.KEY__ON_DELETE:
				return getOnDelete();
			case Hbm30Package.KEY__PROPERTY_REF:
				return getPropertyRef();
			case Hbm30Package.KEY__UNIQUE:
				return isUnique();
			case Hbm30Package.KEY__UPDATE:
				return isUpdate();
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
			case Hbm30Package.KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.KEY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.KEY__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.KEY__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case Hbm30Package.KEY__ON_DELETE:
				setOnDelete((OnDeleteType)newValue);
				return;
			case Hbm30Package.KEY__PROPERTY_REF:
				setPropertyRef((String)newValue);
				return;
			case Hbm30Package.KEY__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.KEY__UPDATE:
				setUpdate((Boolean)newValue);
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
			case Hbm30Package.KEY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.KEY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.KEY__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.KEY__NOT_NULL:
				unsetNotNull();
				return;
			case Hbm30Package.KEY__ON_DELETE:
				unsetOnDelete();
				return;
			case Hbm30Package.KEY__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
				return;
			case Hbm30Package.KEY__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.KEY__UPDATE:
				unsetUpdate();
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
			case Hbm30Package.KEY__COLUMN:
				return column != null && !column.isEmpty();
			case Hbm30Package.KEY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.KEY__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.KEY__NOT_NULL:
				return isSetNotNull();
			case Hbm30Package.KEY__ON_DELETE:
				return isSetOnDelete();
			case Hbm30Package.KEY__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
			case Hbm30Package.KEY__UNIQUE:
				return isSetUnique();
			case Hbm30Package.KEY__UPDATE:
				return isSetUpdate();
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
		result.append(" (column1: ");
		result.append(column1);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", notNull: ");
		if (notNullESet) result.append(notNull); else result.append("<unset>");
		result.append(", onDelete: ");
		if (onDeleteESet) result.append(onDelete); else result.append("<unset>");
		result.append(", propertyRef: ");
		result.append(propertyRef);
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", update: ");
		if (updateESet) result.append(update); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KeyImpl
