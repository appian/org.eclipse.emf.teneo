/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.2 2006/08/22 22:24:48 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.column;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#getBook()
 * @model annotation="http://ejb.elver.org/Table name='mybooktable'"
 *        extendedMetaData="name='Book' kind='elementOnly'"
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#getBook_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        annotation="http://ejb.elver.org/Column name='titel' unique='true' length='25'"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #isSetPages()
	 * @see #unsetPages()
	 * @see #setPages(int)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#getBook_Pages()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        annotation="http://ejb.elver.org/Column updatable='false' insertable='false'"
	 *        extendedMetaData="kind='element' name='pages'"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #isSetPages()
	 * @see #unsetPages()
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPages()
	 * @see #getPages()
	 * @see #setPages(int)
	 * @generated
	 */
	void unsetPages();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getPages <em>Pages</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pages</em>' attribute is set.
	 * @see #unsetPages()
	 * @see #getPages()
	 * @see #setPages(int)
	 * @generated
	 */
	boolean isSetPages();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(BigDecimal)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#getBook_Weight()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        annotation="http://ejb.elver.org/Column name='gewicht' nullable='true' precision='5' scale='2'"
	 *        extendedMetaData="kind='element' name='weight'"
	 * @generated
	 */
	BigDecimal getWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.column.ColumnPackage#getBook_Author()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.column.Book#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

} // Book
