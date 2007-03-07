/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMCharacteristicDefinitionImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMCharacteristicDefinition;
import datacore.CSMCharacteristicValueContainer;
import datacore.CSMClass;
import datacore.CSMInstance;
import datacore.CSMType;
import datacore.ColumnDefinition;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Characteristic Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getCsmClass <em>Csm Class</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getCsmCharacteristicType <em>Csm Characteristic Type</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#isUserDefined <em>User Defined</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getValueContainer <em>Value Container</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getAliasName <em>Alias Name</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link datacore.impl.CSMCharacteristicDefinitionImpl#isFreeParameter <em>Free Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CSMCharacteristicDefinitionImpl extends CSMMetaElementImpl implements CSMCharacteristicDefinition {
	/**
	 * The cached value of the '{@link #getCsmCharacteristicType() <em>Csm Characteristic Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsmCharacteristicType()
	 * @generated
	 * @ordered
	 */
	protected CSMType csmCharacteristicType = null;

	/**
	 * The default value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_DEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserDefined() <em>User Defined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserDefined()
	 * @generated
	 * @ordered
	 */
	protected boolean userDefined = USER_DEFINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueContainer() <em>Value Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMCharacteristicValueContainer> valueContainer = null;

	/**
	 * The default value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasName() <em>Alias Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasName()
	 * @generated
	 * @ordered
	 */
	protected String aliasName = ALIAS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected ColumnDefinition dataSource = null;

	/**
	 * The default value of the '{@link #isFreeParameter() <em>Free Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreeParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREE_PARAMETER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreeParameter() <em>Free Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreeParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean freeParameter = FREE_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMCharacteristicDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_CHARACTERISTIC_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMClass getCsmClass() {
		if (eContainerFeatureID != DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS) return null;
		return (CSMClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsmClass(CSMClass newCsmClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCsmClass, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsmClass(CSMClass newCsmClass) {
		if (newCsmClass != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS && newCsmClass != null)) {
			if (EcoreUtil.isAncestor(this, newCsmClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCsmClass != null)
				msgs = ((InternalEObject)newCsmClass).eInverseAdd(this, DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS, CSMClass.class, msgs);
			msgs = basicSetCsmClass(newCsmClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS, newCsmClass, newCsmClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMType getCsmCharacteristicType() {
		if (csmCharacteristicType != null && csmCharacteristicType.eIsProxy()) {
			InternalEObject oldCsmCharacteristicType = (InternalEObject)csmCharacteristicType;
			csmCharacteristicType = (CSMType)eResolveProxy(oldCsmCharacteristicType);
			if (csmCharacteristicType != oldCsmCharacteristicType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE, oldCsmCharacteristicType, csmCharacteristicType));
			}
		}
		return csmCharacteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMType basicGetCsmCharacteristicType() {
		return csmCharacteristicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsmCharacteristicType(CSMType newCsmCharacteristicType) {
		CSMType oldCsmCharacteristicType = csmCharacteristicType;
		csmCharacteristicType = newCsmCharacteristicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE, oldCsmCharacteristicType, csmCharacteristicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserDefined() {
		return userDefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefined(boolean newUserDefined) {
		boolean oldUserDefined = userDefined;
		userDefined = newUserDefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED, oldUserDefined, userDefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMCharacteristicValueContainer> getValueContainer() {
		if (valueContainer == null) {
			valueContainer = new EObjectWithInverseResolvingEList<CSMCharacteristicValueContainer>(CSMCharacteristicValueContainer.class, this, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__DATA_TYPE);
		}
		return valueContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasName() {
		return aliasName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasName(String newAliasName) {
		String oldAliasName = aliasName;
		aliasName = newAliasName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME, oldAliasName, aliasName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnDefinition getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(ColumnDefinition newDataSource, NotificationChain msgs) {
		ColumnDefinition oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(ColumnDefinition newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFreeParameter() {
		return freeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeParameter(boolean newFreeParameter) {
		boolean oldFreeParameter = freeParameter;
		freeParameter = newFreeParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER, oldFreeParameter, freeParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicValueContainer createCSMCharacteristicValueContainer(CSMInstance csmInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCSMCharactersitcValueContainer(CSMCharacteristicValueContainer valueContainer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAllCSMCahracteristicValueContainer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicValueContainer getCSMCahracteristicValueContainer(CSMInstance csmInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsOnlyUniqueValues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKey() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCsmClass((CSMClass)otherEnd, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueContainer()).basicAdd(otherEnd, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				return basicSetCsmClass(null, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				return ((InternalEList<?>)getValueContainer()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS, CSMClass.class, msgs);
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				return getCsmClass();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE:
				if (resolve) return getCsmCharacteristicType();
				return basicGetCsmCharacteristicType();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED:
				return isUserDefined() ? Boolean.TRUE : Boolean.FALSE;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__NAME:
				return getName();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				return getValueContainer();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME:
				return getAliasName();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__INDEX:
				return new Integer(getIndex());
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE:
				return getDataSource();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER:
				return isFreeParameter() ? Boolean.TRUE : Boolean.FALSE;
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				setCsmClass((CSMClass)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE:
				setCsmCharacteristicType((CSMType)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED:
				setUserDefined(((Boolean)newValue).booleanValue());
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				getValueContainer().clear();
				getValueContainer().addAll((Collection<? extends CSMCharacteristicValueContainer>)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME:
				setAliasName((String)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__INDEX:
				setIndex(((Integer)newValue).intValue());
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE:
				setDataSource((ColumnDefinition)newValue);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER:
				setFreeParameter(((Boolean)newValue).booleanValue());
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				setCsmClass((CSMClass)null);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE:
				setCsmCharacteristicType((CSMType)null);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED:
				setUserDefined(USER_DEFINED_EDEFAULT);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				getValueContainer().clear();
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME:
				setAliasName(ALIAS_NAME_EDEFAULT);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE:
				setDataSource((ColumnDefinition)null);
				return;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER:
				setFreeParameter(FREE_PARAMETER_EDEFAULT);
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
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS:
				return getCsmClass() != null;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CHARACTERISTIC_TYPE:
				return csmCharacteristicType != null;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__USER_DEFINED:
				return userDefined != USER_DEFINED_EDEFAULT;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__VALUE_CONTAINER:
				return valueContainer != null && !valueContainer.isEmpty();
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__ALIAS_NAME:
				return ALIAS_NAME_EDEFAULT == null ? aliasName != null : !ALIAS_NAME_EDEFAULT.equals(aliasName);
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__INDEX:
				return index != INDEX_EDEFAULT;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__DATA_SOURCE:
				return dataSource != null;
			case DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__FREE_PARAMETER:
				return freeParameter != FREE_PARAMETER_EDEFAULT;
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
		result.append(" (userDefined: ");
		result.append(userDefined);
		result.append(", Name: ");
		result.append(name);
		result.append(", aliasName: ");
		result.append(aliasName);
		result.append(", index: ");
		result.append(index);
		result.append(", freeParameter: ");
		result.append(freeParameter);
		result.append(')');
		return result.toString();
	}

} //CSMCharacteristicDefinitionImpl
