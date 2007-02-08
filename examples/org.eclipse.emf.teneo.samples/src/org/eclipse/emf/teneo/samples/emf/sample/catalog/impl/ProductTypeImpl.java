/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductTypeImpl.java,v 1.3 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.ProductTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.ProductTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.ProductTypeImpl#getRemark <em>Remark</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.ProductTypeImpl#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductTypeImpl extends EObjectImpl implements ProductType {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet = false;

	/**
	 * The cached value of the '{@link #getRemark() <em>Remark</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemark()
	 * @generated
	 * @ordered
	 */
	protected EList<StringType> remark = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected PriceType price = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PRODUCT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRODUCT_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRODUCT_TYPE__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.PRODUCT_TYPE__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringType> getRemark() {
		if (remark == null) {
			remark = new EObjectContainmentEList<StringType>(StringType.class, this, CatalogPackage.PRODUCT_TYPE__REMARK);
		}
		return remark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceType getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrice(PriceType newPrice, NotificationChain msgs) {
		PriceType oldPrice = price;
		price = newPrice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CatalogPackage.PRODUCT_TYPE__PRICE, oldPrice, newPrice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(PriceType newPrice) {
		if (newPrice != price) {
			NotificationChain msgs = null;
			if (price != null)
				msgs = ((InternalEObject)price).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CatalogPackage.PRODUCT_TYPE__PRICE, null, msgs);
			if (newPrice != null)
				msgs = ((InternalEObject)newPrice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CatalogPackage.PRODUCT_TYPE__PRICE, null, msgs);
			msgs = basicSetPrice(newPrice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PRODUCT_TYPE__PRICE, newPrice, newPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.PRODUCT_TYPE__REMARK:
				return ((InternalEList<?>)getRemark()).basicRemove(otherEnd, msgs);
			case CatalogPackage.PRODUCT_TYPE__PRICE:
				return basicSetPrice(null, msgs);
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
			case CatalogPackage.PRODUCT_TYPE__CODE:
				return getCode();
			case CatalogPackage.PRODUCT_TYPE__DESCRIPTION:
				return getDescription();
			case CatalogPackage.PRODUCT_TYPE__REMARK:
				return getRemark();
			case CatalogPackage.PRODUCT_TYPE__PRICE:
				return getPrice();
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
			case CatalogPackage.PRODUCT_TYPE__CODE:
				setCode((String)newValue);
				return;
			case CatalogPackage.PRODUCT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CatalogPackage.PRODUCT_TYPE__REMARK:
				getRemark().clear();
				getRemark().addAll((Collection<? extends StringType>)newValue);
				return;
			case CatalogPackage.PRODUCT_TYPE__PRICE:
				setPrice((PriceType)newValue);
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
			case CatalogPackage.PRODUCT_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CatalogPackage.PRODUCT_TYPE__DESCRIPTION:
				unsetDescription();
				return;
			case CatalogPackage.PRODUCT_TYPE__REMARK:
				getRemark().clear();
				return;
			case CatalogPackage.PRODUCT_TYPE__PRICE:
				setPrice((PriceType)null);
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
			case CatalogPackage.PRODUCT_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CatalogPackage.PRODUCT_TYPE__DESCRIPTION:
				return isSetDescription();
			case CatalogPackage.PRODUCT_TYPE__REMARK:
				return remark != null && !remark.isEmpty();
			case CatalogPackage.PRODUCT_TYPE__PRICE:
				return price != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
