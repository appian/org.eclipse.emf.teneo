/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEReferenceImpl.java,v 1.3 2006/07/26 12:43:36 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.Embedded;
import org.eclipse.emf.teneo.annotations.pannotation.EmbeddedId;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToMany;
import org.eclipse.emf.teneo.annotations.pannotation.ManyToOne;
import org.eclipse.emf.teneo.annotations.pannotation.MapKey;
import org.eclipse.emf.teneo.annotations.pannotation.OneToOne;
import org.eclipse.emf.teneo.annotations.pannotation.OrderBy;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated EReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getAnnotatedEReference <em>Annotated EReference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getEmbedded <em>Embedded</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getEmbeddedId <em>Embedded Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getManyToMany <em>Many To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEReferenceImpl#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEReferenceImpl extends PAnnotatedEStructuralFeatureImpl implements PAnnotatedEReference {

	/** The logger */
	private static final Log log = LogFactory.getLog(PAnnotatedEReferenceImpl.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getAnnotatedEReference() <em>Annotated EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference annotatedEReference = null;

	/**
	 * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Embedded embedded = null;

	/**
	 * The cached value of the '{@link #getEmbeddedId() <em>Embedded Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedId()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedId embeddedId = null;

	/**
	 * The cached value of the '{@link #getManyToMany() <em>Many To Many</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToMany()
	 * @generated
	 * @ordered
	 */
	protected ManyToMany manyToMany = null;

	/**
	 * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToOne()
	 * @generated
	 * @ordered
	 */
	protected ManyToOne manyToOne = null;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected MapKey mapKey = null;

	/**
	 * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOne()
	 * @generated
	 * @ordered
	 */
	protected OneToOne oneToOne = null;

	/**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
	protected OrderBy orderBy = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKeyJoinColumn primaryKeyJoinColumn = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_EREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotatedEReference() {
		if (annotatedEReference != null && annotatedEReference.eIsProxy()) {
			InternalEObject oldAnnotatedEReference = (InternalEObject)annotatedEReference;
			annotatedEReference = (EReference)eResolveProxy(oldAnnotatedEReference);
			if (annotatedEReference != oldAnnotatedEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE, oldAnnotatedEReference, annotatedEReference));
			}
		}
		return annotatedEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetAnnotatedEReference() {
		return annotatedEReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnnotatedEReference(EReference newAnnotatedEReference) {
		EReference oldAnnotatedEReference = annotatedEReference;
		annotatedEReference = newAnnotatedEReference;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE, oldAnnotatedEReference, annotatedEReference));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_ESTRUCTURAL_FEATURE, oldAnnotatedEReference, annotatedEReference));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_ELEMENT, oldAnnotatedEReference, annotatedEReference));
		}
		if (annotatedEReference.getEOpposite() != null && !annotatedEReference.getEOpposite().isMany()) {
			final String logStr = getAnnotatedEReference().getName() + "/" + getAnnotatedEReference().getEContainingClass().getName();
			log.debug("Setting unique is true for " + logStr + " because it not ismany eopposite");
			setUnique(PannotationFactory.eINSTANCE.createUnique());
			getUnique().setValue(true);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedded getEmbedded() {
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbedded(Embedded newEmbedded, NotificationChain msgs) {
		Embedded oldEmbedded = embedded;
		embedded = newEmbedded;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED, oldEmbedded, newEmbedded);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedId getEmbeddedId() {
		return embeddedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedId(EmbeddedId newEmbeddedId, NotificationChain msgs) {
		EmbeddedId oldEmbeddedId = embeddedId;
		embeddedId = newEmbeddedId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__EMBEDDED_ID, oldEmbeddedId, newEmbeddedId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

	public EStructuralFeature basicGetAnnotatedEStructuralFeature() {
		return basicGetAnnotatedEReference();
	}

	public void setAnnotatedEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		setAnnotatedEReference((EReference) newEStructuralFeature);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_MANY, oldManyToMany, newManyToMany);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOne getManyToOne() {
		return manyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManyToOne(ManyToOne newManyToOne, NotificationChain msgs) {
		ManyToOne oldManyToOne = manyToOne;
		manyToOne = newManyToOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MANY_TO_ONE, oldManyToOne, newManyToOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__MAP_KEY, oldMapKey, newMapKey);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOne getOneToOne() {
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToOne(OneToOne newOneToOne, NotificationChain msgs) {
		OneToOne oldOneToOne = oneToOne;
		oneToOne = newOneToOne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ONE_TO_ONE, oldOneToOne, newOneToOne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderBy getOrderBy() {
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderBy(OrderBy newOrderBy, NotificationChain msgs) {
		OrderBy oldOrderBy = orderBy;
		orderBy = newOrderBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, oldOrderBy, newOrderBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderBy(OrderBy newOrderBy) {
		if (newOrderBy != orderBy) {
			NotificationChain msgs = null;
			if (orderBy != null)
				msgs = ((InternalEObject)orderBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, null, msgs);
			if (newOrderBy != null)
				msgs = ((InternalEObject)newOrderBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, null, msgs);
			msgs = basicSetOrderBy(newOrderBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__ORDER_BY, newOrderBy, newOrderBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyJoinColumn getPrimaryKeyJoinColumn() {
		return primaryKeyJoinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyJoinColumn(PrimaryKeyJoinColumn newPrimaryKeyJoinColumn, NotificationChain msgs) {
		PrimaryKeyJoinColumn oldPrimaryKeyJoinColumn = primaryKeyJoinColumn;
		primaryKeyJoinColumn = newPrimaryKeyJoinColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN, oldPrimaryKeyJoinColumn, newPrimaryKeyJoinColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyJoinColumn(PrimaryKeyJoinColumn newPrimaryKeyJoinColumn) {
		if (newPrimaryKeyJoinColumn != primaryKeyJoinColumn) {
			NotificationChain msgs = null;
			if (primaryKeyJoinColumn != null)
				msgs = ((InternalEObject)primaryKeyJoinColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN, null, msgs);
			if (newPrimaryKeyJoinColumn != null)
				msgs = ((InternalEObject)newPrimaryKeyJoinColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN, null, msgs);
			msgs = basicSetPrimaryKeyJoinColumn(newPrimaryKeyJoinColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN, newPrimaryKeyJoinColumn, newPrimaryKeyJoinColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
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
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN:
				return basicSetPrimaryKeyJoinColumn(null, msgs);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE:
				if (resolve) return getAnnotatedEReference();
				return basicGetAnnotatedEReference();
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
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN:
				return getPrimaryKeyJoinColumn();
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
			case PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE:
				setAnnotatedEReference((EReference)newValue);
				return;
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
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN:
				setPrimaryKeyJoinColumn((PrimaryKeyJoinColumn)newValue);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE:
				setAnnotatedEReference((EReference)null);
				return;
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
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN:
				setPrimaryKeyJoinColumn((PrimaryKeyJoinColumn)null);
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
			case PamodelPackage.PANNOTATED_EREFERENCE__ANNOTATED_EREFERENCE:
				return annotatedEReference != null;
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
			case PamodelPackage.PANNOTATED_EREFERENCE__PRIMARY_KEY_JOIN_COLUMN:
				return primaryKeyJoinColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //PAnnotatedEReferenceImpl
