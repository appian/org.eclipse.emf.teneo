/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.1 2009/03/15 23:45:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.jpa.orm.AccessType;
import org.eclipse.emf.teneo.jpa.orm.AssociationOverride;
import org.eclipse.emf.teneo.jpa.orm.AttributeOverride;
import org.eclipse.emf.teneo.jpa.orm.Attributes;
import org.eclipse.emf.teneo.jpa.orm.DiscriminatorColumn;
import org.eclipse.emf.teneo.jpa.orm.EmptyType;
import org.eclipse.emf.teneo.jpa.orm.Entity;
import org.eclipse.emf.teneo.jpa.orm.EntityListeners;
import org.eclipse.emf.teneo.jpa.orm.IdClass;
import org.eclipse.emf.teneo.jpa.orm.Inheritance;
import org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery;
import org.eclipse.emf.teneo.jpa.orm.NamedQuery;
import org.eclipse.emf.teneo.jpa.orm.OrmPackage;
import org.eclipse.emf.teneo.jpa.orm.PostLoad;
import org.eclipse.emf.teneo.jpa.orm.PostPersist;
import org.eclipse.emf.teneo.jpa.orm.PostRemove;
import org.eclipse.emf.teneo.jpa.orm.PostUpdate;
import org.eclipse.emf.teneo.jpa.orm.PrePersist;
import org.eclipse.emf.teneo.jpa.orm.PreRemove;
import org.eclipse.emf.teneo.jpa.orm.PreUpdate;
import org.eclipse.emf.teneo.jpa.orm.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.jpa.orm.SecondaryTable;
import org.eclipse.emf.teneo.jpa.orm.SequenceGenerator;
import org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping;
import org.eclipse.emf.teneo.jpa.orm.Table;
import org.eclipse.emf.teneo.jpa.orm.TableGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getSecondaryTable <em>Secondary Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getEntityListeners <em>Entity Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPrePersist <em>Pre Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPostPersist <em>Post Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPreRemove <em>Pre Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPostRemove <em>Post Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPreUpdate <em>Pre Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPostUpdate <em>Post Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getPostLoad <em>Post Load</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends EObjectImpl implements Entity {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

	/**
	 * The cached value of the '{@link #getSecondaryTable() <em>Secondary Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryTable()
	 * @generated
	 * @ordered
	 */
	protected EList<SecondaryTable> secondaryTable;

	/**
	 * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumn;

	/**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
	protected IdClass idClass;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance inheritance;

	/**
	 * The default value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorValue()
	 * @generated
	 * @ordered
	 */
	protected String discriminatorValue = DISCRIMINATOR_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
	protected DiscriminatorColumn discriminatorColumn;

	/**
	 * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceGenerator()
	 * @generated
	 * @ordered
	 */
	protected SequenceGenerator sequenceGenerator;

	/**
	 * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableGenerator()
	 * @generated
	 * @ordered
	 */
	protected TableGenerator tableGenerator;

	/**
	 * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedQuery> namedQuery;

	/**
	 * The cached value of the '{@link #getNamedNativeQuery() <em>Named Native Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedNativeQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedNativeQuery> namedNativeQuery;

	/**
	 * The cached value of the '{@link #getSqlResultSetMapping() <em>Sql Result Set Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlResultSetMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<SqlResultSetMapping> sqlResultSetMapping;

	/**
	 * The cached value of the '{@link #getExcludeDefaultListeners() <em>Exclude Default Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeDefaultListeners()
	 * @generated
	 * @ordered
	 */
	protected EmptyType excludeDefaultListeners;

	/**
	 * The cached value of the '{@link #getExcludeSuperclassListeners() <em>Exclude Superclass Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeSuperclassListeners()
	 * @generated
	 * @ordered
	 */
	protected EmptyType excludeSuperclassListeners;

	/**
	 * The cached value of the '{@link #getEntityListeners() <em>Entity Listeners</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityListeners()
	 * @generated
	 * @ordered
	 */
	protected EntityListeners entityListeners;

	/**
	 * The cached value of the '{@link #getPrePersist() <em>Pre Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePersist()
	 * @generated
	 * @ordered
	 */
	protected PrePersist prePersist;

	/**
	 * The cached value of the '{@link #getPostPersist() <em>Post Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostPersist()
	 * @generated
	 * @ordered
	 */
	protected PostPersist postPersist;

	/**
	 * The cached value of the '{@link #getPreRemove() <em>Pre Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreRemove()
	 * @generated
	 * @ordered
	 */
	protected PreRemove preRemove;

	/**
	 * The cached value of the '{@link #getPostRemove() <em>Post Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostRemove()
	 * @generated
	 * @ordered
	 */
	protected PostRemove postRemove;

	/**
	 * The cached value of the '{@link #getPreUpdate() <em>Pre Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreUpdate()
	 * @generated
	 * @ordered
	 */
	protected PreUpdate preUpdate;

	/**
	 * The cached value of the '{@link #getPostUpdate() <em>Post Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostUpdate()
	 * @generated
	 * @ordered
	 */
	protected PostUpdate postUpdate;

	/**
	 * The cached value of the '{@link #getPostLoad() <em>Post Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLoad()
	 * @generated
	 * @ordered
	 */
	protected PostLoad postLoad;

	/**
	 * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOverride()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeOverride> attributeOverride;

	/**
	 * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationOverride()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociationOverride> associationOverride;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributes;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected AccessType access = ACCESS_EDEFAULT;

	/**
	 * This is true if the Access attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessESet;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

	/**
	 * This is true if the Metadata Complete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean metadataCompleteESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE, oldTable, newTable);
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
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecondaryTable> getSecondaryTable() {
		if (secondaryTable == null) {
			secondaryTable = new EObjectContainmentEList<SecondaryTable>(SecondaryTable.class, this, OrmPackage.ENTITY__SECONDARY_TABLE);
		}
		return secondaryTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
		if (primaryKeyJoinColumn == null) {
			primaryKeyJoinColumn = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this, OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN);
		}
		return primaryKeyJoinColumn;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS, oldIdClass, newIdClass);
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
				msgs = ((InternalEObject)idClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS, null, msgs);
			if (newIdClass != null)
				msgs = ((InternalEObject)newIdClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS, null, msgs);
			msgs = basicSetIdClass(newIdClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS, newIdClass, newIdClass));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE, oldInheritance, newInheritance);
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
				msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INHERITANCE, null, msgs);
			if (newInheritance != null)
				msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INHERITANCE, null, msgs);
			msgs = basicSetInheritance(newInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE, newInheritance, newInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminatorValue() {
		return discriminatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminatorValue(String newDiscriminatorValue) {
		String oldDiscriminatorValue = discriminatorValue;
		discriminatorValue = newDiscriminatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_VALUE, oldDiscriminatorValue, discriminatorValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, newDiscriminatorColumn);
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
				msgs = ((InternalEObject)discriminatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
			if (newDiscriminatorColumn != null)
				msgs = ((InternalEObject)newDiscriminatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
			msgs = basicSetDiscriminatorColumn(newDiscriminatorColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, newDiscriminatorColumn, newDiscriminatorColumn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
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
				msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
			if (newSequenceGenerator != null)
				msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
			msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
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
				msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
			if (newTableGenerator != null)
				msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
			msgs = basicSetTableGenerator(newTableGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedQuery> getNamedQuery() {
		if (namedQuery == null) {
			namedQuery = new EObjectContainmentEList<NamedQuery>(NamedQuery.class, this, OrmPackage.ENTITY__NAMED_QUERY);
		}
		return namedQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedNativeQuery> getNamedNativeQuery() {
		if (namedNativeQuery == null) {
			namedNativeQuery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this, OrmPackage.ENTITY__NAMED_NATIVE_QUERY);
		}
		return namedNativeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlResultSetMapping> getSqlResultSetMapping() {
		if (sqlResultSetMapping == null) {
			sqlResultSetMapping = new EObjectContainmentEList<SqlResultSetMapping>(SqlResultSetMapping.class, this, OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING);
		}
		return sqlResultSetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType getExcludeDefaultListeners() {
		return excludeDefaultListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeDefaultListeners(EmptyType newExcludeDefaultListeners, NotificationChain msgs) {
		EmptyType oldExcludeDefaultListeners = excludeDefaultListeners;
		excludeDefaultListeners = newExcludeDefaultListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, oldExcludeDefaultListeners, newExcludeDefaultListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeDefaultListeners(EmptyType newExcludeDefaultListeners) {
		if (newExcludeDefaultListeners != excludeDefaultListeners) {
			NotificationChain msgs = null;
			if (excludeDefaultListeners != null)
				msgs = ((InternalEObject)excludeDefaultListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			if (newExcludeDefaultListeners != null)
				msgs = ((InternalEObject)newExcludeDefaultListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			msgs = basicSetExcludeDefaultListeners(newExcludeDefaultListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, newExcludeDefaultListeners, newExcludeDefaultListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyType getExcludeSuperclassListeners() {
		return excludeSuperclassListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners, NotificationChain msgs) {
		EmptyType oldExcludeSuperclassListeners = excludeSuperclassListeners;
		excludeSuperclassListeners = newExcludeSuperclassListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, oldExcludeSuperclassListeners, newExcludeSuperclassListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners) {
		if (newExcludeSuperclassListeners != excludeSuperclassListeners) {
			NotificationChain msgs = null;
			if (excludeSuperclassListeners != null)
				msgs = ((InternalEObject)excludeSuperclassListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			if (newExcludeSuperclassListeners != null)
				msgs = ((InternalEObject)newExcludeSuperclassListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			msgs = basicSetExcludeSuperclassListeners(newExcludeSuperclassListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, newExcludeSuperclassListeners, newExcludeSuperclassListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityListeners getEntityListeners() {
		return entityListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityListeners(EntityListeners newEntityListeners, NotificationChain msgs) {
		EntityListeners oldEntityListeners = entityListeners;
		entityListeners = newEntityListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ENTITY_LISTENERS, oldEntityListeners, newEntityListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityListeners(EntityListeners newEntityListeners) {
		if (newEntityListeners != entityListeners) {
			NotificationChain msgs = null;
			if (entityListeners != null)
				msgs = ((InternalEObject)entityListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
			if (newEntityListeners != null)
				msgs = ((InternalEObject)newEntityListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
			msgs = basicSetEntityListeners(newEntityListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ENTITY_LISTENERS, newEntityListeners, newEntityListeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrePersist getPrePersist() {
		return prePersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrePersist(PrePersist newPrePersist, NotificationChain msgs) {
		PrePersist oldPrePersist = prePersist;
		prePersist = newPrePersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_PERSIST, oldPrePersist, newPrePersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrePersist(PrePersist newPrePersist) {
		if (newPrePersist != prePersist) {
			NotificationChain msgs = null;
			if (prePersist != null)
				msgs = ((InternalEObject)prePersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_PERSIST, null, msgs);
			if (newPrePersist != null)
				msgs = ((InternalEObject)newPrePersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_PERSIST, null, msgs);
			msgs = basicSetPrePersist(newPrePersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_PERSIST, newPrePersist, newPrePersist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPersist getPostPersist() {
		return postPersist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostPersist(PostPersist newPostPersist, NotificationChain msgs) {
		PostPersist oldPostPersist = postPersist;
		postPersist = newPostPersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_PERSIST, oldPostPersist, newPostPersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostPersist(PostPersist newPostPersist) {
		if (newPostPersist != postPersist) {
			NotificationChain msgs = null;
			if (postPersist != null)
				msgs = ((InternalEObject)postPersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_PERSIST, null, msgs);
			if (newPostPersist != null)
				msgs = ((InternalEObject)newPostPersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_PERSIST, null, msgs);
			msgs = basicSetPostPersist(newPostPersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_PERSIST, newPostPersist, newPostPersist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreRemove getPreRemove() {
		return preRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreRemove(PreRemove newPreRemove, NotificationChain msgs) {
		PreRemove oldPreRemove = preRemove;
		preRemove = newPreRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_REMOVE, oldPreRemove, newPreRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreRemove(PreRemove newPreRemove) {
		if (newPreRemove != preRemove) {
			NotificationChain msgs = null;
			if (preRemove != null)
				msgs = ((InternalEObject)preRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_REMOVE, null, msgs);
			if (newPreRemove != null)
				msgs = ((InternalEObject)newPreRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_REMOVE, null, msgs);
			msgs = basicSetPreRemove(newPreRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_REMOVE, newPreRemove, newPreRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostRemove getPostRemove() {
		return postRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostRemove(PostRemove newPostRemove, NotificationChain msgs) {
		PostRemove oldPostRemove = postRemove;
		postRemove = newPostRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_REMOVE, oldPostRemove, newPostRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostRemove(PostRemove newPostRemove) {
		if (newPostRemove != postRemove) {
			NotificationChain msgs = null;
			if (postRemove != null)
				msgs = ((InternalEObject)postRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_REMOVE, null, msgs);
			if (newPostRemove != null)
				msgs = ((InternalEObject)newPostRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_REMOVE, null, msgs);
			msgs = basicSetPostRemove(newPostRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_REMOVE, newPostRemove, newPostRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreUpdate getPreUpdate() {
		return preUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreUpdate(PreUpdate newPreUpdate, NotificationChain msgs) {
		PreUpdate oldPreUpdate = preUpdate;
		preUpdate = newPreUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_UPDATE, oldPreUpdate, newPreUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreUpdate(PreUpdate newPreUpdate) {
		if (newPreUpdate != preUpdate) {
			NotificationChain msgs = null;
			if (preUpdate != null)
				msgs = ((InternalEObject)preUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_UPDATE, null, msgs);
			if (newPreUpdate != null)
				msgs = ((InternalEObject)newPreUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_UPDATE, null, msgs);
			msgs = basicSetPreUpdate(newPreUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_UPDATE, newPreUpdate, newPreUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostUpdate getPostUpdate() {
		return postUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostUpdate(PostUpdate newPostUpdate, NotificationChain msgs) {
		PostUpdate oldPostUpdate = postUpdate;
		postUpdate = newPostUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_UPDATE, oldPostUpdate, newPostUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostUpdate(PostUpdate newPostUpdate) {
		if (newPostUpdate != postUpdate) {
			NotificationChain msgs = null;
			if (postUpdate != null)
				msgs = ((InternalEObject)postUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_UPDATE, null, msgs);
			if (newPostUpdate != null)
				msgs = ((InternalEObject)newPostUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_UPDATE, null, msgs);
			msgs = basicSetPostUpdate(newPostUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_UPDATE, newPostUpdate, newPostUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostLoad getPostLoad() {
		return postLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLoad(PostLoad newPostLoad, NotificationChain msgs) {
		PostLoad oldPostLoad = postLoad;
		postLoad = newPostLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_LOAD, oldPostLoad, newPostLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostLoad(PostLoad newPostLoad) {
		if (newPostLoad != postLoad) {
			NotificationChain msgs = null;
			if (postLoad != null)
				msgs = ((InternalEObject)postLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_LOAD, null, msgs);
			if (newPostLoad != null)
				msgs = ((InternalEObject)newPostLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_LOAD, null, msgs);
			msgs = basicSetPostLoad(newPostLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_LOAD, newPostLoad, newPostLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeOverride> getAttributeOverride() {
		if (attributeOverride == null) {
			attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE);
		}
		return attributeOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssociationOverride> getAssociationOverride() {
		if (associationOverride == null) {
			associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.ENTITY__ASSOCIATION_OVERRIDE);
		}
		return associationOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
		Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attributes newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		boolean oldAccessESet = accessESet;
		accessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ACCESS, oldAccess, access, !oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccess() {
		AccessType oldAccess = access;
		boolean oldAccessESet = accessESet;
		access = ACCESS_EDEFAULT;
		accessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccess() {
		return accessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetadataComplete() {
		return metadataComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadataComplete(boolean newMetadataComplete) {
		boolean oldMetadataComplete = metadataComplete;
		metadataComplete = newMetadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMetadataComplete() {
		boolean oldMetadataComplete = metadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataComplete = METADATA_COMPLETE_EDEFAULT;
		metadataCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataComplete() {
		return metadataCompleteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ENTITY__TABLE:
				return basicSetTable(null, msgs);
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return ((InternalEList<?>)getSecondaryTable()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return ((InternalEList<?>)getPrimaryKeyJoinColumn()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ID_CLASS:
				return basicSetIdClass(null, msgs);
			case OrmPackage.ENTITY__INHERITANCE:
				return basicSetInheritance(null, msgs);
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				return basicSetDiscriminatorColumn(null, msgs);
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				return basicSetSequenceGenerator(null, msgs);
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				return basicSetTableGenerator(null, msgs);
			case OrmPackage.ENTITY__NAMED_QUERY:
				return ((InternalEList<?>)getNamedQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return ((InternalEList<?>)getNamedNativeQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				return ((InternalEList<?>)getSqlResultSetMapping()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				return basicSetExcludeDefaultListeners(null, msgs);
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				return basicSetExcludeSuperclassListeners(null, msgs);
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				return basicSetEntityListeners(null, msgs);
			case OrmPackage.ENTITY__PRE_PERSIST:
				return basicSetPrePersist(null, msgs);
			case OrmPackage.ENTITY__POST_PERSIST:
				return basicSetPostPersist(null, msgs);
			case OrmPackage.ENTITY__PRE_REMOVE:
				return basicSetPreRemove(null, msgs);
			case OrmPackage.ENTITY__POST_REMOVE:
				return basicSetPostRemove(null, msgs);
			case OrmPackage.ENTITY__PRE_UPDATE:
				return basicSetPreUpdate(null, msgs);
			case OrmPackage.ENTITY__POST_UPDATE:
				return basicSetPostUpdate(null, msgs);
			case OrmPackage.ENTITY__POST_LOAD:
				return basicSetPostLoad(null, msgs);
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				return getDescription();
			case OrmPackage.ENTITY__TABLE:
				return getTable();
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return getSecondaryTable();
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return getPrimaryKeyJoinColumn();
			case OrmPackage.ENTITY__ID_CLASS:
				return getIdClass();
			case OrmPackage.ENTITY__INHERITANCE:
				return getInheritance();
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				return getDiscriminatorValue();
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				return getDiscriminatorColumn();
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				return getTableGenerator();
			case OrmPackage.ENTITY__NAMED_QUERY:
				return getNamedQuery();
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return getNamedNativeQuery();
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				return getSqlResultSetMapping();
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				return getExcludeDefaultListeners();
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				return getExcludeSuperclassListeners();
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				return getEntityListeners();
			case OrmPackage.ENTITY__PRE_PERSIST:
				return getPrePersist();
			case OrmPackage.ENTITY__POST_PERSIST:
				return getPostPersist();
			case OrmPackage.ENTITY__PRE_REMOVE:
				return getPreRemove();
			case OrmPackage.ENTITY__POST_REMOVE:
				return getPostRemove();
			case OrmPackage.ENTITY__PRE_UPDATE:
				return getPreUpdate();
			case OrmPackage.ENTITY__POST_UPDATE:
				return getPostUpdate();
			case OrmPackage.ENTITY__POST_LOAD:
				return getPostLoad();
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				return getAttributeOverride();
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				return getAssociationOverride();
			case OrmPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case OrmPackage.ENTITY__ACCESS:
				return getAccess();
			case OrmPackage.ENTITY__CLASS:
				return getClass_();
			case OrmPackage.ENTITY__METADATA_COMPLETE:
				return isMetadataComplete() ? Boolean.TRUE : Boolean.FALSE;
			case OrmPackage.ENTITY__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.ENTITY__TABLE:
				setTable((Table)newValue);
				return;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				getSecondaryTable().clear();
				getSecondaryTable().addAll((Collection<? extends SecondaryTable>)newValue);
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				getPrimaryKeyJoinColumn().clear();
				getPrimaryKeyJoinColumn().addAll((Collection<? extends PrimaryKeyJoinColumn>)newValue);
				return;
			case OrmPackage.ENTITY__ID_CLASS:
				setIdClass((IdClass)newValue);
				return;
			case OrmPackage.ENTITY__INHERITANCE:
				setInheritance((Inheritance)newValue);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((String)newValue);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)newValue);
				return;
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_QUERY:
				getNamedQuery().clear();
				getNamedQuery().addAll((Collection<? extends NamedQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				getNamedNativeQuery().addAll((Collection<? extends NamedNativeQuery>)newValue);
				return;
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				getSqlResultSetMapping().addAll((Collection<? extends SqlResultSetMapping>)newValue);
				return;
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)newValue);
				return;
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)newValue);
				return;
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)newValue);
				return;
			case OrmPackage.ENTITY__PRE_PERSIST:
				setPrePersist((PrePersist)newValue);
				return;
			case OrmPackage.ENTITY__POST_PERSIST:
				setPostPersist((PostPersist)newValue);
				return;
			case OrmPackage.ENTITY__PRE_REMOVE:
				setPreRemove((PreRemove)newValue);
				return;
			case OrmPackage.ENTITY__POST_REMOVE:
				setPostRemove((PostRemove)newValue);
				return;
			case OrmPackage.ENTITY__PRE_UPDATE:
				setPreUpdate((PreUpdate)newValue);
				return;
			case OrmPackage.ENTITY__POST_UPDATE:
				setPostUpdate((PostUpdate)newValue);
				return;
			case OrmPackage.ENTITY__POST_LOAD:
				setPostLoad((PostLoad)newValue);
				return;
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				getAttributeOverride().clear();
				getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
				return;
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				getAssociationOverride().clear();
				getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
				return;
			case OrmPackage.ENTITY__ATTRIBUTES:
				setAttributes((Attributes)newValue);
				return;
			case OrmPackage.ENTITY__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.ENTITY__CLASS:
				setClass((String)newValue);
				return;
			case OrmPackage.ENTITY__METADATA_COMPLETE:
				setMetadataComplete(((Boolean)newValue).booleanValue());
				return;
			case OrmPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.ENTITY__TABLE:
				setTable((Table)null);
				return;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				getSecondaryTable().clear();
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				getPrimaryKeyJoinColumn().clear();
				return;
			case OrmPackage.ENTITY__ID_CLASS:
				setIdClass((IdClass)null);
				return;
			case OrmPackage.ENTITY__INHERITANCE:
				setInheritance((Inheritance)null);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)null);
				return;
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
				return;
			case OrmPackage.ENTITY__NAMED_QUERY:
				getNamedQuery().clear();
				return;
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				return;
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				return;
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)null);
				return;
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)null);
				return;
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)null);
				return;
			case OrmPackage.ENTITY__PRE_PERSIST:
				setPrePersist((PrePersist)null);
				return;
			case OrmPackage.ENTITY__POST_PERSIST:
				setPostPersist((PostPersist)null);
				return;
			case OrmPackage.ENTITY__PRE_REMOVE:
				setPreRemove((PreRemove)null);
				return;
			case OrmPackage.ENTITY__POST_REMOVE:
				setPostRemove((PostRemove)null);
				return;
			case OrmPackage.ENTITY__PRE_UPDATE:
				setPreUpdate((PreUpdate)null);
				return;
			case OrmPackage.ENTITY__POST_UPDATE:
				setPostUpdate((PostUpdate)null);
				return;
			case OrmPackage.ENTITY__POST_LOAD:
				setPostLoad((PostLoad)null);
				return;
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				getAttributeOverride().clear();
				return;
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				getAssociationOverride().clear();
				return;
			case OrmPackage.ENTITY__ATTRIBUTES:
				setAttributes((Attributes)null);
				return;
			case OrmPackage.ENTITY__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.ENTITY__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case OrmPackage.ENTITY__METADATA_COMPLETE:
				unsetMetadataComplete();
				return;
			case OrmPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.ENTITY__TABLE:
				return table != null;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return secondaryTable != null && !secondaryTable.isEmpty();
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return primaryKeyJoinColumn != null && !primaryKeyJoinColumn.isEmpty();
			case OrmPackage.ENTITY__ID_CLASS:
				return idClass != null;
			case OrmPackage.ENTITY__INHERITANCE:
				return inheritance != null;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT.equals(discriminatorValue);
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				return discriminatorColumn != null;
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				return sequenceGenerator != null;
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				return tableGenerator != null;
			case OrmPackage.ENTITY__NAMED_QUERY:
				return namedQuery != null && !namedQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return namedNativeQuery != null && !namedNativeQuery.isEmpty();
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				return sqlResultSetMapping != null && !sqlResultSetMapping.isEmpty();
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				return excludeDefaultListeners != null;
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				return excludeSuperclassListeners != null;
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				return entityListeners != null;
			case OrmPackage.ENTITY__PRE_PERSIST:
				return prePersist != null;
			case OrmPackage.ENTITY__POST_PERSIST:
				return postPersist != null;
			case OrmPackage.ENTITY__PRE_REMOVE:
				return preRemove != null;
			case OrmPackage.ENTITY__POST_REMOVE:
				return postRemove != null;
			case OrmPackage.ENTITY__PRE_UPDATE:
				return preUpdate != null;
			case OrmPackage.ENTITY__POST_UPDATE:
				return postUpdate != null;
			case OrmPackage.ENTITY__POST_LOAD:
				return postLoad != null;
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				return attributeOverride != null && !attributeOverride.isEmpty();
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				return associationOverride != null && !associationOverride.isEmpty();
			case OrmPackage.ENTITY__ATTRIBUTES:
				return attributes != null;
			case OrmPackage.ENTITY__ACCESS:
				return isSetAccess();
			case OrmPackage.ENTITY__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case OrmPackage.ENTITY__METADATA_COMPLETE:
				return isSetMetadataComplete();
			case OrmPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", discriminatorValue: ");
		result.append(discriminatorValue);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", metadataComplete: ");
		if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
