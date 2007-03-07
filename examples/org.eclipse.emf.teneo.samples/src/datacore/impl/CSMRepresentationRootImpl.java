/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentationRootImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMInstance;
import datacore.CSMRepresentation;
import datacore.CSMRepresentationRoot;
import datacore.CSMRepresentationRootDescriptor;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Representation Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMRepresentationRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootImpl#getCsmInstance <em>Csm Instance</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootImpl#getRepresentationTree <em>Representation Tree</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationRootImpl#getValueDescriptors <em>Value Descriptors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSMRepresentationRootImpl extends EObjectImpl implements CSMRepresentationRoot {
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
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentationTree() <em>Representation Tree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationTree()
	 * @generated
	 * @ordered
	 */
	protected CSMRepresentation representationTree = null;

	/**
	 * The cached value of the '{@link #getValueDescriptors() <em>Value Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMRepresentationRootDescriptor> valueDescriptors = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMRepresentationRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_REPRESENTATION_ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMInstance getCsmInstance() {
		if (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE) return null;
		return (CSMInstance)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsmInstance(CSMInstance newCsmInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCsmInstance, DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsmInstance(CSMInstance newCsmInstance) {
		if (newCsmInstance != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE && newCsmInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCsmInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCsmInstance != null)
				msgs = ((InternalEObject)newCsmInstance).eInverseAdd(this, DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION, CSMInstance.class, msgs);
			msgs = basicSetCsmInstance(newCsmInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE, newCsmInstance, newCsmInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentation getRepresentationTree() {
		return representationTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentationTree(CSMRepresentation newRepresentationTree, NotificationChain msgs) {
		CSMRepresentation oldRepresentationTree = representationTree;
		representationTree = newRepresentationTree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE, oldRepresentationTree, newRepresentationTree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationTree(CSMRepresentation newRepresentationTree) {
		if (newRepresentationTree != representationTree) {
			NotificationChain msgs = null;
			if (representationTree != null)
				msgs = ((InternalEObject)representationTree).eInverseRemove(this, DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT, CSMRepresentation.class, msgs);
			if (newRepresentationTree != null)
				msgs = ((InternalEObject)newRepresentationTree).eInverseAdd(this, DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT, CSMRepresentation.class, msgs);
			msgs = basicSetRepresentationTree(newRepresentationTree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE, newRepresentationTree, newRepresentationTree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMRepresentationRootDescriptor> getValueDescriptors() {
		if (valueDescriptors == null) {
			valueDescriptors = new EObjectContainmentWithInverseEList<CSMRepresentationRootDescriptor>(CSMRepresentationRootDescriptor.class, this, DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS, DatacorePackage.CSM_REPRESENTATION_ROOT_DESCRIPTOR__REPRESENTATION_ROOT);
		}
		return valueDescriptors;
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCsmInstance((CSMInstance)otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				if (representationTree != null)
					msgs = ((InternalEObject)representationTree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE, null, msgs);
				return basicSetRepresentationTree((CSMRepresentation)otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValueDescriptors()).basicAdd(otherEnd, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				return basicSetCsmInstance(null, msgs);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				return basicSetRepresentationTree(null, msgs);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				return ((InternalEList<?>)getValueDescriptors()).basicRemove(otherEnd, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION, CSMInstance.class, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__NAME:
				return getName();
			case DatacorePackage.CSM_REPRESENTATION_ROOT__MODEL_NAME:
				return getModelName();
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				return getCsmInstance();
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				return getRepresentationTree();
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				return getValueDescriptors();
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__NAME:
				setName((String)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				setCsmInstance((CSMInstance)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				setRepresentationTree((CSMRepresentation)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				getValueDescriptors().clear();
				getValueDescriptors().addAll((Collection<? extends CSMRepresentationRootDescriptor>)newValue);
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				setCsmInstance((CSMInstance)null);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				setRepresentationTree((CSMRepresentation)null);
				return;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				getValueDescriptors().clear();
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
			case DatacorePackage.CSM_REPRESENTATION_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE:
				return getCsmInstance() != null;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE:
				return representationTree != null;
			case DatacorePackage.CSM_REPRESENTATION_ROOT__VALUE_DESCRIPTORS:
				return valueDescriptors != null && !valueDescriptors.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //CSMRepresentationRootImpl
