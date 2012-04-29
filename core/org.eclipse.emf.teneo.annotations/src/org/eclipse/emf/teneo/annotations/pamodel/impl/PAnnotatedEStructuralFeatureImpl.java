/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeatureImpl.java,v 1.17 2009/12/13 10:14:22 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.CollectionTable;
import org.eclipse.emf.teneo.annotations.pannotation.ElementCollection;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.ForeignKey;
import org.eclipse.emf.teneo.annotations.pannotation.ListIndexColumn;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PAnnotated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getPaEClass <em>Pa EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getModelEStructuralFeature <em>Model EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getListIndexColumn <em>List Index Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getCollectionTable <em>Collection Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getElementCollection <em>Element Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PAnnotatedEStructuralFeatureImpl extends PAnnotatedETypedElementImpl implements
		PAnnotatedEStructuralFeature {
	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected ForeignKey foreignKey;

	/**
	 * The cached value of the '{@link #getListIndexColumn() <em>List Index Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListIndexColumn()
	 * @generated
	 * @ordered
	 */
	protected ListIndexColumn listIndexColumn;

	/**
	 * The cached value of the '{@link #getCollectionTable() <em>Collection Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionTable()
	 * @generated
	 * @ordered
	 */
	protected CollectionTable collectionTable;

	/**
	 * The cached value of the '{@link #getElementCollection() <em>Element Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCollection()
	 * @generated
	 * @ordered
	 */
	protected ElementCollection elementCollection;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEClass getPaEClass() {
		if (eContainerFeatureID() != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS) return null;
		return (PAnnotatedEClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaEClass(PAnnotatedEClass newPaEClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPaEClass, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaEClass(PAnnotatedEClass newPaEClass) {
		if (newPaEClass != eInternalContainer() || (eContainerFeatureID() != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS && newPaEClass != null)) {
			if (EcoreUtil.isAncestor(this, newPaEClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaEClass != null)
				msgs = ((InternalEObject)newPaEClass).eInverseAdd(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
			msgs = basicSetPaEClass(newPaEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS, newPaEClass, newPaEClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getModelEStructuralFeature() {
		EStructuralFeature modelEStructuralFeature = basicGetModelEStructuralFeature();
		return modelEStructuralFeature != null && modelEStructuralFeature.eIsProxy() ? (EStructuralFeature)eResolveProxy((InternalEObject)modelEStructuralFeature) : modelEStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EStructuralFeature basicGetModelEStructuralFeature() {
		return (EStructuralFeature) getModelElement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey getForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKey(ForeignKey newForeignKey, NotificationChain msgs) {
		ForeignKey oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY, oldForeignKey, newForeignKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(ForeignKey newForeignKey) {
		if (newForeignKey != foreignKey) {
			NotificationChain msgs = null;
			if (foreignKey != null)
				msgs = ((InternalEObject)foreignKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY, null, msgs);
			if (newForeignKey != null)
				msgs = ((InternalEObject)newForeignKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY, null, msgs);
			msgs = basicSetForeignKey(newForeignKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY, newForeignKey, newForeignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListIndexColumn getListIndexColumn() {
		return listIndexColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListIndexColumn(ListIndexColumn newListIndexColumn, NotificationChain msgs) {
		ListIndexColumn oldListIndexColumn = listIndexColumn;
		listIndexColumn = newListIndexColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN, oldListIndexColumn, newListIndexColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListIndexColumn(ListIndexColumn newListIndexColumn) {
		if (newListIndexColumn != listIndexColumn) {
			NotificationChain msgs = null;
			if (listIndexColumn != null)
				msgs = ((InternalEObject)listIndexColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN, null, msgs);
			if (newListIndexColumn != null)
				msgs = ((InternalEObject)newListIndexColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN, null, msgs);
			msgs = basicSetListIndexColumn(newListIndexColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN, newListIndexColumn, newListIndexColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTable getCollectionTable() {
		return collectionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectionTable(CollectionTable newCollectionTable, NotificationChain msgs) {
		CollectionTable oldCollectionTable = collectionTable;
		collectionTable = newCollectionTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE, oldCollectionTable, newCollectionTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionTable(CollectionTable newCollectionTable) {
		if (newCollectionTable != collectionTable) {
			NotificationChain msgs = null;
			if (collectionTable != null)
				msgs = ((InternalEObject)collectionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE, null, msgs);
			if (newCollectionTable != null)
				msgs = ((InternalEObject)newCollectionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE, null, msgs);
			msgs = basicSetCollectionTable(newCollectionTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE, newCollectionTable, newCollectionTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCollection getElementCollection() {
		return elementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementCollection(ElementCollection newElementCollection, NotificationChain msgs) {
		ElementCollection oldElementCollection = elementCollection;
		elementCollection = newElementCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION, oldElementCollection, newElementCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementCollection(ElementCollection newElementCollection) {
		if (newElementCollection != elementCollection) {
			NotificationChain msgs = null;
			if (elementCollection != null)
				msgs = ((InternalEObject)elementCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION, null, msgs);
			if (newElementCollection != null)
				msgs = ((InternalEObject)newElementCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION, null, msgs);
			msgs = basicSetElementCollection(newElementCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION, newElementCollection, newElementCollection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPaEClass((PAnnotatedEClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return basicSetPaEClass(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY:
				return basicSetForeignKey(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN:
				return basicSetListIndexColumn(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE:
				return basicSetCollectionTable(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION:
				return basicSetElementCollection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return eInternalContainer().eInverseRemove(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__MODEL_ESTRUCTURAL_FEATURE:
				if (resolve) return getModelEStructuralFeature();
				return basicGetModelEStructuralFeature();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY:
				return getForeignKey();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN:
				return getListIndexColumn();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE:
				return getCollectionTable();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION:
				return getElementCollection();
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY:
				setForeignKey((ForeignKey)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN:
				setListIndexColumn((ListIndexColumn)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE:
				setCollectionTable((CollectionTable)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION:
				setElementCollection((ElementCollection)newValue);
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY:
				setForeignKey((ForeignKey)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN:
				setListIndexColumn((ListIndexColumn)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE:
				setCollectionTable((CollectionTable)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION:
				setElementCollection((ElementCollection)null);
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__MODEL_ESTRUCTURAL_FEATURE:
				return basicGetModelEStructuralFeature() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__FOREIGN_KEY:
				return foreignKey != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__LIST_INDEX_COLUMN:
				return listIndexColumn != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLLECTION_TABLE:
				return collectionTable != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ELEMENT_COLLECTION:
				return elementCollection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc }
	 */
	public PAnnotatedModel getPaModel() {
		PAnnotatedEClass paClass = getPaEClass();
		return paClass != null ? paClass.getPaModel() : null;
	}

	/** Returns the column annotation */
	@Override
	public Column getColumn() {
		return column;
	}

} // PAnnotatedEStructuralFeatureImpl
