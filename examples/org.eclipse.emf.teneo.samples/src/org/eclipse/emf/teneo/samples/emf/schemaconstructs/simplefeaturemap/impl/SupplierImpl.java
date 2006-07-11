/**
 * <copyright>
 * </copyright>
 *
 * $Id: SupplierImpl.java,v 1.1 2006/07/11 16:57:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getPreferredOrders <em>Preferred Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getStandardOrders <em>Standard Orders</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getHardCopyOrderReference <em>Hard Copy Order Reference</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl.SupplierImpl#getHardCopyOrderNumber <em>Hard Copy Order Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupplierImpl extends EObjectImpl implements Supplier {
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
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap orders = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimplefeaturemapPackage.eINSTANCE.getSupplier();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimplefeaturemapPackage.SUPPLIER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrders() {
		if (orders == null) {
			orders = new BasicFeatureMap(this, SimplefeaturemapPackage.SUPPLIER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPreferredOrders() {
		return ((FeatureMap)getOrders()).list(SimplefeaturemapPackage.eINSTANCE.getSupplier_PreferredOrders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStandardOrders() {
		return ((FeatureMap)getOrders()).list(SimplefeaturemapPackage.eINSTANCE.getSupplier_StandardOrders());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHardCopyOrderReference() {
		return ((FeatureMap)getOrders()).list(SimplefeaturemapPackage.eINSTANCE.getSupplier_HardCopyOrderReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHardCopyOrderNumber() {
		return ((FeatureMap)getOrders()).list(SimplefeaturemapPackage.eINSTANCE.getSupplier_HardCopyOrderNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SimplefeaturemapPackage.SUPPLIER__ORDERS:
					return ((InternalEList)getOrders()).basicRemove(otherEnd, msgs);
				case SimplefeaturemapPackage.SUPPLIER__PREFERRED_ORDERS:
					return ((InternalEList)getPreferredOrders()).basicRemove(otherEnd, msgs);
				case SimplefeaturemapPackage.SUPPLIER__STANDARD_ORDERS:
					return ((InternalEList)getStandardOrders()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SimplefeaturemapPackage.SUPPLIER__NAME:
				return getName();
			case SimplefeaturemapPackage.SUPPLIER__ORDERS:
				return getOrders();
			case SimplefeaturemapPackage.SUPPLIER__PREFERRED_ORDERS:
				return getPreferredOrders();
			case SimplefeaturemapPackage.SUPPLIER__STANDARD_ORDERS:
				return getStandardOrders();
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_REFERENCE:
				return getHardCopyOrderReference();
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_NUMBER:
				return getHardCopyOrderNumber();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SimplefeaturemapPackage.SUPPLIER__NAME:
				setName((String)newValue);
				return;
			case SimplefeaturemapPackage.SUPPLIER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection)newValue);
				return;
			case SimplefeaturemapPackage.SUPPLIER__PREFERRED_ORDERS:
				getPreferredOrders().clear();
				getPreferredOrders().addAll((Collection)newValue);
				return;
			case SimplefeaturemapPackage.SUPPLIER__STANDARD_ORDERS:
				getStandardOrders().clear();
				getStandardOrders().addAll((Collection)newValue);
				return;
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_REFERENCE:
				getHardCopyOrderReference().clear();
				getHardCopyOrderReference().addAll((Collection)newValue);
				return;
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_NUMBER:
				getHardCopyOrderNumber().clear();
				getHardCopyOrderNumber().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SimplefeaturemapPackage.SUPPLIER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplefeaturemapPackage.SUPPLIER__ORDERS:
				getOrders().clear();
				return;
			case SimplefeaturemapPackage.SUPPLIER__PREFERRED_ORDERS:
				getPreferredOrders().clear();
				return;
			case SimplefeaturemapPackage.SUPPLIER__STANDARD_ORDERS:
				getStandardOrders().clear();
				return;
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_REFERENCE:
				getHardCopyOrderReference().clear();
				return;
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_NUMBER:
				getHardCopyOrderNumber().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SimplefeaturemapPackage.SUPPLIER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplefeaturemapPackage.SUPPLIER__ORDERS:
				return orders != null && !orders.isEmpty();
			case SimplefeaturemapPackage.SUPPLIER__PREFERRED_ORDERS:
				return !getPreferredOrders().isEmpty();
			case SimplefeaturemapPackage.SUPPLIER__STANDARD_ORDERS:
				return !getStandardOrders().isEmpty();
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_REFERENCE:
				return !getHardCopyOrderReference().isEmpty();
			case SimplefeaturemapPackage.SUPPLIER__HARD_COPY_ORDER_NUMBER:
				return !getHardCopyOrderNumber().isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", orders: ");
		result.append(orders);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
