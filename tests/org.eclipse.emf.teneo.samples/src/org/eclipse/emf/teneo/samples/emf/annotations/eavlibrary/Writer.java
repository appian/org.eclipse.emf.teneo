/**
 * <copyright>
 * </copyright>
 *
 * $Id: Writer.java,v 1.3 2009/09/12 04:47:31 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getBooks <em>Books</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getCity <em>City</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getPens <em>Pens</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter()
 * @model annotation="teneo.jpa appinfo='@EAVMapping'"
 *        extendedMetaData="name='Writer' kind='elementOnly'"
 * @generated
 */
public interface Writer extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_Books()
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Book#getAuthor
	 * @model opposite="author"
	 *        extendedMetaData="kind='element' name='books'"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_City()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='city'"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Pens</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Pen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pens</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_Pens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pen> getPens();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(byte[])
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_Image()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(byte[] value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.EavlibraryPackage#getWriter_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        annotation="teneo.jpa appinfo='@Lob'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.annotations.eavlibrary.Writer#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

} // Writer
