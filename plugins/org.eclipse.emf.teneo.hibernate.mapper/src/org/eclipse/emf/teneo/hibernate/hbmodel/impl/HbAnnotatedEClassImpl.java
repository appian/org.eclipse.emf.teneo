/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEClassImpl.java,v 1.7 2007/03/18 19:19:44 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEClass;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hb Annotated EClass</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbCache <em>Hb Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbOnDelete <em>Hb On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEClassImpl#getHbWhere <em>Hb Where</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HbAnnotatedEClassImpl extends PAnnotatedEClassImpl implements HbAnnotatedEClass {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * The cached value of the '{@link #getHbCache() <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbCache()
	 * @generated
	 * @ordered
	 */
	protected Cache hbCache = null;

	/**
	 * The cached value of the '{@link #getHbOnDelete() <em>Hb On Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbOnDelete()
	 * @generated
	 * @ordered
	 */
	protected OnDelete hbOnDelete = null;

	/**
	 * The cached value of the '{@link #getHbWhere() <em>Hb Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbWhere()
	 * @generated
	 * @ordered
	 */
	protected Where hbWhere = null;

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
		return HbModelPackage.Literals.HB_ANNOTATED_ECLASS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, oldHbCache, newHbCache);
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
				msgs = ((InternalEObject)hbCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, null, msgs);
			if (newHbCache != null)
				msgs = ((InternalEObject)newHbCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, null, msgs);
			msgs = basicSetHbCache(newHbCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE, newHbCache, newHbCache));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, oldHbWhere, newHbWhere);
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
				msgs = ((InternalEObject)hbWhere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, null, msgs);
			if (newHbWhere != null)
				msgs = ((InternalEObject)newHbWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, null, msgs);
			msgs = basicSetHbWhere(newHbWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE, newHbWhere, newHbWhere));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return basicSetHbCache(null, msgs);
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
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
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return getHbCache();
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				if (resolve) return getHbOnDelete();
				return basicGetHbOnDelete();
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				return getHbWhere();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				setHbCache((Cache)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				setHbOnDelete((OnDelete)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				setHbWhere((Where)newValue);
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
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				setHbCache((Cache)null);
				return;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				setHbOnDelete((OnDelete)null);
				return;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				setHbWhere((Where)null);
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
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_CACHE:
				return hbCache != null;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_ON_DELETE:
				return hbOnDelete != null;
			case HbModelPackage.HB_ANNOTATED_ECLASS__HB_WHERE:
				return hbWhere != null;
		}
		return super.eIsSet(featureID);
	}

} // HbAnnotatedEClassImpl
