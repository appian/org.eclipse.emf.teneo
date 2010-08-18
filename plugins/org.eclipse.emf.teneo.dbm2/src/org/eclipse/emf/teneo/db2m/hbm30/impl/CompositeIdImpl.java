/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeIdImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.CompositeId;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.KeyProperty;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.UnsavedValueType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getKeyProperty <em>Key Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getKeyManyToOne <em>Key Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#isMapped <em>Mapped</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.CompositeIdImpl#getUnsavedValue <em>Unsaved Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeIdImpl extends EObjectImpl implements CompositeId {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMapped()
	 * @generated
	 * @ordered
	 */
	protected boolean mapped = MAPPED_EDEFAULT;

	/**
	 * This is true if the Mapped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mappedESet;

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
	 * The default value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected static final UnsavedValueType2 UNSAVED_VALUE_EDEFAULT = UnsavedValueType2.UNDEFINED;

	/**
	 * The cached value of the '{@link #getUnsavedValue() <em>Unsaved Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsavedValue()
	 * @generated
	 * @ordered
	 */
	protected UnsavedValueType2 unsavedValue = UNSAVED_VALUE_EDEFAULT;

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
	protected CompositeIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getCompositeId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.COMPOSITE_ID__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.COMPOSITE_ID__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyProperty> getKeyProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getCompositeId_KeyProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyManyToOne> getKeyManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getCompositeId_KeyManyToOne());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMapped() {
		return mapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapped(boolean newMapped) {
		boolean oldMapped = mapped;
		mapped = newMapped;
		boolean oldMappedESet = mappedESet;
		mappedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__MAPPED, oldMapped, mapped, !oldMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMapped() {
		boolean oldMapped = mapped;
		boolean oldMappedESet = mappedESet;
		mapped = MAPPED_EDEFAULT;
		mappedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPOSITE_ID__MAPPED, oldMapped, MAPPED_EDEFAULT, oldMappedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMapped() {
		return mappedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsavedValueType2 getUnsavedValue() {
		return unsavedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsavedValue(UnsavedValueType2 newUnsavedValue) {
		UnsavedValueType2 oldUnsavedValue = unsavedValue;
		unsavedValue = newUnsavedValue == null ? UNSAVED_VALUE_EDEFAULT : newUnsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE, oldUnsavedValue, unsavedValue, !oldUnsavedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnsavedValue() {
		UnsavedValueType2 oldUnsavedValue = unsavedValue;
		boolean oldUnsavedValueESet = unsavedValueESet;
		unsavedValue = UNSAVED_VALUE_EDEFAULT;
		unsavedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE, oldUnsavedValue, UNSAVED_VALUE_EDEFAULT, oldUnsavedValueESet));
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
			case Hbm30Package.COMPOSITE_ID__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPOSITE_ID__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPOSITE_ID__KEY_PROPERTY:
				return ((InternalEList<?>)getKeyProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPOSITE_ID__KEY_MANY_TO_ONE:
				return ((InternalEList<?>)getKeyManyToOne()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.COMPOSITE_ID__META:
				return getMeta();
			case Hbm30Package.COMPOSITE_ID__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.COMPOSITE_ID__KEY_PROPERTY:
				return getKeyProperty();
			case Hbm30Package.COMPOSITE_ID__KEY_MANY_TO_ONE:
				return getKeyManyToOne();
			case Hbm30Package.COMPOSITE_ID__ACCESS:
				return getAccess();
			case Hbm30Package.COMPOSITE_ID__CLASS:
				return getClass_();
			case Hbm30Package.COMPOSITE_ID__MAPPED:
				return isMapped();
			case Hbm30Package.COMPOSITE_ID__NAME:
				return getName();
			case Hbm30Package.COMPOSITE_ID__NODE:
				return getNode();
			case Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE:
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
			case Hbm30Package.COMPOSITE_ID__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__KEY_PROPERTY:
				getKeyProperty().clear();
				getKeyProperty().addAll((Collection<? extends KeyProperty>)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__KEY_MANY_TO_ONE:
				getKeyManyToOne().clear();
				getKeyManyToOne().addAll((Collection<? extends KeyManyToOne>)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__MAPPED:
				setMapped((Boolean)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE:
				setUnsavedValue((UnsavedValueType2)newValue);
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
			case Hbm30Package.COMPOSITE_ID__META:
				getMeta().clear();
				return;
			case Hbm30Package.COMPOSITE_ID__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.COMPOSITE_ID__KEY_PROPERTY:
				getKeyProperty().clear();
				return;
			case Hbm30Package.COMPOSITE_ID__KEY_MANY_TO_ONE:
				getKeyManyToOne().clear();
				return;
			case Hbm30Package.COMPOSITE_ID__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.COMPOSITE_ID__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.COMPOSITE_ID__MAPPED:
				unsetMapped();
				return;
			case Hbm30Package.COMPOSITE_ID__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.COMPOSITE_ID__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE:
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
			case Hbm30Package.COMPOSITE_ID__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.COMPOSITE_ID__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.COMPOSITE_ID__KEY_PROPERTY:
				return !getKeyProperty().isEmpty();
			case Hbm30Package.COMPOSITE_ID__KEY_MANY_TO_ONE:
				return !getKeyManyToOne().isEmpty();
			case Hbm30Package.COMPOSITE_ID__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.COMPOSITE_ID__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.COMPOSITE_ID__MAPPED:
				return isSetMapped();
			case Hbm30Package.COMPOSITE_ID__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.COMPOSITE_ID__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.COMPOSITE_ID__UNSAVED_VALUE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", access: ");
		result.append(access);
		result.append(", class: ");
		result.append(class_);
		result.append(", mapped: ");
		if (mappedESet) result.append(mapped); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", unsavedValue: ");
		if (unsavedValueESet) result.append(unsavedValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompositeIdImpl
