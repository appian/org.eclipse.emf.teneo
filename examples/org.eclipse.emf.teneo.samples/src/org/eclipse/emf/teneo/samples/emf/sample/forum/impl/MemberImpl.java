/**
 * <copyright>
 * </copyright>
 *
 * $Id: MemberImpl.java,v 1.1 2006/07/11 16:57:11 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.forum.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.forum.ForumPackage;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Member;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Post;
import org.eclipse.emf.teneo.samples.emf.sample.forum.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.MemberImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.MemberImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.MemberImpl#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberImpl extends EObjectImpl implements Member {
	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected String nickname = NICKNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList posts = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected EList created = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ForumPackage.eINSTANCE.getMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickname(String newNickname) {
		String oldNickname = nickname;
		nickname = newNickname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.MEMBER__NICKNAME, oldNickname, nickname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPosts() {
		if (posts == null) {
			posts = new EObjectWithInverseEList(Post.class, this, ForumPackage.MEMBER__POSTS, ForumPackage.POST__AUTHOR);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCreated() {
		if (created == null) {
			created = new EObjectWithInverseEList(Topic.class, this, ForumPackage.MEMBER__CREATED, ForumPackage.TOPIC__CREATOR);
		}
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ForumPackage.MEMBER__POSTS:
					return ((InternalEList)getPosts()).basicAdd(otherEnd, msgs);
				case ForumPackage.MEMBER__CREATED:
					return ((InternalEList)getCreated()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case ForumPackage.MEMBER__POSTS:
					return ((InternalEList)getPosts()).basicRemove(otherEnd, msgs);
				case ForumPackage.MEMBER__CREATED:
					return ((InternalEList)getCreated()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ForumPackage.MEMBER__NICKNAME:
				return getNickname();
			case ForumPackage.MEMBER__POSTS:
				return getPosts();
			case ForumPackage.MEMBER__CREATED:
				return getCreated();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ForumPackage.MEMBER__NICKNAME:
				setNickname((String)newValue);
				return;
			case ForumPackage.MEMBER__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection)newValue);
				return;
			case ForumPackage.MEMBER__CREATED:
				getCreated().clear();
				getCreated().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ForumPackage.MEMBER__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case ForumPackage.MEMBER__POSTS:
				getPosts().clear();
				return;
			case ForumPackage.MEMBER__CREATED:
				getCreated().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case ForumPackage.MEMBER__NICKNAME:
				return NICKNAME_EDEFAULT == null ? nickname != null : !NICKNAME_EDEFAULT.equals(nickname);
			case ForumPackage.MEMBER__POSTS:
				return posts != null && !posts.isEmpty();
			case ForumPackage.MEMBER__CREATED:
				return created != null && !created.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nickname: ");
		result.append(nickname);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
