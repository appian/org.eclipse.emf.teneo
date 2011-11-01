/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.issues.top.ApplicationDefinition;
import org.eclipse.emf.teneo.samples.issues.top.Top;
import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.TopImpl#getApplicationDefinition <em>Application Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopImpl extends EObjectImpl implements Top {
	/**
	 * The cached value of the '{@link #getApplicationDefinition() <em>Application Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationDefinition> applicationDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopPackage.Literals.TOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationDefinition> getApplicationDefinition() {
		if (applicationDefinition == null) {
			applicationDefinition = new EObjectContainmentEList<ApplicationDefinition>(ApplicationDefinition.class, this, TopPackage.TOP__APPLICATION_DEFINITION);
		}
		return applicationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopPackage.TOP__APPLICATION_DEFINITION:
				return ((InternalEList<?>)getApplicationDefinition()).basicRemove(otherEnd, msgs);
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
			case TopPackage.TOP__APPLICATION_DEFINITION:
				return getApplicationDefinition();
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
			case TopPackage.TOP__APPLICATION_DEFINITION:
				getApplicationDefinition().clear();
				getApplicationDefinition().addAll((Collection<? extends ApplicationDefinition>)newValue);
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
			case TopPackage.TOP__APPLICATION_DEFINITION:
				getApplicationDefinition().clear();
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
			case TopPackage.TOP__APPLICATION_DEFINITION:
				return applicationDefinition != null && !applicationDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopImpl
