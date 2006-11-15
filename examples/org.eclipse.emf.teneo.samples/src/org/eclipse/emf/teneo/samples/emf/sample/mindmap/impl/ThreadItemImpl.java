/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThreadItemImpl.java,v 1.1 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.mindmap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage;
import org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource;
import org.eclipse.emf.teneo.samples.emf.sample.mindmap.ThreadItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.impl.ThreadItemImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.impl.ThreadItemImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.impl.ThreadItemImpl#getItemPostDate <em>Item Post Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThreadItemImpl extends EObjectImpl implements ThreadItem {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Resource author = null;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemPostDate() <em>Item Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPostDate()
	 * @generated
	 * @ordered
	 */
	protected static final Object ITEM_POST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemPostDate() <em>Item Post Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPostDate()
	 * @generated
	 * @ordered
	 */
	protected Object itemPostDate = ITEM_POST_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MindmapPackage.Literals.THREAD_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Resource)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MindmapPackage.THREAD_ITEM__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Resource newAuthor) {
		Resource oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.THREAD_ITEM__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.THREAD_ITEM__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getItemPostDate() {
		return itemPostDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemPostDate(Object newItemPostDate) {
		Object oldItemPostDate = itemPostDate;
		itemPostDate = newItemPostDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.THREAD_ITEM__ITEM_POST_DATE, oldItemPostDate, itemPostDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MindmapPackage.THREAD_ITEM__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case MindmapPackage.THREAD_ITEM__BODY:
				return getBody();
			case MindmapPackage.THREAD_ITEM__ITEM_POST_DATE:
				return getItemPostDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MindmapPackage.THREAD_ITEM__AUTHOR:
				setAuthor((Resource)newValue);
				return;
			case MindmapPackage.THREAD_ITEM__BODY:
				setBody((String)newValue);
				return;
			case MindmapPackage.THREAD_ITEM__ITEM_POST_DATE:
				setItemPostDate((Object)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MindmapPackage.THREAD_ITEM__AUTHOR:
				setAuthor((Resource)null);
				return;
			case MindmapPackage.THREAD_ITEM__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case MindmapPackage.THREAD_ITEM__ITEM_POST_DATE:
				setItemPostDate(ITEM_POST_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MindmapPackage.THREAD_ITEM__AUTHOR:
				return author != null;
			case MindmapPackage.THREAD_ITEM__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case MindmapPackage.THREAD_ITEM__ITEM_POST_DATE:
				return ITEM_POST_DATE_EDEFAULT == null ? itemPostDate != null : !ITEM_POST_DATE_EDEFAULT.equals(itemPostDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (body: ");
		result.append(body);
		result.append(", itemPostDate: ");
		result.append(itemPostDate);
		result.append(')');
		return result.toString();
	}

} //ThreadItemImpl