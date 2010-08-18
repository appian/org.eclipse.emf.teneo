/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorImpl.java,v 1.1 2010/08/18 09:21:38 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Discriminator;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discriminator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#isForce <em>Force</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.DiscriminatorImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiscriminatorImpl extends EObjectImpl implements Discriminator {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The default value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected String formula = FORMULA_EDEFAULT;

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
	 * The default value of the '{@link #isForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForce()
	 * @generated
	 * @ordered
	 */
	protected boolean force = FORCE_EDEFAULT;

	/**
	 * This is true if the Force attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceESet;

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
	 * The default value of the '{@link #isNotNull() <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_NULL_EDEFAULT = true;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "string";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscriminatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getDiscriminator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.DISCRIMINATOR__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hbm30Package.DISCRIMINATOR__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(String newFormula) {
		String oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__FORMULA, oldFormula, formula));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__COLUMN1, oldColumn1, column1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(boolean newForce) {
		boolean oldForce = force;
		force = newForce;
		boolean oldForceESet = forceESet;
		forceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__FORCE, oldForce, force, !oldForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForce() {
		boolean oldForce = force;
		boolean oldForceESet = forceESet;
		force = FORCE_EDEFAULT;
		forceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.DISCRIMINATOR__FORCE, oldForce, FORCE_EDEFAULT, oldForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForce() {
		return forceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__FORMULA1, oldFormula1, formula1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__INSERT, oldInsert, insert, !oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.DISCRIMINATOR__INSERT, oldInsert, INSERT_EDEFAULT, oldInsertESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__NOT_NULL, oldNotNull, notNull, !oldNotNullESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.DISCRIMINATOR__NOT_NULL, oldNotNull, NOT_NULL_EDEFAULT, oldNotNullESet));
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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.DISCRIMINATOR__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.DISCRIMINATOR__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.DISCRIMINATOR__COLUMN:
				return basicSetColumn(null, msgs);
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
			case Hbm30Package.DISCRIMINATOR__COLUMN:
				return getColumn();
			case Hbm30Package.DISCRIMINATOR__FORMULA:
				return getFormula();
			case Hbm30Package.DISCRIMINATOR__COLUMN1:
				return getColumn1();
			case Hbm30Package.DISCRIMINATOR__FORCE:
				return isForce();
			case Hbm30Package.DISCRIMINATOR__FORMULA1:
				return getFormula1();
			case Hbm30Package.DISCRIMINATOR__INSERT:
				return isInsert();
			case Hbm30Package.DISCRIMINATOR__LENGTH:
				return getLength();
			case Hbm30Package.DISCRIMINATOR__NOT_NULL:
				return isNotNull();
			case Hbm30Package.DISCRIMINATOR__TYPE:
				return getType();
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
			case Hbm30Package.DISCRIMINATOR__COLUMN:
				setColumn((Column)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__FORMULA:
				setFormula((String)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__FORCE:
				setForce((Boolean)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__FORMULA1:
				setFormula1((String)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__INSERT:
				setInsert((Boolean)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__LENGTH:
				setLength((String)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__NOT_NULL:
				setNotNull((Boolean)newValue);
				return;
			case Hbm30Package.DISCRIMINATOR__TYPE:
				setType((String)newValue);
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
			case Hbm30Package.DISCRIMINATOR__COLUMN:
				setColumn((Column)null);
				return;
			case Hbm30Package.DISCRIMINATOR__FORMULA:
				setFormula(FORMULA_EDEFAULT);
				return;
			case Hbm30Package.DISCRIMINATOR__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.DISCRIMINATOR__FORCE:
				unsetForce();
				return;
			case Hbm30Package.DISCRIMINATOR__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
				return;
			case Hbm30Package.DISCRIMINATOR__INSERT:
				unsetInsert();
				return;
			case Hbm30Package.DISCRIMINATOR__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case Hbm30Package.DISCRIMINATOR__NOT_NULL:
				unsetNotNull();
				return;
			case Hbm30Package.DISCRIMINATOR__TYPE:
				unsetType();
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
			case Hbm30Package.DISCRIMINATOR__COLUMN:
				return column != null;
			case Hbm30Package.DISCRIMINATOR__FORMULA:
				return FORMULA_EDEFAULT == null ? formula != null : !FORMULA_EDEFAULT.equals(formula);
			case Hbm30Package.DISCRIMINATOR__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.DISCRIMINATOR__FORCE:
				return isSetForce();
			case Hbm30Package.DISCRIMINATOR__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
			case Hbm30Package.DISCRIMINATOR__INSERT:
				return isSetInsert();
			case Hbm30Package.DISCRIMINATOR__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case Hbm30Package.DISCRIMINATOR__NOT_NULL:
				return isSetNotNull();
			case Hbm30Package.DISCRIMINATOR__TYPE:
				return isSetType();
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
		result.append(", column1: ");
		result.append(column1);
		result.append(", force: ");
		if (forceESet) result.append(force); else result.append("<unset>");
		result.append(", formula1: ");
		result.append(formula1);
		result.append(", insert: ");
		if (insertESet) result.append(insert); else result.append("<unset>");
		result.append(", length: ");
		result.append(length);
		result.append(", notNull: ");
		if (notNullESet) result.append(notNull); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DiscriminatorImpl
