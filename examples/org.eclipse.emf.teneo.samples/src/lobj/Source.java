/**
 * <copyright>
 * </copyright>
 *
 * $Id: Source.java,v 1.1 2006/11/23 06:12:07 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Source#getAuthor <em>Author</em>}</li>
 *   <li>{@link lobj.Source#getTitle <em>Title</em>}</li>
 *   <li>{@link lobj.Source#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link lobj.Source#getPublishedIn <em>Published In</em>}</li>
 *   <li>{@link lobj.Source#getPublishedBy <em>Published By</em>}</li>
 *   <li>{@link lobj.Source#getDate <em>Date</em>}</li>
 *   <li>{@link lobj.Source#getPp <em>Pp</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getSource()
 * @model annotation="http://annotation.elver.org/Table name='blocksource'"
 *        extendedMetaData="name='source' kind='elementOnly'"
 * @generated
 */
public interface Source extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Author)
	 * @see lobj.LobjPackage#getSource_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Author getAuthor();

	/**
	 * Sets the value of the '{@link lobj.Source#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Author value);

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
	 * @see lobj.LobjPackage#getSource_Title()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link lobj.Source#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see lobj.LobjPackage#getSource_Subtitle()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='subtitle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link lobj.Source#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Published In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published In</em>' attribute.
	 * @see #setPublishedIn(String)
	 * @see lobj.LobjPackage#getSource_PublishedIn()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='publishedIn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublishedIn();

	/**
	 * Sets the value of the '{@link lobj.Source#getPublishedIn <em>Published In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published In</em>' attribute.
	 * @see #getPublishedIn()
	 * @generated
	 */
	void setPublishedIn(String value);

	/**
	 * Returns the value of the '<em><b>Published By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published By</em>' attribute.
	 * @see #setPublishedBy(String)
	 * @see lobj.LobjPackage#getSource_PublishedBy()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='publishedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublishedBy();

	/**
	 * Sets the value of the '{@link lobj.Source#getPublishedBy <em>Published By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published By</em>' attribute.
	 * @see #getPublishedBy()
	 * @generated
	 */
	void setPublishedBy(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Object)
	 * @see lobj.LobjPackage#getSource_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getDate();

	/**
	 * Sets the value of the '{@link lobj.Source#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Object value);

	/**
	 * Returns the value of the '<em><b>Pp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp</em>' attribute.
	 * @see #setPp(String)
	 * @see lobj.LobjPackage#getSource_Pp()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='pp' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPp();

	/**
	 * Sets the value of the '{@link lobj.Source#getPp <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp</em>' attribute.
	 * @see #getPp()
	 * @generated
	 */
	void setPp(String value);

} // Source