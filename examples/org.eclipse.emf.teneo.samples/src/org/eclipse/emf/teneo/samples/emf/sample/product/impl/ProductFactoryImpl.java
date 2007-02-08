/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductFactoryImpl.java,v 1.4 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.product.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.sample.product.*;

import org.eclipse.emf.teneo.samples.emf.sample.product.ProductFactory;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage;
import org.eclipse.emf.teneo.samples.emf.sample.product.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.product.SupplierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.  
 * <!-- end-user-doc --> 
 * @generated
 */
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/sample/product"); 
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductPackage.PRODUCT_TYPE: return createProductType();
			case ProductPackage.SUPPLIER_TYPE: return createSupplierType();
			case ProductPackage.CLASSIFICATION_TYPE: return createClassificationType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierType createSupplierType() {
		SupplierTypeImpl supplierType = new SupplierTypeImpl();
		return supplierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationType createClassificationType() {
		ClassificationTypeImpl classificationType = new ClassificationTypeImpl();
		return classificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
