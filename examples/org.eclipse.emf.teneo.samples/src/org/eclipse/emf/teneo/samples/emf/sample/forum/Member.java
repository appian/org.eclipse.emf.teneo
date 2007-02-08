/**
 * <copyright>
 * </copyright>
 *
 * $Id: Member.java,v 1.2 2007/02/08 23:09:25 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getPosts <em>Posts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getMember()
 * @model extendedMetaData="name='Member' kind='elementOnly'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getMember_Nickname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='nickname'"
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Member#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getMember_Posts()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Post#getAuthor
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.forum.Post" opposite="author" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='posts'"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage#getMember_Created()
	 * @see org.eclipse.emf.teneo.samples.emf.sample.forum.Topic#getCreator
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.forum.Topic" opposite="creator" resolveProxies="false"
	 *        extendedMetaData="kind='element' name='created'"
	 * @generated
	 */
	EList<Topic> getCreated();

} // Member
