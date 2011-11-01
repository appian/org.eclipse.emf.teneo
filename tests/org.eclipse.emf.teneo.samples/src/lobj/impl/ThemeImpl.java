/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.LobjPackage;
import lobj.SimpleDidacMeta;
import lobj.Theme;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ThemeImpl#getSimpleDidacMeta <em>Simple Didac Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThemeImpl extends LearningObjectImpl implements Theme {
	/**
	 * The cached value of the '{@link #getSimpleDidacMeta() <em>Simple Didac Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDidacMeta()
	 * @generated
	 * @ordered
	 */
	protected EList simpleDidacMeta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.THEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSimpleDidacMeta() {
		if (simpleDidacMeta == null) {
			simpleDidacMeta = new EObjectContainmentEList(SimpleDidacMeta.class, this, LobjPackage.THEME__SIMPLE_DIDAC_META);
		}
		return simpleDidacMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.THEME__SIMPLE_DIDAC_META:
				return ((InternalEList)getSimpleDidacMeta()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.THEME__SIMPLE_DIDAC_META:
				return getSimpleDidacMeta();
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
			case LobjPackage.THEME__SIMPLE_DIDAC_META:
				getSimpleDidacMeta().clear();
				getSimpleDidacMeta().addAll((Collection)newValue);
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
			case LobjPackage.THEME__SIMPLE_DIDAC_META:
				getSimpleDidacMeta().clear();
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
			case LobjPackage.THEME__SIMPLE_DIDAC_META:
				return simpleDidacMeta != null && !simpleDidacMeta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ThemeImpl
