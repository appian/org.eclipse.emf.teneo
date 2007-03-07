/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMCharacteristicValueContainerImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMCharacteristicDefinition;
import datacore.CSMCharacteristicValueContainer;
import datacore.CSMInstance;
import datacore.CSMValue;
import datacore.CSMValueSet;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Characteristic Value Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMCharacteristicValueContainerImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicValueContainerImpl#getCsmInstance <em>Csm Instance</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicValueContainerImpl#getConcreteValue <em>Concrete Value</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicValueContainerImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicValueContainerImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSMCharacteristicValueContainerImpl extends CSMObjectImpl implements CSMCharacteristicValueContainer {
	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcreteValue() <em>Concrete Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteValue()
	 * @generated
	 * @ordered
	 */
	protected CSMValue concreteValue = null;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMValueSet> valueSet = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected CSMCharacteristicDefinition dataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMCharacteristicValueContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_CHARACTERISTIC_VALUE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMInstance getCsmInstance() {
		if (eContainerFeatureID != DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE) return null;
		return (CSMInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsmInstance(CSMInstance newCsmInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCsmInstance, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsmInstance(CSMInstance newCsmInstance) {
		if (newCsmInstance != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE && newCsmInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCsmInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCsmInstance != null)
				msgs = ((InternalEObject)newCsmInstance).eInverseAdd(this, DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER, CSMInstance.class, msgs);
			msgs = basicSetCsmInstance(newCsmInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE, newCsmInstance, newCsmInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue getConcreteValue() {
		return concreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcreteValue(CSMValue newConcreteValue, NotificationChain msgs) {
		CSMValue oldConcreteValue = concreteValue;
		concreteValue = newConcreteValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE, oldConcreteValue, newConcreteValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteValue(CSMValue newConcreteValue) {
		if (newConcreteValue != concreteValue) {
			NotificationChain msgs = null;
			if (concreteValue != null)
				msgs = ((InternalEObject)concreteValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE, null, msgs);
			if (newConcreteValue != null)
				msgs = ((InternalEObject)newConcreteValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE, null, msgs);
			msgs = basicSetConcreteValue(newConcreteValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE, newConcreteValue, newConcreteValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<CSMValueSet>(CSMValueSet.class, this, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (CSMCharacteristicDefinition)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(CSMCharacteristicDefinition newDataType, NotificationChain msgs) {
		CSMCharacteristicDefinition oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(CSMCharacteristicDefinition newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER, CSMCharacteristicDefinition.class, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER, CSMCharacteristicDefinition.class, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConcreteValueSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMValue setCSMConcreteValue(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCSMValueToValueSet(String value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addIntervalToValueSet(String min, String max, boolean includeMax, boolean includeMin, String increment) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clearValueSet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCsmInstance((CSMInstance)otherEnd, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				if (dataType != null)
					msgs = ((InternalEObject)dataType).eInverseRemove(this, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER, CSMCharacteristicDefinition.class, msgs);
				return basicSetDataType((CSMCharacteristicDefinition)otherEnd, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				return basicSetCsmInstance(null, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE:
				return basicSetConcreteValue(null, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				return basicSetDataType(null, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER, CSMInstance.class, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID:
				return isValid() ? Boolean.TRUE : Boolean.FALSE;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				return getCsmInstance();
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE:
				return getConcreteValue();
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET:
				return getValueSet();
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID:
				setValid(((Boolean)newValue).booleanValue());
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				setCsmInstance((CSMInstance)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE:
				setConcreteValue((CSMValue)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends CSMValueSet>)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				setDataType((CSMCharacteristicDefinition)newValue);
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				setCsmInstance((CSMInstance)null);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE:
				setConcreteValue((CSMValue)null);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET:
				getValueSet().clear();
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				setDataType((CSMCharacteristicDefinition)null);
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
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALID:
				return valid != VALID_EDEFAULT;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE:
				return getCsmInstance() != null;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CONCRETE_VALUE:
				return concreteValue != null;
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE:
				return dataType != null;
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
		result.append(" (valid: ");
		result.append(valid);
		result.append(')');
		return result.toString();
	}

} //CSMCharacteristicValueContainerImpl
