/**
 * <copyright>
 * </copyright>
 *
 * $Id: HbAnnotatedEReferenceImpl.java,v 1.11 2008/06/29 14:23:05 mtaal Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cache;
import org.eclipse.emf.teneo.hibernate.hbannotation.Cascade;
import org.eclipse.emf.teneo.hibernate.hbannotation.CollectionOfElements;
import org.eclipse.emf.teneo.hibernate.hbannotation.Fetch;
import org.eclipse.emf.teneo.hibernate.hbannotation.Filter;
import org.eclipse.emf.teneo.hibernate.hbannotation.IdBag;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbannotation.MapKey;
import org.eclipse.emf.teneo.hibernate.hbannotation.NaturalId;
import org.eclipse.emf.teneo.hibernate.hbannotation.OnDelete;
import org.eclipse.emf.teneo.hibernate.hbannotation.Where;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEModelElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedETypeElement;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbmodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hb Annotated EReference</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbWhere <em>Hb Where</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCollectionOfElements <em>Hb Collection Of Elements</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbMapKey <em>Hb Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbColumns <em>Hb Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCascade <em>Hb Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbIdBag <em>Hb Id Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbIndex <em>Hb Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbCache <em>Hb Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbFetch <em>Hb Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getHbOnDelete <em>Hb On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbmodel.impl.HbAnnotatedEReferenceImpl#getNaturalId <em>Natural Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HbAnnotatedEReferenceImpl extends PAnnotatedEReferenceImpl implements HbAnnotatedEReference {
	/**
	 * The cached value of the '{@link #getHbWhere() <em>Hb Where</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbWhere()
	 * @generated
	 * @ordered
	 */
	protected Where hbWhere;

	/**
	 * The cached value of the '{@link #getHbCollectionOfElements() <em>Hb Collection Of Elements</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHbCollectionOfElements()
	 * @generated
	 * @ordered
	 */
	protected CollectionOfElements hbCollectionOfElements;

	/**
	 * The cached value of the '{@link #getHbMapKey() <em>Hb Map Key</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbMapKey()
	 * @generated
	 * @ordered
	 */
	protected MapKey hbMapKey;

	/**
	 * The cached value of the '{@link #getHbColumns() <em>Hb Columns</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHbColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> hbColumns;

	/**
	 * The cached value of the '{@link #getHbCascade() <em>Hb Cascade</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHbCascade()
	 * @generated
	 * @ordered
	 */
	protected Cascade hbCascade;

	/**
	 * The cached value of the '{@link #getHbIdBag() <em>Hb Id Bag</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbIdBag()
	 * @generated
	 * @ordered
	 */
	protected IdBag hbIdBag;

	/**
	 * The cached value of the '{@link #getHbIndex() <em>Hb Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbIndex()
	 * @generated
	 * @ordered
	 */
	protected Index hbIndex;

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
	 * The cached value of the '{@link #getHbCache() <em>Hb Cache</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHbCache()
	 * @generated
	 * @ordered
	 */
	protected Cache hbCache;

	/**
	 * The cached value of the '{@link #getHbFetch() <em>Hb Fetch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHbFetch()
	 * @generated
	 * @ordered
	 */
	protected Fetch hbFetch;

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
	 * The cached value of the '{@link #getNaturalId() <em>Natural Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalId()
	 * @generated
	 * @ordered
	 */
	protected NaturalId naturalId;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HbAnnotatedEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbmodelPackage.Literals.HB_ANNOTATED_EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Where getHbWhere() {
		return hbWhere;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbWhere(Where newHbWhere, NotificationChain msgs) {
		Where oldHbWhere = hbWhere;
		hbWhere = newHbWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, oldHbWhere, newHbWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbWhere(Where newHbWhere) {
		if (newHbWhere != hbWhere) {
			NotificationChain msgs = null;
			if (hbWhere != null)
				msgs = ((InternalEObject)hbWhere).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, null, msgs);
			if (newHbWhere != null)
				msgs = ((InternalEObject)newHbWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, null, msgs);
			msgs = basicSetHbWhere(newHbWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE, newHbWhere, newHbWhere));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOfElements getHbCollectionOfElements() {
		return hbCollectionOfElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCollectionOfElements(CollectionOfElements newHbCollectionOfElements, NotificationChain msgs) {
		CollectionOfElements oldHbCollectionOfElements = hbCollectionOfElements;
		hbCollectionOfElements = newHbCollectionOfElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, oldHbCollectionOfElements, newHbCollectionOfElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCollectionOfElements(CollectionOfElements newHbCollectionOfElements) {
		if (newHbCollectionOfElements != hbCollectionOfElements) {
			NotificationChain msgs = null;
			if (hbCollectionOfElements != null)
				msgs = ((InternalEObject)hbCollectionOfElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, null, msgs);
			if (newHbCollectionOfElements != null)
				msgs = ((InternalEObject)newHbCollectionOfElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, null, msgs);
			msgs = basicSetHbCollectionOfElements(newHbCollectionOfElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS, newHbCollectionOfElements, newHbCollectionOfElements));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey getHbMapKey() {
		return hbMapKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbMapKey(MapKey newHbMapKey, NotificationChain msgs) {
		MapKey oldHbMapKey = hbMapKey;
		hbMapKey = newHbMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, oldHbMapKey, newHbMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbMapKey(MapKey newHbMapKey) {
		if (newHbMapKey != hbMapKey) {
			NotificationChain msgs = null;
			if (hbMapKey != null)
				msgs = ((InternalEObject)hbMapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, null, msgs);
			if (newHbMapKey != null)
				msgs = ((InternalEObject)newHbMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, null, msgs);
			msgs = basicSetHbMapKey(newHbMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY, newHbMapKey, newHbMapKey));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getHbColumns() {
		if (hbColumns == null) {
			hbColumns = new EObjectContainmentEList<Column>(Column.class, this, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS);
		}
		return hbColumns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade getHbCascade() {
		return hbCascade;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbCascade(Cascade newHbCascade, NotificationChain msgs) {
		Cascade oldHbCascade = hbCascade;
		hbCascade = newHbCascade;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, oldHbCascade, newHbCascade);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbCascade(Cascade newHbCascade) {
		if (newHbCascade != hbCascade) {
			NotificationChain msgs = null;
			if (hbCascade != null)
				msgs = ((InternalEObject)hbCascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, null, msgs);
			if (newHbCascade != null)
				msgs = ((InternalEObject)newHbCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, null, msgs);
			msgs = basicSetHbCascade(newHbCascade, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE, newHbCascade, newHbCascade));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IdBag getHbIdBag() {
		return hbIdBag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHbIdBag(IdBag newHbIdBag, NotificationChain msgs) {
		IdBag oldHbIdBag = hbIdBag;
		hbIdBag = newHbIdBag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, oldHbIdBag, newHbIdBag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbIdBag(IdBag newHbIdBag) {
		if (newHbIdBag != hbIdBag) {
			NotificationChain msgs = null;
			if (hbIdBag != null)
				msgs = ((InternalEObject)hbIdBag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, null, msgs);
			if (newHbIdBag != null)
				msgs = ((InternalEObject)newHbIdBag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, null, msgs);
			msgs = basicSetHbIdBag(newHbIdBag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG, newHbIdBag, newHbIdBag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index getHbIndex() {
		if (hbIndex != null && hbIndex.eIsProxy()) {
			InternalEObject oldHbIndex = (InternalEObject)hbIndex;
			hbIndex = (Index)eResolveProxy(oldHbIndex);
			if (hbIndex != oldHbIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX, oldHbIndex, hbIndex));
			}
		}
		return hbIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index basicGetHbIndex() {
		return hbIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbIndex(Index newHbIndex) {
		Index oldHbIndex = hbIndex;
		hbIndex = newHbIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX, oldHbIndex, hbIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilter() {
		if (filter == null) {
			filter = new EObjectResolvingEList<Filter>(Filter.class, this, HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER);
		}
		return filter;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, oldHbCache, newHbCache);
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
				msgs = ((InternalEObject)hbCache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, null, msgs);
			if (newHbCache != null)
				msgs = ((InternalEObject)newHbCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, null, msgs);
			msgs = basicSetHbCache(newHbCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE, newHbCache, newHbCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch getHbFetch() {
		if (hbFetch != null && hbFetch.eIsProxy()) {
			InternalEObject oldHbFetch = (InternalEObject)hbFetch;
			hbFetch = (Fetch)eResolveProxy(oldHbFetch);
			if (hbFetch != oldHbFetch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH, oldHbFetch, hbFetch));
			}
		}
		return hbFetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch basicGetHbFetch() {
		return hbFetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHbFetch(Fetch newHbFetch) {
		Fetch oldHbFetch = hbFetch;
		hbFetch = newHbFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH, oldHbFetch, hbFetch));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE, oldHbOnDelete, hbOnDelete));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID, oldNaturalId, newNaturalId);
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
				msgs = ((InternalEObject)naturalId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID, null, msgs);
			if (newNaturalId != null)
				msgs = ((InternalEObject)newNaturalId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID, null, msgs);
			msgs = basicSetNaturalId(newNaturalId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID, newNaturalId, newNaturalId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return basicSetHbWhere(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return basicSetHbCollectionOfElements(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return basicSetHbMapKey(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return ((InternalEList<?>)getHbColumns()).basicRemove(otherEnd, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return basicSetHbCascade(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return basicSetHbIdBag(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return basicSetHbCache(null, msgs);
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID:
				return basicSetNaturalId(null, msgs);
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
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return getHbWhere();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return getHbCollectionOfElements();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return getHbMapKey();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return getHbColumns();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return getHbCascade();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return getHbIdBag();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX:
				if (resolve) return getHbIndex();
				return basicGetHbIndex();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER:
				return getFilter();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return getHbCache();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH:
				if (resolve) return getHbFetch();
				return basicGetHbFetch();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE:
				if (resolve) return getHbOnDelete();
				return basicGetHbOnDelete();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID:
				return getNaturalId();
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
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				setHbWhere((Where)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				setHbCollectionOfElements((CollectionOfElements)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				setHbMapKey((MapKey)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				getHbColumns().clear();
				getHbColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				setHbCascade((Cascade)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				setHbIdBag((IdBag)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX:
				setHbIndex((Index)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Filter>)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				setHbCache((Cache)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH:
				setHbFetch((Fetch)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE:
				setHbOnDelete((OnDelete)newValue);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID:
				setNaturalId((NaturalId)newValue);
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
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				setHbWhere((Where)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				setHbCollectionOfElements((CollectionOfElements)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				setHbMapKey((MapKey)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				getHbColumns().clear();
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				setHbCascade((Cascade)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				setHbIdBag((IdBag)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX:
				setHbIndex((Index)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER:
				getFilter().clear();
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				setHbCache((Cache)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH:
				setHbFetch((Fetch)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE:
				setHbOnDelete((OnDelete)null);
				return;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID:
				setNaturalId((NaturalId)null);
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
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE:
				return hbWhere != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS:
				return hbCollectionOfElements != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY:
				return hbMapKey != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS:
				return hbColumns != null && !hbColumns.isEmpty();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE:
				return hbCascade != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG:
				return hbIdBag != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX:
				return hbIndex != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER:
				return filter != null && !filter.isEmpty();
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CACHE:
				return hbCache != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_FETCH:
				return hbFetch != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ON_DELETE:
				return hbOnDelete != null;
			case HbmodelPackage.HB_ANNOTATED_EREFERENCE__NATURAL_ID:
				return naturalId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HbAnnotatedEModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HbAnnotatedETypeElement.class) {
			switch (derivedFeatureID) {
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_INDEX;
				case HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER: return HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__FILTER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HbAnnotatedEModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == HbAnnotatedETypeElement.class) {
			switch (baseFeatureID) {
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_WHERE: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_WHERE;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLLECTION_OF_ELEMENTS: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLLECTION_OF_ELEMENTS;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_MAP_KEY: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_MAP_KEY;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_COLUMNS: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_COLUMNS;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_CASCADE: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_CASCADE;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_ID_BAG: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_ID_BAG;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__HB_INDEX: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__HB_INDEX;
				case HbmodelPackage.HB_ANNOTATED_ETYPE_ELEMENT__FILTER: return HbmodelPackage.HB_ANNOTATED_EREFERENCE__FILTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // HbAnnotatedEReferenceImpl
