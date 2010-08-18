/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.GeneratedNeverAlways;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType;
import org.eclipse.emf.teneo.db2m.hbm30.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getGenerated <em>Generated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.VersionImpl#getUnsavedValue <em>Unsaved Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends EObjectImpl implements Version {
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
	 * The default value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final GeneratedNeverAlways GENERATED_EDEFAULT = GeneratedNeverAlways.NEVER;

	/**
	 * The cached value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected GeneratedNeverAlways generated = GENERATED_EDEFAULT;

	/**
	 * This is true if the Generated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generatedESet;

	/**
	 * The default value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean insert = INSERT_EDEFAULT;

	/**
	 * This is true if the Insert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "integer";

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
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected static final UnsavedValueType UNSAVED_VALUE_EDEFAULT = UnsavedValueType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected UnsavedValueType unsavedValue = UNSAVED_VALUE_EDEFAULT;

	/**
	 * This is true if the Unsaved Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unsavedValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.VERSION__META);
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
			column = new EObjectContainmentEList<Column>(Column.class, this, Hbm30Package.VERSION__COLUMN);
		}
		return column;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedNeverAlways getGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(GeneratedNeverAlways newGenerated) {
		GeneratedNeverAlways oldGenerated = generated;
		generated = newGenerated == null ? GENERATED_EDEFAULT : newGenerated;
		boolean oldGeneratedESet = generatedESet;
		generatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__GENERATED, oldGenerated, generated, !oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerated() {
		GeneratedNeverAlways oldGenerated = generated;
		boolean oldGeneratedESet = generatedESet;
		generated = GENERATED_EDEFAULT;
		generatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.VERSION__GENERATED, oldGenerated, GENERATED_EDEFAULT, oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerated() {
		return generatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(boolean newInsert) {
		boolean oldInsert = insert;
		insert = newInsert;
		boolean oldInsertESet = insertESet;
		insertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__INSERT, oldInsert, insert, !oldInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsert() {
		boolean oldInsert = insert;
		boolean oldInsertESet = insertESet;
		insert = INSERT_EDEFAULT;
		insertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.VERSION__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsert() {
		return insertESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__NODE, oldNode, node));
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
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.VERSION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType getUnsavedValue() {
		return unsavedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsavedValue(UnsavedValueType newUnsavedValue) {
		UnsavedValueType oldUnsavedValue = unsavedValue;
		unsavedValue = newUnsavedValue == null ? UNSAVED_VALUE_EDEFAULT : newUnsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.VERSION__UNSAVED_VALUE, oldUnsavedValue, unsavedValue, !oldUnsavedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnsavedValue() {
		UnsavedValueType oldUnsavedValue = unsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValue = UNSAVED_VALUE_EDEFAULT;
		unsavedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.VERSION__UNSAVED_VALUE, oldUnsavedValue, UNSAVED_VALUE_EDEFAULT, oldUnsavedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnsavedValue() {
		return unsavedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.VERSION__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.VERSION__COLUMN:
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
			case Hbm30Package.VERSION__META:
				return getMeta();
			case Hbm30Package.VERSION__COLUMN:
				return getColumn();
			case Hbm30Package.VERSION__ACCESS:
				return getAccess();
			case Hbm30Package.VERSION__COLUMN1:
				return getColumn1();
			case Hbm30Package.VERSION__GENERATED:
				return getGenerated();
			case Hbm30Package.VERSION__INSERT:
				return isInsert();
			case Hbm30Package.VERSION__NAME:
				return getName();
			case Hbm30Package.VERSION__NODE:
				return getNode();
			case Hbm30Package.VERSION__TYPE:
				return getType();
			case Hbm30Package.VERSION__UNSAVED_VALUE:
				return getUnsavedValue();
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
			case Hbm30Package.VERSION__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.VERSION__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.VERSION__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.VERSION__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.VERSION__GENERATED:
				setGenerated((GeneratedNeverAlways)newValue);
				return;
			case Hbm30Package.VERSION__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.VERSION__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.VERSION__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.VERSION__TYPE:
				setType((String)newValue);
				return;
			case Hbm30Package.VERSION__UNSAVED_VALUE:
				setUnsavedValue((UnsavedValueType)newValue);
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
			case Hbm30Package.VERSION__META:
				getMeta().clear();
				return;
			case Hbm30Package.VERSION__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.VERSION__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.VERSION__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.VERSION__GENERATED:
				unsetGenerated();
				return;
			case Hbm30Package.VERSION__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.VERSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.VERSION__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.VERSION__TYPE:
				unsetType();
				return;
			case Hbm30Package.VERSION__UNSAVED_VALUE:
				unsetUnsavedValue();
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
			case Hbm30Package.VERSION__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.VERSION__COLUMN:
				return column != null && !column.isEmpty();
			case Hbm30Package.VERSION__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.VERSION__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.VERSION__GENERATED:
				return isSetGenerated();
			case Hbm30Package.VERSION__INSERT:
				return isSetInsert();
			case Hbm30Package.VERSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.VERSION__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.VERSION__TYPE:
				return isSetType();
			case Hbm30Package.VERSION__UNSAVED_VALUE:
				return isSetUnsavedValue();
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
		result.append(", generated: ");
		if (generatedESet) result.append(generated); else result.append("<unset>");
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", unsavedValue: ");
		if (unsavedValueESet) result.append(unsavedValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VersionImpl
