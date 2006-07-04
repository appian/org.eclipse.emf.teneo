/**
 * <copyright>
 * </copyright>
 *
 * $Id: PAnnotatedEClassImpl.java,v 1.1 2006/07/04 21:37:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pamodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEAttribute;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEClass;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEPackage;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEStructuralFeature;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedModel;
import org.eclipse.emf.teneo.annotations.pamodel.PamodelPackage;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.AttributeOverrides;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorValue;
import org.eclipse.emf.teneo.annotations.pannotation.Embeddable;
import org.eclipse.emf.teneo.annotations.pannotation.Entity;
import org.eclipse.emf.teneo.annotations.pannotation.EntityListener;
import org.eclipse.emf.teneo.annotations.pannotation.ExcludeDefaultListeners;
import org.eclipse.emf.teneo.annotations.pannotation.ExcludeSuperclassListeners;
import org.eclipse.emf.teneo.annotations.pannotation.IdClass;
import org.eclipse.emf.teneo.annotations.pannotation.Inheritance;
import org.eclipse.emf.teneo.annotations.pannotation.InheritanceType;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.MappedSuperclass;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns;
import org.eclipse.emf.teneo.annotations.pannotation.SecondaryTables;
import org.eclipse.emf.teneo.annotations.pannotation.SequenceGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Table;
import org.eclipse.emf.teneo.annotations.pannotation.TableGenerator;
import org.eclipse.emf.teneo.annotations.pannotation.Transient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PAnnotated EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getPaEPackage <em>Pa EPackage</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getAnnotatedEClass <em>Annotated EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getPaEStructuralFeatures <em>Pa EStructural Features</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getAttributeOverrides <em>Attribute Overrides</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getEntityListener <em>Entity Listener</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getPrimaryKeyJoinColumns <em>Primary Key Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getSecondaryTables <em>Secondary Tables</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pamodel.impl.PAnnotatedEClassImpl#getAssociationOverrides <em>Association Overrides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PAnnotatedEClassImpl extends PAnnotatedEModelElementImpl implements PAnnotatedEClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The cached value of the '{@link #getAnnotatedEClass() <em>Annotated EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass annotatedEClass = null;

	/**
	 * The cached value of the '{@link #getPaEStructuralFeatures() <em>Pa EStructural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaEStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList paEStructuralFeatures = null;

	/**
	 * The cached value of the '{@link #getAttributeOverrides() <em>Attribute Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOverrides()
	 * @generated
	 * @ordered
	 */
	protected AttributeOverrides attributeOverrides = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected DiscriminatorColumn discriminatorColumn = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected DiscriminatorValue discriminatorValue = null;

	/**
	 * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected Embeddable embeddable = null;

	/**
	 * The cached value of the '{@link #getExcludeDefaultListeners() <em>Exclude Default Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeDefaultListeners()
	 * @generated
	 * @ordered
	 */
	protected ExcludeDefaultListeners excludeDefaultListeners = null;

	/**
	 * The cached value of the '{@link #getExcludeSuperclassListeners() <em>Exclude Superclass Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeSuperclassListeners()
	 * @generated
	 * @ordered
	 */
	protected ExcludeSuperclassListeners excludeSuperclassListeners = null;

	/**
	 * The cached value of the '{@link #getMappedSuperclass() <em>Mapped Superclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedSuperclass()
	 * @generated
	 * @ordered
	 */
	protected MappedSuperclass mappedSuperclass = null;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity = null;

	/**
	 * The cached value of the '{@link #getEntityListener() <em>Entity Listener</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityListener()
	 * @generated
	 * @ordered
	 */
	protected EntityListener entityListener = null;

	/**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
	protected IdClass idClass = null;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritance = null;

	/**
	 * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinColumn()
	 * @generated
	 * @ordered
	 */
	protected JoinColumn joinColumn = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyJoinColumns() <em>Primary Key Join Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKeyJoinColumns primaryKeyJoinColumns = null;

	/**
	 * The cached value of the '{@link #getSecondaryTables() <em>Secondary Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryTables()
	 * @generated
	 * @ordered
	 */
	protected SecondaryTables secondaryTables = null;

	/**
	 * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceGenerator()
	 * @generated
	 * @ordered
	 */
	protected SequenceGenerator sequenceGenerator = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table = null;

	/**
	 * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableGenerator()
	 * @generated
	 * @ordered
	 */
	protected TableGenerator tableGenerator = null;

	/**
	 * The cached value of the '{@link #getAssociationOverrides() <em>Association Overrides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationOverrides()
	 * @generated
	 * @ordered
	 */
	protected AssociationOverrides associationOverrides = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PAnnotatedEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PamodelPackage.eINSTANCE.getPAnnotatedEClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAnnotatedEPackage getPaEPackage() {
		if (eContainerFeatureID != PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE) return null;
		return (PAnnotatedEPackage)eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaEPackage(PAnnotatedEPackage newPaEPackage) {
		if (newPaEPackage != eContainer || (eContainerFeatureID != PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE && newPaEPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPaEPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eContainer != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaEPackage != null)
				msgs = ((InternalEObject)newPaEPackage).eInverseAdd(this, PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES, PAnnotatedEPackage.class, msgs);
			msgs = eBasicSetContainer((InternalEObject)newPaEPackage, PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE, newPaEPackage, newPaEPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedEClass() {
		if (annotatedEClass != null && annotatedEClass.eIsProxy()) {
			EClass oldAnnotatedEClass = annotatedEClass;
			annotatedEClass = (EClass)eResolveProxy((InternalEObject)annotatedEClass);
			if (annotatedEClass != oldAnnotatedEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS, oldAnnotatedEClass, annotatedEClass));
			}
		}
		return annotatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAnnotatedEClass() {
		return annotatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAnnotatedEClass(EClass newAnnotatedEClass) {
		EClass oldAnnotatedEClass = annotatedEClass;
		annotatedEClass = newAnnotatedEClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS, oldAnnotatedEClass, annotatedEClass));
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT, oldAnnotatedEClass, annotatedEClass));
		}
	}

	public ENamedElement basicGetAnnotatedElement() {
		return basicGetAnnotatedEClass();
	}

	public void setAnnotatedElement(ENamedElement newAnnotatedElement) {
		setAnnotatedEClass((EClass) newAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPaEStructuralFeatures() {
		if (paEStructuralFeatures == null) {
			paEStructuralFeatures = new EObjectContainmentWithInverseEList(PAnnotatedEStructuralFeature.class, this, PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES, PamodelPackage.PANNOTATED_ESTRUCTURAL_FEATURE__PA_ECLASS);
		}
		return paEStructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOverrides getAttributeOverrides() {
		return attributeOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOverrides(AttributeOverrides newAttributeOverrides, NotificationChain msgs) {
		AttributeOverrides oldAttributeOverrides = attributeOverrides;
		attributeOverrides = newAttributeOverrides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES, oldAttributeOverrides, newAttributeOverrides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOverrides(AttributeOverrides newAttributeOverrides) {
		if (newAttributeOverrides != attributeOverrides) {
			NotificationChain msgs = null;
			if (attributeOverrides != null)
				msgs = ((InternalEObject)attributeOverrides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES, null, msgs);
			if (newAttributeOverrides != null)
				msgs = ((InternalEObject)newAttributeOverrides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES, null, msgs);
			msgs = basicSetAttributeOverrides(newAttributeOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES, newAttributeOverrides, newAttributeOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorColumn getDiscriminatorColumn() {
		return discriminatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn, NotificationChain msgs) {
		DiscriminatorColumn oldDiscriminatorColumn = discriminatorColumn;
		discriminatorColumn = newDiscriminatorColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, newDiscriminatorColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn) {
		if (newDiscriminatorColumn != discriminatorColumn) {
			NotificationChain msgs = null;
			if (discriminatorColumn != null)
				msgs = ((InternalEObject)discriminatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN, null, msgs);
			if (newDiscriminatorColumn != null)
				msgs = ((InternalEObject)newDiscriminatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN, null, msgs);
			msgs = basicSetDiscriminatorColumn(newDiscriminatorColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN, newDiscriminatorColumn, newDiscriminatorColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscriminatorValue getDiscriminatorValue() {
		return discriminatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscriminatorValue(DiscriminatorValue newDiscriminatorValue, NotificationChain msgs) {
		DiscriminatorValue oldDiscriminatorValue = discriminatorValue;
		discriminatorValue = newDiscriminatorValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE, oldDiscriminatorValue, newDiscriminatorValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorValue(DiscriminatorValue newDiscriminatorValue) {
		if (newDiscriminatorValue != discriminatorValue) {
			NotificationChain msgs = null;
			if (discriminatorValue != null)
				msgs = ((InternalEObject)discriminatorValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE, null, msgs);
			if (newDiscriminatorValue != null)
				msgs = ((InternalEObject)newDiscriminatorValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE, null, msgs);
			msgs = basicSetDiscriminatorValue(newDiscriminatorValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE, newDiscriminatorValue, newDiscriminatorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embeddable getEmbeddable() {
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddable(Embeddable newEmbeddable, NotificationChain msgs) {
		Embeddable oldEmbeddable = embeddable;
		embeddable = newEmbeddable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE, oldEmbeddable, newEmbeddable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddable(Embeddable newEmbeddable) {
		if (newEmbeddable != embeddable) {
			NotificationChain msgs = null;
			if (embeddable != null)
				msgs = ((InternalEObject)embeddable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE, null, msgs);
			if (newEmbeddable != null)
				msgs = ((InternalEObject)newEmbeddable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE, null, msgs);
			msgs = basicSetEmbeddable(newEmbeddable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE, newEmbeddable, newEmbeddable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeDefaultListeners getExcludeDefaultListeners() {
		return excludeDefaultListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeDefaultListeners(ExcludeDefaultListeners newExcludeDefaultListeners, NotificationChain msgs) {
		ExcludeDefaultListeners oldExcludeDefaultListeners = excludeDefaultListeners;
		excludeDefaultListeners = newExcludeDefaultListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS, oldExcludeDefaultListeners, newExcludeDefaultListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeDefaultListeners(ExcludeDefaultListeners newExcludeDefaultListeners) {
		if (newExcludeDefaultListeners != excludeDefaultListeners) {
			NotificationChain msgs = null;
			if (excludeDefaultListeners != null)
				msgs = ((InternalEObject)excludeDefaultListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			if (newExcludeDefaultListeners != null)
				msgs = ((InternalEObject)newExcludeDefaultListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			msgs = basicSetExcludeDefaultListeners(newExcludeDefaultListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS, newExcludeDefaultListeners, newExcludeDefaultListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeSuperclassListeners getExcludeSuperclassListeners() {
		return excludeSuperclassListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeSuperclassListeners(ExcludeSuperclassListeners newExcludeSuperclassListeners, NotificationChain msgs) {
		ExcludeSuperclassListeners oldExcludeSuperclassListeners = excludeSuperclassListeners;
		excludeSuperclassListeners = newExcludeSuperclassListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS, oldExcludeSuperclassListeners, newExcludeSuperclassListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeSuperclassListeners(ExcludeSuperclassListeners newExcludeSuperclassListeners) {
		if (newExcludeSuperclassListeners != excludeSuperclassListeners) {
			NotificationChain msgs = null;
			if (excludeSuperclassListeners != null)
				msgs = ((InternalEObject)excludeSuperclassListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			if (newExcludeSuperclassListeners != null)
				msgs = ((InternalEObject)newExcludeSuperclassListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			msgs = basicSetExcludeSuperclassListeners(newExcludeSuperclassListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS, newExcludeSuperclassListeners, newExcludeSuperclassListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedSuperclass getMappedSuperclass() {
		return mappedSuperclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedSuperclass(MappedSuperclass newMappedSuperclass, NotificationChain msgs) {
		MappedSuperclass oldMappedSuperclass = mappedSuperclass;
		mappedSuperclass = newMappedSuperclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS, oldMappedSuperclass, newMappedSuperclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedSuperclass(MappedSuperclass newMappedSuperclass) {
		if (newMappedSuperclass != mappedSuperclass) {
			NotificationChain msgs = null;
			if (mappedSuperclass != null)
				msgs = ((InternalEObject)mappedSuperclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS, null, msgs);
			if (newMappedSuperclass != null)
				msgs = ((InternalEObject)newMappedSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS, null, msgs);
			msgs = basicSetMappedSuperclass(newMappedSuperclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS, newMappedSuperclass, newMappedSuperclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityListener getEntityListener() {
		return entityListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityListener(EntityListener newEntityListener, NotificationChain msgs) {
		EntityListener oldEntityListener = entityListener;
		entityListener = newEntityListener;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER, oldEntityListener, newEntityListener);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityListener(EntityListener newEntityListener) {
		if (newEntityListener != entityListener) {
			NotificationChain msgs = null;
			if (entityListener != null)
				msgs = ((InternalEObject)entityListener).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER, null, msgs);
			if (newEntityListener != null)
				msgs = ((InternalEObject)newEntityListener).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER, null, msgs);
			msgs = basicSetEntityListener(newEntityListener, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER, newEntityListener, newEntityListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdClass getIdClass() {
		return idClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdClass(IdClass newIdClass, NotificationChain msgs) {
		IdClass oldIdClass = idClass;
		idClass = newIdClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ID_CLASS, oldIdClass, newIdClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdClass(IdClass newIdClass) {
		if (newIdClass != idClass) {
			NotificationChain msgs = null;
			if (idClass != null)
				msgs = ((InternalEObject)idClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ID_CLASS, null, msgs);
			if (newIdClass != null)
				msgs = ((InternalEObject)newIdClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ID_CLASS, null, msgs);
			msgs = basicSetIdClass(newIdClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ID_CLASS, newIdClass, newIdClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getInheritance() {
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
		Inheritance oldInheritance = inheritance;
		inheritance = newInheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__INHERITANCE, oldInheritance, newInheritance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritance(Inheritance newInheritance) {
		if (newInheritance != inheritance) {
			NotificationChain msgs = null;
			if (inheritance != null)
				msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__INHERITANCE, null, msgs);
			if (newInheritance != null)
				msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__INHERITANCE, null, msgs);
			msgs = basicSetInheritance(newInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__INHERITANCE, newInheritance, newInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinColumn getJoinColumn() {
		return joinColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinColumn(JoinColumn newJoinColumn, NotificationChain msgs) {
		JoinColumn oldJoinColumn = joinColumn;
		joinColumn = newJoinColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN, oldJoinColumn, newJoinColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinColumn(JoinColumn newJoinColumn) {
		if (newJoinColumn != joinColumn) {
			NotificationChain msgs = null;
			if (joinColumn != null)
				msgs = ((InternalEObject)joinColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN, null, msgs);
			if (newJoinColumn != null)
				msgs = ((InternalEObject)newJoinColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN, null, msgs);
			msgs = basicSetJoinColumn(newJoinColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN, newJoinColumn, newJoinColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyJoinColumns getPrimaryKeyJoinColumns() {
		return primaryKeyJoinColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKeyJoinColumns(PrimaryKeyJoinColumns newPrimaryKeyJoinColumns, NotificationChain msgs) {
		PrimaryKeyJoinColumns oldPrimaryKeyJoinColumns = primaryKeyJoinColumns;
		primaryKeyJoinColumns = newPrimaryKeyJoinColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS, oldPrimaryKeyJoinColumns, newPrimaryKeyJoinColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryKeyJoinColumns(PrimaryKeyJoinColumns newPrimaryKeyJoinColumns) {
		if (newPrimaryKeyJoinColumns != primaryKeyJoinColumns) {
			NotificationChain msgs = null;
			if (primaryKeyJoinColumns != null)
				msgs = ((InternalEObject)primaryKeyJoinColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS, null, msgs);
			if (newPrimaryKeyJoinColumns != null)
				msgs = ((InternalEObject)newPrimaryKeyJoinColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS, null, msgs);
			msgs = basicSetPrimaryKeyJoinColumns(newPrimaryKeyJoinColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS, newPrimaryKeyJoinColumns, newPrimaryKeyJoinColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryTables getSecondaryTables() {
		return secondaryTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryTables(SecondaryTables newSecondaryTables, NotificationChain msgs) {
		SecondaryTables oldSecondaryTables = secondaryTables;
		secondaryTables = newSecondaryTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES, oldSecondaryTables, newSecondaryTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryTables(SecondaryTables newSecondaryTables) {
		if (newSecondaryTables != secondaryTables) {
			NotificationChain msgs = null;
			if (secondaryTables != null)
				msgs = ((InternalEObject)secondaryTables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES, null, msgs);
			if (newSecondaryTables != null)
				msgs = ((InternalEObject)newSecondaryTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES, null, msgs);
			msgs = basicSetSecondaryTables(newSecondaryTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES, newSecondaryTables, newSecondaryTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceGenerator getSequenceGenerator() {
		return sequenceGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
		SequenceGenerator oldSequenceGenerator = sequenceGenerator;
		sequenceGenerator = newSequenceGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
		if (newSequenceGenerator != sequenceGenerator) {
			NotificationChain msgs = null;
			if (sequenceGenerator != null)
				msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR, null, msgs);
			if (newSequenceGenerator != null)
				msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR, null, msgs);
			msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableGenerator getTableGenerator() {
		return tableGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
		TableGenerator oldTableGenerator = tableGenerator;
		tableGenerator = newTableGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableGenerator(TableGenerator newTableGenerator) {
		if (newTableGenerator != tableGenerator) {
			NotificationChain msgs = null;
			if (tableGenerator != null)
				msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR, null, msgs);
			if (newTableGenerator != null)
				msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR, null, msgs);
			msgs = basicSetTableGenerator(newTableGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationOverrides getAssociationOverrides() {
		return associationOverrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationOverrides(AssociationOverrides newAssociationOverrides, NotificationChain msgs) {
		AssociationOverrides oldAssociationOverrides = associationOverrides;
		associationOverrides = newAssociationOverrides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES, oldAssociationOverrides, newAssociationOverrides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationOverrides(AssociationOverrides newAssociationOverrides) {
		if (newAssociationOverrides != associationOverrides) {
			NotificationChain msgs = null;
			if (associationOverrides != null)
				msgs = ((InternalEObject)associationOverrides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES, null, msgs);
			if (newAssociationOverrides != null)
				msgs = ((InternalEObject)newAssociationOverrides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES, null, msgs);
			msgs = basicSetAssociationOverrides(newAssociationOverrides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES, newAssociationOverrides, newAssociationOverrides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
					return ((InternalEList)getPaEStructuralFeatures()).basicAdd(otherEnd, msgs);
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
				case PamodelPackage.PANNOTATED_ECLASS__TRANSIENT:
					return basicSetTransient(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
					return eBasicSetContainer(null, PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
					return ((InternalEList)getPaEStructuralFeatures()).basicRemove(otherEnd, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES:
					return basicSetAttributeOverrides(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN:
					return basicSetDiscriminatorColumn(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE:
					return basicSetDiscriminatorValue(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE:
					return basicSetEmbeddable(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS:
					return basicSetExcludeDefaultListeners(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS:
					return basicSetExcludeSuperclassListeners(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS:
					return basicSetMappedSuperclass(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__ENTITY:
					return basicSetEntity(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER:
					return basicSetEntityListener(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__ID_CLASS:
					return basicSetIdClass(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__INHERITANCE:
					return basicSetInheritance(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN:
					return basicSetJoinColumn(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS:
					return basicSetPrimaryKeyJoinColumns(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES:
					return basicSetSecondaryTables(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR:
					return basicSetSequenceGenerator(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__TABLE:
					return basicSetTable(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR:
					return basicSetTableGenerator(null, msgs);
				case PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES:
					return basicSetAssociationOverrides(null, msgs);
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
				case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
					return eContainer.eInverseRemove(this, PamodelPackage.PANNOTATED_EPACKAGE__PA_ECLASSES, PAnnotatedEPackage.class, msgs);
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
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT:
				if (resolve) return getAnnotatedElement();
				return basicGetAnnotatedElement();
			case PamodelPackage.PANNOTATED_ECLASS__TRANSIENT:
				return getTransient();
			case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
				return getPaEPackage();
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS:
				if (resolve) return getAnnotatedEClass();
				return basicGetAnnotatedEClass();
			case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
				return getPaEStructuralFeatures();
			case PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES:
				return getAttributeOverrides();
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN:
				return getDiscriminatorColumn();
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE:
				return getDiscriminatorValue();
			case PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE:
				return getEmbeddable();
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS:
				return getExcludeDefaultListeners();
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				return getExcludeSuperclassListeners();
			case PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS:
				return getMappedSuperclass();
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY:
				return getEntity();
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER:
				return getEntityListener();
			case PamodelPackage.PANNOTATED_ECLASS__ID_CLASS:
				return getIdClass();
			case PamodelPackage.PANNOTATED_ECLASS__INHERITANCE:
				return getInheritance();
			case PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN:
				return getJoinColumn();
			case PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS:
				return getPrimaryKeyJoinColumns();
			case PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES:
				return getSecondaryTables();
			case PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case PamodelPackage.PANNOTATED_ECLASS__TABLE:
				return getTable();
			case PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR:
				return getTableGenerator();
			case PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES:
				return getAssociationOverrides();
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
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TRANSIENT:
				setTransient((Transient)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
				setPaEPackage((PAnnotatedEPackage)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS:
				setAnnotatedEClass((EClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
				getPaEStructuralFeatures().clear();
				getPaEStructuralFeatures().addAll((Collection)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((DiscriminatorValue)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE:
				setEmbeddable((Embeddable)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((ExcludeDefaultListeners)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((ExcludeSuperclassListeners)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS:
				setMappedSuperclass((MappedSuperclass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY:
				setEntity((Entity)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER:
				setEntityListener((EntityListener)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ID_CLASS:
				setIdClass((IdClass)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__INHERITANCE:
				setInheritance((Inheritance)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN:
				setJoinColumn((JoinColumn)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS:
				setPrimaryKeyJoinColumns((PrimaryKeyJoinColumns)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES:
				setSecondaryTables((SecondaryTables)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE:
				setTable((Table)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES:
				setAssociationOverrides((AssociationOverrides)newValue);
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
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT:
				setAnnotatedElement((ENamedElement)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TRANSIENT:
				setTransient((Transient)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
				setPaEPackage((PAnnotatedEPackage)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS:
				setAnnotatedEClass((EClass)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
				getPaEStructuralFeatures().clear();
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES:
				setAttributeOverrides((AttributeOverrides)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((DiscriminatorValue)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE:
				setEmbeddable((Embeddable)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((ExcludeDefaultListeners)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((ExcludeSuperclassListeners)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS:
				setMappedSuperclass((MappedSuperclass)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY:
				setEntity((Entity)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER:
				setEntityListener((EntityListener)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ID_CLASS:
				setIdClass((IdClass)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__INHERITANCE:
				setInheritance((Inheritance)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN:
				setJoinColumn((JoinColumn)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS:
				setPrimaryKeyJoinColumns((PrimaryKeyJoinColumns)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES:
				setSecondaryTables((SecondaryTables)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE:
				setTable((Table)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
				return;
			case PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES:
				setAssociationOverrides((AssociationOverrides)null);
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
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ELEMENT:
				return basicGetAnnotatedElement() != null;
			case PamodelPackage.PANNOTATED_ECLASS__TRANSIENT:
				return transient_ != null;
			case PamodelPackage.PANNOTATED_ECLASS__PA_EPACKAGE:
				return getPaEPackage() != null;
			case PamodelPackage.PANNOTATED_ECLASS__ANNOTATED_ECLASS:
				return annotatedEClass != null;
			case PamodelPackage.PANNOTATED_ECLASS__PA_ESTRUCTURAL_FEATURES:
				return paEStructuralFeatures != null && !paEStructuralFeatures.isEmpty();
			case PamodelPackage.PANNOTATED_ECLASS__ATTRIBUTE_OVERRIDES:
				return attributeOverrides != null;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_COLUMN:
				return discriminatorColumn != null;
			case PamodelPackage.PANNOTATED_ECLASS__DISCRIMINATOR_VALUE:
				return discriminatorValue != null;
			case PamodelPackage.PANNOTATED_ECLASS__EMBEDDABLE:
				return embeddable != null;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_DEFAULT_LISTENERS:
				return excludeDefaultListeners != null;
			case PamodelPackage.PANNOTATED_ECLASS__EXCLUDE_SUPERCLASS_LISTENERS:
				return excludeSuperclassListeners != null;
			case PamodelPackage.PANNOTATED_ECLASS__MAPPED_SUPERCLASS:
				return mappedSuperclass != null;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY:
				return entity != null;
			case PamodelPackage.PANNOTATED_ECLASS__ENTITY_LISTENER:
				return entityListener != null;
			case PamodelPackage.PANNOTATED_ECLASS__ID_CLASS:
				return idClass != null;
			case PamodelPackage.PANNOTATED_ECLASS__INHERITANCE:
				return inheritance != null;
			case PamodelPackage.PANNOTATED_ECLASS__JOIN_COLUMN:
				return joinColumn != null;
			case PamodelPackage.PANNOTATED_ECLASS__PRIMARY_KEY_JOIN_COLUMNS:
				return primaryKeyJoinColumns != null;
			case PamodelPackage.PANNOTATED_ECLASS__SECONDARY_TABLES:
				return secondaryTables != null;
			case PamodelPackage.PANNOTATED_ECLASS__SEQUENCE_GENERATOR:
				return sequenceGenerator != null;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE:
				return table != null;
			case PamodelPackage.PANNOTATED_ECLASS__TABLE_GENERATOR:
				return tableGenerator != null;
			case PamodelPackage.PANNOTATED_ECLASS__ASSOCIATION_OVERRIDES:
				return associationOverrides != null;
		}
		return eDynamicIsSet(eFeature);
	}

	/** 
	 * @return true if the eclass or its ancestor has an PAnnotatedEStructuralFeature with an id annotation.
	 */
	public boolean hasIdAnnotatedFeature() {
		if (!getPaIdAttributes().isEmpty()) return true;

		List eSupers = getAnnotatedEClass().getESuperTypes();
		for (Iterator it = eSupers.iterator(); it.hasNext();) {
			EClass eSuper = (EClass)it.next();
			PAnnotatedEClass aClass = getPaModel().getPAnnotated(eSuper);
			if (aClass != null && aClass.hasIdAnnotatedFeature()) {
				return true;
			}
		}
		return false;
	}

	/** Returns true if the eclass has an PAnnotatedEStructuralFeature with an version annotation */
	public boolean hasVersionAnnotatedFeature() {
		Iterator it = getPaEStructuralFeatures().iterator();
		while (it.hasNext()) {
			PAnnotatedEStructuralFeature aFeature = (PAnnotatedEStructuralFeature)it.next();
			if (aFeature instanceof PAnnotatedEAttribute)
				if (((PAnnotatedEAttribute) aFeature).getVersion() != null) return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc }
	 */
	public PAnnotatedModel getPaModel() {
		PAnnotatedEPackage ePackage = getPaEPackage();
		return ePackage != null ? ePackage.getPaModel() : null;
	}

	/**
	 * {@inheritDoc}
	 */
	public List getPaIdAttributes() {
		// TODO cache this list
		List attrs = new ArrayList();
		Iterator it = getPaEStructuralFeatures().iterator();
		while (it.hasNext()) {
			PAnnotatedEStructuralFeature aFeature = (PAnnotatedEStructuralFeature) it.next();
			if (aFeature instanceof PAnnotatedEAttribute) {
				if (((PAnnotatedEAttribute) aFeature).getId() != null && ((PAnnotatedEAttribute) aFeature).getTransient() == null)
					attrs.add(aFeature);
			}
		}
		return attrs;
	}

	/**
	 * {@inheritDoc }
	 */
	public PAnnotatedEClass getPaMappedSuper() {
		// TODO cache its MappedSuperClass
		PAnnotatedModel model = getPaModel();
		PAnnotatedEClass mappedSuper = null;
		if (model != null && getAnnotatedEClass() != null) {
			Iterator i = getAnnotatedEClass().getESuperTypes().iterator();
			while (mappedSuper == null && i.hasNext()) {
				PAnnotatedEClass x = model.getPAnnotated((EClass) i.next());
				if (x.getMappedSuperclass() != null)
					mappedSuper = x;
			}
		}
		return mappedSuper;
	}

	/**
	 * {@inheritDoc }
	 */
	public PAnnotatedEClass getPaSuperEntity() {
		// TODO cache its SuperEntity
		PAnnotatedModel model = getPaModel();
		PAnnotatedEClass superEntity = null;
		if (model != null && getAnnotatedEClass() != null) {
			Iterator i = getAnnotatedEClass().getESuperTypes().iterator();
			while (superEntity == null && i.hasNext()) {
				PAnnotatedEClass x = model.getPAnnotated((EClass) i.next());
				if (x.getEntity() != null)
					superEntity = x;
			}
		}
		return superEntity;
	}

	/**
	 * {@inheritDoc }
	 */
	public InheritanceType getInheritanceStrategy() {
		// TODO cache it
		if (getInheritance() != null)
			return getInheritance().getStrategy();
		else {
			PAnnotatedEClass paSuperEntity = getPaSuperEntity();
			return paSuperEntity != null ? paSuperEntity.getInheritanceStrategy() : InheritanceType.SINGLE_TABLE_LITERAL;
		}
	}

} //PAnnotatedEClassImpl
