/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProductType.java,v 1.2 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getAnyOne <em>Any One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getAnyList <em>Any List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType()
 * @model extendedMetaData="name='ProductType' kind='elementOnly'"
 * @generated
 */
public interface ProductType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The default value is <code>"c1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #setCode(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_Code()
	 * @model default="c1" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #isSetCode()
	 * @see #unsetCode()
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	void unsetCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCode <em>Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code</em>' attribute is set.
	 * @see #unsetCode()
	 * @see #getCode()
	 * @see #setCode(String)
	 * @generated
	 */
	boolean isSetCode();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(SupplierType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_Supplier()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='Supplier'"
	 * @generated
	 */
	SupplierType getSupplier();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(SupplierType value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #setPrice(double)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_Price()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='Price'"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #isSetPrice()
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	void unsetPrice();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getPrice <em>Price</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Price</em>' attribute is set.
	 * @see #unsetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	boolean isSetPrice();

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Object)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_CreatedOn()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='CreatedOn'"
	 * @generated
	 */
	Object getCreatedOn();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Object value);

	/**
	 * Returns the value of the '<em><b>Any One</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any One</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any One</em>' reference.
	 * @see #setAnyOne(EObject)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_AnyOne()
	 * @model
	 * @generated
	 */
	EObject getAnyOne();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.product.ProductType#getAnyOne <em>Any One</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any One</em>' reference.
	 * @see #getAnyOne()
	 * @generated
	 */
	void setAnyOne(EObject value);

	/**
	 * Returns the value of the '<em><b>Any List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any List</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.product.ProductPackage#getProductType_AnyList()
	 * @model type="org.eclipse.emf.ecore.EObject" containment="true"
	 * @generated
	 */
	EList getAnyList();

} // ProductType
