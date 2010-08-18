/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOneImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Lazy;
import org.eclipse.emf.teneo.db2m.hbm30.ManyToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.Notfound;
import org.eclipse.emf.teneo.db2m.hbm30.Outerjoin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getNotFound <em>Not Found</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#getUniqueKey <em>Unique Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ManyToOneImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToOneImpl extends EObjectImpl implements ManyToOne {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected static final String CASCADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
	protected String cascade = CASCADE_EDEFAULT;

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
	 * The default value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn1() <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn1()
	 * @generated
	 * @ordered
	 */
	protected String column1 = COLUMN1_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBED_XML_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected boolean embedXml = EMBED_XML_EDEFAULT;

	/**
	 * This is true if the Embed Xml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean embedXmlESet;

	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchJoinSelect FETCH_EDEFAULT = FetchJoinSelect.JOIN;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchJoinSelect fetch = FETCH_EDEFAULT;

	/**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fetchESet;

	/**
	 * The default value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREIGN_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeignKey() <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKey()
	 * @generated
	 * @ordered
	 */
	protected String foreignKey = FOREIGN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula1() <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula1()
	 * @generated
	 * @ordered
	 */
	protected String formula1 = FORMULA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInsert() <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean insert = INSERT_EDEFAULT;

	/**
	 * This is true if the Insert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertESet;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final Lazy LAZY_EDEFAULT = Lazy.FALSE;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected Lazy lazy = LAZY_EDEFAULT;

	/**
	 * This is true if the Lazy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lazyESet;

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
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected static final Notfound NOT_FOUND_EDEFAULT = Notfound.EXCEPTION;

	/**
	 * The cached value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected Notfound notFound = NOT_FOUND_EDEFAULT;

	/**
	 * This is true if the Not Found attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notFoundESet;

	/**
	 * The default value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean notNull = NOT_NULL_EDEFAULT;

	/**
	 * This is true if the Not Null attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notNullESet;

	/**
	 * The default value of the '{@link #isOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIMISTIC_LOCK_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOptimisticLock() <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptimisticLock()
	 * @generated
	 * @ordered
	 */
	protected boolean optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;

	/**
	 * This is true if the Optimistic Lock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optimisticLockESet;

	/**
	 * The default value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected static final Outerjoin OUTER_JOIN_EDEFAULT = Outerjoin.TRUE;

	/**
	 * The cached value of the '{@link #getOuterJoin() <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterJoin()
	 * @generated
	 * @ordered
	 */
	protected Outerjoin outerJoin = OUTER_JOIN_EDEFAULT;

	/**
	 * This is true if the Outer Join attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outerJoinESet;

	/**
	 * The default value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyRef() <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String propertyRef = PROPERTY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * This is true if the Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueESet;

	/**
	 * The default value of the '{@link #getUniqueKey() <em>Unique Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueKey()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueKey() <em>Unique Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueKey()
	 * @generated
	 * @ordered
	 */
	protected String uniqueKey = UNIQUE_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;

	/**
	 * This is true if the Update attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean updateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getManyToOne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.MANY_TO_ONE__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.MANY_TO_ONE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getManyToOne_Column());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		return getGroup().list(Hbm30Package.eINSTANCE.getManyToOne_Formula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCascade() {
		return cascade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascade(String newCascade) {
		String oldCascade = cascade;
		cascade = newCascade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__CASCADE, oldCascade, cascade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn1() {
		return column1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn1(String newColumn1) {
		String oldColumn1 = column1;
		column1 = newColumn1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedXml() {
		return embedXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedXml(boolean newEmbedXml) {
		boolean oldEmbedXml = embedXml;
		embedXml = newEmbedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXmlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__EMBED_XML, oldEmbedXml, embedXml, !oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmbedXml() {
		boolean oldEmbedXml = embedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXml = EMBED_XML_EDEFAULT;
		embedXmlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__EMBED_XML, oldEmbedXml, EMBED_XML_EDEFAULT, oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmbedXml() {
		return embedXmlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FetchJoinSelect getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(FetchJoinSelect newFetch) {
		FetchJoinSelect oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__FETCH, oldFetch, fetch, !oldFetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFetch() {
		FetchJoinSelect oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
	public String getForeignKey() {
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(String newForeignKey) {
		String oldForeignKey = foreignKey;
		foreignKey = newForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__FOREIGN_KEY, oldForeignKey, foreignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula1() {
		return formula1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula1(String newFormula1) {
		String oldFormula1 = formula1;
		formula1 = newFormula1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__FORMULA1, oldFormula1, formula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(boolean newInsert) {
		boolean oldInsert = insert;
		insert = newInsert;
		boolean oldInsertESet = insertESet;
		insertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__INSERT, oldInsert, insert, !oldInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsert() {
		boolean oldInsert = insert;
		boolean oldInsertESet = insertESet;
		insert = INSERT_EDEFAULT;
		insertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsert() {
		return insertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lazy getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(Lazy newLazy) {
		Lazy oldLazy = lazy;
		lazy = newLazy == null ? LAZY_EDEFAULT : newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		Lazy oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLazy() {
		return lazyESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notfound getNotFound() {
		return notFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotFound(Notfound newNotFound) {
		Notfound oldNotFound = notFound;
		notFound = newNotFound == null ? NOT_FOUND_EDEFAULT : newNotFound;
		boolean oldNotFoundESet = notFoundESet;
		notFoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__NOT_FOUND, oldNotFound, notFound, !oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotFound() {
		Notfound oldNotFound = notFound;
		boolean oldNotFoundESet = notFoundESet;
		notFound = NOT_FOUND_EDEFAULT;
		notFoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__NOT_FOUND, oldNotFound, NOT_FOUND_EDEFAULT, oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotFound() {
		return notFoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotNull() {
		return notNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotNull(boolean newNotNull) {
		boolean oldNotNull = notNull;
		notNull = newNotNull;
		boolean oldNotNullESet = notNullESet;
		notNullESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__NOT_NULL, oldNotNull, notNull, !oldNotNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotNull() {
		boolean oldNotNull = notNull;
		boolean oldNotNullESet = notNullESet;
		notNull = NOT_NULL_EDEFAULT;
		notNullESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__NOT_NULL, oldNotNull, NOT_NULL_EDEFAULT, oldNotNullESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotNull() {
		return notNullESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptimisticLock() {
		return optimisticLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimisticLock(boolean newOptimisticLock) {
		boolean oldOptimisticLock = optimisticLock;
		optimisticLock = newOptimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptimisticLock() {
		boolean oldOptimisticLock = optimisticLock;
		boolean oldOptimisticLockESet = optimisticLockESet;
		optimisticLock = OPTIMISTIC_LOCK_EDEFAULT;
		optimisticLockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptimisticLock() {
		return optimisticLockESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outerjoin getOuterJoin() {
		return outerJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterJoin(Outerjoin newOuterJoin) {
		Outerjoin oldOuterJoin = outerJoin;
		outerJoin = newOuterJoin == null ? OUTER_JOIN_EDEFAULT : newOuterJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__OUTER_JOIN, oldOuterJoin, outerJoin, !oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOuterJoin() {
		Outerjoin oldOuterJoin = outerJoin;
		boolean oldOuterJoinESet = outerJoinESet;
		outerJoin = OUTER_JOIN_EDEFAULT;
		outerJoinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__OUTER_JOIN, oldOuterJoin, OUTER_JOIN_EDEFAULT, oldOuterJoinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOuterJoin() {
		return outerJoinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyRef() {
		return propertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyRef(String newPropertyRef) {
		String oldPropertyRef = propertyRef;
		propertyRef = newPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		boolean oldUniqueESet = uniqueESet;
		uniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__UNIQUE, oldUnique, unique, !oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnique() {
		boolean oldUnique = unique;
		boolean oldUniqueESet = uniqueESet;
		unique = UNIQUE_EDEFAULT;
		uniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnique() {
		return uniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueKey() {
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueKey(String newUniqueKey) {
		String oldUniqueKey = uniqueKey;
		uniqueKey = newUniqueKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__UNIQUE_KEY, oldUniqueKey, uniqueKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		boolean oldUpdateESet = updateESet;
		updateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MANY_TO_ONE__UPDATE, oldUpdate, update, !oldUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpdate() {
		boolean oldUpdate = update;
		boolean oldUpdateESet = updateESet;
		update = UPDATE_EDEFAULT;
		updateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.MANY_TO_ONE__UPDATE, oldUpdate, UPDATE_EDEFAULT, oldUpdateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpdate() {
		return updateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.MANY_TO_ONE__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MANY_TO_ONE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MANY_TO_ONE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.MANY_TO_ONE__META:
				return getMeta();
			case Hbm30Package.MANY_TO_ONE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.MANY_TO_ONE__COLUMN:
				return getColumn();
			case Hbm30Package.MANY_TO_ONE__FORMULA:
				return getFormula();
			case Hbm30Package.MANY_TO_ONE__ACCESS:
				return getAccess();
			case Hbm30Package.MANY_TO_ONE__CASCADE:
				return getCascade();
			case Hbm30Package.MANY_TO_ONE__CLASS:
				return getClass_();
			case Hbm30Package.MANY_TO_ONE__COLUMN1:
				return getColumn1();
			case Hbm30Package.MANY_TO_ONE__EMBED_XML:
				return isEmbedXml();
			case Hbm30Package.MANY_TO_ONE__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.MANY_TO_ONE__FETCH:
				return getFetch();
			case Hbm30Package.MANY_TO_ONE__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.MANY_TO_ONE__FORMULA1:
				return getFormula1();
			case Hbm30Package.MANY_TO_ONE__INDEX:
				return getIndex();
			case Hbm30Package.MANY_TO_ONE__INSERT:
				return isInsert();
			case Hbm30Package.MANY_TO_ONE__LAZY:
				return getLazy();
			case Hbm30Package.MANY_TO_ONE__NAME:
				return getName();
			case Hbm30Package.MANY_TO_ONE__NODE:
				return getNode();
			case Hbm30Package.MANY_TO_ONE__NOT_FOUND:
				return getNotFound();
			case Hbm30Package.MANY_TO_ONE__NOT_NULL:
				return isNotNull();
			case Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK:
				return isOptimisticLock();
			case Hbm30Package.MANY_TO_ONE__OUTER_JOIN:
				return getOuterJoin();
			case Hbm30Package.MANY_TO_ONE__PROPERTY_REF:
				return getPropertyRef();
			case Hbm30Package.MANY_TO_ONE__UNIQUE:
				return isUnique();
			case Hbm30Package.MANY_TO_ONE__UNIQUE_KEY:
				return getUniqueKey();
			case Hbm30Package.MANY_TO_ONE__UPDATE:
				return isUpdate();
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
			case Hbm30Package.MANY_TO_ONE__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__CASCADE:
				setCascade((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__EMBED_XML:
				setEmbedXml((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__FETCH:
				setFetch((FetchJoinSelect)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__INDEX:
				setIndex((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__LAZY:
				setLazy((Lazy)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__NOT_FOUND:
				setNotFound((Notfound)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK:
				setOptimisticLock((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__OUTER_JOIN:
				setOuterJoin((Outerjoin)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__PROPERTY_REF:
				setPropertyRef((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__UNIQUE_KEY:
				setUniqueKey((String)newValue);
				return;
			case Hbm30Package.MANY_TO_ONE__UPDATE:
				setUpdate((Boolean)newValue);
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
			case Hbm30Package.MANY_TO_ONE__META:
				getMeta().clear();
				return;
			case Hbm30Package.MANY_TO_ONE__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.MANY_TO_ONE__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.MANY_TO_ONE__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.MANY_TO_ONE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__CASCADE:
				setCascade(CASCADE_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__EMBED_XML:
				unsetEmbedXml();
				return;
			case Hbm30Package.MANY_TO_ONE__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__FETCH:
				unsetFetch();
				return;
			case Hbm30Package.MANY_TO_ONE__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.MANY_TO_ONE__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.MANY_TO_ONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__NOT_FOUND:
				unsetNotFound();
				return;
			case Hbm30Package.MANY_TO_ONE__NOT_NULL:
				unsetNotNull();
				return;
			case Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.MANY_TO_ONE__OUTER_JOIN:
				unsetOuterJoin();
				return;
			case Hbm30Package.MANY_TO_ONE__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.MANY_TO_ONE__UNIQUE_KEY:
				setUniqueKey(UNIQUE_KEY_EDEFAULT);
				return;
			case Hbm30Package.MANY_TO_ONE__UPDATE:
				unsetUpdate();
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
			case Hbm30Package.MANY_TO_ONE__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.MANY_TO_ONE__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.MANY_TO_ONE__COLUMN:
				return !getColumn().isEmpty();
			case Hbm30Package.MANY_TO_ONE__FORMULA:
				return !getFormula().isEmpty();
			case Hbm30Package.MANY_TO_ONE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.MANY_TO_ONE__CASCADE:
				return CASCADE_EDEFAULT == null ? cascade != null : !CASCADE_EDEFAULT.equals(cascade);
			case Hbm30Package.MANY_TO_ONE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.MANY_TO_ONE__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.MANY_TO_ONE__EMBED_XML:
				return isSetEmbedXml();
			case Hbm30Package.MANY_TO_ONE__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.MANY_TO_ONE__FETCH:
				return isSetFetch();
			case Hbm30Package.MANY_TO_ONE__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.MANY_TO_ONE__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.MANY_TO_ONE__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case Hbm30Package.MANY_TO_ONE__INSERT:
				return isSetInsert();
			case Hbm30Package.MANY_TO_ONE__LAZY:
				return isSetLazy();
			case Hbm30Package.MANY_TO_ONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.MANY_TO_ONE__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.MANY_TO_ONE__NOT_FOUND:
				return isSetNotFound();
			case Hbm30Package.MANY_TO_ONE__NOT_NULL:
				return isSetNotNull();
			case Hbm30Package.MANY_TO_ONE__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.MANY_TO_ONE__OUTER_JOIN:
				return isSetOuterJoin();
			case Hbm30Package.MANY_TO_ONE__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
			case Hbm30Package.MANY_TO_ONE__UNIQUE:
				return isSetUnique();
			case Hbm30Package.MANY_TO_ONE__UNIQUE_KEY:
				return UNIQUE_KEY_EDEFAULT == null ? uniqueKey != null : !UNIQUE_KEY_EDEFAULT.equals(uniqueKey);
			case Hbm30Package.MANY_TO_ONE__UPDATE:
				return isSetUpdate();
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
		result.append(", access: ");
		result.append(access);
		result.append(", cascade: ");
		result.append(cascade);
		result.append(", class: ");
		result.append(class_);
		result.append(", column1: ");
		result.append(column1);
		result.append(", embedXml: ");
		if (embedXmlESet) result.append(embedXml); else result.append("<unset>");
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", formula1: ");
		result.append(formula1);
		result.append(", index: ");
		result.append(index);
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", notFound: ");
		if (notFoundESet) result.append(notFound); else result.append("<unset>");
		result.append(", notNull: ");
		if (notNullESet) result.append(notNull); else result.append("<unset>");
		result.append(", optimisticLock: ");
		if (optimisticLockESet) result.append(optimisticLock); else result.append("<unset>");
		result.append(", outerJoin: ");
		if (outerJoinESet) result.append(outerJoin); else result.append("<unset>");
		result.append(", propertyRef: ");
		result.append(propertyRef);
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", uniqueKey: ");
		result.append(uniqueKey);
		result.append(", update: ");
		if (updateESet) result.append(update); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ManyToOneImpl
