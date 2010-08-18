/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOneImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Lazy;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.OneToOne;
import org.eclipse.emf.teneo.db2m.hbm30.Outerjoin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#isConstrained <em>Constrained</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToOneImpl#getPropertyRef <em>Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneToOneImpl extends EObjectImpl implements OneToOne {
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
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<String> formula;

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
	 * The default value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected boolean constrained = CONSTRAINED_EDEFAULT;

	/**
	 * This is true if the Constrained attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constrainedESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getOneToOne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.ONE_TO_ONE__META);
		}
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		if (formula == null) {
			formula = new EDataTypeEList<String>(String.class, this, Hbm30Package.ONE_TO_ONE__FORMULA);
		}
		return formula;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__CASCADE, oldCascade, cascade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstrained() {
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrained(boolean newConstrained) {
		boolean oldConstrained = constrained;
		constrained = newConstrained;
		boolean oldConstrainedESet = constrainedESet;
		constrainedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__CONSTRAINED, oldConstrained, constrained, !oldConstrainedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstrained() {
		boolean oldConstrained = constrained;
		boolean oldConstrainedESet = constrainedESet;
		constrained = CONSTRAINED_EDEFAULT;
		constrainedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_ONE__CONSTRAINED, oldConstrained, CONSTRAINED_EDEFAULT, oldConstrainedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstrained() {
		return constrainedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__EMBED_XML, oldEmbedXml, embedXml, !oldEmbedXmlESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_ONE__EMBED_XML, oldEmbedXml, EMBED_XML_EDEFAULT, oldEmbedXmlESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__FETCH, oldFetch, fetch, !oldFetchESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_ONE__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__FOREIGN_KEY, oldForeignKey, foreignKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__FORMULA1, oldFormula1, formula1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__LAZY, oldLazy, lazy, !oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_ONE__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__OUTER_JOIN, oldOuterJoin, outerJoin, !oldOuterJoinESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_ONE__OUTER_JOIN, oldOuterJoin, OUTER_JOIN_EDEFAULT, oldOuterJoinESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_ONE__PROPERTY_REF, oldPropertyRef, propertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.ONE_TO_ONE__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.ONE_TO_ONE__META:
				return getMeta();
			case Hbm30Package.ONE_TO_ONE__FORMULA:
				return getFormula();
			case Hbm30Package.ONE_TO_ONE__ACCESS:
				return getAccess();
			case Hbm30Package.ONE_TO_ONE__CASCADE:
				return getCascade();
			case Hbm30Package.ONE_TO_ONE__CLASS:
				return getClass_();
			case Hbm30Package.ONE_TO_ONE__CONSTRAINED:
				return isConstrained();
			case Hbm30Package.ONE_TO_ONE__EMBED_XML:
				return isEmbedXml();
			case Hbm30Package.ONE_TO_ONE__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.ONE_TO_ONE__FETCH:
				return getFetch();
			case Hbm30Package.ONE_TO_ONE__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.ONE_TO_ONE__FORMULA1:
				return getFormula1();
			case Hbm30Package.ONE_TO_ONE__LAZY:
				return getLazy();
			case Hbm30Package.ONE_TO_ONE__NAME:
				return getName();
			case Hbm30Package.ONE_TO_ONE__NODE:
				return getNode();
			case Hbm30Package.ONE_TO_ONE__OUTER_JOIN:
				return getOuterJoin();
			case Hbm30Package.ONE_TO_ONE__PROPERTY_REF:
				return getPropertyRef();
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
			case Hbm30Package.ONE_TO_ONE__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__CASCADE:
				setCascade((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__CONSTRAINED:
				setConstrained((Boolean)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__EMBED_XML:
				setEmbedXml((Boolean)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__FETCH:
				setFetch((FetchJoinSelect)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__LAZY:
				setLazy((Lazy)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__OUTER_JOIN:
				setOuterJoin((Outerjoin)newValue);
				return;
			case Hbm30Package.ONE_TO_ONE__PROPERTY_REF:
				setPropertyRef((String)newValue);
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
			case Hbm30Package.ONE_TO_ONE__META:
				getMeta().clear();
				return;
			case Hbm30Package.ONE_TO_ONE__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.ONE_TO_ONE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__CASCADE:
				setCascade(CASCADE_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__CONSTRAINED:
				unsetConstrained();
				return;
			case Hbm30Package.ONE_TO_ONE__EMBED_XML:
				unsetEmbedXml();
				return;
			case Hbm30Package.ONE_TO_ONE__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__FETCH:
				unsetFetch();
				return;
			case Hbm30Package.ONE_TO_ONE__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.ONE_TO_ONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_ONE__OUTER_JOIN:
				unsetOuterJoin();
				return;
			case Hbm30Package.ONE_TO_ONE__PROPERTY_REF:
				setPropertyRef(PROPERTY_REF_EDEFAULT);
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
			case Hbm30Package.ONE_TO_ONE__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.ONE_TO_ONE__FORMULA:
				return formula != null && !formula.isEmpty();
			case Hbm30Package.ONE_TO_ONE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.ONE_TO_ONE__CASCADE:
				return CASCADE_EDEFAULT == null ? cascade != null : !CASCADE_EDEFAULT.equals(cascade);
			case Hbm30Package.ONE_TO_ONE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.ONE_TO_ONE__CONSTRAINED:
				return isSetConstrained();
			case Hbm30Package.ONE_TO_ONE__EMBED_XML:
				return isSetEmbedXml();
			case Hbm30Package.ONE_TO_ONE__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.ONE_TO_ONE__FETCH:
				return isSetFetch();
			case Hbm30Package.ONE_TO_ONE__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.ONE_TO_ONE__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.ONE_TO_ONE__LAZY:
				return isSetLazy();
			case Hbm30Package.ONE_TO_ONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.ONE_TO_ONE__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.ONE_TO_ONE__OUTER_JOIN:
				return isSetOuterJoin();
			case Hbm30Package.ONE_TO_ONE__PROPERTY_REF:
				return PROPERTY_REF_EDEFAULT == null ? propertyRef != null : !PROPERTY_REF_EDEFAULT.equals(propertyRef);
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
		result.append(" (formula: ");
		result.append(formula);
		result.append(", access: ");
		result.append(access);
		result.append(", cascade: ");
		result.append(cascade);
		result.append(", class: ");
		result.append(class_);
		result.append(", constrained: ");
		if (constrainedESet) result.append(constrained); else result.append("<unset>");
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
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", outerJoin: ");
		if (outerJoinESet) result.append(outerJoin); else result.append("<unset>");
		result.append(", propertyRef: ");
		result.append(propertyRef);
		result.append(')');
		return result.toString();
	}

} //OneToOneImpl
