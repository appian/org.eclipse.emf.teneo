/**
 * <copyright>
 * </copyright>
 *
 * $Id: Item.java,v 1.3 2007/07/11 14:40:34 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getUSPrice <em>US Price</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getShipDate <em>Ship Date</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getPartNum <em>Part Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem()
 * @model extendedMetaData="name='Item' kind='elementOnly'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_ProductName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='productName'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_Quantity()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.QuantityType" required="true"
	 *        extendedMetaData="kind='element' name='quantity'"
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>US Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>US Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>US Price</em>' attribute.
	 * @see #setUSPrice(BigDecimal)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_USPrice()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='USPrice'"
	 * @generated
	 */
	BigDecimal getUSPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getUSPrice <em>US Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>US Price</em>' attribute.
	 * @see #getUSPrice()
	 * @generated
	 */
	void setUSPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Date</em>' attribute.
	 * @see #setShipDate(XMLGregorianCalendar)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_ShipDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='shipDate'"
	 * @generated
	 */
	XMLGregorianCalendar getShipDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getShipDate <em>Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Date</em>' attribute.
	 * @see #getShipDate()
	 * @generated
	 */
	void setShipDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Part Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Num</em>' attribute.
	 * @see #setPartNum(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SchemaprimerpoPackage#getItem_PartNum()
	 * @model unique="false" dataType="org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.SKU" required="true"
	 *        extendedMetaData="kind='attribute' name='partNum'"
	 * @generated
	 */
	String getPartNum();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.schemaprimerpo.Item#getPartNum <em>Part Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Num</em>' attribute.
	 * @see #getPartNum()
	 * @generated
	 */
	void setPartNum(String value);

} // Item
