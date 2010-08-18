/**
 * <copyright>
 * </copyright>
 *
 * $Id: KeyManyToOneImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.KeyManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.LazyFalseProxy;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Many To One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.KeyManyToOneImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyManyToOneImpl extends EObjectImpl implements KeyManyToOne {
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
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final LazyFalseProxy LAZY_EDEFAULT = LazyFalseProxy.FALSE;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected LazyFalseProxy lazy = LAZY_EDEFAULT;

	/**
	 * This is true if the Lazy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lazyESet;

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
	protected KeyManyToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getKeyManyToOne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.KEY_MANY_TO_ONE__META);
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
			column = new EObjectContainmentEList<Column>(Column.class, this, Hbm30Package.KEY_MANY_TO_ONE__COLUMN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyFalseProxy getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(LazyFalseProxy newLazy) {
		LazyFalseProxy oldLazy = lazy;
		lazy = newLazy == null ? LAZY_EDEFAULT : newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		LazyFalseProxy oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.KEY_MANY_TO_ONE__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLazy() {
		return lazyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.KEY_MANY_TO_ONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.KEY_MANY_TO_ONE__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN:
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
			case Hbm30Package.KEY_MANY_TO_ONE__META:
				return getMeta();
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN:
				return getColumn();
			case Hbm30Package.KEY_MANY_TO_ONE__ACCESS:
				return getAccess();
			case Hbm30Package.KEY_MANY_TO_ONE__CLASS:
				return getClass_();
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN1:
				return getColumn1();
			case Hbm30Package.KEY_MANY_TO_ONE__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.KEY_MANY_TO_ONE__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.KEY_MANY_TO_ONE__LAZY:
				return getLazy();
			case Hbm30Package.KEY_MANY_TO_ONE__NAME:
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
			case Hbm30Package.KEY_MANY_TO_ONE__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__LAZY:
				setLazy((LazyFalseProxy)newValue);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__NAME:
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
			case Hbm30Package.KEY_MANY_TO_ONE__META:
				getMeta().clear();
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.KEY_MANY_TO_ONE__NAME:
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
			case Hbm30Package.KEY_MANY_TO_ONE__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN:
				return column != null && !column.isEmpty();
			case Hbm30Package.KEY_MANY_TO_ONE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.KEY_MANY_TO_ONE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.KEY_MANY_TO_ONE__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.KEY_MANY_TO_ONE__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.KEY_MANY_TO_ONE__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.KEY_MANY_TO_ONE__LAZY:
				return isSetLazy();
			case Hbm30Package.KEY_MANY_TO_ONE__NAME:
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
		result.append(" (access: ");
		result.append(access);
		result.append(", class: ");
		result.append(class_);
		result.append(", column1: ");
		result.append(column1);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //KeyManyToOneImpl
