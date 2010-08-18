/**
 * <copyright>
 * </copyright>
 *
 * $Id: ColumnImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getSqlType <em>Sql Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.ColumnImpl#getUniqueKey <em>Unique Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
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
	 * The default value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected String check = CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected static final String SQL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSqlType() <em>Sql Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlType()
	 * @generated
	 * @ordered
	 */
	protected String sqlType = SQL_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getColumn();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(String newCheck) {
		String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__INDEX, oldIndex, index));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__NOT_NULL, oldNotNull, notNull, !oldNotNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COLUMN__NOT_NULL, oldNotNull, NOT_NULL_EDEFAULT, oldNotNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__PRECISION, oldPrecision, precision));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSqlType() {
		return sqlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqlType(String newSqlType) {
		String oldSqlType = sqlType;
		sqlType = newSqlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__SQL_TYPE, oldSqlType, sqlType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__UNIQUE, oldUnique, unique, !oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.COLUMN__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.COLUMN__UNIQUE_KEY, oldUniqueKey, uniqueKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.COLUMN__COMMENT:
				return getComment();
			case Hbm30Package.COLUMN__CHECK:
				return getCheck();
			case Hbm30Package.COLUMN__DEFAULT:
				return getDefault();
			case Hbm30Package.COLUMN__INDEX:
				return getIndex();
			case Hbm30Package.COLUMN__LENGTH:
				return getLength();
			case Hbm30Package.COLUMN__NAME:
				return getName();
			case Hbm30Package.COLUMN__NOT_NULL:
				return isNotNull();
			case Hbm30Package.COLUMN__PRECISION:
				return getPrecision();
			case Hbm30Package.COLUMN__SCALE:
				return getScale();
			case Hbm30Package.COLUMN__SQL_TYPE:
				return getSqlType();
			case Hbm30Package.COLUMN__UNIQUE:
				return isUnique();
			case Hbm30Package.COLUMN__UNIQUE_KEY:
				return getUniqueKey();
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
			case Hbm30Package.COLUMN__COMMENT:
				setComment((String)newValue);
				return;
			case Hbm30Package.COLUMN__CHECK:
				setCheck((String)newValue);
				return;
			case Hbm30Package.COLUMN__DEFAULT:
				setDefault((String)newValue);
				return;
			case Hbm30Package.COLUMN__INDEX:
				setIndex((String)newValue);
				return;
			case Hbm30Package.COLUMN__LENGTH:
				setLength((String)newValue);
				return;
			case Hbm30Package.COLUMN__NAME:
				setName((String)newValue);
				return;
			case Hbm30Package.COLUMN__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case Hbm30Package.COLUMN__PRECISION:
				setPrecision((String)newValue);
				return;
			case Hbm30Package.COLUMN__SCALE:
				setScale((String)newValue);
				return;
			case Hbm30Package.COLUMN__SQL_TYPE:
				setSqlType((String)newValue);
				return;
			case Hbm30Package.COLUMN__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case Hbm30Package.COLUMN__UNIQUE_KEY:
				setUniqueKey((String)newValue);
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
			case Hbm30Package.COLUMN__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__CHECK:
				setCheck(CHECK_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__NOT_NULL:
				unsetNotNull();
				return;
			case Hbm30Package.COLUMN__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__SQL_TYPE:
				setSqlType(SQL_TYPE_EDEFAULT);
				return;
			case Hbm30Package.COLUMN__UNIQUE:
				unsetUnique();
				return;
			case Hbm30Package.COLUMN__UNIQUE_KEY:
				setUniqueKey(UNIQUE_KEY_EDEFAULT);
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
			case Hbm30Package.COLUMN__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Hbm30Package.COLUMN__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
			case Hbm30Package.COLUMN__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case Hbm30Package.COLUMN__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case Hbm30Package.COLUMN__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case Hbm30Package.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Hbm30Package.COLUMN__NOT_NULL:
				return isSetNotNull();
			case Hbm30Package.COLUMN__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case Hbm30Package.COLUMN__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case Hbm30Package.COLUMN__SQL_TYPE:
				return SQL_TYPE_EDEFAULT == null ? sqlType != null : !SQL_TYPE_EDEFAULT.equals(sqlType);
			case Hbm30Package.COLUMN__UNIQUE:
				return isSetUnique();
			case Hbm30Package.COLUMN__UNIQUE_KEY:
				return UNIQUE_KEY_EDEFAULT == null ? uniqueKey != null : !UNIQUE_KEY_EDEFAULT.equals(uniqueKey);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", check: ");
		result.append(check);
		result.append(", default: ");
		result.append(default_);
		result.append(", index: ");
		result.append(index);
		result.append(", length: ");
		result.append(length);
		result.append(", name: ");
		result.append(name);
		result.append(", notNull: ");
		if (notNullESet) result.append(notNull); else result.append("<unset>");
		result.append(", precision: ");
		result.append(precision);
		result.append(", scale: ");
		result.append(scale);
		result.append(", sqlType: ");
		result.append(sqlType);
		result.append(", unique: ");
		if (uniqueESet) result.append(unique); else result.append("<unset>");
		result.append(", uniqueKey: ");
		result.append(uniqueKey);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
