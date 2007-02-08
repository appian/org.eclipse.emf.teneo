/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.3 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap;

import org.eclipse.emf.common.util.EMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book#getWriters <em>Writers</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book#getKeyWords <em>Key Words</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book#getCityByWriter <em>City By Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage#getBook()
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
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage#getBook_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Book#getTitle <em>Title</em>}' attribute.
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
	 * and the value is of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage#getBook_Writers()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.StringToWriterMapEntry" keyType="java.lang.String" valueType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer"
	 *        extendedMetaData="kind='element' name='writers'"
	 * @generated
	 */
	EMap<String, Writer> getWriters();

	/**
	 * Returns the value of the '<em><b>Key Words</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Words</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Words</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage#getBook_KeyWords()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.StringToStringMapEntry" keyType="java.lang.String" valueType="java.lang.String"
	 *        extendedMetaData="kind='element' name='keyWords'"
	 * @generated
	 */
	EMap<String, String> getKeyWords();

	/**
	 * Returns the value of the '<em><b>City By Writer</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City By Writer</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City By Writer</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.EmapPackage#getBook_CityByWriter()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.WriterToStringMapEntry" keyType="org.eclipse.emf.teneo.samples.emf.schemaconstructs.emap.Writer" valueType="java.lang.String"
	 *        extendedMetaData="kind='element' name='cityByWriter'"
	 * @generated
	 */
	EMap<Writer, String> getCityByWriter();

} // Book