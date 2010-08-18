/**
 * <copyright>
 * </copyright>
 *
 * $Id: IndexManyToAnyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Many To Any</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl#getIdType <em>Id Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.IndexManyToAnyImpl#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexManyToAnyImpl extends EObjectImpl implements IndexManyToAny {
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
	 * The cached value of the '{@link #getColumn1() <em>Column1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column1;

	/**
	 * The default value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdType() <em>Id Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdType()
	 * @generated
	 * @ordered
	 */
	protected String idType = ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected static final String META_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaType()
	 * @generated
	 * @ordered
	 */
	protected String metaType = META_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexManyToAnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getIndexManyToAny();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.INDEX_MANY_TO_ANY__COLUMN, oldColumn, newColumn);
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
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.INDEX_MANY_TO_ANY__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.INDEX_MANY_TO_ANY__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.INDEX_MANY_TO_ANY__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn1() {
		if (column1 == null) {
			column1 = new EObjectContainmentEList<Column>(Column.class, this, Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1);
		}
		return column1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdType(String newIdType) {
		String oldIdType = idType;
		idType = newIdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.INDEX_MANY_TO_ANY__ID_TYPE, oldIdType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaType() {
		return metaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaType(String newMetaType) {
		String oldMetaType = metaType;
		metaType = newMetaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.INDEX_MANY_TO_ANY__META_TYPE, oldMetaType, metaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN:
				return basicSetColumn(null, msgs);
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1:
				return ((InternalEList<?>)getColumn1()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN:
				return getColumn();
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1:
				return getColumn1();
			case Hbm30Package.INDEX_MANY_TO_ANY__ID_TYPE:
				return getIdType();
			case Hbm30Package.INDEX_MANY_TO_ANY__META_TYPE:
				return getMetaType();
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
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN:
				setColumn((Column)newValue);
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1:
				getColumn1().clear();
				getColumn1().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__ID_TYPE:
				setIdType((String)newValue);
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__META_TYPE:
				setMetaType((String)newValue);
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
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN:
				setColumn((Column)null);
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1:
				getColumn1().clear();
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__ID_TYPE:
				setIdType(ID_TYPE_EDEFAULT);
				return;
			case Hbm30Package.INDEX_MANY_TO_ANY__META_TYPE:
				setMetaType(META_TYPE_EDEFAULT);
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
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN:
				return column != null;
			case Hbm30Package.INDEX_MANY_TO_ANY__COLUMN1:
				return column1 != null && !column1.isEmpty();
			case Hbm30Package.INDEX_MANY_TO_ANY__ID_TYPE:
				return ID_TYPE_EDEFAULT == null ? idType != null : !ID_TYPE_EDEFAULT.equals(idType);
			case Hbm30Package.INDEX_MANY_TO_ANY__META_TYPE:
				return META_TYPE_EDEFAULT == null ? metaType != null : !META_TYPE_EDEFAULT.equals(metaType);
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
		result.append(" (idType: ");
		result.append(idType);
		result.append(", metaType: ");
		result.append(metaType);
		result.append(')');
		return result.toString();
	}

} //IndexManyToAnyImpl
