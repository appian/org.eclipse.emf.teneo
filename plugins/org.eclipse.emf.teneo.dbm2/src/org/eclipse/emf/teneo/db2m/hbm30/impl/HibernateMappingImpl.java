/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernateMappingImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject;
import org.eclipse.emf.teneo.db2m.hbm30.FilterDef;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping;
import org.eclipse.emf.teneo.db2m.hbm30.Import;
import org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.Query;
import org.eclipse.emf.teneo.db2m.hbm30.Resultset;
import org.eclipse.emf.teneo.db2m.hbm30.SqlQuery;
import org.eclipse.emf.teneo.db2m.hbm30.Subclass;
import org.eclipse.emf.teneo.db2m.hbm30.Typedef;
import org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hibernate Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getTypedef <em>Typedef</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getJoinedSubclass <em>Joined Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getUnionSubclass <em>Union Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getFilterDef <em>Filter Def</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getDatabaseObject <em>Database Object</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#isAutoImport <em>Auto Import</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getDefaultCascade <em>Default Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#isDefaultLazy <em>Default Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.HibernateMappingImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HibernateMappingImpl extends EObjectImpl implements HibernateMapping {
	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> meta;

	/**
	 * The cached value of the '{@link #getTypedef() <em>Typedef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedef()
	 * @generated
	 * @ordered
	 */
	protected EList<Typedef> typedef;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getResultset() <em>Resultset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultset()
	 * @generated
	 * @ordered
	 */
	protected EList<Resultset> resultset;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The cached value of the '{@link #getFilterDef() <em>Filter Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterDef()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterDef> filterDef;

	/**
	 * The cached value of the '{@link #getDatabaseObject() <em>Database Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseObject()
	 * @generated
	 * @ordered
	 */
	protected EList<DatabaseObject> databaseObject;

	/**
	 * The default value of the '{@link #isAutoImport() <em>Auto Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoImport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_IMPORT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutoImport() <em>Auto Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoImport()
	 * @generated
	 * @ordered
	 */
	protected boolean autoImport = AUTO_IMPORT_EDEFAULT;

	/**
	 * This is true if the Auto Import attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoImportESet;

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
	 * The default value of the '{@link #getDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_ACCESS_EDEFAULT = "property";

	/**
	 * The cached value of the '{@link #getDefaultAccess() <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAccess()
	 * @generated
	 * @ordered
	 */
	protected String defaultAccess = DEFAULT_ACCESS_EDEFAULT;

	/**
	 * This is true if the Default Access attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultAccessESet;

	/**
	 * The default value of the '{@link #getDefaultCascade() <em>Default Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCascade()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CASCADE_EDEFAULT = "none";

	/**
	 * The cached value of the '{@link #getDefaultCascade() <em>Default Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCascade()
	 * @generated
	 * @ordered
	 */
	protected String defaultCascade = DEFAULT_CASCADE_EDEFAULT;

	/**
	 * This is true if the Default Cascade attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultCascadeESet;

	/**
	 * The default value of the '{@link #isDefaultLazy() <em>Default Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_LAZY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefaultLazy() <em>Default Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultLazy = DEFAULT_LAZY_EDEFAULT;

	/**
	 * This is true if the Default Lazy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultLazyESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibernateMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getHibernateMapping();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.HIBERNATE_MAPPING__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Typedef> getTypedef() {
		if (typedef == null) {
			typedef = new EObjectContainmentEList<Typedef>(Typedef.class, this, Hbm30Package.HIBERNATE_MAPPING__TYPEDEF);
		}
		return typedef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, Hbm30Package.HIBERNATE_MAPPING__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.HIBERNATE_MAPPING__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.emf.teneo.db2m.hbm30.Class> getClass_() {
		return getGroup().list(Hbm30Package.eINSTANCE.getHibernateMapping_Class());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subclass> getSubclass() {
		return getGroup().list(Hbm30Package.eINSTANCE.getHibernateMapping_Subclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedSubclass> getJoinedSubclass() {
		return getGroup().list(Hbm30Package.eINSTANCE.getHibernateMapping_JoinedSubclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionSubclass> getUnionSubclass() {
		return getGroup().list(Hbm30Package.eINSTANCE.getHibernateMapping_UnionSubclass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resultset> getResultset() {
		if (resultset == null) {
			resultset = new EObjectContainmentEList<Resultset>(Resultset.class, this, Hbm30Package.HIBERNATE_MAPPING__RESULTSET);
		}
		return resultset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, Hbm30Package.HIBERNATE_MAPPING__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getHibernateMapping_Query());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqlQuery> getSqlQuery() {
		return getGroup1().list(Hbm30Package.eINSTANCE.getHibernateMapping_SqlQuery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterDef> getFilterDef() {
		if (filterDef == null) {
			filterDef = new EObjectContainmentEList<FilterDef>(FilterDef.class, this, Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF);
		}
		return filterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatabaseObject> getDatabaseObject() {
		if (databaseObject == null) {
			databaseObject = new EObjectContainmentEList<DatabaseObject>(DatabaseObject.class, this, Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT);
		}
		return databaseObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoImport() {
		return autoImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoImport(boolean newAutoImport) {
		boolean oldAutoImport = autoImport;
		autoImport = newAutoImport;
		boolean oldAutoImportESet = autoImportESet;
		autoImportESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT, oldAutoImport, autoImport, !oldAutoImportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoImport() {
		boolean oldAutoImport = autoImport;
		boolean oldAutoImportESet = autoImportESet;
		autoImport = AUTO_IMPORT_EDEFAULT;
		autoImportESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT, oldAutoImport, AUTO_IMPORT_EDEFAULT, oldAutoImportESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoImport() {
		return autoImportESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultAccess() {
		return defaultAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAccess(String newDefaultAccess) {
		String oldDefaultAccess = defaultAccess;
		defaultAccess = newDefaultAccess;
		boolean oldDefaultAccessESet = defaultAccessESet;
		defaultAccessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS, oldDefaultAccess, defaultAccess, !oldDefaultAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultAccess() {
		String oldDefaultAccess = defaultAccess;
		boolean oldDefaultAccessESet = defaultAccessESet;
		defaultAccess = DEFAULT_ACCESS_EDEFAULT;
		defaultAccessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS, oldDefaultAccess, DEFAULT_ACCESS_EDEFAULT, oldDefaultAccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultAccess() {
		return defaultAccessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCascade() {
		return defaultCascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCascade(String newDefaultCascade) {
		String oldDefaultCascade = defaultCascade;
		defaultCascade = newDefaultCascade;
		boolean oldDefaultCascadeESet = defaultCascadeESet;
		defaultCascadeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE, oldDefaultCascade, defaultCascade, !oldDefaultCascadeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultCascade() {
		String oldDefaultCascade = defaultCascade;
		boolean oldDefaultCascadeESet = defaultCascadeESet;
		defaultCascade = DEFAULT_CASCADE_EDEFAULT;
		defaultCascadeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE, oldDefaultCascade, DEFAULT_CASCADE_EDEFAULT, oldDefaultCascadeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultCascade() {
		return defaultCascadeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultLazy() {
		return defaultLazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultLazy(boolean newDefaultLazy) {
		boolean oldDefaultLazy = defaultLazy;
		defaultLazy = newDefaultLazy;
		boolean oldDefaultLazyESet = defaultLazyESet;
		defaultLazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY, oldDefaultLazy, defaultLazy, !oldDefaultLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultLazy() {
		boolean oldDefaultLazy = defaultLazy;
		boolean oldDefaultLazyESet = defaultLazyESet;
		defaultLazy = DEFAULT_LAZY_EDEFAULT;
		defaultLazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY, oldDefaultLazy, DEFAULT_LAZY_EDEFAULT, oldDefaultLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultLazy() {
		return defaultLazyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__PACKAGE, oldPackage, package_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.HIBERNATE_MAPPING__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.HIBERNATE_MAPPING__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
				return ((InternalEList<?>)getTypedef()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__SUBCLASS:
				return ((InternalEList<?>)getSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__JOINED_SUBCLASS:
				return ((InternalEList<?>)getJoinedSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__UNION_SUBCLASS:
				return ((InternalEList<?>)getUnionSubclass()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
				return ((InternalEList<?>)getResultset()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__SQL_QUERY:
				return ((InternalEList<?>)getSqlQuery()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
				return ((InternalEList<?>)getFilterDef()).basicRemove(otherEnd, msgs);
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
				return ((InternalEList<?>)getDatabaseObject()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.HIBERNATE_MAPPING__META:
				return getMeta();
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
				return getTypedef();
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
				return getImport();
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.HIBERNATE_MAPPING__CLASS:
				return getClass_();
			case Hbm30Package.HIBERNATE_MAPPING__SUBCLASS:
				return getSubclass();
			case Hbm30Package.HIBERNATE_MAPPING__JOINED_SUBCLASS:
				return getJoinedSubclass();
			case Hbm30Package.HIBERNATE_MAPPING__UNION_SUBCLASS:
				return getUnionSubclass();
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
				return getResultset();
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case Hbm30Package.HIBERNATE_MAPPING__QUERY:
				return getQuery();
			case Hbm30Package.HIBERNATE_MAPPING__SQL_QUERY:
				return getSqlQuery();
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
				return getFilterDef();
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
				return getDatabaseObject();
			case Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT:
				return isAutoImport();
			case Hbm30Package.HIBERNATE_MAPPING__CATALOG:
				return getCatalog();
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS:
				return getDefaultAccess();
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE:
				return getDefaultCascade();
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY:
				return isDefaultLazy();
			case Hbm30Package.HIBERNATE_MAPPING__PACKAGE:
				return getPackage();
			case Hbm30Package.HIBERNATE_MAPPING__SCHEMA:
				return getSchema();
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
			case Hbm30Package.HIBERNATE_MAPPING__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
				getTypedef().clear();
				getTypedef().addAll((Collection<? extends Typedef>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends org.eclipse.emf.teneo.db2m.hbm30.Class>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SUBCLASS:
				getSubclass().clear();
				getSubclass().addAll((Collection<? extends Subclass>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				getJoinedSubclass().addAll((Collection<? extends JoinedSubclass>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__UNION_SUBCLASS:
				getUnionSubclass().clear();
				getUnionSubclass().addAll((Collection<? extends UnionSubclass>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
				getResultset().clear();
				getResultset().addAll((Collection<? extends Resultset>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SQL_QUERY:
				getSqlQuery().clear();
				getSqlQuery().addAll((Collection<? extends SqlQuery>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
				getFilterDef().clear();
				getFilterDef().addAll((Collection<? extends FilterDef>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
				getDatabaseObject().clear();
				getDatabaseObject().addAll((Collection<? extends DatabaseObject>)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT:
				setAutoImport((Boolean)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__CATALOG:
				setCatalog((String)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS:
				setDefaultAccess((String)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE:
				setDefaultCascade((String)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY:
				setDefaultLazy((Boolean)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__PACKAGE:
				setPackage((String)newValue);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SCHEMA:
				setSchema((String)newValue);
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
			case Hbm30Package.HIBERNATE_MAPPING__META:
				getMeta().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
				getTypedef().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
				getImport().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__CLASS:
				getClass_().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SUBCLASS:
				getSubclass().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__JOINED_SUBCLASS:
				getJoinedSubclass().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__UNION_SUBCLASS:
				getUnionSubclass().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
				getResultset().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
				getGroup1().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__QUERY:
				getQuery().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SQL_QUERY:
				getSqlQuery().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
				getFilterDef().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
				getDatabaseObject().clear();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT:
				unsetAutoImport();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS:
				unsetDefaultAccess();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE:
				unsetDefaultCascade();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY:
				unsetDefaultLazy();
				return;
			case Hbm30Package.HIBERNATE_MAPPING__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case Hbm30Package.HIBERNATE_MAPPING__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
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
			case Hbm30Package.HIBERNATE_MAPPING__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__TYPEDEF:
				return typedef != null && !typedef.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__IMPORT:
				return import_ != null && !import_.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__CLASS:
				return !getClass_().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__SUBCLASS:
				return !getSubclass().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__JOINED_SUBCLASS:
				return !getJoinedSubclass().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__UNION_SUBCLASS:
				return !getUnionSubclass().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__RESULTSET:
				return resultset != null && !resultset.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__GROUP1:
				return group1 != null && !group1.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__QUERY:
				return !getQuery().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__SQL_QUERY:
				return !getSqlQuery().isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__FILTER_DEF:
				return filterDef != null && !filterDef.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__DATABASE_OBJECT:
				return databaseObject != null && !databaseObject.isEmpty();
			case Hbm30Package.HIBERNATE_MAPPING__AUTO_IMPORT:
				return isSetAutoImport();
			case Hbm30Package.HIBERNATE_MAPPING__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_ACCESS:
				return isSetDefaultAccess();
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_CASCADE:
				return isSetDefaultCascade();
			case Hbm30Package.HIBERNATE_MAPPING__DEFAULT_LAZY:
				return isSetDefaultLazy();
			case Hbm30Package.HIBERNATE_MAPPING__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case Hbm30Package.HIBERNATE_MAPPING__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", autoImport: ");
		if (autoImportESet) result.append(autoImport); else result.append("<unset>");
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", defaultAccess: ");
		if (defaultAccessESet) result.append(defaultAccess); else result.append("<unset>");
		result.append(", defaultCascade: ");
		if (defaultCascadeESet) result.append(defaultCascade); else result.append("<unset>");
		result.append(", defaultLazy: ");
		if (defaultLazyESet) result.append(defaultLazy); else result.append("<unset>");
		result.append(", package: ");
		result.append(package_);
		result.append(", schema: ");
		result.append(schema);
		result.append(')');
		return result.toString();
	}

} //HibernateMappingImpl
