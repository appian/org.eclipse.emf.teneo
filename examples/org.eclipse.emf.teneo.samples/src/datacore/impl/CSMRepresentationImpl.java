/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMRepresentationImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMClass;
import datacore.CSMRepresentation;
import datacore.CSMRepresentationRoot;
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
 * An implementation of the model object '<em><b>CSM Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMRepresentationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationImpl#getRepresentationRoot <em>Representation Root</em>}</li>
 *   <li>{@link datacore.impl.CSMRepresentationImpl#getOwnerCSMClass <em>Owner CSM Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CSMRepresentationImpl extends EObjectImpl implements CSMRepresentation {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMRepresentation> children = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentation getParent() {
		if (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__PARENT) return null;
		return (CSMRepresentation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CSMRepresentation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DatacorePackage.CSM_REPRESENTATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CSMRepresentation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DatacorePackage.CSM_REPRESENTATION__CHILDREN, CSMRepresentation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMRepresentation> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<CSMRepresentation>(CSMRepresentation.class, this, DatacorePackage.CSM_REPRESENTATION__CHILDREN, DatacorePackage.CSM_REPRESENTATION__PARENT);
		}
		return children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMRepresentationRoot getRepresentationRoot() {
		if (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT) return null;
		return (CSMRepresentationRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentationRoot(CSMRepresentationRoot newRepresentationRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepresentationRoot, DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationRoot(CSMRepresentationRoot newRepresentationRoot) {
		if (newRepresentationRoot != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT && newRepresentationRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRepresentationRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepresentationRoot != null)
				msgs = ((InternalEObject)newRepresentationRoot).eInverseAdd(this, DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE, CSMRepresentationRoot.class, msgs);
			msgs = basicSetRepresentationRoot(newRepresentationRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT, newRepresentationRoot, newRepresentationRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMClass getOwnerCSMClass() {
		if (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS) return null;
		return (CSMClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerCSMClass(CSMClass newOwnerCSMClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerCSMClass, DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerCSMClass(CSMClass newOwnerCSMClass) {
		if (newOwnerCSMClass != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS && newOwnerCSMClass != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerCSMClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerCSMClass != null)
				msgs = ((InternalEObject)newOwnerCSMClass).eInverseAdd(this, DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS, CSMClass.class, msgs);
			msgs = basicSetOwnerCSMClass(newOwnerCSMClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS, newOwnerCSMClass, newOwnerCSMClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void scrap() {
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((CSMRepresentation)otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepresentationRoot((CSMRepresentationRoot)otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerCSMClass((CSMClass)otherEnd, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				return basicSetParent(null, msgs);
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				return basicSetRepresentationRoot(null, msgs);
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				return basicSetOwnerCSMClass(null, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_REPRESENTATION__CHILDREN, CSMRepresentation.class, msgs);
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_REPRESENTATION_ROOT__REPRESENTATION_TREE, CSMRepresentationRoot.class, msgs);
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSM_CLASS__CLASS_REPRESENTATIONS, CSMClass.class, msgs);
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				return getParent();
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				return getChildren();
			case DatacorePackage.CSM_REPRESENTATION__VALID:
				return isValid() ? Boolean.TRUE : Boolean.FALSE;
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				return getRepresentationRoot();
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				return getOwnerCSMClass();
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				setParent((CSMRepresentation)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends CSMRepresentation>)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION__VALID:
				setValid(((Boolean)newValue).booleanValue());
				return;
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				setRepresentationRoot((CSMRepresentationRoot)newValue);
				return;
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				setOwnerCSMClass((CSMClass)newValue);
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				setParent((CSMRepresentation)null);
				return;
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				getChildren().clear();
				return;
			case DatacorePackage.CSM_REPRESENTATION__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				setRepresentationRoot((CSMRepresentationRoot)null);
				return;
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				setOwnerCSMClass((CSMClass)null);
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
			case DatacorePackage.CSM_REPRESENTATION__PARENT:
				return getParent() != null;
			case DatacorePackage.CSM_REPRESENTATION__CHILDREN:
				return children != null && !children.isEmpty();
			case DatacorePackage.CSM_REPRESENTATION__VALID:
				return valid != VALID_EDEFAULT;
			case DatacorePackage.CSM_REPRESENTATION__REPRESENTATION_ROOT:
				return getRepresentationRoot() != null;
			case DatacorePackage.CSM_REPRESENTATION__OWNER_CSM_CLASS:
				return getOwnerCSMClass() != null;
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

} //CSMRepresentationImpl
