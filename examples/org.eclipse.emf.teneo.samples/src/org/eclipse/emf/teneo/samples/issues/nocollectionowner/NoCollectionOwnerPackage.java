/**
 * <copyright>
 * </copyright>
 *
 * $Id: NoCollectionOwnerPackage.java,v 1.1 2009/12/04 15:06:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerFactory
 * @model kind="package"
 * @generated
 */
public interface NoCollectionOwnerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nocollectionowner";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/issues/nocollectionowner";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nocollectionowner";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NoCollectionOwnerPackage eINSTANCE = org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Price Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE_CATEGORY = 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.CustomerImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SURNAME = 0;

	/**
	 * The feature id for the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FAMILY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Telephone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TELEPHONE_NR = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__HOTEL = 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__COMMENTS = 5;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductCategoryImpl <em>Product Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductCategoryImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getProductCategory()
	 * @generated
	 */
	int PRODUCT_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Sub Categorys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__SUB_CATEGORYS = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.PriceCategoryImpl <em>Price Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.PriceCategoryImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getPriceCategory()
	 * @generated
	 */
	int PRICE_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CATEGORY__PRICES = 1;

	/**
	 * The number of structural features of the '<em>Price Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.OrderImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TRANSACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__COMMENTS = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__END_DATE = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PRICE = 5;

	/**
	 * The feature id for the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PAID_DATE = 6;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getNumber()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product Category</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductCategory();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getPriceCategory <em>Price Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price Category</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getPriceCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_PriceCategory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getSurname()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Surname();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getFamilyName <em>Family Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getFamilyName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FamilyName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getTelephoneNr <em>Telephone Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone Nr</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getTelephoneNr()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_TelephoneNr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hotel</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getHotel()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Hotel();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Customer#getComments()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Comments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory
	 * @generated
	 */
	EClass getProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getName()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getProducts()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getSubCategorys <em>Sub Categorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categorys</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getSubCategorys()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_SubCategorys();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory <em>Price Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price Category</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory
	 * @generated
	 */
	EClass getPriceCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory#getName()
	 * @see #getPriceCategory()
	 * @generated
	 */
	EAttribute getPriceCategory_Name();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prices</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.PriceCategory#getPrices()
	 * @see #getPriceCategory()
	 * @generated
	 */
	EAttribute getPriceCategory_Prices();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getNumber()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getTransactions()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Transactions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getCustomer()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Customer();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Order#getComments()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Comments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getNumber()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Number();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Order</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getOrder()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Order();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getProduct()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getStartDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getEndDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getPrice()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getPaidDate <em>Paid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Date</em>'.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Transaction#getPaidDate()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_PaidDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NoCollectionOwnerFactory getNoCollectionOwnerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NUMBER = eINSTANCE.getProduct_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_CATEGORY = eINSTANCE.getProduct_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Price Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRICE_CATEGORY = eINSTANCE.getProduct_PriceCategory();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.CustomerImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SURNAME = eINSTANCE.getCustomer_Surname();

		/**
		 * The meta object literal for the '<em><b>Family Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FAMILY_NAME = eINSTANCE.getCustomer_FamilyName();

		/**
		 * The meta object literal for the '<em><b>Telephone Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__TELEPHONE_NR = eINSTANCE.getCustomer_TelephoneNr();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__HOTEL = eINSTANCE.getCustomer_Hotel();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__COMMENTS = eINSTANCE.getCustomer_Comments();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductCategoryImpl <em>Product Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.ProductCategoryImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getProductCategory()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY = eINSTANCE.getProductCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__NAME = eINSTANCE.getProductCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCTS = eINSTANCE.getProductCategory_Products();

		/**
		 * The meta object literal for the '<em><b>Sub Categorys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__SUB_CATEGORYS = eINSTANCE.getProductCategory_SubCategorys();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PARENT = eINSTANCE.getProductCategory_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.PriceCategoryImpl <em>Price Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.PriceCategoryImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getPriceCategory()
		 * @generated
		 */
		EClass PRICE_CATEGORY = eINSTANCE.getPriceCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_CATEGORY__NAME = eINSTANCE.getPriceCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICE_CATEGORY__PRICES = eINSTANCE.getPriceCategory_Prices();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.OrderImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NUMBER = eINSTANCE.getOrder_Number();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__TRANSACTIONS = eINSTANCE.getOrder_Transactions();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__CUSTOMER = eINSTANCE.getOrder_Customer();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__COMMENTS = eINSTANCE.getOrder_Comments();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.TransactionImpl
		 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.impl.NoCollectionOwnerPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__NUMBER = eINSTANCE.getTransaction_Number();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__ORDER = eINSTANCE.getTransaction_Order();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PRODUCT = eINSTANCE.getTransaction_Product();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__START_DATE = eINSTANCE.getTransaction_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__END_DATE = eINSTANCE.getTransaction_EndDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PRICE = eINSTANCE.getTransaction_Price();

		/**
		 * The meta object literal for the '<em><b>Paid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PAID_DATE = eINSTANCE.getTransaction_PaidDate();

	}

} //NoCollectionOwnerPackage
