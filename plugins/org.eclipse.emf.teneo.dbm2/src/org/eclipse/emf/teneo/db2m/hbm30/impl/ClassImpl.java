/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Cache;
import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeId;
import org.eclipse.emf.teneo.db2m.hbm30.Discriminator;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Filter;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Id;
import org.eclipse.emf.teneo.db2m.hbm30.Idbag;
import org.eclipse.emf.teneo.db2m.hbm30.Join;
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.List;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.NaturalId;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.OptimisticLockType;
import org.eclipse.emf.teneo.db2m.hbm30.PolymorphismType;
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
import org.eclipse.emf.teneo.db2m.hbm30.Subclass;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;
import org.eclipse.emf.teneo.db2m.hbm30.Timestamp;
import org.eclipse.emf.teneo.db2m.hbm30.Tuplizer;
import org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getCompositeId <em>Composite Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getNaturalId <em>Natural Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getIdbag <em>Idbag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getJoinedSubclass <em>Joined Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getUnionSubclass <em>Union Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isDynamicInsert <em>Dynamic Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isDynamicUpdate <em>Dynamic Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getPolymorphism <em>Polymorphism</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getRowid <em>Rowid</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#isSelectBeforeUpdate <em>Select Before Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ClassImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends EObjectImpl implements org.eclipse.emf.teneo.db2m.hbm30.Class {
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
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected Cache cache;

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Id id;

	/**
	 * The cached value of the '{@link #getCompositeId() <em>Composite Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeId()
	 * @generated
	 * @ordered
	 */
	protected CompositeId compositeId;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected Discriminator discriminator;

	/**
	 * The cached value of the '{@link #getNaturalId() <em>Natural Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalId()
	 * @generated
	 * @ordered
	 */
	protected NaturalId naturalId;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Timestamp timestamp;

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
	 * The cached value of the '{@link #getJoinedSubclass() <em>Joined Subclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinedSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinedSubclass> joinedSubclass;

	/**
	 * The cached value of the '{@link #getUnionSubclass() <em>Union Subclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionSubclass> unionSubclass;

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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

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
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
	protected boolean mutable = MUTABLE_EDEFAULT;

	/**
	 * This is true if the Mutable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mutableESet;

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
	 * The default value of the '{@link #getOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected static final OptimisticLockType OPTIMISTIC_LOCK_EDEFAULT = OptimisticLockType.VERSION;

	/**
	 * The cached value of the '{@link #getOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected OptimisticLockType optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;

	/**
	 * This is true if the Optimistic Lock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optimisticLockESet;

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
	 * The default value of the '{@link #getPolymorphism() <em>Polymorphism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolymorphism()
	 * @generated
	 * @ordered
	 */
	protected static final PolymorphismType POLYMORPHISM_EDEFAULT = PolymorphismType.IMPLICIT;

	/**
	 * The cached value of the '{@link #getPolymorphism() <em>Polymorphism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolymorphism()
	 * @generated
	 * @ordered
	 */
	protected PolymorphismType polymorphism = POLYMORPHISM_EDEFAULT;

	/**
	 * This is true if the Polymorphism attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean polymorphismESet;

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
	 * The default value of the '{@link #getRowid() <em>Rowid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowid()
	 * @generated
	 * @ordered
	 */
	protected static final String ROWID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowid() <em>Rowid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowid()
	 * @generated
	 * @ordered
	 */
	protected String rowid = ROWID_EDEFAULT;

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
	 * The default value of the '{@link #getWhere() <em>Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected static final String WHERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected String where = WHERE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getClass_();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.CLASS__META);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SUBSELECT, oldSubselect, subselect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCache(Cache newCache, NotificationChain msgs) {
		Cache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__CACHE, oldCache, newCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(Cache newCache) {
		if (newCache != cache) {
			NotificationChain msgs = null;
			if (cache != null)
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		if (synchronize == null) {
			synchronize = new EObjectContainmentEList<Synchronize>(Synchronize.class, this, Hbm30Package.CLASS__SYNCHRONIZE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tuplizer> getTuplizer() {
		if (tuplizer == null) {
			tuplizer = new EObjectContainmentEList<Tuplizer>(Tuplizer.class, this, Hbm30Package.CLASS__TUPLIZER);
		}
		return tuplizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(Id newId, NotificationChain msgs) {
		Id oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Id newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeId getCompositeId() {
		return compositeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeId(CompositeId newCompositeId, NotificationChain msgs) {
		CompositeId oldCompositeId = compositeId;
		compositeId = newCompositeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__COMPOSITE_ID, oldCompositeId, newCompositeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeId(CompositeId newCompositeId) {
		if (newCompositeId != compositeId) {
			NotificationChain msgs = null;
			if (compositeId != null)
				msgs = ((InternalEObject)compositeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__COMPOSITE_ID, null, msgs);
			if (newCompositeId != null)
				msgs = ((InternalEObject)newCompositeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__COMPOSITE_ID, null, msgs);
			msgs = basicSetCompositeId(newCompositeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__COMPOSITE_ID, newCompositeId, newCompositeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discriminator getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscriminator(Discriminator newDiscriminator, NotificationChain msgs) {
		Discriminator oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__DISCRIMINATOR, oldDiscriminator, newDiscriminator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminator(Discriminator newDiscriminator) {
		if (newDiscriminator != discriminator) {
			NotificationChain msgs = null;
			if (discriminator != null)
				msgs = ((InternalEObject)discriminator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__DISCRIMINATOR, null, msgs);
			if (newDiscriminator != null)
				msgs = ((InternalEObject)newDiscriminator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__DISCRIMINATOR, null, msgs);
			msgs = basicSetDiscriminator(newDiscriminator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__DISCRIMINATOR, newDiscriminator, newDiscriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalId getNaturalId() {
		return naturalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNaturalId(NaturalId newNaturalId, NotificationChain msgs) {
		NaturalId oldNaturalId = naturalId;
		naturalId = newNaturalId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__NATURAL_ID, oldNaturalId, newNaturalId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNaturalId(NaturalId newNaturalId) {
		if (newNaturalId != naturalId) {
			NotificationChain msgs = null;
			if (naturalId != null)
				msgs = ((InternalEObject)naturalId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__NATURAL_ID, null, msgs);
			if (newNaturalId != null)
				msgs = ((InternalEObject)newNaturalId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__NATURAL_ID, null, msgs);
			msgs = basicSetNaturalId(newNaturalId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__NATURAL_ID, newNaturalId, newNaturalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Version newVersion, NotificationChain msgs) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(Timestamp newTimestamp, NotificationChain msgs) {
		Timestamp oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__TIMESTAMP, oldTimestamp, newTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Timestamp newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.CLASS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneToOne> getOneToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_OneToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Properties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMap() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSet() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Set());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getList() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_List());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bag> getBag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Bag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Idbag> getIdbag() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Idbag());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Array> getArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_Array());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveArray> getPrimitiveArray() {
		return getGroup().list(Hbm30Package.eINSTANCE.getClass_PrimitiveArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getJoin() {
		if (join == null) {
			join = new EObjectContainmentEList<Join>(Join.class, this, Hbm30Package.CLASS__JOIN);
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
			subclass = new EObjectContainmentEList<Subclass>(Subclass.class, this, Hbm30Package.CLASS__SUBCLASS);
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedSubclass> getJoinedSubclass() {
		if (joinedSubclass == null) {
			joinedSubclass = new EObjectContainmentEList<JoinedSubclass>(JoinedSubclass.class, this, Hbm30Package.CLASS__JOINED_SUBCLASS);
		}
		return joinedSubclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionSubclass> getUnionSubclass() {
		if (unionSubclass == null) {
			unionSubclass = new EObjectContainmentEList<UnionSubclass>(UnionSubclass.class, this, Hbm30Package.CLASS__UNION_SUBCLASS);
		}
		return unionSubclass;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__LOADER, oldLoader, newLoader);
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
				msgs = ((InternalEObject)loader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__LOADER, null, msgs);
			if (newLoader != null)
				msgs = ((InternalEObject)newLoader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__LOADER, null, msgs);
			msgs = basicSetLoader(newLoader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__LOADER, newLoader, newLoader));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_INSERT, oldSqlInsert, newSqlInsert);
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
				msgs = ((InternalEObject)sqlInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_INSERT, null, msgs);
			if (newSqlInsert != null)
				msgs = ((InternalEObject)newSqlInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_INSERT, null, msgs);
			msgs = basicSetSqlInsert(newSqlInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_INSERT, newSqlInsert, newSqlInsert));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_UPDATE, oldSqlUpdate, newSqlUpdate);
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
				msgs = ((InternalEObject)sqlUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_UPDATE, null, msgs);
			if (newSqlUpdate != null)
				msgs = ((InternalEObject)newSqlUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_UPDATE, null, msgs);
			msgs = basicSetSqlUpdate(newSqlUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_UPDATE, newSqlUpdate, newSqlUpdate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_DELETE, oldSqlDelete, newSqlDelete);
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
				msgs = ((InternalEObject)sqlDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_DELETE, null, msgs);
			if (newSqlDelete != null)
				msgs = ((InternalEObject)newSqlDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.CLASS__SQL_DELETE, null, msgs);
			msgs = basicSetSqlDelete(newSqlDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SQL_DELETE, newSqlDelete, newSqlDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, Hbm30Package.CLASS__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultset> getResultset() {
		if (resultset == null) {
			resultset = new EObjectContainmentEList<Resultset>(Resultset.class, this, Hbm30Package.CLASS__RESULTSET);
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
			group1 = new BasicFeatureMap(this, Hbm30Package.CLASS__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getClass_Query());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlQuery> getSqlQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getClass_SqlQuery());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__BATCH_SIZE, oldBatchSize, batchSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__CATALOG, oldCatalog, catalog));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__CHECK, oldCheck, check));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__DISCRIMINATOR_VALUE, oldDiscriminatorValue, discriminatorValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__DYNAMIC_INSERT, oldDynamicInsert, dynamicInsert, !oldDynamicInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__DYNAMIC_INSERT, oldDynamicInsert, DYNAMIC_INSERT_EDEFAULT, oldDynamicInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__DYNAMIC_UPDATE, oldDynamicUpdate, dynamicUpdate, !oldDynamicUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__DYNAMIC_UPDATE, oldDynamicUpdate, DYNAMIC_UPDATE_EDEFAULT, oldDynamicUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__LAZY, oldLazy, lazy, !oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
	public boolean isMutable() {
		return mutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(boolean newMutable) {
		boolean oldMutable = mutable;
		mutable = newMutable;
		boolean oldMutableESet = mutableESet;
		mutableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__MUTABLE, oldMutable, mutable, !oldMutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMutable() {
		boolean oldMutable = mutable;
		boolean oldMutableESet = mutableESet;
		mutable = MUTABLE_EDEFAULT;
		mutableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMutable() {
		return mutableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimisticLockType getOptimisticLock() {
		return optimisticLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisticLock(OptimisticLockType newOptimisticLock) {
		OptimisticLockType oldOptimisticLock = optimisticLock;
		optimisticLock = newOptimisticLock == null ? OPTIMISTIC_LOCK_EDEFAULT : newOptimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptimisticLock() {
		OptimisticLockType oldOptimisticLock = optimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;
		optimisticLockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__PERSISTER, oldPersister, persister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolymorphismType getPolymorphism() {
		return polymorphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolymorphism(PolymorphismType newPolymorphism) {
		PolymorphismType oldPolymorphism = polymorphism;
		polymorphism = newPolymorphism == null ? POLYMORPHISM_EDEFAULT : newPolymorphism;
		boolean oldPolymorphismESet = polymorphismESet;
		polymorphismESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__POLYMORPHISM, oldPolymorphism, polymorphism, !oldPolymorphismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPolymorphism() {
		PolymorphismType oldPolymorphism = polymorphism;
		boolean oldPolymorphismESet = polymorphismESet;
		polymorphism = POLYMORPHISM_EDEFAULT;
		polymorphismESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__POLYMORPHISM, oldPolymorphism, POLYMORPHISM_EDEFAULT, oldPolymorphismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPolymorphism() {
		return polymorphismESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__PROXY, oldProxy, proxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowid() {
		return rowid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowid(String newRowid) {
		String oldRowid = rowid;
		rowid = newRowid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__ROWID, oldRowid, rowid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, selectBeforeUpdate, !oldSelectBeforeUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.CLASS__SELECT_BEFORE_UPDATE, oldSelectBeforeUpdate, SELECT_BEFORE_UPDATE_EDEFAULT, oldSelectBeforeUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__SUBSELECT1, oldSubselect1, subselect1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(String newWhere) {
		String oldWhere = where;
		where = newWhere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.CLASS__WHERE, oldWhere, where));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.CLASS__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__CACHE:
				return basicSetCache(null, msgs);
			case Hbm30Package.CLASS__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__TUPLIZER:
				return ((InternalEList<?>)getTuplizer()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__ID:
				return basicSetId(null, msgs);
			case Hbm30Package.CLASS__COMPOSITE_ID:
				return basicSetCompositeId(null, msgs);
			case Hbm30Package.CLASS__DISCRIMINATOR:
				return basicSetDiscriminator(null, msgs);
			case Hbm30Package.CLASS__NATURAL_ID:
				return basicSetNaturalId(null, msgs);
			case Hbm30Package.CLASS__VERSION:
				return basicSetVersion(null, msgs);
			case Hbm30Package.CLASS__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case Hbm30Package.CLASS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__SET:
				return ((InternalEList<?>)getSet()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__LIST:
				return ((InternalEList<?>)getList()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__BAG:
				return ((InternalEList<?>)getBag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__IDBAG:
				return ((InternalEList<?>)getIdbag()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__ARRAY:
				return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__PRIMITIVE_ARRAY:
				return ((InternalEList<?>)getPrimitiveArray()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__JOIN:
				return ((InternalEList<?>)getJoin()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__SUBCLASS:
				return ((InternalEList<?>)getSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
				return ((InternalEList<?>)getJoinedSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__UNION_SUBCLASS:
				return ((InternalEList<?>)getUnionSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__LOADER:
				return basicSetLoader(null, msgs);
			case Hbm30Package.CLASS__SQL_INSERT:
				return basicSetSqlInsert(null, msgs);
			case Hbm30Package.CLASS__SQL_UPDATE:
				return basicSetSqlUpdate(null, msgs);
			case Hbm30Package.CLASS__SQL_DELETE:
				return basicSetSqlDelete(null, msgs);
			case Hbm30Package.CLASS__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__RESULTSET:
				return ((InternalEList<?>)getResultset()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case Hbm30Package.CLASS__SQL_QUERY:
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
			case Hbm30Package.CLASS__META:
				return getMeta();
			case Hbm30Package.CLASS__SUBSELECT:
				return getSubselect();
			case Hbm30Package.CLASS__CACHE:
				return getCache();
			case Hbm30Package.CLASS__SYNCHRONIZE:
				return getSynchronize();
			case Hbm30Package.CLASS__COMMENT:
				return getComment();
			case Hbm30Package.CLASS__TUPLIZER:
				return getTuplizer();
			case Hbm30Package.CLASS__ID:
				return getId();
			case Hbm30Package.CLASS__COMPOSITE_ID:
				return getCompositeId();
			case Hbm30Package.CLASS__DISCRIMINATOR:
				return getDiscriminator();
			case Hbm30Package.CLASS__NATURAL_ID:
				return getNaturalId();
			case Hbm30Package.CLASS__VERSION:
				return getVersion();
			case Hbm30Package.CLASS__TIMESTAMP:
				return getTimestamp();
			case Hbm30Package.CLASS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.CLASS__PROPERTY:
				return getProperty();
			case Hbm30Package.CLASS__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.CLASS__ONE_TO_ONE:
				return getOneToOne();
			case Hbm30Package.CLASS__COMPONENT:
				return getComponent();
			case Hbm30Package.CLASS__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.CLASS__PROPERTIES:
				return getProperties();
			case Hbm30Package.CLASS__ANY:
				return getAny();
			case Hbm30Package.CLASS__MAP:
				return getMap();
			case Hbm30Package.CLASS__SET:
				return getSet();
			case Hbm30Package.CLASS__LIST:
				return getList();
			case Hbm30Package.CLASS__BAG:
				return getBag();
			case Hbm30Package.CLASS__IDBAG:
				return getIdbag();
			case Hbm30Package.CLASS__ARRAY:
				return getArray();
			case Hbm30Package.CLASS__PRIMITIVE_ARRAY:
				return getPrimitiveArray();
			case Hbm30Package.CLASS__JOIN:
				return getJoin();
			case Hbm30Package.CLASS__SUBCLASS:
				return getSubclass();
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
				return getJoinedSubclass();
			case Hbm30Package.CLASS__UNION_SUBCLASS:
				return getUnionSubclass();
			case Hbm30Package.CLASS__LOADER:
				return getLoader();
			case Hbm30Package.CLASS__SQL_INSERT:
				return getSqlInsert();
			case Hbm30Package.CLASS__SQL_UPDATE:
				return getSqlUpdate();
			case Hbm30Package.CLASS__SQL_DELETE:
				return getSqlDelete();
			case Hbm30Package.CLASS__FILTER:
				return getFilter();
			case Hbm30Package.CLASS__RESULTSET:
				return getResultset();
			case Hbm30Package.CLASS__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Hbm30Package.CLASS__QUERY:
				return getQuery();
			case Hbm30Package.CLASS__SQL_QUERY:
				return getSqlQuery();
			case Hbm30Package.CLASS__ABSTRACT:
				return isAbstract();
			case Hbm30Package.CLASS__BATCH_SIZE:
				return getBatchSize();
			case Hbm30Package.CLASS__CATALOG:
				return getCatalog();
			case Hbm30Package.CLASS__CHECK:
				return getCheck();
			case Hbm30Package.CLASS__DISCRIMINATOR_VALUE:
				return getDiscriminatorValue();
			case Hbm30Package.CLASS__DYNAMIC_INSERT:
				return isDynamicInsert();
			case Hbm30Package.CLASS__DYNAMIC_UPDATE:
				return isDynamicUpdate();
			case Hbm30Package.CLASS__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.CLASS__LAZY:
				return isLazy();
			case Hbm30Package.CLASS__MUTABLE:
				return isMutable();
			case Hbm30Package.CLASS__NAME:
				return getName();
			case Hbm30Package.CLASS__NODE:
				return getNode();
			case Hbm30Package.CLASS__OPTIMISTIC_LOCK:
				return getOptimisticLock();
			case Hbm30Package.CLASS__PERSISTER:
				return getPersister();
			case Hbm30Package.CLASS__POLYMORPHISM:
				return getPolymorphism();
			case Hbm30Package.CLASS__PROXY:
				return getProxy();
			case Hbm30Package.CLASS__ROWID:
				return getRowid();
			case Hbm30Package.CLASS__SCHEMA:
				return getSchema();
			case Hbm30Package.CLASS__SELECT_BEFORE_UPDATE:
				return isSelectBeforeUpdate();
			case Hbm30Package.CLASS__SUBSELECT1:
				return getSubselect1();
			case Hbm30Package.CLASS__TABLE:
				return getTable();
			case Hbm30Package.CLASS__WHERE:
				return getWhere();
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
			case Hbm30Package.CLASS__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.CLASS__SUBSELECT:
				setSubselect((String)newValue);
				return;
			case Hbm30Package.CLASS__CACHE:
				setCache((Cache)newValue);
				return;
			case Hbm30Package.CLASS__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case Hbm30Package.CLASS__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.CLASS__TUPLIZER:
				getTuplizer().clear();
				getTuplizer().addAll((Collection<? extends Tuplizer>)newValue);
				return;
			case Hbm30Package.CLASS__ID:
				setId((Id)newValue);
				return;
			case Hbm30Package.CLASS__COMPOSITE_ID:
				setCompositeId((CompositeId)newValue);
				return;
			case Hbm30Package.CLASS__DISCRIMINATOR:
				setDiscriminator((Discriminator)newValue);
				return;
			case Hbm30Package.CLASS__NATURAL_ID:
				setNaturalId((NaturalId)newValue);
				return;
			case Hbm30Package.CLASS__VERSION:
				setVersion((Version)newValue);
				return;
			case Hbm30Package.CLASS__TIMESTAMP:
				setTimestamp((Timestamp)newValue);
				return;
			case Hbm30Package.CLASS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.CLASS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.CLASS__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.CLASS__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case Hbm30Package.CLASS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.CLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.CLASS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Properties>)newValue);
				return;
			case Hbm30Package.CLASS__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.CLASS__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends Map>)newValue);
				return;
			case Hbm30Package.CLASS__SET:
				getSet().clear();
				getSet().addAll((Collection<? extends Set>)newValue);
				return;
			case Hbm30Package.CLASS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends List>)newValue);
				return;
			case Hbm30Package.CLASS__BAG:
				getBag().clear();
				getBag().addAll((Collection<? extends Bag>)newValue);
				return;
			case Hbm30Package.CLASS__IDBAG:
				getIdbag().clear();
				getIdbag().addAll((Collection<? extends Idbag>)newValue);
				return;
			case Hbm30Package.CLASS__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends Array>)newValue);
				return;
			case Hbm30Package.CLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				getPrimitiveArray().addAll((Collection<? extends PrimitiveArray>)newValue);
				return;
			case Hbm30Package.CLASS__JOIN:
				getJoin().clear();
				getJoin().addAll((Collection<? extends Join>)newValue);
				return;
			case Hbm30Package.CLASS__SUBCLASS:
				getSubclass().clear();
				getSubclass().addAll((Collection<? extends Subclass>)newValue);
				return;
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				getJoinedSubclass().addAll((Collection<? extends JoinedSubclass>)newValue);
				return;
			case Hbm30Package.CLASS__UNION_SUBCLASS:
				getUnionSubclass().clear();
				getUnionSubclass().addAll((Collection<? extends UnionSubclass>)newValue);
				return;
			case Hbm30Package.CLASS__LOADER:
				setLoader((Loader)newValue);
				return;
			case Hbm30Package.CLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)newValue);
				return;
			case Hbm30Package.CLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)newValue);
				return;
			case Hbm30Package.CLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)newValue);
				return;
			case Hbm30Package.CLASS__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Filter>)newValue);
				return;
			case Hbm30Package.CLASS__RESULTSET:
				getResultset().clear();
				getResultset().addAll((Collection<? extends Resultset>)newValue);
				return;
			case Hbm30Package.CLASS__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Hbm30Package.CLASS__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case Hbm30Package.CLASS__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case Hbm30Package.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__BATCH_SIZE:
				setBatchSize((String)newValue);
				return;
			case Hbm30Package.CLASS__CATALOG:
				setCatalog((String)newValue);
				return;
			case Hbm30Package.CLASS__CHECK:
				setCheck((String)newValue);
				return;
			case Hbm30Package.CLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((String)newValue);
				return;
			case Hbm30Package.CLASS__DYNAMIC_INSERT:
				setDynamicInsert((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__DYNAMIC_UPDATE:
				setDynamicUpdate((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.CLASS__LAZY:
				setLazy((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__MUTABLE:
				setMutable((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.CLASS__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.CLASS__OPTIMISTIC_LOCK:
				setOptimisticLock((OptimisticLockType)newValue);
				return;
			case Hbm30Package.CLASS__PERSISTER:
				setPersister((String)newValue);
				return;
			case Hbm30Package.CLASS__POLYMORPHISM:
				setPolymorphism((PolymorphismType)newValue);
				return;
			case Hbm30Package.CLASS__PROXY:
				setProxy((String)newValue);
				return;
			case Hbm30Package.CLASS__ROWID:
				setRowid((String)newValue);
				return;
			case Hbm30Package.CLASS__SCHEMA:
				setSchema((String)newValue);
				return;
			case Hbm30Package.CLASS__SELECT_BEFORE_UPDATE:
				setSelectBeforeUpdate((Boolean)newValue);
				return;
			case Hbm30Package.CLASS__SUBSELECT1:
				setSubselect1((String)newValue);
				return;
			case Hbm30Package.CLASS__TABLE:
				setTable((String)newValue);
				return;
			case Hbm30Package.CLASS__WHERE:
				setWhere((String)newValue);
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
			case Hbm30Package.CLASS__META:
				getMeta().clear();
				return;
			case Hbm30Package.CLASS__SUBSELECT:
				setSubselect(SUBSELECT_EDEFAULT);
				return;
			case Hbm30Package.CLASS__CACHE:
				setCache((Cache)null);
				return;
			case Hbm30Package.CLASS__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case Hbm30Package.CLASS__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.CLASS__TUPLIZER:
				getTuplizer().clear();
				return;
			case Hbm30Package.CLASS__ID:
				setId((Id)null);
				return;
			case Hbm30Package.CLASS__COMPOSITE_ID:
				setCompositeId((CompositeId)null);
				return;
			case Hbm30Package.CLASS__DISCRIMINATOR:
				setDiscriminator((Discriminator)null);
				return;
			case Hbm30Package.CLASS__NATURAL_ID:
				setNaturalId((NaturalId)null);
				return;
			case Hbm30Package.CLASS__VERSION:
				setVersion((Version)null);
				return;
			case Hbm30Package.CLASS__TIMESTAMP:
				setTimestamp((Timestamp)null);
				return;
			case Hbm30Package.CLASS__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.CLASS__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.CLASS__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.CLASS__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case Hbm30Package.CLASS__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.CLASS__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.CLASS__PROPERTIES:
				getProperties().clear();
				return;
			case Hbm30Package.CLASS__ANY:
				getAny().clear();
				return;
			case Hbm30Package.CLASS__MAP:
				getMap().clear();
				return;
			case Hbm30Package.CLASS__SET:
				getSet().clear();
				return;
			case Hbm30Package.CLASS__LIST:
				getList().clear();
				return;
			case Hbm30Package.CLASS__BAG:
				getBag().clear();
				return;
			case Hbm30Package.CLASS__IDBAG:
				getIdbag().clear();
				return;
			case Hbm30Package.CLASS__ARRAY:
				getArray().clear();
				return;
			case Hbm30Package.CLASS__PRIMITIVE_ARRAY:
				getPrimitiveArray().clear();
				return;
			case Hbm30Package.CLASS__JOIN:
				getJoin().clear();
				return;
			case Hbm30Package.CLASS__SUBCLASS:
				getSubclass().clear();
				return;
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				return;
			case Hbm30Package.CLASS__UNION_SUBCLASS:
				getUnionSubclass().clear();
				return;
			case Hbm30Package.CLASS__LOADER:
				setLoader((Loader)null);
				return;
			case Hbm30Package.CLASS__SQL_INSERT:
				setSqlInsert((SqlInsert)null);
				return;
			case Hbm30Package.CLASS__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)null);
				return;
			case Hbm30Package.CLASS__SQL_DELETE:
				setSqlDelete((SqlDelete)null);
				return;
			case Hbm30Package.CLASS__FILTER:
				getFilter().clear();
				return;
			case Hbm30Package.CLASS__RESULTSET:
				getResultset().clear();
				return;
			case Hbm30Package.CLASS__GROUP1:
				getGroup1().clear();
				return;
			case Hbm30Package.CLASS__QUERY:
				getQuery().clear();
				return;
			case Hbm30Package.CLASS__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case Hbm30Package.CLASS__ABSTRACT:
				unsetAbstract();
				return;
			case Hbm30Package.CLASS__BATCH_SIZE:
				setBatchSize(BATCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.CLASS__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case Hbm30Package.CLASS__CHECK:
				setCheck(CHECK_EDEFAULT);
				return;
			case Hbm30Package.CLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
				return;
			case Hbm30Package.CLASS__DYNAMIC_INSERT:
				unsetDynamicInsert();
				return;
			case Hbm30Package.CLASS__DYNAMIC_UPDATE:
				unsetDynamicUpdate();
				return;
			case Hbm30Package.CLASS__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.CLASS__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.CLASS__MUTABLE:
				unsetMutable();
				return;
			case Hbm30Package.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.CLASS__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.CLASS__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.CLASS__PERSISTER:
				setPersister(PERSISTER_EDEFAULT);
				return;
			case Hbm30Package.CLASS__POLYMORPHISM:
				unsetPolymorphism();
				return;
			case Hbm30Package.CLASS__PROXY:
				setProxy(PROXY_EDEFAULT);
				return;
			case Hbm30Package.CLASS__ROWID:
				setRowid(ROWID_EDEFAULT);
				return;
			case Hbm30Package.CLASS__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case Hbm30Package.CLASS__SELECT_BEFORE_UPDATE:
				unsetSelectBeforeUpdate();
				return;
			case Hbm30Package.CLASS__SUBSELECT1:
				setSubselect1(SUBSELECT1_EDEFAULT);
				return;
			case Hbm30Package.CLASS__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case Hbm30Package.CLASS__WHERE:
				setWhere(WHERE_EDEFAULT);
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
			case Hbm30Package.CLASS__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.CLASS__SUBSELECT:
				return SUBSELECT_EDEFAULT == null ? subselect != null : !SUBSELECT_EDEFAULT.equals(subselect);
			case Hbm30Package.CLASS__CACHE:
				return cache != null;
			case Hbm30Package.CLASS__SYNCHRONIZE:
				return synchronize != null && !synchronize.isEmpty();
			case Hbm30Package.CLASS__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.CLASS__TUPLIZER:
				return tuplizer != null && !tuplizer.isEmpty();
			case Hbm30Package.CLASS__ID:
				return id != null;
			case Hbm30Package.CLASS__COMPOSITE_ID:
				return compositeId != null;
			case Hbm30Package.CLASS__DISCRIMINATOR:
				return discriminator != null;
			case Hbm30Package.CLASS__NATURAL_ID:
				return naturalId != null;
			case Hbm30Package.CLASS__VERSION:
				return version != null;
			case Hbm30Package.CLASS__TIMESTAMP:
				return timestamp != null;
			case Hbm30Package.CLASS__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.CLASS__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.CLASS__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.CLASS__ONE_TO_ONE:
				return !getOneToOne().isEmpty();
			case Hbm30Package.CLASS__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.CLASS__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.CLASS__PROPERTIES:
				return !getProperties().isEmpty();
			case Hbm30Package.CLASS__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.CLASS__MAP:
				return !getMap().isEmpty();
			case Hbm30Package.CLASS__SET:
				return !getSet().isEmpty();
			case Hbm30Package.CLASS__LIST:
				return !getList().isEmpty();
			case Hbm30Package.CLASS__BAG:
				return !getBag().isEmpty();
			case Hbm30Package.CLASS__IDBAG:
				return !getIdbag().isEmpty();
			case Hbm30Package.CLASS__ARRAY:
				return !getArray().isEmpty();
			case Hbm30Package.CLASS__PRIMITIVE_ARRAY:
				return !getPrimitiveArray().isEmpty();
			case Hbm30Package.CLASS__JOIN:
				return join != null && !join.isEmpty();
			case Hbm30Package.CLASS__SUBCLASS:
				return subclass != null && !subclass.isEmpty();
			case Hbm30Package.CLASS__JOINED_SUBCLASS:
				return joinedSubclass != null && !joinedSubclass.isEmpty();
			case Hbm30Package.CLASS__UNION_SUBCLASS:
				return unionSubclass != null && !unionSubclass.isEmpty();
			case Hbm30Package.CLASS__LOADER:
				return loader != null;
			case Hbm30Package.CLASS__SQL_INSERT:
				return sqlInsert != null;
			case Hbm30Package.CLASS__SQL_UPDATE:
				return sqlUpdate != null;
			case Hbm30Package.CLASS__SQL_DELETE:
				return sqlDelete != null;
			case Hbm30Package.CLASS__FILTER:
				return filter != null && !filter.isEmpty();
			case Hbm30Package.CLASS__RESULTSET:
				return resultset != null && !resultset.isEmpty();
			case Hbm30Package.CLASS__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Hbm30Package.CLASS__QUERY:
				return !getQuery().isEmpty();
			case Hbm30Package.CLASS__SQL_QUERY:
				return !getSqlQuery().isEmpty();
			case Hbm30Package.CLASS__ABSTRACT:
				return isSetAbstract();
			case Hbm30Package.CLASS__BATCH_SIZE:
				return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
			case Hbm30Package.CLASS__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case Hbm30Package.CLASS__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
			case Hbm30Package.CLASS__DISCRIMINATOR_VALUE:
				return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT.equals(discriminatorValue);
			case Hbm30Package.CLASS__DYNAMIC_INSERT:
				return isSetDynamicInsert();
			case Hbm30Package.CLASS__DYNAMIC_UPDATE:
				return isSetDynamicUpdate();
			case Hbm30Package.CLASS__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.CLASS__LAZY:
				return isSetLazy();
			case Hbm30Package.CLASS__MUTABLE:
				return isSetMutable();
			case Hbm30Package.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.CLASS__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.CLASS__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.CLASS__PERSISTER:
				return PERSISTER_EDEFAULT == null ? persister != null : !PERSISTER_EDEFAULT.equals(persister);
			case Hbm30Package.CLASS__POLYMORPHISM:
				return isSetPolymorphism();
			case Hbm30Package.CLASS__PROXY:
				return PROXY_EDEFAULT == null ? proxy != null : !PROXY_EDEFAULT.equals(proxy);
			case Hbm30Package.CLASS__ROWID:
				return ROWID_EDEFAULT == null ? rowid != null : !ROWID_EDEFAULT.equals(rowid);
			case Hbm30Package.CLASS__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case Hbm30Package.CLASS__SELECT_BEFORE_UPDATE:
				return isSetSelectBeforeUpdate();
			case Hbm30Package.CLASS__SUBSELECT1:
				return SUBSELECT1_EDEFAULT == null ? subselect1 != null : !SUBSELECT1_EDEFAULT.equals(subselect1);
			case Hbm30Package.CLASS__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case Hbm30Package.CLASS__WHERE:
				return WHERE_EDEFAULT == null ? where != null : !WHERE_EDEFAULT.equals(where);
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
		result.append(", discriminatorValue: ");
		result.append(discriminatorValue);
		result.append(", dynamicInsert: ");
		if (dynamicInsertESet) result.append(dynamicInsert); else result.append("<unset>");
		result.append(", dynamicUpdate: ");
		if (dynamicUpdateESet) result.append(dynamicUpdate); else result.append("<unset>");
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", mutable: ");
		if (mutableESet) result.append(mutable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", optimisticLock: ");
		if (optimisticLockESet) result.append(optimisticLock); else result.append("<unset>");
		result.append(", persister: ");
		result.append(persister);
		result.append(", polymorphism: ");
		if (polymorphismESet) result.append(polymorphism); else result.append("<unset>");
		result.append(", proxy: ");
		result.append(proxy);
		result.append(", rowid: ");
		result.append(rowid);
		result.append(", schema: ");
		result.append(schema);
		result.append(", selectBeforeUpdate: ");
		if (selectBeforeUpdateESet) result.append(selectBeforeUpdate); else result.append("<unset>");
		result.append(", subselect1: ");
		result.append(subselect1);
		result.append(", table: ");
		result.append(table);
		result.append(", where: ");
		result.append(where);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
