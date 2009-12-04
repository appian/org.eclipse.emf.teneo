/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductCategory.java,v 1.1 2009/12/04 15:06:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nocollectionowner;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getProducts <em>Products</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getSubCategorys <em>Sub Categorys</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProductCategory()
 * @model
 * @generated
 */
public interface ProductCategory extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProductCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProductCategory_Products()
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.Product#getProductCategory
	 * @model opposite="productCategory" containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Sub Categorys</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categorys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categorys</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProductCategory_SubCategorys()
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ProductCategory> getSubCategorys();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getSubCategorys <em>Sub Categorys</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ProductCategory)
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.NoCollectionOwnerPackage#getProductCategory_Parent()
	 * @see org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getSubCategorys
	 * @model opposite="subCategorys" transient="false"
	 * @generated
	 */
	ProductCategory getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.issues.nocollectionowner.ProductCategory#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ProductCategory value);

} // ProductCategory
