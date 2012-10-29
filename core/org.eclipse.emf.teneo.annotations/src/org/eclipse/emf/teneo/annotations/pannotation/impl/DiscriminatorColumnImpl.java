/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiscriminatorColumnImpl.java,v 1.9 2009/09/13 14:45:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorColumn;
import org.eclipse.emf.teneo.annotations.pannotation.DiscriminatorType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discriminator Column</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl#getDiscriminatorType
 * <em>Discriminator Type</em>}</li>
 * <li>
 * {@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl#getColumnDefinition
 * <em>Column Definition</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl#getLength
 * <em>Length</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.DiscriminatorColumnImpl#getColumn
 * <em>Column</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DiscriminatorColumnImpl extends PAnnotationImpl implements DiscriminatorColumn {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "DTYPE";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected static final DiscriminatorType DISCRIMINATOR_TYPE_EDEFAULT = DiscriminatorType.STRING;

	/**
	 * The cached value of the '{@link #getDiscriminatorType() <em>Discriminator Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiscriminatorType()
	 * @generated
	 * @ordered
	 */
	protected DiscriminatorType discriminatorType = DISCRIMINATOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 31;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * This is true if the Length attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean lengthESet;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiscriminatorColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.DISCRIMINATOR_COLUMN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiscriminatorType getDiscriminatorType() {
		return discriminatorType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDiscriminatorType(DiscriminatorType newDiscriminatorType) {
		DiscriminatorType oldDiscriminatorType = discriminatorType;
		discriminatorType = newDiscriminatorType == null ? DISCRIMINATOR_TYPE_EDEFAULT
				: newDiscriminatorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE, oldDiscriminatorType,
					discriminatorType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		boolean oldLengthESet = lengthESet;
		lengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH, oldLength, length, !oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetLength() {
		int oldLength = length;
		boolean oldLengthESet = lengthESet;
		length = LENGTH_EDEFAULT;
		lengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH, oldLength, LENGTH_EDEFAULT,
					oldLengthESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetLength() {
		return lengthESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Column getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN, oldColumn, newColumn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject) column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject) newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN, newColumn, newColumn));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN:
			return basicSetColumn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PannotationPackage.DISCRIMINATOR_COLUMN__NAME:
			return getName();
		case PannotationPackage.DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE:
			return getDiscriminatorType();
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN_DEFINITION:
			return getColumnDefinition();
		case PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH:
			return getLength();
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN:
			return getColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PannotationPackage.DISCRIMINATOR_COLUMN__NAME:
			setName((String) newValue);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE:
			setDiscriminatorType((DiscriminatorType) newValue);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN_DEFINITION:
			setColumnDefinition((String) newValue);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH:
			setLength((Integer) newValue);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN:
			setColumn((Column) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PannotationPackage.DISCRIMINATOR_COLUMN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE:
			setDiscriminatorType(DISCRIMINATOR_TYPE_EDEFAULT);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN_DEFINITION:
			setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH:
			unsetLength();
			return;
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN:
			setColumn((Column) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PannotationPackage.DISCRIMINATOR_COLUMN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PannotationPackage.DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE:
			return discriminatorType != DISCRIMINATOR_TYPE_EDEFAULT;
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN_DEFINITION:
			return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null
					: !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
		case PannotationPackage.DISCRIMINATOR_COLUMN__LENGTH:
			return isSetLength();
		case PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN:
			return column != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getColumnDefinition() {
		return columnDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColumnDefinition(String newColumnDefinition) {
		String oldColumnDefinition = columnDefinition;
		columnDefinition = newColumnDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.DISCRIMINATOR_COLUMN__COLUMN_DEFINITION, oldColumnDefinition,
					columnDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", discriminatorType: ");
		result.append(discriminatorType);
		result.append(", columnDefinition: ");
		result.append(columnDefinition);
		result.append(", length: ");
		if (lengthESet)
			result.append(length);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // DiscriminatorColumnImpl
