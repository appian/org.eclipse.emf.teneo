/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationTreeImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.nav.NavElement;
import org.eclipse.emf.teneo.samples.issues.nav.NavPackage;
import org.eclipse.emf.teneo.samples.issues.nav.NavigationTree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.nav.impl.NavigationTreeImpl#getNavElement <em>Nav Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationTreeImpl extends EObjectImpl implements NavigationTree {
	/**
	 * The cached value of the '{@link #getNavElement() <em>Nav Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NavElement> navElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NavPackage.Literals.NAVIGATION_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavElement> getNavElement() {
		if (navElement == null) {
			navElement = new EObjectContainmentEList<NavElement>(NavElement.class, this, NavPackage.NAVIGATION_TREE__NAV_ELEMENT);
		}
		return navElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NavPackage.NAVIGATION_TREE__NAV_ELEMENT:
				return ((InternalEList<?>)getNavElement()).basicRemove(otherEnd, msgs);
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
			case NavPackage.NAVIGATION_TREE__NAV_ELEMENT:
				return getNavElement();
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
			case NavPackage.NAVIGATION_TREE__NAV_ELEMENT:
				getNavElement().clear();
				getNavElement().addAll((Collection<? extends NavElement>)newValue);
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
			case NavPackage.NAVIGATION_TREE__NAV_ELEMENT:
				getNavElement().clear();
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
			case NavPackage.NAVIGATION_TREE__NAV_ELEMENT:
				return navElement != null && !navElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationTreeImpl
