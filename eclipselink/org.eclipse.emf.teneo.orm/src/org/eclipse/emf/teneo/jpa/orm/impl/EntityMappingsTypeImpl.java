/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityMappingsTypeImpl.java,v 1.1 2009/03/15 23:45:02 mtaal Exp $
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
import org.eclipse.emf.teneo.jpa.orm.Embeddable;
import org.eclipse.emf.teneo.jpa.orm.Entity;
import org.eclipse.emf.teneo.jpa.orm.EntityMappingsType;
import org.eclipse.emf.teneo.jpa.orm.MappedSuperclass;
import org.eclipse.emf.teneo.jpa.orm.NamedNativeQuery;
import org.eclipse.emf.teneo.jpa.orm.NamedQuery;
import org.eclipse.emf.teneo.jpa.orm.OrmPackage;
import org.eclipse.emf.teneo.jpa.orm.PersistenceUnitMetadata;
import org.eclipse.emf.teneo.jpa.orm.SequenceGenerator;
import org.eclipse.emf.teneo.jpa.orm.SqlResultSetMapping;
import org.eclipse.emf.teneo.jpa.orm.TableGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Mappings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getMappedSuperclass <em>Mapped Superclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getEmbeddable <em>Embeddable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityMappingsTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityMappingsTypeImpl extends EObjectImpl implements EntityMappingsType {
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
	 * The cached value of the '{@link #getPersistenceUnitMetadata() <em>Persistence Unit Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnitMetadata()
	 * @generated
	 * @ordered
	 */
	protected PersistenceUnitMetadata persistenceUnitMetadata;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected String schema = SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

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
	 * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceGenerator> sequenceGenerator;

	/**
	 * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList<TableGenerator> tableGenerator;

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
	 * The cached value of the '{@link #getMappedSuperclass() <em>Mapped Superclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedSuperclass()
	 * @generated
	 * @ordered
	 */
	protected EList<MappedSuperclass> mappedSuperclass;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getEmbeddable() <em>Embeddable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddable()
	 * @generated
	 * @ordered
	 */
	protected EList<Embeddable> embeddable;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityMappingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ENTITY_MAPPINGS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceUnitMetadata getPersistenceUnitMetadata() {
		return persistenceUnitMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata, NotificationChain msgs) {
		PersistenceUnitMetadata oldPersistenceUnitMetadata = persistenceUnitMetadata;
		persistenceUnitMetadata = newPersistenceUnitMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, oldPersistenceUnitMetadata, newPersistenceUnitMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnitMetadata(PersistenceUnitMetadata newPersistenceUnitMetadata) {
		if (newPersistenceUnitMetadata != persistenceUnitMetadata) {
			NotificationChain msgs = null;
			if (persistenceUnitMetadata != null)
				msgs = ((InternalEObject)persistenceUnitMetadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, null, msgs);
			if (newPersistenceUnitMetadata != null)
				msgs = ((InternalEObject)newPersistenceUnitMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, null, msgs);
			msgs = basicSetPersistenceUnitMetadata(newPersistenceUnitMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA, newPersistenceUnitMetadata, newPersistenceUnitMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(String newPackage) {
		String oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(String newSchema) {
		String oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG, oldCatalog, catalog));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS, oldAccess, access, !oldAccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
	public EList<SequenceGenerator> getSequenceGenerator() {
		if (sequenceGenerator == null) {
			sequenceGenerator = new EObjectContainmentEList<SequenceGenerator>(SequenceGenerator.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR);
		}
		return sequenceGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableGenerator> getTableGenerator() {
		if (tableGenerator == null) {
			tableGenerator = new EObjectContainmentEList<TableGenerator>(TableGenerator.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR);
		}
		return tableGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedQuery> getNamedQuery() {
		if (namedQuery == null) {
			namedQuery = new EObjectContainmentEList<NamedQuery>(NamedQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY);
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
			namedNativeQuery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY);
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
			sqlResultSetMapping = new EObjectContainmentEList<SqlResultSetMapping>(SqlResultSetMapping.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING);
		}
		return sqlResultSetMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappedSuperclass> getMappedSuperclass() {
		if (mappedSuperclass == null) {
			mappedSuperclass = new EObjectContainmentEList<MappedSuperclass>(MappedSuperclass.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS);
		}
		return mappedSuperclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Embeddable> getEmbeddable() {
		if (embeddable == null) {
			embeddable = new EObjectContainmentEList<Embeddable>(Embeddable.class, this, OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE);
		}
		return embeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
				return basicSetPersistenceUnitMetadata(null, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
				return ((InternalEList<?>)getSequenceGenerator()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
				return ((InternalEList<?>)getTableGenerator()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
				return ((InternalEList<?>)getNamedQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
				return ((InternalEList<?>)getNamedNativeQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
				return ((InternalEList<?>)getSqlResultSetMapping()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
				return ((InternalEList<?>)getMappedSuperclass()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
				return ((InternalEList<?>)getEmbeddable()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
				return getDescription();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
				return getPersistenceUnitMetadata();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
				return getPackage();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
				return getSchema();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
				return getCatalog();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
				return getAccess();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
				return getSequenceGenerator();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
				return getTableGenerator();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
				return getNamedQuery();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
				return getNamedNativeQuery();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
				return getSqlResultSetMapping();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
				return getMappedSuperclass();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
				return getEntity();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
				return getEmbeddable();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
				return getVersion();
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
			case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
				setPersistenceUnitMetadata((PersistenceUnitMetadata)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
				setPackage((String)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
				setSchema((String)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
				setCatalog((String)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
				getSequenceGenerator().clear();
				getSequenceGenerator().addAll((Collection<? extends SequenceGenerator>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
				getTableGenerator().clear();
				getTableGenerator().addAll((Collection<? extends TableGenerator>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
				getNamedQuery().clear();
				getNamedQuery().addAll((Collection<? extends NamedQuery>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				getNamedNativeQuery().addAll((Collection<? extends NamedNativeQuery>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				getSqlResultSetMapping().addAll((Collection<? extends SqlResultSetMapping>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
				getMappedSuperclass().clear();
				getMappedSuperclass().addAll((Collection<? extends MappedSuperclass>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
				getEmbeddable().clear();
				getEmbeddable().addAll((Collection<? extends Embeddable>)newValue);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
				setVersion((String)newValue);
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
			case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
				setPersistenceUnitMetadata((PersistenceUnitMetadata)null);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
				getSequenceGenerator().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
				getTableGenerator().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
				getNamedQuery().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
				getMappedSuperclass().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
				getEntity().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
				getEmbeddable().clear();
				return;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
				unsetVersion();
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
			case OrmPackage.ENTITY_MAPPINGS_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA:
				return persistenceUnitMetadata != null;
			case OrmPackage.ENTITY_MAPPINGS_TYPE__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ACCESS:
				return isSetAccess();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR:
				return sequenceGenerator != null && !sequenceGenerator.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR:
				return tableGenerator != null && !tableGenerator.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_QUERY:
				return namedQuery != null && !namedQuery.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY:
				return namedNativeQuery != null && !namedNativeQuery.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING:
				return sqlResultSetMapping != null && !sqlResultSetMapping.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS:
				return mappedSuperclass != null && !mappedSuperclass.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__ENTITY:
				return entity != null && !entity.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__EMBEDDABLE:
				return embeddable != null && !embeddable.isEmpty();
			case OrmPackage.ENTITY_MAPPINGS_TYPE__VERSION:
				return isSetVersion();
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
		result.append(", package: ");
		result.append(package_);
		result.append(", schema: ");
		result.append(schema);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EntityMappingsTypeImpl
