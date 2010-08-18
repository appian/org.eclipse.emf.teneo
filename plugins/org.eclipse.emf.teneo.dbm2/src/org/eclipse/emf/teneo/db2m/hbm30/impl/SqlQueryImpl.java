/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlQueryImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Cachemode;
import org.eclipse.emf.teneo.db2m.hbm30.Flushmode;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.LoadCollection;
import org.eclipse.emf.teneo.db2m.hbm30.QueryParam;
import org.eclipse.emf.teneo.db2m.hbm30.Return;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin;
import org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar;
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;
import org.eclipse.emf.teneo.db2m.hbm30.Synchronize;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getReturnScalar <em>Return Scalar</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getReturnJoin <em>Return Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getLoadCollection <em>Load Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getQueryParam <em>Query Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#isCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getCacheMode <em>Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getCacheRegion <em>Cache Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#isCallable <em>Callable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getFlushMode <em>Flush Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getResultsetRef <em>Resultset Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.SqlQueryImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SqlQueryImpl extends EObjectImpl implements SqlQuery {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
	protected boolean cacheable = CACHEABLE_EDEFAULT;

	/**
	 * This is true if the Cacheable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheableESet;

	/**
	 * The default value of the '{@link #getCacheMode() <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheMode()
	 * @generated
	 * @ordered
	 */
	protected static final Cachemode CACHE_MODE_EDEFAULT = Cachemode.GET;

	/**
	 * The cached value of the '{@link #getCacheMode() <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheMode()
	 * @generated
	 * @ordered
	 */
	protected Cachemode cacheMode = CACHE_MODE_EDEFAULT;

	/**
	 * This is true if the Cache Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheModeESet;

	/**
	 * The default value of the '{@link #getCacheRegion() <em>Cache Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHE_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCacheRegion() <em>Cache Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheRegion()
	 * @generated
	 * @ordered
	 */
	protected String cacheRegion = CACHE_REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallable() <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallable() <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallable()
	 * @generated
	 * @ordered
	 */
	protected boolean callable = CALLABLE_EDEFAULT;

	/**
	 * This is true if the Callable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callableESet;

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
	 * The default value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FETCH_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFetchSize() <em>Fetch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchSize()
	 * @generated
	 * @ordered
	 */
	protected String fetchSize = FETCH_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlushMode() <em>Flush Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushMode()
	 * @generated
	 * @ordered
	 */
	protected static final Flushmode FLUSH_MODE_EDEFAULT = Flushmode.AUTO;

	/**
	 * The cached value of the '{@link #getFlushMode() <em>Flush Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushMode()
	 * @generated
	 * @ordered
	 */
	protected Flushmode flushMode = FLUSH_MODE_EDEFAULT;

	/**
	 * This is true if the Flush Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flushModeESet;

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
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * This is true if the Read Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readOnlyESet;

	/**
	 * The default value of the '{@link #getResultsetRef() <em>Resultset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsetRef()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTSET_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultsetRef() <em>Resultset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsetRef()
	 * @generated
	 * @ordered
	 */
	protected String resultsetRef = RESULTSET_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getSqlQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Hbm30Package.SQL_QUERY__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Hbm30Package.eINSTANCE.getSqlQuery_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnScalar> getReturnScalar() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_ReturnScalar());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Return> getReturn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_Return());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnJoin> getReturnJoin() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_ReturnJoin());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadCollection> getLoadCollection() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_LoadCollection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronize> getSynchronize() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_Synchronize());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParam> getQueryParam() {
		return getGroup().list(Hbm30Package.eINSTANCE.getSqlQuery_QueryParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCacheable() {
		return cacheable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheable(boolean newCacheable) {
		boolean oldCacheable = cacheable;
		cacheable = newCacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__CACHEABLE, oldCacheable, cacheable, !oldCacheableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheable() {
		boolean oldCacheable = cacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheable = CACHEABLE_EDEFAULT;
		cacheableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_QUERY__CACHEABLE, oldCacheable, CACHEABLE_EDEFAULT, oldCacheableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheable() {
		return cacheableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cachemode getCacheMode() {
		return cacheMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheMode(Cachemode newCacheMode) {
		Cachemode oldCacheMode = cacheMode;
		cacheMode = newCacheMode == null ? CACHE_MODE_EDEFAULT : newCacheMode;
		boolean oldCacheModeESet = cacheModeESet;
		cacheModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__CACHE_MODE, oldCacheMode, cacheMode, !oldCacheModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheMode() {
		Cachemode oldCacheMode = cacheMode;
		boolean oldCacheModeESet = cacheModeESet;
		cacheMode = CACHE_MODE_EDEFAULT;
		cacheModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_QUERY__CACHE_MODE, oldCacheMode, CACHE_MODE_EDEFAULT, oldCacheModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheMode() {
		return cacheModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCacheRegion() {
		return cacheRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheRegion(String newCacheRegion) {
		String oldCacheRegion = cacheRegion;
		cacheRegion = newCacheRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__CACHE_REGION, oldCacheRegion, cacheRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallable() {
		return callable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallable(boolean newCallable) {
		boolean oldCallable = callable;
		callable = newCallable;
		boolean oldCallableESet = callableESet;
		callableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__CALLABLE, oldCallable, callable, !oldCallableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallable() {
		boolean oldCallable = callable;
		boolean oldCallableESet = callableESet;
		callable = CALLABLE_EDEFAULT;
		callableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_QUERY__CALLABLE, oldCallable, CALLABLE_EDEFAULT, oldCallableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallable() {
		return callableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFetchSize() {
		return fetchSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchSize(String newFetchSize) {
		String oldFetchSize = fetchSize;
		fetchSize = newFetchSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__FETCH_SIZE, oldFetchSize, fetchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flushmode getFlushMode() {
		return flushMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlushMode(Flushmode newFlushMode) {
		Flushmode oldFlushMode = flushMode;
		flushMode = newFlushMode == null ? FLUSH_MODE_EDEFAULT : newFlushMode;
		boolean oldFlushModeESet = flushModeESet;
		flushModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__FLUSH_MODE, oldFlushMode, flushMode, !oldFlushModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlushMode() {
		Flushmode oldFlushMode = flushMode;
		boolean oldFlushModeESet = flushModeESet;
		flushMode = FLUSH_MODE_EDEFAULT;
		flushModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_QUERY__FLUSH_MODE, oldFlushMode, FLUSH_MODE_EDEFAULT, oldFlushModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlushMode() {
		return flushModeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadOnly() {
		boolean oldReadOnly = readOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnly = READ_ONLY_EDEFAULT;
		readOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.SQL_QUERY__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadOnly() {
		return readOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultsetRef() {
		return resultsetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsetRef(String newResultsetRef) {
		String oldResultsetRef = resultsetRef;
		resultsetRef = newResultsetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__RESULTSET_REF, oldResultsetRef, resultsetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.SQL_QUERY__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.SQL_QUERY__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__RETURN_SCALAR:
				return ((InternalEList<?>)getReturnScalar()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__RETURN:
				return ((InternalEList<?>)getReturn()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__RETURN_JOIN:
				return ((InternalEList<?>)getReturnJoin()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__LOAD_COLLECTION:
				return ((InternalEList<?>)getLoadCollection()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__SYNCHRONIZE:
				return ((InternalEList<?>)getSynchronize()).basicRemove(otherEnd, msgs);
			case Hbm30Package.SQL_QUERY__QUERY_PARAM:
				return ((InternalEList<?>)getQueryParam()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.SQL_QUERY__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Hbm30Package.SQL_QUERY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.SQL_QUERY__RETURN_SCALAR:
				return getReturnScalar();
			case Hbm30Package.SQL_QUERY__RETURN:
				return getReturn();
			case Hbm30Package.SQL_QUERY__RETURN_JOIN:
				return getReturnJoin();
			case Hbm30Package.SQL_QUERY__LOAD_COLLECTION:
				return getLoadCollection();
			case Hbm30Package.SQL_QUERY__SYNCHRONIZE:
				return getSynchronize();
			case Hbm30Package.SQL_QUERY__QUERY_PARAM:
				return getQueryParam();
			case Hbm30Package.SQL_QUERY__CACHEABLE:
				return isCacheable();
			case Hbm30Package.SQL_QUERY__CACHE_MODE:
				return getCacheMode();
			case Hbm30Package.SQL_QUERY__CACHE_REGION:
				return getCacheRegion();
			case Hbm30Package.SQL_QUERY__CALLABLE:
				return isCallable();
			case Hbm30Package.SQL_QUERY__COMMENT:
				return getComment();
			case Hbm30Package.SQL_QUERY__FETCH_SIZE:
				return getFetchSize();
			case Hbm30Package.SQL_QUERY__FLUSH_MODE:
				return getFlushMode();
			case Hbm30Package.SQL_QUERY__NAME:
				return getName();
			case Hbm30Package.SQL_QUERY__READ_ONLY:
				return isReadOnly();
			case Hbm30Package.SQL_QUERY__RESULTSET_REF:
				return getResultsetRef();
			case Hbm30Package.SQL_QUERY__TIMEOUT:
				return getTimeout();
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
			case Hbm30Package.SQL_QUERY__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Hbm30Package.SQL_QUERY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.SQL_QUERY__RETURN_SCALAR:
				getReturnScalar().clear();
				getReturnScalar().addAll((Collection<? extends ReturnScalar>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends Return>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__RETURN_JOIN:
				getReturnJoin().clear();
				getReturnJoin().addAll((Collection<? extends ReturnJoin>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__LOAD_COLLECTION:
				getLoadCollection().clear();
				getLoadCollection().addAll((Collection<? extends LoadCollection>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__SYNCHRONIZE:
				getSynchronize().clear();
				getSynchronize().addAll((Collection<? extends Synchronize>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__QUERY_PARAM:
				getQueryParam().clear();
				getQueryParam().addAll((Collection<? extends QueryParam>)newValue);
				return;
			case Hbm30Package.SQL_QUERY__CACHEABLE:
				setCacheable((Boolean)newValue);
				return;
			case Hbm30Package.SQL_QUERY__CACHE_MODE:
				setCacheMode((Cachemode)newValue);
				return;
			case Hbm30Package.SQL_QUERY__CACHE_REGION:
				setCacheRegion((String)newValue);
				return;
			case Hbm30Package.SQL_QUERY__CALLABLE:
				setCallable((Boolean)newValue);
				return;
			case Hbm30Package.SQL_QUERY__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.SQL_QUERY__FETCH_SIZE:
				setFetchSize((String)newValue);
				return;
			case Hbm30Package.SQL_QUERY__FLUSH_MODE:
				setFlushMode((Flushmode)newValue);
				return;
			case Hbm30Package.SQL_QUERY__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.SQL_QUERY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case Hbm30Package.SQL_QUERY__RESULTSET_REF:
				setResultsetRef((String)newValue);
				return;
			case Hbm30Package.SQL_QUERY__TIMEOUT:
				setTimeout((String)newValue);
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
			case Hbm30Package.SQL_QUERY__MIXED:
				getMixed().clear();
				return;
			case Hbm30Package.SQL_QUERY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.SQL_QUERY__RETURN_SCALAR:
				getReturnScalar().clear();
				return;
			case Hbm30Package.SQL_QUERY__RETURN:
				getReturn().clear();
				return;
			case Hbm30Package.SQL_QUERY__RETURN_JOIN:
				getReturnJoin().clear();
				return;
			case Hbm30Package.SQL_QUERY__LOAD_COLLECTION:
				getLoadCollection().clear();
				return;
			case Hbm30Package.SQL_QUERY__SYNCHRONIZE:
				getSynchronize().clear();
				return;
			case Hbm30Package.SQL_QUERY__QUERY_PARAM:
				getQueryParam().clear();
				return;
			case Hbm30Package.SQL_QUERY__CACHEABLE:
				unsetCacheable();
				return;
			case Hbm30Package.SQL_QUERY__CACHE_MODE:
				unsetCacheMode();
				return;
			case Hbm30Package.SQL_QUERY__CACHE_REGION:
				setCacheRegion(CACHE_REGION_EDEFAULT);
				return;
			case Hbm30Package.SQL_QUERY__CALLABLE:
				unsetCallable();
				return;
			case Hbm30Package.SQL_QUERY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.SQL_QUERY__FETCH_SIZE:
				setFetchSize(FETCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.SQL_QUERY__FLUSH_MODE:
				unsetFlushMode();
				return;
			case Hbm30Package.SQL_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.SQL_QUERY__READ_ONLY:
				unsetReadOnly();
				return;
			case Hbm30Package.SQL_QUERY__RESULTSET_REF:
				setResultsetRef(RESULTSET_REF_EDEFAULT);
				return;
			case Hbm30Package.SQL_QUERY__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case Hbm30Package.SQL_QUERY__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Hbm30Package.SQL_QUERY__GROUP:
				return !getGroup().isEmpty();
			case Hbm30Package.SQL_QUERY__RETURN_SCALAR:
				return !getReturnScalar().isEmpty();
			case Hbm30Package.SQL_QUERY__RETURN:
				return !getReturn().isEmpty();
			case Hbm30Package.SQL_QUERY__RETURN_JOIN:
				return !getReturnJoin().isEmpty();
			case Hbm30Package.SQL_QUERY__LOAD_COLLECTION:
				return !getLoadCollection().isEmpty();
			case Hbm30Package.SQL_QUERY__SYNCHRONIZE:
				return !getSynchronize().isEmpty();
			case Hbm30Package.SQL_QUERY__QUERY_PARAM:
				return !getQueryParam().isEmpty();
			case Hbm30Package.SQL_QUERY__CACHEABLE:
				return isSetCacheable();
			case Hbm30Package.SQL_QUERY__CACHE_MODE:
				return isSetCacheMode();
			case Hbm30Package.SQL_QUERY__CACHE_REGION:
				return CACHE_REGION_EDEFAULT == null ? cacheRegion != null : !CACHE_REGION_EDEFAULT.equals(cacheRegion);
			case Hbm30Package.SQL_QUERY__CALLABLE:
				return isSetCallable();
			case Hbm30Package.SQL_QUERY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.SQL_QUERY__FETCH_SIZE:
				return FETCH_SIZE_EDEFAULT == null ? fetchSize != null : !FETCH_SIZE_EDEFAULT.equals(fetchSize);
			case Hbm30Package.SQL_QUERY__FLUSH_MODE:
				return isSetFlushMode();
			case Hbm30Package.SQL_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.SQL_QUERY__READ_ONLY:
				return isSetReadOnly();
			case Hbm30Package.SQL_QUERY__RESULTSET_REF:
				return RESULTSET_REF_EDEFAULT == null ? resultsetRef != null : !RESULTSET_REF_EDEFAULT.equals(resultsetRef);
			case Hbm30Package.SQL_QUERY__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", cacheable: ");
		if (cacheableESet) result.append(cacheable); else result.append("<unset>");
		result.append(", cacheMode: ");
		if (cacheModeESet) result.append(cacheMode); else result.append("<unset>");
		result.append(", cacheRegion: ");
		result.append(cacheRegion);
		result.append(", callable: ");
		if (callableESet) result.append(callable); else result.append("<unset>");
		result.append(", comment: ");
		result.append(comment);
		result.append(", fetchSize: ");
		result.append(fetchSize);
		result.append(", flushMode: ");
		if (flushModeESet) result.append(flushMode); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", readOnly: ");
		if (readOnlyESet) result.append(readOnly); else result.append("<unset>");
		result.append(", resultsetRef: ");
		result.append(resultsetRef);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //SqlQueryImpl
