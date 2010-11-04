/**
 * <copyright>
 * </copyright>
 *
 * $Id: ItemImpl.java,v 1.1 2010/11/04 05:22:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.bz329275.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.bz329275.Bz329275Package;
import org.eclipse.emf.teneo.samples.issues.bz329275.Item;
import org.eclipse.emf.teneo.samples.issues.bz329275.TestEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettableStringNoDefault <em>Un Settable String No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardStringNoDefault <em>Standard String No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettableStringWithDefault <em>Un Settable String With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardStringDefault <em>Standard String Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettableEnum <em>Un Settable Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardEnum <em>Standard Enum</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettablePrimitiveNoDefault <em>Un Settable Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardPrimitiveNoDefault <em>Standard Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettablePrimitiveWithDefault <em>Un Settable Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardPrimitiveWithDefault <em>Standard Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettableObjectPrimitiveWithDefault <em>Un Settable Object Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardObjectPrimitiveWithDefault <em>Standard Object Primitive With Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getUnSettableObjectPrimitiveNoDefault <em>Un Settable Object Primitive No Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.bz329275.impl.ItemImpl#getStandardObjectPrimitiveNoDefault <em>Standard Object Primitive No Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final long VERSION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected long version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * The default value of the '{@link #getUnSettableStringNoDefault() <em>Un Settable String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableStringNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String UN_SETTABLE_STRING_NO_DEFAULT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnSettableStringNoDefault() <em>Un Settable String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableStringNoDefault()
	 * @generated
	 * @ordered
	 */
	protected String unSettableStringNoDefault = UN_SETTABLE_STRING_NO_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable String No Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettableStringNoDefaultESet;

	/**
	 * The default value of the '{@link #getStandardStringNoDefault() <em>Standard String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStringNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_STRING_NO_DEFAULT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStandardStringNoDefault() <em>Standard String No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStringNoDefault()
	 * @generated
	 * @ordered
	 */
	protected String standardStringNoDefault = STANDARD_STRING_NO_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettableStringWithDefault() <em>Un Settable String With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableStringWithDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String UN_SETTABLE_STRING_WITH_DEFAULT_EDEFAULT = "default";

	/**
	 * The cached value of the '{@link #getUnSettableStringWithDefault() <em>Un Settable String With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableStringWithDefault()
	 * @generated
	 * @ordered
	 */
	protected String unSettableStringWithDefault = UN_SETTABLE_STRING_WITH_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable String With Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettableStringWithDefaultESet;

	/**
	 * The default value of the '{@link #getStandardStringDefault() <em>Standard String Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStringDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_STRING_DEFAULT_EDEFAULT = "default";

	/**
	 * The cached value of the '{@link #getStandardStringDefault() <em>Standard String Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardStringDefault()
	 * @generated
	 * @ordered
	 */
	protected String standardStringDefault = STANDARD_STRING_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettableEnum() <em>Un Settable Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableEnum()
	 * @generated
	 * @ordered
	 */
	protected static final TestEnum UN_SETTABLE_ENUM_EDEFAULT = TestEnum.LITERAL1;

	/**
	 * The cached value of the '{@link #getUnSettableEnum() <em>Un Settable Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableEnum()
	 * @generated
	 * @ordered
	 */
	protected TestEnum unSettableEnum = UN_SETTABLE_ENUM_EDEFAULT;

	/**
	 * This is true if the Un Settable Enum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettableEnumESet;

	/**
	 * The default value of the '{@link #getStandardEnum() <em>Standard Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardEnum()
	 * @generated
	 * @ordered
	 */
	protected static final TestEnum STANDARD_ENUM_EDEFAULT = TestEnum.LITERAL1;

	/**
	 * The cached value of the '{@link #getStandardEnum() <em>Standard Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardEnum()
	 * @generated
	 * @ordered
	 */
	protected TestEnum standardEnum = STANDARD_ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettablePrimitiveNoDefault() <em>Un Settable Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettablePrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final long UN_SETTABLE_PRIMITIVE_NO_DEFAULT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUnSettablePrimitiveNoDefault() <em>Un Settable Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettablePrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected long unSettablePrimitiveNoDefault = UN_SETTABLE_PRIMITIVE_NO_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable Primitive No Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettablePrimitiveNoDefaultESet;

	/**
	 * The default value of the '{@link #getStandardPrimitiveNoDefault() <em>Standard Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final long STANDARD_PRIMITIVE_NO_DEFAULT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStandardPrimitiveNoDefault() <em>Standard Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected long standardPrimitiveNoDefault = STANDARD_PRIMITIVE_NO_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettablePrimitiveWithDefault() <em>Un Settable Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettablePrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected static final long UN_SETTABLE_PRIMITIVE_WITH_DEFAULT_EDEFAULT = 155L;

	/**
	 * The cached value of the '{@link #getUnSettablePrimitiveWithDefault() <em>Un Settable Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettablePrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected long unSettablePrimitiveWithDefault = UN_SETTABLE_PRIMITIVE_WITH_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable Primitive With Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettablePrimitiveWithDefaultESet;

	/**
	 * The default value of the '{@link #getStandardPrimitiveWithDefault() <em>Standard Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected static final long STANDARD_PRIMITIVE_WITH_DEFAULT_EDEFAULT = 155L;

	/**
	 * The cached value of the '{@link #getStandardPrimitiveWithDefault() <em>Standard Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected long standardPrimitiveWithDefault = STANDARD_PRIMITIVE_WITH_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettableObjectPrimitiveWithDefault() <em>Un Settable Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableObjectPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT = new Long(155L);

	/**
	 * The cached value of the '{@link #getUnSettableObjectPrimitiveWithDefault() <em>Un Settable Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableObjectPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected Long unSettableObjectPrimitiveWithDefault = UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable Object Primitive With Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettableObjectPrimitiveWithDefaultESet;

	/**
	 * The default value of the '{@link #getStandardObjectPrimitiveWithDefault() <em>Standard Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardObjectPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT = new Long(155L);

	/**
	 * The cached value of the '{@link #getStandardObjectPrimitiveWithDefault() <em>Standard Object Primitive With Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardObjectPrimitiveWithDefault()
	 * @generated
	 * @ordered
	 */
	protected Long standardObjectPrimitiveWithDefault = STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnSettableObjectPrimitiveNoDefault() <em>Un Settable Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableObjectPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnSettableObjectPrimitiveNoDefault() <em>Un Settable Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnSettableObjectPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected Long unSettableObjectPrimitiveNoDefault = UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Un Settable Object Primitive No Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unSettableObjectPrimitiveNoDefaultESet;

	/**
	 * The default value of the '{@link #getStandardObjectPrimitiveNoDefault() <em>Standard Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardObjectPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardObjectPrimitiveNoDefault() <em>Standard Object Primitive No Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardObjectPrimitiveNoDefault()
	 * @generated
	 * @ordered
	 */
	protected Long standardObjectPrimitiveNoDefault = STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bz329275Package.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		long oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(long newVersion) {
		long oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		long oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
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
	public String getUnSettableStringNoDefault() {
		return unSettableStringNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettableStringNoDefault(String newUnSettableStringNoDefault) {
		String oldUnSettableStringNoDefault = unSettableStringNoDefault;
		unSettableStringNoDefault = newUnSettableStringNoDefault;
		boolean oldUnSettableStringNoDefaultESet = unSettableStringNoDefaultESet;
		unSettableStringNoDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT, oldUnSettableStringNoDefault, unSettableStringNoDefault, !oldUnSettableStringNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettableStringNoDefault() {
		String oldUnSettableStringNoDefault = unSettableStringNoDefault;
		boolean oldUnSettableStringNoDefaultESet = unSettableStringNoDefaultESet;
		unSettableStringNoDefault = UN_SETTABLE_STRING_NO_DEFAULT_EDEFAULT;
		unSettableStringNoDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT, oldUnSettableStringNoDefault, UN_SETTABLE_STRING_NO_DEFAULT_EDEFAULT, oldUnSettableStringNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettableStringNoDefault() {
		return unSettableStringNoDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardStringNoDefault() {
		return standardStringNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardStringNoDefault(String newStandardStringNoDefault) {
		String oldStandardStringNoDefault = standardStringNoDefault;
		standardStringNoDefault = newStandardStringNoDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_STRING_NO_DEFAULT, oldStandardStringNoDefault, standardStringNoDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnSettableStringWithDefault() {
		return unSettableStringWithDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettableStringWithDefault(String newUnSettableStringWithDefault) {
		String oldUnSettableStringWithDefault = unSettableStringWithDefault;
		unSettableStringWithDefault = newUnSettableStringWithDefault;
		boolean oldUnSettableStringWithDefaultESet = unSettableStringWithDefaultESet;
		unSettableStringWithDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT, oldUnSettableStringWithDefault, unSettableStringWithDefault, !oldUnSettableStringWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettableStringWithDefault() {
		String oldUnSettableStringWithDefault = unSettableStringWithDefault;
		boolean oldUnSettableStringWithDefaultESet = unSettableStringWithDefaultESet;
		unSettableStringWithDefault = UN_SETTABLE_STRING_WITH_DEFAULT_EDEFAULT;
		unSettableStringWithDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT, oldUnSettableStringWithDefault, UN_SETTABLE_STRING_WITH_DEFAULT_EDEFAULT, oldUnSettableStringWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettableStringWithDefault() {
		return unSettableStringWithDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardStringDefault() {
		return standardStringDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardStringDefault(String newStandardStringDefault) {
		String oldStandardStringDefault = standardStringDefault;
		standardStringDefault = newStandardStringDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_STRING_DEFAULT, oldStandardStringDefault, standardStringDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEnum getUnSettableEnum() {
		return unSettableEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettableEnum(TestEnum newUnSettableEnum) {
		TestEnum oldUnSettableEnum = unSettableEnum;
		unSettableEnum = newUnSettableEnum == null ? UN_SETTABLE_ENUM_EDEFAULT : newUnSettableEnum;
		boolean oldUnSettableEnumESet = unSettableEnumESet;
		unSettableEnumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_ENUM, oldUnSettableEnum, unSettableEnum, !oldUnSettableEnumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettableEnum() {
		TestEnum oldUnSettableEnum = unSettableEnum;
		boolean oldUnSettableEnumESet = unSettableEnumESet;
		unSettableEnum = UN_SETTABLE_ENUM_EDEFAULT;
		unSettableEnumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_ENUM, oldUnSettableEnum, UN_SETTABLE_ENUM_EDEFAULT, oldUnSettableEnumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettableEnum() {
		return unSettableEnumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEnum getStandardEnum() {
		return standardEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardEnum(TestEnum newStandardEnum) {
		TestEnum oldStandardEnum = standardEnum;
		standardEnum = newStandardEnum == null ? STANDARD_ENUM_EDEFAULT : newStandardEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_ENUM, oldStandardEnum, standardEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUnSettablePrimitiveNoDefault() {
		return unSettablePrimitiveNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettablePrimitiveNoDefault(long newUnSettablePrimitiveNoDefault) {
		long oldUnSettablePrimitiveNoDefault = unSettablePrimitiveNoDefault;
		unSettablePrimitiveNoDefault = newUnSettablePrimitiveNoDefault;
		boolean oldUnSettablePrimitiveNoDefaultESet = unSettablePrimitiveNoDefaultESet;
		unSettablePrimitiveNoDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT, oldUnSettablePrimitiveNoDefault, unSettablePrimitiveNoDefault, !oldUnSettablePrimitiveNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettablePrimitiveNoDefault() {
		long oldUnSettablePrimitiveNoDefault = unSettablePrimitiveNoDefault;
		boolean oldUnSettablePrimitiveNoDefaultESet = unSettablePrimitiveNoDefaultESet;
		unSettablePrimitiveNoDefault = UN_SETTABLE_PRIMITIVE_NO_DEFAULT_EDEFAULT;
		unSettablePrimitiveNoDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT, oldUnSettablePrimitiveNoDefault, UN_SETTABLE_PRIMITIVE_NO_DEFAULT_EDEFAULT, oldUnSettablePrimitiveNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettablePrimitiveNoDefault() {
		return unSettablePrimitiveNoDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStandardPrimitiveNoDefault() {
		return standardPrimitiveNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardPrimitiveNoDefault(long newStandardPrimitiveNoDefault) {
		long oldStandardPrimitiveNoDefault = standardPrimitiveNoDefault;
		standardPrimitiveNoDefault = newStandardPrimitiveNoDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_PRIMITIVE_NO_DEFAULT, oldStandardPrimitiveNoDefault, standardPrimitiveNoDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUnSettablePrimitiveWithDefault() {
		return unSettablePrimitiveWithDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettablePrimitiveWithDefault(long newUnSettablePrimitiveWithDefault) {
		long oldUnSettablePrimitiveWithDefault = unSettablePrimitiveWithDefault;
		unSettablePrimitiveWithDefault = newUnSettablePrimitiveWithDefault;
		boolean oldUnSettablePrimitiveWithDefaultESet = unSettablePrimitiveWithDefaultESet;
		unSettablePrimitiveWithDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT, oldUnSettablePrimitiveWithDefault, unSettablePrimitiveWithDefault, !oldUnSettablePrimitiveWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettablePrimitiveWithDefault() {
		long oldUnSettablePrimitiveWithDefault = unSettablePrimitiveWithDefault;
		boolean oldUnSettablePrimitiveWithDefaultESet = unSettablePrimitiveWithDefaultESet;
		unSettablePrimitiveWithDefault = UN_SETTABLE_PRIMITIVE_WITH_DEFAULT_EDEFAULT;
		unSettablePrimitiveWithDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT, oldUnSettablePrimitiveWithDefault, UN_SETTABLE_PRIMITIVE_WITH_DEFAULT_EDEFAULT, oldUnSettablePrimitiveWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettablePrimitiveWithDefault() {
		return unSettablePrimitiveWithDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStandardPrimitiveWithDefault() {
		return standardPrimitiveWithDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardPrimitiveWithDefault(long newStandardPrimitiveWithDefault) {
		long oldStandardPrimitiveWithDefault = standardPrimitiveWithDefault;
		standardPrimitiveWithDefault = newStandardPrimitiveWithDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT, oldStandardPrimitiveWithDefault, standardPrimitiveWithDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getUnSettableObjectPrimitiveWithDefault() {
		return unSettableObjectPrimitiveWithDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettableObjectPrimitiveWithDefault(Long newUnSettableObjectPrimitiveWithDefault) {
		Long oldUnSettableObjectPrimitiveWithDefault = unSettableObjectPrimitiveWithDefault;
		unSettableObjectPrimitiveWithDefault = newUnSettableObjectPrimitiveWithDefault;
		boolean oldUnSettableObjectPrimitiveWithDefaultESet = unSettableObjectPrimitiveWithDefaultESet;
		unSettableObjectPrimitiveWithDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT, oldUnSettableObjectPrimitiveWithDefault, unSettableObjectPrimitiveWithDefault, !oldUnSettableObjectPrimitiveWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettableObjectPrimitiveWithDefault() {
		Long oldUnSettableObjectPrimitiveWithDefault = unSettableObjectPrimitiveWithDefault;
		boolean oldUnSettableObjectPrimitiveWithDefaultESet = unSettableObjectPrimitiveWithDefaultESet;
		unSettableObjectPrimitiveWithDefault = UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT;
		unSettableObjectPrimitiveWithDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT, oldUnSettableObjectPrimitiveWithDefault, UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT, oldUnSettableObjectPrimitiveWithDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettableObjectPrimitiveWithDefault() {
		return unSettableObjectPrimitiveWithDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStandardObjectPrimitiveWithDefault() {
		return standardObjectPrimitiveWithDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardObjectPrimitiveWithDefault(Long newStandardObjectPrimitiveWithDefault) {
		Long oldStandardObjectPrimitiveWithDefault = standardObjectPrimitiveWithDefault;
		standardObjectPrimitiveWithDefault = newStandardObjectPrimitiveWithDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT, oldStandardObjectPrimitiveWithDefault, standardObjectPrimitiveWithDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getUnSettableObjectPrimitiveNoDefault() {
		return unSettableObjectPrimitiveNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnSettableObjectPrimitiveNoDefault(Long newUnSettableObjectPrimitiveNoDefault) {
		Long oldUnSettableObjectPrimitiveNoDefault = unSettableObjectPrimitiveNoDefault;
		unSettableObjectPrimitiveNoDefault = newUnSettableObjectPrimitiveNoDefault;
		boolean oldUnSettableObjectPrimitiveNoDefaultESet = unSettableObjectPrimitiveNoDefaultESet;
		unSettableObjectPrimitiveNoDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT, oldUnSettableObjectPrimitiveNoDefault, unSettableObjectPrimitiveNoDefault, !oldUnSettableObjectPrimitiveNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnSettableObjectPrimitiveNoDefault() {
		Long oldUnSettableObjectPrimitiveNoDefault = unSettableObjectPrimitiveNoDefault;
		boolean oldUnSettableObjectPrimitiveNoDefaultESet = unSettableObjectPrimitiveNoDefaultESet;
		unSettableObjectPrimitiveNoDefault = UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT;
		unSettableObjectPrimitiveNoDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT, oldUnSettableObjectPrimitiveNoDefault, UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT, oldUnSettableObjectPrimitiveNoDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnSettableObjectPrimitiveNoDefault() {
		return unSettableObjectPrimitiveNoDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStandardObjectPrimitiveNoDefault() {
		return standardObjectPrimitiveNoDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardObjectPrimitiveNoDefault(Long newStandardObjectPrimitiveNoDefault) {
		Long oldStandardObjectPrimitiveNoDefault = standardObjectPrimitiveNoDefault;
		standardObjectPrimitiveNoDefault = newStandardObjectPrimitiveNoDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT, oldStandardObjectPrimitiveNoDefault, standardObjectPrimitiveNoDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bz329275Package.ITEM__ID:
				return getId();
			case Bz329275Package.ITEM__VERSION:
				return getVersion();
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT:
				return getUnSettableStringNoDefault();
			case Bz329275Package.ITEM__STANDARD_STRING_NO_DEFAULT:
				return getStandardStringNoDefault();
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT:
				return getUnSettableStringWithDefault();
			case Bz329275Package.ITEM__STANDARD_STRING_DEFAULT:
				return getStandardStringDefault();
			case Bz329275Package.ITEM__UN_SETTABLE_ENUM:
				return getUnSettableEnum();
			case Bz329275Package.ITEM__STANDARD_ENUM:
				return getStandardEnum();
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT:
				return getUnSettablePrimitiveNoDefault();
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_NO_DEFAULT:
				return getStandardPrimitiveNoDefault();
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT:
				return getUnSettablePrimitiveWithDefault();
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT:
				return getStandardPrimitiveWithDefault();
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT:
				return getUnSettableObjectPrimitiveWithDefault();
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT:
				return getStandardObjectPrimitiveWithDefault();
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT:
				return getUnSettableObjectPrimitiveNoDefault();
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT:
				return getStandardObjectPrimitiveNoDefault();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bz329275Package.ITEM__ID:
				setId((Long)newValue);
				return;
			case Bz329275Package.ITEM__VERSION:
				setVersion((Long)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT:
				setUnSettableStringNoDefault((String)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_STRING_NO_DEFAULT:
				setStandardStringNoDefault((String)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT:
				setUnSettableStringWithDefault((String)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_STRING_DEFAULT:
				setStandardStringDefault((String)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_ENUM:
				setUnSettableEnum((TestEnum)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_ENUM:
				setStandardEnum((TestEnum)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT:
				setUnSettablePrimitiveNoDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_NO_DEFAULT:
				setStandardPrimitiveNoDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT:
				setUnSettablePrimitiveWithDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT:
				setStandardPrimitiveWithDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT:
				setUnSettableObjectPrimitiveWithDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT:
				setStandardObjectPrimitiveWithDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT:
				setUnSettableObjectPrimitiveNoDefault((Long)newValue);
				return;
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT:
				setStandardObjectPrimitiveNoDefault((Long)newValue);
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
			case Bz329275Package.ITEM__ID:
				unsetId();
				return;
			case Bz329275Package.ITEM__VERSION:
				unsetVersion();
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT:
				unsetUnSettableStringNoDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_STRING_NO_DEFAULT:
				setStandardStringNoDefault(STANDARD_STRING_NO_DEFAULT_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT:
				unsetUnSettableStringWithDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_STRING_DEFAULT:
				setStandardStringDefault(STANDARD_STRING_DEFAULT_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_ENUM:
				unsetUnSettableEnum();
				return;
			case Bz329275Package.ITEM__STANDARD_ENUM:
				setStandardEnum(STANDARD_ENUM_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT:
				unsetUnSettablePrimitiveNoDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_NO_DEFAULT:
				setStandardPrimitiveNoDefault(STANDARD_PRIMITIVE_NO_DEFAULT_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT:
				unsetUnSettablePrimitiveWithDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT:
				setStandardPrimitiveWithDefault(STANDARD_PRIMITIVE_WITH_DEFAULT_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT:
				unsetUnSettableObjectPrimitiveWithDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT:
				setStandardObjectPrimitiveWithDefault(STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT);
				return;
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT:
				unsetUnSettableObjectPrimitiveNoDefault();
				return;
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT:
				setStandardObjectPrimitiveNoDefault(STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT);
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
			case Bz329275Package.ITEM__ID:
				return isSetId();
			case Bz329275Package.ITEM__VERSION:
				return isSetVersion();
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_NO_DEFAULT:
				return isSetUnSettableStringNoDefault();
			case Bz329275Package.ITEM__STANDARD_STRING_NO_DEFAULT:
				return STANDARD_STRING_NO_DEFAULT_EDEFAULT == null ? standardStringNoDefault != null : !STANDARD_STRING_NO_DEFAULT_EDEFAULT.equals(standardStringNoDefault);
			case Bz329275Package.ITEM__UN_SETTABLE_STRING_WITH_DEFAULT:
				return isSetUnSettableStringWithDefault();
			case Bz329275Package.ITEM__STANDARD_STRING_DEFAULT:
				return STANDARD_STRING_DEFAULT_EDEFAULT == null ? standardStringDefault != null : !STANDARD_STRING_DEFAULT_EDEFAULT.equals(standardStringDefault);
			case Bz329275Package.ITEM__UN_SETTABLE_ENUM:
				return isSetUnSettableEnum();
			case Bz329275Package.ITEM__STANDARD_ENUM:
				return standardEnum != STANDARD_ENUM_EDEFAULT;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_NO_DEFAULT:
				return isSetUnSettablePrimitiveNoDefault();
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_NO_DEFAULT:
				return standardPrimitiveNoDefault != STANDARD_PRIMITIVE_NO_DEFAULT_EDEFAULT;
			case Bz329275Package.ITEM__UN_SETTABLE_PRIMITIVE_WITH_DEFAULT:
				return isSetUnSettablePrimitiveWithDefault();
			case Bz329275Package.ITEM__STANDARD_PRIMITIVE_WITH_DEFAULT:
				return standardPrimitiveWithDefault != STANDARD_PRIMITIVE_WITH_DEFAULT_EDEFAULT;
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_WITH_DEFAULT:
				return isSetUnSettableObjectPrimitiveWithDefault();
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT:
				return STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT == null ? standardObjectPrimitiveWithDefault != null : !STANDARD_OBJECT_PRIMITIVE_WITH_DEFAULT_EDEFAULT.equals(standardObjectPrimitiveWithDefault);
			case Bz329275Package.ITEM__UN_SETTABLE_OBJECT_PRIMITIVE_NO_DEFAULT:
				return isSetUnSettableObjectPrimitiveNoDefault();
			case Bz329275Package.ITEM__STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT:
				return STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT == null ? standardObjectPrimitiveNoDefault != null : !STANDARD_OBJECT_PRIMITIVE_NO_DEFAULT_EDEFAULT.equals(standardObjectPrimitiveNoDefault);
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(", unSettableStringNoDefault: ");
		if (unSettableStringNoDefaultESet) result.append(unSettableStringNoDefault); else result.append("<unset>");
		result.append(", standardStringNoDefault: ");
		result.append(standardStringNoDefault);
		result.append(", unSettableStringWithDefault: ");
		if (unSettableStringWithDefaultESet) result.append(unSettableStringWithDefault); else result.append("<unset>");
		result.append(", standardStringDefault: ");
		result.append(standardStringDefault);
		result.append(", unSettableEnum: ");
		if (unSettableEnumESet) result.append(unSettableEnum); else result.append("<unset>");
		result.append(", standardEnum: ");
		result.append(standardEnum);
		result.append(", unSettablePrimitiveNoDefault: ");
		if (unSettablePrimitiveNoDefaultESet) result.append(unSettablePrimitiveNoDefault); else result.append("<unset>");
		result.append(", standardPrimitiveNoDefault: ");
		result.append(standardPrimitiveNoDefault);
		result.append(", unSettablePrimitiveWithDefault: ");
		if (unSettablePrimitiveWithDefaultESet) result.append(unSettablePrimitiveWithDefault); else result.append("<unset>");
		result.append(", standardPrimitiveWithDefault: ");
		result.append(standardPrimitiveWithDefault);
		result.append(", unSettableObjectPrimitiveWithDefault: ");
		if (unSettableObjectPrimitiveWithDefaultESet) result.append(unSettableObjectPrimitiveWithDefault); else result.append("<unset>");
		result.append(", standardObjectPrimitiveWithDefault: ");
		result.append(standardObjectPrimitiveWithDefault);
		result.append(", unSettableObjectPrimitiveNoDefault: ");
		if (unSettableObjectPrimitiveNoDefaultESet) result.append(unSettableObjectPrimitiveNoDefault); else result.append("<unset>");
		result.append(", standardObjectPrimitiveNoDefault: ");
		result.append(standardObjectPrimitiveNoDefault);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
