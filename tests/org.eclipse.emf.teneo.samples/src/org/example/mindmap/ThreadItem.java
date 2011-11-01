/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThreadItem.java,v 1.1 2006/11/23 06:12:13 mtaal Exp $
 */
package org.example.mindmap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mindmap.ThreadItem#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.example.mindmap.ThreadItem#getBody <em>Body</em>}</li>
 *   <li>{@link org.example.mindmap.ThreadItem#getItemPostDate <em>Item Post Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mindmap.MindmapPackage#getThreadItem()
 * @model extendedMetaData="name='ThreadItem' kind='empty'"
 * @generated
 */
public interface ThreadItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Resource)
	 * @see org.example.mindmap.MindmapPackage#getThreadItem_Author()
	 * @model extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	Resource getAuthor();

	/**
	 * Sets the value of the '{@link org.example.mindmap.ThreadItem#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Resource value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.example.mindmap.MindmapPackage#getThreadItem_Body()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='body'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.example.mindmap.ThreadItem#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Item Post Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Post Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Post Date</em>' attribute.
	 * @see #setItemPostDate(Object)
	 * @see org.example.mindmap.MindmapPackage#getThreadItem_ItemPostDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='itemPostDate'"
	 * @generated
	 */
	Object getItemPostDate();

	/**
	 * Sets the value of the '{@link org.example.mindmap.ThreadItem#getItemPostDate <em>Item Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Post Date</em>' attribute.
	 * @see #getItemPostDate()
	 * @generated
	 */
	void setItemPostDate(Object value);

} // ThreadItem