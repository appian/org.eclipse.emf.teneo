/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapImpl.java,v 1.1 2006/11/23 06:12:10 mtaal Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.mindmap.Map;
import org.example.mindmap.MindmapPackage;
import org.example.mindmap.Relationship;
import org.example.mindmap.Resource;
import org.example.mindmap.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.mindmap.impl.MapImpl#getRootTopics <em>Root Topics</em>}</li>
 *   <li>{@link org.example.mindmap.impl.MapImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.example.mindmap.impl.MapImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.example.mindmap.impl.MapImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapImpl extends EObjectImpl implements Map {
	/**
	 * The cached value of the '{@link #getRootTopics() <em>Root Topics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootTopics()
	 * @generated
	 * @ordered
	 */
	protected EList rootTopics = null;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList relations = null;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList resources = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MindmapPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRootTopics() {
		if (rootTopics == null) {
			rootTopics = new EObjectContainmentEList(Topic.class, this, MindmapPackage.MAP__ROOT_TOPICS);
		}
		return rootTopics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList(Relationship.class, this, MindmapPackage.MAP__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList(Resource.class, this, MindmapPackage.MAP__RESOURCES);
		}
		return resources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MindmapPackage.MAP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MindmapPackage.MAP__ROOT_TOPICS:
				return ((InternalEList)getRootTopics()).basicRemove(otherEnd, msgs);
			case MindmapPackage.MAP__RELATIONS:
				return ((InternalEList)getRelations()).basicRemove(otherEnd, msgs);
			case MindmapPackage.MAP__RESOURCES:
				return ((InternalEList)getResources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MindmapPackage.MAP__ROOT_TOPICS:
				return getRootTopics();
			case MindmapPackage.MAP__RELATIONS:
				return getRelations();
			case MindmapPackage.MAP__RESOURCES:
				return getResources();
			case MindmapPackage.MAP__TITLE:
				return getTitle();
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
			case MindmapPackage.MAP__ROOT_TOPICS:
				getRootTopics().clear();
				getRootTopics().addAll((Collection)newValue);
				return;
			case MindmapPackage.MAP__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection)newValue);
				return;
			case MindmapPackage.MAP__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection)newValue);
				return;
			case MindmapPackage.MAP__TITLE:
				setTitle((String)newValue);
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
			case MindmapPackage.MAP__ROOT_TOPICS:
				getRootTopics().clear();
				return;
			case MindmapPackage.MAP__RELATIONS:
				getRelations().clear();
				return;
			case MindmapPackage.MAP__RESOURCES:
				getResources().clear();
				return;
			case MindmapPackage.MAP__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case MindmapPackage.MAP__ROOT_TOPICS:
				return rootTopics != null && !rootTopics.isEmpty();
			case MindmapPackage.MAP__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MindmapPackage.MAP__RESOURCES:
				return resources != null && !resources.isEmpty();
			case MindmapPackage.MAP__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //MapImpl