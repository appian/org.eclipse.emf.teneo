/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductImpl.java,v 1.1 2009/12/04 15:06:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product;
import org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl#getPriceCategory <em>Price Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends EObjectImpl implements Product {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getPriceCategory() <em>Price Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceCategory()
	 * @generated
	 * @ordered
	 */
	protected PriceCategory priceCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoCollectionOwnerPackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.PRODUCT__NUMBER, oldNumber, number));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory getProductCategory() {
		if (eContainerFeatureID() != NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY) return null;
		return (ProductCategory)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCategory(ProductCategory newProductCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProductCategory, NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductCategory(ProductCategory newProductCategory) {
		if (newProductCategory != eInternalContainer() || (eContainerFeatureID() != NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY && newProductCategory != null)) {
			if (EcoreUtil.isAncestor(this, newProductCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProductCategory != null)
				msgs = ((InternalEObject)newProductCategory).eInverseAdd(this, NoCollectionOwnerPackage.PRODUCT_CATEGORY__PRODUCTS, ProductCategory.class, msgs);
			msgs = basicSetProductCategory(newProductCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY, newProductCategory, newProductCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCategory getPriceCategory() {
		if (priceCategory != null && priceCategory.eIsProxy()) {
			InternalEObject oldPriceCategory = (InternalEObject)priceCategory;
			priceCategory = (PriceCategory)eResolveProxy(oldPriceCategory);
			if (priceCategory != oldPriceCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY, oldPriceCategory, priceCategory));
			}
		}
		return priceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCategory basicGetPriceCategory() {
		return priceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceCategory(PriceCategory newPriceCategory) {
		PriceCategory oldPriceCategory = priceCategory;
		priceCategory = newPriceCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY, oldPriceCategory, priceCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProductCategory((ProductCategory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				return basicSetProductCategory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				return eInternalContainer().eInverseRemove(this, NoCollectionOwnerPackage.PRODUCT_CATEGORY__PRODUCTS, ProductCategory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NoCollectionOwnerPackage.PRODUCT__NAME:
				return getName();
			case NoCollectionOwnerPackage.PRODUCT__NUMBER:
				return getNumber();
			case NoCollectionOwnerPackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				return getProductCategory();
			case NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY:
				if (resolve) return getPriceCategory();
				return basicGetPriceCategory();
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
			case NoCollectionOwnerPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case NoCollectionOwnerPackage.PRODUCT__NUMBER:
				setNumber((Integer)newValue);
				return;
			case NoCollectionOwnerPackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((ProductCategory)newValue);
				return;
			case NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY:
				setPriceCategory((PriceCategory)newValue);
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
			case NoCollectionOwnerPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.PRODUCT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((ProductCategory)null);
				return;
			case NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY:
				setPriceCategory((PriceCategory)null);
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
			case NoCollectionOwnerPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NoCollectionOwnerPackage.PRODUCT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case NoCollectionOwnerPackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NoCollectionOwnerPackage.PRODUCT__PRODUCT_CATEGORY:
				return getProductCategory() != null;
			case NoCollectionOwnerPackage.PRODUCT__PRICE_CATEGORY:
				return priceCategory != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
