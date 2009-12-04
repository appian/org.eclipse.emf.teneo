/**
 * <copyright>
 * </copyright>
 *
 * $Id: Product.java,v 1.1 2009/12/04 15:06:56 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getPriceCategory <em>Price Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(Integer)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct_Number()
	 * @model
	 * @generated
	 */
	Integer getNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' container reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct_ProductCategory()
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getProducts
	 * @model opposite="products" transient="false"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory <em>Product Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' container reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Price Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Category</em>' reference.
	 * @see #setPriceCategory(PriceCategory)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProduct_PriceCategory()
	 * @model
	 * @generated
	 */
	PriceCategory getPriceCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getPriceCategory <em>Price Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Category</em>' reference.
	 * @see #getPriceCategory()
	 * @generated
	 */
	void setPriceCategory(PriceCategory value);

} // Product
