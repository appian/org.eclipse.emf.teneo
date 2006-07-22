/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogFactoryImpl.java,v 1.2 2006/07/22 13:01:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogFactory;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.ProductType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.StringType;
import org.eclipse.emf.teneo.samples.emf.sample.catalog.SupplierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogFactoryImpl extends EFactoryImpl implements CatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogFactory init() {
		try {
			CatalogFactory theCatalogFactory = (CatalogFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/emf/sample/catalog"); 
			if (theCatalogFactory != null) {
				return theCatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CatalogPackage.CATALOG_TYPE: return createCatalogType();
			case CatalogPackage.PRICE_TYPE: return createPriceType();
			case CatalogPackage.PRODUCT_TYPE: return createProductType();
			case CatalogPackage.STRING_TYPE: return createStringType();
			case CatalogPackage.SUPPLIER_TYPE: return createSupplierType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType createCatalogType() {
		CatalogTypeImpl catalogType = new CatalogTypeImpl();
		return catalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceType createPriceType() {
		PriceTypeImpl priceType = new PriceTypeImpl();
		return priceType;
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
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
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
	public CatalogPackage getCatalogPackage() {
		return (CatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static CatalogPackage getPackage() {
		return CatalogPackage.eINSTANCE;
	}

} //CatalogFactoryImpl
