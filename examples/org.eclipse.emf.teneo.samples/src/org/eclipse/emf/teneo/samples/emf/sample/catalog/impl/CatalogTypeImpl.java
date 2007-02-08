/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogTypeImpl.java,v 1.3 2007/02/08 23:09:19 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.CatalogTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.CatalogTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.CatalogTypeImpl#getSubCatalog <em>Sub Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.impl.CatalogTypeImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogTypeImpl extends EObjectImpl implements CatalogType {
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
	 * The cached value of the '{@link #getSubCatalog() <em>Sub Catalog</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCatalog()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogType> subCatalog = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductType> product = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATALOG_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatalogType> getSubCatalog() {
		if (subCatalog == null) {
			subCatalog = new EObjectEList<CatalogType>(CatalogType.class, this, CatalogPackage.CATALOG_TYPE__SUB_CATALOG);
		}
		return subCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductType> getProduct() {
		if (product == null) {
			product = new EObjectEList<ProductType>(ProductType.class, this, CatalogPackage.CATALOG_TYPE__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.CATALOG_TYPE__NAME:
				return getName();
			case CatalogPackage.CATALOG_TYPE__DESCRIPTION:
				return getDescription();
			case CatalogPackage.CATALOG_TYPE__SUB_CATALOG:
				return getSubCatalog();
			case CatalogPackage.CATALOG_TYPE__PRODUCT:
				return getProduct();
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
			case CatalogPackage.CATALOG_TYPE__NAME:
				setName((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__SUB_CATALOG:
				getSubCatalog().clear();
				getSubCatalog().addAll((Collection<? extends CatalogType>)newValue);
				return;
			case CatalogPackage.CATALOG_TYPE__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ProductType>)newValue);
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
			case CatalogPackage.CATALOG_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CatalogPackage.CATALOG_TYPE__SUB_CATALOG:
				getSubCatalog().clear();
				return;
			case CatalogPackage.CATALOG_TYPE__PRODUCT:
				getProduct().clear();
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
			case CatalogPackage.CATALOG_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CatalogPackage.CATALOG_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CatalogPackage.CATALOG_TYPE__SUB_CATALOG:
				return subCatalog != null && !subCatalog.isEmpty();
			case CatalogPackage.CATALOG_TYPE__PRODUCT:
				return product != null && !product.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CatalogTypeImpl
