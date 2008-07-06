/**
 * <copyright>
 * </copyright>
 *
 * $Id: Book.java,v 1.1 2008/07/06 16:25:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys;

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
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getWritersByName <em>Writers By Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getCityByWriter <em>City By Writer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getBook()
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getBook_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Writers By Name</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers By Name</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers By Name</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getBook_WritersByName()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.StringToWriterMapEntry<org.eclipse.emf.ecore.xml.type.String, org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer>"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@HbMapKey(columns=@Column(name=\"THENAMEOFTHEWRITER\"))\n\t\t\t\t\t\t@JoinColumn(name=\"JOIN_COLUMN_WRITER\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='writersByName'"
	 * @generated
	 */
	EMap<String, Writer> getWritersByName();

	/**
	 * Returns the value of the '<em><b>City By Writer</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer},
	 * and the value is of type {@link org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City By Writer</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City By Writer</em>' map.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.HbmapkeysPackage#getBook_CityByWriter()
	 * @model mapType="org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.WriterToCityMapEntry<org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.Writer, org.eclipse.emf.teneo.samples.emf.annotations.hbmapkeys.City>"
	 *        annotation="teneo.jpa appinfo='\n\t\t\t\t\t\t@MapKeyManyToMany(targetEntity=\"Writer\", joinColumns=@JoinColumn(name=\"THE_CITYWRITER_ID\"))\n\t\t\t\t\t\t@JoinColumn(name=\"JOIN_COLUMN_CITY\")\n\t\t\t\t\t'"
	 *        extendedMetaData="kind='element' name='cityByWriter'"
	 * @generated
	 */
	EMap<Writer, City> getCityByWriter();

} // Book
