/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapKeyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.MapKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapKeyImpl extends EObjectImpl implements MapKey {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected String formula1 = FORMULA1_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getMapKey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.MAP_KEY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getMapKey_Column());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		return getGroup().list(Hbm30Package.eINSTANCE.getMapKey_Formula());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula1() {
		return formula1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula1(String newFormula1) {
		String oldFormula1 = formula1;
		formula1 = newFormula1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY__FORMULA1, oldFormula1, formula1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.MAP_KEY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MAP_KEY__COLUMN:
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
			case Hbm30Package.MAP_KEY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.MAP_KEY__COLUMN:
				return getColumn();
			case Hbm30Package.MAP_KEY__FORMULA:
				return getFormula();
			case Hbm30Package.MAP_KEY__COLUMN1:
				return getColumn1();
			case Hbm30Package.MAP_KEY__FORMULA1:
				return getFormula1();
			case Hbm30Package.MAP_KEY__LENGTH:
				return getLength();
			case Hbm30Package.MAP_KEY__NODE:
				return getNode();
			case Hbm30Package.MAP_KEY__TYPE:
				return getType();
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
			case Hbm30Package.MAP_KEY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.MAP_KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.MAP_KEY__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.MAP_KEY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.MAP_KEY__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.MAP_KEY__LENGTH:
				setLength((String)newValue);
				return;
			case Hbm30Package.MAP_KEY__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.MAP_KEY__TYPE:
				setType((String)newValue);
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
			case Hbm30Package.MAP_KEY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.MAP_KEY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.MAP_KEY__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.MAP_KEY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Hbm30Package.MAP_KEY__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.MAP_KEY__COLUMN:
				return !getColumn().isEmpty();
			case Hbm30Package.MAP_KEY__FORMULA:
				return !getFormula().isEmpty();
			case Hbm30Package.MAP_KEY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.MAP_KEY__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.MAP_KEY__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case Hbm30Package.MAP_KEY__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.MAP_KEY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", column1: ");
		result.append(column1);
		result.append(", formula1: ");
		result.append(formula1);
		result.append(", length: ");
		result.append(length);
		result.append(", node: ");
		result.append(node);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MapKeyImpl
