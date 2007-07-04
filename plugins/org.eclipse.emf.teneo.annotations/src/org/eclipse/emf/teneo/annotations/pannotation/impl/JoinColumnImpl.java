/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinColumnImpl.java,v 1.6 2007/07/04 19:28:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#getReferencedColumnName <em>Referenced Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#isUpdatable <em>Updatable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.JoinColumnImpl#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinColumnImpl extends EObjectImpl implements JoinColumn {
	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement;

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
	 * The default value of the '{@link #getReferencedColumnName() <em>Referenced Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedColumnName() <em>Referenced Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumnName()
	 * @generated
	 * @ordered
	 */
	protected String referencedColumnName = REFERENCED_COLUMN_NAME_EDEFAULT;

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
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertable()
	 * @generated
	 * @ordered
	 */
	protected boolean insertable = INSERTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdatable()
	 * @generated
	 * @ordered
	 */
	protected boolean updatable = UPDATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

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
	protected JoinColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.JOIN_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (EModelElement)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT, oldEModelElement, eModelElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__NAME, oldName, name));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsertable() {
		return insertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertable(boolean newInsertable) {
		boolean oldInsertable = insertable;
		insertable = newInsertable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__INSERTABLE, oldInsertable, insertable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdatable() {
		return updatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatable(boolean newUpdatable) {
		boolean oldUpdatable = updatable;
		updatable = newUpdatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__UPDATABLE, oldUpdatable, updatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnDefinition() {
		return columnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDefinition(String newColumnDefinition) {
		String oldColumnDefinition = columnDefinition;
		columnDefinition = newColumnDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__COLUMN_DEFINITION, oldColumnDefinition, columnDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case PannotationPackage.JOIN_COLUMN__NAME:
				return getName();
			case PannotationPackage.JOIN_COLUMN__REFERENCED_COLUMN_NAME:
				return getReferencedColumnName();
			case PannotationPackage.JOIN_COLUMN__UNIQUE:
				return isUnique() ? Boolean.TRUE : Boolean.FALSE;
			case PannotationPackage.JOIN_COLUMN__NULLABLE:
				return isNullable() ? Boolean.TRUE : Boolean.FALSE;
			case PannotationPackage.JOIN_COLUMN__INSERTABLE:
				return isInsertable() ? Boolean.TRUE : Boolean.FALSE;
			case PannotationPackage.JOIN_COLUMN__UPDATABLE:
				return isUpdatable() ? Boolean.TRUE : Boolean.FALSE;
			case PannotationPackage.JOIN_COLUMN__COLUMN_DEFINITION:
				return getColumnDefinition();
			case PannotationPackage.JOIN_COLUMN__TABLE:
				return getTable();
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
			case PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case PannotationPackage.JOIN_COLUMN__NAME:
				setName((String)newValue);
				return;
			case PannotationPackage.JOIN_COLUMN__REFERENCED_COLUMN_NAME:
				setReferencedColumnName((String)newValue);
				return;
			case PannotationPackage.JOIN_COLUMN__UNIQUE:
				setUnique(((Boolean)newValue).booleanValue());
				return;
			case PannotationPackage.JOIN_COLUMN__NULLABLE:
				setNullable(((Boolean)newValue).booleanValue());
				return;
			case PannotationPackage.JOIN_COLUMN__INSERTABLE:
				setInsertable(((Boolean)newValue).booleanValue());
				return;
			case PannotationPackage.JOIN_COLUMN__UPDATABLE:
				setUpdatable(((Boolean)newValue).booleanValue());
				return;
			case PannotationPackage.JOIN_COLUMN__COLUMN_DEFINITION:
				setColumnDefinition((String)newValue);
				return;
			case PannotationPackage.JOIN_COLUMN__TABLE:
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
			case PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case PannotationPackage.JOIN_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__REFERENCED_COLUMN_NAME:
				setReferencedColumnName(REFERENCED_COLUMN_NAME_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__INSERTABLE:
				setInsertable(INSERTABLE_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__UPDATABLE:
				setUpdatable(UPDATABLE_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__COLUMN_DEFINITION:
				setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
				return;
			case PannotationPackage.JOIN_COLUMN__TABLE:
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
			case PannotationPackage.JOIN_COLUMN__EMODEL_ELEMENT:
				return eModelElement != null;
			case PannotationPackage.JOIN_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PannotationPackage.JOIN_COLUMN__REFERENCED_COLUMN_NAME:
				return REFERENCED_COLUMN_NAME_EDEFAULT == null ? referencedColumnName != null : !REFERENCED_COLUMN_NAME_EDEFAULT.equals(referencedColumnName);
			case PannotationPackage.JOIN_COLUMN__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case PannotationPackage.JOIN_COLUMN__NULLABLE:
				return nullable != NULLABLE_EDEFAULT;
			case PannotationPackage.JOIN_COLUMN__INSERTABLE:
				return insertable != INSERTABLE_EDEFAULT;
			case PannotationPackage.JOIN_COLUMN__UPDATABLE:
				return updatable != UPDATABLE_EDEFAULT;
			case PannotationPackage.JOIN_COLUMN__COLUMN_DEFINITION:
				return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null : !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
			case PannotationPackage.JOIN_COLUMN__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedColumnName() {
		return referencedColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedColumnName(String newReferencedColumnName) {
		String oldReferencedColumnName = referencedColumnName;
		referencedColumnName = newReferencedColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.JOIN_COLUMN__REFERENCED_COLUMN_NAME, oldReferencedColumnName, referencedColumnName));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", referencedColumnName: ");
		result.append(referencedColumnName);
		result.append(", unique: ");
		result.append(unique);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", insertable: ");
		result.append(insertable);
		result.append(", updatable: ");
		result.append(updatable);
		result.append(", columnDefinition: ");
		result.append(columnDefinition);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //JoinColumnImpl
