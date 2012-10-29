/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pannotation.ElementCollection;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Element Collection</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.ElementCollectionImpl#getFetch <em>
 * Fetch</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ElementCollectionImpl extends PAnnotationImpl implements ElementCollection {
	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchType FETCH_EDEFAULT = FetchType.EAGER;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchType fetch = FETCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ElementCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.ELEMENT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FetchType getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFetch(FetchType newFetch) {
		FetchType oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PannotationPackage.ELEMENT_COLLECTION__FETCH, oldFetch, fetch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PannotationPackage.ELEMENT_COLLECTION__FETCH:
			return getFetch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PannotationPackage.ELEMENT_COLLECTION__FETCH:
			setFetch((FetchType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PannotationPackage.ELEMENT_COLLECTION__FETCH:
			setFetch(FETCH_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PannotationPackage.ELEMENT_COLLECTION__FETCH:
			return fetch != FETCH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fetch: ");
		result.append(fetch);
		result.append(')');
		return result.toString();
	}

} // ElementCollectionImpl
