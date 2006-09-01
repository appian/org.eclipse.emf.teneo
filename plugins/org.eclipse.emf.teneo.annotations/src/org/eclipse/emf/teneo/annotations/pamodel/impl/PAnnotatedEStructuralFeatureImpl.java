/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeatureImpl.java,v 1.6 2006/09/01 06:56:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationFactory;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Unique;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>PAnnotated EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getPaEClass <em>Pa EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getAnnotatedEStructuralFeature <em>Annotated EStructural Feature</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getAttributeOverrides <em>Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getParsedAttributeOverrides <em>Parsed Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getParsedJoinColumns <em>Parsed Join Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PAnnotatedEStructuralFeatureImpl extends PAnnotatedEModelElementImpl implements
		PAnnotatedEStructuralFeature {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getAttributeOverrides() <em>Attribute Overrides</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributeOverrides()
	 * @generated
	 * @ordered
	 */
	protected AttributeOverrides attributeOverrides = null;

	/**
	 * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJoinTable()
	 * @generated
	 * @ordered
	 */
	protected JoinTable joinTable = null;

	/**
	 * The cached value of the '{@link #getOneToMany() <em>One To Many</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOneToMany()
	 * @generated
	 * @ordered
	 */
	protected OneToMany oneToMany = null;

	/**
	 * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequenceGenerator()
	 * @generated
	 * @ordered
	 */
	protected SequenceGenerator sequenceGenerator = null;

	/**
	 * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTableGenerator()
	 * @generated
	 * @ordered
	 */
	protected TableGenerator tableGenerator = null;

	/**
	 * The cached value of the '{@link #getJoinColumns() <em>Join Columns</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected JoinColumns joinColumns = null;

	/**
	 * The cached value of the '{@link #getIndexed() <em>Indexed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexed()
	 * @generated
	 * @ordered
	 */
	protected Indexed indexed = null;

	/**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected Unique unique = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column = null;

	/**
	 * The cached value of the '{@link #getParsedAttributeOverrides() <em>Parsed Attribute Overrides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedAttributeOverrides()
	 * @generated
	 * @ordered
	 */
	protected EList parsedAttributeOverrides = null;

	/**
	 * The cached value of the '{@link #getParsedJoinColumns() <em>Parsed Join Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsedJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList parsedJoinColumns = null;

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
	protected EClass eStaticClass() {
		return PamodelPackage.Literals.PANNOTATED_ESTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEClass getPaEClass() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS) return null;
		return (PAnnotatedEClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		if (newPaEClass != eInternalContainer() || (eContainerFeatureID != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS && newPaEClass != null)) {
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
	public EStructuralFeature getAnnotatedEStructuralFeature() {
		EStructuralFeature annotatedEStructuralFeature = basicGetAnnotatedEStructuralFeature();
		return annotatedEStructuralFeature != null && annotatedEStructuralFeature.eIsProxy() ? (EStructuralFeature)eResolveProxy((InternalEObject)annotatedEStructuralFeature) : annotatedEStructuralFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract EStructuralFeature basicGetAnnotatedEStructuralFeature();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract void setAnnotatedEStructuralFeature(EStructuralFeature newEStructuralFeature);

	public ENamedElement basicGetAnnotatedElement() {
		return basicGetAnnotatedEStructuralFeature();
	}

	public void setAnnotatedElement(ENamedElement newAnnotatedElement) {
		setAnnotatedEStructuralFeature((EStructuralFeature) newAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOverrides getAttributeOverrides() {
		return attributeOverrides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOverrides(AttributeOverrides newAttributeOverrides, NotificationChain msgs) {
		AttributeOverrides oldAttributeOverrides = attributeOverrides;
		attributeOverrides = newAttributeOverrides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES, oldAttributeOverrides, newAttributeOverrides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOverrides(AttributeOverrides newAttributeOverrides) {
		if (newAttributeOverrides != attributeOverrides) {
			NotificationChain msgs = null;
			if (attributeOverrides != null)
				msgs = ((InternalEObject)attributeOverrides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES, null, msgs);
			if (newAttributeOverrides != null)
				msgs = ((InternalEObject)newAttributeOverrides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES, null, msgs);
			msgs = basicSetAttributeOverrides(newAttributeOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES, newAttributeOverrides, newAttributeOverrides));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTable getJoinTable() {
		return joinTable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
		JoinTable oldJoinTable = joinTable;
		joinTable = newJoinTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE, oldJoinTable, newJoinTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinTable(JoinTable newJoinTable) {
		if (newJoinTable != joinTable) {
			NotificationChain msgs = null;
			if (joinTable != null)
				msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE, null, msgs);
			if (newJoinTable != null)
				msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE, null, msgs);
			msgs = basicSetJoinTable(newJoinTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE, newJoinTable, newJoinTable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OneToMany getOneToMany() {
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToMany(OneToMany newOneToMany, NotificationChain msgs) {
		OneToMany oldOneToMany = oneToMany;
		oneToMany = newOneToMany;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY, oldOneToMany, newOneToMany);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToMany(OneToMany newOneToMany) {
		if (newOneToMany != oneToMany) {
			NotificationChain msgs = null;
			if (oneToMany != null)
				msgs = ((InternalEObject)oneToMany).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY, null, msgs);
			if (newOneToMany != null)
				msgs = ((InternalEObject)newOneToMany).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY, null, msgs);
			msgs = basicSetOneToMany(newOneToMany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY, newOneToMany, newOneToMany));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceGenerator getSequenceGenerator() {
		return sequenceGenerator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
		SequenceGenerator oldSequenceGenerator = sequenceGenerator;
		sequenceGenerator = newSequenceGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
		if (newSequenceGenerator != sequenceGenerator) {
			NotificationChain msgs = null;
			if (sequenceGenerator != null)
				msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR, null, msgs);
			if (newSequenceGenerator != null)
				msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR, null, msgs);
			msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TableGenerator getTableGenerator() {
		return tableGenerator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
		TableGenerator oldTableGenerator = tableGenerator;
		tableGenerator = newTableGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableGenerator(TableGenerator newTableGenerator) {
		if (newTableGenerator != tableGenerator) {
			NotificationChain msgs = null;
			if (tableGenerator != null)
				msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR, null, msgs);
			if (newTableGenerator != null)
				msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR, null, msgs);
			msgs = basicSetTableGenerator(newTableGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JoinColumns getJoinColumns() {
		return joinColumns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinColumns(JoinColumns newJoinColumns, NotificationChain msgs) {
		JoinColumns oldJoinColumns = joinColumns;
		joinColumns = newJoinColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS, oldJoinColumns, newJoinColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinColumns(JoinColumns newJoinColumns) {
		if (newJoinColumns != joinColumns) {
			NotificationChain msgs = null;
			if (joinColumns != null)
				msgs = ((InternalEObject)joinColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS, null, msgs);
			if (newJoinColumns != null)
				msgs = ((InternalEObject)newJoinColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS, null, msgs);
			msgs = basicSetJoinColumns(newJoinColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS, newJoinColumns, newJoinColumns));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Indexed getIndexed() {
		return indexed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexed(Indexed newIndexed, NotificationChain msgs) {
		Indexed oldIndexed = indexed;
		indexed = newIndexed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED, oldIndexed, newIndexed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexed(Indexed newIndexed) {
		if (newIndexed != indexed) {
			NotificationChain msgs = null;
			if (indexed != null)
				msgs = ((InternalEObject)indexed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED, null, msgs);
			if (newIndexed != null)
				msgs = ((InternalEObject)newIndexed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED, null, msgs);
			msgs = basicSetIndexed(newIndexed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED, newIndexed, newIndexed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Unique getUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnique(Unique newUnique, NotificationChain msgs) {
		Unique oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE, oldUnique, newUnique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(Unique newUnique) {
		if (newUnique != unique) {
			NotificationChain msgs = null;
			if (unique != null)
				msgs = ((InternalEObject)unique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE, null, msgs);
			if (newUnique != null)
				msgs = ((InternalEObject)newUnique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE, null, msgs);
			msgs = basicSetUnique(newUnique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE, newUnique, newUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return basicSetPaEClass(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				return basicSetAttributeOverrides(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE:
				return basicSetJoinTable(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY:
				return basicSetOneToMany(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR:
				return basicSetSequenceGenerator(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR:
				return basicSetTableGenerator(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS:
				return basicSetJoinColumns(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				return basicSetIndexed(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				return basicSetUnique(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN:
				return basicSetColumn(null, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_ATTRIBUTE_OVERRIDES:
				return ((InternalEList)getParsedAttributeOverrides()).basicRemove(otherEnd, msgs);
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_JOIN_COLUMNS:
				return ((InternalEList)getParsedJoinColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return eInternalContainer().eInverseRemove(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				if (resolve) return getAnnotatedEStructuralFeature();
				return basicGetAnnotatedEStructuralFeature();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				return getAttributeOverrides();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE:
				return getJoinTable();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY:
				return getOneToMany();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR:
				return getTableGenerator();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS:
				return getJoinColumns();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				return getIndexed();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				return getUnique();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN:
				return getColumn();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_ATTRIBUTE_OVERRIDES:
				return getParsedAttributeOverrides();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_JOIN_COLUMNS:
				return getParsedJoinColumns();
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE:
				setJoinTable((JoinTable)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY:
				setOneToMany((OneToMany)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS:
				setJoinColumns((JoinColumns)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				setIndexed((Indexed)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				setUnique((Unique)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN:
				setColumn((Column)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_ATTRIBUTE_OVERRIDES:
				getParsedAttributeOverrides().clear();
				getParsedAttributeOverrides().addAll((Collection)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_JOIN_COLUMNS:
				getParsedJoinColumns().clear();
				getParsedJoinColumns().addAll((Collection)newValue);
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE:
				setJoinTable((JoinTable)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY:
				setOneToMany((OneToMany)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS:
				setJoinColumns((JoinColumns)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				setIndexed((Indexed)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				setUnique((Unique)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN:
				setColumn((Column)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_ATTRIBUTE_OVERRIDES:
				getParsedAttributeOverrides().clear();
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_JOIN_COLUMNS:
				getParsedJoinColumns().clear();
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				return basicGetAnnotatedEStructuralFeature() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				return attributeOverrides != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_TABLE:
				return joinTable != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ONE_TO_MANY:
				return oneToMany != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__SEQUENCE_GENERATOR:
				return sequenceGenerator != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TABLE_GENERATOR:
				return tableGenerator != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__JOIN_COLUMNS:
				return joinColumns != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				return indexed != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				return unique != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN:
				return column != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_ATTRIBUTE_OVERRIDES:
				return parsedAttributeOverrides != null && !parsedAttributeOverrides.isEmpty();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PARSED_JOIN_COLUMNS:
				return parsedJoinColumns != null && !parsedJoinColumns.isEmpty();
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

	public String getTableName() {
		String tableName = null;
		if (getColumn() != null) {
			tableName = getColumn().getTable();
		} else if (getJoinColumns() != null && getJoinColumns().getValue().size() > 0) {
			tableName = ((JoinColumn) getJoinColumns().getValue().get(0)).getTable();
		}
		return tableName;
	}

	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getParsedAttributeOverrides() {
		if (attributeOverrides == null) {
			attributeOverrides = PannotationFactory.eINSTANCE.createAttributeOverrides();
		}
		parsedAttributeOverrides = attributeOverrides.getValue();
		return parsedAttributeOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getParsedJoinColumns() {
		if (joinColumns == null) {
			joinColumns = PannotationFactory.eINSTANCE.createJoinColumns();
		}
		parsedJoinColumns = joinColumns.getValue();
		return parsedJoinColumns;
	}

} // PAnnotatedEStructuralFeatureImpl
