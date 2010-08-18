/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapKeyManyToManyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.Column;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.MapKeyManyToMany;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Key Many To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.MapKeyManyToManyImpl#getFormula1 <em>Formula1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapKeyManyToManyImpl extends EObjectImpl implements MapKeyManyToMany {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapKeyManyToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getMapKeyManyToMany();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		return getGroup().list(Hbm30Package.eINSTANCE.getMapKeyManyToMany_Column());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFormula() {
		return getGroup().list(Hbm30Package.eINSTANCE.getMapKeyManyToMany_Formula());
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY_MANY_TO_MANY__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN1, oldColumn1, column1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY_MANY_TO_MANY__ENTITY_NAME, oldEntityName, entityName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY_MANY_TO_MANY__FOREIGN_KEY, oldForeignKey, foreignKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA1, oldFormula1, formula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN:
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
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN:
				return getColumn();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA:
				return getFormula();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__CLASS:
				return getClass_();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN1:
				return getColumn1();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FOREIGN_KEY:
				return getForeignKey();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA1:
				return getFormula1();
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
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA:
				getFormula().clear();
				getFormula().addAll((Collection<? extends String>)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN1:
				setColumn1((String)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FOREIGN_KEY:
				setForeignKey((String)newValue);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA1:
				setFormula1((String)newValue);
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
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN:
				getColumn().clear();
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA:
				getFormula().clear();
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN1:
				setColumn1(COLUMN1_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FOREIGN_KEY:
				setForeignKey(FOREIGN_KEY_EDEFAULT);
				return;
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA1:
				setFormula1(FORMULA1_EDEFAULT);
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
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__GROUP:
				return group != null && !group.isEmpty();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN:
				return !getColumn().isEmpty();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA:
				return !getFormula().isEmpty();
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__COLUMN1:
				return COLUMN1_EDEFAULT == null ? column1 != null : !COLUMN1_EDEFAULT.equals(column1);
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FOREIGN_KEY:
				return FOREIGN_KEY_EDEFAULT == null ? foreignKey != null : !FOREIGN_KEY_EDEFAULT.equals(foreignKey);
			case Hbm30Package.MAP_KEY_MANY_TO_MANY__FORMULA1:
				return FORMULA1_EDEFAULT == null ? formula1 != null : !FORMULA1_EDEFAULT.equals(formula1);
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
		result.append(", class: ");
		result.append(class_);
		result.append(", column1: ");
		result.append(column1);
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", foreignKey: ");
		result.append(foreignKey);
		result.append(", formula1: ");
		result.append(formula1);
		result.append(')');
		return result.toString();
	}

} //MapKeyManyToManyImpl
