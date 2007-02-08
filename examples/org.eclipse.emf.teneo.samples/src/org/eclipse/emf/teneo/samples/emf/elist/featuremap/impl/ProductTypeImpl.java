/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductTypeImpl.java,v 1.2 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl;

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

import org.eclipse.emf.teneo.samples.emf.elist.featuremap.FeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.PriceByQuantityType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductClassification;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.ProductType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.SupplierPriceType;
import org.eclipse.emf.teneo.samples.emf.elist.featuremap.TranslatedDescriptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getTranslatedDescription <em>Translated Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getPriceByQuantity <em>Price By Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getPriceFromSupplier <em>Price From Supplier</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.elist.featuremap.impl.ProductTypeImpl#getSimplePrice <em>Simple Price</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductTypeImpl extends EObjectImpl implements ProductType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group = null;

	/**
	 * The default value of the '{@link #getProductClassification() <em>Product Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassification()
	 * @generated
	 * @ordered
	 */
	protected static final ProductClassification PRODUCT_CLASSIFICATION_EDEFAULT = ProductClassification.NORMAL_LITERAL;

	/**
	 * The cached value of the '{@link #getProductClassification() <em>Product Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassification()
	 * @generated
	 * @ordered
	 */
	protected ProductClassification productClassification = PRODUCT_CLASSIFICATION_EDEFAULT;

	/**
	 * This is true if the Product Classification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productClassificationESet = false;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1 = null;

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
		return FeaturemapPackage.Literals.PRODUCT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemapPackage.PRODUCT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, FeaturemapPackage.PRODUCT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		return getGroup().list(FeaturemapPackage.Literals.PRODUCT_TYPE__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TranslatedDescriptionType> getTranslatedDescription() {
		return getGroup().list(FeaturemapPackage.Literals.PRODUCT_TYPE__TRANSLATED_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductClassification getProductClassification() {
		return productClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductClassification(ProductClassification newProductClassification) {
		ProductClassification oldProductClassification = productClassification;
		productClassification = newProductClassification == null ? PRODUCT_CLASSIFICATION_EDEFAULT : newProductClassification;
		boolean oldProductClassificationESet = productClassificationESet;
		productClassificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION, oldProductClassification, productClassification, !oldProductClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductClassification() {
		ProductClassification oldProductClassification = productClassification;
		boolean oldProductClassificationESet = productClassificationESet;
		productClassification = PRODUCT_CLASSIFICATION_EDEFAULT;
		productClassificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION, oldProductClassification, PRODUCT_CLASSIFICATION_EDEFAULT, oldProductClassificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductClassification() {
		return productClassificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, FeaturemapPackage.PRODUCT_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PriceByQuantityType> getPriceByQuantity() {
		return getGroup1().list(FeaturemapPackage.Literals.PRODUCT_TYPE__PRICE_BY_QUANTITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupplierPriceType> getPriceFromSupplier() {
		return getGroup1().list(FeaturemapPackage.Literals.PRODUCT_TYPE__PRICE_FROM_SUPPLIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSimplePrice() {
		return getGroup1().list(FeaturemapPackage.Literals.PRODUCT_TYPE__SIMPLE_PRICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemapPackage.PRODUCT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FeaturemapPackage.PRODUCT_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_BY_QUANTITY:
				return ((InternalEList<?>)getPriceByQuantity()).basicRemove(otherEnd, msgs);
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
			case FeaturemapPackage.PRODUCT_TYPE__NAME:
				return getName();
			case FeaturemapPackage.PRODUCT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case FeaturemapPackage.PRODUCT_TYPE__DESCRIPTION:
				return getDescription();
			case FeaturemapPackage.PRODUCT_TYPE__TRANSLATED_DESCRIPTION:
				return getTranslatedDescription();
			case FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION:
				return getProductClassification();
			case FeaturemapPackage.PRODUCT_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_BY_QUANTITY:
				return getPriceByQuantity();
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_FROM_SUPPLIER:
				return getPriceFromSupplier();
			case FeaturemapPackage.PRODUCT_TYPE__SIMPLE_PRICE:
				return getSimplePrice();
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
			case FeaturemapPackage.PRODUCT_TYPE__NAME:
				setName((String)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__TRANSLATED_DESCRIPTION:
				getTranslatedDescription().clear();
				getTranslatedDescription().addAll((Collection<? extends TranslatedDescriptionType>)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION:
				setProductClassification((ProductClassification)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_BY_QUANTITY:
				getPriceByQuantity().clear();
				getPriceByQuantity().addAll((Collection<? extends PriceByQuantityType>)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_FROM_SUPPLIER:
				getPriceFromSupplier().clear();
				getPriceFromSupplier().addAll((Collection<? extends SupplierPriceType>)newValue);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__SIMPLE_PRICE:
				getSimplePrice().clear();
				getSimplePrice().addAll((Collection<? extends Double>)newValue);
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
			case FeaturemapPackage.PRODUCT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturemapPackage.PRODUCT_TYPE__GROUP:
				getGroup().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__TRANSLATED_DESCRIPTION:
				getTranslatedDescription().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION:
				unsetProductClassification();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_BY_QUANTITY:
				getPriceByQuantity().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_FROM_SUPPLIER:
				getPriceFromSupplier().clear();
				return;
			case FeaturemapPackage.PRODUCT_TYPE__SIMPLE_PRICE:
				getSimplePrice().clear();
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
			case FeaturemapPackage.PRODUCT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturemapPackage.PRODUCT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__TRANSLATED_DESCRIPTION:
				return !getTranslatedDescription().isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__PRODUCT_CLASSIFICATION:
				return isSetProductClassification();
			case FeaturemapPackage.PRODUCT_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_BY_QUANTITY:
				return !getPriceByQuantity().isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__PRICE_FROM_SUPPLIER:
				return !getPriceFromSupplier().isEmpty();
			case FeaturemapPackage.PRODUCT_TYPE__SIMPLE_PRICE:
				return !getSimplePrice().isEmpty();
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
		result.append(", group: ");
		result.append(group);
		result.append(", productClassification: ");
		if (productClassificationESet) result.append(productClassification); else result.append("<unset>");
		result.append(", group1: ");
		result.append(group1);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
