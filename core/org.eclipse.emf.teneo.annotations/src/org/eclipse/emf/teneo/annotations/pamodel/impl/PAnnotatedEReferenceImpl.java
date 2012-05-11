/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEReferenceImpl.java,v 1.17 2009/06/11 04:59:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.External;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.MapKeyClass;
import org.eclipse.emf.teneo.annotations.pannotation.MapKeyColumn;
import org.eclipse.emf.teneo.annotations.pannotation.MapKeyEnumerated;
import org.eclipse.emf.teneo.annotations.pannotation.MapKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.MapKeyTemporal;
import org.eclipse.emf.teneo.annotations.pannotation.MapsId;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.OrderColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>PAnnotated EReference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getModelEReference <em>Model EReference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getAssociationOverrides <em>Association Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getExternal <em>External</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKeyEnumerated <em>Map Key Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKeyJoinColumns <em>Map Key Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKeyTemporal <em>Map Key Temporal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEReferenceImpl extends PAnnotatedEStructuralFeatureImpl
		implements PAnnotatedEReference {

	/**
	 * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embedded embedded;

	/**
	 * The cached value of the '{@link #getEmbeddedId() <em>Embedded Id</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEmbeddedId()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedId embeddedId;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected ManyToMany manyToMany;

	/**
	 * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getManyToOne()
	 * @generated
	 * @ordered
	 */
	protected ManyToOne manyToOne;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected MapKey mapKey;

	/**
	 * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOneToOne()
	 * @generated
	 * @ordered
	 */
	protected OneToOne oneToOne;

	/**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected OrderBy orderBy;

	/**
	 * The cached value of the '{@link #getPrimaryKeyJoinColumns()
	 * <em>Primary Key Join Columns</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPrimaryKeyJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumns;

	/**
	 * The cached value of the '{@link #getAssociationOverrides()
	 * <em>Association Overrides</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssociationOverrides()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationOverride> associationOverrides;

	/**
	 * The cached value of the '{@link #getExternal() <em>External</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExternal()
	 * @generated
	 * @ordered
	 */
	protected External external;

	/**
	 * The cached value of the '{@link #getMapKeyClass() <em>Map Key Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyClass()
	 * @generated
	 * @ordered
	 */
	protected MapKeyClass mapKeyClass;

	/**
	 * The cached value of the '{@link #getMapKeyColumn() <em>Map Key Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected MapKeyColumn mapKeyColumn;

	/**
	 * The cached value of the '{@link #getMapKeyEnumerated() <em>Map Key Enumerated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyEnumerated()
	 * @generated
	 * @ordered
	 */
	protected MapKeyEnumerated mapKeyEnumerated;

	/**
	 * The cached value of the '{@link #getMapKeyJoinColumns() <em>Map Key Join Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<MapKeyJoinColumn> mapKeyJoinColumns;

	/**
	 * The cached value of the '{@link #getMapKeyTemporal() <em>Map Key Temporal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKeyTemporal()
	 * @generated
	 * @ordered
	 */
	protected MapKeyTemporal mapKeyTemporal;

	/** The pannotated eclass to which the reference is pointing */
	private PAnnotatedEClass areferenceType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEReferenceImpl() {
		super();
	}

	/** Returns the eclass to which the reference is pointing */
	public EClass getEReferenceType() {
		return getModelEReference().getEReferenceType();
	}

	/** Returns the annotated class to which the reference is pointing */
	public PAnnotatedEClass getAReferenceType() {
		if (areferenceType == null) {
			areferenceType = getPaModel().getPAnnotated(getEReferenceType());
		}
		return areferenceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelEReference() {
		EReference modelEReference = basicGetModelEReference();
		return modelEReference != null && modelEReference.eIsProxy() ? (EReference)eResolveProxy((InternalEObject)modelEReference) : modelEReference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EReference basicGetModelEReference() {
		return (EReference) getModelElement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Embedded getEmbedded() {
		return embedded;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbedded(Embedded newEmbedded,
			NotificationChain msgs) {
		Embedded oldEmbedded = embedded;
		embedded = newEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED, oldEmbedded, newEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded(Embedded newEmbedded) {
		if (newEmbedded != embedded) {
			NotificationChain msgs = null;
			if (embedded != null)
				msgs = ((InternalEObject)embedded).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED, null, msgs);
			if (newEmbedded != null)
				msgs = ((InternalEObject)newEmbedded).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED, null, msgs);
			msgs = basicSetEmbedded(newEmbedded, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED, newEmbedded, newEmbedded));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedId getEmbeddedId() {
		return embeddedId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedId(EmbeddedId newEmbeddedId,
			NotificationChain msgs) {
		EmbeddedId oldEmbeddedId = embeddedId;
		embeddedId = newEmbeddedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID, oldEmbeddedId, newEmbeddedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedId(EmbeddedId newEmbeddedId) {
		if (newEmbeddedId != embeddedId) {
			NotificationChain msgs = null;
			if (embeddedId != null)
				msgs = ((InternalEObject)embeddedId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID, null, msgs);
			if (newEmbeddedId != null)
				msgs = ((InternalEObject)newEmbeddedId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID, null, msgs);
			msgs = basicSetEmbeddedId(newEmbeddedId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID, newEmbeddedId, newEmbeddedId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToMany getManyToMany() {
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToMany(ManyToMany newManyToMany,
			NotificationChain msgs) {
		ManyToMany oldManyToMany = manyToMany;
		manyToMany = newManyToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY, oldManyToMany, newManyToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setManyToMany(ManyToMany newManyToMany) {
		if (newManyToMany != manyToMany) {
			NotificationChain msgs = null;
			if (manyToMany != null)
				msgs = ((InternalEObject)manyToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY, null, msgs);
			if (newManyToMany != null)
				msgs = ((InternalEObject)newManyToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY, null, msgs);
			msgs = basicSetManyToMany(newManyToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY, newManyToMany, newManyToMany));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOne getManyToOne() {
		return manyToOne;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToOne(ManyToOne newManyToOne,
			NotificationChain msgs) {
		ManyToOne oldManyToOne = manyToOne;
		manyToOne = newManyToOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE, oldManyToOne, newManyToOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setManyToOne(ManyToOne newManyToOne) {
		if (newManyToOne != manyToOne) {
			NotificationChain msgs = null;
			if (manyToOne != null)
				msgs = ((InternalEObject)manyToOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE, null, msgs);
			if (newManyToOne != null)
				msgs = ((InternalEObject)newManyToOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE, null, msgs);
			msgs = basicSetManyToOne(newManyToOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE, newManyToOne, newManyToOne));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MapKey getMapKey() {
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKey(MapKey newMapKey,
			NotificationChain msgs) {
		MapKey oldMapKey = mapKey;
		mapKey = newMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY, oldMapKey, newMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKey(MapKey newMapKey) {
		if (newMapKey != mapKey) {
			NotificationChain msgs = null;
			if (mapKey != null)
				msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY, null, msgs);
			if (newMapKey != null)
				msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY, null, msgs);
			msgs = basicSetMapKey(newMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY, newMapKey, newMapKey));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOne getOneToOne() {
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToOne(OneToOne newOneToOne,
			NotificationChain msgs) {
		OneToOne oldOneToOne = oneToOne;
		oneToOne = newOneToOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE, oldOneToOne, newOneToOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToOne(OneToOne newOneToOne) {
		if (newOneToOne != oneToOne) {
			NotificationChain msgs = null;
			if (oneToOne != null)
				msgs = ((InternalEObject)oneToOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE, null, msgs);
			if (newOneToOne != null)
				msgs = ((InternalEObject)newOneToOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE, null, msgs);
			msgs = basicSetOneToOne(newOneToOne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE, newOneToOne, newOneToOne));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OrderBy getOrderBy() {
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderBy(OrderBy newOrderBy,
			NotificationChain msgs) {
		OrderBy oldOrderBy = orderBy;
		orderBy = newOrderBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, oldOrderBy, newOrderBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> Added behavior that indexed is set to false in
	 * case order by is set <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setOrderBy(OrderBy newOrderBy) {
		if (newOrderBy != orderBy) {
			NotificationChain msgs = null;
			if (orderBy != null) {
				msgs = ((InternalEObject) orderBy)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY,
								null, msgs);
			}
			if (newOrderBy != null) {
				msgs = ((InternalEObject) newOrderBy)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY,
								null, msgs);
			}
			msgs = basicSetOrderBy(newOrderBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, newOrderBy,
					newOrderBy));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumns() {
		if (primaryKeyJoinColumns == null) {
			primaryKeyJoinColumns = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this, PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS);
		}
		return primaryKeyJoinColumns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationOverride> getAssociationOverrides() {
		if (associationOverrides == null) {
			associationOverrides = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES);
		}
		return associationOverrides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public External getExternal() {
		if (external != null && external.eIsProxy()) {
			InternalEObject oldExternal = (InternalEObject)external;
			external = (External)eResolveProxy(oldExternal);
			if (external != oldExternal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL, oldExternal, external));
			}
		}
		return external;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public External basicGetExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(External newExternal) {
		External oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKeyClass getMapKeyClass() {
		return mapKeyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKeyClass(MapKeyClass newMapKeyClass, NotificationChain msgs) {
		MapKeyClass oldMapKeyClass = mapKeyClass;
		mapKeyClass = newMapKeyClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS, oldMapKeyClass, newMapKeyClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKeyClass(MapKeyClass newMapKeyClass) {
		if (newMapKeyClass != mapKeyClass) {
			NotificationChain msgs = null;
			if (mapKeyClass != null)
				msgs = ((InternalEObject)mapKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS, null, msgs);
			if (newMapKeyClass != null)
				msgs = ((InternalEObject)newMapKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS, null, msgs);
			msgs = basicSetMapKeyClass(newMapKeyClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS, newMapKeyClass, newMapKeyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKeyColumn getMapKeyColumn() {
		return mapKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKeyColumn(MapKeyColumn newMapKeyColumn, NotificationChain msgs) {
		MapKeyColumn oldMapKeyColumn = mapKeyColumn;
		mapKeyColumn = newMapKeyColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN, oldMapKeyColumn, newMapKeyColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKeyColumn(MapKeyColumn newMapKeyColumn) {
		if (newMapKeyColumn != mapKeyColumn) {
			NotificationChain msgs = null;
			if (mapKeyColumn != null)
				msgs = ((InternalEObject)mapKeyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN, null, msgs);
			if (newMapKeyColumn != null)
				msgs = ((InternalEObject)newMapKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN, null, msgs);
			msgs = basicSetMapKeyColumn(newMapKeyColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN, newMapKeyColumn, newMapKeyColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKeyEnumerated getMapKeyEnumerated() {
		return mapKeyEnumerated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKeyEnumerated(MapKeyEnumerated newMapKeyEnumerated, NotificationChain msgs) {
		MapKeyEnumerated oldMapKeyEnumerated = mapKeyEnumerated;
		mapKeyEnumerated = newMapKeyEnumerated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED, oldMapKeyEnumerated, newMapKeyEnumerated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKeyEnumerated(MapKeyEnumerated newMapKeyEnumerated) {
		if (newMapKeyEnumerated != mapKeyEnumerated) {
			NotificationChain msgs = null;
			if (mapKeyEnumerated != null)
				msgs = ((InternalEObject)mapKeyEnumerated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED, null, msgs);
			if (newMapKeyEnumerated != null)
				msgs = ((InternalEObject)newMapKeyEnumerated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED, null, msgs);
			msgs = basicSetMapKeyEnumerated(newMapKeyEnumerated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED, newMapKeyEnumerated, newMapKeyEnumerated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapKeyJoinColumn> getMapKeyJoinColumns() {
		if (mapKeyJoinColumns == null) {
			mapKeyJoinColumns = new EObjectContainmentEList<MapKeyJoinColumn>(MapKeyJoinColumn.class, this, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS);
		}
		return mapKeyJoinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapKeyTemporal getMapKeyTemporal() {
		return mapKeyTemporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapKeyTemporal(MapKeyTemporal newMapKeyTemporal, NotificationChain msgs) {
		MapKeyTemporal oldMapKeyTemporal = mapKeyTemporal;
		mapKeyTemporal = newMapKeyTemporal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL, oldMapKeyTemporal, newMapKeyTemporal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapKeyTemporal(MapKeyTemporal newMapKeyTemporal) {
		if (newMapKeyTemporal != mapKeyTemporal) {
			NotificationChain msgs = null;
			if (mapKeyTemporal != null)
				msgs = ((InternalEObject)mapKeyTemporal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL, null, msgs);
			if (newMapKeyTemporal != null)
				msgs = ((InternalEObject)newMapKeyTemporal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL, null, msgs);
			msgs = basicSetMapKeyTemporal(newMapKeyTemporal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL, newMapKeyTemporal, newMapKeyTemporal));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				return basicSetEmbedded(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				return basicSetEmbeddedId(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				return basicSetManyToMany(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				return basicSetManyToOne(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY:
				return basicSetMapKey(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				return basicSetOneToOne(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY:
				return basicSetOrderBy(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS:
				return ((InternalEList<?>)getPrimaryKeyJoinColumns()).basicRemove(otherEnd, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES:
				return ((InternalEList<?>)getAssociationOverrides()).basicRemove(otherEnd, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS:
				return basicSetMapKeyClass(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN:
				return basicSetMapKeyColumn(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED:
				return basicSetMapKeyEnumerated(null, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS:
				return ((InternalEList<?>)getMapKeyJoinColumns()).basicRemove(otherEnd, msgs);
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL:
				return basicSetMapKeyTemporal(null, msgs);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__MODEL_EREFERENCE:
				if (resolve) return getModelEReference();
				return basicGetModelEReference();
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				return getEmbedded();
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				return getEmbeddedId();
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				return getManyToMany();
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				return getManyToOne();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY:
				return getMapKey();
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				return getOneToOne();
			case PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY:
				return getOrderBy();
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS:
				return getPrimaryKeyJoinColumns();
			case PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES:
				return getAssociationOverrides();
			case PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL:
				if (resolve) return getExternal();
				return basicGetExternal();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS:
				return getMapKeyClass();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN:
				return getMapKeyColumn();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED:
				return getMapKeyEnumerated();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS:
				return getMapKeyJoinColumns();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL:
				return getMapKeyTemporal();
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
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				setEmbedded((Embedded)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				setEmbeddedId((EmbeddedId)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				setManyToMany((ManyToMany)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				setManyToOne((ManyToOne)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY:
				setMapKey((MapKey)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				setOneToOne((OneToOne)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY:
				setOrderBy((OrderBy)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS:
				getPrimaryKeyJoinColumns().clear();
				getPrimaryKeyJoinColumns().addAll((Collection<? extends PrimaryKeyJoinColumn>)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES:
				getAssociationOverrides().clear();
				getAssociationOverrides().addAll((Collection<? extends AssociationOverride>)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL:
				setExternal((External)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS:
				setMapKeyClass((MapKeyClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN:
				setMapKeyColumn((MapKeyColumn)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED:
				setMapKeyEnumerated((MapKeyEnumerated)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS:
				getMapKeyJoinColumns().clear();
				getMapKeyJoinColumns().addAll((Collection<? extends MapKeyJoinColumn>)newValue);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL:
				setMapKeyTemporal((MapKeyTemporal)newValue);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				setEmbedded((Embedded)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				setEmbeddedId((EmbeddedId)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				setManyToMany((ManyToMany)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				setManyToOne((ManyToOne)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY:
				setMapKey((MapKey)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				setOneToOne((OneToOne)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY:
				setOrderBy((OrderBy)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS:
				getPrimaryKeyJoinColumns().clear();
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES:
				getAssociationOverrides().clear();
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL:
				setExternal((External)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS:
				setMapKeyClass((MapKeyClass)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN:
				setMapKeyColumn((MapKeyColumn)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED:
				setMapKeyEnumerated((MapKeyEnumerated)null);
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS:
				getMapKeyJoinColumns().clear();
				return;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL:
				setMapKeyTemporal((MapKeyTemporal)null);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__MODEL_EREFERENCE:
				return basicGetModelEReference() != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED:
				return embedded != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID:
				return embeddedId != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY:
				return manyToMany != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE:
				return manyToOne != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY:
				return mapKey != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE:
				return oneToOne != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY:
				return orderBy != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMNS:
				return primaryKeyJoinColumns != null && !primaryKeyJoinColumns.isEmpty();
			case PamodelPackage.PANNOTATED_EREFERENCE__ASSOCIATION_OVERRIDES:
				return associationOverrides != null && !associationOverrides.isEmpty();
			case PamodelPackage.PANNOTATED_EREFERENCE__EXTERNAL:
				return external != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_CLASS:
				return mapKeyClass != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_COLUMN:
				return mapKeyColumn != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_ENUMERATED:
				return mapKeyEnumerated != null;
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_JOIN_COLUMNS:
				return mapKeyJoinColumns != null && !mapKeyJoinColumns.isEmpty();
			case PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY_TEMPORAL:
				return mapKeyTemporal != null;
		}
		return super.eIsSet(featureID);
	}

	/** Refers to an entity or to a concrete class */
	public boolean isRefersToAnEntity() {
		final PAnnotatedEClass aClass = getPaModel().getPAnnotated(
				getModelEReference().getEReferenceType());
		return aClass == null || aClass.isOnlyMapAsEntity(); // aClass can be
																// null when the
		// reference is to the EObject
		// eclass itself
	}
} // PAnnotatedEReferenceImpl
