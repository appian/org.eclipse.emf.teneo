/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceImpl.java,v 1.1 2006/11/23 06:12:10 mtaal Exp $
 */
package org.example.mindmap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.mindmap.MindmapPackage;
import org.example.mindmap.Resource;
import org.example.mindmap.Topic;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Resource</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.example.mindmap.impl.ResourceImpl#getComments <em>Comments</em>}</li>
 * <li>{@link org.example.mindmap.impl.ResourceImpl#getEmail <em>Email</em>}</li>
 * <li>{@link org.example.mindmap.impl.ResourceImpl#getName <em>Name</em>}</li>
 * <li>{@link org.example.mindmap.impl.ResourceImpl#getTopics <em>Topics</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResourceImpl extends EObjectImpl implements Resource {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList comments = null;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList topics = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MindmapPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getComments() {
		if (comments == null) {
			comments = new EObjectWithInverseResolvingEList(org.example.mindmap.Thread.class, this,
					MindmapPackage.RESOURCE__COMMENTS, MindmapPackage.THREAD__AUTHOR);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.RESOURCE__EMAIL,
					oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.RESOURCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getTopics() {
		if (topics == null) {
			topics = new EObjectWithInverseResolvingEList.ManyInverse(Topic.class, this,
					MindmapPackage.RESOURCE__TOPICS, MindmapPackage.TOPIC__RESOURCES);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			return ((InternalEList) getComments()).basicAdd(otherEnd, msgs);
		case MindmapPackage.RESOURCE__TOPICS:
			return ((InternalEList) getTopics()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			return ((InternalEList) getComments()).basicRemove(otherEnd, msgs);
		case MindmapPackage.RESOURCE__TOPICS:
			return ((InternalEList) getTopics()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			return getComments();
		case MindmapPackage.RESOURCE__EMAIL:
			return getEmail();
		case MindmapPackage.RESOURCE__NAME:
			return getName();
		case MindmapPackage.RESOURCE__TOPICS:
			return getTopics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection) newValue);
			return;
		case MindmapPackage.RESOURCE__EMAIL:
			setEmail((String) newValue);
			return;
		case MindmapPackage.RESOURCE__NAME:
			setName((String) newValue);
			return;
		case MindmapPackage.RESOURCE__TOPICS:
			getTopics().clear();
			getTopics().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			getComments().clear();
			return;
		case MindmapPackage.RESOURCE__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case MindmapPackage.RESOURCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MindmapPackage.RESOURCE__TOPICS:
			getTopics().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MindmapPackage.RESOURCE__COMMENTS:
			return comments != null && !comments.isEmpty();
		case MindmapPackage.RESOURCE__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case MindmapPackage.RESOURCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MindmapPackage.RESOURCE__TOPICS:
			return topics != null && !topics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (email: ");
		result.append(email);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // ResourceImpl