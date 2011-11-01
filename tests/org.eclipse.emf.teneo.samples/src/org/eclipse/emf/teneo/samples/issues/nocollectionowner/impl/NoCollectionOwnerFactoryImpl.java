/**
 * <copyright>
 * </copyright>
 *
 * $Id: NoCollectionOwnerFactoryImpl.java,v 1.1 2009/12/04 15:06:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.teneo.samples.issues.nocollectionowner.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NoCollectionOwnerFactoryImpl extends EFactoryImpl implements NoCollectionOwnerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoCollectionOwnerFactory init() {
		try {
			NoCollectionOwnerFactory theNoCollectionOwnerFactory = (NoCollectionOwnerFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/teneo/samples/issues/nocollectionowner"); 
			if (theNoCollectionOwnerFactory != null) {
				return theNoCollectionOwnerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NoCollectionOwnerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoCollectionOwnerFactoryImpl() {
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
			case NoCollectionOwnerPackage.PRODUCT: return createProduct();
			case NoCollectionOwnerPackage.CUSTOMER: return createCustomer();
			case NoCollectionOwnerPackage.PRODUCT_CATEGORY: return createProductCategory();
			case NoCollectionOwnerPackage.PRICE_CATEGORY: return createPriceCategory();
			case NoCollectionOwnerPackage.ORDER: return createOrder();
			case NoCollectionOwnerPackage.TRANSACTION: return createTransaction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory createProductCategory() {
		ProductCategoryImpl productCategory = new ProductCategoryImpl();
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCategory createPriceCategory() {
		PriceCategoryImpl priceCategory = new PriceCategoryImpl();
		return priceCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoCollectionOwnerPackage getNoCollectionOwnerPackage() {
		return (NoCollectionOwnerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NoCollectionOwnerPackage getPackage() {
		return NoCollectionOwnerPackage.eINSTANCE;
	}

} //NoCollectionOwnerFactoryImpl
