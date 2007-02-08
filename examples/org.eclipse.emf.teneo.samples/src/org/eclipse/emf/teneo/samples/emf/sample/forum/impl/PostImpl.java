/**
 * <copyright>
 * </copyright>
 *
 * $Id: PostImpl.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Member;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Post;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.PostImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.PostImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.PostImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostImpl extends EObjectImpl implements Post {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Member author = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForumPackage.Literals.POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.POST__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Member newAuthor, NotificationChain msgs) {
		Member oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ForumPackage.POST__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Member newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, ForumPackage.MEMBER__POSTS, Member.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, ForumPackage.MEMBER__POSTS, Member.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.POST__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopic(Topic newTopic, NotificationChain msgs) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ForumPackage.POST__TOPIC, oldTopic, newTopic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		if (newTopic != topic) {
			NotificationChain msgs = null;
			if (topic != null)
				msgs = ((InternalEObject)topic).eInverseRemove(this, ForumPackage.TOPIC__POSTS, Topic.class, msgs);
			if (newTopic != null)
				msgs = ((InternalEObject)newTopic).eInverseAdd(this, ForumPackage.TOPIC__POSTS, Topic.class, msgs);
			msgs = basicSetTopic(newTopic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.POST__TOPIC, newTopic, newTopic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForumPackage.POST__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, ForumPackage.MEMBER__POSTS, Member.class, msgs);
				return basicSetAuthor((Member)otherEnd, msgs);
			case ForumPackage.POST__TOPIC:
				if (topic != null)
					msgs = ((InternalEObject)topic).eInverseRemove(this, ForumPackage.TOPIC__POSTS, Topic.class, msgs);
				return basicSetTopic((Topic)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForumPackage.POST__AUTHOR:
				return basicSetAuthor(null, msgs);
			case ForumPackage.POST__TOPIC:
				return basicSetTopic(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ForumPackage.POST__COMMENT:
				return getComment();
			case ForumPackage.POST__AUTHOR:
				return getAuthor();
			case ForumPackage.POST__TOPIC:
				return getTopic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ForumPackage.POST__COMMENT:
				setComment((String)newValue);
				return;
			case ForumPackage.POST__AUTHOR:
				setAuthor((Member)newValue);
				return;
			case ForumPackage.POST__TOPIC:
				setTopic((Topic)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ForumPackage.POST__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ForumPackage.POST__AUTHOR:
				setAuthor((Member)null);
				return;
			case ForumPackage.POST__TOPIC:
				setTopic((Topic)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ForumPackage.POST__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ForumPackage.POST__AUTHOR:
				return author != null;
			case ForumPackage.POST__TOPIC:
				return topic != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //PostImpl
