/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertiesImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Properties;
import org.eclipse.emf.teneo.db2m.hbm30.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertiesImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesImpl extends EObjectImpl implements Properties {
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
	 * The default value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERT_EDEFAULT = true;

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
	 * The default value of the '{@link #isOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIMISTIC_LOCK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected boolean optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;

	/**
	 * This is true if the Optimistic Lock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optimisticLockESet;

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
	protected static final boolean UPDATE_EDEFAULT = true;

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
	protected PropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.PROPERTIES__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperties_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperties_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperties_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperties_DynamicComponent());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__INSERT, oldInsert, insert, !oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTIES__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptimisticLock() {
		return optimisticLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisticLock(boolean newOptimisticLock) {
		boolean oldOptimisticLock = optimisticLock;
		optimisticLock = newOptimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptimisticLock() {
		boolean oldOptimisticLock = optimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;
		optimisticLockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptimisticLock() {
		return optimisticLockESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__UNIQUE, oldUnique, unique, !oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTIES__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTIES__UPDATE, oldUpdate, update, !oldUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTIES__UPDATE, oldUpdate, UPDATE_EDEFAULT, oldUpdateESet));
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
			case Hbm30Package.PROPERTIES__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTIES__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTIES__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTIES__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTIES__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.PROPERTIES__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.PROPERTIES__PROPERTY:
				return getProperty();
			case Hbm30Package.PROPERTIES__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.PROPERTIES__COMPONENT:
				return getComponent();
			case Hbm30Package.PROPERTIES__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.PROPERTIES__INSERT:
				return isInsert();
			case Hbm30Package.PROPERTIES__NAME:
				return getName();
			case Hbm30Package.PROPERTIES__NODE:
				return getNode();
			case Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK:
				return isOptimisticLock();
			case Hbm30Package.PROPERTIES__UNIQUE:
				return isUnique();
			case Hbm30Package.PROPERTIES__UPDATE:
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
			case Hbm30Package.PROPERTIES__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.PROPERTIES__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.PROPERTIES__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.PROPERTIES__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.PROPERTIES__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.PROPERTIES__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTIES__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.PROPERTIES__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK:
				setOptimisticLock((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTIES__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTIES__UPDATE:
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
			case Hbm30Package.PROPERTIES__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.PROPERTIES__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.PROPERTIES__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.PROPERTIES__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.PROPERTIES__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.PROPERTIES__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.PROPERTIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.PROPERTIES__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.PROPERTIES__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.PROPERTIES__UPDATE:
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
			case Hbm30Package.PROPERTIES__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.PROPERTIES__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.PROPERTIES__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.PROPERTIES__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.PROPERTIES__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.PROPERTIES__INSERT:
				return isSetInsert();
			case Hbm30Package.PROPERTIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.PROPERTIES__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.PROPERTIES__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.PROPERTIES__UNIQUE:
				return isSetUnique();
			case Hbm30Package.PROPERTIES__UPDATE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", optimisticLock: ");
		if (optimisticLockESet) result.append(optimisticLock); else result.append("<unset>");
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", update: ");
		if (updateESet) result.append(update); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PropertiesImpl
