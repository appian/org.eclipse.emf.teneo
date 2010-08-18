/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Query;
import org.eclipse.emf.teneo.db2m.hbm30.QueryParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getQueryParam <em>Query Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#isCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getCacheMode <em>Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getCacheRegion <em>Cache Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getFlushMode <em>Flush Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.QueryImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
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
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getQuery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Hbm30Package.QUERY__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Hbm30Package.eINSTANCE.getQuery_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParam> getQueryParam() {
		return getGroup().list(Hbm30Package.eINSTANCE.getQuery_QueryParam());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__CACHEABLE, oldCacheable, cacheable, !oldCacheableESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.QUERY__CACHEABLE, oldCacheable, CACHEABLE_EDEFAULT, oldCacheableESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__CACHE_MODE, oldCacheMode, cacheMode, !oldCacheModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.QUERY__CACHE_MODE, oldCacheMode, CACHE_MODE_EDEFAULT, oldCacheModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__CACHE_REGION, oldCacheRegion, cacheRegion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__COMMENT, oldComment, comment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__FETCH_SIZE, oldFetchSize, fetchSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__FLUSH_MODE, oldFlushMode, flushMode, !oldFlushModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.QUERY__FLUSH_MODE, oldFlushMode, FLUSH_MODE_EDEFAULT, oldFlushModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.QUERY__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.QUERY__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.QUERY__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Hbm30Package.QUERY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.QUERY__QUERY_PARAM:
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
			case Hbm30Package.QUERY__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Hbm30Package.QUERY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.QUERY__QUERY_PARAM:
				return getQueryParam();
			case Hbm30Package.QUERY__CACHEABLE:
				return isCacheable();
			case Hbm30Package.QUERY__CACHE_MODE:
				return getCacheMode();
			case Hbm30Package.QUERY__CACHE_REGION:
				return getCacheRegion();
			case Hbm30Package.QUERY__COMMENT:
				return getComment();
			case Hbm30Package.QUERY__FETCH_SIZE:
				return getFetchSize();
			case Hbm30Package.QUERY__FLUSH_MODE:
				return getFlushMode();
			case Hbm30Package.QUERY__NAME:
				return getName();
			case Hbm30Package.QUERY__READ_ONLY:
				return isReadOnly();
			case Hbm30Package.QUERY__TIMEOUT:
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
			case Hbm30Package.QUERY__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Hbm30Package.QUERY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.QUERY__QUERY_PARAM:
				getQueryParam().clear();
				getQueryParam().addAll((Collection<? extends QueryParam>)newValue);
				return;
			case Hbm30Package.QUERY__CACHEABLE:
				setCacheable((Boolean)newValue);
				return;
			case Hbm30Package.QUERY__CACHE_MODE:
				setCacheMode((Cachemode)newValue);
				return;
			case Hbm30Package.QUERY__CACHE_REGION:
				setCacheRegion((String)newValue);
				return;
			case Hbm30Package.QUERY__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.QUERY__FETCH_SIZE:
				setFetchSize((String)newValue);
				return;
			case Hbm30Package.QUERY__FLUSH_MODE:
				setFlushMode((Flushmode)newValue);
				return;
			case Hbm30Package.QUERY__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.QUERY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case Hbm30Package.QUERY__TIMEOUT:
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
			case Hbm30Package.QUERY__MIXED:
				getMixed().clear();
				return;
			case Hbm30Package.QUERY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.QUERY__QUERY_PARAM:
				getQueryParam().clear();
				return;
			case Hbm30Package.QUERY__CACHEABLE:
				unsetCacheable();
				return;
			case Hbm30Package.QUERY__CACHE_MODE:
				unsetCacheMode();
				return;
			case Hbm30Package.QUERY__CACHE_REGION:
				setCacheRegion(CACHE_REGION_EDEFAULT);
				return;
			case Hbm30Package.QUERY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.QUERY__FETCH_SIZE:
				setFetchSize(FETCH_SIZE_EDEFAULT);
				return;
			case Hbm30Package.QUERY__FLUSH_MODE:
				unsetFlushMode();
				return;
			case Hbm30Package.QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.QUERY__READ_ONLY:
				unsetReadOnly();
				return;
			case Hbm30Package.QUERY__TIMEOUT:
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
			case Hbm30Package.QUERY__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Hbm30Package.QUERY__GROUP:
				return !getGroup().isEmpty();
			case Hbm30Package.QUERY__QUERY_PARAM:
				return !getQueryParam().isEmpty();
			case Hbm30Package.QUERY__CACHEABLE:
				return isSetCacheable();
			case Hbm30Package.QUERY__CACHE_MODE:
				return isSetCacheMode();
			case Hbm30Package.QUERY__CACHE_REGION:
				return CACHE_REGION_EDEFAULT == null ? cacheRegion != null : !CACHE_REGION_EDEFAULT.equals(cacheRegion);
			case Hbm30Package.QUERY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.QUERY__FETCH_SIZE:
				return FETCH_SIZE_EDEFAULT == null ? fetchSize != null : !FETCH_SIZE_EDEFAULT.equals(fetchSize);
			case Hbm30Package.QUERY__FLUSH_MODE:
				return isSetFlushMode();
			case Hbm30Package.QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.QUERY__READ_ONLY:
				return isSetReadOnly();
			case Hbm30Package.QUERY__TIMEOUT:
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
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
