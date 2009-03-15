/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityListenersImpl.java,v 1.1 2009/03/15 23:45:03 mtaal Exp $
 */
package org.eclipse.emf.teneo.jpa.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.jpa.orm.EntityListener;
import org.eclipse.emf.teneo.jpa.orm.EntityListeners;
import org.eclipse.emf.teneo.jpa.orm.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Listeners</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.jpa.orm.impl.EntityListenersImpl#getEntityListener <em>Entity Listener</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityListenersImpl extends EObjectImpl implements EntityListeners {
	/**
	 * The cached value of the '{@link #getEntityListener() <em>Entity Listener</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityListener()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityListener> entityListener;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityListenersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.Literals.ENTITY_LISTENERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityListener> getEntityListener() {
		if (entityListener == null) {
			entityListener = new EObjectContainmentEList<EntityListener>(EntityListener.class, this, OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER);
		}
		return entityListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER:
				return ((InternalEList<?>)getEntityListener()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER:
				return getEntityListener();
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
			case OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER:
				getEntityListener().clear();
				getEntityListener().addAll((Collection<? extends EntityListener>)newValue);
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
			case OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER:
				getEntityListener().clear();
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
			case OrmPackage.ENTITY_LISTENERS__ENTITY_LISTENER:
				return entityListener != null && !entityListener.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityListenersImpl
