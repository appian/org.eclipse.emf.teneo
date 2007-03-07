/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMClassImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMCharacteristicDefinition;
import datacore.CSMClass;
import datacore.CSMInstance;
import datacore.CSMRepresentation;
import datacore.CSMType;
import datacore.CSMXML;
import datacore.DataSourceDefinitions;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMClassImpl#getCsmCharacteristicDefinitions <em>Csm Characteristic Definitions</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getValidCSMTypes <em>Valid CSM Types</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getDatasourceDefinition <em>Datasource Definition</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getKeyCharachteristicDefinition <em>Key Charachteristic Definition</em>}</li>
 *   <li>{@link datacore.impl.CSMClassImpl#getClassRepresentations <em>Class Representations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CSMClassImpl extends CSMMetaElementImpl implements CSMClass {
	/**
	 * The cached value of the '{@link #getCsmCharacteristicDefinitions() <em>Csm Characteristic Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsmCharacteristicDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMCharacteristicDefinition> csmCharacteristicDefinitions = null;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMInstance> instances = null;

	/**
	 * The cached value of the '{@link #getValidCSMTypes() <em>Valid CSM Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidCSMTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMType> validCSMTypes = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatasourceDefinition() <em>Datasource Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasourceDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataSourceDefinitions datasourceDefinition = null;

	/**
	 * The cached value of the '{@link #getKeyCharachteristicDefinition() <em>Key Charachteristic Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCharachteristicDefinition()
	 * @generated
	 * @ordered
	 */
	protected CSMCharacteristicDefinition keyCharachteristicDefinition = null;

	/**
	 * The cached value of the '{@link #getClassRepresentations() <em>Class Representations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRepresentations()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMRepresentation> classRepresentations = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMCharacteristicDefinition> getCsmCharacteristicDefinitions() {
		if (csmCharacteristicDefinitions == null) {
			csmCharacteristicDefinitions = new EObjectContainmentWithInverseEList<CSMCharacteristicDefinition>(CSMCharacteristicDefinition.class, this, DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS, DatacorePackage.CSM_CHARACTERISTIC_DEFINITION__CSM_CLASS);
		}
		return csmCharacteristicDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<CSMInstance>(CSMInstance.class, this, DatacorePackage.CSM_CLASS__INSTANCES, DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMType> getValidCSMTypes() {
		if (validCSMTypes == null) {
			validCSMTypes = new EObjectResolvingEList<CSMType>(CSMType.class, this, DatacorePackage.CSM_CLASS__VALID_CSM_TYPES);
		}
		return validCSMTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CLASS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceDefinitions getDatasourceDefinition() {
		return datasourceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasourceDefinition(DataSourceDefinitions newDatasourceDefinition, NotificationChain msgs) {
		DataSourceDefinitions oldDatasourceDefinition = datasourceDefinition;
		datasourceDefinition = newDatasourceDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION, oldDatasourceDefinition, newDatasourceDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasourceDefinition(DataSourceDefinitions newDatasourceDefinition) {
		if (newDatasourceDefinition != datasourceDefinition) {
			NotificationChain msgs = null;
			if (datasourceDefinition != null)
				msgs = ((InternalEObject)datasourceDefinition).eInverseRemove(this, DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS, DataSourceDefinitions.class, msgs);
			if (newDatasourceDefinition != null)
				msgs = ((InternalEObject)newDatasourceDefinition).eInverseAdd(this, DatacorePackage.DATA_SOURCE_DEFINITIONS__OWNER_CLASS, DataSourceDefinitions.class, msgs);
			msgs = basicSetDatasourceDefinition(newDatasourceDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION, newDatasourceDefinition, newDatasourceDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition getKeyCharachteristicDefinition() {
		if (keyCharachteristicDefinition != null && keyCharachteristicDefinition.eIsProxy()) {
			InternalEObject oldKeyCharachteristicDefinition = (InternalEObject)keyCharachteristicDefinition;
			keyCharachteristicDefinition = (CSMCharacteristicDefinition)eResolveProxy(oldKeyCharachteristicDefinition);
			if (keyCharachteristicDefinition != oldKeyCharachteristicDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION, oldKeyCharachteristicDefinition, keyCharachteristicDefinition));
			}
		}
		return keyCharachteristicDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition basicGetKeyCharachteristicDefinition() {
		return keyCharachteristicDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyCharachteristicDefinition(CSMCharacteristicDefinition newKeyCharachteristicDefinition) {
		CSMCharacteristicDefinition oldKeyCharachteristicDefinition = keyCharachteristicDefinition;
		keyCharachteristicDefinition = newKeyCharachteristicDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION, oldKeyCharachteristicDefinition, keyCharachteristicDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMRepresentation> getClassRepresentations() {
		if (classRepresentations == null) {
			classRepresentations = new EObjectContainmentWithInverseEList<CSMRepresentation>(CSMRepresentation.class, this, DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS, DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS);
		}
		return classRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition addCharacteristicsDefinition(CSMType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMInstance createCSMInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCharacteristicsDefinition(CSMCharacteristicDefinition characteristicDefinition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMInstance createCSMInstance(CSMXML owner) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCharacteristicDefinition(CSMCharacteristicDefinition characteristicDefinition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteCSMInstance(CSMInstance csmInstance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCSMInstance(CSMInstance csmIntsance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition getCSMCharacteristicDefinition(String id) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicDefinition getCSMCharacteristicDefinition(int index) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteAllCSMInstances() {
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCsmCharacteristicDefinitions()).basicAdd(otherEnd, msgs);
			case DatacorePackage.CSM_CLASS__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				if (datasourceDefinition != null)
					msgs = ((InternalEObject)datasourceDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION, null, msgs);
				return basicSetDatasourceDefinition((DataSourceDefinitions)otherEnd, msgs);
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassRepresentations()).basicAdd(otherEnd, msgs);
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				return ((InternalEList<?>)getCsmCharacteristicDefinitions()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_CLASS__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				return basicSetDatasourceDefinition(null, msgs);
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				return ((InternalEList<?>)getClassRepresentations()).basicRemove(otherEnd, msgs);
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				return getCsmCharacteristicDefinitions();
			case DatacorePackage.CSM_CLASS__INSTANCES:
				return getInstances();
			case DatacorePackage.CSM_CLASS__VALID_CSM_TYPES:
				return getValidCSMTypes();
			case DatacorePackage.CSM_CLASS__DESCRIPTION:
				return getDescription();
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				return getDatasourceDefinition();
			case DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION:
				if (resolve) return getKeyCharachteristicDefinition();
				return basicGetKeyCharachteristicDefinition();
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				return getClassRepresentations();
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				getCsmCharacteristicDefinitions().clear();
				getCsmCharacteristicDefinitions().addAll((Collection<? extends CSMCharacteristicDefinition>)newValue);
				return;
			case DatacorePackage.CSM_CLASS__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends CSMInstance>)newValue);
				return;
			case DatacorePackage.CSM_CLASS__VALID_CSM_TYPES:
				getValidCSMTypes().clear();
				getValidCSMTypes().addAll((Collection<? extends CSMType>)newValue);
				return;
			case DatacorePackage.CSM_CLASS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				setDatasourceDefinition((DataSourceDefinitions)newValue);
				return;
			case DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION:
				setKeyCharachteristicDefinition((CSMCharacteristicDefinition)newValue);
				return;
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				getClassRepresentations().clear();
				getClassRepresentations().addAll((Collection<? extends CSMRepresentation>)newValue);
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				getCsmCharacteristicDefinitions().clear();
				return;
			case DatacorePackage.CSM_CLASS__INSTANCES:
				getInstances().clear();
				return;
			case DatacorePackage.CSM_CLASS__VALID_CSM_TYPES:
				getValidCSMTypes().clear();
				return;
			case DatacorePackage.CSM_CLASS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				setDatasourceDefinition((DataSourceDefinitions)null);
				return;
			case DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION:
				setKeyCharachteristicDefinition((CSMCharacteristicDefinition)null);
				return;
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				getClassRepresentations().clear();
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
			case DatacorePackage.CSM_CLASS__CSM_CHARACTERISTIC_DEFINITIONS:
				return csmCharacteristicDefinitions != null && !csmCharacteristicDefinitions.isEmpty();
			case DatacorePackage.CSM_CLASS__INSTANCES:
				return instances != null && !instances.isEmpty();
			case DatacorePackage.CSM_CLASS__VALID_CSM_TYPES:
				return validCSMTypes != null && !validCSMTypes.isEmpty();
			case DatacorePackage.CSM_CLASS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DatacorePackage.CSM_CLASS__DATASOURCE_DEFINITION:
				return datasourceDefinition != null;
			case DatacorePackage.CSM_CLASS__KEY_CHARACHTERISTIC_DEFINITION:
				return keyCharachteristicDefinition != null;
			case DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS:
				return classRepresentations != null && !classRepresentations.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CSMClassImpl
