/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComponentImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Any;
import org.eclipse.emf.teneo.db2m.hbm30.Array;
import org.eclipse.emf.teneo.db2m.hbm30.Bag;
import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.List;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Parent;
import org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.Set;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ComponentImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
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
	 * The cached value of the '{@link #getTuplizer() <em>Tuplizer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuplizer()
	 * @generated
	 * @ordered
	 */
	protected EList<Tuplizer> tuplizer;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Parent parent;

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
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.COMPONENT__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tuplizer> getTuplizer() {
		if (tuplizer == null) {
			tuplizer = new EObjectContainmentEList<Tuplizer>(Tuplizer.class, this, Hbm30Package.COMPONENT__TUPLIZER);
		}
		return tuplizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs) {
		Parent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Parent newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.COMPONENT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.COMPONENT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.COMPONENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneToOne> getOneToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_OneToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSet() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Set());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getList() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bag> getBag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Bag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveArray> getPrimitiveArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getComponent_PrimitiveArray());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__INSERT, oldInsert, insert, !oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPONENT__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
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
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		boolean oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPONENT__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPONENT__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__UNIQUE, oldUnique, unique, !oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPONENT__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COMPONENT__UPDATE, oldUpdate, update, !oldUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COMPONENT__UPDATE, oldUpdate, UPDATE_EDEFAULT, oldUpdateESet));
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
			case Hbm30Package.COMPONENT__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__TUPLIZER:
				return ((InternalEList<?>)getTuplizer()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case Hbm30Package.COMPONENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__SET:
				return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__BAG:
				return ((InternalEList<?>)getBag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.COMPONENT__PRIMITIVE_ARRAY:
				return ((InternalEList<?>)getPrimitiveArray()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.COMPONENT__META:
				return getMeta();
			case Hbm30Package.COMPONENT__TUPLIZER:
				return getTuplizer();
			case Hbm30Package.COMPONENT__PARENT:
				return getParent();
			case Hbm30Package.COMPONENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.COMPONENT__PROPERTY:
				return getProperty();
			case Hbm30Package.COMPONENT__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.COMPONENT__ONE_TO_ONE:
				return getOneToOne();
			case Hbm30Package.COMPONENT__COMPONENT:
				return getComponent();
			case Hbm30Package.COMPONENT__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.COMPONENT__ANY:
				return getAny();
			case Hbm30Package.COMPONENT__MAP:
				return getMap();
			case Hbm30Package.COMPONENT__SET:
				return getSet();
			case Hbm30Package.COMPONENT__LIST:
				return getList();
			case Hbm30Package.COMPONENT__BAG:
				return getBag();
			case Hbm30Package.COMPONENT__ARRAY:
				return getArray();
			case Hbm30Package.COMPONENT__PRIMITIVE_ARRAY:
				return getPrimitiveArray();
			case Hbm30Package.COMPONENT__ACCESS:
				return getAccess();
			case Hbm30Package.COMPONENT__CLASS:
				return getClass_();
			case Hbm30Package.COMPONENT__INSERT:
				return isInsert();
			case Hbm30Package.COMPONENT__LAZY:
				return isLazy();
			case Hbm30Package.COMPONENT__NAME:
				return getName();
			case Hbm30Package.COMPONENT__NODE:
				return getNode();
			case Hbm30Package.COMPONENT__OPTIMISTIC_LOCK:
				return isOptimisticLock();
			case Hbm30Package.COMPONENT__UNIQUE:
				return isUnique();
			case Hbm30Package.COMPONENT__UPDATE:
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
			case Hbm30Package.COMPONENT__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.COMPONENT__TUPLIZER:
				getTuplizer().clear();
				getTuplizer().addAll((Collection<? extends Tuplizer>)newValue);
				return;
			case Hbm30Package.COMPONENT__PARENT:
				setParent((Parent)newValue);
				return;
			case Hbm30Package.COMPONENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.COMPONENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.COMPONENT__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.COMPONENT__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case Hbm30Package.COMPONENT__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.COMPONENT__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.COMPONENT__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.COMPONENT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map>)newValue);
				return;
			case Hbm30Package.COMPONENT__SET:
				getSet().clear();
				getSet().addAll((Collection<? extends Set>)newValue);
				return;
			case Hbm30Package.COMPONENT__LIST:
				getList().clear();
				getList().addAll((Collection<? extends List>)newValue);
				return;
			case Hbm30Package.COMPONENT__BAG:
				getBag().clear();
				getBag().addAll((Collection<? extends Bag>)newValue);
				return;
			case Hbm30Package.COMPONENT__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Array>)newValue);
				return;
			case Hbm30Package.COMPONENT__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				getPrimitiveArray().addAll((Collection<? extends PrimitiveArray>)newValue);
				return;
			case Hbm30Package.COMPONENT__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.COMPONENT__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.COMPONENT__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.COMPONENT__LAZY:
				setLazy((Boolean)newValue);
				return;
			case Hbm30Package.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.COMPONENT__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.COMPONENT__OPTIMISTIC_LOCK:
				setOptimisticLock((Boolean)newValue);
				return;
			case Hbm30Package.COMPONENT__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.COMPONENT__UPDATE:
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
			case Hbm30Package.COMPONENT__META:
				getMeta().clear();
				return;
			case Hbm30Package.COMPONENT__TUPLIZER:
				getTuplizer().clear();
				return;
			case Hbm30Package.COMPONENT__PARENT:
				setParent((Parent)null);
				return;
			case Hbm30Package.COMPONENT__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.COMPONENT__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.COMPONENT__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.COMPONENT__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case Hbm30Package.COMPONENT__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.COMPONENT__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.COMPONENT__ANY:
				getAny().clear();
				return;
			case Hbm30Package.COMPONENT__MAP:
				getMap().clear();
				return;
			case Hbm30Package.COMPONENT__SET:
				getSet().clear();
				return;
			case Hbm30Package.COMPONENT__LIST:
				getList().clear();
				return;
			case Hbm30Package.COMPONENT__BAG:
				getBag().clear();
				return;
			case Hbm30Package.COMPONENT__ARRAY:
				getArray().clear();
				return;
			case Hbm30Package.COMPONENT__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				return;
			case Hbm30Package.COMPONENT__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.COMPONENT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.COMPONENT__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.COMPONENT__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.COMPONENT__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.COMPONENT__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.COMPONENT__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.COMPONENT__UPDATE:
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
			case Hbm30Package.COMPONENT__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.COMPONENT__TUPLIZER:
				return tuplizer != null && !tuplizer.isEmpty();
			case Hbm30Package.COMPONENT__PARENT:
				return parent != null;
			case Hbm30Package.COMPONENT__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.COMPONENT__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.COMPONENT__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.COMPONENT__ONE_TO_ONE:
				return !getOneToOne().isEmpty();
			case Hbm30Package.COMPONENT__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.COMPONENT__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.COMPONENT__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.COMPONENT__MAP:
				return !getMap().isEmpty();
			case Hbm30Package.COMPONENT__SET:
				return !getSet().isEmpty();
			case Hbm30Package.COMPONENT__LIST:
				return !getList().isEmpty();
			case Hbm30Package.COMPONENT__BAG:
				return !getBag().isEmpty();
			case Hbm30Package.COMPONENT__ARRAY:
				return !getArray().isEmpty();
			case Hbm30Package.COMPONENT__PRIMITIVE_ARRAY:
				return !getPrimitiveArray().isEmpty();
			case Hbm30Package.COMPONENT__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.COMPONENT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.COMPONENT__INSERT:
				return isSetInsert();
			case Hbm30Package.COMPONENT__LAZY:
				return isSetLazy();
			case Hbm30Package.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.COMPONENT__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.COMPONENT__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.COMPONENT__UNIQUE:
				return isSetUnique();
			case Hbm30Package.COMPONENT__UPDATE:
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
		result.append(", access: ");
		result.append(access);
		result.append(", class: ");
		result.append(class_);
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
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

} //ComponentImpl
