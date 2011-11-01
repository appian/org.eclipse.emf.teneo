/**
 * <copyright>
 * </copyright>
 *
 * $Id: FaultImpl.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.teneo.samples.emf.sample.workflow.Fault;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowNode;
import org.eclipse.emf.teneo.samples.emf.sample.workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FaultImpl extends OutputPortImpl implements Fault {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2003 IBM Corporation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return WorkflowPackage.eINSTANCE.getFault();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.FAULT__NODE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, WorkflowPackage.FAULT__NODE, msgs);
				case WorkflowPackage.FAULT__EDGES:
					return ((InternalEList)getEdges()).basicAdd(otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case WorkflowPackage.FAULT__NODE:
					return eBasicSetContainer(null, WorkflowPackage.FAULT__NODE, msgs);
				case WorkflowPackage.FAULT__EDGES:
					return ((InternalEList)getEdges()).basicRemove(otherEnd, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs) {
		if (eContainerFeatureID >= 0) {
			switch (eContainerFeatureID) {
				case WorkflowPackage.FAULT__NODE:
					return eContainer.eInverseRemove(this, WorkflowPackage.WORKFLOW_NODE__OUTPUTS, WorkflowNode.class, msgs);
				default:
					return eDynamicBasicRemoveFromContainer(msgs);
			}
		}
		return eContainer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.FAULT__NAME:
				return getName();
			case WorkflowPackage.FAULT__COMMENT:
				return getComment();
			case WorkflowPackage.FAULT__X:
				return new Integer(getX());
			case WorkflowPackage.FAULT__Y:
				return new Integer(getY());
			case WorkflowPackage.FAULT__WIDTH:
				return new Integer(getWidth());
			case WorkflowPackage.FAULT__HEIGHT:
				return new Integer(getHeight());
			case WorkflowPackage.FAULT__ID:
				return getId();
			case WorkflowPackage.FAULT__NODE:
				return getNode();
			case WorkflowPackage.FAULT__EDGES:
				return getEdges();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.FAULT__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.FAULT__COMMENT:
				setComment((String)newValue);
				return;
			case WorkflowPackage.FAULT__X:
				setX(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.FAULT__Y:
				setY(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.FAULT__WIDTH:
				setWidth(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.FAULT__HEIGHT:
				setHeight(((Integer)newValue).intValue());
				return;
			case WorkflowPackage.FAULT__ID:
				setId((String)newValue);
				return;
			case WorkflowPackage.FAULT__NODE:
				setNode((WorkflowNode)newValue);
				return;
			case WorkflowPackage.FAULT__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.FAULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__X:
				setX(X_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__Y:
				setY(Y_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.FAULT__NODE:
				setNode((WorkflowNode)null);
				return;
			case WorkflowPackage.FAULT__EDGES:
				getEdges().clear();
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case WorkflowPackage.FAULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.FAULT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case WorkflowPackage.FAULT__X:
				return x != X_EDEFAULT;
			case WorkflowPackage.FAULT__Y:
				return y != Y_EDEFAULT;
			case WorkflowPackage.FAULT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case WorkflowPackage.FAULT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case WorkflowPackage.FAULT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case WorkflowPackage.FAULT__NODE:
				return getNode() != null;
			case WorkflowPackage.FAULT__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return eDynamicIsSet(eFeature);
	}

} //FaultImpl
