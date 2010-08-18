/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Cache;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeElement;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeIndex;
import org.eclipse.emf.teneo.db2m.hbm30.CompositeMapKey;
import org.eclipse.emf.teneo.db2m.hbm30.Element;
import org.eclipse.emf.teneo.db2m.hbm30.Fetch;
import org.eclipse.emf.teneo.db2m.hbm30.Filter;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Index;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToAny;
import org.eclipse.emf.teneo.db2m.hbm30.IndexManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.LazyTrueFalseExtra;
import org.eclipse.emf.teneo.db2m.hbm30.Loader;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToAny;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Map;
import org.eclipse.emf.teneo.db2m.hbm30.MapKey;
import org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.OneToMany;
import org.eclipse.emf.teneo.db2m.hbm30.Outerjoin;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDeleteAll;
import org.eclipse.emf.teneo.db2m.hbm30.SqlInsert;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCompositeMapKey <em>Composite Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getMapKeyManyToMany <em>Map Key Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCompositeIndex <em>Composite Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getIndexManyToMany <em>Index Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getIndexManyToAny <em>Index Many To Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCompositeElement <em>Composite Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getManyToAny <em>Many To Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSqlDeleteAll <em>Sql Delete All</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapImpl#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends EObjectImpl implements Map {
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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected MapKey mapKey;

	/**
	 * The cached value of the '{@link #getCompositeMapKey() <em>Composite Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeMapKey()
	 * @generated
	 * @ordered
	 */
	protected CompositeMapKey compositeMapKey;

	/**
	 * The cached value of the '{@link #getMapKeyManyToMany() <em>Map Key Many To Many</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyManyToMany()
	 * @generated
	 * @ordered
	 */
	protected MapKeyManyToMany mapKeyManyToMany;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Index index;

	/**
	 * The cached value of the '{@link #getCompositeIndex() <em>Composite Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeIndex()
	 * @generated
	 * @ordered
	 */
	protected CompositeIndex compositeIndex;

	/**
	 * The cached value of the '{@link #getIndexManyToMany() <em>Index Many To Many</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexManyToMany()
	 * @generated
	 * @ordered
	 */
	protected IndexManyToMany indexManyToMany;

	/**
	 * The cached value of the '{@link #getIndexManyToAny() <em>Index Many To Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexManyToAny()
	 * @generated
	 * @ordered
	 */
	protected IndexManyToAny indexManyToAny;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToMany()
	 * @generated
	 * @ordered
	 */
	protected OneToMany oneToMany;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected ManyToMany manyToMany;

	/**
	 * The cached value of the '{@link #getCompositeElement() <em>Composite Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeElement()
	 * @generated
	 * @ordered
	 */
	protected CompositeElement compositeElement;

	/**
	 * The cached value of the '{@link #getManyToAny() <em>Many To Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToAny()
	 * @generated
	 * @ordered
	 */
	protected ManyToAny manyToAny;

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
	 * The cached value of the '{@link #getSqlDeleteAll() <em>Sql Delete All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlDeleteAll()
	 * @generated
	 * @ordered
	 */
	protected SqlDeleteAll sqlDeleteAll;

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
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected String cascade = CASCADE_EDEFAULT;

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
	 * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionType()
	 * @generated
	 * @ordered
	 */
	protected String collectionType = COLLECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBED_XML_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected boolean embedXml = EMBED_XML_EDEFAULT;

	/**
	 * This is true if the Embed Xml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean embedXmlESet;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final Fetch FETCH_EDEFAULT = Fetch.JOIN;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected Fetch fetch = FETCH_EDEFAULT;

	/**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchESet;

	/**
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;

	/**
	 * This is true if the Inverse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inverseESet;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final LazyTrueFalseExtra LAZY_EDEFAULT = LazyTrueFalseExtra.TRUE;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected LazyTrueFalseExtra lazy = LAZY_EDEFAULT;

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
	 * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected String orderBy = ORDER_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected static final Outerjoin OUTER_JOIN_EDEFAULT = Outerjoin.TRUE;

	/**
	 * The cached value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected Outerjoin outerJoin = OUTER_JOIN_EDEFAULT;

	/**
	 * This is true if the Outer Join attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerJoinESet;

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
	 * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected static final String SORT_EDEFAULT = "unsorted";

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected String sort = SORT_EDEFAULT;

	/**
	 * This is true if the Sort attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortESet;

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
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.MAP__META);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SUBSELECT, oldSubselect, subselect));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__CACHE, oldCache, newCache);
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
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		if (synchronize == null) {
			synchronize = new EObjectContainmentEList<Synchronize>(Synchronize.class, this, Hbm30Package.MAP__SYNCHRONIZE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMMENT, oldComment, comment));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__KEY, oldKey, newKey);
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
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey getMapKey() {
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKey(MapKey newMapKey, NotificationChain msgs) {
		MapKey oldMapKey = mapKey;
		mapKey = newMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MAP_KEY, oldMapKey, newMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKey(MapKey newMapKey) {
		if (newMapKey != mapKey) {
			NotificationChain msgs = null;
			if (mapKey != null)
				msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MAP_KEY, null, msgs);
			if (newMapKey != null)
				msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MAP_KEY, null, msgs);
			msgs = basicSetMapKey(newMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MAP_KEY, newMapKey, newMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMapKey getCompositeMapKey() {
		return compositeMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeMapKey(CompositeMapKey newCompositeMapKey, NotificationChain msgs) {
		CompositeMapKey oldCompositeMapKey = compositeMapKey;
		compositeMapKey = newCompositeMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_MAP_KEY, oldCompositeMapKey, newCompositeMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeMapKey(CompositeMapKey newCompositeMapKey) {
		if (newCompositeMapKey != compositeMapKey) {
			NotificationChain msgs = null;
			if (compositeMapKey != null)
				msgs = ((InternalEObject)compositeMapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_MAP_KEY, null, msgs);
			if (newCompositeMapKey != null)
				msgs = ((InternalEObject)newCompositeMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_MAP_KEY, null, msgs);
			msgs = basicSetCompositeMapKey(newCompositeMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_MAP_KEY, newCompositeMapKey, newCompositeMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKeyManyToMany getMapKeyManyToMany() {
		return mapKeyManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKeyManyToMany(MapKeyManyToMany newMapKeyManyToMany, NotificationChain msgs) {
		MapKeyManyToMany oldMapKeyManyToMany = mapKeyManyToMany;
		mapKeyManyToMany = newMapKeyManyToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY, oldMapKeyManyToMany, newMapKeyManyToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKeyManyToMany(MapKeyManyToMany newMapKeyManyToMany) {
		if (newMapKeyManyToMany != mapKeyManyToMany) {
			NotificationChain msgs = null;
			if (mapKeyManyToMany != null)
				msgs = ((InternalEObject)mapKeyManyToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY, null, msgs);
			if (newMapKeyManyToMany != null)
				msgs = ((InternalEObject)newMapKeyManyToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY, null, msgs);
			msgs = basicSetMapKeyManyToMany(newMapKeyManyToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY, newMapKeyManyToMany, newMapKeyManyToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs) {
		Index oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Index newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeIndex getCompositeIndex() {
		return compositeIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeIndex(CompositeIndex newCompositeIndex, NotificationChain msgs) {
		CompositeIndex oldCompositeIndex = compositeIndex;
		compositeIndex = newCompositeIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_INDEX, oldCompositeIndex, newCompositeIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeIndex(CompositeIndex newCompositeIndex) {
		if (newCompositeIndex != compositeIndex) {
			NotificationChain msgs = null;
			if (compositeIndex != null)
				msgs = ((InternalEObject)compositeIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_INDEX, null, msgs);
			if (newCompositeIndex != null)
				msgs = ((InternalEObject)newCompositeIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_INDEX, null, msgs);
			msgs = basicSetCompositeIndex(newCompositeIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_INDEX, newCompositeIndex, newCompositeIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexManyToMany getIndexManyToMany() {
		return indexManyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexManyToMany(IndexManyToMany newIndexManyToMany, NotificationChain msgs) {
		IndexManyToMany oldIndexManyToMany = indexManyToMany;
		indexManyToMany = newIndexManyToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX_MANY_TO_MANY, oldIndexManyToMany, newIndexManyToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexManyToMany(IndexManyToMany newIndexManyToMany) {
		if (newIndexManyToMany != indexManyToMany) {
			NotificationChain msgs = null;
			if (indexManyToMany != null)
				msgs = ((InternalEObject)indexManyToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX_MANY_TO_MANY, null, msgs);
			if (newIndexManyToMany != null)
				msgs = ((InternalEObject)newIndexManyToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX_MANY_TO_MANY, null, msgs);
			msgs = basicSetIndexManyToMany(newIndexManyToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX_MANY_TO_MANY, newIndexManyToMany, newIndexManyToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexManyToAny getIndexManyToAny() {
		return indexManyToAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexManyToAny(IndexManyToAny newIndexManyToAny, NotificationChain msgs) {
		IndexManyToAny oldIndexManyToAny = indexManyToAny;
		indexManyToAny = newIndexManyToAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX_MANY_TO_ANY, oldIndexManyToAny, newIndexManyToAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexManyToAny(IndexManyToAny newIndexManyToAny) {
		if (newIndexManyToAny != indexManyToAny) {
			NotificationChain msgs = null;
			if (indexManyToAny != null)
				msgs = ((InternalEObject)indexManyToAny).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX_MANY_TO_ANY, null, msgs);
			if (newIndexManyToAny != null)
				msgs = ((InternalEObject)newIndexManyToAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__INDEX_MANY_TO_ANY, null, msgs);
			msgs = basicSetIndexManyToAny(newIndexManyToAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INDEX_MANY_TO_ANY, newIndexManyToAny, newIndexManyToAny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__ELEMENT, null, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__ELEMENT, null, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToMany getOneToMany() {
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToMany(OneToMany newOneToMany, NotificationChain msgs) {
		OneToMany oldOneToMany = oneToMany;
		oneToMany = newOneToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ONE_TO_MANY, oldOneToMany, newOneToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToMany(OneToMany newOneToMany) {
		if (newOneToMany != oneToMany) {
			NotificationChain msgs = null;
			if (oneToMany != null)
				msgs = ((InternalEObject)oneToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__ONE_TO_MANY, null, msgs);
			if (newOneToMany != null)
				msgs = ((InternalEObject)newOneToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__ONE_TO_MANY, null, msgs);
			msgs = basicSetOneToMany(newOneToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ONE_TO_MANY, newOneToMany, newOneToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToMany getManyToMany() {
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToMany(ManyToMany newManyToMany, NotificationChain msgs) {
		ManyToMany oldManyToMany = manyToMany;
		manyToMany = newManyToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MANY_TO_MANY, oldManyToMany, newManyToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManyToMany(ManyToMany newManyToMany) {
		if (newManyToMany != manyToMany) {
			NotificationChain msgs = null;
			if (manyToMany != null)
				msgs = ((InternalEObject)manyToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MANY_TO_MANY, null, msgs);
			if (newManyToMany != null)
				msgs = ((InternalEObject)newManyToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MANY_TO_MANY, null, msgs);
			msgs = basicSetManyToMany(newManyToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MANY_TO_MANY, newManyToMany, newManyToMany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeElement getCompositeElement() {
		return compositeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeElement(CompositeElement newCompositeElement, NotificationChain msgs) {
		CompositeElement oldCompositeElement = compositeElement;
		compositeElement = newCompositeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_ELEMENT, oldCompositeElement, newCompositeElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeElement(CompositeElement newCompositeElement) {
		if (newCompositeElement != compositeElement) {
			NotificationChain msgs = null;
			if (compositeElement != null)
				msgs = ((InternalEObject)compositeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_ELEMENT, null, msgs);
			if (newCompositeElement != null)
				msgs = ((InternalEObject)newCompositeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__COMPOSITE_ELEMENT, null, msgs);
			msgs = basicSetCompositeElement(newCompositeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COMPOSITE_ELEMENT, newCompositeElement, newCompositeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToAny getManyToAny() {
		return manyToAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToAny(ManyToAny newManyToAny, NotificationChain msgs) {
		ManyToAny oldManyToAny = manyToAny;
		manyToAny = newManyToAny;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MANY_TO_ANY, oldManyToAny, newManyToAny);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManyToAny(ManyToAny newManyToAny) {
		if (newManyToAny != manyToAny) {
			NotificationChain msgs = null;
			if (manyToAny != null)
				msgs = ((InternalEObject)manyToAny).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MANY_TO_ANY, null, msgs);
			if (newManyToAny != null)
				msgs = ((InternalEObject)newManyToAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__MANY_TO_ANY, null, msgs);
			msgs = basicSetManyToAny(newManyToAny, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MANY_TO_ANY, newManyToAny, newManyToAny));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__LOADER, oldLoader, newLoader);
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
				msgs = ((InternalEObject)loader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__LOADER, null, msgs);
			if (newLoader != null)
				msgs = ((InternalEObject)newLoader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__LOADER, null, msgs);
			msgs = basicSetLoader(newLoader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__LOADER, newLoader, newLoader));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_INSERT, oldSqlInsert, newSqlInsert);
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
				msgs = ((InternalEObject)sqlInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_INSERT, null, msgs);
			if (newSqlInsert != null)
				msgs = ((InternalEObject)newSqlInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_INSERT, null, msgs);
			msgs = basicSetSqlInsert(newSqlInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_INSERT, newSqlInsert, newSqlInsert));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_UPDATE, oldSqlUpdate, newSqlUpdate);
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
				msgs = ((InternalEObject)sqlUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_UPDATE, null, msgs);
			if (newSqlUpdate != null)
				msgs = ((InternalEObject)newSqlUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_UPDATE, null, msgs);
			msgs = basicSetSqlUpdate(newSqlUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_UPDATE, newSqlUpdate, newSqlUpdate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_DELETE, oldSqlDelete, newSqlDelete);
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
				msgs = ((InternalEObject)sqlDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_DELETE, null, msgs);
			if (newSqlDelete != null)
				msgs = ((InternalEObject)newSqlDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_DELETE, null, msgs);
			msgs = basicSetSqlDelete(newSqlDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_DELETE, newSqlDelete, newSqlDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDeleteAll getSqlDeleteAll() {
		return sqlDeleteAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlDeleteAll(SqlDeleteAll newSqlDeleteAll, NotificationChain msgs) {
		SqlDeleteAll oldSqlDeleteAll = sqlDeleteAll;
		sqlDeleteAll = newSqlDeleteAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_DELETE_ALL, oldSqlDeleteAll, newSqlDeleteAll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlDeleteAll(SqlDeleteAll newSqlDeleteAll) {
		if (newSqlDeleteAll != sqlDeleteAll) {
			NotificationChain msgs = null;
			if (sqlDeleteAll != null)
				msgs = ((InternalEObject)sqlDeleteAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_DELETE_ALL, null, msgs);
			if (newSqlDeleteAll != null)
				msgs = ((InternalEObject)newSqlDeleteAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.MAP__SQL_DELETE_ALL, null, msgs);
			msgs = basicSetSqlDeleteAll(newSqlDeleteAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SQL_DELETE_ALL, newSqlDeleteAll, newSqlDeleteAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Filter>(Filter.class, this, Hbm30Package.MAP__FILTER);
		}
		return filter;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__BATCH_SIZE, oldBatchSize, batchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCascade() {
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascade(String newCascade) {
		String oldCascade = cascade;
		cascade = newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__CASCADE, oldCascade, cascade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__CATALOG, oldCatalog, catalog));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionType() {
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionType(String newCollectionType) {
		String oldCollectionType = collectionType;
		collectionType = newCollectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__COLLECTION_TYPE, oldCollectionType, collectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedXml() {
		return embedXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedXml(boolean newEmbedXml) {
		boolean oldEmbedXml = embedXml;
		embedXml = newEmbedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXmlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__EMBED_XML, oldEmbedXml, embedXml, !oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmbedXml() {
		boolean oldEmbedXml = embedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXml = EMBED_XML_EDEFAULT;
		embedXmlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__EMBED_XML, oldEmbedXml, EMBED_XML_EDEFAULT, oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmbedXml() {
		return embedXmlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(Fetch newFetch) {
		Fetch oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__FETCH, oldFetch, fetch, !oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFetch() {
		Fetch oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFetch() {
		return fetchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		boolean oldInverseESet = inverseESet;
		inverseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__INVERSE, oldInverse, inverse, !oldInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInverse() {
		boolean oldInverse = inverse;
		boolean oldInverseESet = inverseESet;
		inverse = INVERSE_EDEFAULT;
		inverseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__INVERSE, oldInverse, INVERSE_EDEFAULT, oldInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInverse() {
		return inverseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LazyTrueFalseExtra getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(LazyTrueFalseExtra newLazy) {
		LazyTrueFalseExtra oldLazy = lazy;
		lazy = newLazy == null ? LAZY_EDEFAULT : newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		LazyTrueFalseExtra oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__MUTABLE, oldMutable, mutable, !oldMutableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
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
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderBy(String newOrderBy) {
		String oldOrderBy = orderBy;
		orderBy = newOrderBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__ORDER_BY, oldOrderBy, orderBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outerjoin getOuterJoin() {
		return outerJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterJoin(Outerjoin newOuterJoin) {
		Outerjoin oldOuterJoin = outerJoin;
		outerJoin = newOuterJoin == null ? OUTER_JOIN_EDEFAULT : newOuterJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__OUTER_JOIN, oldOuterJoin, outerJoin, !oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterJoin() {
		Outerjoin oldOuterJoin = outerJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoin = OUTER_JOIN_EDEFAULT;
		outerJoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__OUTER_JOIN, oldOuterJoin, OUTER_JOIN_EDEFAULT, oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterJoin() {
		return outerJoinESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__PERSISTER, oldPersister, persister));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(String newSort) {
		String oldSort = sort;
		sort = newSort;
		boolean oldSortESet = sortESet;
		sortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SORT, oldSort, sort, !oldSortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSort() {
		String oldSort = sort;
		boolean oldSortESet = sortESet;
		sort = SORT_EDEFAULT;
		sortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MAP__SORT, oldSort, SORT_EDEFAULT, oldSortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSort() {
		return sortESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__SUBSELECT1, oldSubselect1, subselect1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__TABLE, oldTable, table));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP__WHERE, oldWhere, where));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.MAP__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MAP__CACHE:
				return basicSetCache(null, msgs);
			case Hbm30Package.MAP__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MAP__KEY:
				return basicSetKey(null, msgs);
			case Hbm30Package.MAP__MAP_KEY:
				return basicSetMapKey(null, msgs);
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
				return basicSetCompositeMapKey(null, msgs);
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
				return basicSetMapKeyManyToMany(null, msgs);
			case Hbm30Package.MAP__INDEX:
				return basicSetIndex(null, msgs);
			case Hbm30Package.MAP__COMPOSITE_INDEX:
				return basicSetCompositeIndex(null, msgs);
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
				return basicSetIndexManyToMany(null, msgs);
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
				return basicSetIndexManyToAny(null, msgs);
			case Hbm30Package.MAP__ELEMENT:
				return basicSetElement(null, msgs);
			case Hbm30Package.MAP__ONE_TO_MANY:
				return basicSetOneToMany(null, msgs);
			case Hbm30Package.MAP__MANY_TO_MANY:
				return basicSetManyToMany(null, msgs);
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
				return basicSetCompositeElement(null, msgs);
			case Hbm30Package.MAP__MANY_TO_ANY:
				return basicSetManyToAny(null, msgs);
			case Hbm30Package.MAP__LOADER:
				return basicSetLoader(null, msgs);
			case Hbm30Package.MAP__SQL_INSERT:
				return basicSetSqlInsert(null, msgs);
			case Hbm30Package.MAP__SQL_UPDATE:
				return basicSetSqlUpdate(null, msgs);
			case Hbm30Package.MAP__SQL_DELETE:
				return basicSetSqlDelete(null, msgs);
			case Hbm30Package.MAP__SQL_DELETE_ALL:
				return basicSetSqlDeleteAll(null, msgs);
			case Hbm30Package.MAP__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.MAP__META:
				return getMeta();
			case Hbm30Package.MAP__SUBSELECT:
				return getSubselect();
			case Hbm30Package.MAP__CACHE:
				return getCache();
			case Hbm30Package.MAP__SYNCHRONIZE:
				return getSynchronize();
			case Hbm30Package.MAP__COMMENT:
				return getComment();
			case Hbm30Package.MAP__KEY:
				return getKey();
			case Hbm30Package.MAP__MAP_KEY:
				return getMapKey();
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
				return getCompositeMapKey();
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
				return getMapKeyManyToMany();
			case Hbm30Package.MAP__INDEX:
				return getIndex();
			case Hbm30Package.MAP__COMPOSITE_INDEX:
				return getCompositeIndex();
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
				return getIndexManyToMany();
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
				return getIndexManyToAny();
			case Hbm30Package.MAP__ELEMENT:
				return getElement();
			case Hbm30Package.MAP__ONE_TO_MANY:
				return getOneToMany();
			case Hbm30Package.MAP__MANY_TO_MANY:
				return getManyToMany();
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
				return getCompositeElement();
			case Hbm30Package.MAP__MANY_TO_ANY:
				return getManyToAny();
			case Hbm30Package.MAP__LOADER:
				return getLoader();
			case Hbm30Package.MAP__SQL_INSERT:
				return getSqlInsert();
			case Hbm30Package.MAP__SQL_UPDATE:
				return getSqlUpdate();
			case Hbm30Package.MAP__SQL_DELETE:
				return getSqlDelete();
			case Hbm30Package.MAP__SQL_DELETE_ALL:
				return getSqlDeleteAll();
			case Hbm30Package.MAP__FILTER:
				return getFilter();
			case Hbm30Package.MAP__ACCESS:
				return getAccess();
			case Hbm30Package.MAP__BATCH_SIZE:
				return getBatchSize();
			case Hbm30Package.MAP__CASCADE:
				return getCascade();
			case Hbm30Package.MAP__CATALOG:
				return getCatalog();
			case Hbm30Package.MAP__CHECK:
				return getCheck();
			case Hbm30Package.MAP__COLLECTION_TYPE:
				return getCollectionType();
			case Hbm30Package.MAP__EMBED_XML:
				return isEmbedXml();
			case Hbm30Package.MAP__FETCH:
				return getFetch();
			case Hbm30Package.MAP__INVERSE:
				return isInverse();
			case Hbm30Package.MAP__LAZY:
				return getLazy();
			case Hbm30Package.MAP__MUTABLE:
				return isMutable();
			case Hbm30Package.MAP__NAME:
				return getName();
			case Hbm30Package.MAP__NODE:
				return getNode();
			case Hbm30Package.MAP__OPTIMISTIC_LOCK:
				return isOptimisticLock();
			case Hbm30Package.MAP__ORDER_BY:
				return getOrderBy();
			case Hbm30Package.MAP__OUTER_JOIN:
				return getOuterJoin();
			case Hbm30Package.MAP__PERSISTER:
				return getPersister();
			case Hbm30Package.MAP__SCHEMA:
				return getSchema();
			case Hbm30Package.MAP__SORT:
				return getSort();
			case Hbm30Package.MAP__SUBSELECT1:
				return getSubselect1();
			case Hbm30Package.MAP__TABLE:
				return getTable();
			case Hbm30Package.MAP__WHERE:
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
			case Hbm30Package.MAP__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.MAP__SUBSELECT:
				setSubselect((String)newValue);
				return;
			case Hbm30Package.MAP__CACHE:
				setCache((Cache)newValue);
				return;
			case Hbm30Package.MAP__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case Hbm30Package.MAP__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.MAP__KEY:
				setKey((Key)newValue);
				return;
			case Hbm30Package.MAP__MAP_KEY:
				setMapKey((MapKey)newValue);
				return;
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
				setCompositeMapKey((CompositeMapKey)newValue);
				return;
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
				setMapKeyManyToMany((MapKeyManyToMany)newValue);
				return;
			case Hbm30Package.MAP__INDEX:
				setIndex((Index)newValue);
				return;
			case Hbm30Package.MAP__COMPOSITE_INDEX:
				setCompositeIndex((CompositeIndex)newValue);
				return;
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
				setIndexManyToMany((IndexManyToMany)newValue);
				return;
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
				setIndexManyToAny((IndexManyToAny)newValue);
				return;
			case Hbm30Package.MAP__ELEMENT:
				setElement((Element)newValue);
				return;
			case Hbm30Package.MAP__ONE_TO_MANY:
				setOneToMany((OneToMany)newValue);
				return;
			case Hbm30Package.MAP__MANY_TO_MANY:
				setManyToMany((ManyToMany)newValue);
				return;
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
				setCompositeElement((CompositeElement)newValue);
				return;
			case Hbm30Package.MAP__MANY_TO_ANY:
				setManyToAny((ManyToAny)newValue);
				return;
			case Hbm30Package.MAP__LOADER:
				setLoader((Loader)newValue);
				return;
			case Hbm30Package.MAP__SQL_INSERT:
				setSqlInsert((SqlInsert)newValue);
				return;
			case Hbm30Package.MAP__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)newValue);
				return;
			case Hbm30Package.MAP__SQL_DELETE:
				setSqlDelete((SqlDelete)newValue);
				return;
			case Hbm30Package.MAP__SQL_DELETE_ALL:
				setSqlDeleteAll((SqlDeleteAll)newValue);
				return;
			case Hbm30Package.MAP__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Filter>)newValue);
				return;
			case Hbm30Package.MAP__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.MAP__BATCH_SIZE:
				setBatchSize((String)newValue);
				return;
			case Hbm30Package.MAP__CASCADE:
				setCascade((String)newValue);
				return;
			case Hbm30Package.MAP__CATALOG:
				setCatalog((String)newValue);
				return;
			case Hbm30Package.MAP__CHECK:
				setCheck((String)newValue);
				return;
			case Hbm30Package.MAP__COLLECTION_TYPE:
				setCollectionType((String)newValue);
				return;
			case Hbm30Package.MAP__EMBED_XML:
				setEmbedXml((Boolean)newValue);
				return;
			case Hbm30Package.MAP__FETCH:
				setFetch((Fetch)newValue);
				return;
			case Hbm30Package.MAP__INVERSE:
				setInverse((Boolean)newValue);
				return;
			case Hbm30Package.MAP__LAZY:
				setLazy((LazyTrueFalseExtra)newValue);
				return;
			case Hbm30Package.MAP__MUTABLE:
				setMutable((Boolean)newValue);
				return;
			case Hbm30Package.MAP__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.MAP__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.MAP__OPTIMISTIC_LOCK:
				setOptimisticLock((Boolean)newValue);
				return;
			case Hbm30Package.MAP__ORDER_BY:
				setOrderBy((String)newValue);
				return;
			case Hbm30Package.MAP__OUTER_JOIN:
				setOuterJoin((Outerjoin)newValue);
				return;
			case Hbm30Package.MAP__PERSISTER:
				setPersister((String)newValue);
				return;
			case Hbm30Package.MAP__SCHEMA:
				setSchema((String)newValue);
				return;
			case Hbm30Package.MAP__SORT:
				setSort((String)newValue);
				return;
			case Hbm30Package.MAP__SUBSELECT1:
				setSubselect1((String)newValue);
				return;
			case Hbm30Package.MAP__TABLE:
				setTable((String)newValue);
				return;
			case Hbm30Package.MAP__WHERE:
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
			case Hbm30Package.MAP__META:
				getMeta().clear();
				return;
			case Hbm30Package.MAP__SUBSELECT:
				setSubselect(SUBSELECT_EDEFAULT);
				return;
			case Hbm30Package.MAP__CACHE:
				setCache((Cache)null);
				return;
			case Hbm30Package.MAP__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case Hbm30Package.MAP__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.MAP__KEY:
				setKey((Key)null);
				return;
			case Hbm30Package.MAP__MAP_KEY:
				setMapKey((MapKey)null);
				return;
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
				setCompositeMapKey((CompositeMapKey)null);
				return;
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
				setMapKeyManyToMany((MapKeyManyToMany)null);
				return;
			case Hbm30Package.MAP__INDEX:
				setIndex((Index)null);
				return;
			case Hbm30Package.MAP__COMPOSITE_INDEX:
				setCompositeIndex((CompositeIndex)null);
				return;
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
				setIndexManyToMany((IndexManyToMany)null);
				return;
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
				setIndexManyToAny((IndexManyToAny)null);
				return;
			case Hbm30Package.MAP__ELEMENT:
				setElement((Element)null);
				return;
			case Hbm30Package.MAP__ONE_TO_MANY:
				setOneToMany((OneToMany)null);
				return;
			case Hbm30Package.MAP__MANY_TO_MANY:
				setManyToMany((ManyToMany)null);
				return;
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
				setCompositeElement((CompositeElement)null);
				return;
			case Hbm30Package.MAP__MANY_TO_ANY:
				setManyToAny((ManyToAny)null);
				return;
			case Hbm30Package.MAP__LOADER:
				setLoader((Loader)null);
				return;
			case Hbm30Package.MAP__SQL_INSERT:
				setSqlInsert((SqlInsert)null);
				return;
			case Hbm30Package.MAP__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)null);
				return;
			case Hbm30Package.MAP__SQL_DELETE:
				setSqlDelete((SqlDelete)null);
				return;
			case Hbm30Package.MAP__SQL_DELETE_ALL:
				setSqlDeleteAll((SqlDeleteAll)null);
				return;
			case Hbm30Package.MAP__FILTER:
				getFilter().clear();
				return;
			case Hbm30Package.MAP__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.MAP__BATCH_SIZE:
				setBatchSize(BATCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.MAP__CASCADE:
				setCascade(CASCADE_EDEFAULT);
				return;
			case Hbm30Package.MAP__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case Hbm30Package.MAP__CHECK:
				setCheck(CHECK_EDEFAULT);
				return;
			case Hbm30Package.MAP__COLLECTION_TYPE:
				setCollectionType(COLLECTION_TYPE_EDEFAULT);
				return;
			case Hbm30Package.MAP__EMBED_XML:
				unsetEmbedXml();
				return;
			case Hbm30Package.MAP__FETCH:
				unsetFetch();
				return;
			case Hbm30Package.MAP__INVERSE:
				unsetInverse();
				return;
			case Hbm30Package.MAP__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.MAP__MUTABLE:
				unsetMutable();
				return;
			case Hbm30Package.MAP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.MAP__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.MAP__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.MAP__ORDER_BY:
				setOrderBy(ORDER_BY_EDEFAULT);
				return;
			case Hbm30Package.MAP__OUTER_JOIN:
				unsetOuterJoin();
				return;
			case Hbm30Package.MAP__PERSISTER:
				setPersister(PERSISTER_EDEFAULT);
				return;
			case Hbm30Package.MAP__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case Hbm30Package.MAP__SORT:
				unsetSort();
				return;
			case Hbm30Package.MAP__SUBSELECT1:
				setSubselect1(SUBSELECT1_EDEFAULT);
				return;
			case Hbm30Package.MAP__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case Hbm30Package.MAP__WHERE:
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
			case Hbm30Package.MAP__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.MAP__SUBSELECT:
				return SUBSELECT_EDEFAULT == null ? subselect != null : !SUBSELECT_EDEFAULT.equals(subselect);
			case Hbm30Package.MAP__CACHE:
				return cache != null;
			case Hbm30Package.MAP__SYNCHRONIZE:
				return synchronize != null && !synchronize.isEmpty();
			case Hbm30Package.MAP__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.MAP__KEY:
				return key != null;
			case Hbm30Package.MAP__MAP_KEY:
				return mapKey != null;
			case Hbm30Package.MAP__COMPOSITE_MAP_KEY:
				return compositeMapKey != null;
			case Hbm30Package.MAP__MAP_KEY_MANY_TO_MANY:
				return mapKeyManyToMany != null;
			case Hbm30Package.MAP__INDEX:
				return index != null;
			case Hbm30Package.MAP__COMPOSITE_INDEX:
				return compositeIndex != null;
			case Hbm30Package.MAP__INDEX_MANY_TO_MANY:
				return indexManyToMany != null;
			case Hbm30Package.MAP__INDEX_MANY_TO_ANY:
				return indexManyToAny != null;
			case Hbm30Package.MAP__ELEMENT:
				return element != null;
			case Hbm30Package.MAP__ONE_TO_MANY:
				return oneToMany != null;
			case Hbm30Package.MAP__MANY_TO_MANY:
				return manyToMany != null;
			case Hbm30Package.MAP__COMPOSITE_ELEMENT:
				return compositeElement != null;
			case Hbm30Package.MAP__MANY_TO_ANY:
				return manyToAny != null;
			case Hbm30Package.MAP__LOADER:
				return loader != null;
			case Hbm30Package.MAP__SQL_INSERT:
				return sqlInsert != null;
			case Hbm30Package.MAP__SQL_UPDATE:
				return sqlUpdate != null;
			case Hbm30Package.MAP__SQL_DELETE:
				return sqlDelete != null;
			case Hbm30Package.MAP__SQL_DELETE_ALL:
				return sqlDeleteAll != null;
			case Hbm30Package.MAP__FILTER:
				return filter != null && !filter.isEmpty();
			case Hbm30Package.MAP__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.MAP__BATCH_SIZE:
				return BATCH_SIZE_EDEFAULT == null ? batchSize != null : !BATCH_SIZE_EDEFAULT.equals(batchSize);
			case Hbm30Package.MAP__CASCADE:
				return CASCADE_EDEFAULT == null ? cascade != null : !CASCADE_EDEFAULT.equals(cascade);
			case Hbm30Package.MAP__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case Hbm30Package.MAP__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
			case Hbm30Package.MAP__COLLECTION_TYPE:
				return COLLECTION_TYPE_EDEFAULT == null ? collectionType != null : !COLLECTION_TYPE_EDEFAULT.equals(collectionType);
			case Hbm30Package.MAP__EMBED_XML:
				return isSetEmbedXml();
			case Hbm30Package.MAP__FETCH:
				return isSetFetch();
			case Hbm30Package.MAP__INVERSE:
				return isSetInverse();
			case Hbm30Package.MAP__LAZY:
				return isSetLazy();
			case Hbm30Package.MAP__MUTABLE:
				return isSetMutable();
			case Hbm30Package.MAP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.MAP__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.MAP__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.MAP__ORDER_BY:
				return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
			case Hbm30Package.MAP__OUTER_JOIN:
				return isSetOuterJoin();
			case Hbm30Package.MAP__PERSISTER:
				return PERSISTER_EDEFAULT == null ? persister != null : !PERSISTER_EDEFAULT.equals(persister);
			case Hbm30Package.MAP__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case Hbm30Package.MAP__SORT:
				return isSetSort();
			case Hbm30Package.MAP__SUBSELECT1:
				return SUBSELECT1_EDEFAULT == null ? subselect1 != null : !SUBSELECT1_EDEFAULT.equals(subselect1);
			case Hbm30Package.MAP__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case Hbm30Package.MAP__WHERE:
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
		result.append(", access: ");
		result.append(access);
		result.append(", batchSize: ");
		result.append(batchSize);
		result.append(", cascade: ");
		result.append(cascade);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", check: ");
		result.append(check);
		result.append(", collectionType: ");
		result.append(collectionType);
		result.append(", embedXml: ");
		if (embedXmlESet) result.append(embedXml); else result.append("<unset>");
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", inverse: ");
		if (inverseESet) result.append(inverse); else result.append("<unset>");
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
		result.append(", orderBy: ");
		result.append(orderBy);
		result.append(", outerJoin: ");
		if (outerJoinESet) result.append(outerJoin); else result.append("<unset>");
		result.append(", persister: ");
		result.append(persister);
		result.append(", schema: ");
		result.append(schema);
		result.append(", sort: ");
		if (sortESet) result.append(sort); else result.append("<unset>");
		result.append(", subselect1: ");
		result.append(subselect1);
		result.append(", table: ");
		result.append(table);
		result.append(", where: ");
		result.append(where);
		result.append(')');
		return result.toString();
	}

} //MapImpl
