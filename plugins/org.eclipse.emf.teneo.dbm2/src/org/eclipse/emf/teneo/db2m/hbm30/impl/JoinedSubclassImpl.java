/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinedSubclassImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.List;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray;
import org.eclipse.emf.teneo.db2m.hbm30.Properties;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.Query;
import org.eclipse.emf.teneo.db2m.hbm30.Resultset;
import org.eclipse.emf.teneo.db2m.hbm30.Set;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;
import org.eclipse.emf.teneo.db2m.hbm30.SqlInsert;
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joined Subclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getIdbag <em>Idbag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getJoinedSubclass <em>Joined Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#isDynamicInsert <em>Dynamic Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#isDynamicUpdate <em>Dynamic Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#isSelectBeforeUpdate <em>Select Before Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinedSubclassImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinedSubclassImpl extends EObjectImpl implements JoinedSubclass {
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
	 * The default value of the '{@link #getSubselect() <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubselect() <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect()
	 * @generated
	 * @ordered
	 */
	protected String subselect = SUBSELECT_EDEFAULT;

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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

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
	 * The cached value of the '{@link #getJoinedSubclass() <em>Joined Subclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinedSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinedSubclass> joinedSubclass;

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
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected String check = CHECK_EDEFAULT;

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
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

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
	 * The default value of the '{@link #getSubselect1() <em>Subselect1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSELECT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubselect1() <em>Subselect1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect1()
	 * @generated
	 * @ordered
	 */
	protected String subselect1 = SUBSELECT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinedSubclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getJoinedSubclass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.JOINED_SUBCLASS__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubselect() {
		return subselect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubselect(String newSubselect) {
		String oldSubselect = subselect;
		subselect = newSubselect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SUBSELECT, oldSubselect, subselect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		if (synchronize == null) {
			synchronize = new EObjectContainmentEList<Synchronize>(Synchronize.class, this, Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE);
		}
		return synchronize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tuplizer> getTuplizer() {
		if (tuplizer == null) {
			tuplizer = new EObjectContainmentEList<Tuplizer>(Tuplizer.class, this, Hbm30Package.JOINED_SUBCLASS__TUPLIZER);
		}
		return tuplizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Key newKey, NotificationChain msgs) {
		Key oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Key newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.JOINED_SUBCLASS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneToOne> getOneToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_OneToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Properties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSet() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Set());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getList() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bag> getBag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Bag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Idbag> getIdbag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Idbag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveArray> getPrimitiveArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoinedSubclass_PrimitiveArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedSubclass> getJoinedSubclass() {
		if (joinedSubclass == null) {
			joinedSubclass = new EObjectContainmentEList<JoinedSubclass>(JoinedSubclass.class, this, Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS);
		}
		return joinedSubclass;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__LOADER, oldLoader, newLoader);
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
				msgs = ((InternalEObject)loader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__LOADER, null, msgs);
			if (newLoader != null)
				msgs = ((InternalEObject)newLoader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__LOADER, null, msgs);
			msgs = basicSetLoader(newLoader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__LOADER, newLoader, newLoader));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_INSERT, oldSqlInsert, newSqlInsert);
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
				msgs = ((InternalEObject)sqlInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_INSERT, null, msgs);
			if (newSqlInsert != null)
				msgs = ((InternalEObject)newSqlInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_INSERT, null, msgs);
			msgs = basicSetSqlInsert(newSqlInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_INSERT, newSqlInsert, newSqlInsert));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE, oldSqlUpdate, newSqlUpdate);
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
				msgs = ((InternalEObject)sqlUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE, null, msgs);
			if (newSqlUpdate != null)
				msgs = ((InternalEObject)newSqlUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE, null, msgs);
			msgs = basicSetSqlUpdate(newSqlUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE, newSqlUpdate, newSqlUpdate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_DELETE, oldSqlDelete, newSqlDelete);
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
				msgs = ((InternalEObject)sqlDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_DELETE, null, msgs);
			if (newSqlDelete != null)
				msgs = ((InternalEObject)newSqlDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOINED_SUBCLASS__SQL_DELETE, null, msgs);
			msgs = basicSetSqlDelete(newSqlDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SQL_DELETE, newSqlDelete, newSqlDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultset> getResultset() {
		if (resultset == null) {
			resultset = new EObjectContainmentEList<Resultset>(Resultset.class, this, Hbm30Package.JOINED_SUBCLASS__RESULTSET);
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
			group1 = new BasicFeatureMap(this, Hbm30Package.JOINED_SUBCLASS__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getJoinedSubclass_Query());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlQuery> getSqlQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getJoinedSubclass_SqlQuery());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOINED_SUBCLASS__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE, oldBatchSize, batchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(String newCheck) {
		String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__CHECK, oldCheck, check));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT, oldDynamicInsert, dynamicInsert, !oldDynamicInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT, oldDynamicInsert, DYNAMIC_INSERT_EDEFAULT, oldDynamicInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE, oldDynamicUpdate, dynamicUpdate, !oldDynamicUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE, oldDynamicUpdate, DYNAMIC_UPDATE_EDEFAULT, oldDynamicUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__EXTENDS, oldExtends, extends_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__LAZY, oldLazy, lazy, !oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOINED_SUBCLASS__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__PERSISTER, oldPersister, persister));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, selectBeforeUpdate, !oldSelectBeforeUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, SELECT_BEFORE_UPDATE_EDEFAULT, oldSelectBeforeUpdateESet));
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
	public String getSubselect1() {
		return subselect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubselect1(String newSubselect1) {
		String oldSubselect1 = subselect1;
		subselect1 = newSubselect1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__SUBSELECT1, oldSubselect1, subselect1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOINED_SUBCLASS__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.JOINED_SUBCLASS__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
				return ((InternalEList<?>)getTuplizer()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__KEY:
				return basicSetKey(null, msgs);
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SET:
				return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__BAG:
				return ((InternalEList<?>)getBag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__IDBAG:
				return ((InternalEList<?>)getIdbag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__PRIMITIVE_ARRAY:
				return ((InternalEList<?>)getPrimitiveArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
				return ((InternalEList<?>)getJoinedSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
				return basicSetLoader(null, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
				return basicSetSqlInsert(null, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
				return basicSetSqlUpdate(null, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
				return basicSetSqlDelete(null, msgs);
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
				return ((InternalEList<?>)getResultset()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOINED_SUBCLASS__SQL_QUERY:
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
			case Hbm30Package.JOINED_SUBCLASS__META:
				return getMeta();
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT:
				return getSubselect();
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
				return getSynchronize();
			case Hbm30Package.JOINED_SUBCLASS__COMMENT:
				return getComment();
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
				return getTuplizer();
			case Hbm30Package.JOINED_SUBCLASS__KEY:
				return getKey();
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.JOINED_SUBCLASS__PROPERTY:
				return getProperty();
			case Hbm30Package.JOINED_SUBCLASS__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.JOINED_SUBCLASS__ONE_TO_ONE:
				return getOneToOne();
			case Hbm30Package.JOINED_SUBCLASS__COMPONENT:
				return getComponent();
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.JOINED_SUBCLASS__PROPERTIES:
				return getProperties();
			case Hbm30Package.JOINED_SUBCLASS__ANY:
				return getAny();
			case Hbm30Package.JOINED_SUBCLASS__MAP:
				return getMap();
			case Hbm30Package.JOINED_SUBCLASS__SET:
				return getSet();
			case Hbm30Package.JOINED_SUBCLASS__LIST:
				return getList();
			case Hbm30Package.JOINED_SUBCLASS__BAG:
				return getBag();
			case Hbm30Package.JOINED_SUBCLASS__IDBAG:
				return getIdbag();
			case Hbm30Package.JOINED_SUBCLASS__ARRAY:
				return getArray();
			case Hbm30Package.JOINED_SUBCLASS__PRIMITIVE_ARRAY:
				return getPrimitiveArray();
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
				return getJoinedSubclass();
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
				return getLoader();
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
				return getSqlInsert();
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
				return getSqlUpdate();
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
				return getSqlDelete();
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
				return getResultset();
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Hbm30Package.JOINED_SUBCLASS__QUERY:
				return getQuery();
			case Hbm30Package.JOINED_SUBCLASS__SQL_QUERY:
				return getSqlQuery();
			case Hbm30Package.JOINED_SUBCLASS__ABSTRACT:
				return isAbstract();
			case Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE:
				return getBatchSize();
			case Hbm30Package.JOINED_SUBCLASS__CATALOG:
				return getCatalog();
			case Hbm30Package.JOINED_SUBCLASS__CHECK:
				return getCheck();
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT:
				return isDynamicInsert();
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE:
				return isDynamicUpdate();
			case Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.JOINED_SUBCLASS__EXTENDS:
				return getExtends();
			case Hbm30Package.JOINED_SUBCLASS__LAZY:
				return isLazy();
			case Hbm30Package.JOINED_SUBCLASS__NAME:
				return getName();
			case Hbm30Package.JOINED_SUBCLASS__NODE:
				return getNode();
			case Hbm30Package.JOINED_SUBCLASS__PERSISTER:
				return getPersister();
			case Hbm30Package.JOINED_SUBCLASS__PROXY:
				return getProxy();
			case Hbm30Package.JOINED_SUBCLASS__SCHEMA:
				return getSchema();
			case Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE:
				return isSelectBeforeUpdate();
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT1:
				return getSubselect1();
			case Hbm30Package.JOINED_SUBCLASS__TABLE:
				return getTable();
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
			case Hbm30Package.JOINED_SUBCLASS__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT:
				setSubselect((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
				getTuplizer().clear();
				getTuplizer().addAll((Collection<? extends Tuplizer>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__KEY:
				setKey((Key)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Properties>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SET:
				getSet().clear();
				getSet().addAll((Collection<? extends Set>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends List>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__BAG:
				getBag().clear();
				getBag().addAll((Collection<? extends Bag>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__IDBAG:
				getIdbag().clear();
				getIdbag().addAll((Collection<? extends Idbag>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Array>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				getPrimitiveArray().addAll((Collection<? extends PrimitiveArray>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				getJoinedSubclass().addAll((Collection<? extends JoinedSubclass>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
				setLoader((Loader)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
				getResultset().clear();
				getResultset().addAll((Collection<? extends Resultset>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE:
				setBatchSize((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__CATALOG:
				setCatalog((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__CHECK:
				setCheck((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT:
				setDynamicInsert((Boolean)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE:
				setDynamicUpdate((Boolean)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__EXTENDS:
				setExtends((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__LAZY:
				setLazy((Boolean)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PERSISTER:
				setPersister((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROXY:
				setProxy((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SCHEMA:
				setSchema((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE:
				setSelectBeforeUpdate((Boolean)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT1:
				setSubselect1((String)newValue);
				return;
			case Hbm30Package.JOINED_SUBCLASS__TABLE:
				setTable((String)newValue);
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
			case Hbm30Package.JOINED_SUBCLASS__META:
				getMeta().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT:
				setSubselect(SUBSELECT_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
				getTuplizer().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__KEY:
				setKey((Key)null);
				return;
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROPERTIES:
				getProperties().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__ANY:
				getAny().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__MAP:
				getMap().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__SET:
				getSet().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__LIST:
				getList().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__BAG:
				getBag().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__IDBAG:
				getIdbag().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__ARRAY:
				getArray().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
				setLoader((Loader)null);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)null);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)null);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)null);
				return;
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
				getResultset().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
				getGroup1().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__QUERY:
				getQuery().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case Hbm30Package.JOINED_SUBCLASS__ABSTRACT:
				unsetAbstract();
				return;
			case Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE:
				setBatchSize(BATCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__CHECK:
				setCheck(CHECK_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT:
				unsetDynamicInsert();
				return;
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE:
				unsetDynamicUpdate();
				return;
			case Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.JOINED_SUBCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PERSISTER:
				setPersister(PERSISTER_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE:
				unsetSelectBeforeUpdate();
				return;
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT1:
				setSubselect1(SUBSELECT1_EDEFAULT);
				return;
			case Hbm30Package.JOINED_SUBCLASS__TABLE:
				setTable(TABLE_EDEFAULT);
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
			case Hbm30Package.JOINED_SUBCLASS__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT:
				return SUBSELECT_EDEFAULT == null ? subselect != null : !SUBSELECT_EDEFAULT.equals(subselect);
			case Hbm30Package.JOINED_SUBCLASS__SYNCHRONIZE:
				return synchronize != null && !synchronize.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.JOINED_SUBCLASS__TUPLIZER:
				return tuplizer != null && !tuplizer.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__KEY:
				return key != null;
			case Hbm30Package.JOINED_SUBCLASS__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__ONE_TO_ONE:
				return !getOneToOne().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__PROPERTIES:
				return !getProperties().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__MAP:
				return !getMap().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__SET:
				return !getSet().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__LIST:
				return !getList().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__BAG:
				return !getBag().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__IDBAG:
				return !getIdbag().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__ARRAY:
				return !getArray().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__PRIMITIVE_ARRAY:
				return !getPrimitiveArray().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__JOINED_SUBCLASS:
				return joinedSubclass != null && !joinedSubclass.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__LOADER:
				return loader != null;
			case Hbm30Package.JOINED_SUBCLASS__SQL_INSERT:
				return sqlInsert != null;
			case Hbm30Package.JOINED_SUBCLASS__SQL_UPDATE:
				return sqlUpdate != null;
			case Hbm30Package.JOINED_SUBCLASS__SQL_DELETE:
				return sqlDelete != null;
			case Hbm30Package.JOINED_SUBCLASS__RESULTSET:
				return resultset != null && !resultset.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__QUERY:
				return !getQuery().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__SQL_QUERY:
				return !getSqlQuery().isEmpty();
			case Hbm30Package.JOINED_SUBCLASS__ABSTRACT:
				return isSetAbstract();
			case Hbm30Package.JOINED_SUBCLASS__BATCH_SIZE:
				return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
			case Hbm30Package.JOINED_SUBCLASS__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case Hbm30Package.JOINED_SUBCLASS__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_INSERT:
				return isSetDynamicInsert();
			case Hbm30Package.JOINED_SUBCLASS__DYNAMIC_UPDATE:
				return isSetDynamicUpdate();
			case Hbm30Package.JOINED_SUBCLASS__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.JOINED_SUBCLASS__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case Hbm30Package.JOINED_SUBCLASS__LAZY:
				return isSetLazy();
			case Hbm30Package.JOINED_SUBCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.JOINED_SUBCLASS__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.JOINED_SUBCLASS__PERSISTER:
				return PERSISTER_EDEFAULT == null ? persister != null : !PERSISTER_EDEFAULT.equals(persister);
			case Hbm30Package.JOINED_SUBCLASS__PROXY:
				return PROXY_EDEFAULT == null ? proxy != null : !PROXY_EDEFAULT.equals(proxy);
			case Hbm30Package.JOINED_SUBCLASS__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case Hbm30Package.JOINED_SUBCLASS__SELECT_BEFORE_UPDATE:
				return isSetSelectBeforeUpdate();
			case Hbm30Package.JOINED_SUBCLASS__SUBSELECT1:
				return SUBSELECT1_EDEFAULT == null ? subselect1 != null : !SUBSELECT1_EDEFAULT.equals(subselect1);
			case Hbm30Package.JOINED_SUBCLASS__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
		result.append(" (subselect: ");
		result.append(subselect);
		result.append(", comment: ");
		result.append(comment);
		result.append(", group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", batchSize: ");
		result.append(batchSize);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", check: ");
		result.append(check);
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
		result.append(", schema: ");
		result.append(schema);
		result.append(", selectBeforeUpdate: ");
		if (selectBeforeUpdateESet) result.append(selectBeforeUpdate); else result.append("<unset>");
		result.append(", subselect1: ");
		result.append(subselect1);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //JoinedSubclassImpl
