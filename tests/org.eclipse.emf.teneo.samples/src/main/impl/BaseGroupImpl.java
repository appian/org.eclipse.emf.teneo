/**
 * <copyright>
 * </copyright>
 *
 * $Id: BaseGroupImpl.java,v 1.1 2006/09/21 00:56:52 mtaal Exp $
 */
package main.impl;

import java.util.Collection;

import main.BaseComponent;
import main.BaseGroup;
import main.MainPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base Group</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link main.impl.BaseGroupImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BaseGroupImpl extends BaseComponentImpl implements BaseGroup {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList components = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BaseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MainPackage.Literals.BASE_GROUP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList(BaseComponent.class, this,
					MainPackage.BASE_GROUP__COMPONENTS, MainPackage.BASE_COMPONENT__GROUP);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case MainPackage.BASE_GROUP__COMPONENTS:
			return ((InternalEList) getComponents()).basicAdd(otherEnd, msgs);
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
		case MainPackage.BASE_GROUP__COMPONENTS:
			return ((InternalEList) getComponents()).basicRemove(otherEnd, msgs);
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
		case MainPackage.BASE_GROUP__COMPONENTS:
			return getComponents();
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
		case MainPackage.BASE_GROUP__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection) newValue);
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
		case MainPackage.BASE_GROUP__COMPONENTS:
			getComponents().clear();
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
		case MainPackage.BASE_GROUP__COMPONENTS:
			return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // BaseGroupImpl