/**
 * <copyright>
 * </copyright>
 *
 * $Id: FirstAddressHolderImpl.java,v 1.3 2007/02/08 23:09:20 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.ExtensionPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Address Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.impl.FirstAddressHolderImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirstAddressHolderImpl extends EObjectImpl implements FirstAddressHolder {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> value = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstAddressHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionPackage.Literals.FIRST_ADDRESS_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getValue() {
		if (value == null) {
			value = new EObjectEList<Address>(Address.class, this, ExtensionPackage.FIRST_ADDRESS_HOLDER__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionPackage.FIRST_ADDRESS_HOLDER__VALUE:
				return getValue();
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
			case ExtensionPackage.FIRST_ADDRESS_HOLDER__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Address>)newValue);
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
			case ExtensionPackage.FIRST_ADDRESS_HOLDER__VALUE:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtensionPackage.FIRST_ADDRESS_HOLDER__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FirstAddressHolderImpl
