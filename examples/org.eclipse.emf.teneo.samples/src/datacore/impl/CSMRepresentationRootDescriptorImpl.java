/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentationRootDescriptorImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMRepresentationRoot;
import datacore.CSMRepresentationRootDescriptor;
import datacore.DatacorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Representation Root Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMRepresentationRootDescriptorImpl#getRepresentationRoot <em>Representation Root</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootDescriptorImpl#getCharacteristicID <em>Characteristic ID</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootDescriptorImpl#getCharacteriticValue <em>Characteritic Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSMRepresentationRootDescriptorImpl extends EObjectImpl implements CSMRepresentationRootDescriptor {
	/**
	 * The default value of the '{@link #getCharacteristicID() <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERISTIC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacteristicID() <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicID()
	 * @generated
	 * @ordered
	 */
	protected String characteristicID = CHARACTERISTIC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacteriticValue() <em>Characteritic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteriticValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERITIC_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacteriticValue() <em>Characteritic Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteriticValue()
	 * @generated
	 * @ordered
	 */
	protected String characteriticValue = CHARACTERITIC_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMRepresentationRootDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_REPRESENTATION_ROOT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentationRoot getRepresentationRoot() {
		if (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT) return null;
		return (CSMRepresentationRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentationRoot(CSMRepresentationRoot newRepresentationRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepresentationRoot, DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationRoot(CSMRepresentationRoot newRepresentationRoot) {
		if (newRepresentationRoot != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT && newRepresentationRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRepresentationRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepresentationRoot != null)
				msgs = ((InternalEObject)newRepresentationRoot).eInverseAdd(this, DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS, CSMRepresentationRoot.class, msgs);
			msgs = basicSetRepresentationRoot(newRepresentationRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT, newRepresentationRoot, newRepresentationRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteristicID() {
		return characteristicID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicID(String newCharacteristicID) {
		String oldCharacteristicID = characteristicID;
		characteristicID = newCharacteristicID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID, oldCharacteristicID, characteristicID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteriticValue() {
		return characteriticValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteriticValue(String newCharacteriticValue) {
		String oldCharacteriticValue = characteriticValue;
		characteriticValue = newCharacteriticValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE, oldCharacteriticValue, characteriticValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepresentationRoot((CSMRepresentationRoot)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				return basicSetRepresentationRoot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS, CSMRepresentationRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				return getRepresentationRoot();
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID:
				return getCharacteristicID();
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE:
				return getCharacteriticValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				setRepresentationRoot((CSMRepresentationRoot)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID:
				setCharacteristicID((String)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE:
				setCharacteriticValue((String)newValue);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				setRepresentationRoot((CSMRepresentationRoot)null);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID:
				setCharacteristicID(CHARACTERISTIC_ID_EDEFAULT);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE:
				setCharacteriticValue(CHARACTERITIC_VALUE_EDEFAULT);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT:
				return getRepresentationRoot() != null;
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERISTIC_ID:
				return CHARACTERISTIC_ID_EDEFAULT == null ? characteristicID != null : !CHARACTERISTIC_ID_EDEFAULT.equals(characteristicID);
			case DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__CHARACTERITIC_VALUE:
				return CHARACTERITIC_VALUE_EDEFAULT == null ? characteriticValue != null : !CHARACTERITIC_VALUE_EDEFAULT.equals(characteriticValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (characteristicID: ");
		result.append(characteristicID);
		result.append(", characteriticValue: ");
		result.append(characteriticValue);
		result.append(')');
		return result.toString();
	}

} //CSMRepresentationRootDescriptorImpl
