/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopicImpl.java,v 1.2 2007/02/08 23:09:24 mtaal Exp $
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
import org.eclipse.emf.teneo.samples.emf.sample.forum.TopicCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.TopicImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.TopicImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.TopicImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.forum.impl.TopicImpl#getPosts <em>Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopicImpl extends EObjectImpl implements Topic {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final TopicCategory CATEGORY_EDEFAULT = TopicCategory.ANNOUNCEMENT_LITERAL;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected TopicCategory category = CATEGORY_EDEFAULT;

	/**
	 * This is true if the Category attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categoryESet = false;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected Member creator = null;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ForumPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.TOPIC__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopicCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(TopicCategory newCategory) {
		TopicCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		boolean oldCategoryESet = categoryESet;
		categoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.TOPIC__CATEGORY, oldCategory, category, !oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategory() {
		TopicCategory oldCategory = category;
		boolean oldCategoryESet = categoryESet;
		category = CATEGORY_EDEFAULT;
		categoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ForumPackage.TOPIC__CATEGORY, oldCategory, CATEGORY_EDEFAULT, oldCategoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategory() {
		return categoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(Member newCreator, NotificationChain msgs) {
		Member oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ForumPackage.TOPIC__CREATOR, oldCreator, newCreator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(Member newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject)creator).eInverseRemove(this, ForumPackage.MEMBER__CREATED, Member.class, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject)newCreator).eInverseAdd(this, ForumPackage.MEMBER__CREATED, Member.class, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ForumPackage.TOPIC__CREATOR, newCreator, newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectWithInverseEList<Post>(Post.class, this, ForumPackage.TOPIC__POSTS, ForumPackage.POST__TOPIC);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ForumPackage.TOPIC__CREATOR:
				if (creator != null)
					msgs = ((InternalEObject)creator).eInverseRemove(this, ForumPackage.MEMBER__CREATED, Member.class, msgs);
				return basicSetCreator((Member)otherEnd, msgs);
			case ForumPackage.TOPIC__POSTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPosts()).basicAdd(otherEnd, msgs);
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
			case ForumPackage.TOPIC__CREATOR:
				return basicSetCreator(null, msgs);
			case ForumPackage.TOPIC__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
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
			case ForumPackage.TOPIC__TITLE:
				return getTitle();
			case ForumPackage.TOPIC__CATEGORY:
				return getCategory();
			case ForumPackage.TOPIC__CREATOR:
				return getCreator();
			case ForumPackage.TOPIC__POSTS:
				return getPosts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ForumPackage.TOPIC__TITLE:
				setTitle((String)newValue);
				return;
			case ForumPackage.TOPIC__CATEGORY:
				setCategory((TopicCategory)newValue);
				return;
			case ForumPackage.TOPIC__CREATOR:
				setCreator((Member)newValue);
				return;
			case ForumPackage.TOPIC__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends Post>)newValue);
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
			case ForumPackage.TOPIC__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ForumPackage.TOPIC__CATEGORY:
				unsetCategory();
				return;
			case ForumPackage.TOPIC__CREATOR:
				setCreator((Member)null);
				return;
			case ForumPackage.TOPIC__POSTS:
				getPosts().clear();
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
			case ForumPackage.TOPIC__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ForumPackage.TOPIC__CATEGORY:
				return isSetCategory();
			case ForumPackage.TOPIC__CREATOR:
				return creator != null;
			case ForumPackage.TOPIC__POSTS:
				return posts != null && !posts.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", category: ");
		if (categoryESet) result.append(category); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TopicImpl
