/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.1 2007/03/18 19:19:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mapkey;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Book#getWriters <em>Writers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage#getBook()
 * @model extendedMetaData="name='Book' kind='elementOnly'"
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage#getBook_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Writer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.mapkey.MapkeyPackage#getBook_Writers()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.annotations.mapkey.StringToWriterMapEntry" keyType="java.lang.String" valueType="org.eclipse.emf.teneo.samples.emf.annotations.mapkey.Writer"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@MapKey(name=\"name\")\n\t\t\t\t\t\t@Where(clause=\"name=\'martin\'\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='writers'"
	 * @generated
	 */
	EMap<String, Writer> getWriters();

} // Book
