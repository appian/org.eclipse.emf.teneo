/**
 * <copyright>
 * </copyright>
 *
 * $Id: Post.java,v 1.1 2006/07/11 16:57:15 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getPost()
 * @model extendedMetaData="name='Post' kind='elementOnly'"
 * @generated
 */
public interface Post extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getPost_Comment()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Member)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getPost_Author()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getPosts
	 * @model opposite="posts" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='author'"
	 * @generated
	 */
	Member getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Member value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getPost_Topic()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getPosts
	 * @model opposite="posts" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='topic'"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // Post
