/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyPropertyImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.KeyProperty;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyPropertyImpl#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyPropertyImpl extends EObjectImpl implements KeyProperty {
	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> meta;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected String type1 = TYPE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getKeyProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.KEY_PROPERTY__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column>(Column.class, this, Hbm30Package.KEY_PROPERTY__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.KEY_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.KEY_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType1() {
		return type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType1(String newType1) {
		String oldType1 = type1;
		type1 = newType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_PROPERTY__TYPE1, oldType1, type1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.KEY_PROPERTY__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.KEY_PROPERTY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case Hbm30Package.KEY_PROPERTY__TYPE:
				return basicSetType(null, msgs);
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
			case Hbm30Package.KEY_PROPERTY__META:
				return getMeta();
			case Hbm30Package.KEY_PROPERTY__COLUMN:
				return getColumn();
			case Hbm30Package.KEY_PROPERTY__TYPE:
				return getType();
			case Hbm30Package.KEY_PROPERTY__ACCESS:
				return getAccess();
			case Hbm30Package.KEY_PROPERTY__COLUMN1:
				return getColumn1();
			case Hbm30Package.KEY_PROPERTY__LENGTH:
				return getLength();
			case Hbm30Package.KEY_PROPERTY__NAME:
				return getName();
			case Hbm30Package.KEY_PROPERTY__NODE:
				return getNode();
			case Hbm30Package.KEY_PROPERTY__TYPE1:
				return getType1();
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
			case Hbm30Package.KEY_PROPERTY__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__TYPE:
				setType((Type)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__LENGTH:
				setLength((String)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.KEY_PROPERTY__TYPE1:
				setType1((String)newValue);
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
			case Hbm30Package.KEY_PROPERTY__META:
				getMeta().clear();
				return;
			case Hbm30Package.KEY_PROPERTY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.KEY_PROPERTY__TYPE:
				setType((Type)null);
				return;
			case Hbm30Package.KEY_PROPERTY__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.KEY_PROPERTY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.KEY_PROPERTY__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Hbm30Package.KEY_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.KEY_PROPERTY__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.KEY_PROPERTY__TYPE1:
				setType1(TYPE1_EDEFAULT);
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
			case Hbm30Package.KEY_PROPERTY__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.KEY_PROPERTY__COLUMN:
				return column != null && !column.isEmpty();
			case Hbm30Package.KEY_PROPERTY__TYPE:
				return type != null;
			case Hbm30Package.KEY_PROPERTY__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.KEY_PROPERTY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.KEY_PROPERTY__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case Hbm30Package.KEY_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.KEY_PROPERTY__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.KEY_PROPERTY__TYPE1:
				return TYPE1_EDEFAULT == null ? type1 != null : !TYPE1_EDEFAULT.equals(type1);
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
		result.append(" (access: ");
		result.append(access);
		result.append(", column1: ");
		result.append(column1);
		result.append(", length: ");
		result.append(length);
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", type1: ");
		result.append(type1);
		result.append(')');
		return result.toString();
	}

} //KeyPropertyImpl
