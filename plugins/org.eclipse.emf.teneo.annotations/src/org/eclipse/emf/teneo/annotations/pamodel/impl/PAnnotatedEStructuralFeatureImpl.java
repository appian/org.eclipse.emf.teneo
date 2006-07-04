/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEStructuralFeatureImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.Columns;
import org.eclipse.emf.teneo.annotations.pannotation.IdBag;
import org.eclipse.emf.teneo.annotations.pannotation.Indexed;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.OneToMany;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;
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
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getOneToMany <em>One To Many</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getIdBag <em>Id Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEStructuralFeatureImpl#getUnique <em>Unique</em>}</li>
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
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getAttributeOverrides() <em>Attribute Overrides</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributeOverrides()
	 * @generated
	 * @ordered
	 */
	protected AttributeOverrides attributeOverrides = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected Columns columns = null;

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
	 * The cached value of the '{@link #getIdBag() <em>Id Bag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBag()
	 * @generated
	 * @ordered
	 */
	protected IdBag idBag = null;

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
		return PamodelPackage.eINSTANCE.getPAnnotatedEStructuralFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEClass getPaEClass() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS) return null;
		return (PAnnotatedEClass)eContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaEClass(PAnnotatedEClass newPaEClass) {
		if (newPaEClass != eContainer || (eContainerFeatureID != PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS && newPaEClass != null)) {
			if (EcoreUtil.isAncestor(this, newPaEClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaEClass != null)
				msgs = ((InternalEObject)newPaEClass).eInverseAdd(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newPaEClass, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS, msgs);
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
		return annotatedEStructuralFeature == null ? null : (EStructuralFeature)eResolveProxy((InternalEObject)annotatedEStructuralFeature);
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
	public Columns getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(Columns newColumns, NotificationChain msgs) {
		Columns oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(Columns newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS, newColumns, newColumns));
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
	public IdBag getIdBag() {
		return idBag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdBag(IdBag newIdBag, NotificationChain msgs) {
		IdBag oldIdBag = idBag;
		idBag = newIdBag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG, oldIdBag, newIdBag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdBag(IdBag newIdBag) {
		if (newIdBag != idBag) {
			NotificationChain msgs = null;
			if (idBag != null)
				msgs = ((InternalEObject)idBag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG, null, msgs);
			if (newIdBag != null)
				msgs = ((InternalEObject)newIdBag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG, null, msgs);
			msgs = basicSetIdBag(newIdBag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG, newIdBag, newIdBag));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
					return basicSetTransient(null, msgs);
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
					return eBasicSetContainer(null, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS, msgs);
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
					return basicSetAttributeOverrides(null, msgs);
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS:
					return basicSetColumns(null, msgs);
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
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG:
					return basicSetIdBag(null, msgs);
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
					return basicSetIndexed(null, msgs);
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
					return basicSetUnique(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
					return eContainer.eInverseRemove(this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PAnnotatedEClass.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				return getTransient();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				if (resolve) return getAnnotatedEStructuralFeature();
				return basicGetAnnotatedEStructuralFeature();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				return getAttributeOverrides();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS:
				return getColumns();
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG:
				return getIdBag();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				return getIndexed();
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				return getUnique();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient((Transient)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS:
				setColumns((Columns)newValue);
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG:
				setIdBag((IdBag)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				setIndexed((Indexed)newValue);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				setUnique((Unique)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				setTransient((Transient)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				setPaEClass((PAnnotatedEClass)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				setAnnotatedEStructuralFeature((EStructuralFeature)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS:
				setColumns((Columns)null);
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG:
				setIdBag((IdBag)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				setIndexed((Indexed)null);
				return;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				setUnique((Unique)null);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ELEMENT:
				return basicGetAnnotatedElement() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__TRANSIENT:
				return transient_ != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS:
				return getPaEClass() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ANNOTATED_ESTRUCTURAL_FEATURE:
				return basicGetAnnotatedEStructuralFeature() != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ATTRIBUTE_OVERRIDES:
				return attributeOverrides != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__COLUMNS:
				return columns != null;
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
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__ID_BAG:
				return idBag != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__INDEXED:
				return indexed != null;
			case PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__UNIQUE:
				return unique != null;
		}
		return eDynamicIsSet(eFeature);
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
		Column column = null;
		final Columns columns = getColumns();
		if (columns != null && !columns.getValue().isEmpty()) {
			column = (Column) columns.getValue().get(0);
		}
		return column;
	}

} // PAnnotatedEStructuralFeatureImpl
