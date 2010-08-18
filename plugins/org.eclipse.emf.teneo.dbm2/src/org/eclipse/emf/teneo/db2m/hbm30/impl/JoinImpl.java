/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.Any;
import org.eclipse.emf.teneo.db2m.hbm30.Component;
import org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent;
import org.eclipse.emf.teneo.db2m.hbm30.Fetch;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Join;
import org.eclipse.emf.teneo.db2m.hbm30.Key;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.SqlDelete;
import org.eclipse.emf.teneo.db2m.hbm30.SqlInsert;
import org.eclipse.emf.teneo.db2m.hbm30.SqlUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#isInverse <em>Inverse</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.JoinImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends EObjectImpl implements Join {
	/**
	 * The default value of the '{@link #getSubselect() <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubselect() <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect()
	 * @generated
	 * @ordered
	 */
	protected String subselect = SUBSELECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Key key;

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
	 * The cached value of the '{@link #getSqlInsert() <em>Sql Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlInsert()
	 * @generated
	 * @ordered
	 */
	protected SqlInsert sqlInsert;

	/**
	 * The cached value of the '{@link #getSqlUpdate() <em>Sql Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlUpdate()
	 * @generated
	 * @ordered
	 */
	protected SqlUpdate sqlUpdate;

	/**
	 * The cached value of the '{@link #getSqlDelete() <em>Sql Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlDelete()
	 * @generated
	 * @ordered
	 */
	protected SqlDelete sqlDelete;

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
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final Fetch FETCH_EDEFAULT = Fetch.JOIN;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected Fetch fetch = FETCH_EDEFAULT;

	/**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchESet;

	/**
	 * The default value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverse() <em>Inverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverse()
	 * @generated
	 * @ordered
	 */
	protected boolean inverse = INVERSE_EDEFAULT;

	/**
	 * This is true if the Inverse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inverseESet;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

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
	 * The default value of the '{@link #getSubselect1() <em>Subselect1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect1()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSELECT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubselect1() <em>Subselect1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubselect1()
	 * @generated
	 * @ordered
	 */
	protected String subselect1 = SUBSELECT1_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getJoin();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubselect() {
		return subselect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubselect(String newSubselect) {
		String oldSubselect = subselect;
		subselect = newSubselect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SUBSELECT, oldSubselect, subselect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(Key newKey, NotificationChain msgs) {
		Key oldKey = key;
		key = newKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__KEY, oldKey, newKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Key newKey) {
		if (newKey != key) {
			NotificationChain msgs = null;
			if (key != null)
				msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__KEY, null, msgs);
			if (newKey != null)
				msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__KEY, null, msgs);
			msgs = basicSetKey(newKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__KEY, newKey, newKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.JOIN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoin_Property());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoin_ManyToOne());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoin_Component());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicComponent> getDynamicComponent() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoin_DynamicComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Any> getAny() {
		return getGroup().list(Hbm30Package.eINSTANCE.getJoin_Any());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlInsert getSqlInsert() {
		return sqlInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlInsert(SqlInsert newSqlInsert, NotificationChain msgs) {
		SqlInsert oldSqlInsert = sqlInsert;
		sqlInsert = newSqlInsert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_INSERT, oldSqlInsert, newSqlInsert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlInsert(SqlInsert newSqlInsert) {
		if (newSqlInsert != sqlInsert) {
			NotificationChain msgs = null;
			if (sqlInsert != null)
				msgs = ((InternalEObject)sqlInsert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_INSERT, null, msgs);
			if (newSqlInsert != null)
				msgs = ((InternalEObject)newSqlInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_INSERT, null, msgs);
			msgs = basicSetSqlInsert(newSqlInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_INSERT, newSqlInsert, newSqlInsert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlUpdate getSqlUpdate() {
		return sqlUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlUpdate(SqlUpdate newSqlUpdate, NotificationChain msgs) {
		SqlUpdate oldSqlUpdate = sqlUpdate;
		sqlUpdate = newSqlUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_UPDATE, oldSqlUpdate, newSqlUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlUpdate(SqlUpdate newSqlUpdate) {
		if (newSqlUpdate != sqlUpdate) {
			NotificationChain msgs = null;
			if (sqlUpdate != null)
				msgs = ((InternalEObject)sqlUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_UPDATE, null, msgs);
			if (newSqlUpdate != null)
				msgs = ((InternalEObject)newSqlUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_UPDATE, null, msgs);
			msgs = basicSetSqlUpdate(newSqlUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_UPDATE, newSqlUpdate, newSqlUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqlDelete getSqlDelete() {
		return sqlDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqlDelete(SqlDelete newSqlDelete, NotificationChain msgs) {
		SqlDelete oldSqlDelete = sqlDelete;
		sqlDelete = newSqlDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_DELETE, oldSqlDelete, newSqlDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlDelete(SqlDelete newSqlDelete) {
		if (newSqlDelete != sqlDelete) {
			NotificationChain msgs = null;
			if (sqlDelete != null)
				msgs = ((InternalEObject)sqlDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_DELETE, null, msgs);
			if (newSqlDelete != null)
				msgs = ((InternalEObject)newSqlDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.JOIN__SQL_DELETE, null, msgs);
			msgs = basicSetSqlDelete(newSqlDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SQL_DELETE, newSqlDelete, newSqlDelete));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(Fetch newFetch) {
		Fetch oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__FETCH, oldFetch, fetch, !oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFetch() {
		Fetch oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOIN__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFetch() {
		return fetchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverse() {
		return inverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverse(boolean newInverse) {
		boolean oldInverse = inverse;
		inverse = newInverse;
		boolean oldInverseESet = inverseESet;
		inverseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__INVERSE, oldInverse, inverse, !oldInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInverse() {
		boolean oldInverse = inverse;
		boolean oldInverseESet = inverseESet;
		inverse = INVERSE_EDEFAULT;
		inverseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOIN__INVERSE, oldInverse, INVERSE_EDEFAULT, oldInverseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInverse() {
		return inverseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.JOIN__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptional() {
		return optionalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubselect1() {
		return subselect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubselect1(String newSubselect1) {
		String oldSubselect1 = subselect1;
		subselect1 = newSubselect1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__SUBSELECT1, oldSubselect1, subselect1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.JOIN__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.JOIN__KEY:
				return basicSetKey(null, msgs);
			case Hbm30Package.JOIN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__DYNAMIC_COMPONENT:
				return ((InternalEList<?>)getDynamicComponent()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case Hbm30Package.JOIN__SQL_INSERT:
				return basicSetSqlInsert(null, msgs);
			case Hbm30Package.JOIN__SQL_UPDATE:
				return basicSetSqlUpdate(null, msgs);
			case Hbm30Package.JOIN__SQL_DELETE:
				return basicSetSqlDelete(null, msgs);
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
			case Hbm30Package.JOIN__SUBSELECT:
				return getSubselect();
			case Hbm30Package.JOIN__COMMENT:
				return getComment();
			case Hbm30Package.JOIN__KEY:
				return getKey();
			case Hbm30Package.JOIN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.JOIN__PROPERTY:
				return getProperty();
			case Hbm30Package.JOIN__MANY_TO_ONE:
				return getManyToOne();
			case Hbm30Package.JOIN__COMPONENT:
				return getComponent();
			case Hbm30Package.JOIN__DYNAMIC_COMPONENT:
				return getDynamicComponent();
			case Hbm30Package.JOIN__ANY:
				return getAny();
			case Hbm30Package.JOIN__SQL_INSERT:
				return getSqlInsert();
			case Hbm30Package.JOIN__SQL_UPDATE:
				return getSqlUpdate();
			case Hbm30Package.JOIN__SQL_DELETE:
				return getSqlDelete();
			case Hbm30Package.JOIN__CATALOG:
				return getCatalog();
			case Hbm30Package.JOIN__FETCH:
				return getFetch();
			case Hbm30Package.JOIN__INVERSE:
				return isInverse();
			case Hbm30Package.JOIN__OPTIONAL:
				return isOptional();
			case Hbm30Package.JOIN__SCHEMA:
				return getSchema();
			case Hbm30Package.JOIN__SUBSELECT1:
				return getSubselect1();
			case Hbm30Package.JOIN__TABLE:
				return getTable();
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
			case Hbm30Package.JOIN__SUBSELECT:
				setSubselect((String)newValue);
				return;
			case Hbm30Package.JOIN__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.JOIN__KEY:
				setKey((Key)newValue);
				return;
			case Hbm30Package.JOIN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.JOIN__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Hbm30Package.JOIN__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
				return;
			case Hbm30Package.JOIN__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Hbm30Package.JOIN__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				getDynamicComponent().addAll((Collection<? extends DynamicComponent>)newValue);
				return;
			case Hbm30Package.JOIN__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends Any>)newValue);
				return;
			case Hbm30Package.JOIN__SQL_INSERT:
				setSqlInsert((SqlInsert)newValue);
				return;
			case Hbm30Package.JOIN__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)newValue);
				return;
			case Hbm30Package.JOIN__SQL_DELETE:
				setSqlDelete((SqlDelete)newValue);
				return;
			case Hbm30Package.JOIN__CATALOG:
				setCatalog((String)newValue);
				return;
			case Hbm30Package.JOIN__FETCH:
				setFetch((Fetch)newValue);
				return;
			case Hbm30Package.JOIN__INVERSE:
				setInverse((Boolean)newValue);
				return;
			case Hbm30Package.JOIN__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case Hbm30Package.JOIN__SCHEMA:
				setSchema((String)newValue);
				return;
			case Hbm30Package.JOIN__SUBSELECT1:
				setSubselect1((String)newValue);
				return;
			case Hbm30Package.JOIN__TABLE:
				setTable((String)newValue);
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
			case Hbm30Package.JOIN__SUBSELECT:
				setSubselect(SUBSELECT_EDEFAULT);
				return;
			case Hbm30Package.JOIN__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.JOIN__KEY:
				setKey((Key)null);
				return;
			case Hbm30Package.JOIN__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.JOIN__PROPERTY:
				getProperty().clear();
				return;
			case Hbm30Package.JOIN__MANY_TO_ONE:
				getManyToOne().clear();
				return;
			case Hbm30Package.JOIN__COMPONENT:
				getComponent().clear();
				return;
			case Hbm30Package.JOIN__DYNAMIC_COMPONENT:
				getDynamicComponent().clear();
				return;
			case Hbm30Package.JOIN__ANY:
				getAny().clear();
				return;
			case Hbm30Package.JOIN__SQL_INSERT:
				setSqlInsert((SqlInsert)null);
				return;
			case Hbm30Package.JOIN__SQL_UPDATE:
				setSqlUpdate((SqlUpdate)null);
				return;
			case Hbm30Package.JOIN__SQL_DELETE:
				setSqlDelete((SqlDelete)null);
				return;
			case Hbm30Package.JOIN__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case Hbm30Package.JOIN__FETCH:
				unsetFetch();
				return;
			case Hbm30Package.JOIN__INVERSE:
				unsetInverse();
				return;
			case Hbm30Package.JOIN__OPTIONAL:
				unsetOptional();
				return;
			case Hbm30Package.JOIN__SCHEMA:
				setSchema(SCHEMA_EDEFAULT);
				return;
			case Hbm30Package.JOIN__SUBSELECT1:
				setSubselect1(SUBSELECT1_EDEFAULT);
				return;
			case Hbm30Package.JOIN__TABLE:
				setTable(TABLE_EDEFAULT);
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
			case Hbm30Package.JOIN__SUBSELECT:
				return SUBSELECT_EDEFAULT == null ? subselect != null : !SUBSELECT_EDEFAULT.equals(subselect);
			case Hbm30Package.JOIN__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.JOIN__KEY:
				return key != null;
			case Hbm30Package.JOIN__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.JOIN__PROPERTY:
				return !getProperty().isEmpty();
			case Hbm30Package.JOIN__MANY_TO_ONE:
				return !getManyToOne().isEmpty();
			case Hbm30Package.JOIN__COMPONENT:
				return !getComponent().isEmpty();
			case Hbm30Package.JOIN__DYNAMIC_COMPONENT:
				return !getDynamicComponent().isEmpty();
			case Hbm30Package.JOIN__ANY:
				return !getAny().isEmpty();
			case Hbm30Package.JOIN__SQL_INSERT:
				return sqlInsert != null;
			case Hbm30Package.JOIN__SQL_UPDATE:
				return sqlUpdate != null;
			case Hbm30Package.JOIN__SQL_DELETE:
				return sqlDelete != null;
			case Hbm30Package.JOIN__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case Hbm30Package.JOIN__FETCH:
				return isSetFetch();
			case Hbm30Package.JOIN__INVERSE:
				return isSetInverse();
			case Hbm30Package.JOIN__OPTIONAL:
				return isSetOptional();
			case Hbm30Package.JOIN__SCHEMA:
				return SCHEMA_EDEFAULT == null ? schema != null : !SCHEMA_EDEFAULT.equals(schema);
			case Hbm30Package.JOIN__SUBSELECT1:
				return SUBSELECT1_EDEFAULT == null ? subselect1 != null : !SUBSELECT1_EDEFAULT.equals(subselect1);
			case Hbm30Package.JOIN__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
		result.append(" (subselect: ");
		result.append(subselect);
		result.append(", comment: ");
		result.append(comment);
		result.append(", group: ");
		result.append(group);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", inverse: ");
		if (inverseESet) result.append(inverse); else result.append("<unset>");
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(", schema: ");
		result.append(schema);
		result.append(", subselect1: ");
		result.append(subselect1);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
