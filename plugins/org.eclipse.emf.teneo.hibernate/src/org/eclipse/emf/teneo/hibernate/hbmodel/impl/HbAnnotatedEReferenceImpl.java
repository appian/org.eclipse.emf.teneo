/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEReferenceImpl.java,v 1.7 2006/10/20 13:21:49 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbannotation.MapKey;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hb Annotated EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbWhere <em>Hb Where</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCollectionOfElements <em>Hb Collection Of Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbMapKey <em>Hb Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbColumns <em>Hb Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCascade <em>Hb Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbIdBag <em>Hb Id Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCache <em>Hb Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HbAnnotatedEReferenceImpl extends PAnnotatedEReferenceImpl implements HbAnnotatedEReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

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
	 * The cached value of the '{@link #getHbCollectionOfElements() <em>Hb Collection Of Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbCollectionOfElements()
	 * @generated
	 * @ordered
	 */
	protected CollectionOfElements hbCollectionOfElements = null;

	/**
	 * The cached value of the '{@link #getHbMapKey() <em>Hb Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbMapKey()
	 * @generated
	 * @ordered
	 */
	protected MapKey hbMapKey = null;

	/**
	 * The cached value of the '{@link #getHbColumns() <em>Hb Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbColumns()
	 * @generated
	 * @ordered
	 */
	protected EList hbColumns = null;

	/**
	 * The cached value of the '{@link #getHbCascade() <em>Hb Cascade</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbCascade()
	 * @generated
	 * @ordered
	 */
	protected Cascade hbCascade = null;

	/**
	 * The cached value of the '{@link #getHbIdBag() <em>Hb Id Bag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbIdBag()
	 * @generated
	 * @ordered
	 */
	protected IdBag hbIdBag = null;

	/**
	 * The cached value of the '{@link #getHbCache() <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbCache()
	 * @generated
	 * @ordered
	 */
	protected Cache hbCache = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HbAnnotatedEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HbModelPackage.Literals.HB_ANNOTATED_EREFERENCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, oldHbWhere, newHbWhere);
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
				msgs = ((InternalEObject)hbWhere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, null, msgs);
			if (newHbWhere != null)
				msgs = ((InternalEObject)newHbWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, null, msgs);
			msgs = basicSetHbWhere(newHbWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, newHbWhere, newHbWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOfElements getHbCollectionOfElements() {
		return hbCollectionOfElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCollectionOfElements(CollectionOfElements newHbCollectionOfElements, NotificationChain msgs) {
		CollectionOfElements oldHbCollectionOfElements = hbCollectionOfElements;
		hbCollectionOfElements = newHbCollectionOfElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, oldHbCollectionOfElements, newHbCollectionOfElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCollectionOfElements(CollectionOfElements newHbCollectionOfElements) {
		if (newHbCollectionOfElements != hbCollectionOfElements) {
			NotificationChain msgs = null;
			if (hbCollectionOfElements != null)
				msgs = ((InternalEObject)hbCollectionOfElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, null, msgs);
			if (newHbCollectionOfElements != null)
				msgs = ((InternalEObject)newHbCollectionOfElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, null, msgs);
			msgs = basicSetHbCollectionOfElements(newHbCollectionOfElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, newHbCollectionOfElements, newHbCollectionOfElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey getHbMapKey() {
		return hbMapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbMapKey(MapKey newHbMapKey, NotificationChain msgs) {
		MapKey oldHbMapKey = hbMapKey;
		hbMapKey = newHbMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, oldHbMapKey, newHbMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbMapKey(MapKey newHbMapKey) {
		if (newHbMapKey != hbMapKey) {
			NotificationChain msgs = null;
			if (hbMapKey != null)
				msgs = ((InternalEObject)hbMapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, null, msgs);
			if (newHbMapKey != null)
				msgs = ((InternalEObject)newHbMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, null, msgs);
			msgs = basicSetHbMapKey(newHbMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, newHbMapKey, newHbMapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHbColumns() {
		if (hbColumns == null) {
			hbColumns = new EObjectContainmentEList(Column.class, this, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS);
		}
		return hbColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade getHbCascade() {
		return hbCascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCascade(Cascade newHbCascade, NotificationChain msgs) {
		Cascade oldHbCascade = hbCascade;
		hbCascade = newHbCascade;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, oldHbCascade, newHbCascade);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCascade(Cascade newHbCascade) {
		if (newHbCascade != hbCascade) {
			NotificationChain msgs = null;
			if (hbCascade != null)
				msgs = ((InternalEObject)hbCascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, null, msgs);
			if (newHbCascade != null)
				msgs = ((InternalEObject)newHbCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, null, msgs);
			msgs = basicSetHbCascade(newHbCascade, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, newHbCascade, newHbCascade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdBag getHbIdBag() {
		return hbIdBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbIdBag(IdBag newHbIdBag, NotificationChain msgs) {
		IdBag oldHbIdBag = hbIdBag;
		hbIdBag = newHbIdBag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, oldHbIdBag, newHbIdBag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbIdBag(IdBag newHbIdBag) {
		if (newHbIdBag != hbIdBag) {
			NotificationChain msgs = null;
			if (hbIdBag != null)
				msgs = ((InternalEObject)hbIdBag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, null, msgs);
			if (newHbIdBag != null)
				msgs = ((InternalEObject)newHbIdBag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, null, msgs);
			msgs = basicSetHbIdBag(newHbIdBag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, newHbIdBag, newHbIdBag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getHbCache() {
		return hbCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCache(Cache newHbCache, NotificationChain msgs) {
		Cache oldHbCache = hbCache;
		hbCache = newHbCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, oldHbCache, newHbCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCache(Cache newHbCache) {
		if (newHbCache != hbCache) {
			NotificationChain msgs = null;
			if (hbCache != null)
				msgs = ((InternalEObject)hbCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, null, msgs);
			if (newHbCache != null)
				msgs = ((InternalEObject)newHbCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, null, msgs);
			msgs = basicSetHbCache(newHbCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, newHbCache, newHbCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return basicSetHbWhere(null, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return basicSetHbCollectionOfElements(null, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return basicSetHbMapKey(null, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return ((InternalEList)getHbColumns()).basicRemove(otherEnd, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return basicSetHbCascade(null, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return basicSetHbIdBag(null, msgs);
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return basicSetHbCache(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return getHbWhere();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return getHbCollectionOfElements();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return getHbMapKey();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return getHbColumns();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return getHbCascade();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return getHbIdBag();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return getHbCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				setHbWhere((Where)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				setHbCollectionOfElements((CollectionOfElements)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				setHbMapKey((MapKey)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				getHbColumns().clear();
				getHbColumns().addAll((Collection)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				setHbCascade((Cascade)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				setHbIdBag((IdBag)newValue);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				setHbCache((Cache)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				setHbWhere((Where)null);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				setHbCollectionOfElements((CollectionOfElements)null);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				setHbMapKey((MapKey)null);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				getHbColumns().clear();
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				setHbCascade((Cascade)null);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				setHbIdBag((IdBag)null);
				return;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				setHbCache((Cache)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return hbWhere != null;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return hbCollectionOfElements != null;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return hbMapKey != null;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return hbColumns != null && !hbColumns.isEmpty();
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return hbCascade != null;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return hbIdBag != null;
			case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return hbCache != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == HbAnnotatedEModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HbAnnotatedETypeElement.class) {
			switch (derivedFeatureID) {
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE;
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS;
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY;
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS;
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE;
				case HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG: return HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == HbAnnotatedEModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HbAnnotatedETypeElement.class) {
			switch (baseFeatureID) {
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE;
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS;
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY;
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS;
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE;
				case HbModelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG: return HbModelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //HbAnnotatedEReferenceImpl