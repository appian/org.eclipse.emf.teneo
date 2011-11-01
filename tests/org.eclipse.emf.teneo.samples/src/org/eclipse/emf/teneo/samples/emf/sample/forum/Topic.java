/**
 * <copyright>
 * </copyright>
 *
 * $Id: Topic.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getPosts <em>Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopic()
 * @model extendedMetaData="name='Topic' kind='elementOnly'"
 * @generated
 */
public interface Topic extends EObject {
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
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopic_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"Announcement"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #setCategory(TopicCategory)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopic_Category()
	 * @model default="Announcement" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='category'"
	 * @generated
	 */
	TopicCategory getCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory
	 * @see #isSetCategory()
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(TopicCategory value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategory()
	 * @see #getCategory()
	 * @see #setCategory(TopicCategory)
	 * @generated
	 */
	void unsetCategory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCategory <em>Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Category</em>' attribute is set.
	 * @see #unsetCategory()
	 * @see #getCategory()
	 * @see #setCategory(TopicCategory)
	 * @generated
	 */
	boolean isSetCategory();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(Member)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopic_Creator()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getCreated
	 * @model opposite="created" resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='creator'"
	 * @generated
	 */
	Member getCreator();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Member value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getTopic_Posts()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getTopic
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.forum.Post" opposite="topic" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='posts'"
	 * @generated
	 */
	EList<Post> getPosts();

} // Topic
