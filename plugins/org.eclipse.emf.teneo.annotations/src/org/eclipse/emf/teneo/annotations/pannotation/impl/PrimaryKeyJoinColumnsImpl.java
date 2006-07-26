/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyJoinColumnsImpl.java,v 1.3 2006/07/26 12:43:35 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn;
import org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key Join Columns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnsImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.annotations.pannotation.impl.PrimaryKeyJoinColumnsImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyJoinColumnsImpl extends EObjectImpl implements PrimaryKeyJoinColumns {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Davide Marchignoli\n";

	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected EModelElement eModelElement = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList value = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyJoinColumnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PannotationPackage.Literals.PRIMARY_KEY_JOIN_COLUMNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (EModelElement)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		EModelElement oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getValue() {
		if (value == null) {
			value = new EObjectContainmentEList(PrimaryKeyJoinColumn.class, this, PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE:
				return ((InternalEList)getValue()).basicRemove(otherEnd, msgs);
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
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE:
				return getValue();
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
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE:
				getValue().clear();
				getValue().addAll((Collection)newValue);
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
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE:
				getValue().clear();
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
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__EMODEL_ELEMENT:
				return eModelElement != null;
			case PannotationPackage.PRIMARY_KEY_JOIN_COLUMNS__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyJoinColumnsImpl
