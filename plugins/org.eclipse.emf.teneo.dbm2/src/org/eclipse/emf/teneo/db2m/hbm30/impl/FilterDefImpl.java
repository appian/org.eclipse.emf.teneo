/**
 * <copyright>
 * </copyright>
 *
 * $Id: FilterDefImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
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

import org.eclipse.emf.teneo.db2m.hbm30.FilterDef;
import org.eclipse.emf.teneo.db2m.hbm30.FilterParam;
import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl#getFilterParam <em>Filter Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.FilterDefImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterDefImpl extends EObjectImpl implements FilterDef {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getFilterDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Hbm30Package.FILTER_DEF__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Hbm30Package.eINSTANCE.getFilterDef_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterParam> getFilterParam() {
		return getGroup().list(Hbm30Package.eINSTANCE.getFilterDef_FilterParam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.FILTER_DEF__CONDITION, oldCondition, condition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.FILTER_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hbm30Package.FILTER_DEF__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Hbm30Package.FILTER_DEF__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Hbm30Package.FILTER_DEF__FILTER_PARAM:
				return ((InternalEList<?>)getFilterParam()).basicRemove(otherEnd, msgs);
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
			case Hbm30Package.FILTER_DEF__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Hbm30Package.FILTER_DEF__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Hbm30Package.FILTER_DEF__FILTER_PARAM:
				return getFilterParam();
			case Hbm30Package.FILTER_DEF__CONDITION:
				return getCondition();
			case Hbm30Package.FILTER_DEF__NAME:
				return getName();
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
			case Hbm30Package.FILTER_DEF__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Hbm30Package.FILTER_DEF__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Hbm30Package.FILTER_DEF__FILTER_PARAM:
				getFilterParam().clear();
				getFilterParam().addAll((Collection<? extends FilterParam>)newValue);
				return;
			case Hbm30Package.FILTER_DEF__CONDITION:
				setCondition((String)newValue);
				return;
			case Hbm30Package.FILTER_DEF__NAME:
				setName((String)newValue);
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
			case Hbm30Package.FILTER_DEF__MIXED:
				getMixed().clear();
				return;
			case Hbm30Package.FILTER_DEF__GROUP:
				getGroup().clear();
				return;
			case Hbm30Package.FILTER_DEF__FILTER_PARAM:
				getFilterParam().clear();
				return;
			case Hbm30Package.FILTER_DEF__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case Hbm30Package.FILTER_DEF__NAME:
				setName(NAME_EDEFAULT);
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
			case Hbm30Package.FILTER_DEF__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Hbm30Package.FILTER_DEF__GROUP:
				return !getGroup().isEmpty();
			case Hbm30Package.FILTER_DEF__FILTER_PARAM:
				return !getFilterParam().isEmpty();
			case Hbm30Package.FILTER_DEF__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case Hbm30Package.FILTER_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", condition: ");
		result.append(condition);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FilterDefImpl
