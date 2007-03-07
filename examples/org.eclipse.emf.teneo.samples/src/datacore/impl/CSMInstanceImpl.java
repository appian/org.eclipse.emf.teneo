/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMInstanceImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMCharacteristicDefinition;
import datacore.CSMCharacteristicValueContainer;
import datacore.CSMClass;
import datacore.CSMInstance;
import datacore.CSMRepresentationRoot;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMInstanceImpl#getCsmValueContainer <em>Csm Value Container</em>}</li>
 *   <li>{@link datacore.impl.CSMInstanceImpl#getCsmReprasentation <em>Csm Reprasentation</em>}</li>
 *   <li>{@link datacore.impl.CSMInstanceImpl#getContainingCSMClass <em>Containing CSM Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSMInstanceImpl extends CSMObjectImpl implements CSMInstance {
	/**
	 * The cached value of the '{@link #getCsmValueContainer() <em>Csm Value Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsmValueContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMCharacteristicValueContainer> csmValueContainer = null;

	/**
	 * The cached value of the '{@link #getCsmReprasentation() <em>Csm Reprasentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsmReprasentation()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMRepresentationRoot> csmReprasentation = null;

	/**
	 * The cached value of the '{@link #getContainingCSMClass() <em>Containing CSM Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingCSMClass()
	 * @generated
	 * @ordered
	 */
	protected CSMClass containingCSMClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMCharacteristicValueContainer> getCsmValueContainer() {
		if (csmValueContainer == null) {
			csmValueContainer = new EObjectContainmentWithInverseEList<CSMCharacteristicValueContainer>(CSMCharacteristicValueContainer.class, this, DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER, DatacorePackage.CSM_CHARACTERISTIC_VALUE_CONTAINER__CSM_INSTANCE);
		}
		return csmValueContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMRepresentationRoot> getCsmReprasentation() {
		if (csmReprasentation == null) {
			csmReprasentation = new EObjectContainmentWithInverseEList<CSMRepresentationRoot>(CSMRepresentationRoot.class, this, DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION, DatacorePackage.CSM_REPRESENTATION_ROOT__CSM_INSTANCE);
		}
		return csmReprasentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMClass getContainingCSMClass() {
		if (containingCSMClass != null && containingCSMClass.eIsProxy()) {
			InternalEObject oldContainingCSMClass = (InternalEObject)containingCSMClass;
			containingCSMClass = (CSMClass)eResolveProxy(oldContainingCSMClass);
			if (containingCSMClass != oldContainingCSMClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS, oldContainingCSMClass, containingCSMClass));
			}
		}
		return containingCSMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMClass basicGetContainingCSMClass() {
		return containingCSMClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingCSMClass(CSMClass newContainingCSMClass, NotificationChain msgs) {
		CSMClass oldContainingCSMClass = containingCSMClass;
		containingCSMClass = newContainingCSMClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS, oldContainingCSMClass, newContainingCSMClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingCSMClass(CSMClass newContainingCSMClass) {
		if (newContainingCSMClass != containingCSMClass) {
			NotificationChain msgs = null;
			if (containingCSMClass != null)
				msgs = ((InternalEObject)containingCSMClass).eInverseRemove(this, DatacorePackage.CSM_CLASS__INSTANCES, CSMClass.class, msgs);
			if (newContainingCSMClass != null)
				msgs = ((InternalEObject)newContainingCSMClass).eInverseAdd(this, DatacorePackage.CSM_CLASS__INSTANCES, CSMClass.class, msgs);
			msgs = basicSetContainingCSMClass(newContainingCSMClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS, newContainingCSMClass, newContainingCSMClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicValueContainer getCSMCharacteristicValueContainer(CSMCharacteristicDefinition characteristicDefinition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMCharacteristicValueContainer createCSMCharacteristicValueContainer(CSMCharacteristicDefinition characteristcDefinition) {
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
	public void deleteAllCSMCharacteristicValueContainer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean allNotUserDefinedContainerSet() {
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCsmValueContainer()).basicAdd(otherEnd, msgs);
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCsmReprasentation()).basicAdd(otherEnd, msgs);
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				if (containingCSMClass != null)
					msgs = ((InternalEObject)containingCSMClass).eInverseRemove(this, DatacorePackage.CSM_CLASS__INSTANCES, CSMClass.class, msgs);
				return basicSetContainingCSMClass((CSMClass)otherEnd, msgs);
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				return ((InternalEList<?>)getCsmValueContainer()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				return ((InternalEList<?>)getCsmReprasentation()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				return basicSetContainingCSMClass(null, msgs);
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				return getCsmValueContainer();
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				return getCsmReprasentation();
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				if (resolve) return getContainingCSMClass();
				return basicGetContainingCSMClass();
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				getCsmValueContainer().clear();
				getCsmValueContainer().addAll((Collection<? extends CSMCharacteristicValueContainer>)newValue);
				return;
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				getCsmReprasentation().clear();
				getCsmReprasentation().addAll((Collection<? extends CSMRepresentationRoot>)newValue);
				return;
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				setContainingCSMClass((CSMClass)newValue);
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				getCsmValueContainer().clear();
				return;
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				getCsmReprasentation().clear();
				return;
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				setContainingCSMClass((CSMClass)null);
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
			case DatacorePackage.CSM_INSTANCE__CSM_VALUE_CONTAINER:
				return csmValueContainer != null && !csmValueContainer.isEmpty();
			case DatacorePackage.CSM_INSTANCE__CSM_REPRASENTATION:
				return csmReprasentation != null && !csmReprasentation.isEmpty();
			case DatacorePackage.CSM_INSTANCE__CONTAINING_CSM_CLASS:
				return containingCSMClass != null;
		}
		return super.eIsSet(featureID);
	}

} //CSMInstanceImpl
