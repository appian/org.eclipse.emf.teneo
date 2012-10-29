/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Note</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Note#getDate <em>Date</em>}</li>
 * <li>{@link lobj.Note#getNoteAuthor <em>Note Author</em>}</li>
 * <li>{@link lobj.Note#getContent <em>Content</em>}</li>
 * <li>{@link lobj.Note#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getNote()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see lobj.LobjPackage#getNote_Date()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link lobj.Note#getDate <em>Date</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Note Author</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Author</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Note Author</em>' attribute.
	 * @see #setNoteAuthor(String)
	 * @see lobj.LobjPackage#getNote_NoteAuthor()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getNoteAuthor();

	/**
	 * Sets the value of the '{@link lobj.Note#getNoteAuthor <em>Note Author</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Note Author</em>' attribute.
	 * @see #getNoteAuthor()
	 * @generated
	 */
	void setNoteAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see lobj.LobjPackage#getNote_Content()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link lobj.Note#getContent <em>Content</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getNote_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Note#getId <em>Id</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Note
