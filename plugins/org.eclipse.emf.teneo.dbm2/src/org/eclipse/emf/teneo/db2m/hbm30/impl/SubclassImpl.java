/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubclassImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Idbag;
import org.eclipse.emf.teneo.db2m.hbm30.Join;
import org.eclipse.emf.teneo.db2m.hbm30.List;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.Query;
import org.eclipse.emf.teneo.db2m.hbm30.Resultset;
import org.eclipse.emf.teneo.db2m.hbm30.Set;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;
import org.eclipse.emf.teneo.db2m.hbm30.SqlInsert;
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;
import org.eclipse.emf.teneo.db2m.hbm30.Subclass;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getIdbag <em>Idbag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#isDynamicInsert <em>Dynamic Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#isDynamicUpdate <em>Dynamic Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SubclassImpl#isSelectBeforeUpdate <em>Select Before Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubclassImpl extends EObjectImpl implements Subclass {
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
	 * The cached value of the '{@link #getSynchronize() <em>Synchronize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronize()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronize> synchronize;

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
	 * The cached value of the '{@link #getJoin() <em>Join</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected EList<Join> join;

	/**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<Subclass> subclass;

	/**
	 * The cached value of the '{@link #getLoader() <em>Loader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoader()
	 * @generated
	 * @ordered
	 */
	protected Loader loader;

	/**
	 * The cached value of the '{@link #getSqlInsert() <em>Sql Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlInsert()
	 * @generated
	 * @ordered
	 */
	protected SqlInsert sqlInsert;

	/**
	 * The cached value of the '{@link #getSqlUpdate() <em>Sql Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlUpdate()
	 * @generated
	 * @ordered
	 */
	protected SqlUpdate sqlUpdate;

	/**
	 * The cached value of the '{@link #getSqlDelete() <em>Sql Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlDelete()
	 * @generated
	 * @ordered
	 */
	protected SqlDelete sqlDelete;

	/**
	 * The cached value of the '{@link #getResultset() <em>Resultset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultset()
	 * @generated
	 * @ordered
	 */
	protected EList<Resultset> resultset;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSize()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchSize() <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchSize()
	 * @generated
	 * @ordered
	 */
	protected String batchSize = BATCH_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorValue = DISCRIMINATOR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDynamicInsert() <em>Dynamic Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_INSERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicInsert() <em>Dynamic Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicInsert = DYNAMIC_INSERT_EDEFAULT;

	/**
	 * This is true if the Dynamic Insert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicInsertESet;

	/**
	 * The default value of the '{@link #isDynamicUpdate() <em>Dynamic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamicUpdate() <em>Dynamic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamicUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicUpdate = DYNAMIC_UPDATE_EDEFAULT;

	/**
	 * This is true if the Dynamic Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dynamicUpdateESet;

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
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

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
	 * The default value of the '{@link #getPersister() <em>Persister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersister()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersister() <em>Persister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersister()
	 * @generated
	 * @ordered
	 */
	protected String persister = PERSISTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected String proxy = PROXY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelectBeforeUpdate() <em>Select Before Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectBeforeUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_BEFORE_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelectBeforeUpdate() <em>Select Before Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectBeforeUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean selectBeforeUpdate = SELECT_BEFORE_UPDATE_EDEFAULT;

	/**
	 * This is true if the Select Before Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectBeforeUpdateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getSubclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.SUBCLASS__META);
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
			tuplizer = new EObjectContainmentEList<Tuplizer>(Tuplizer.class, this, Hbm30Package.SUBCLASS__TUPLIZER);
		}
		return tuplizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		if (synchronize == null) {
			synchronize = new EObjectContainmentEList<Synchronize>(Synchronize.class, this, Hbm30Package.SUBCLASS__SYNCHRONIZE);
		}
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.SUBCLASS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneToOne> getOneToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_OneToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSet() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Set());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getList() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bag> getBag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Bag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Idbag> getIdbag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Idbag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveArray> getPrimitiveArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSubclass_PrimitiveArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getJoin() {
		if (join == null) {
			join = new EObjectContainmentEList<Join>(Join.class, this, Hbm30Package.SUBCLASS__JOIN);
		}
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subclass> getSubclass() {
		if (subclass == null) {
			subclass = new EObjectContainmentEList<Subclass>(Subclass.class, this, Hbm30Package.SUBCLASS__SUBCLASS);
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loader getLoader() {
		return loader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoader(Loader newLoader, NotificationChain msgs) {
		Loader oldLoader = loader;
		loader = newLoader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__LOADER, oldLoader, newLoader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoader(Loader newLoader) {
		if (newLoader != loader) {
			NotificationChain msgs = null;
			if (loader != null)
				msgs = ((InternalEObject)loader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__LOADER, null, msgs);
			if (newLoader != null)
				msgs = ((InternalEObject)newLoader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__LOADER, null, msgs);
			msgs = basicSetLoader(newLoader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__LOADER, newLoader, newLoader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlInsert getSqlInsert() {
		return sqlInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlInsert(SqlInsert newSqlInsert, NotificationChain msgs) {
		SqlInsert oldSqlInsert = sqlInsert;
		sqlInsert = newSqlInsert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_INSERT, oldSqlInsert, newSqlInsert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlInsert(SqlInsert newSqlInsert) {
		if (newSqlInsert != sqlInsert) {
			NotificationChain msgs = null;
			if (sqlInsert != null)
				msgs = ((InternalEObject)sqlInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_INSERT, null, msgs);
			if (newSqlInsert != null)
				msgs = ((InternalEObject)newSqlInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_INSERT, null, msgs);
			msgs = basicSetSqlInsert(newSqlInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_INSERT, newSqlInsert, newSqlInsert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlUpdate getSqlUpdate() {
		return sqlUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlUpdate(SqlUpdate newSqlUpdate, NotificationChain msgs) {
		SqlUpdate oldSqlUpdate = sqlUpdate;
		sqlUpdate = newSqlUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_UPDATE, oldSqlUpdate, newSqlUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlUpdate(SqlUpdate newSqlUpdate) {
		if (newSqlUpdate != sqlUpdate) {
			NotificationChain msgs = null;
			if (sqlUpdate != null)
				msgs = ((InternalEObject)sqlUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_UPDATE, null, msgs);
			if (newSqlUpdate != null)
				msgs = ((InternalEObject)newSqlUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_UPDATE, null, msgs);
			msgs = basicSetSqlUpdate(newSqlUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_UPDATE, newSqlUpdate, newSqlUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDelete getSqlDelete() {
		return sqlDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlDelete(SqlDelete newSqlDelete, NotificationChain msgs) {
		SqlDelete oldSqlDelete = sqlDelete;
		sqlDelete = newSqlDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_DELETE, oldSqlDelete, newSqlDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlDelete(SqlDelete newSqlDelete) {
		if (newSqlDelete != sqlDelete) {
			NotificationChain msgs = null;
			if (sqlDelete != null)
				msgs = ((InternalEObject)sqlDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_DELETE, null, msgs);
			if (newSqlDelete != null)
				msgs = ((InternalEObject)newSqlDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.SUBCLASS__SQL_DELETE, null, msgs);
			msgs = basicSetSqlDelete(newSqlDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SQL_DELETE, newSqlDelete, newSqlDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultset> getResultset() {
		if (resultset == null) {
			resultset = new EObjectContainmentEList<Resultset>(Resultset.class, this, Hbm30Package.SUBCLASS__RESULTSET);
		}
		return resultset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, Hbm30Package.SUBCLASS__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getSubclass_Query());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlQuery> getSqlQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getSubclass_SqlQuery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		boolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SUBCLASS__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBatchSize() {
		return batchSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatchSize(String newBatchSize) {
		String oldBatchSize = batchSize;
		batchSize = newBatchSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__BATCH_SIZE, oldBatchSize, batchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminatorValue() {
		return discriminatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorValue(String newDiscriminatorValue) {
		String oldDiscriminatorValue = discriminatorValue;
		discriminatorValue = newDiscriminatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE, oldDiscriminatorValue, discriminatorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicInsert() {
		return dynamicInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicInsert(boolean newDynamicInsert) {
		boolean oldDynamicInsert = dynamicInsert;
		dynamicInsert = newDynamicInsert;
		boolean oldDynamicInsertESet = dynamicInsertESet;
		dynamicInsertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__DYNAMIC_INSERT, oldDynamicInsert, dynamicInsert, !oldDynamicInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicInsert() {
		boolean oldDynamicInsert = dynamicInsert;
		boolean oldDynamicInsertESet = dynamicInsertESet;
		dynamicInsert = DYNAMIC_INSERT_EDEFAULT;
		dynamicInsertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SUBCLASS__DYNAMIC_INSERT, oldDynamicInsert, DYNAMIC_INSERT_EDEFAULT, oldDynamicInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicInsert() {
		return dynamicInsertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDynamicUpdate() {
		return dynamicUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicUpdate(boolean newDynamicUpdate) {
		boolean oldDynamicUpdate = dynamicUpdate;
		dynamicUpdate = newDynamicUpdate;
		boolean oldDynamicUpdateESet = dynamicUpdateESet;
		dynamicUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__DYNAMIC_UPDATE, oldDynamicUpdate, dynamicUpdate, !oldDynamicUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDynamicUpdate() {
		boolean oldDynamicUpdate = dynamicUpdate;
		boolean oldDynamicUpdateESet = dynamicUpdateESet;
		dynamicUpdate = DYNAMIC_UPDATE_EDEFAULT;
		dynamicUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SUBCLASS__DYNAMIC_UPDATE, oldDynamicUpdate, DYNAMIC_UPDATE_EDEFAULT, oldDynamicUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDynamicUpdate() {
		return dynamicUpdateESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__LAZY, oldLazy, lazy, !oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SUBCLASS__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersister() {
		return persister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersister(String newPersister) {
		String oldPersister = persister;
		persister = newPersister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__PERSISTER, oldPersister, persister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(String newProxy) {
		String oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelectBeforeUpdate() {
		return selectBeforeUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectBeforeUpdate(boolean newSelectBeforeUpdate) {
		boolean oldSelectBeforeUpdate = selectBeforeUpdate;
		selectBeforeUpdate = newSelectBeforeUpdate;
		boolean oldSelectBeforeUpdateESet = selectBeforeUpdateESet;
		selectBeforeUpdateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, selectBeforeUpdate, !oldSelectBeforeUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectBeforeUpdate() {
		boolean oldSelectBeforeUpdate = selectBeforeUpdate;
		boolean oldSelectBeforeUpdateESet = selectBeforeUpdateESet;
		selectBeforeUpdate = SELECT_BEFORE_UPDATE_EDEFAULT;
		selectBeforeUpdateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, SELECT_BEFORE_UPDATE_EDEFAULT, oldSelectBeforeUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectBeforeUpdate() {
		return selectBeforeUpdateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.SUBCLASS__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__TUPLIZER:
				return ((InternalEList<?>)getTuplizer()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__SET:
				return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__BAG:
				return ((InternalEList<?>)getBag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__IDBAG:
				return ((InternalEList<?>)getIdbag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__PRIMITIVE_ARRAY:
				return ((InternalEList<?>)getPrimitiveArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__JOIN:
				return ((InternalEList<?>)getJoin()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__SUBCLASS:
				return ((InternalEList<?>)getSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__LOADER:
				return basicSetLoader(null, msgs);
			case Hbm30Package.SUBCLASS__SQL_INSERT:
				return basicSetSqlInsert(null, msgs);
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
				return basicSetSqlUpdate(null, msgs);
			case Hbm30Package.SUBCLASS__SQL_DELETE:
				return basicSetSqlDelete(null, msgs);
			case Hbm30Package.SUBCLASS__RESULTSET:
				return ((InternalEList<?>)getResultset()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SUBCLASS__SQL_QUERY:
				return ((InternalEList<?>)getSqlQuery()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.SUBCLASS__META:
				return getMeta();
			case Hbm30Package.SUBCLASS__TUPLIZER:
				return getTuplizer();
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
				return getSynchronize();
			case Hbm30Package.SUBCLASS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.SUBCLASS__PROPERTY:
				return getProperty();
			case Hbm30Package.SUBCLASS__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.SUBCLASS__ONE_TO_ONE:
				return getOneToOne();
			case Hbm30Package.SUBCLASS__COMPONENT:
				return getComponent();
			case Hbm30Package.SUBCLASS__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.SUBCLASS__ANY:
				return getAny();
			case Hbm30Package.SUBCLASS__MAP:
				return getMap();
			case Hbm30Package.SUBCLASS__SET:
				return getSet();
			case Hbm30Package.SUBCLASS__LIST:
				return getList();
			case Hbm30Package.SUBCLASS__BAG:
				return getBag();
			case Hbm30Package.SUBCLASS__IDBAG:
				return getIdbag();
			case Hbm30Package.SUBCLASS__ARRAY:
				return getArray();
			case Hbm30Package.SUBCLASS__PRIMITIVE_ARRAY:
				return getPrimitiveArray();
			case Hbm30Package.SUBCLASS__JOIN:
				return getJoin();
			case Hbm30Package.SUBCLASS__SUBCLASS:
				return getSubclass();
			case Hbm30Package.SUBCLASS__LOADER:
				return getLoader();
			case Hbm30Package.SUBCLASS__SQL_INSERT:
				return getSqlInsert();
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
				return getSqlUpdate();
			case Hbm30Package.SUBCLASS__SQL_DELETE:
				return getSqlDelete();
			case Hbm30Package.SUBCLASS__RESULTSET:
				return getResultset();
			case Hbm30Package.SUBCLASS__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Hbm30Package.SUBCLASS__QUERY:
				return getQuery();
			case Hbm30Package.SUBCLASS__SQL_QUERY:
				return getSqlQuery();
			case Hbm30Package.SUBCLASS__ABSTRACT:
				return isAbstract();
			case Hbm30Package.SUBCLASS__BATCH_SIZE:
				return getBatchSize();
			case Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE:
				return getDiscriminatorValue();
			case Hbm30Package.SUBCLASS__DYNAMIC_INSERT:
				return isDynamicInsert();
			case Hbm30Package.SUBCLASS__DYNAMIC_UPDATE:
				return isDynamicUpdate();
			case Hbm30Package.SUBCLASS__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.SUBCLASS__EXTENDS:
				return getExtends();
			case Hbm30Package.SUBCLASS__LAZY:
				return isLazy();
			case Hbm30Package.SUBCLASS__NAME:
				return getName();
			case Hbm30Package.SUBCLASS__NODE:
				return getNode();
			case Hbm30Package.SUBCLASS__PERSISTER:
				return getPersister();
			case Hbm30Package.SUBCLASS__PROXY:
				return getProxy();
			case Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE:
				return isSelectBeforeUpdate();
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
			case Hbm30Package.SUBCLASS__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.SUBCLASS__TUPLIZER:
				getTuplizer().clear();
				getTuplizer().addAll((Collection<? extends Tuplizer>)newValue);
				return;
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case Hbm30Package.SUBCLASS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.SUBCLASS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.SUBCLASS__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.SUBCLASS__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case Hbm30Package.SUBCLASS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.SUBCLASS__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.SUBCLASS__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map>)newValue);
				return;
			case Hbm30Package.SUBCLASS__SET:
				getSet().clear();
				getSet().addAll((Collection<? extends Set>)newValue);
				return;
			case Hbm30Package.SUBCLASS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends List>)newValue);
				return;
			case Hbm30Package.SUBCLASS__BAG:
				getBag().clear();
				getBag().addAll((Collection<? extends Bag>)newValue);
				return;
			case Hbm30Package.SUBCLASS__IDBAG:
				getIdbag().clear();
				getIdbag().addAll((Collection<? extends Idbag>)newValue);
				return;
			case Hbm30Package.SUBCLASS__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Array>)newValue);
				return;
			case Hbm30Package.SUBCLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				getPrimitiveArray().addAll((Collection<? extends PrimitiveArray>)newValue);
				return;
			case Hbm30Package.SUBCLASS__JOIN:
				getJoin().clear();
				getJoin().addAll((Collection<? extends Join>)newValue);
				return;
			case Hbm30Package.SUBCLASS__SUBCLASS:
				getSubclass().clear();
				getSubclass().addAll((Collection<? extends Subclass>)newValue);
				return;
			case Hbm30Package.SUBCLASS__LOADER:
				setLoader((Loader)newValue);
				return;
			case Hbm30Package.SUBCLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)newValue);
				return;
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)newValue);
				return;
			case Hbm30Package.SUBCLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)newValue);
				return;
			case Hbm30Package.SUBCLASS__RESULTSET:
				getResultset().clear();
				getResultset().addAll((Collection<? extends Resultset>)newValue);
				return;
			case Hbm30Package.SUBCLASS__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Hbm30Package.SUBCLASS__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case Hbm30Package.SUBCLASS__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case Hbm30Package.SUBCLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case Hbm30Package.SUBCLASS__BATCH_SIZE:
				setBatchSize((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_INSERT:
				setDynamicInsert((Boolean)newValue);
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_UPDATE:
				setDynamicUpdate((Boolean)newValue);
				return;
			case Hbm30Package.SUBCLASS__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__LAZY:
				setLazy((Boolean)newValue);
				return;
			case Hbm30Package.SUBCLASS__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__PERSISTER:
				setPersister((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__PROXY:
				setProxy((String)newValue);
				return;
			case Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE:
				setSelectBeforeUpdate((Boolean)newValue);
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
			case Hbm30Package.SUBCLASS__META:
				getMeta().clear();
				return;
			case Hbm30Package.SUBCLASS__TUPLIZER:
				getTuplizer().clear();
				return;
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case Hbm30Package.SUBCLASS__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.SUBCLASS__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.SUBCLASS__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.SUBCLASS__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case Hbm30Package.SUBCLASS__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.SUBCLASS__ANY:
				getAny().clear();
				return;
			case Hbm30Package.SUBCLASS__MAP:
				getMap().clear();
				return;
			case Hbm30Package.SUBCLASS__SET:
				getSet().clear();
				return;
			case Hbm30Package.SUBCLASS__LIST:
				getList().clear();
				return;
			case Hbm30Package.SUBCLASS__BAG:
				getBag().clear();
				return;
			case Hbm30Package.SUBCLASS__IDBAG:
				getIdbag().clear();
				return;
			case Hbm30Package.SUBCLASS__ARRAY:
				getArray().clear();
				return;
			case Hbm30Package.SUBCLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				return;
			case Hbm30Package.SUBCLASS__JOIN:
				getJoin().clear();
				return;
			case Hbm30Package.SUBCLASS__SUBCLASS:
				getSubclass().clear();
				return;
			case Hbm30Package.SUBCLASS__LOADER:
				setLoader((Loader)null);
				return;
			case Hbm30Package.SUBCLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)null);
				return;
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)null);
				return;
			case Hbm30Package.SUBCLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)null);
				return;
			case Hbm30Package.SUBCLASS__RESULTSET:
				getResultset().clear();
				return;
			case Hbm30Package.SUBCLASS__GROUP1:
				getGroup1().clear();
				return;
			case Hbm30Package.SUBCLASS__QUERY:
				getQuery().clear();
				return;
			case Hbm30Package.SUBCLASS__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case Hbm30Package.SUBCLASS__ABSTRACT:
				unsetAbstract();
				return;
			case Hbm30Package.SUBCLASS__BATCH_SIZE:
				setBatchSize(BATCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_INSERT:
				unsetDynamicInsert();
				return;
			case Hbm30Package.SUBCLASS__DYNAMIC_UPDATE:
				unsetDynamicUpdate();
				return;
			case Hbm30Package.SUBCLASS__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.SUBCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__PERSISTER:
				setPersister(PERSISTER_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE:
				unsetSelectBeforeUpdate();
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
			case Hbm30Package.SUBCLASS__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.SUBCLASS__TUPLIZER:
				return tuplizer != null && !tuplizer.isEmpty();
			case Hbm30Package.SUBCLASS__SYNCHRONIZE:
				return synchronize != null && !synchronize.isEmpty();
			case Hbm30Package.SUBCLASS__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.SUBCLASS__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.SUBCLASS__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.SUBCLASS__ONE_TO_ONE:
				return !getOneToOne().isEmpty();
			case Hbm30Package.SUBCLASS__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.SUBCLASS__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.SUBCLASS__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.SUBCLASS__MAP:
				return !getMap().isEmpty();
			case Hbm30Package.SUBCLASS__SET:
				return !getSet().isEmpty();
			case Hbm30Package.SUBCLASS__LIST:
				return !getList().isEmpty();
			case Hbm30Package.SUBCLASS__BAG:
				return !getBag().isEmpty();
			case Hbm30Package.SUBCLASS__IDBAG:
				return !getIdbag().isEmpty();
			case Hbm30Package.SUBCLASS__ARRAY:
				return !getArray().isEmpty();
			case Hbm30Package.SUBCLASS__PRIMITIVE_ARRAY:
				return !getPrimitiveArray().isEmpty();
			case Hbm30Package.SUBCLASS__JOIN:
				return join != null && !join.isEmpty();
			case Hbm30Package.SUBCLASS__SUBCLASS:
				return subclass != null && !subclass.isEmpty();
			case Hbm30Package.SUBCLASS__LOADER:
				return loader != null;
			case Hbm30Package.SUBCLASS__SQL_INSERT:
				return sqlInsert != null;
			case Hbm30Package.SUBCLASS__SQL_UPDATE:
				return sqlUpdate != null;
			case Hbm30Package.SUBCLASS__SQL_DELETE:
				return sqlDelete != null;
			case Hbm30Package.SUBCLASS__RESULTSET:
				return resultset != null && !resultset.isEmpty();
			case Hbm30Package.SUBCLASS__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Hbm30Package.SUBCLASS__QUERY:
				return !getQuery().isEmpty();
			case Hbm30Package.SUBCLASS__SQL_QUERY:
				return !getSqlQuery().isEmpty();
			case Hbm30Package.SUBCLASS__ABSTRACT:
				return isSetAbstract();
			case Hbm30Package.SUBCLASS__BATCH_SIZE:
				return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
			case Hbm30Package.SUBCLASS__DISCRIMINATOR_VALUE:
				return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT.equals(discriminatorValue);
			case Hbm30Package.SUBCLASS__DYNAMIC_INSERT:
				return isSetDynamicInsert();
			case Hbm30Package.SUBCLASS__DYNAMIC_UPDATE:
				return isSetDynamicUpdate();
			case Hbm30Package.SUBCLASS__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.SUBCLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case Hbm30Package.SUBCLASS__LAZY:
				return isSetLazy();
			case Hbm30Package.SUBCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.SUBCLASS__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.SUBCLASS__PERSISTER:
				return PERSISTER_EDEFAULT == null ? persister != null : !PERSISTER_EDEFAULT.equals(persister);
			case Hbm30Package.SUBCLASS__PROXY:
				return PROXY_EDEFAULT == null ? proxy != null : !PROXY_EDEFAULT.equals(proxy);
			case Hbm30Package.SUBCLASS__SELECT_BEFORE_UPDATE:
				return isSetSelectBeforeUpdate();
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
		result.append(", group1: ");
		result.append(group1);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", batchSize: ");
		result.append(batchSize);
		result.append(", discriminatorValue: ");
		result.append(discriminatorValue);
		result.append(", dynamicInsert: ");
		if (dynamicInsertESet) result.append(dynamicInsert); else result.append("<unset>");
		result.append(", dynamicUpdate: ");
		if (dynamicUpdateESet) result.append(dynamicUpdate); else result.append("<unset>");
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", extends: ");
		result.append(extends_);
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", persister: ");
		result.append(persister);
		result.append(", proxy: ");
		result.append(proxy);
		result.append(", selectBeforeUpdate: ");
		if (selectBeforeUpdateESet) result.append(selectBeforeUpdate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubclassImpl
