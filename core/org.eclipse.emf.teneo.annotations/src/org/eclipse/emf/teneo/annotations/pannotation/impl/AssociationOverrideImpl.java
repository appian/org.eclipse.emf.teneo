/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationOverrideImpl.java,v 1.7 2007/11/14 16:37:54 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pannotation.AssociationOverride;
import org.eclipse.emf.teneo.annotations.pannotation.JoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.JoinTable;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Association Override</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverrideImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverrideImpl#getJoinColumns <em>Join Columns</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.AssociationOverrideImpl#getJoinTable <em>Join Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationOverrideImpl extends PAnnotationImpl implements AssociationOverride {
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
	 * The cached value of the '{@link #getJoinColumns() <em>Join Columns</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJoinColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinColumn> joinColumns;

	/**
	 * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getJoinTable()
	 * @generated
	 * @ordered
	 */
	protected JoinTable joinTable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.ASSOCIATION_OVERRIDE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.ASSOCIATION_OVERRIDE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinColumn> getJoinColumns() {
		if (joinColumns == null) {
			joinColumns = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS);
		}
		return joinColumns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTable getJoinTable() {
		return joinTable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
		JoinTable oldJoinTable = joinTable;
		joinTable = newJoinTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, oldJoinTable, newJoinTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinTable(JoinTable newJoinTable) {
		if (newJoinTable != joinTable) {
			NotificationChain msgs = null;
			if (joinTable != null)
				msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, null, msgs);
			if (newJoinTable != null)
				msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, null, msgs);
			msgs = basicSetJoinTable(newJoinTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE, newJoinTable, newJoinTable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS:
				return ((InternalEList<?>)getJoinColumns()).basicRemove(otherEnd, msgs);
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
				return basicSetJoinTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PannotationPackage.ASSOCIATION_OVERRIDE__NAME:
				return getName();
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS:
				return getJoinColumns();
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
				return getJoinTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PannotationPackage.ASSOCIATION_OVERRIDE__NAME:
				setName((String)newValue);
				return;
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS:
				getJoinColumns().clear();
				getJoinColumns().addAll((Collection<? extends JoinColumn>)newValue);
				return;
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
				setJoinTable((JoinTable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PannotationPackage.ASSOCIATION_OVERRIDE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS:
				getJoinColumns().clear();
				return;
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
				setJoinTable((JoinTable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PannotationPackage.ASSOCIATION_OVERRIDE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_COLUMNS:
				return joinColumns != null && !joinColumns.isEmpty();
			case PannotationPackage.ASSOCIATION_OVERRIDE__JOIN_TABLE:
				return joinTable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
} // AssociationOverrideImpl
