/**
 * <copyright>
 * </copyright>
 *
 * $Id: Note.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Note#getDate <em>Date</em>}</li>
 *   <li>{@link lobj.Note#getNoteAuthor <em>Note Author</em>}</li>
 *   <li>{@link lobj.Note#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getNote()
 * @model extendedMetaData="name='note' kind='elementOnly'"
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see lobj.LobjPackage#getNote_Date()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link lobj.Note#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Note Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Author</em>' attribute.
	 * @see #setNoteAuthor(String)
	 * @see lobj.LobjPackage#getNote_NoteAuthor()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='noteAuthor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNoteAuthor();

	/**
	 * Sets the value of the '{@link lobj.Note#getNoteAuthor <em>Note Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Author</em>' attribute.
	 * @see #getNoteAuthor()
	 * @generated
	 */
	void setNoteAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see lobj.LobjPackage#getNote_Content()
	 * @model unique="false"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link lobj.Note#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Note