/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEClassImpl.java,v 1.12 2008/04/23 15:44:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.Filter;
import org.eclipse.emf.teneo.hibernate.hbannotation.FilterDef;
import org.eclipse.emf.teneo.hibernate.hbannotation.NamedQuery;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.Proxy;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hb Annotated EClass</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbCache <em>Hb Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbOnDelete <em>Hb On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbWhere <em>Hb Where</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbProxy <em>Hb Proxy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbNamedQuery <em>Hb Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getFilterDef <em>Filter Def</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HbAnnotatedEClassImpl extends PAnnotatedEClassImpl implements HbAnnotatedEClass {
	/**
	 * The cached value of the '{@link #getHbCache() <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbCache()
	 * @generated
	 * @ordered
	 */
	protected Cache hbCache;

	/**
	 * The cached value of the '{@link #getHbOnDelete() <em>Hb On Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbOnDelete()
	 * @generated
	 * @ordered
	 */
	protected OnDelete hbOnDelete;

	/**
	 * The cached value of the '{@link #getHbWhere() <em>Hb Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbWhere()
	 * @generated
	 * @ordered
	 */
	protected Where hbWhere;

	/**
	 * The cached value of the '{@link #getHbProxy() <em>Hb Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbProxy()
	 * @generated
	 * @ordered
	 */
	protected Proxy hbProxy;

	/**
	 * The cached value of the '{@link #getHbNamedQuery() <em>Hb Named Query</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbNamedQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedQuery> hbNamedQuery;

	/**
	 * The cached value of the '{@link #getFilterDef() <em>Filter Def</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterDef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterDef> filterDef;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HbAnnotatedEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbmodelPackage.Literals.HB_ANNOTATED_ECLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getHbCache() {
		return hbCache;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCache(Cache newHbCache, NotificationChain msgs) {
		Cache oldHbCache = hbCache;
		hbCache = newHbCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, oldHbCache, newHbCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCache(Cache newHbCache) {
		if (newHbCache != hbCache) {
			NotificationChain msgs = null;
			if (hbCache != null)
				msgs = ((InternalEObject)hbCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, null, msgs);
			if (newHbCache != null)
				msgs = ((InternalEObject)newHbCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, null, msgs);
			msgs = basicSetHbCache(newHbCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, newHbCache, newHbCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDelete getHbOnDelete() {
		if (hbOnDelete != null && hbOnDelete.eIsProxy()) {
			InternalEObject oldHbOnDelete = (InternalEObject)hbOnDelete;
			hbOnDelete = (OnDelete)eResolveProxy(oldHbOnDelete);
			if (hbOnDelete != oldHbOnDelete) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
			}
		}
		return hbOnDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnDelete basicGetHbOnDelete() {
		return hbOnDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbOnDelete(OnDelete newHbOnDelete) {
		OnDelete oldHbOnDelete = hbOnDelete;
		hbOnDelete = newHbOnDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getHbWhere() {
		return hbWhere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbWhere(Where newHbWhere, NotificationChain msgs) {
		Where oldHbWhere = hbWhere;
		hbWhere = newHbWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, oldHbWhere, newHbWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbWhere(Where newHbWhere) {
		if (newHbWhere != hbWhere) {
			NotificationChain msgs = null;
			if (hbWhere != null)
				msgs = ((InternalEObject)hbWhere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, null, msgs);
			if (newHbWhere != null)
				msgs = ((InternalEObject)newHbWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, null, msgs);
			msgs = basicSetHbWhere(newHbWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, newHbWhere, newHbWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy getHbProxy() {
		if (hbProxy != null && hbProxy.eIsProxy()) {
			InternalEObject oldHbProxy = (InternalEObject)hbProxy;
			hbProxy = (Proxy)eResolveProxy(oldHbProxy);
			if (hbProxy != oldHbProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY, oldHbProxy, hbProxy));
			}
		}
		return hbProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proxy basicGetHbProxy() {
		return hbProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbProxy(Proxy newHbProxy) {
		Proxy oldHbProxy = hbProxy;
		hbProxy = newHbProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY, oldHbProxy, hbProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedQuery> getHbNamedQuery() {
		if (hbNamedQuery == null) {
			hbNamedQuery = new EObjectResolvingEList<NamedQuery>(NamedQuery.class, this, HbmodelPackage.HB_ANNOTATED_ECLASS__HB_NAMED_QUERY);
		}
		return hbNamedQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDef> getFilterDef() {
		if (filterDef == null) {
			filterDef = new EObjectResolvingEList<FilterDef>(FilterDef.class, this, HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER_DEF);
		}
		return filterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectResolvingEList<Filter>(Filter.class, this, HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return basicSetHbCache(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				return basicSetHbWhere(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return getHbCache();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				if (resolve) return getHbOnDelete();
				return basicGetHbOnDelete();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				return getHbWhere();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY:
				if (resolve) return getHbProxy();
				return basicGetHbProxy();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_NAMED_QUERY:
				return getHbNamedQuery();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER_DEF:
				return getFilterDef();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER:
				return getFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				setHbCache((Cache)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				setHbOnDelete((OnDelete)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				setHbWhere((Where)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY:
				setHbProxy((Proxy)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_NAMED_QUERY:
				getHbNamedQuery().clear();
				getHbNamedQuery().addAll((Collection<? extends NamedQuery>)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER_DEF:
				getFilterDef().clear();
				getFilterDef().addAll((Collection<? extends FilterDef>)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Filter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				setHbCache((Cache)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				setHbOnDelete((OnDelete)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				setHbWhere((Where)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY:
				setHbProxy((Proxy)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_NAMED_QUERY:
				getHbNamedQuery().clear();
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER_DEF:
				getFilterDef().clear();
				return;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER:
				getFilter().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return hbCache != null;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				return hbOnDelete != null;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				return hbWhere != null;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_PROXY:
				return hbProxy != null;
			case HbmodelPackage.HB_ANNOTATED_ECLASS__HB_NAMED_QUERY:
				return hbNamedQuery != null && !hbNamedQuery.isEmpty();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER_DEF:
				return filterDef != null && !filterDef.isEmpty();
			case HbmodelPackage.HB_ANNOTATED_ECLASS__FILTER:
				return filter != null && !filter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // HbAnnotatedEClassImpl
