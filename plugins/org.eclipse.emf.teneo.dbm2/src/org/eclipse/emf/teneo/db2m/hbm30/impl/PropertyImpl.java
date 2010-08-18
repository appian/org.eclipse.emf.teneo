/**
 * <copyright>
 * </copyright>
 *
 * $Id: PropertyImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
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
import org.eclipse.emf.teneo.db2m.hbm30.Generated;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Meta;
import org.eclipse.emf.teneo.db2m.hbm30.Property;
import org.eclipse.emf.teneo.db2m.hbm30.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getGenerated <em>Generated</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#getUniqueKey <em>Unique Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.PropertyImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	 * The default value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected static final Generated GENERATED_EDEFAULT = Generated.NEVER;

	/**
	 * The cached value of the '{@link #getGenerated() <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerated()
	 * @generated
	 * @ordered
	 */
	protected Generated generated = GENERATED_EDEFAULT;

	/**
	 * This is true if the Generated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generatedESet;

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
	protected static final boolean INSERT_EDEFAULT = false;

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
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

	/**
	 * This is true if the Lazy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lazyESet;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected String precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected String scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType1()
	 * @generated
	 * @ordered
	 */
	protected String type1 = TYPE1_EDEFAULT;

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
	protected static final boolean UPDATE_EDEFAULT = false;

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
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Meta> getMeta() {
		if (meta == null) {
			meta = new EObjectContainmentEList<Meta>(Meta.class, this, Hbm30Package.PROPERTY__META);
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
			group = new BasicFeatureMap(this, Hbm30Package.PROPERTY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperty_Column());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		return getGroup().list(Hbm30Package.eINSTANCE.getProperty_Formula());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__TYPE, newType, newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__COLUMN1, oldColumn1, column1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__FORMULA1, oldFormula1, formula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generated getGenerated() {
		return generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerated(Generated newGenerated) {
		Generated oldGenerated = generated;
		generated = newGenerated == null ? GENERATED_EDEFAULT : newGenerated;
		boolean oldGeneratedESet = generatedESet;
		generatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__GENERATED, oldGenerated, generated, !oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerated() {
		Generated oldGenerated = generated;
		boolean oldGeneratedESet = generatedESet;
		generated = GENERATED_EDEFAULT;
		generatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__GENERATED, oldGenerated, GENERATED_EDEFAULT, oldGeneratedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerated() {
		return generatedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__INDEX, oldIndex, index));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__INSERT, oldInsert, insert, !oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
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
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		boolean oldLazyESet = lazyESet;
		lazyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__LAZY, oldLazy, lazy, !oldLazyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLazy() {
		boolean oldLazy = lazy;
		boolean oldLazyESet = lazyESet;
		lazy = LAZY_EDEFAULT;
		lazyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__LAZY, oldLazy, LAZY_EDEFAULT, oldLazyESet));
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
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__NOT_NULL, oldNotNull, notNull, !oldNotNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__NOT_NULL, oldNotNull, NOT_NULL_EDEFAULT, oldNotNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__OPTIMISTIC_LOCK, oldOptimisticLock, optimisticLock, !oldOptimisticLockESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__OPTIMISTIC_LOCK, oldOptimisticLock, OPTIMISTIC_LOCK_EDEFAULT, oldOptimisticLockESet));
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
	public String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		String oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType1() {
		return type1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType1(String newType1) {
		String oldType1 = type1;
		type1 = newType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__TYPE1, oldType1, type1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__UNIQUE, oldUnique, unique, !oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__UNIQUE_KEY, oldUniqueKey, uniqueKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.PROPERTY__UPDATE, oldUpdate, update, !oldUpdateESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.PROPERTY__UPDATE, oldUpdate, UPDATE_EDEFAULT, oldUpdateESet));
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
			case Hbm30Package.PROPERTY__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case Hbm30Package.PROPERTY__TYPE:
				return basicSetType(null, msgs);
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
			case Hbm30Package.PROPERTY__META:
				return getMeta();
			case Hbm30Package.PROPERTY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.PROPERTY__COLUMN:
				return getColumn();
			case Hbm30Package.PROPERTY__FORMULA:
				return getFormula();
			case Hbm30Package.PROPERTY__TYPE:
				return getType();
			case Hbm30Package.PROPERTY__ACCESS:
				return getAccess();
			case Hbm30Package.PROPERTY__COLUMN1:
				return getColumn1();
			case Hbm30Package.PROPERTY__FORMULA1:
				return getFormula1();
			case Hbm30Package.PROPERTY__GENERATED:
				return getGenerated();
			case Hbm30Package.PROPERTY__INDEX:
				return getIndex();
			case Hbm30Package.PROPERTY__INSERT:
				return isInsert();
			case Hbm30Package.PROPERTY__LAZY:
				return isLazy();
			case Hbm30Package.PROPERTY__LENGTH:
				return getLength();
			case Hbm30Package.PROPERTY__NAME:
				return getName();
			case Hbm30Package.PROPERTY__NODE:
				return getNode();
			case Hbm30Package.PROPERTY__NOT_NULL:
				return isNotNull();
			case Hbm30Package.PROPERTY__OPTIMISTIC_LOCK:
				return isOptimisticLock();
			case Hbm30Package.PROPERTY__PRECISION:
				return getPrecision();
			case Hbm30Package.PROPERTY__SCALE:
				return getScale();
			case Hbm30Package.PROPERTY__TYPE1:
				return getType1();
			case Hbm30Package.PROPERTY__UNIQUE:
				return isUnique();
			case Hbm30Package.PROPERTY__UNIQUE_KEY:
				return getUniqueKey();
			case Hbm30Package.PROPERTY__UPDATE:
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
			case Hbm30Package.PROPERTY__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends Meta>)newValue);
				return;
			case Hbm30Package.PROPERTY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.PROPERTY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.PROPERTY__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.PROPERTY__TYPE:
				setType((Type)newValue);
				return;
			case Hbm30Package.PROPERTY__ACCESS:
				setAccess((String)newValue);
				return;
			case Hbm30Package.PROPERTY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.PROPERTY__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.PROPERTY__GENERATED:
				setGenerated((Generated)newValue);
				return;
			case Hbm30Package.PROPERTY__INDEX:
				setIndex((String)newValue);
				return;
			case Hbm30Package.PROPERTY__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTY__LAZY:
				setLazy((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTY__LENGTH:
				setLength((String)newValue);
				return;
			case Hbm30Package.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.PROPERTY__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.PROPERTY__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTY__OPTIMISTIC_LOCK:
				setOptimisticLock((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTY__PRECISION:
				setPrecision((String)newValue);
				return;
			case Hbm30Package.PROPERTY__SCALE:
				setScale((String)newValue);
				return;
			case Hbm30Package.PROPERTY__TYPE1:
				setType1((String)newValue);
				return;
			case Hbm30Package.PROPERTY__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.PROPERTY__UNIQUE_KEY:
				setUniqueKey((String)newValue);
				return;
			case Hbm30Package.PROPERTY__UPDATE:
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
			case Hbm30Package.PROPERTY__META:
				getMeta().clear();
				return;
			case Hbm30Package.PROPERTY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.PROPERTY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.PROPERTY__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.PROPERTY__TYPE:
				setType((Type)null);
				return;
			case Hbm30Package.PROPERTY__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__GENERATED:
				unsetGenerated();
				return;
			case Hbm30Package.PROPERTY__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.PROPERTY__LAZY:
				unsetLazy();
				return;
			case Hbm30Package.PROPERTY__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__NOT_NULL:
				unsetNotNull();
				return;
			case Hbm30Package.PROPERTY__OPTIMISTIC_LOCK:
				unsetOptimisticLock();
				return;
			case Hbm30Package.PROPERTY__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__TYPE1:
				setType1(TYPE1_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.PROPERTY__UNIQUE_KEY:
				setUniqueKey(UNIQUE_KEY_EDEFAULT);
				return;
			case Hbm30Package.PROPERTY__UPDATE:
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
			case Hbm30Package.PROPERTY__META:
				return meta != null && !meta.isEmpty();
			case Hbm30Package.PROPERTY__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.PROPERTY__COLUMN:
				return !getColumn().isEmpty();
			case Hbm30Package.PROPERTY__FORMULA:
				return !getFormula().isEmpty();
			case Hbm30Package.PROPERTY__TYPE:
				return type != null;
			case Hbm30Package.PROPERTY__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case Hbm30Package.PROPERTY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.PROPERTY__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.PROPERTY__GENERATED:
				return isSetGenerated();
			case Hbm30Package.PROPERTY__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case Hbm30Package.PROPERTY__INSERT:
				return isSetInsert();
			case Hbm30Package.PROPERTY__LAZY:
				return isSetLazy();
			case Hbm30Package.PROPERTY__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case Hbm30Package.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.PROPERTY__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.PROPERTY__NOT_NULL:
				return isSetNotNull();
			case Hbm30Package.PROPERTY__OPTIMISTIC_LOCK:
				return isSetOptimisticLock();
			case Hbm30Package.PROPERTY__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case Hbm30Package.PROPERTY__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case Hbm30Package.PROPERTY__TYPE1:
				return TYPE1_EDEFAULT == null ? type1 != null : !TYPE1_EDEFAULT.equals(type1);
			case Hbm30Package.PROPERTY__UNIQUE:
				return isSetUnique();
			case Hbm30Package.PROPERTY__UNIQUE_KEY:
				return UNIQUE_KEY_EDEFAULT == null ? uniqueKey != null : !UNIQUE_KEY_EDEFAULT.equals(uniqueKey);
			case Hbm30Package.PROPERTY__UPDATE:
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
		result.append(", column1: ");
		result.append(column1);
		result.append(", formula1: ");
		result.append(formula1);
		result.append(", generated: ");
		if (generatedESet) result.append(generated); else result.append("<unset>");
		result.append(", index: ");
		result.append(index);
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", lazy: ");
		if (lazyESet) result.append(lazy); else result.append("<unset>");
		result.append(", length: ");
		result.append(length);
		result.append(", name: ");
		result.append(name);
		result.append(", node: ");
		result.append(node);
		result.append(", notNull: ");
		if (notNullESet) result.append(notNull); else result.append("<unset>");
		result.append(", optimisticLock: ");
		if (optimisticLockESet) result.append(optimisticLock); else result.append("<unset>");
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", type1: ");
		result.append(type1);
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", uniqueKey: ");
		result.append(uniqueKey);
		result.append(", update: ");
		if (updateESet) result.append(update); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
