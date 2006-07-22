/**
 * <copyright>
 * </copyright>
 *
 * $Id: PriceTypeImpl.java,v 1.2 2006/07/22 13:01:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.SupplierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Price Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.PriceTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.PriceTypeImpl#getQuantityTo <em>Quantity To</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.PriceTypeImpl#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriceTypeImpl extends EObjectImpl implements PriceType {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * This is true if the Price attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priceESet = false;

	/**
	 * The default value of the '{@link #getQuantityTo() <em>Quantity To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityTo()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITY_TO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantityTo() <em>Quantity To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityTo()
	 * @generated
	 * @ordered
	 */
	protected double quantityTo = QUANTITY_TO_EDEFAULT;

	/**
	 * This is true if the Quantity To attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityToESet = false;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected SupplierType supplier = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PRICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		boolean oldPriceESet = priceESet;
		priceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRICE_TYPE__PRICE, oldPrice, price, !oldPriceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrice() {
		double oldPrice = price;
		boolean oldPriceESet = priceESet;
		price = PRICE_EDEFAULT;
		priceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.PRICE_TYPE__PRICE, oldPrice, PRICE_EDEFAULT, oldPriceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrice() {
		return priceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantityTo() {
		return quantityTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityTo(double newQuantityTo) {
		double oldQuantityTo = quantityTo;
		quantityTo = newQuantityTo;
		boolean oldQuantityToESet = quantityToESet;
		quantityToESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRICE_TYPE__QUANTITY_TO, oldQuantityTo, quantityTo, !oldQuantityToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantityTo() {
		double oldQuantityTo = quantityTo;
		boolean oldQuantityToESet = quantityToESet;
		quantityTo = QUANTITY_TO_EDEFAULT;
		quantityToESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.PRICE_TYPE__QUANTITY_TO, oldQuantityTo, QUANTITY_TO_EDEFAULT, oldQuantityToESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantityTo() {
		return quantityToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierType getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(SupplierType newSupplier) {
		SupplierType oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRICE_TYPE__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.PRICE_TYPE__PRICE:
				return new Double(getPrice());
			case CatalogPackage.PRICE_TYPE__QUANTITY_TO:
				return new Double(getQuantityTo());
			case CatalogPackage.PRICE_TYPE__SUPPLIER:
				return getSupplier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.PRICE_TYPE__PRICE:
				setPrice(((Double)newValue).doubleValue());
				return;
			case CatalogPackage.PRICE_TYPE__QUANTITY_TO:
				setQuantityTo(((Double)newValue).doubleValue());
				return;
			case CatalogPackage.PRICE_TYPE__SUPPLIER:
				setSupplier((SupplierType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CatalogPackage.PRICE_TYPE__PRICE:
				unsetPrice();
				return;
			case CatalogPackage.PRICE_TYPE__QUANTITY_TO:
				unsetQuantityTo();
				return;
			case CatalogPackage.PRICE_TYPE__SUPPLIER:
				setSupplier((SupplierType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CatalogPackage.PRICE_TYPE__PRICE:
				return isSetPrice();
			case CatalogPackage.PRICE_TYPE__QUANTITY_TO:
				return isSetQuantityTo();
			case CatalogPackage.PRICE_TYPE__SUPPLIER:
				return supplier != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (price: ");
		if (priceESet) result.append(price); else result.append("<unset>");
		result.append(", quantityTo: ");
		if (quantityToESet) result.append(quantityTo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PriceTypeImpl
