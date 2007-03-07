/**
 * <copyright>
 * </copyright>
 *
 * $Id: CSMElementImpl.java,v 1.1 2007/03/07 23:34:08 mtaal Exp $
 */
package datacore.impl;

import datacore.CSMElement;
import datacore.CSMXML;
import datacore.DatacorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSM Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datacore.impl.CSMElementImpl#getReferencedElements <em>Referenced Elements</em>}</li>
 *   <li>{@link datacore.impl.CSMElementImpl#getCsmXML <em>Csm XML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CSMElementImpl extends EObjectImpl implements CSMElement {
	/**
	 * The cached value of the '{@link #getReferencedElements() <em>Referenced Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CSMElement> referencedElements = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatacorePackage.Literals.CSM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSMElement> getReferencedElements() {
		if (referencedElements == null) {
			referencedElements = new EObjectResolvingEList<CSMElement>(CSMElement.class, this, DatacorePackage.CSM_ELEMENT__REFERENCED_ELEMENTS);
		}
		return referencedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMXML getCsmXML() {
		if (eContainerFeatureID != DatacorePackage.CSM_ELEMENT__CSM_XML) return null;
		return (CSMXML)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCsmXML(CSMXML newCsmXML, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCsmXML, DatacorePackage.CSM_ELEMENT__CSM_XML, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsmXML(CSMXML newCsmXML) {
		if (newCsmXML != eInternalContainer() || (eContainerFeatureID != DatacorePackage.CSM_ELEMENT__CSM_XML && newCsmXML != null)) {
			if (EcoreUtil.isAncestor(this, newCsmXML))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCsmXML != null)
				msgs = ((InternalEObject)newCsmXML).eInverseAdd(this, DatacorePackage.CSMXML__ELEMENTS, CSMXML.class, msgs);
			msgs = basicSetCsmXML(newCsmXML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatacorePackage.CSM_ELEMENT__CSM_XML, newCsmXML, newCsmXML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCsmXML((CSMXML)otherEnd, msgs);
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
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				return basicSetCsmXML(null, msgs);
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
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				return eInternalContainer().eInverseRemove(this, DatacorePackage.CSMXML__ELEMENTS, CSMXML.class, msgs);
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
			case DatacorePackage.CSM_ELEMENT__REFERENCED_ELEMENTS:
				return getReferencedElements();
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				return getCsmXML();
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
			case DatacorePackage.CSM_ELEMENT__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				getReferencedElements().addAll((Collection<? extends CSMElement>)newValue);
				return;
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				setCsmXML((CSMXML)newValue);
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
			case DatacorePackage.CSM_ELEMENT__REFERENCED_ELEMENTS:
				getReferencedElements().clear();
				return;
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				setCsmXML((CSMXML)null);
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
			case DatacorePackage.CSM_ELEMENT__REFERENCED_ELEMENTS:
				return referencedElements != null && !referencedElements.isEmpty();
			case DatacorePackage.CSM_ELEMENT__CSM_XML:
				return getCsmXML() != null;
		}
		return super.eIsSet(featureID);
	}

} //CSMElementImpl
