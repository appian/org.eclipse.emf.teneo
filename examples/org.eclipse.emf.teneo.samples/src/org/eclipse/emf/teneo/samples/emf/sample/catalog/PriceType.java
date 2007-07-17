/**
 * <copyright>
 * </copyright>
 *
 * $Id: PriceType.java,v 1.2 2007/07/17 13:58:46 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.catalog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Price Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getPrice <em>Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getQuantityTo <em>Quantity To</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getPriceType()
 * @model extendedMetaData="name='Price_._type' kind='elementOnly'"
 * @generated
 */
public interface PriceType extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getPriceType_Price()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='Price'"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getPrice <em>Price</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrice()
	 * @see #getPrice()
	 * @see #setPrice(double)
	 * @generated
	 */
	void unsetPrice();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getPrice <em>Price</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Quantity To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity To</em>' attribute.
	 * @see #isSetQuantityTo()
	 * @see #unsetQuantityTo()
	 * @see #setQuantityTo(double)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getPriceType_QuantityTo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='QuantityTo'"
	 * @generated
	 */
	double getQuantityTo();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getQuantityTo <em>Quantity To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity To</em>' attribute.
	 * @see #isSetQuantityTo()
	 * @see #unsetQuantityTo()
	 * @see #getQuantityTo()
	 * @generated
	 */
	void setQuantityTo(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getQuantityTo <em>Quantity To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantityTo()
	 * @see #getQuantityTo()
	 * @see #setQuantityTo(double)
	 * @generated
	 */
	void unsetQuantityTo();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getQuantityTo <em>Quantity To</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantity To</em>' attribute is set.
	 * @see #unsetQuantityTo()
	 * @see #getQuantityTo()
	 * @see #setQuantityTo(double)
	 * @generated
	 */
	boolean isSetQuantityTo();

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(SupplierType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.catalog.CatalogPackage#getPriceType_Supplier()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='Supplier'"
	 * @generated
	 */
	SupplierType getSupplier();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.catalog.PriceType#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(SupplierType value);

} // PriceType
